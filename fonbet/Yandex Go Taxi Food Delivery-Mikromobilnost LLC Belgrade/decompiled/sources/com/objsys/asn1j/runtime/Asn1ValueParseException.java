package com.objsys.asn1j.runtime;

import defpackage.n;

/* loaded from: classes11.dex */
public class Asn1ValueParseException extends Asn1Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1ValueParseException(String str, int i) {
        super(r0.toString());
        StringBuffer stringBuffer = new StringBuffer("Value parse failed.\nString: ");
        stringBuffer.append(str);
        stringBuffer.append(", Offset: ");
        stringBuffer.append(i);
    }

    public Asn1ValueParseException(String str) {
        super(n.j("Value parse failed.\nString: ", str));
    }
}
