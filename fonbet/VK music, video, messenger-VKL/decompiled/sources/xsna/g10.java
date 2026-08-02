package xsna;

import android.animation.Animator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.view.state.PlayPauseButtonViewState;
import xsna.i10;
import xsna.jvo0;

/* compiled from: Animator.kt */
/* loaded from: classes8.dex */
public final class g10 implements Animator.AnimatorListener {
    public final /* synthetic */ i10 b;
    public final /* synthetic */ i10.a c;

    public g10(i10 i10Var, i10.a aVar) {
        this.b = i10Var;
        this.c = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l2u0 a;
        i10 i10Var = this.b;
        lp2 lp2Var = i10Var.y;
        aqj0 aqj0Var = i10Var.c;
        lp2Var.getClass();
        long b = k830.b();
        lp2Var.a().clear();
        ArrayList arrayList = lp2Var.e;
        ArrayList a2 = lp2Var.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l2u0 l2u0Var = (l2u0) it.next();
            if (l2u0Var instanceof PlayPauseButtonViewState) {
                a = one.video.controls.view.state.b.a(aqj0Var.x, false);
            } else if (l2u0Var instanceof mbu) {
                a = one.video.controls.view.state.b.a(aqj0Var.v, false);
            } else if (l2u0Var instanceof g3e0) {
                a = one.video.controls.view.state.b.a(aqj0Var.m, false);
            } else if (l2u0Var instanceof qso0) {
                a = one.video.controls.view.state.b.a(aqj0Var.n, false);
            } else if (l2u0Var instanceof ozb0) {
                a = one.video.controls.view.state.b.a(aqj0Var.k, false);
            } else if (l2u0Var instanceof ilk) {
                a = one.video.controls.view.state.b.a(aqj0Var.C, false);
            } else if (l2u0Var instanceof hs8) {
                a = one.video.controls.view.state.b.a(aqj0Var.b, false);
            } else if (l2u0Var instanceof rxu) {
                a = one.video.controls.view.state.b.a(aqj0Var.q, false);
            } else if (l2u0Var instanceof s6s) {
                a = one.video.controls.view.state.b.a(aqj0Var.r, false);
            } else if (l2u0Var instanceof zfg0) {
                a = one.video.controls.view.state.b.a(aqj0Var.s, false);
            } else if (l2u0Var instanceof w170) {
                a = one.video.controls.view.state.b.a(aqj0Var.u, false);
            } else if (l2u0Var instanceof l3d0) {
                a = one.video.controls.view.state.b.a(aqj0Var.t, false);
            } else if (l2u0Var instanceof u3i0) {
                a = one.video.controls.view.state.b.a(aqj0Var.D, false);
            } else if (l2u0Var instanceof w6y0) {
                a = one.video.controls.view.state.b.a(aqj0Var.E, false);
            } else if (l2u0Var instanceof cmq) {
                a = one.video.controls.view.state.b.a(aqj0Var.B, false);
            } else if (l2u0Var instanceof smz) {
                a = one.video.controls.view.state.b.a(aqj0Var.o, false);
            } else if (l2u0Var instanceof ojz) {
                a = one.video.controls.view.state.b.a(aqj0Var.p, false);
            } else {
                if (!(l2u0Var instanceof alp)) {
                    throw new NoWhenBranchMatchedException();
                }
                a = one.video.controls.view.state.b.a(aqj0Var.z, false);
            }
            a2.add(a);
        }
        lp2Var.e = lp2Var.a();
        zno.m(jvo0.a.b(b));
        i10.this.b(lp2Var.e);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
