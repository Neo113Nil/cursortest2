package com.objsys.asn1j.runtime;

import defpackage.ny61;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class Asn1PerOutputStream extends Asn1OutputStream {
    Asn1PerEncodeBuffer mBuffer;
    private int mBufferSize;
    private ArrayList mCaptureBufferList;
    protected Asn1PerOutputStreamTraceHandler mTraceHandler;

    public Asn1PerOutputStream(OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        this.mBufferSize = 512;
        this.mCaptureBufferList = new ArrayList(5);
        this.mBuffer = new Asn1PerEncodeBuffer(z);
        Asn1PerOutputStreamTraceHandler asn1PerOutputStreamTraceHandler = new Asn1PerOutputStreamTraceHandler(this);
        this.mTraceHandler = asn1PerOutputStreamTraceHandler;
        this.mBuffer.mTraceHandler = asn1PerOutputStreamTraceHandler;
        this.mBufferSize = i;
    }

    public void addCaptureBuffer(ByteArrayOutputStream byteArrayOutputStream) {
        this.mCaptureBufferList.add(byteArrayOutputStream);
    }

    public void binDump(String str) {
        binDump(System.out, str);
    }

    public void byteAlign() {
        this.mBuffer.byteAlign();
    }

    @Override // com.objsys.asn1j.runtime.Asn1OutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int msgByteCnt = this.mBuffer.getMsgByteCnt();
        if (msgByteCnt > 0) {
            write(this.mBuffer.getBuffer(), 0, msgByteCnt);
        }
        super.close();
    }

    public void encodeBit(boolean z) throws IOException, Asn1Exception {
        this.mBuffer.encodeBit(z, "");
        writeBuffer(false);
    }

    public void encodeBits(byte[] bArr, int i, int i2) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeBits(bArr, i, i2, "value");
        writeBuffer(false);
    }

    public void encodeCharString(String str, int i, int i2, int i3, int i4, Asn1CharSet asn1CharSet) throws IOException, Asn1Exception {
        this.mBuffer.encodeCharString(str, i, i2, i3, i4, asn1CharSet);
        writeBuffer(false);
    }

    public void encodeConsWholeNumber(long j, long j2) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeConsWholeNumber(j, j2, "value");
        writeBuffer(false);
    }

    public void encodeInt(long j, boolean z, boolean z2) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeInt(j, z, z2, "value");
        writeBuffer(false);
    }

    public void encodeLength(long j, long j2, long j3) throws IOException, Asn1Exception {
        this.mBuffer.encodeLength(j, j2, j3);
        writeBuffer(false);
    }

    public void encodeLengthEOM(long j) throws IOException, Asn1Exception {
        this.mBuffer.encodeLengthEOM(j);
        writeBuffer(false);
    }

    public void encodeOIDLengthAndValue(int[] iArr) throws IOException, Asn1Exception {
        this.mBuffer.encodeOIDLengthAndValue(iArr);
        writeBuffer(false);
    }

    public void encodeOctetString(byte[] bArr, int i, int i2) throws IOException, Asn1Exception {
        this.mBuffer.encodeOctetString(bArr, i, i2);
        writeBuffer(false);
    }

    public void encodeOpenType(byte[] bArr, int i, int i2) throws IOException, Asn1Exception {
        this.mBuffer.encodeOpenType(bArr, i, i2);
        writeBuffer(false);
    }

    public void encodeRelOIDLengthAndValue(int[] iArr) throws IOException, Asn1Exception {
        this.mBuffer.encodeRelOIDLengthAndValue(iArr);
        writeBuffer(false);
    }

    public void encodeSmallNonNegWholeNumber(int i) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeSmallNonNegWholeNumber(i);
        writeBuffer(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            writeBuffer(true);
            super.flush();
        } catch (Asn1Exception e) {
            ny61.v(e.getMessage());
        }
    }

    public Asn1PerTraceHandler getTraceHandler() {
        return this.mTraceHandler;
    }

    public boolean isAligned() {
        return this.mBuffer.isAligned();
    }

    public void removeCaptureBuffer(ByteArrayOutputStream byteArrayOutputStream) {
        for (int i = 0; i < this.mCaptureBufferList.size(); i++) {
            if (byteArrayOutputStream == ((ByteArrayOutputStream) this.mCaptureBufferList.get(i))) {
                this.mCaptureBufferList.remove(i);
                return;
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1OutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.os.write(bArr);
        for (int i = 0; i < this.mCaptureBufferList.size(); i++) {
            ((ByteArrayOutputStream) this.mCaptureBufferList.get(i)).write(bArr);
        }
    }

    public final void writeBuffer(boolean z) throws IOException, Asn1InvalidArgException {
        if (this.mBuffer.getMsgByteCnt() >= this.mBufferSize) {
            int msgBitCnt = this.mBuffer.getMsgBitCnt();
            int i = msgBitCnt / 8;
            int i2 = msgBitCnt % 8;
            Asn1PerEncodeBuffer asn1PerEncodeBuffer = this.mBuffer;
            if (i2 == 0) {
                write(asn1PerEncodeBuffer.getBuffer(), 0, i);
                this.mBuffer.reset();
                return;
            }
            byte[] buffer = asn1PerEncodeBuffer.getBuffer();
            write(buffer, 0, i);
            byte b = buffer[i];
            this.mBuffer.reset();
            this.mBuffer.encodeBits(b, i2);
        }
    }

    public void binDump(PrintStream printStream, String str) {
        this.mTraceHandler.print(printStream, str);
    }

    public void encodeBit(boolean z, String str) throws IOException, Asn1Exception {
        this.mBuffer.encodeBit(z, str);
        writeBuffer(false);
    }

    public void encodeBits(byte b, int i) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeBits(b, i);
        writeBuffer(false);
    }

    public long encodeLength(long j) throws IOException, Asn1InvalidArgException {
        long encodeLength = this.mBuffer.encodeLength(j);
        writeBuffer(false);
        return encodeLength;
    }

    public void encodeBits(byte[] bArr, int i, int i2, String str) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeBits(bArr, i, i2, str);
        writeBuffer(false);
    }

    public void encodeConsWholeNumber(long j, long j2, String str) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeConsWholeNumber(j, j2, str);
        writeBuffer(false);
    }

    public void encodeInt(long j, int i) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeInt(j, i, "value");
        writeBuffer(false);
    }

    public void encodeInt(long j, boolean z, boolean z2, String str) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeInt(j, z, z2, str);
        writeBuffer(false);
    }

    public void encodeInt(long j, int i, String str) throws IOException, Asn1InvalidArgException {
        this.mBuffer.encodeInt(j, i, str);
        writeBuffer(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1OutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.os.write(bArr, i, i2);
        for (int i3 = 0; i3 < this.mCaptureBufferList.size(); i3++) {
            ((ByteArrayOutputStream) this.mCaptureBufferList.get(i3)).write(bArr, i, i2);
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1OutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        this.os.write(i);
        for (int i2 = 0; i2 < this.mCaptureBufferList.size(); i2++) {
            ((ByteArrayOutputStream) this.mCaptureBufferList.get(i2)).write(i);
        }
    }

    public Asn1PerOutputStream(OutputStream outputStream, boolean z) {
        super(outputStream);
        this.mBufferSize = 512;
        this.mCaptureBufferList = new ArrayList(5);
        this.mBuffer = new Asn1PerEncodeBuffer(z);
        Asn1PerOutputStreamTraceHandler asn1PerOutputStreamTraceHandler = new Asn1PerOutputStreamTraceHandler(this);
        this.mTraceHandler = asn1PerOutputStreamTraceHandler;
        this.mBuffer.mTraceHandler = asn1PerOutputStreamTraceHandler;
    }
}
