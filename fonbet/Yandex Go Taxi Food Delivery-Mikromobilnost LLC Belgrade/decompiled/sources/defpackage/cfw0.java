package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import com.yandex.go.suggest.impl.data.a;
import com.yandex.go.suggest.impl.data.flex.document.c;
import com.yandex.go.suggest.impl.data.flex.document.d;
import com.yandex.passport.data.network.core.o;
import com.yandex.passport.data.network.e9;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.core.accounts.r;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.report.reporters.t;
import com.yandex.passport.internal.report.reporters.y0;
import com.yandex.passport.internal.storage.i;
import com.yandex.passport.internal.usecase.authorize.j;
import com.yandex.passport.internal.usecase.n;
import com.yandex.passport.internal.usecase.n1;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes8.dex */
public final class cfw0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final Object c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;
    public final yvf0 k;

    public cfw0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, xvf0 xvf0Var, e9 e9Var) {
        this.a = 4;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.f = yvf0Var4;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = yvf0Var7;
        this.j = yvf0Var8;
        this.b = xvf0Var;
        this.k = e9Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        yvf0 yvf0Var = this.k;
        yvf0 yvf0Var2 = this.j;
        yvf0 yvf0Var3 = this.i;
        yvf0 yvf0Var4 = this.h;
        yvf0 yvf0Var5 = this.g;
        yvf0 yvf0Var6 = this.f;
        yvf0 yvf0Var7 = this.e;
        yvf0 yvf0Var8 = this.d;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new c((gfw0) xvf0Var.get(), (ogw0) ((n3w) yvf0Var6).a, (a) ((xvf0) obj).get(), (u7r) ((p9p) yvf0Var4).get(), (w4l0) ((oag) yvf0Var3).get(), (ajr) ((oag) yvf0Var2).get(), (dfw0) ((xvf0) yvf0Var8).get(), (d) ((umt0) yvf0Var).get(), (swp0) ((xvf0) yvf0Var7).get(), (f8v0) ((n3w) yvf0Var5).a);
            case 1:
                return new ru.yandex.taxi.masstransit.paymentcards.d((Context) xvf0Var.get(), (e) ((xvf0) obj).get(), (ru.yandex.taxi.widget.c) ((xvf0) yvf0Var8).get(), (pdc) ((xvf0) yvf0Var7).get(), (g610) ((sp00) yvf0Var6).get(), (pwy0) ((xvf0) yvf0Var5).get(), (com.yandex.go.payments.transport.domain.a) ((xvf0) yvf0Var4).get(), (lz30) ((xvf0) yvf0Var3).get(), (bia0) ((xvf0) yvf0Var2).get(), (tt2) ((xvf0) yvf0Var).get());
            case 2:
                Context context = (Context) xvf0Var.get();
                ah00 ah00Var = (ah00) ((xvf0) yvf0Var8).get();
                ru.yandex.taxi.layers.e eVar = (ru.yandex.taxi.layers.e) ((xvf0) yvf0Var7).get();
                ney neyVar = (ney) ((xvf0) yvf0Var6).get();
                tyx tyxVar = (tyx) ((xvf0) yvf0Var5).get();
                no21 no21Var = (no21) ((xvf0) yvf0Var4).get();
                return new z541(context, ah00Var, eVar, neyVar, tyxVar, no21Var, (j741) ((y0y0) yvf0Var2).get(), (vgf) ((xvf0) yvf0Var).get());
            case 3:
                return new com.yandex.go.taxi_order.ws.d((nq20) xvf0Var.get(), (wnt) ((xvf0) obj).get(), (te51) ((xvf0) yvf0Var8).get(), (bk41) ((xvf0) yvf0Var7).get(), (g) ((xvf0) yvf0Var6).get(), (ru.yandex.taxi.am.token.a) ((xvf0) yvf0Var5).get(), i5m.a((ei00) yvf0Var4), (tse) ((xvf0) yvf0Var3).get(), (tt2) ((xvf0) yvf0Var2).get(), (ge51) ((xvf0) yvf0Var).get());
            case 4:
                return new com.yandex.passport.internal.account.c((com.yandex.passport.internal.network.client.c) ((yvf0) obj).get(), (com.yandex.passport.internal.core.accounts.e) yvf0Var8.get(), (p) yvf0Var7.get(), (DatabaseHelper) yvf0Var6.get(), (b1) yvf0Var5.get(), (com.yandex.passport.internal.network.a) yvf0Var4.get(), (j) yvf0Var3.get(), (com.yandex.passport.internal.usecase.p) yvf0Var2.get(), (n1) xvf0Var.get(), (n) ((e9) yvf0Var).get());
            default:
                Context context2 = (Context) yvf0Var8.get();
                r rVar = (r) yvf0Var7.get();
                c0 c0Var = (c0) yvf0Var6.get();
                y0 y0Var = (y0) yvf0Var5.get();
                i iVar = (i) yvf0Var4.get();
                com.yandex.passport.common.a aVar = (com.yandex.passport.common.a) yvf0Var3.get();
                o oVar = (o) yvf0Var2.get();
                DatabaseHelper databaseHelper = (DatabaseHelper) yvf0Var.get();
                t tVar = (t) xvf0Var.get();
                ((com.yandex.passport.internal.di.module.n) obj).getClass();
                return new com.yandex.passport.internal.core.accounts.j(AccountManager.get(context2), rVar, context2, c0Var, y0Var, iVar, aVar, oVar, databaseHelper, tVar);
        }
    }

    public /* synthetic */ cfw0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, int i) {
        this.a = i;
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
    }

    public cfw0(com.yandex.passport.internal.di.module.n nVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, xvf0 xvf0Var) {
        this.a = 5;
        this.c = nVar;
        this.d = yvf0Var;
        this.e = yvf0Var2;
        this.f = yvf0Var3;
        this.g = yvf0Var4;
        this.h = yvf0Var5;
        this.i = yvf0Var6;
        this.j = yvf0Var7;
        this.k = yvf0Var8;
        this.b = xvf0Var;
    }

    public cfw0(xvf0 xvf0Var, n3w n3wVar, xvf0 xvf0Var2, p9p p9pVar, oag oagVar, oag oagVar2, xvf0 xvf0Var3, umt0 umt0Var, xvf0 xvf0Var4, n3w n3wVar2) {
        this.a = 0;
        this.b = xvf0Var;
        this.f = n3wVar;
        this.c = xvf0Var2;
        this.h = p9pVar;
        this.i = oagVar;
        this.j = oagVar2;
        this.d = xvf0Var3;
        this.k = umt0Var;
        this.e = xvf0Var4;
        this.g = n3wVar2;
    }
}
