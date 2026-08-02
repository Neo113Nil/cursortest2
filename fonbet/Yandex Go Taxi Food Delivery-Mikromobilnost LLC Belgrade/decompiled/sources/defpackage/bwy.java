package defpackage;

import android.content.Context;
import com.yandex.delivery.live.location.impl.data.a;
import com.yandex.delivery.live.location.impl.repository.b;
import com.yandex.go.sdk.SourceType;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.logistics.order.g;
import ru.yandex.taxi.systemrequeirements.location.c;

/* loaded from: classes.dex */
public final class bwy implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ bwy(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a(i5m.a(xvf0Var));
            case 1:
                return new b((Context) xvf0Var.get());
            case 2:
                return new lzy((mzy) xvf0Var.get());
            case 3:
                return new q0z((n0z) xvf0Var.get());
            case 4:
                return new g2z((a1b0) xvf0Var.get());
            case 5:
                return new l3z((Context) xvf0Var.get());
            case 6:
                return new z5z((at2) xvf0Var.get());
            case 7:
                return new b6z((zuj0) xvf0Var.get(), 0);
            case 8:
                return new e6z((ru.yandex.taxi.requirements.repository.b) xvf0Var.get());
            case 9:
                return new ru.yandex.taxi.requirements.storage.a((eex) xvf0Var.get());
            case 10:
                return new l9z((fga0) xvf0Var.get());
            case 11:
                return new c((v7j0) xvf0Var.get());
            case 12:
                return new ncz((pho) xvf0Var.get());
            case 13:
                return new qcz((rqo) xvf0Var.get());
            case 14:
                com.yandex.go.sdk.source_providers.a aVar = (com.yandex.go.sdk.source_providers.a) xvf0Var.get();
                TimestampSelector timestampSelector = ucz.a;
                return aVar.a(SourceType.LBS_GSM);
            case 15:
                com.yandex.go.sdk.source_providers.a aVar2 = (com.yandex.go.sdk.source_providers.a) xvf0Var.get();
                TimestampSelector timestampSelector2 = ucz.a;
                return aVar2.a(SourceType.LBS_WIFI);
            case 16:
                com.yandex.go.sdk.source_providers.a aVar3 = (com.yandex.go.sdk.source_providers.a) xvf0Var.get();
                TimestampSelector timestampSelector3 = ucz.a;
                return aVar3.a(SourceType.MAPKIT);
            case 17:
                return new cug((pho) xvf0Var.get());
            case 18:
                return new jc4((pho) xvf0Var.get());
            case 19:
                return new hhz((pho) xvf0Var.get());
            case 20:
                return new g(i5m.a(xvf0Var));
            case 21:
                return new lhz((wnt) xvf0Var.get());
            case 22:
                return new djz((k7x0) xvf0Var.get());
            case 23:
                return new ljz((fif) xvf0Var.get());
            case 24:
                return new au50((rqo) xvf0Var.get(), 18);
            case 25:
                return new lmz((wiq0) xvf0Var.get());
            case 26:
                return new onz((hnz) xvf0Var.get());
            case 27:
                return new hqz();
            case 28:
                com.yandex.go.lootbox.impl.domain.interactors.activation.a q = xpb1.q((t2g) xvf0Var.get());
                q5z.i(q);
                return q;
            default:
                return xpb1.r((t2g) xvf0Var.get());
        }
    }
}
