package com.objsys.asn1j.runtime;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class Asn1InvalidArgException extends Asn1Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1InvalidArgException(String str, String str2) {
        super(r0.toString());
        StringBuffer stringBuffer = new StringBuffer("Invalid argument: ");
        stringBuffer.append(str);
        stringBuffer.append(Extension.O_BRAKE);
        stringBuffer.append(str2);
        stringBuffer.append(").");
    }
}
