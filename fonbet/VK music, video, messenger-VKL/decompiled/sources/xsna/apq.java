package xsna;

import com.vk.newsfeed.api.di.NewsFeedComponent;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.jm50;
import xsna.rpq;

/* compiled from: FaveFeedMviExternalEventsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class apq extends evg0<kpq, on50, rpq.a, rpq, ipq, xoq> {
    public final qn60 f;
    public final pn60 g;
    public final Lazy h;
    public final jq60 i;
    public final rem j;
    public final zoq k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public apq(es60 es60Var, cpq cpqVar, nn50 nn50Var) {
        super(r5, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = es60Var.a;
        this.g = es60Var.b;
        Lazy<NewsFeedComponent> lazy = es60Var.e;
        this.h = lazy;
        this.i = new jq60(es60Var.d, lazy, es60Var.l, es60Var.h, aVar, new eht(this, cpqVar));
        this.j = new rem(this, 1);
        this.k = new zoq(this, 0);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        rpq.a aVar = (rpq.a) hn50Var;
        if (aVar instanceof rpq.a.C3621a) {
            return this.i.d(((rpq.a.C3621a) aVar).b);
        }
        if (!(aVar instanceof rpq.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return awg0.a.b(this, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.subjects.f(), new ir0(new igh(this, 12), 13), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new rcl(this, 1)), new z67(2), null, null, 6);
    }

    public final NewsFeedComponent s() {
        return (NewsFeedComponent) this.h.getValue();
    }
}
