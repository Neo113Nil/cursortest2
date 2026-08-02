package xsna;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.view.LiveLabelView;
import one.video.controls.view.LiveTimeView;
import one.video.controls.view.state.CastButtonState;
import one.video.controls.view.state.PlayPauseButtonViewState;
import one.video.controls20.SimpleControlsView;
import xsna.jvo0;
import xsna.o10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class xpj0 implements o7j {
    public final /* synthetic */ SimpleControlsView b;

    public /* synthetic */ xpj0(SimpleControlsView simpleControlsView) {
        this.b = simpleControlsView;
    }

    @Override // xsna.o7j
    public final void accept(Object obj) {
        o10 o10Var = (o10) obj;
        int i = SimpleControlsView.S;
        long b = k830.b();
        boolean z = o10Var instanceof o10.a;
        SimpleControlsView simpleControlsView = this.b;
        if (z) {
            simpleControlsView.U4(((o10.a) o10Var).a);
        } else {
            if (!(o10Var instanceof o10.b)) {
                throw new NoWhenBranchMatchedException();
            }
            List<x0u0> list = ((o10.b) o10Var).a;
            nn80 nn80Var = simpleControlsView.u;
            for (x0u0 x0u0Var : list) {
                if (x0u0Var instanceof hs8) {
                    nn80Var.b.b.c((hs8) x0u0Var);
                } else if (x0u0Var instanceof CastButtonState) {
                    nn80Var.c.f.c((CastButtonState) x0u0Var);
                } else if (x0u0Var instanceof p5r) {
                    nn80Var.k.b.c((p5r) x0u0Var);
                } else if (x0u0Var instanceof sxs) {
                    nn80Var.n.b.c((sxs) x0u0Var);
                } else if (x0u0Var instanceof woa0) {
                    nn80Var.r.b.c((woa0) x0u0Var);
                } else if (x0u0Var instanceof k4h0) {
                    nn80Var.x.b.c((k4h0) x0u0Var);
                } else if (x0u0Var instanceof w0j0) {
                    nn80Var.A.b.c((w0j0) x0u0Var);
                } else if (x0u0Var instanceof v7o0) {
                    nn80Var.C.b.c((v7o0) x0u0Var);
                } else if (x0u0Var instanceof ldr0) {
                    nn80Var.D.b.c((ldr0) x0u0Var);
                } else if (x0u0Var instanceof ozb0) {
                    nn80Var.t.c.c((ozb0) x0u0Var);
                } else if (x0u0Var instanceof hn80) {
                    nn80Var.y.e.c((hn80) x0u0Var);
                } else if (x0u0Var instanceof g3e0) {
                    nn80Var.y.getProgressSeekBarView().d.c((g3e0) x0u0Var);
                } else if (x0u0Var instanceof qso0) {
                    nn80Var.y.getThumbSeekBarView().d.c((qso0) x0u0Var);
                } else if (x0u0Var instanceof smz) {
                    LiveTimeView liveTimeView = nn80Var.y.getLiveTimeView();
                    if (liveTimeView != null) {
                        liveTimeView.c.c((smz) x0u0Var);
                    }
                } else if (x0u0Var instanceof ojz) {
                    LiveLabelView liveLabelView = nn80Var.y.getLiveLabelView();
                    if (liveLabelView != null) {
                        liveLabelView.b.c((ojz) x0u0Var);
                    }
                } else if (x0u0Var instanceof rxu) {
                    nn80Var.p.b.c((rxu) x0u0Var);
                } else if (x0u0Var instanceof s6s) {
                    nn80Var.l.b.c((s6s) x0u0Var);
                } else if (x0u0Var instanceof zfg0) {
                    nn80Var.w.b.c((zfg0) x0u0Var);
                } else if (x0u0Var instanceof l3d0) {
                    nn80Var.u.b.c((l3d0) x0u0Var);
                } else if (x0u0Var instanceof w170) {
                    nn80Var.q.b.c((w170) x0u0Var);
                } else if (x0u0Var instanceof mbu) {
                    nn80Var.o.b.c((mbu) x0u0Var);
                } else if (x0u0Var instanceof w3e0) {
                    nn80Var.v.b.c((w3e0) x0u0Var);
                } else if (x0u0Var instanceof PlayPauseButtonViewState) {
                    nn80Var.s.b.c((PlayPauseButtonViewState) x0u0Var);
                } else if (x0u0Var instanceof zfk0) {
                    nn80Var.B.b.c((zfk0) x0u0Var);
                } else if (x0u0Var instanceof alp) {
                    nn80Var.g.b.c((alp) x0u0Var);
                } else if (x0u0Var instanceof ixp) {
                    nn80Var.h.v.c((ixp) x0u0Var);
                } else if (x0u0Var instanceof cmq) {
                    nn80Var.j.b.c((cmq) x0u0Var);
                } else if (x0u0Var instanceof ilk) {
                    nn80Var.f.d.c((ilk) x0u0Var);
                } else if (x0u0Var instanceof u3i0) {
                    simpleControlsView.V4((u3i0) x0u0Var);
                } else if (x0u0Var instanceof w6y0) {
                    nn80Var.E.b.c((w6y0) x0u0Var);
                } else if (x0u0Var instanceof wlq) {
                    nn80Var.i.d.c((wlq) x0u0Var);
                } else if (!(x0u0Var instanceof p0a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        long b2 = jvo0.a.b(b);
        simpleControlsView.t.getClass();
        if (!z && !(o10Var instanceof o10.b)) {
            throw new NoWhenBranchMatchedException();
        }
        zno.m(b2);
    }
}
