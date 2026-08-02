package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1XerElemInfo {
    String name;
    boolean optional;

    public Asn1XerElemInfo(String str, boolean z) {
        this.name = str;
        this.optional = z;
    }

    public boolean equals(String str) {
        return this.name.equals(str);
    }

    public boolean isOptional() {
        return this.optional;
    }
}
