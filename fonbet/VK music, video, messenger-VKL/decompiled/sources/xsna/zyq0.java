package xsna;

import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import java.util.List;
import java.util.Set;

/* compiled from: UserRecomThemesInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class zyq0 implements xyq0 {
    public final czq0 a;
    public final azq0 b;
    public final b25 c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    public zyq0(czq0 czq0Var, azq0 azq0Var, b25 b25Var) {
        this.a = czq0Var;
        this.b = azq0Var;
        this.c = b25Var;
    }

    @Override // xsna.xyq0
    public final io.reactivex.rxjava3.core.x<String> a() {
        return io.reactivex.rxjava3.core.x.k(this.c.o().c);
    }

    @Override // xsna.xyq0
    public final void b(String str) {
        this.b.a.b(str);
    }

    @Override // xsna.xyq0
    public final io.reactivex.rxjava3.core.x c() {
        io.reactivex.rxjava3.internal.operators.observable.f0 w0 = rsg0.w0(yfb.x(((daf0) this.a.a.getValue()).a(null)));
        asu0 asu0Var = asu0.a;
        return new io.reactivex.rxjava3.internal.operators.single.o(w0.q(asu0Var.c()).m(asu0Var.d()), new hdi0(new ehm0(this, 6), 4)).l(new f0j0(new wo40(21), 4)).l(new xw70(new t6c0(11), 11));
    }

    @Override // xsna.xyq0
    public final io.reactivex.rxjava3.core.x<RecomSettingsGetAvailableRecomThemesResponseDto> d() {
        return rsg0.w0(yfb.x(((daf0) this.a.a.getValue()).d()));
    }

    @Override // xsna.xyq0
    public final Set<Integer> e() {
        return j5g.S0(this.b.a.c());
    }

    @Override // xsna.xyq0
    public final void f(Set<String> set) {
        this.b.a.f(set);
    }

    @Override // xsna.xyq0
    public final io.reactivex.rxjava3.core.x<Boolean> g(String str) {
        List A = rli0.A(rli0.o(new i5g(this.b.a.e()), new tdk0(4)));
        io.reactivex.rxjava3.internal.operators.single.y l = rsg0.w0(yfb.x(((daf0) this.a.a.getValue()).c(str, A))).l(new oe40(new j6e0(15), 14));
        asu0 asu0Var = asu0.a;
        return new io.reactivex.rxjava3.internal.operators.single.o(l.q(asu0Var.c()).m(asu0Var.d()), new wvq0(new yyq0(0, this, A), 1));
    }

    @Override // xsna.xyq0
    public final void h() {
        this.b.a.g(true);
    }

    @Override // xsna.xyq0
    public final void i() {
        io.reactivex.rxjava3.internal.operators.single.y l = rsg0.w0(yfb.x(((daf0) this.a.a.getValue()).b())).l(new i4f0(new lcq0(1), 6));
        asu0 asu0Var = asu0.a;
        this.d.b(l.q(asu0Var.c()).m(asu0Var.d()).subscribe());
    }

    @Override // xsna.xyq0
    public final void j() {
        this.b.a.d(false);
    }
}
