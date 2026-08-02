package xsna;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MultiAccountConfig.kt */
/* loaded from: classes11.dex */
public final class y140 {
    public final gzs<Boolean> a;
    public final to10 b;
    public final m240 c;
    public final gzs<Boolean> d;
    public final gzs<Boolean> e;

    static {
        new CopyOnWriteArrayList();
    }

    public y140(gzs<Boolean> gzsVar, to10 to10Var, m240 m240Var, gzs<Boolean> gzsVar2, gzs<Boolean> gzsVar3) {
        this.a = gzsVar;
        this.b = to10Var;
        this.c = m240Var;
        this.d = gzsVar2;
        this.e = gzsVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y140)) {
            return false;
        }
        y140 y140Var = (y140) obj;
        return epx.f(this.a, y140Var.a) && epx.f(this.b, y140Var.b) && epx.f(this.c, y140Var.c) && epx.f(this.d, y140Var.d) && epx.f(this.e, y140Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + sf3.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiAccountConfig(isActiveUserPushesOnly=");
        sb.append(this.a);
        sb.append(", maxUsersAccount=");
        sb.append(this.b);
        sb.append(", multiAccountInfoUpdater=");
        sb.append(this.c);
        sb.append(", interruptibleScheduler=");
        sb.append(this.d);
        sb.append(", isNftAvailable=");
        return uf3.d(sb, this.e, ')');
    }
}
