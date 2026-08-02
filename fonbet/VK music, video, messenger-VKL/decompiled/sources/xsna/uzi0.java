package xsna;

import xsna.tlo0;

/* compiled from: SettingCellViewState.kt */
/* loaded from: classes7.dex */
public final class uzi0 {
    public final tlo0.f a;
    public final tlo0 b;
    public final boolean c;

    public uzi0(tlo0.f fVar, tlo0 tlo0Var, boolean z) {
        this.a = fVar;
        this.b = tlo0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzi0)) {
            return false;
        }
        uzi0 uzi0Var = (uzi0) obj;
        return epx.f(this.a, uzi0Var.a) && epx.f(this.b, uzi0Var.b) && this.c == uzi0Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        tlo0 tlo0Var = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingCellViewState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", isResettable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
