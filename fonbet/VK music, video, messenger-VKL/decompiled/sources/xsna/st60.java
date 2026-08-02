package xsna;

import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import kotlin.Lazy;

/* compiled from: NewsfeedMainTaskExecutorsDependencies.kt */
/* loaded from: classes4.dex */
public final class st60 {
    public final es60 a;
    public final jt60 b;
    public final bpn0 c;
    public final bpn0 d;
    public final Lazy<h6c0> e;
    public final Lazy<LinksGeneratorComponent> f;
    public final bpn0 g;

    public st60(es60 es60Var, jt60 jt60Var, bpn0 bpn0Var, bpn0 bpn0Var2, Lazy lazy, Lazy lazy2, bpn0 bpn0Var3) {
        this.a = es60Var;
        this.b = jt60Var;
        this.c = bpn0Var;
        this.d = bpn0Var2;
        this.e = lazy;
        this.f = lazy2;
        this.g = bpn0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st60)) {
            return false;
        }
        st60 st60Var = (st60) obj;
        return this.a.equals(st60Var.a) && this.b.equals(st60Var.b) && this.c.equals(st60Var.c) && this.d.equals(st60Var.d) && epx.f(this.e, st60Var.e) && epx.f(this.f, st60Var.f) && this.g.equals(st60Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + g7r0.a(this.f, g7r0.a(this.e, tq.b(this.d, tq.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "NewsfeedMainTaskExecutorsDependencies(listTaskExecutorsDependencies=" + this.a + ", freshNewsInteractor=" + this.b + ", situationalSuggestInteractorLazy=" + this.c + ", anomalyDetectorLazy=" + this.d + ", diversityAnalyzer=" + this.e + ", linksGeneratorComponentLazy=" + this.f + ", deduplicatorLazy=" + this.g + ')';
    }
}
