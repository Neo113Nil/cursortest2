package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import xsna.fss;
import xsna.jav;

/* compiled from: PositiveActionHandler.kt */
/* loaded from: classes16.dex */
public final class uzb0 implements lss<fss.d> {
    public final String a;
    public final boolean b;
    public final rfz c;
    public final sgg d;
    public final g2r0 e;
    public final t7k0 f;
    public final kss g;
    public final nts h;
    public final s1r0 i;
    public final io.reactivex.rxjava3.disposables.b j;
    public boolean k;

    public uzb0(String str, boolean z, rfz rfzVar, sgg sggVar, g2r0 g2r0Var, t7k0 t7k0Var, kss kssVar, nts ntsVar, s1r0 s1r0Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = str;
        this.b = z;
        this.c = rfzVar;
        this.d = sggVar;
        this.e = g2r0Var;
        this.f = t7k0Var;
        this.g = kssVar;
        this.h = ntsVar;
        this.i = s1r0Var;
        this.j = bVar;
    }

    @Override // xsna.lss
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(fss.d dVar) {
        RequestUserProfile requestUserProfile = dVar.a;
        if (requestUserProfile.v == 3) {
            return;
        }
        this.c.a(ne7.s(requestUserProfile), new jav.b(6), new v4v(25));
        UserId userId = requestUserProfile.c;
        UserId userId2 = (userId == null || userId.b <= 0) ? null : userId;
        this.j.b(new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.T(yfb.x(nts.d(this.h, userId2, null, null, this.a, null, requestUserProfile.J, requestUserProfile.t0, 22))).L(new l340(new v74(25, this, requestUserProfile), 6), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new osm(1, this, requestUserProfile)).subscribe(new uu60(new ab6(this, requestUserProfile, dVar, 10), 7), new jw80(new qw30(this, 18), 5)));
    }
}
