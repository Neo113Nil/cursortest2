package xsna;

import java.util.List;

/* compiled from: DiscoverSimilarFeedMviBootstrapper.kt */
/* loaded from: classes4.dex */
public final class s7n implements vj50 {
    public final /* synthetic */ int a;
    public final gzs b;
    public final gzs c;

    public /* synthetic */ s7n(gzs gzsVar, gzs gzsVar2, int i) {
        this.a = i;
        this.b = gzsVar;
        this.c = gzsVar2;
    }

    @Override // xsna.vj50
    public final lm50 a() {
        switch (this.a) {
            case 0:
                return (l8n) ((u3k) this.b).invoke();
            default:
                return (tw60) this.b.invoke();
        }
    }

    @Override // xsna.vj50
    public final yl50 b() {
        switch (this.a) {
        }
        return null;
    }

    @Override // xsna.vj50
    public final List c(lm50 lm50Var) {
        switch (this.a) {
            case 0:
                return (List) ((nh0) this.c).invoke();
            default:
                return (List) this.c.invoke();
        }
    }
}
