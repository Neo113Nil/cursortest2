package com.vungle.ads.internal.model;

import xsna.epx;

/* loaded from: classes7.dex */
public final class c3 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public c3(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return epx.f(this.a, c3Var.a) && this.b == c3Var.b && this.c == c3Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ErrorInfo(description=");
        a.append(this.a);
        a.append(", errorIsTerminal=");
        a.append(this.b);
        a.append(", isRetryCode=");
        return defpackage.q0.a(a, this.c, ')');
    }

    public /* synthetic */ c3(String str, boolean z, boolean z2, int i) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
