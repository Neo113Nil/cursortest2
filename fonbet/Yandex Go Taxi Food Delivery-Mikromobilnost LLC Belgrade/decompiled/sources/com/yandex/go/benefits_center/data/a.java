package com.yandex.go.benefits_center.data;

import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.zone.interactors.b;
import com.yandex.go.zone.model.Zone;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.scc;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes.dex */
public final class a {
    public final b a;
    public final po21 b;
    public final com.yandex.go.route.interactor.b c;

    public a(b bVar, po21 po21Var, com.yandex.go.route.interactor.b bVar2) {
        this.a = bVar;
        this.b = po21Var;
        this.c = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        BenefitsCenterGeoStateProvider$provide$1 benefitsCenterGeoStateProvider$provide$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zzs d;
        Object b;
        zzs zzsVar;
        Zone zone;
        if (continuationImpl instanceof BenefitsCenterGeoStateProvider$provide$1) {
            benefitsCenterGeoStateProvider$provide$1 = (BenefitsCenterGeoStateProvider$provide$1) continuationImpl;
            int i2 = benefitsCenterGeoStateProvider$provide$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                benefitsCenterGeoStateProvider$provide$1.label = i2 - Integer.MIN_VALUE;
                Object obj = benefitsCenterGeoStateProvider$provide$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsCenterGeoStateProvider$provide$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d = this.c.d();
                    if (d == null) {
                        benefitsCenterGeoStateProvider$provide$1.label = 1;
                        obj = ((e) this.b).h(benefitsCenterGeoStateProvider$provide$1);
                    }
                    benefitsCenterGeoStateProvider$provide$1.L$0 = d;
                    benefitsCenterGeoStateProvider$provide$1.label = 2;
                    b bVar = this.a;
                    bVar.getClass();
                    b = bVar.b(d, benefitsCenterGeoStateProvider$provide$1);
                    if (b != coroutineSingletons) {
                        zzs zzsVar2 = d;
                        obj = b;
                        zzsVar = zzsVar2;
                        zone = (Zone) obj;
                        if (zone.a.length() == 0) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzsVar = (zzs) benefitsCenterGeoStateProvider$provide$1.L$0;
                    kotlin.b.b(obj);
                    zone = (Zone) obj;
                    if (zone.a.length() == 0) {
                        return new BenefitGeoState(zzsVar.c, zone.a, scc.g(new Double(zzsVar.b), new Double(zzsVar.a)));
                    }
                    jst.e.d("benefits_center", "BenefitsCenter: Failed to fetch zone");
                    return null;
                }
                kotlin.b.b(obj);
                d = ((mo21) obj).a();
                benefitsCenterGeoStateProvider$provide$1.L$0 = d;
                benefitsCenterGeoStateProvider$provide$1.label = 2;
                b bVar2 = this.a;
                bVar2.getClass();
                b = bVar2.b(d, benefitsCenterGeoStateProvider$provide$1);
                if (b != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        benefitsCenterGeoStateProvider$provide$1 = new BenefitsCenterGeoStateProvider$provide$1(this, continuationImpl);
        Object obj2 = benefitsCenterGeoStateProvider$provide$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsCenterGeoStateProvider$provide$1.label;
        if (i != 0) {
        }
        d = ((mo21) obj2).a();
        benefitsCenterGeoStateProvider$provide$1.L$0 = d;
        benefitsCenterGeoStateProvider$provide$1.label = 2;
        b bVar22 = this.a;
        bVar22.getClass();
        b = bVar22.b(d, benefitsCenterGeoStateProvider$provide$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
