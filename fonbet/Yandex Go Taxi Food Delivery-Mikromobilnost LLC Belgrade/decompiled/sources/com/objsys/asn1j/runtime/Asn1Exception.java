package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1Exception extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1Exception(Asn1DecodeBuffer asn1DecodeBuffer, String str) {
        super(r0.toString());
        StringBuffer stringBuffer = new StringBuffer("ASN.1 decode error @ offset ");
        stringBuffer.append(asn1DecodeBuffer.getByteCount());
        stringBuffer.append(":\n");
        stringBuffer.append(str);
    }

    public Asn1Exception(String str) {
        super(str);
    }
}
