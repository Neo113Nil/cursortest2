package defpackage;

import java.util.List;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class jnn {
    public hoy0 a;
    public zi6 b;

    public jnn() {
        kk2 kk2Var = mk2.a;
        hoy0 hoy0Var = new hoy0(kk2Var, asy0.b, (asy0) null);
        this.a = hoy0Var;
        this.b = new zi6(kk2Var, hoy0Var.b);
    }

    public final hoy0 a(List list) {
        zkn zknVar;
        Exception e;
        zkn zknVar2;
        try {
            int size = list.size();
            int i = 0;
            zknVar = null;
            while (i < size) {
                try {
                    zknVar2 = (zkn) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    zknVar2.a(this.b);
                    i++;
                    zknVar = zknVar2;
                } catch (Exception e3) {
                    e = e3;
                    zknVar = zknVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((yi6) this.b.y).h());
                    sb2.append(", composition=");
                    sb2.append(this.b.i());
                    sb2.append(", selection=");
                    zi6 zi6Var = this.b;
                    sb2.append((Object) asy0.h(eja1.c(zi6Var.b, zi6Var.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    a.W(list, sb, "\n", new dzm(zknVar, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            zi6 zi6Var2 = this.b;
            zi6Var2.getClass();
            kk2 kk2Var = new kk2(((yi6) zi6Var2.y).toString());
            zi6 zi6Var3 = this.b;
            long c = eja1.c(zi6Var3.b, zi6Var3.c);
            asy0 asy0Var = asy0.g(this.a.b) ? null : new asy0(c);
            hoy0 hoy0Var = new hoy0(kk2Var, asy0Var != null ? asy0Var.a : eja1.c(asy0.e(c), asy0.f(c)), this.b.i());
            this.a = hoy0Var;
            return hoy0Var;
        } catch (Exception e4) {
            zknVar = null;
            e = e4;
        }
    }
}
