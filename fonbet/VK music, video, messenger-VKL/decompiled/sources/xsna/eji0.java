package xsna;

import java.util.List;

/* compiled from: SendStoryUsersState.kt */
/* loaded from: classes16.dex */
public final class eji0 implements km50 {
    public final List<s8m> b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public eji0(String str, List list, boolean z, boolean z2) {
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public static eji0 a(eji0 eji0Var, List list, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = eji0Var.b;
        }
        if ((i & 2) != 0) {
            str = eji0Var.c;
        }
        if ((i & 4) != 0) {
            z = eji0Var.d;
        }
        if ((i & 8) != 0) {
            z2 = eji0Var.e;
        }
        eji0Var.getClass();
        return new eji0(str, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eji0)) {
            return false;
        }
        eji0 eji0Var = (eji0) obj;
        return epx.f(this.b, eji0Var.b) && epx.f(this.c, eji0Var.c) && this.d == eji0Var.d && this.e == eji0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendStoryUsersState(items=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append(", needClearInput=");
        sb.append(this.d);
        sb.append(", needShowEmptySearch=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
