package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;

/* compiled from: PlaylistLink.kt */
/* loaded from: classes17.dex */
public final class rab0 implements pje {
    public final due a;
    public final zof b;
    public final mhd c;

    public rab0(due dueVar, zof zofVar, mhd mhdVar) {
        this.a = dueVar;
        this.b = zofVar;
        this.c = mhdVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (this.b.k()) {
            return jh.h("/clips/playlist/([-0-9]+)_([-0-9]+)", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        UserId userId = new UserId(peq0Var.c(1));
        io.reactivex.rxjava3.core.x B = io.reactivex.rxjava3.core.x.B(new io.reactivex.rxjava3.internal.operators.single.d0(xg5.a().D().N0(fkq0.a(userId)).K(), new com.vk.movika.sdk.base.model.history.b(25), null), this.a.d(peq0Var.b(2), userId, epx.f(o25.a().c(), userId)), new gq(new log(11), 29));
        asu0 asu0Var = asu0.a;
        ver0.a(B.q(asu0Var.c()).m(asu0Var.d()).subscribe(new f5y(new cae(context, 1), 14), new nex(new ulz(12), 11)));
        return true;
    }
}
