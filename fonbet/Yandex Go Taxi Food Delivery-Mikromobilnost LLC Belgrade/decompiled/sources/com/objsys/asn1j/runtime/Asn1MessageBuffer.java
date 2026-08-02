package com.objsys.asn1j.runtime;

import java.io.InputStream;
import java.io.PrintStream;

/* loaded from: classes11.dex */
public abstract class Asn1MessageBuffer {
    public static void hexDump(InputStream inputStream, PrintStream printStream) {
        boolean enabled = Diag.instance().setEnabled(true);
        Diag.instance();
        Diag.hexDump(inputStream, printStream);
        Diag.instance().setEnabled(enabled);
    }

    public abstract InputStream getInputStream();

    public void setKey(byte[] bArr) {
        Asn1RunTime.instance().setKey(bArr);
    }

    public static void hexDump(InputStream inputStream) {
        hexDump(inputStream, System.out);
    }
}
