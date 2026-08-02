package com.objsys.asn1j.runtime;

/* loaded from: classes4.dex */
public class Asn1InvalidEnumException extends Asn1Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1InvalidEnumException(long j) {
        super(r0.toString());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(j);
        stringBuffer.append(" is not in the defined set of enum values for this type.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1InvalidEnumException(String str) {
        super(r0.toString());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" is not in the defined set of enum values for this type.");
    }
}
