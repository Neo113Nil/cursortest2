package xsna;

import xsna.tlo0;

/* compiled from: SettingSwitchViewState.kt */
/* loaded from: classes7.dex */
public final class zzi0 {
    public final tlo0.f a;
    public final tlo0.f b;
    public final boolean c;

    public zzi0(tlo0.f fVar, tlo0.f fVar2, boolean z) {
        this.a = fVar;
        this.b = fVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzi0)) {
            return false;
        }
        zzi0 zzi0Var = (zzi0) obj;
        return this.a.equals(zzi0Var.a) && this.b.equals(zzi0Var.b) && this.c == zzi0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingSwitchViewState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", value=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
