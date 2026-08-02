package com.yandex.passport.internal.ui.common.screen;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class d {
    public final Throwable a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public d(Throwable th, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = th;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c) && jl40.l(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorScreenState(throwable=");
        sb.append(this.a);
        sb.append(", applicationPackageName=");
        sb.append(this.b);
        sb.append(", deviceId=");
        sb.append(this.c);
        sb.append(", time=");
        sb.append(this.d);
        sb.append(", isShowCancelButton=");
        sb.append(this.e);
        sb.append(", isShowPackageName=");
        return unr0.u(sb, this.f, ')');
    }
}
