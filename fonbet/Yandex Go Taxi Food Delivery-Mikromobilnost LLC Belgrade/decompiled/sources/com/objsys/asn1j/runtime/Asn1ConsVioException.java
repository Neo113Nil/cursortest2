package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1ConsVioException extends Asn1Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1ConsVioException(String str, long j) {
        super(r0.toString());
        StringBuffer stringBuffer = new StringBuffer("Element ");
        stringBuffer.append(str);
        stringBuffer.append(" with value ");
        stringBuffer.append(Long.toString(j));
        stringBuffer.append(" violates defined constraint.");
    }
}
