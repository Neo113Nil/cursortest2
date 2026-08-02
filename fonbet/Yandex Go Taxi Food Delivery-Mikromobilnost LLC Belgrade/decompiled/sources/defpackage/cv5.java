package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.navigator.domain.u;
import com.yandex.go.navigator.ui.b;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.impl.bind.a;
import ru.yandex.taxi.masstransit.domain.h;
import ru.yandex.taxi.masstransit.trains.schedule.e;

/* loaded from: classes12.dex */
public final class cv5 implements v7p {
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final n3w m;
    public final xvf0 n;
    public final xvf0 o;

    public cv5(bv5 bv5Var, n3w n3wVar, n3w n3wVar2, n3w n3wVar3, n3w n3wVar4, n3w n3wVar5, n3w n3wVar6, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, n3w n3wVar7, n3w n3wVar8, xvf0 xvf0Var6) {
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = n3wVar3;
        this.e = n3wVar4;
        this.f = n3wVar5;
        this.g = n3wVar6;
        this.h = xvf0Var;
        this.i = xvf0Var2;
        this.j = xvf0Var3;
        this.k = xvf0Var4;
        this.l = xvf0Var5;
        this.n = n3wVar7;
        this.m = n3wVar8;
        this.o = xvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.j;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.f;
        n3w n3wVar = this.m;
        xvf0 xvf0Var6 = this.o;
        xvf0 xvf0Var7 = this.n;
        xvf0 xvf0Var8 = this.l;
        xvf0 xvf0Var9 = this.k;
        xvf0 xvf0Var10 = this.e;
        xvf0 xvf0Var11 = this.d;
        xvf0 xvf0Var12 = this.c;
        xvf0 xvf0Var13 = this.b;
        switch (i) {
            case 0:
                Payer payer = (Payer) xvf0Var13.get();
                Merchant merchant = (Merchant) xvf0Var12.get();
                String str = (String) xvf0Var11.get();
                int intValue = ((Integer) xvf0Var10.get()).intValue();
                boolean booleanValue = ((Boolean) xvf0Var5.get()).booleanValue();
                String str2 = (String) xvf0Var4.get();
                pgb pgbVar = (pgb) xvf0Var3.get();
                return new bx5(znb1.h(payer), new ag1(merchant.getServiceToken(), 6), new qdh(), (a) xvf0Var2.get(), (knz0) xvf0Var.get(), (qs20) xvf0Var9.get(), (nhj) xvf0Var8.get(), str, str2, intValue, booleanValue, (rwo) xvf0Var7.get(), (y22) n3wVar.a, new tt4(29), pgbVar, new zu5((pcy) xvf0Var6.get(), 0));
            case 1:
                return new e((Context) xvf0Var13.get(), (w030) xvf0Var12.get(), (pg40) xvf0Var11.get(), (og40) xvf0Var10.get(), this.f, this.g, this.h, this.i, this.j, (xf40) xvf0Var9.get(), (cg40) xvf0Var8.get(), (hg40) n3wVar.a, i5m.a(xvf0Var7), (h) xvf0Var6.get());
            default:
                return new b((Activity) xvf0Var13.get(), (ah00) xvf0Var12.get(), (dd50) xvf0Var11.get(), (u) xvf0Var10.get(), (rz8) xvf0Var5.get(), (l56) xvf0Var4.get(), (cyx) xvf0Var3.get(), (spe0) xvf0Var2.get(), (ng50) xvf0Var.get(), (wb50) xvf0Var9.get(), (sb50) xvf0Var8.get(), (hiq0) xvf0Var7.get(), (fif) xvf0Var6.get(), (x94) n3wVar.a);
        }
    }

    public cv5(h4g h4gVar, k4g k4gVar, pp0 pp0Var, xvf0 xvf0Var, h4g h4gVar2, h4g h4gVar3, k4g k4gVar2, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, k4g k4gVar3, xvf0 xvf0Var5, h4g h4gVar4, n3w n3wVar) {
        this.b = h4gVar;
        this.c = k4gVar;
        this.d = pp0Var;
        this.e = xvf0Var;
        this.f = h4gVar2;
        this.g = h4gVar3;
        this.h = k4gVar2;
        this.i = xvf0Var2;
        this.j = xvf0Var3;
        this.k = xvf0Var4;
        this.l = k4gVar3;
        this.n = xvf0Var5;
        this.o = h4gVar4;
        this.m = n3wVar;
    }

    public cv5(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, n3w n3wVar, xvf0 xvf0Var12, xvf0 xvf0Var13) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = n3wVar;
        this.n = xvf0Var12;
        this.o = xvf0Var13;
    }
}
