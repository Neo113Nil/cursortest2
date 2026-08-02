package com.objsys.asn1j.runtime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public class Asn1BerDecodeBuffer extends Asn1DecodeBuffer {
    private static Asn1RunTime rt = Asn1RunTime.instance();
    private Asn1Tag mLastParsedTag;
    private IntHolder mLenHolder;
    private ByteArrayOutputStream mOpenTypeCaptureBuffer;
    private ByteArrayOutputStream mParserCaptureBuffer;
    private Asn1Tag mTagHolder;

    public Asn1BerDecodeBuffer(byte[] bArr) {
        super(bArr);
        this.mTagHolder = new Asn1Tag();
        this.mLenHolder = new IntHolder();
        this.mOpenTypeCaptureBuffer = null;
        this.mParserCaptureBuffer = null;
    }

    public static int calcIndefLen(byte[] bArr, int i, int i2) throws Asn1Exception, IOException {
        Asn1BerDecodeBuffer asn1BerDecodeBuffer;
        int i3 = 0;
        if (i == 0 && i2 == bArr.length) {
            asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(bArr);
        } else {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(bArr2);
        }
        Asn1Tag asn1Tag = new Asn1Tag();
        int decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(asn1Tag);
        if (decodeTagAndLength != -9999) {
            return decodeTagAndLength;
        }
        int i4 = 1;
        while (i4 > 0) {
            int byteCount = asn1BerDecodeBuffer.getByteCount();
            int decodeTagAndLength2 = asn1BerDecodeBuffer.decodeTagAndLength(asn1Tag);
            i3 += asn1BerDecodeBuffer.getByteCount() - byteCount;
            if (decodeTagAndLength2 > 0) {
                asn1BerDecodeBuffer.skip(decodeTagAndLength2);
                i3 += decodeTagAndLength2;
            } else if (decodeTagAndLength2 == -9999) {
                i4++;
            } else if (asn1Tag.isEOC() && decodeTagAndLength2 == 0) {
                i4--;
            }
        }
        return i3;
    }

    private void decodeOpenTypeElement(Asn1Tag asn1Tag, IntHolder intHolder, boolean z) throws Asn1Exception, IOException {
        int decodeTagAndLength = decodeTagAndLength(asn1Tag);
        int i = this.mByteCount;
        if (decodeTagAndLength > 0) {
            if (z) {
                capture(decodeTagAndLength);
            } else {
                skip(decodeTagAndLength);
            }
        } else if (decodeTagAndLength == -9999) {
            movePastEOC(z);
        }
        rt.lcheck(1);
        intHolder.value = this.mByteCount - i;
    }

    private void parseCons(Asn1TaggedEventHandler asn1TaggedEventHandler, Asn1Tag asn1Tag, int i) throws Asn1Exception, IOException {
        Asn1Tag asn1Tag2 = new Asn1Tag();
        IntHolder intHolder = new IntHolder();
        int i2 = this.mByteCount;
        while (true) {
            parseElement(asn1TaggedEventHandler, asn1Tag2, intHolder);
            if (i == -9999) {
                if (asn1Tag2.isEOC() && intHolder.value == 0) {
                    return;
                }
            } else if (this.mByteCount - i2 >= i) {
                return;
            }
        }
    }

    private void parseElement(Asn1TaggedEventHandler asn1TaggedEventHandler, Asn1Tag asn1Tag, IntHolder intHolder) throws Asn1Exception, IOException {
        this.mParserCaptureBuffer.reset();
        intHolder.value = decodeTagAndLength(asn1Tag);
        if (asn1Tag.isEOC() && intHolder.value == 0) {
            return;
        }
        asn1TaggedEventHandler.startElement(asn1Tag, intHolder.value, this.mParserCaptureBuffer.toByteArray());
        this.mParserCaptureBuffer.reset();
        int i = intHolder.value;
        if (i > 0 || i == -9999) {
            boolean isConstructed = asn1Tag.isConstructed();
            int i2 = intHolder.value;
            if (isConstructed) {
                parseCons(asn1TaggedEventHandler, asn1Tag, i2);
            } else {
                parsePrim(asn1TaggedEventHandler, asn1Tag, i2);
            }
        }
        asn1TaggedEventHandler.endElement(asn1Tag);
    }

    private void parsePrim(Asn1TaggedEventHandler asn1TaggedEventHandler, Asn1Tag asn1Tag, int i) throws Asn1Exception, IOException {
        byte[] bArr = new byte[i];
        read(bArr);
        asn1TaggedEventHandler.contents(bArr);
    }

    public int decodeLength() throws Asn1Exception, IOException {
        int read = read();
        if (read < 0) {
            throw new Asn1EndOfBufferException(this);
        }
        if (read <= 128) {
            return read == 128 ? Asn1Status.INDEFLEN : read;
        }
        int i = read & HProv.PP_VERSION_TIMESTAMP;
        if (i > 4) {
            throw new Asn1InvalidLengthException();
        }
        int i2 = 0;
        while (i > 0) {
            int read2 = read();
            if (read2 < 0) {
                throw new Asn1EndOfBufferException(this);
            }
            i2 = (i2 * 256) + read2;
            i--;
        }
        return i2;
    }

    public byte[] decodeOpenType(boolean z) throws Asn1Exception, IOException {
        if (z) {
            ByteArrayOutputStream byteArrayOutputStream = this.mOpenTypeCaptureBuffer;
            if (byteArrayOutputStream == null) {
                this.mOpenTypeCaptureBuffer = new ByteArrayOutputStream(256);
            } else {
                byteArrayOutputStream.reset();
            }
            addCaptureBuffer(this.mOpenTypeCaptureBuffer);
        }
        decodeOpenTypeElement(this.mTagHolder, this.mLenHolder, z);
        if (!z) {
            return null;
        }
        byte[] byteArray = this.mOpenTypeCaptureBuffer.toByteArray();
        removeCaptureBuffer(this.mOpenTypeCaptureBuffer);
        return byteArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        defpackage.quz.s("Invalid tag value: too big");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void decodeTag(Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        int read = read();
        if (read < 0) {
            throw new Asn1EndOfBufferException(this);
        }
        asn1Tag.mClass = (short) (read & 192);
        asn1Tag.mForm = (short) (read & 32);
        int i = read & 31;
        asn1Tag.mIDCode = i;
        if (i == 31) {
            long j = 0;
            int i2 = 0;
            while (true) {
                int read2 = read();
                if (read2 < 0) {
                    throw new Asn1EndOfBufferException(this);
                }
                j = (j * 128) + (read2 & HProv.PP_VERSION_TIMESTAMP);
                if (j > 2147483647L) {
                    break;
                }
                int i3 = i2 + 1;
                if (i2 > 8) {
                    break;
                }
                if ((read2 & 128) == 0) {
                    asn1Tag.mIDCode = (int) j;
                    break;
                }
                i2 = i3;
            }
        }
        this.mLastParsedTag = asn1Tag;
        rt.lcheck(1);
    }

    public int decodeTagAndLength(Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        decodeTag(asn1Tag);
        return decodeLength();
    }

    public Asn1Tag getLastTag() {
        return this.mLastParsedTag;
    }

    public boolean matchTag(short s, short s2, int i, Asn1Tag asn1Tag, IntHolder intHolder) throws Asn1Exception, IOException {
        mark(8);
        if (asn1Tag == null) {
            asn1Tag = this.mTagHolder;
        }
        if (intHolder == null) {
            intHolder = this.mLenHolder;
        }
        intHolder.value = decodeTagAndLength(asn1Tag);
        if (asn1Tag.equals(s, s2, i)) {
            return true;
        }
        reset();
        return false;
    }

    public final void movePastEOC(boolean z) throws Asn1Exception, IOException {
        Asn1Tag asn1Tag = new Asn1Tag();
        int i = 1;
        while (i > 0) {
            int decodeTagAndLength = decodeTagAndLength(asn1Tag);
            if (decodeTagAndLength > 0) {
                if (z) {
                    capture(decodeTagAndLength);
                } else {
                    skip(decodeTagAndLength);
                }
            } else if (decodeTagAndLength == -9999) {
                i++;
            } else if (asn1Tag.isEOC() && decodeTagAndLength == 0) {
                i--;
            }
        }
    }

    public void parse(Asn1TaggedEventHandler asn1TaggedEventHandler) throws Asn1Exception, IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.mParserCaptureBuffer;
        if (byteArrayOutputStream == null) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(256);
            this.mParserCaptureBuffer = byteArrayOutputStream2;
            addCaptureBuffer(byteArrayOutputStream2);
        } else {
            byteArrayOutputStream.reset();
        }
        parseElement(asn1TaggedEventHandler, this.mTagHolder, this.mLenHolder);
    }

    public void peekTag(Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        mark(8);
        decodeTag(asn1Tag);
        reset();
    }

    @Override // com.objsys.asn1j.runtime.Asn1DecodeBuffer
    public int readByte() throws Asn1Exception, IOException {
        return read();
    }

    public Asn1Tag peekTag() throws Asn1Exception, IOException {
        Asn1Tag asn1Tag = new Asn1Tag();
        peekTag(asn1Tag);
        return asn1Tag;
    }

    public Asn1BerDecodeBuffer(InputStream inputStream) {
        super(inputStream);
        this.mTagHolder = new Asn1Tag();
        this.mLenHolder = new IntHolder();
        this.mOpenTypeCaptureBuffer = null;
        this.mParserCaptureBuffer = null;
    }

    public boolean matchTag(Asn1Tag asn1Tag, Asn1Tag asn1Tag2, IntHolder intHolder) throws Asn1Exception, IOException {
        return matchTag(asn1Tag.mClass, asn1Tag.mForm, asn1Tag.mIDCode, asn1Tag2, intHolder);
    }

    public boolean matchTag(Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        return matchTag(asn1Tag.mClass, asn1Tag.mForm, asn1Tag.mIDCode, null, null);
    }

    public byte[] decodeOpenType() throws Asn1Exception, IOException {
        return decodeOpenType(true);
    }
}
