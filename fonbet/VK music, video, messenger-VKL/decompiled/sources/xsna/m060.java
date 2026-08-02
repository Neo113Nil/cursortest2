package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import xsna.fss;
import xsna.hss;
import xsna.jav;

/* compiled from: NegativeActionHandler.kt */
/* loaded from: classes16.dex */
public final class m060 implements lss<fss.c> {
    public final String a;
    public final boolean b;
    public final rfz c;
    public final g2r0 d;
    public final sgg e;
    public final t7k0 f;
    public final kss g;
    public final nts h;
    public final io.reactivex.rxjava3.disposables.b i;

    public m060(String str, boolean z, rfz rfzVar, g2r0 g2r0Var, sgg sggVar, t7k0 t7k0Var, kss kssVar, nts ntsVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = str;
        this.b = z;
        this.c = rfzVar;
        this.d = g2r0Var;
        this.e = sggVar;
        this.f = t7k0Var;
        this.g = kssVar;
        this.h = ntsVar;
        this.i = bVar;
    }

    @Override // xsna.lss
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(fss.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe;
        hss hssVar = cVar.b;
        final RequestUserProfile requestUserProfile = cVar.a;
        c(requestUserProfile, true);
        if (requestUserProfile.n0) {
            subscribe = new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(yfb.x(nts.e(this.h, requestUserProfile.c, this.a, requestUserProfile.t0, requestUserProfile.J, 2)), null, null, 3), new l060(0, this, requestUserProfile)).subscribe(new afs(new jl6(this, requestUserProfile, hssVar, 6), 12));
        } else if (hssVar instanceof hss.c) {
            UserId userId = requestUserProfile.c;
            String str = this.a;
            subscribe = new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(yfb.x(this.h.q(userId, requestUserProfile.J, str)), null, null, 3), new k060(this, requestUserProfile)).subscribe(new hms(new z63(this, requestUserProfile, hssVar, 8), 15));
        } else {
            subscribe = new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(yfb.x(nts.g(this.h, requestUserProfile.c, requestUserProfile.t0, requestUserProfile.J, this.a, null, 16)), null, null, 3), new io.reactivex.rxjava3.functions.a() { // from class: xsna.j060
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    m060.this.c(requestUserProfile, false);
                }
            }).subscribe(new sh6(new ma(21, this, requestUserProfile), 26));
        }
        this.i.b(subscribe);
    }

    public final void c(RequestUserProfile requestUserProfile, boolean z) {
        this.c.a(ne7.s(requestUserProfile), z ? new jav.b(3) : jav.c.a, new oe6(z, 1));
    }
}
