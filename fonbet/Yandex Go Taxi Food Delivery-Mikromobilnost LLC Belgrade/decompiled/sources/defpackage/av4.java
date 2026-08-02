package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.navigator.domain.v;
import com.yandex.go.navigator.repository.f;
import com.yandex.go.places.impl.ui.search.data.repositories.d;
import ru.yandex.taxi.logistics.sdk.promotions.impl.a;
import ru.yandex.taxi.logistics.sdk.promotions.impl.ui.b;
import ru.yandex.taxi.persuggest.source.h;
import ru.yandex.taxi.persuggest.source.m;

/* loaded from: classes13.dex */
public final class av4 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final n3w f;

    public av4(k7g k7gVar, gzn0 gzn0Var, n7g n7gVar, n3w n3wVar, n3w n3wVar2, m7g m7gVar) {
        this.a = 12;
        this.b = k7gVar;
        this.c = n7gVar;
        this.d = n3wVar;
        this.f = n3wVar2;
        this.e = m7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        n3w n3wVar = this.f;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new b((st2) xvf0Var4.get(), (a) xvf0Var3.get(), (ru.yandex.taxi.logistics.sdk.promotions.impl.domain.a) xvf0Var2.get(), (lr4) xvf0Var.get(), (or4) n3wVar.a);
            case 1:
                return new k1a((fva0) xvf0Var4.get(), (w030) xvf0Var3.get(), (qoa) xvf0Var2.get(), (ioa) xvf0Var.get(), (aoa) n3wVar.a, 1);
            case 2:
                return new zxa((w030) xvf0Var4.get(), (xxa) xvf0Var3.get(), (awa) xvf0Var2.get(), (uxa) n3wVar.a, this.e, 0);
            case 3:
                b890 b890Var = (b890) xvf0Var4.get();
                Activity activity = (Activity) n3wVar.a;
                xav xavVar = (xav) xvf0Var3.get();
                x22 x22Var = (x22) xvf0Var2.get();
                return new bhv(b890Var, activity, xavVar, x22Var);
            case 4:
                return new v((f) xvf0Var4.get(), (sb50) xvf0Var3.get(), (com.yandex.go.navigator.events.f) xvf0Var2.get(), (hiq0) xvf0Var.get(), (jhs0) n3wVar.a);
            case 5:
                return new k1a((x290) xvf0Var4.get(), (s290) n3wVar.a, (w030) xvf0Var3.get(), (q290) xvf0Var2.get(), (hiq0) xvf0Var.get());
            case 6:
                return new com.yandex.messaging.ui.settings.privacy.a((b00) xvf0Var4.get(), (sft) xvf0Var3.get(), (il7) xvf0Var2.get(), (rcy0) xvf0Var.get(), (h4f0) n3wVar.a);
            case 7:
                return new yfj0((Context) xvf0Var4.get(), (i130) xvf0Var3.get(), (ufj0) n3wVar.a, (f580) xvf0Var2.get(), (nfj0) xvf0Var.get());
            case 8:
                mql0 mql0Var = (mql0) xvf0Var4.get();
                lql0 lql0Var = (lql0) xvf0Var3.get();
                return new qql0(mql0Var, lql0Var, (dsl0) xvf0Var2.get(), (w030) xvf0Var.get());
            case 9:
                return new k1a((w030) xvf0Var4.get(), xvf0Var3.get(), (Object) this.d, xvf0Var.get(), n3wVar.a, 6);
            case 10:
                return new kan0((Context) xvf0Var4.get(), (fva0) xvf0Var3.get(), (ban0) xvf0Var2.get(), (n5o0) xvf0Var.get(), (ran0) n3wVar.a);
            case 11:
                return new ru.yandex.taxi.scooters.presentation.ontheway.completion.force.a((w030) xvf0Var4.get(), (fva0) xvf0Var3.get(), (ukn0) xvf0Var2.get(), (ron0) xvf0Var.get(), (pon0) n3wVar.a);
            case 12:
                return new dao0((w030) xvf0Var4.get(), this.c, (j7o0) xvf0Var2.get(), (o7o0) n3wVar.a, this.e);
            case 13:
                return new com.yandex.go.scooters.offers.v2.surge.widget.a((fva0) xvf0Var4.get(), (a4p0) xvf0Var3.get(), this.d, (xzm0) xvf0Var.get(), (v3p0) n3wVar.a);
            default:
                return new d((m) xvf0Var4.get(), (h) xvf0Var3.get(), (owp0) xvf0Var2.get(), (com.yandex.go.places.impl.analytics.a) xvf0Var.get(), (lg80) n3wVar.a);
        }
    }

    public /* synthetic */ av4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, n3w n3wVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = n3wVar;
    }

    public av4(qxf qxfVar, n3w n3wVar, n3w n3wVar2, n3w n3wVar3, zfa zfaVar) {
        this.a = 2;
        this.b = qxfVar;
        this.c = n3wVar;
        this.d = n3wVar2;
        this.f = n3wVar3;
        this.e = zfaVar;
    }

    public av4(xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar, axy axyVar, xvf0 xvf0Var3) {
        this.a = 7;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = n3wVar;
        this.d = axyVar;
        this.e = xvf0Var3;
    }

    public /* synthetic */ av4(xvf0 xvf0Var, n3w n3wVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.f = n3wVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public av4(n3w n3wVar, n3w n3wVar2, n3w n3wVar3, n3w n3wVar4, b7g b7gVar, xvf0 xvf0Var) {
        this.a = 8;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.f = n3wVar3;
        this.d = n3wVar4;
        this.e = xvf0Var;
    }
}
