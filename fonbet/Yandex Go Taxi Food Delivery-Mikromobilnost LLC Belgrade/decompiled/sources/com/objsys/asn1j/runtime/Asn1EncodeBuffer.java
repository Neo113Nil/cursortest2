package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public abstract class Asn1EncodeBuffer extends Asn1MessageBuffer {
    public static final int SIZE_INCREMENT = 1024;
    protected int mByteIndex;
    protected byte[] mData;
    protected int mSizeIncrement;

    public Asn1EncodeBuffer(int i) {
        initBuffer(i == 0 ? 1024 : i);
    }

    public abstract void binDump(PrintStream printStream, String str);

    public void binDump(String str) {
        binDump(System.out, str);
    }

    public void checkSize(int i) {
        int i2 = this.mByteIndex;
        int i3 = i2 + i;
        byte[] bArr = this.mData;
        if (i3 > bArr.length) {
            int i4 = this.mSizeIncrement;
            byte[] bArr2 = new byte[bArr.length + ((((i - 1) / i4) + 1) * i4)];
            System.arraycopy(bArr, 0, bArr2, 0, i2 + 1);
            this.mData = bArr2;
        }
    }

    public abstract void copy(byte b);

    public abstract void copy(byte[] bArr) throws Asn1Exception;

    public abstract byte[] getMsgCopy();

    public abstract int getMsgLength();

    public void hexDump() {
        Asn1MessageBuffer.hexDump(getInputStream());
    }

    public void initBuffer(int i) {
        this.mSizeIncrement = i;
        this.mData = new byte[i];
        this.mByteIndex = 0;
    }

    public abstract void reset();

    public abstract void write(OutputStream outputStream) throws IOException;

    public void hexDump(PrintStream printStream) {
        Asn1MessageBuffer.hexDump(getInputStream(), printStream);
    }

    public Asn1EncodeBuffer() {
        initBuffer(1024);
    }
}
