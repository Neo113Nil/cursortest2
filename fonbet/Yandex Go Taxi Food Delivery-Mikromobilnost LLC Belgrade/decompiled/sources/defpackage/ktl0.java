package defpackage;

import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.j;

/* loaded from: classes13.dex */
public final class ktl0 extends p95 {
    public final pgk0 A;
    public final j x;
    public final a y;
    public final hrl0 z;

    public ktl0(j jVar, a aVar, hrl0 hrl0Var, pgk0 pgk0Var) {
        super(jtl0.class);
        this.x = jVar;
        this.y = aVar;
        this.z = hrl0Var;
        this.A = pgk0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        super.Bg((jtl0) l050Var);
        this.z.c(new hxj0(18, this), false);
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        ((aul0) this.A.b).r(new qu(9));
    }
}
