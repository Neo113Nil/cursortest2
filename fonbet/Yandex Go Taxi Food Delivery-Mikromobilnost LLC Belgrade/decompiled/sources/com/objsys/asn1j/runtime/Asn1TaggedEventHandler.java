package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public interface Asn1TaggedEventHandler {
    void contents(byte[] bArr);

    void endElement(Asn1Tag asn1Tag);

    void startElement(Asn1Tag asn1Tag, int i, byte[] bArr);
}
