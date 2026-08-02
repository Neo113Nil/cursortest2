package defpackage;

import com.yandex.plus.pay.internal.di.b;
import com.yandex.plus.pay.internal.di.c;
import defpackage.ct90;
import defpackage.ead0;
import defpackage.fad0;
import defpackage.qje;
import defpackage.ueo;
import java.util.List;
import kotlin.a;

/* loaded from: classes8.dex */
public final class fad0 {
    public final b a;
    public final sls b;
    public final i3y c;
    public final i3y d;
    public final ndd0 e;
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public final i3y i;
    public final i3y j;
    public final i3y k;
    public final i3y l;
    public final i3y m;
    public final i3y n;

    public fad0(b bVar, String str, String str2, final sls slsVar, final sls slsVar2, sls slsVar3) {
        this.a = bVar;
        this.b = slsVar3;
        int i = 2;
        this.c = a.a(new c(i, this));
        i3y a = a.a(new ead0(this, 1));
        this.d = a;
        ped0 ped0Var = (ped0) a.getValue();
        List h = scc.h(null);
        i3y i3yVar = skd0.a;
        this.e = new ndd0(ped0Var, h, skd0.d());
        this.f = a.a(new sls() { // from class: com.yandex.plus.pay.internal.di.a
            @Override // defpackage.sls
            public final Object invoke() {
                fad0 fad0Var = fad0.this;
                b bVar2 = fad0Var.a;
                return new ct90(bVar2.c(), bVar2.f, bVar2.a, new ead0(fad0Var, 0), new ueo(2, slsVar2), bVar2.t.h, slsVar, bVar2.p, bVar2.e, new ead0(fad0Var, 8), new ead0(fad0Var, 9), new ead0(fad0Var, 10), new PlusPayAnalyticsModule$diagnosticGlobalParamsProvider$2$6(0, bVar2.g, qje.class, "isStoreBuild", "isStoreBuild(Landroid/content/Context;)Z", 1));
            }
        });
        this.g = a.a(new in2(17, this, slsVar, slsVar2));
        this.h = a.a(new ead0(this, i));
        this.i = a.a(new ead0(this, 3));
        this.j = a.a(new ead0(this, 4));
        this.k = a.a(new ead0(this, 5));
        this.l = a.a(new ead0(this, 6));
        this.m = a.a(new ead0(this, 7));
        this.n = a.a(new l2z(str, str2, this));
    }
}
