package xsna;

import xsna.wbo0;
import xsna.xbo0;

/* compiled from: InputSelectScreenContent.kt */
/* loaded from: classes18.dex */
public final class zbo0 {
    public final xbo0 a;
    public final wbo0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zbo0() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [xsna.xbo0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [xsna.wbo0] */
    public static zbo0 a(zbo0 zbo0Var, xbo0.a aVar, wbo0.a aVar2, boolean z, boolean z2, boolean z3, int i) {
        xbo0.a aVar3 = aVar;
        if ((i & 1) != 0) {
            aVar3 = zbo0Var.a;
        }
        xbo0.a aVar4 = aVar3;
        wbo0.a aVar5 = aVar2;
        if ((i & 2) != 0) {
            aVar5 = zbo0Var.b;
        }
        wbo0.a aVar6 = aVar5;
        if ((i & 4) != 0) {
            z = zbo0Var.c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = zbo0Var.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = zbo0Var.e;
        }
        zbo0Var.getClass();
        return new zbo0(aVar4, aVar6, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbo0)) {
            return false;
        }
        zbo0 zbo0Var = (zbo0) obj;
        return epx.f(this.a, zbo0Var.a) && epx.f(this.b, zbo0Var.b) && this.c == zbo0Var.c && this.d == zbo0Var.d && this.e == zbo0Var.e;
    }

    public final int hashCode() {
        xbo0 xbo0Var = this.a;
        int hashCode = (xbo0Var == null ? 0 : xbo0Var.hashCode()) * 31;
        wbo0 wbo0Var = this.b;
        return Boolean.hashCode(this.e) + qoy.b(qoy.b((hashCode + (wbo0Var != null ? wbo0Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAreaState(before=");
        sb.append(this.a);
        sb.append(", after=");
        sb.append(this.b);
        sb.append(", clear=");
        sb.append(this.c);
        sb.append(", isEnable=");
        sb.append(this.d);
        sb.append(", hasPlaceholder=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public /* synthetic */ zbo0(int i) {
        this(null, null, false, true, true);
    }

    public zbo0(xbo0 xbo0Var, wbo0 wbo0Var, boolean z, boolean z2, boolean z3) {
        this.a = xbo0Var;
        this.b = wbo0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
