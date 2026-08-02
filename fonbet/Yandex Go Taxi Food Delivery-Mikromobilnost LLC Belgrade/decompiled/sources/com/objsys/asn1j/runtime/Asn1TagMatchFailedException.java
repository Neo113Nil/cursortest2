package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1TagMatchFailedException extends Asn1Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1TagMatchFailedException(Asn1BerDecodeBuffer asn1BerDecodeBuffer, Asn1Tag asn1Tag, Asn1Tag asn1Tag2) {
        super(asn1BerDecodeBuffer, r0.toString());
        StringBuffer stringBuffer = new StringBuffer("Tag match failed: expected ");
        stringBuffer.append(asn1Tag.toString());
        stringBuffer.append(", parsed ");
        stringBuffer.append(asn1Tag2.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1TagMatchFailedException(Asn1BerDecodeBuffer asn1BerDecodeBuffer, Asn1Tag asn1Tag) {
        super(asn1BerDecodeBuffer, r0.toString());
        StringBuffer stringBuffer = new StringBuffer("Tag match failed: expected ");
        stringBuffer.append(asn1Tag.toString());
    }
}
