package com.yandex.delivery.attrbutedtext.api;

import defpackage.i8s;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class g implements i8s {
    public final String a;
    public final h b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g() {
        this("", r0 == null ? new h(null, null, null, null, null, null, null, null, null, 2047) : r0);
        Object R = kotlin.collections.a.R(FormattedText.b.a);
        h hVar = R instanceof h ? (h) R : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return jl40.l(this.a, gVar.a) && jl40.l(this.b, gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
    }

    public g(String str, h hVar) {
        this.a = str;
        this.b = hVar;
    }
}
