package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;
import com.yandex.go.chargers.data.b;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.data.j;
import com.yandex.go.chargers.order.active.f;
import com.yandex.go.chargers.order.domain.a;

/* loaded from: classes12.dex */
public final class il9 {
    public final tt2 a;
    public final em9 b;
    public final pwy0 c;
    public final f d;
    public final a e;
    public final lca f;
    public final e g;
    public final rda h;
    public final j i;
    public final b j;
    public boolean k;

    public il9(tt2 tt2Var, em9 em9Var, pwy0 pwy0Var, f fVar, a aVar, lca lcaVar, e eVar, rda rdaVar, j jVar, b bVar) {
        this.a = tt2Var;
        this.b = em9Var;
        this.c = pwy0Var;
        this.d = fVar;
        this.e = aVar;
        this.f = lcaVar;
        this.g = eVar;
        this.h = rdaVar;
        this.i = jVar;
        this.j = bVar;
    }

    public static ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 a(hba hbaVar) {
        if (hbaVar.equals(fba.a)) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.TakeMore;
        }
        if (hbaVar.equals(zaa.a)) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.FinishOrder;
        }
        if (hbaVar instanceof cba) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Promotion;
        }
        return null;
    }
}
