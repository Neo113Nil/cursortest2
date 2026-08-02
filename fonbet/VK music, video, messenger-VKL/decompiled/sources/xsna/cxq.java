package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: FeedBackOverlayAction.kt */
/* loaded from: classes7.dex */
public final class cxq extends ku<u5r, v5r> {
    public s5r d;

    @Override // xsna.ku
    public final v5r e(Context context) {
        return new v5r(context);
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        v5r v5rVar = (v5r) view;
        v5rVar.setFeature(this.d);
        v5rVar.g.onNext((u5r) obj);
    }

    public final void j(s5r s5rVar) {
        this.d = s5rVar;
        io.reactivex.rxjava3.core.q<T> w = s5rVar.a.b().w();
        com.vk.voip.ui.c.b.getClass();
        io.reactivex.rxjava3.core.q o0 = io.reactivex.rxjava3.core.q.j(w, com.vk.voip.ui.c.Y.f(), com.vk.voip.ui.c.K0(), com.vk.voip.ui.c.L0(), new com.vk.movika.sdk.base.hooks.f(new q5r(), 19)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new r5r()));
        o0.getClass();
        s5rVar.c.b(new io.reactivex.rxjava3.internal.operators.observable.y(o0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new iu1(new rop(this, 3), 17)));
    }
}
