package com.yandex.go.taxi.order.details.v1.ui;

import defpackage.jl40;
import defpackage.kdc;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class c extends f {
    public final kdc a;

    public c(kdc kdcVar) {
        this.a = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && jl40.l(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        kdc kdcVar = this.a;
        if (kdcVar == null) {
            return 0;
        }
        return kdcVar.hashCode();
    }

    public final String toString() {
        return "Chevron(color=" + this.a + Extension.C_BRAKE;
    }
}
