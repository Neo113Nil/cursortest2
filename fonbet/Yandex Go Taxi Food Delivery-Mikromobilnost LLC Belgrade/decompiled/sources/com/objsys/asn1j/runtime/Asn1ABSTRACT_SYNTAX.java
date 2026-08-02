package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1ABSTRACT_SYNTAX {
    public Asn1Type Type;
    public Asn1ObjectIdentifier id;
    public Asn1_ABSTRACT_SYNTAX_property property;

    public Asn1ABSTRACT_SYNTAX() {
        this.id = null;
        this.Type = null;
        this.property = null;
    }

    public Asn1ABSTRACT_SYNTAX(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1Type asn1Type, Asn1_ABSTRACT_SYNTAX_property asn1_ABSTRACT_SYNTAX_property) {
        this.id = asn1ObjectIdentifier;
        this.Type = asn1Type;
        this.property = asn1_ABSTRACT_SYNTAX_property;
    }
}
