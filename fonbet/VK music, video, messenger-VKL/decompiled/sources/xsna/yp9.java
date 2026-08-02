package xsna;

import com.vk.dto.user.RequestUserProfile;
import xsna.fss;
import xsna.jav;

/* compiled from: CancelPositiveActionHandler.kt */
/* loaded from: classes16.dex */
public final class yp9 implements lss<fss.a> {
    public final String a;
    public final rfz b;
    public final sgg c;
    public final g2r0 d;
    public final nts e;
    public final s1r0 f;
    public final io.reactivex.rxjava3.disposables.b g;
    public final kss h;

    public yp9(String str, rfz rfzVar, sgg sggVar, g2r0 g2r0Var, nts ntsVar, s1r0 s1r0Var, io.reactivex.rxjava3.disposables.b bVar, kss kssVar) {
        this.a = str;
        this.b = rfzVar;
        this.c = sggVar;
        this.d = g2r0Var;
        this.e = ntsVar;
        this.f = s1r0Var;
        this.g = bVar;
        this.h = kssVar;
    }

    @Override // xsna.lss
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(fss.a aVar) {
        RequestUserProfile requestUserProfile = aVar.a;
        this.b.a(ne7.s(requestUserProfile), new jav.b(5), new p60(7));
        this.g.b(new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.T(yfb.x(nts.g(this.e, requestUserProfile.c, requestUserProfile.t0, requestUserProfile.J, this.a, null, 16))).L(new dg1(new qd1(5, this, requestUserProfile), 7), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new xp9(this, requestUserProfile, 0)).subscribe(new qz(new td0(5, requestUserProfile, this), 6), new bf2(new h5(this, 17), 6)));
    }
}
