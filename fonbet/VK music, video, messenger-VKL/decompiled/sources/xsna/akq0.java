package xsna;

import xsna.ir5;
import xsna.o2k;

/* compiled from: UserEditableData.kt */
/* loaded from: classes5.dex */
public final class akq0 {
    public static final akq0 f = new akq0(new ir5.a(0), o2k.a.a, false, "", false);
    public final ir5 a;
    public final o2k b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public akq0(ir5 ir5Var, o2k o2kVar, boolean z, String str, boolean z2) {
        this.a = ir5Var;
        this.b = o2kVar;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    public static akq0 a(akq0 akq0Var, ir5 ir5Var, o2k o2kVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            ir5Var = akq0Var.a;
        }
        ir5 ir5Var2 = ir5Var;
        if ((i & 2) != 0) {
            o2kVar = akq0Var.b;
        }
        o2k o2kVar2 = o2kVar;
        boolean z2 = (i & 4) != 0 ? akq0Var.c : false;
        if ((i & 8) != 0) {
            str = akq0Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = akq0Var.e;
        }
        akq0Var.getClass();
        return new akq0(ir5Var2, o2kVar2, z2, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akq0)) {
            return false;
        }
        akq0 akq0Var = (akq0) obj;
        return epx.f(this.a, akq0Var.a) && epx.f(this.b, akq0Var.b) && this.c == akq0Var.c && epx.f(this.d, akq0Var.d) && this.e == akq0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserEditableData(avatar=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", nicknameVisibility=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", isFollowersModeOn=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
