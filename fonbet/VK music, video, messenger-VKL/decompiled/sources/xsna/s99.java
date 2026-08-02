package xsna;

import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.bo0;
import xsna.ca9;
import xsna.go0;
import xsna.t0y;
import xsna.xaz;

/* compiled from: CallSettingsState.kt */
/* loaded from: classes7.dex */
public final class s99 {
    public final String a;
    public final Set<String> b;
    public final ca9 c;
    public final xaz d;
    public final go0 e;
    public final t0y f;
    public final bo0 g;
    public final boolean h;

    public s99() {
        this(0);
    }

    public static s99 a(s99 s99Var, String str, Set set, ca9 ca9Var, xaz xazVar, go0 go0Var, t0y t0yVar, bo0 bo0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            str = s99Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            set = s99Var.b;
        }
        Set set2 = set;
        if ((i & 4) != 0) {
            ca9Var = s99Var.c;
        }
        ca9 ca9Var2 = ca9Var;
        if ((i & 8) != 0) {
            xazVar = s99Var.d;
        }
        xaz xazVar2 = xazVar;
        if ((i & 16) != 0) {
            go0Var = s99Var.e;
        }
        go0 go0Var2 = go0Var;
        if ((i & 32) != 0) {
            t0yVar = s99Var.f;
        }
        t0y t0yVar2 = t0yVar;
        bo0 bo0Var2 = (i & 64) != 0 ? s99Var.g : bo0Var;
        boolean z2 = (i & 128) != 0 ? s99Var.h : z;
        s99Var.getClass();
        return new s99(str2, set2, ca9Var2, xazVar2, go0Var2, t0yVar2, bo0Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s99)) {
            return false;
        }
        s99 s99Var = (s99) obj;
        return epx.f(this.a, s99Var.a) && epx.f(this.b, s99Var.b) && epx.f(this.c, s99Var.c) && epx.f(this.d, s99Var.d) && epx.f(this.e, s99Var.e) && epx.f(this.f, s99Var.f) && epx.f(this.g, s99Var.g) && this.h == s99Var.h;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + fw3.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallSettingsState(searchQuery=");
        sb.append(this.a);
        sb.append(", inviteListIds=");
        sb.append(this.b);
        sb.append(", callState=");
        sb.append(this.c);
        sb.append(", linkState=");
        sb.append(this.d);
        sb.append(", addToFriendsState=");
        sb.append(this.e);
        sb.append(", joinToCommunityState=");
        sb.append(this.f);
        sb.append(", addToCallState=");
        sb.append(this.g);
        sb.append(", scanningQrCode=");
        return defpackage.q0.a(sb, this.h, ')');
    }

    public s99(String str, Set<String> set, ca9 ca9Var, xaz xazVar, go0 go0Var, t0y t0yVar, bo0 bo0Var, boolean z) {
        this.a = str;
        this.b = set;
        this.c = ca9Var;
        this.d = xazVar;
        this.e = go0Var;
        this.f = t0yVar;
        this.g = bo0Var;
        this.h = z;
    }

    public s99(int i) {
        this(null, EmptySet.b, ca9.b.a, new xaz.c(true), go0.b.a, t0y.b.a, bo0.a.a, false);
    }
}
