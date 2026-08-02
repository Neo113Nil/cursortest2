package com.yandex.mobile.ads.common;

import xsna.epx;
import xsna.ss9;

/* loaded from: classes8.dex */
public final class AdapterIdentity {
    private final String a;
    private final String b;

    public AdapterIdentity(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdapterIdentity)) {
            return false;
        }
        AdapterIdentity adapterIdentity = (AdapterIdentity) obj;
        return epx.f(this.a, adapterIdentity.a) && epx.f(this.b, adapterIdentity.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return ss9.a("AdapterIdentity(adapterNetworkName=", this.a, ", adapterVersion=", this.b, ")");
    }
}
