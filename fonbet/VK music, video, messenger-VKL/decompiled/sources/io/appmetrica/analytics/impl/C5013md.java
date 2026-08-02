package io.appmetrica.analytics.impl;

import xsna.epx;

/* renamed from: io.appmetrica.analytics.impl.md, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5013md {
    public final String a;
    public final boolean b;

    public C5013md(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5013md)) {
            return false;
        }
        C5013md c5013md = (C5013md) obj;
        return epx.f(this.a, c5013md.a) && this.b == c5013md.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModuleStatus(moduleName=");
        sb.append(this.a);
        sb.append(", loaded=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
