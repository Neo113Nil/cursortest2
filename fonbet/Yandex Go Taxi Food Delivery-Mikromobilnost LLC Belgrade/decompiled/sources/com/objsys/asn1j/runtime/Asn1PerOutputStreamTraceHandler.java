package com.objsys.asn1j.runtime;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1PerOutputStreamTraceHandler extends Asn1PerTraceHandler {
    private ByteArrayOutputStream mCaptureBuffer;
    private Asn1PerOutputStream mMessageStream;

    public Asn1PerOutputStreamTraceHandler(Asn1PerOutputStream asn1PerOutputStream) {
        super(asn1PerOutputStream.mBuffer);
        this.mMessageStream = asn1PerOutputStream;
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerTraceHandler
    public void enable() {
        this.mBitFieldList = new Asn1PerBitFieldList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
        this.mCaptureBuffer = byteArrayOutputStream;
        this.mMessageStream.addCaptureBuffer(byteArrayOutputStream);
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerTraceHandler
    public void print(PrintStream printStream, String str) {
        if (this.mBitFieldList != null) {
            try {
                new Asn1PerBitFieldPrinter(this.mMessageStream.mBuffer, new ByteArrayInputStream(this.mCaptureBuffer.toByteArray())).print(printStream, str);
            } catch (Exception unused) {
                printStream.getClass();
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerTraceHandler
    public void reset() {
    }

    public void resetTrace() {
        Asn1PerBitFieldList asn1PerBitFieldList = this.mBitFieldList;
        if (asn1PerBitFieldList != null) {
            asn1PerBitFieldList.reset();
            this.mCaptureBuffer.reset();
        }
    }
}
