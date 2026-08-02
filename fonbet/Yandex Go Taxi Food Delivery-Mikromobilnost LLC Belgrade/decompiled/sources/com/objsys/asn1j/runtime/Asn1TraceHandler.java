package com.objsys.asn1j.runtime;

import java.io.PrintStream;

/* loaded from: classes11.dex */
public class Asn1TraceHandler implements Asn1NamedEventHandler {
    PrintStream mPrintStream;

    public Asn1TraceHandler() {
        this.mPrintStream = System.out;
    }

    @Override // com.objsys.asn1j.runtime.Asn1NamedEventHandler
    public void characters(String str, short s) {
        PrintStream printStream = this.mPrintStream;
        new StringBuffer("data: ").append(str);
        printStream.getClass();
    }

    @Override // com.objsys.asn1j.runtime.Asn1NamedEventHandler
    public void endElement(String str, int i) {
        this.mPrintStream.getClass();
        if (i >= 0) {
            PrintStream printStream = this.mPrintStream;
            StringBuffer stringBuffer = new StringBuffer("[");
            stringBuffer.append(i);
            stringBuffer.append("]");
            printStream.getClass();
        }
        this.mPrintStream.getClass();
    }

    @Override // com.objsys.asn1j.runtime.Asn1NamedEventHandler
    public void startElement(String str, int i) {
        this.mPrintStream.getClass();
        if (i >= 0) {
            PrintStream printStream = this.mPrintStream;
            StringBuffer stringBuffer = new StringBuffer("[");
            stringBuffer.append(i);
            stringBuffer.append("]");
            printStream.getClass();
        }
        this.mPrintStream.getClass();
    }

    public Asn1TraceHandler(PrintStream printStream) {
        this.mPrintStream = printStream;
    }
}
