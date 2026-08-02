package xsna;

/* compiled from: TabbarSettingsMvi.kt */
/* loaded from: classes6.dex */
public final class mwn0 implements km50 {
    public final y2j0 b;
    public final t0j0 c;
    public final boolean d;
    public final boolean e;

    public mwn0(y2j0 y2j0Var, t0j0 t0j0Var, boolean z, boolean z2) {
        this.b = y2j0Var;
        this.c = t0j0Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwn0)) {
            return false;
        }
        mwn0 mwn0Var = (mwn0) obj;
        return epx.f(this.b, mwn0Var.b) && epx.f(this.c, mwn0Var.c) && this.d == mwn0Var.d && this.e == mwn0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabbarSettingsState(mainData=");
        sb.append(this.b);
        sb.append(", bottomData=");
        sb.append(this.c);
        sb.append(", isResetButtonEnabled=");
        sb.append(this.d);
        sb.append(", showGroupsSelection=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
