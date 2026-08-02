package xsna;

import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import xsna.ds60;
import xsna.jm50;

/* compiled from: NewsfeedSearchExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class gx60 extends evg0<xx60, on50, fy60, ey60, vx60, sx60> {
    public final kq60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gx60(es60 es60Var, rvu rvuVar, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new kq60(es60Var.a, es60Var.b, es60Var.e, aVar, new eht(this, rvuVar));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.b bVar = ((fy60) hn50Var).b;
        NewsfeedExternalAction.c cVar = bVar.b;
        boolean z = cVar instanceof NewsfeedExternalAction.c.b;
        kq60 kq60Var = this.f;
        if (z) {
            kq60Var.s(new ds60.b(new NewsfeedExternalAction.c.f0(((NewsfeedExternalAction.c.b) cVar).a)));
            return null;
        }
        if (cVar instanceof NewsfeedExternalAction.c.e0) {
            kq60Var.s(new ds60.b(new NewsfeedExternalAction.c.f0(((NewsfeedExternalAction.c.e0) cVar).a)));
            return null;
        }
        kq60Var.s(bVar);
        return null;
    }
}
