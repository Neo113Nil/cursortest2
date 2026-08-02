package com.yandex.go.taxi.tariffs.interactor;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.acz;
import defpackage.ae61;
import defpackage.dqe0;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.jwu;
import defpackage.mdh;
import defpackage.mxf0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uzs;
import defpackage.zuj0;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class s {
    public final com.yandex.go.zone.interactors.b a;
    public final mxf0 b;
    public final ae61 c;
    public final com.yandex.go.taxi.tariffs.repository.d d;
    public final zuj0 e;
    public final tt2 f;
    public final h3y g;
    public final h3y h;

    public s(com.yandex.go.zone.interactors.b bVar, mxf0 mxf0Var, ae61 ae61Var, com.yandex.go.taxi.tariffs.repository.d dVar, zuj0 zuj0Var, tt2 tt2Var, h3y h3yVar, h3y h3yVar2) {
        this.a = bVar;
        this.b = mxf0Var;
        this.c = ae61Var;
        this.d = dVar;
        this.e = zuj0Var;
        this.f = tt2Var;
        this.g = h3yVar;
        this.h = h3yVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r10 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r10 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, String str, zzs zzsVar, ContinuationImpl continuationImpl) {
        LegacyTariffsInteractor$getUrl$1 legacyTariffsInteractor$getUrl$1;
        int i;
        Zone zone;
        String a;
        com.yandex.go.zone.interactors.b bVar = sVar.a;
        if (continuationImpl instanceof LegacyTariffsInteractor$getUrl$1) {
            legacyTariffsInteractor$getUrl$1 = (LegacyTariffsInteractor$getUrl$1) continuationImpl;
            int i2 = legacyTariffsInteractor$getUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                legacyTariffsInteractor$getUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = legacyTariffsInteractor$getUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = legacyTariffsInteractor$getUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && !evu0.J(str)) {
                        legacyTariffsInteractor$getUrl$1.L$0 = null;
                        legacyTariffsInteractor$getUrl$1.L$1 = null;
                        legacyTariffsInteractor$getUrl$1.label = 1;
                        obj = bVar.a(str, legacyTariffsInteractor$getUrl$1);
                    } else {
                        if (zzsVar == null) {
                            ny61.r("Try to open tariffs without zone information");
                            return null;
                        }
                        legacyTariffsInteractor$getUrl$1.L$0 = null;
                        legacyTariffsInteractor$getUrl$1.L$1 = null;
                        legacyTariffsInteractor$getUrl$1.label = 2;
                        obj = bVar.d(str, zzsVar, legacyTariffsInteractor$getUrl$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    zone = (Zone) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    zone = (Zone) obj;
                }
                a = sVar.b.a(zone.j, zone.i);
                if (a != null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                jwu jwuVar = new jwu();
                jwuVar.i(null, a);
                jwu g = jwuVar.e().g();
                g.d("classes", kotlin.collections.a.X(sVar.c.a(), ";", null, null, null, 62));
                return g.e().i;
            }
        }
        legacyTariffsInteractor$getUrl$1 = new LegacyTariffsInteractor$getUrl$1(sVar, continuationImpl);
        Object obj2 = legacyTariffsInteractor$getUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = legacyTariffsInteractor$getUrl$1.label;
        if (i != 0) {
        }
        a = sVar.b.a(zone.j, zone.i);
        if (a != null) {
        }
    }

    public final tpr b(zzs zzsVar, String str) {
        ZoneAddress f = ((dqe0) this.g.get()).f();
        Address address = f != null ? f.a : null;
        if (zzsVar == null) {
            zzsVar = address != null ? address.B() : null;
            if (zzsVar == null) {
                Location a = ((acz) this.h.get()).a();
                if (a != null) {
                    zzs.Companion.getClass();
                    zzsVar = uzs.b(a);
                } else {
                    zzsVar = null;
                }
            }
        }
        if (str == null) {
            str = address != null ? address.getZoneName() : null;
        }
        kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(new rol0(new LegacyTariffsInteractor$state$1(this, str, zzsVar, null)), new LegacyTariffsInteractor$state$2(this, zzsVar, null));
        this.f.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(oVar, mdh.b);
    }
}
