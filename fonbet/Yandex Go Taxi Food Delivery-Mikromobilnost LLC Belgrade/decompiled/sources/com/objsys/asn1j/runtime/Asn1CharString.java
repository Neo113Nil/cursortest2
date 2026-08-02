package com.objsys.asn1j.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes11.dex */
public abstract class Asn1CharString extends Asn1Type {
    private static final long serialVersionUID = -3999513667217895517L;
    protected transient StringBuffer mStringBuffer;
    private transient short mTypeCode;
    public transient String value;

    public Asn1CharString(short s) {
        this.value = new String();
        this.mTypeCode = s;
    }

    private static void byteAlign(Asn1PerMessageBuffer asn1PerMessageBuffer, int i, long j, long j2) {
        if (asn1PerMessageBuffer.isAligned()) {
            long j3 = i * j2;
            if (j2 == j) {
                if (j3 <= 16) {
                    return;
                }
            } else if (j3 < 16) {
                return;
            }
            asn1PerMessageBuffer.byteAlign();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.value = objectInputStream.readUTF();
        this.mTypeCode = objectInputStream.readShort();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeUTF(this.value);
        objectOutputStream.writeShort(this.mTypeCode);
    }

    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i, Asn1Tag asn1Tag) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, asn1Tag);
        }
        if (this.mStringBuffer == null) {
            this.mStringBuffer = new StringBuffer();
        }
        Asn1Tag lastTag = asn1BerDecodeBuffer.getLastTag();
        int i2 = 0;
        if (lastTag != null && lastTag.isConstructed()) {
            Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
            while (!asn1BerDecodeContext.expired()) {
                int matchTag = matchTag(asn1BerDecodeBuffer, Asn1OctetString.TAG);
                if (matchTag <= 0) {
                    throw new Asn1Exception(asn1BerDecodeBuffer, "Invalid format of constructed value");
                }
                i2 += matchTag;
                this.mStringBuffer.ensureCapacity(i2);
                while (matchTag > 0) {
                    int read = asn1BerDecodeBuffer.read();
                    if (read == -1) {
                        throw new Asn1EndOfBufferException(asn1BerDecodeBuffer);
                    }
                    this.mStringBuffer.append((char) read);
                    matchTag--;
                }
            }
            if (i == -9999) {
                matchTag(asn1BerDecodeBuffer, Asn1Tag.EOC);
            }
        } else {
            if (i < 0) {
                throw new Asn1InvalidLengthException();
            }
            this.mStringBuffer.setLength(i);
            while (i > 0) {
                int read2 = asn1BerDecodeBuffer.read();
                if (read2 == -1) {
                    throw new Asn1EndOfBufferException(asn1BerDecodeBuffer);
                }
                this.mStringBuffer.setCharAt(i2, (char) read2);
                i--;
                i2++;
            }
        }
        this.value = this.mStringBuffer.toString();
        asn1BerDecodeBuffer.setTypeCode((short) asn1Tag.mIDCode);
    }

    public void decodeXER(String str, String str2) throws Asn1Exception {
        this.value = str;
    }

    public void decodeXML(String str, String str2) throws Asn1Exception {
        decodeXER(str, str2);
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, int i, int i2, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        int length = this.value.length();
        long j3 = length;
        if (j3 < j || j3 > j2) {
            throw new Asn1ConsVioException("Asn1CharString.length", j3);
        }
        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            encode(asn1PerEncodeBuffer, i, i2, asn1CharSet);
            return;
        }
        asn1PerEncodeBuffer.encodeLength(j3, j, j2);
        if (length > 0) {
            byteAlign(asn1PerEncodeBuffer, asn1CharSet == null ? asn1PerEncodeBuffer.isAligned() ? i : i2 : asn1CharSet.getNumBitsPerChar(asn1PerEncodeBuffer.isAligned()), j, j2);
            asn1PerEncodeBuffer.encodeCharString(this.value, length, 0, i, i2, asn1CharSet);
        }
    }

    public boolean equals(Object obj) {
        return equals(((Asn1CharString) obj).value);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type
    public int getLength() throws Asn1InvalidLengthException {
        return this.value.length();
    }

    public String toString() {
        return this.value;
    }

    public boolean equals(String str) {
        return this.value.equals(str);
    }

    public Asn1CharString(String str, short s) {
        this.value = str;
        this.mTypeCode = s;
    }

    public void encode(Asn1PerEncodeBuffer asn1PerEncodeBuffer, int i, int i2, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        Asn1PerEncodeBuffer asn1PerEncodeBuffer2;
        int i3;
        int i4;
        Asn1CharSet asn1CharSet2;
        int length = this.value.length();
        int i5 = 0;
        while (true) {
            int encodeLength = (int) asn1PerEncodeBuffer.encodeLength(length);
            if (encodeLength > 0) {
                asn1PerEncodeBuffer.byteAlign();
                asn1PerEncodeBuffer2 = asn1PerEncodeBuffer;
                i3 = i;
                i4 = i2;
                asn1CharSet2 = asn1CharSet;
                asn1PerEncodeBuffer2.encodeCharString(this.value, encodeLength, i5, i3, i4, asn1CharSet2);
            } else {
                asn1PerEncodeBuffer2 = asn1PerEncodeBuffer;
                i3 = i;
                i4 = i2;
                asn1CharSet2 = asn1CharSet;
            }
            length -= encodeLength;
            if (length <= 0) {
                asn1PerEncodeBuffer2.encodeLengthEOM(length);
                return;
            }
            i5 += encodeLength;
            asn1PerEncodeBuffer = asn1PerEncodeBuffer2;
            i = i3;
            i2 = i4;
            asn1CharSet = asn1CharSet2;
        }
    }

    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z, Asn1Tag asn1Tag) throws Asn1Exception {
        int length = this.value.length();
        asn1BerEncodeBuffer.copy(this.value);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(asn1Tag, length) + length : length;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str) throws IOException, Asn1Exception {
        asn1XerEncoder.encodeStartElement(str);
        asn1XerEncoder.encodeData(this.value);
        asn1XerEncoder.encodeEndElement(str);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void encode(Asn1XerEncoder asn1XerEncoder, String str, String str2) throws IOException, Asn1Exception {
        asn1XerEncoder.encodeStartElement(str, str2);
        asn1XerEncoder.encodeData(this.value);
        asn1XerEncoder.encodeEndElement(str);
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, int i, int i2, Asn1CharSet asn1CharSet) throws Asn1Exception, IOException {
        Asn1PerDecodeBuffer asn1PerDecodeBuffer2;
        int i3;
        int i4;
        Asn1CharSet asn1CharSet2;
        StringBuffer stringBuffer = this.mStringBuffer;
        int i5 = 0;
        if (stringBuffer == null) {
            this.mStringBuffer = new StringBuffer();
        } else {
            stringBuffer.setLength(0);
        }
        while (true) {
            int decodeLength = (int) asn1PerDecodeBuffer.decodeLength();
            if (decodeLength > 0) {
                i5 += decodeLength;
                asn1PerDecodeBuffer.byteAlign();
                this.mStringBuffer.ensureCapacity(i5);
                asn1PerDecodeBuffer2 = asn1PerDecodeBuffer;
                i3 = i;
                i4 = i2;
                asn1CharSet2 = asn1CharSet;
                asn1PerDecodeBuffer2.decodeCharString(decodeLength, i3, i4, asn1CharSet2, this.mStringBuffer);
            } else {
                asn1PerDecodeBuffer2 = asn1PerDecodeBuffer;
                i3 = i;
                i4 = i2;
                asn1CharSet2 = asn1CharSet;
            }
            if (decodeLength < 16384) {
                this.value = this.mStringBuffer.toString();
                asn1PerDecodeBuffer2.setTypeCode(this.mTypeCode);
                return;
            } else {
                asn1PerDecodeBuffer = asn1PerDecodeBuffer2;
                i = i3;
                i2 = i4;
                asn1CharSet = asn1CharSet2;
            }
        }
    }

    public void decode(Asn1PerDecodeBuffer asn1PerDecodeBuffer, int i, int i2, Asn1CharSet asn1CharSet, long j, long j2) throws Asn1Exception, IOException {
        int numBitsPerChar;
        if (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            int decodeLength = (int) asn1PerDecodeBuffer.decodeLength(j, j2);
            StringBuffer stringBuffer = this.mStringBuffer;
            if (stringBuffer == null) {
                this.mStringBuffer = new StringBuffer();
            } else {
                stringBuffer.setLength(0);
            }
            if (decodeLength > 0) {
                if (asn1CharSet == null) {
                    numBitsPerChar = asn1PerDecodeBuffer.isAligned() ? i : i2;
                } else {
                    numBitsPerChar = asn1CharSet.getNumBitsPerChar(asn1PerDecodeBuffer.isAligned());
                }
                byteAlign(asn1PerDecodeBuffer, numBitsPerChar, j, j2);
                this.mStringBuffer.ensureCapacity(decodeLength);
                asn1PerDecodeBuffer.decodeCharString(decodeLength, i, i2, asn1CharSet, this.mStringBuffer);
            }
            this.value = this.mStringBuffer.toString();
            asn1PerDecodeBuffer.setTypeCode(this.mTypeCode);
            return;
        }
        decode(asn1PerDecodeBuffer, i, i2, asn1CharSet);
    }
}
