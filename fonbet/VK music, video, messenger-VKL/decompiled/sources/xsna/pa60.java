package xsna;

import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.phi0;

/* compiled from: NewsEntryFeedbackCommentsListPresenter.kt */
/* loaded from: classes4.dex */
public final class pa60 extends lfg<sa60> {
    public boolean o0;
    public final io.reactivex.rxjava3.subjects.g<Boolean> p0;
    public final Object q0;
    public final phi0.b r0;
    public final dbg s0;

    public pa60(ics0 ics0Var, fae faeVar, Lazy lazy, NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment, ra60 ra60Var) {
        super(ics0Var, faeVar, lazy, newsEntryFeedbackCommentsFragment, ra60Var, null);
        this.p0 = io.reactivex.rxjava3.subjects.g.N0();
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new bu0(21));
        this.q0 = a;
        bbg bbgVar = new bbg(false, false);
        this.r0 = phi0.b.a;
        dbg dbgVar = new dbg();
        dbgVar.a = bbgVar;
        dbgVar.g = ((Boolean) a.getValue()).booleanValue();
        this.s0 = dbgVar;
    }

    @Override // xsna.lfg
    public final void K8(vqt vqtVar) {
        super.K8(vqtVar);
        ((sa60) this.e).c1(vqtVar.h.a);
    }

    @Override // xsna.lfg
    public final void L8(vqt vqtVar, boolean z) {
        super.L8(vqtVar, z);
        ((sa60) this.e).c1(vqtVar.h.a);
    }

    @Override // xsna.lfg
    public final void M8(vqt vqtVar, boolean z) {
        super.M8(vqtVar, z);
        if (z) {
            ((sa60) this.e).c1(vqtVar.h.a);
        }
    }

    @Override // xsna.lfg, xsna.mdg, xsna.afg
    public final void Q1(String str) {
        sd90 sd90Var = this.Q;
        if (sd90Var == null) {
            return;
        }
        io.reactivex.rxjava3.core.q<vqt> Q1 = sd90Var.Q1(str);
        sa60 sa60Var = (sa60) this.e;
        io.reactivex.rxjava3.core.q n = sd90Var.n(hg1.m(Q1, sa60Var.getContext(), 0L, false, 60));
        if (n != null) {
            G8(n, true);
            sa60Var.s();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lfg
    public final boolean T8() {
        return ((Boolean) this.q0.getValue()).booleanValue();
    }

    @Override // xsna.lfg, xsna.mdg
    public final dbg d4() {
        return this.s0;
    }

    @Override // xsna.lfg, xsna.mdg, com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<vqt> hj(com.vk.lists.c cVar, boolean z) {
        io.reactivex.rxjava3.core.q<vqt> hj = super.hj(cVar, z);
        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(this.p0.A0(550L, TimeUnit.MILLISECONDS, null, asu0.a.d()), new vp(new kpr(22), 29));
        cq cqVar = new cq(23, new n21(5));
        hj.getClass();
        return io.reactivex.rxjava3.core.q.I0(hj, p1Var, cqVar);
    }

    @Override // xsna.mdg
    public final boolean t3() {
        return false;
    }

    @Override // xsna.lfg, xsna.mdg
    public final phi0 w7() {
        return this.r0;
    }
}
