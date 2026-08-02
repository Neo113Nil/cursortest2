package com.objsys.asn1j.runtime;

import defpackage.quz;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class Asn1DecodeBuffer extends Asn1MessageBuffer {
    protected int mByteCount;
    private InputStream mInputStream;
    private int mSavedByteCount;
    private short mTypeCode;
    private int[] oidBuffer;
    private ArrayList mNamedEventHandlerList = new ArrayList();
    private ArrayList mCaptureBufferList = new ArrayList(5);

    public Asn1DecodeBuffer(InputStream inputStream) {
        if (inputStream.markSupported()) {
            this.mInputStream = inputStream;
        } else {
            this.mInputStream = new BufferedInputStream(inputStream);
        }
        init();
    }

    public void addCaptureBuffer(ByteArrayOutputStream byteArrayOutputStream) {
        this.mCaptureBufferList.add(byteArrayOutputStream);
    }

    public void addNamedEventHandler(Asn1NamedEventHandler asn1NamedEventHandler) {
        this.mNamedEventHandlerList.add(asn1NamedEventHandler);
    }

    public void capture(int i) throws Asn1EndOfBufferException, IOException {
        for (int i2 = 0; i2 < i; i2++) {
            int read = this.mInputStream.read();
            if (read == -1) {
                throw new Asn1EndOfBufferException(this);
            }
            for (int i3 = 0; i3 < this.mCaptureBufferList.size(); i3++) {
                ((ByteArrayOutputStream) this.mCaptureBufferList.get(i3)).write(read);
            }
            this.mByteCount++;
        }
    }

    public long decodeIntValue(int i, boolean z) throws Asn1Exception, IOException {
        return Asn1RunTime.decodeIntValue(this, i, z);
    }

    public int[] decodeOIDContents(int i) throws Asn1Exception, IOException {
        int readByte;
        int[] iArr;
        if (this.oidBuffer == null) {
            this.oidBuffer = new int[128];
        }
        int i2 = 0;
        while (i > 0) {
            if (i2 >= 128) {
                quz.r();
                return null;
            }
            this.oidBuffer[i2] = 0;
            do {
                readByte = readByte();
                iArr = this.oidBuffer;
                iArr[i2] = (iArr[i2] * 128) + (readByte & HProv.PP_VERSION_TIMESTAMP);
                i--;
            } while ((readByte & 128) != 0);
            if (i2 == 0) {
                int i3 = iArr[0];
                int i4 = i3 / 40;
                if (i4 >= 2) {
                    i4 = 2;
                }
                iArr[0] = i4;
                iArr[1] = i4 == 2 ? i3 - 80 : i3 % 40;
                i2 = 2;
            } else {
                i2++;
            }
        }
        if (i != 0) {
            throw new Asn1InvalidLengthException();
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(this.oidBuffer, 0, iArr2, 0, i2);
        return iArr2;
    }

    public int[] decodeRelOIDContents(int i) throws Asn1Exception, IOException {
        int readByte;
        if (this.oidBuffer == null) {
            this.oidBuffer = new int[128];
        }
        int i2 = 0;
        while (i > 0) {
            if (i2 >= 128) {
                quz.r();
                return null;
            }
            this.oidBuffer[i2] = 0;
            do {
                readByte = readByte();
                int[] iArr = this.oidBuffer;
                iArr[i2] = (iArr[i2] * 128) + (readByte & HProv.PP_VERSION_TIMESTAMP);
                i--;
            } while ((readByte & 128) != 0);
            i2++;
        }
        if (i != 0) {
            throw new Asn1InvalidLengthException();
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(this.oidBuffer, 0, iArr2, 0, i2);
        return iArr2;
    }

    public int getByteCount() {
        return this.mByteCount;
    }

    @Override // com.objsys.asn1j.runtime.Asn1MessageBuffer
    public InputStream getInputStream() {
        return this.mInputStream;
    }

    public void hexDump() {
        Asn1MessageBuffer.hexDump(this.mInputStream);
    }

    public void init() {
        this.mByteCount = 0;
        this.mSavedByteCount = 0;
    }

    public void invokeCharacters(String str) {
        Iterator it = this.mNamedEventHandlerList.iterator();
        while (it.hasNext()) {
            ((Asn1NamedEventHandler) it.next()).characters(str, this.mTypeCode);
        }
    }

    public void invokeEndElement(String str, int i) {
        Iterator it = this.mNamedEventHandlerList.iterator();
        while (it.hasNext()) {
            ((Asn1NamedEventHandler) it.next()).endElement(str, i);
        }
    }

    public void invokeStartElement(String str, int i) {
        Iterator it = this.mNamedEventHandlerList.iterator();
        while (it.hasNext()) {
            ((Asn1NamedEventHandler) it.next()).startElement(str, i);
        }
    }

    public void mark(int i) {
        this.mSavedByteCount = this.mByteCount;
        this.mInputStream.mark(i);
    }

    public void read(byte[] bArr, int i, int i2) throws Asn1EndOfBufferException, IOException {
        int i3 = i;
        int i4 = i2;
        while (i4 > 0) {
            int read = this.mInputStream.read(bArr, i3, i4);
            if (read < 0) {
                throw new Asn1EndOfBufferException(this);
            }
            i3 += read;
            i4 -= read;
        }
        for (int i5 = 0; i5 < this.mCaptureBufferList.size(); i5++) {
            ((ByteArrayOutputStream) this.mCaptureBufferList.get(i5)).write(bArr, i, i2);
        }
        this.mByteCount += i2;
    }

    public abstract int readByte() throws Asn1Exception, IOException;

    public void removeCaptureBuffer(ByteArrayOutputStream byteArrayOutputStream) {
        for (int i = 0; i < this.mCaptureBufferList.size(); i++) {
            if (byteArrayOutputStream == ((ByteArrayOutputStream) this.mCaptureBufferList.get(i))) {
                this.mCaptureBufferList.remove(i);
                return;
            }
        }
    }

    public void reset() {
        try {
            this.mInputStream.reset();
            this.mByteCount = this.mSavedByteCount;
        } catch (Exception unused) {
        }
    }

    public void setEventHandlerList(Asn1DecodeBuffer asn1DecodeBuffer) {
        this.mNamedEventHandlerList = asn1DecodeBuffer.mNamedEventHandlerList;
    }

    public void setInputStream(byte[] bArr, int i, int i2) {
        this.mInputStream = new ByteArrayInputStream(bArr, i, i2);
        init();
    }

    public final void setTypeCode(short s) {
        this.mTypeCode = s;
    }

    public long skip(long j) throws IOException {
        return this.mInputStream.skip(j);
    }

    public Asn1DecodeBuffer(byte[] bArr) {
        setInputStream(bArr, 0, bArr.length);
    }

    public int read() throws Asn1EndOfBufferException, IOException {
        int read = this.mInputStream.read();
        if (read != -1) {
            for (int i = 0; i < this.mCaptureBufferList.size(); i++) {
                ((ByteArrayOutputStream) this.mCaptureBufferList.get(i)).write(read);
            }
            this.mByteCount++;
            return read;
        }
        throw new Asn1EndOfBufferException(this);
    }

    public void read(byte[] bArr) throws Asn1EndOfBufferException, IOException {
        read(bArr, 0, bArr.length);
    }
}
