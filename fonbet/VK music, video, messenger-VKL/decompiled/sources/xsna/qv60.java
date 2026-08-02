package xsna;

import com.vk.newsfeed.api.di.NewsFeedComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.jm50;
import xsna.r070;

/* compiled from: NewsfeedPostActivitiesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class qv60 extends evg0<qz60, on50, r070.i, r070, jv60, xh60> {
    public final qn60 f;
    public final pn60 g;
    public final Lazy h;
    public final Object i;

    public qv60(es60 es60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = es60Var.a;
        this.g = es60Var.b;
        this.h = es60Var.e;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.ui.o0(26));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        r070.i iVar = (r070.i) hn50Var;
        if (!(iVar instanceof r070.i.a)) {
            throw new NoWhenBranchMatchedException();
        }
        r070.i.a aVar = (r070.i.a) iVar;
        return g(new io.reactivex.rxjava3.internal.operators.single.r(wdq.a(((NewsFeedComponent) this.h.getValue()).E9().a(aVar.b, aVar.c)), new dnz(new qw30(this, 8), 5)), new uu60(this, 1), new eiy(this, 8));
    }
}
