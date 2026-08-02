package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.newsfeed.common.recycler.holders.clips.SingleClipV2Holder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.ShitAttachment;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.qi6;
import xsna.tps0;

/* compiled from: ShittyClipHolder.kt */
/* loaded from: classes4.dex */
public final class aej0 extends rp6<efd, ShitAttachment> implements ent0, i7o, cui, a1n, t0n, qfd {
    public static final a L;
    public static final /* synthetic */ qcy<Object>[] M;
    public final wvn E;
    public final pgn F;
    public final zmk G;
    public final bej0 H;
    public final cfd I;
    public final View J;
    public boolean K;

    /* compiled from: ShittyClipHolder.kt */
    public static final class a {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(aej0.class, "videoPreviewColorExtractDisposable", "getVideoPreviewColorExtractDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        M = new qcy[]{mutablePropertyReference1Impl};
        L = new a();
    }

    public aej0(ViewGroup viewGroup, wvn wvnVar, h170 h170Var) {
        super(new FrameLayout(viewGroup.getContext()), viewGroup);
        this.E = wvnVar;
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        this.F = new pgn();
        com.vk.toggle.data.a a2 = h170Var.a();
        zmk zmkVar = (a2 == null || a2.c == null) ? null : new zmk();
        this.G = zmkVar;
        bej0 bej0Var = new bej0(frameLayout.getContext(), g620.f().a(), g620.f().e0());
        this.H = bej0Var;
        cfd cfdVar = new cfd(frameLayout, bej0Var, new tps0.b(Float.valueOf(0.75f), true), zmkVar, h170Var, 48);
        this.I = cfdVar;
        viewGroup.getContext();
        this.J = cfdVar.itemView.findViewById(R.id.video_sound_control);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(cfdVar.itemView);
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        View view = this.J;
        f4m.m(8388661, view);
        view.post(new io.reactivex.rxjava3.android.a(this, 13));
        StringBuilder sb = new StringBuilder();
        cfd cfdVar = this.I;
        sb.append(cfdVar.W.getContentDescription());
        sb.append(".");
        sb.append(di60.m(disclaimerData, this.itemView.getContext()));
        cfdVar.W.setContentDescription(sb.toString());
    }

    @Override // xsna.qfd
    public final View F1() {
        return this.I.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qi6
    public final void I6() {
        if (((ShitAttachment) q6()) != null) {
            this.E.remove();
        }
        super.I6();
        qcy<Object> qcyVar = M[0];
        this.F.b(null);
        this.H.e = null;
    }

    @Override // xsna.qfd
    public final boolean J5() {
        return this.I.K7();
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.I.Q6(s6oVar);
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.I.W;
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(efd efdVar) {
    }

    @Override // xsna.a1n
    public final void U5() {
        this.K = true;
    }

    @Override // xsna.rp6
    public final void U6(ShitAttachment shitAttachment) {
        io.reactivex.rxjava3.subjects.f<Integer> fVar;
        ShitAttachment shitAttachment2 = shitAttachment;
        super.U6(shitAttachment2);
        u1c0 J0 = J0();
        if (J0 == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = null;
        this.I.J7(J0, false, null);
        zmk zmkVar = this.G;
        if (zmkVar != null && (fVar = zmkVar.d) != null) {
            cVar = fVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new w250(new aq1(22, this, shitAttachment2), 16), new n3t(new bi6(com.vk.metrics.eventtracking.b.a, 10), 22));
        }
        qcy<Object> qcyVar = M[0];
        this.F.b(cVar);
        this.K = false;
        View view = this.J;
        f4m.t(0, view);
        f4m.m(8388693, view);
    }

    @Override // xsna.qfd
    public final String W0() {
        return this.I.W0();
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        this.H.e = u1c0Var;
    }

    @Override // xsna.rp6, xsna.qi6
    public final void b6(u1c0 u1c0Var, Object obj) {
        if ((obj instanceof Iterable ? j5g.Z((Iterable) obj) : obj) == SingleClipV2Holder.BindConfig.HEADER) {
            super.b6(u1c0Var, obj);
        } else {
            a6(u1c0Var);
        }
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.K;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.I.L;
    }

    @Override // xsna.cui
    public final void q5(s980 s980Var, qi6.b bVar) {
        cfd cfdVar = this.I;
        cfdVar.y = s980Var;
        if (s980Var != null) {
            cfdVar.D = s980Var;
        }
        cfdVar.A = bVar;
    }
}
