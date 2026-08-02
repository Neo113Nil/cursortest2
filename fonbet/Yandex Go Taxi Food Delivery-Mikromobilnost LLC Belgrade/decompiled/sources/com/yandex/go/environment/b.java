package com.yandex.go.environment;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.atd0;
import defpackage.cda0;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.tt2;
import defpackage.z110;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    public final o a;
    public final com.yandex.go.zone.interactors.b b;
    public final z110 c;
    public final cda0 d;
    public final atd0 e;
    public final ru.yandex.taxi.banners.model.h f;
    public final tt2 g;
    public final ru.yandex.taxi.favorites.data.repo.a h;
    public final nfh i;
    public final ru.yandex.taxi.scooters.domain.e j;

    public b(o oVar, com.yandex.go.zone.interactors.b bVar, z110 z110Var, cda0 cda0Var, atd0 atd0Var, ru.yandex.taxi.banners.model.h hVar, tt2 tt2Var, ru.yandex.taxi.favorites.data.repo.a aVar, nfh nfhVar, ru.yandex.taxi.scooters.domain.e eVar) {
        this.a = oVar;
        this.b = bVar;
        this.c = z110Var;
        this.d = cda0Var;
        this.e = atd0Var;
        this.f = hVar;
        this.g = tt2Var;
        this.h = aVar;
        this.i = nfhVar;
        this.j = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, zzs zzsVar, ContinuationImpl continuationImpl) {
        RequestEndpointInteractor$fetchZone$1 requestEndpointInteractor$fetchZone$1;
        int i;
        String str2;
        o oVar = bVar.a;
        if (continuationImpl instanceof RequestEndpointInteractor$fetchZone$1) {
            requestEndpointInteractor$fetchZone$1 = (RequestEndpointInteractor$fetchZone$1) continuationImpl;
            int i2 = requestEndpointInteractor$fetchZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestEndpointInteractor$fetchZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requestEndpointInteractor$fetchZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestEndpointInteractor$fetchZone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Zone g = oVar.g();
                    oVar.d.b.clear();
                    oVar.r.l(null);
                    com.yandex.go.zone.interactors.b bVar2 = bVar.b;
                    if (g != null && (str2 = g.a) != null) {
                        str = str2;
                    }
                    requestEndpointInteractor$fetchZone$1.L$0 = null;
                    requestEndpointInteractor$fetchZone$1.L$1 = null;
                    requestEndpointInteractor$fetchZone$1.L$2 = null;
                    requestEndpointInteractor$fetchZone$1.label = 1;
                    if (bVar2.d(str, zzsVar, requestEndpointInteractor$fetchZone$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        requestEndpointInteractor$fetchZone$1 = new RequestEndpointInteractor$fetchZone$1(bVar, continuationImpl);
        Object obj2 = requestEndpointInteractor$fetchZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestEndpointInteractor$fetchZone$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
