package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.masstransit.sdk.ble.impl.ble.f;
import com.yandex.go.masstransit.sdk.ble.impl.repository.b;
import ru.yandex.taxi.masstransit.geopayment.adapter.a;
import ru.yandex.taxi.masstransit.geopayment.domain.c;
import ru.yandex.taxi.masstransit.geopayment.modal.e;
import ru.yandex.taxi.masstransit.geopayment.repository.d;

/* loaded from: classes6.dex */
public final class bl30 {
    public final Context a;
    public final Lifecycle b;
    public final h410 c;
    public final a d;
    public final z26 e;
    public final j26 f;
    public final t16 g;
    public final ek30 h;
    public final p310 i;
    public final u310 j;
    public final u16 k;
    public final sr4 l;
    public final pm5 m;
    public final d411 n;
    public final w030 o;
    public final com.yandex.go.network.connectivity.a p;
    public final fl10 q;
    public final i3y r;
    public final i3y s;

    public bl30(Context context, Lifecycle lifecycle, h410 h410Var, a aVar, z26 z26Var, j26 j26Var, t16 t16Var, ek30 ek30Var, p310 p310Var, u310 u310Var, u16 u16Var, sr4 sr4Var, pm5 pm5Var, d411 d411Var, w030 w030Var, com.yandex.go.network.connectivity.a aVar2) {
        this.a = context;
        this.b = lifecycle;
        this.c = h410Var;
        this.d = aVar;
        this.e = z26Var;
        this.f = j26Var;
        this.g = t16Var;
        this.h = ek30Var;
        this.i = p310Var;
        this.j = u310Var;
        this.k = u16Var;
        this.l = sr4Var;
        this.m = pm5Var;
        this.n = d411Var;
        this.o = w030Var;
        this.p = aVar2;
        fl10 fl10Var = new fl10();
        fl10Var.a = this.p.c();
        this.q = fl10Var;
        final int i = 0;
        this.r = kotlin.a.a(new sls(this) { // from class: al30
            public final /* synthetic */ bl30 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                bl30 bl30Var = this.b;
                switch (i2) {
                    case 0:
                        h410 h410Var2 = bl30Var.c;
                        Context context2 = bl30Var.a;
                        w030 w030Var2 = bl30Var.o;
                        a aVar3 = bl30Var.d;
                        z26 z26Var2 = bl30Var.e;
                        Lifecycle lifecycle2 = bl30Var.b;
                        j26 j26Var2 = bl30Var.f;
                        t16 t16Var2 = bl30Var.g;
                        ek30 ek30Var2 = bl30Var.h;
                        u16 u16Var2 = bl30Var.k;
                        sr4 sr4Var2 = bl30Var.l;
                        pm5 pm5Var2 = bl30Var.m;
                        d411 d411Var2 = bl30Var.n;
                        fl10 fl10Var2 = bl30Var.q;
                        a9d.a.getClass();
                        androidx.compose.runtime.internal.a aVar4 = a9d.b;
                        hhw hhwVar = h410Var2.a;
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        xk30 xk30Var = new xk30();
                        return new e(context2, w030Var2, new s14(xk30Var, new ol30(), new fl10(aVar3), new c(new d((on2) hhwVar.d, new com.yandex.go.masstransit.sdk.ble.impl.ble.c(mdhVar, t16Var2, new y26(aVar3)), new f(mdhVar, t16Var2, new y26(aVar3)), mdhVar, j26Var2, xk30Var, d411Var2), (ru.yandex.taxi.widget.c) hhwVar.n), new nw8((zuj0) hhwVar.m), new xl10(t16Var2), aVar3, z26Var2, ek30Var2, u16Var2, sr4Var2, pm5Var2, j26Var2, fl10Var2, mdhVar), lifecycle2, aVar4);
                    default:
                        h410 h410Var3 = bl30Var.c;
                        Context context3 = bl30Var.a;
                        w030 w030Var3 = bl30Var.o;
                        a aVar5 = bl30Var.d;
                        z26 z26Var3 = bl30Var.e;
                        Lifecycle lifecycle3 = bl30Var.b;
                        j26 j26Var3 = bl30Var.f;
                        t16 t16Var3 = bl30Var.g;
                        p310 p310Var2 = bl30Var.i;
                        u310 u310Var2 = bl30Var.j;
                        u16 u16Var3 = bl30Var.k;
                        sr4 sr4Var3 = bl30Var.l;
                        pm5 pm5Var3 = bl30Var.m;
                        fl10 fl10Var3 = bl30Var.q;
                        hhw hhwVar2 = ((w16) h410Var3.e.getValue()).a;
                        sjh sjhVar2 = uyj.a;
                        mdh mdhVar2 = mdh.b;
                        xl10 xl10Var = new xl10(t16Var3);
                        f fVar = new f(mdhVar2, t16Var3, new y26(aVar5));
                        yk30 yk30Var = new yk30();
                        pl30 pl30Var = new pl30();
                        xl10 xl10Var2 = new xl10(aVar5);
                        com.yandex.go.masstransit.sdk.ble.impl.domain.a aVar6 = new com.yandex.go.masstransit.sdk.ble.impl.domain.a(new b(new com.yandex.go.masstransit.sdk.client_api.a((on2) hhwVar2.d, mdhVar2), (on2) hhwVar2.d, fVar, j26Var3, yk30Var, u310Var2, p310Var2));
                        return new com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d(context3, w030Var3, new st0(pl30Var, xl10Var2, aVar6, new i47((zuj0) hhwVar2.m, 3), xl10Var, aVar5, z26Var3, u16Var3, pm5Var3, fl10Var3, mdhVar2), lifecycle3, new xrr(aVar6, pl30Var, z26Var3, p310Var2, yk30Var, sr4Var3), new b36(p310Var2));
                }
            }
        });
        final int i2 = 1;
        this.s = kotlin.a.a(new sls(this) { // from class: al30
            public final /* synthetic */ bl30 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                bl30 bl30Var = this.b;
                switch (i22) {
                    case 0:
                        h410 h410Var2 = bl30Var.c;
                        Context context2 = bl30Var.a;
                        w030 w030Var2 = bl30Var.o;
                        a aVar3 = bl30Var.d;
                        z26 z26Var2 = bl30Var.e;
                        Lifecycle lifecycle2 = bl30Var.b;
                        j26 j26Var2 = bl30Var.f;
                        t16 t16Var2 = bl30Var.g;
                        ek30 ek30Var2 = bl30Var.h;
                        u16 u16Var2 = bl30Var.k;
                        sr4 sr4Var2 = bl30Var.l;
                        pm5 pm5Var2 = bl30Var.m;
                        d411 d411Var2 = bl30Var.n;
                        fl10 fl10Var2 = bl30Var.q;
                        a9d.a.getClass();
                        androidx.compose.runtime.internal.a aVar4 = a9d.b;
                        hhw hhwVar = h410Var2.a;
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        xk30 xk30Var = new xk30();
                        return new e(context2, w030Var2, new s14(xk30Var, new ol30(), new fl10(aVar3), new c(new d((on2) hhwVar.d, new com.yandex.go.masstransit.sdk.ble.impl.ble.c(mdhVar, t16Var2, new y26(aVar3)), new f(mdhVar, t16Var2, new y26(aVar3)), mdhVar, j26Var2, xk30Var, d411Var2), (ru.yandex.taxi.widget.c) hhwVar.n), new nw8((zuj0) hhwVar.m), new xl10(t16Var2), aVar3, z26Var2, ek30Var2, u16Var2, sr4Var2, pm5Var2, j26Var2, fl10Var2, mdhVar), lifecycle2, aVar4);
                    default:
                        h410 h410Var3 = bl30Var.c;
                        Context context3 = bl30Var.a;
                        w030 w030Var3 = bl30Var.o;
                        a aVar5 = bl30Var.d;
                        z26 z26Var3 = bl30Var.e;
                        Lifecycle lifecycle3 = bl30Var.b;
                        j26 j26Var3 = bl30Var.f;
                        t16 t16Var3 = bl30Var.g;
                        p310 p310Var2 = bl30Var.i;
                        u310 u310Var2 = bl30Var.j;
                        u16 u16Var3 = bl30Var.k;
                        sr4 sr4Var3 = bl30Var.l;
                        pm5 pm5Var3 = bl30Var.m;
                        fl10 fl10Var3 = bl30Var.q;
                        hhw hhwVar2 = ((w16) h410Var3.e.getValue()).a;
                        sjh sjhVar2 = uyj.a;
                        mdh mdhVar2 = mdh.b;
                        xl10 xl10Var = new xl10(t16Var3);
                        f fVar = new f(mdhVar2, t16Var3, new y26(aVar5));
                        yk30 yk30Var = new yk30();
                        pl30 pl30Var = new pl30();
                        xl10 xl10Var2 = new xl10(aVar5);
                        com.yandex.go.masstransit.sdk.ble.impl.domain.a aVar6 = new com.yandex.go.masstransit.sdk.ble.impl.domain.a(new b(new com.yandex.go.masstransit.sdk.client_api.a((on2) hhwVar2.d, mdhVar2), (on2) hhwVar2.d, fVar, j26Var3, yk30Var, u310Var2, p310Var2));
                        return new com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d(context3, w030Var3, new st0(pl30Var, xl10Var2, aVar6, new i47((zuj0) hhwVar2.m, 3), xl10Var, aVar5, z26Var3, u16Var3, pm5Var3, fl10Var3, mdhVar2), lifecycle3, new xrr(aVar6, pl30Var, z26Var3, p310Var2, yk30Var, sr4Var3), new b36(p310Var2));
                }
            }
        });
    }
}
