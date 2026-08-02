package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GetStoriesResponse;
import java.util.Collections;

/* compiled from: StoriesLoadInteractorImpl.kt */
/* loaded from: classes11.dex */
public final class qtl0 implements otl0 {
    public final lul0 a;
    public final lrl0 b;
    public final qpl0 c;
    public final rul0 d;
    public final gul0 e;
    public final ysg0<asl0> f;

    public qtl0(lul0 lul0Var, lrl0 lrl0Var, qpl0 qpl0Var, rul0 rul0Var, gul0 gul0Var, ysg0 ysg0Var) {
        this.a = lul0Var;
        this.b = lrl0Var;
        this.c = qpl0Var;
        this.d = rul0Var;
        this.e = gul0Var;
        this.f = ysg0Var;
    }

    @Override // xsna.otl0
    public final void a() {
        this.b.d().subscribe(new skz(new aj50(this, 28), 29));
    }

    @Override // xsna.otl0
    public final io.reactivex.rxjava3.core.x<GetStoriesResponse> b(String str, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(this.a.a(true, str, null, null), new eiy(new lnq(z, this, 1), 18)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new rkz(new d0w(this, 29), 25));
    }

    @Override // xsna.otl0
    public final io.reactivex.rxjava3.core.x d(UserId userId, UserId userId2, boolean z) {
        return this.a.a(z, null, userId, userId2);
    }

    @Override // xsna.otl0
    public final io.reactivex.rxjava3.core.x<GetStoriesResponse> f(String str, boolean z, boolean z2) {
        return rsg0.w0(yfb.x(zul0.b(this.a.a, Collections.singletonList(str), isl0.a(), Boolean.valueOf(z), 16))).l(new xx40(new xsq(27), 10));
    }

    @Override // xsna.otl0
    public final io.reactivex.rxjava3.core.x g(UserId userId) {
        return otl0.e(this, userId, null, 11).l(new rf3(new tdk0(2), 28)).l(new l340(new ptl0(new d220(17), 0), 14)).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final void h(GetStoriesResponse getStoriesResponse, boolean z) {
        this.b.b(this.e.a(getStoriesResponse.c, null, true, true), z);
    }
}
