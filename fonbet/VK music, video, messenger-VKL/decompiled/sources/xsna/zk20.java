package xsna;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MetricDescriptor.java */
/* loaded from: classes8.dex */
public abstract class zk20 {
    public final AtomicReference<ngk0> a = new AtomicReference<>();
    public int b;

    public static mn5 a(ttt0 ttt0Var, ngk0 ngk0Var, ym5 ym5Var) {
        mn5 mn5Var = new mn5(ttt0Var.f() == null ? ym5Var.c : ttt0Var.f(), ttt0Var.e() == null ? ym5Var.d : ttt0Var.e(), ttt0Var, ym5Var);
        mn5Var.a.set(ngk0Var);
        return mn5Var;
    }

    public abstract String b();

    public abstract String c();

    public abstract m8x d();

    public abstract ttt0 e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zk20)) {
            return false;
        }
        zk20 zk20Var = (zk20) obj;
        return c().equalsIgnoreCase(zk20Var.c()) && b().equals(zk20Var.b()) && e().equals(zk20Var.e()) && d().equals(zk20Var.d());
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((c().toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ b().hashCode()) * 1000003) ^ e().hashCode()) * 1000003) ^ d().hashCode();
        this.b = hashCode;
        return hashCode;
    }
}
