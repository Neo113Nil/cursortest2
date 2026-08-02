package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class s {
    public final boolean a;
    public final String b;
    public final r c;
    public final boolean d;

    public s(boolean z, String str, r rVar, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = rVar;
        this.d = z2;
    }

    public static s a(s sVar, String str, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? sVar.a : false;
        if ((i & 2) != 0) {
            str = sVar.b;
        }
        r rVar = (i & 4) != 0 ? sVar.c : q.a;
        if ((i & 8) != 0) {
            z = sVar.d;
        }
        sVar.getClass();
        return new s(z2, str, rVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && jl40.l(this.b, sVar.b) && jl40.l(this.c, sVar.c) && this.d == sVar.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r rVar = this.c;
        if (rVar != null) {
            rVar.getClass();
            i = -376798774;
        }
        return Boolean.hashCode(this.d) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(isLoading=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append(this.c);
        sb.append(", shouldOpenSettings=");
        return unr0.u(sb, this.d, ')');
    }

    public /* synthetic */ s(int i) {
        this(true, null, null, false);
    }

    public s() {
        this(0);
    }
}
