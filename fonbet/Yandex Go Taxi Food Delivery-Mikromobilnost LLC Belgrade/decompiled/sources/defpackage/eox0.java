package defpackage;

import com.yandex.go.order.tariffs_suggest.router.a;

/* loaded from: classes14.dex */
public final class eox0 implements ir70 {
    public final /* synthetic */ a a;
    public final /* synthetic */ fox0 b;

    public eox0(a aVar, fox0 fox0Var) {
        this.a = aVar;
        this.b = fox0Var;
    }

    @Override // defpackage.ir70
    public final void L0() {
        this.a.r(new bkx0(13));
    }

    @Override // defpackage.ir70
    public final void N() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.ir70
    public final void r() {
        a aVar = this.a;
        epz epzVar = aVar.F;
        String str = this.b.a;
        epzVar.a.p(epzVar.a.i("pref_usage_count".concat(str), 0) + 1, "pref_usage_count".concat(str));
        aVar.r(new bkx0(12));
    }
}
