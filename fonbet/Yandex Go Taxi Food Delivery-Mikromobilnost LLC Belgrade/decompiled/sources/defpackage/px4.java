package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import com.yandex.go.places.impl.domain.interactors.organizations.b;
import com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.i;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.g;
import com.yandex.messaging.input.c;
import com.yandex.messaging.input.d;
import com.yandex.messaging.internal.storage.contacts.a;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Payer;
import ru.yandex.taxi.preorder.source.domain.p;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes13.dex */
public final class px4 implements v7p {
    public final /* synthetic */ int a;
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

    public px4(ox4 ox4Var, xvf0 xvf0Var, n3w n3wVar, n3w n3wVar2, n3w n3wVar3, n3w n3wVar4, n3w n3wVar5, n3w n3wVar6, n3w n3wVar7, n3w n3wVar8, n3w n3wVar9) {
        this.a = 0;
        this.b = xvf0Var;
        this.c = n3wVar;
        this.d = n3wVar2;
        this.e = n3wVar3;
        this.f = n3wVar4;
        this.g = n3wVar5;
        this.h = n3wVar6;
        this.i = n3wVar7;
        this.j = n3wVar8;
        this.k = n3wVar9;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.k;
        xvf0 xvf0Var4 = this.j;
        xvf0 xvf0Var5 = this.i;
        xvf0 xvf0Var6 = this.h;
        xvf0 xvf0Var7 = this.f;
        xvf0 xvf0Var8 = this.e;
        xvf0 xvf0Var9 = this.d;
        xvf0 xvf0Var10 = this.b;
        switch (i) {
            case 0:
                return dha1.g((pcy) xvf0Var10.get(), (String) xvf0Var2.get(), (ConsoleLoggingMode) xvf0Var8.get(), (String) xvf0Var9.get(), (rwo) xvf0Var7.get(), (vv50) xvf0Var.get(), (Context) xvf0Var6.get(), (Payer) xvf0Var5.get(), ((Boolean) xvf0Var4.get()).booleanValue(), (String) xvf0Var3.get());
            case 1:
                return new ivd((tt2) xvf0Var10.get(), this.c, (oep0) xvf0Var9.get(), (x) xvf0Var8.get(), (gvd) xvf0Var7.get(), (pwy0) xvf0Var.get(), (f580) xvf0Var6.get(), (aqj0) xvf0Var5.get(), (wiq0) xvf0Var4.get(), (iev0) xvf0Var3.get());
            case 2:
                return new u9e((gui0) xvf0Var10.get(), (wff0) xvf0Var2.get(), (to3) xvf0Var9.get(), (k020) xvf0Var8.get(), (String) xvf0Var7.get(), (x22) xvf0Var.get(), (at2) xvf0Var6.get(), (x9e) xvf0Var5.get(), (a) xvf0Var4.get(), (lqo) xvf0Var3.get());
            case 3:
                return new d((Activity) xvf0Var10.get(), (c) xvf0Var2.get(), i5m.a(xvf0Var9), i5m.a(xvf0Var8), i5m.a(xvf0Var7), i5m.a(xvf0Var), i5m.a(xvf0Var6), i5m.a(xvf0Var5), i5m.a(xvf0Var4), i5m.a(xvf0Var3));
            case 4:
                return new yb00((wiq0) xvf0Var10.get(), (arv0) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var9.get(), (c9l0) xvf0Var8.get(), (e) xvf0Var7.get(), (q4) xvf0Var.get(), (tte0) xvf0Var6.get(), (c4r0) xvf0Var5.get(), (p) xvf0Var4.get(), (c8r) xvf0Var3.get());
            case 5:
                return new com.yandex.messaging.internal.view.chat.input.a((Activity) xvf0Var10.get(), (ChatRequest) xvf0Var2.get(), (com.yandex.messaging.internal.team.gaps.a) xvf0Var9.get(), (v8t) xvf0Var8.get(), (com.yandex.messaging.domain.statuses.e) xvf0Var7.get(), (g) xvf0Var.get(), i5m.a(xvf0Var6), (q0k) xvf0Var5.get(), (gj10) xvf0Var4.get(), (ChatInputHeightState) xvf0Var3.get());
            case 6:
                return new b((cn80) xvf0Var10.get(), (tt2) xvf0Var2.get(), (wnt) xvf0Var9.get(), (e2t) xvf0Var8.get(), (wbc0) xvf0Var7.get(), (mg80) xvf0Var.get(), (com.yandex.go.places.impl.data.repositories.organizations.b) xvf0Var6.get(), (h) xvf0Var5.get(), (go80) xvf0Var4.get(), (j) xvf0Var3.get());
            case 7:
                return new i((n6n0) xvf0Var10.get(), (znn0) xvf0Var2.get(), (z2o0) xvf0Var9.get(), (com.yandex.go.scooters.offers.v2.components.bottom.data.a) xvf0Var8.get(), (a4o0) xvf0Var7.get(), (com.yandex.go.scooters.subscription.domain.a) xvf0Var.get(), (vyo0) xvf0Var6.get(), (com.yandex.go.scooters.subscription.upsale_on_book.data.a) xvf0Var5.get(), (com.yandex.go.scooters.subscription.domain.d) xvf0Var4.get(), (dzo0) xvf0Var3.get());
            case 8:
                return new m((yit0) xvf0Var10.get(), (biv0) xvf0Var2.get(), (rft0) xvf0Var9.get(), (wb1) xvf0Var8.get(), (fy01) xvf0Var7.get(), this.g, (svw) xvf0Var6.get(), (oep0) xvf0Var5.get(), i5m.a(xvf0Var4), (u) xvf0Var3.get());
            case 9:
                axm axmVar = (axm) xvf0Var10.get();
                ru.yandex.taxi.preorder.extraphone.e eVar = (ru.yandex.taxi.preorder.extraphone.e) xvf0Var9.get();
                ru.yandex.taxi.orderforanother.repository.a aVar = (ru.yandex.taxi.orderforanother.repository.a) xvf0Var7.get();
                ru.yandex.taxi.preorder.repositories.g gVar = (ru.yandex.taxi.preorder.repositories.g) xvf0Var.get();
                d9w d9wVar = (d9w) xvf0Var6.get();
                amc amcVar = (amc) xvf0Var5.get();
                RequirementsChangedNotifier requirementsChangedNotifier = (RequirementsChangedNotifier) xvf0Var4.get();
                return new z4m0(axmVar, eVar, aVar, gVar, d9wVar, amcVar, requirementsChangedNotifier, 5);
            default:
                return new yt21((n5t0) xvf0Var10.get(), (ut21) xvf0Var2.get(), (sb7) xvf0Var9.get(), (k020) xvf0Var8.get(), (at2) xvf0Var7.get(), (ml21) xvf0Var.get(), (xt21) xvf0Var6.get(), (glf) xvf0Var5.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var3));
        }
    }

    public /* synthetic */ px4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, int i) {
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
}
