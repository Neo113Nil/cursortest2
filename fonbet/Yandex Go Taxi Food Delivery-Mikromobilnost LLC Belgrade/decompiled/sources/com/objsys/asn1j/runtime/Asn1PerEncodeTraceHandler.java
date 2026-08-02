package com.objsys.asn1j.runtime;

import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1PerEncodeTraceHandler extends Asn1PerTraceHandler {
    private Asn1PerEncodeBuffer mMessageBuffer;

    public Asn1PerEncodeTraceHandler(Asn1PerEncodeBuffer asn1PerEncodeBuffer) {
        super(asn1PerEncodeBuffer);
        this.mMessageBuffer = asn1PerEncodeBuffer;
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerTraceHandler
    public void enable() {
        this.mBitFieldList = new Asn1PerBitFieldList();
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerTraceHandler
    public void print(PrintStream printStream, String str) {
        if (this.mBitFieldList != null) {
            try {
                Asn1PerEncodeBuffer asn1PerEncodeBuffer = this.mMessageBuffer;
                new Asn1PerBitFieldPrinter(asn1PerEncodeBuffer, asn1PerEncodeBuffer.getInputStream()).print(printStream, str);
            } catch (Exception unused) {
                printStream.getClass();
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1PerTraceHandler
    public void reset() {
        Asn1PerBitFieldList asn1PerBitFieldList = this.mBitFieldList;
        if (asn1PerBitFieldList != null) {
            asn1PerBitFieldList.reset();
        }
    }
}
