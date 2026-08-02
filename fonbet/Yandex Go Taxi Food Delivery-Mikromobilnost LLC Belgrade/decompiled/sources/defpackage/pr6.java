package defpackage;

import com.yandex.go.taxi.summary.experiments.SummaryPerformanceOptimisationsExperiment;

/* loaded from: classes9.dex */
public final class pr6 implements en11 {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final /* synthetic */ en11 b;

    public pr6(rqo rqoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                SummaryPerformanceOptimisationsExperiment.Companion.getClass();
                this.b = ((jbh) rqoVar).b(SummaryPerformanceOptimisationsExperiment.f);
                break;
            default:
                or6.Companion.getClass();
                this.b = ((jbh) rqoVar).b(or6.d);
                break;
        }
    }

    @Override // defpackage.qqo
    public final tpr a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        switch (this.a) {
            case 0:
                return (or6) this.b.b();
            default:
                return (SummaryPerformanceOptimisationsExperiment) this.b.b();
        }
    }

    @Override // defpackage.en11
    public final tpr c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.en11
    public final boolean isEnabled() {
        switch (this.a) {
        }
        return this.b.isEnabled();
    }
}
