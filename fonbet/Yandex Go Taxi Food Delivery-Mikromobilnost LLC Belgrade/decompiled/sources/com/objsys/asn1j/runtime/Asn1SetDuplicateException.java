package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1SetDuplicateException extends Asn1Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1SetDuplicateException(Asn1BerDecodeBuffer asn1BerDecodeBuffer, Asn1Tag asn1Tag) {
        super(asn1BerDecodeBuffer, r0.toString());
        StringBuffer stringBuffer = new StringBuffer("Duplicate element with tag ");
        stringBuffer.append(asn1Tag.toString());
        stringBuffer.append(" detected in SET.");
    }
}
