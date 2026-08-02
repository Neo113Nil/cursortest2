package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1InvalidChoiceOptionException extends Asn1Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1InvalidChoiceOptionException(Asn1BerDecodeBuffer asn1BerDecodeBuffer, Asn1Tag asn1Tag) {
        super(asn1BerDecodeBuffer, r0.toString());
        StringBuffer stringBuffer = new StringBuffer("Element with tag ");
        stringBuffer.append(asn1Tag.toString());
        stringBuffer.append(" not in CHOICE.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Asn1InvalidChoiceOptionException(Asn1PerDecodeBuffer asn1PerDecodeBuffer, int i) {
        super(asn1PerDecodeBuffer, r0.toString());
        StringBuffer stringBuffer = new StringBuffer("Element with index ");
        stringBuffer.append(i);
        stringBuffer.append(" not in CHOICE.");
    }

    public Asn1InvalidChoiceOptionException() {
        super("Object assigned to value not in CHOICE.");
    }
}
