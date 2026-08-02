package com.objsys.asn1j.runtime;

/* loaded from: classes4.dex */
public class Asn1TYPE_IDENTIFIER {
    public Asn1Type Type;
    public Asn1ObjectIdentifier id;

    public Asn1TYPE_IDENTIFIER() {
        this.id = null;
        this.Type = null;
    }

    public Asn1TYPE_IDENTIFIER(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Type asn1Type) {
        this.id = asn1ObjectIdentifier;
        this.Type = asn1Type;
    }
}
