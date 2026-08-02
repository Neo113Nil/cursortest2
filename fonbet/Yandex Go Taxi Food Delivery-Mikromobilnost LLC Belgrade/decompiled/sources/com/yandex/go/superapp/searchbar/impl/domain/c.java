package com.yandex.go.superapp.searchbar.impl.domain;

import defpackage.gci0;
import defpackage.hdw0;
import defpackage.iwc;
import defpackage.jl40;
import defpackage.ndw0;
import defpackage.ny61;
import defpackage.qwc;
import defpackage.rdw0;
import defpackage.sdw0;
import defpackage.tdw0;
import defpackage.tpr;
import defpackage.w511;
import defpackage.ydw0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes14.dex */
public final class c {
    public final qwc a;
    public final n b;

    public c(qwc qwcVar, n nVar) {
        this.a = qwcVar;
        this.b = nVar;
    }

    public static boolean b(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((hdw0) it.next()).e != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(ndw0 ndw0Var, ydw0 ydw0Var) {
        if (ndw0Var != null && ydw0Var.a) {
            tdw0 tdw0Var = ydw0Var.b;
            if (jl40.l(tdw0Var, sdw0.a)) {
                if (b(ndw0Var.e) || b(ndw0Var.f)) {
                    return true;
                }
            } else if (jl40.l(tdw0Var, rdw0.a)) {
                hdw0 hdw0Var = ndw0Var.g;
                if ((hdw0Var != null ? hdw0Var.e : null) != null) {
                    return true;
                }
            } else {
                w511.b();
            }
        }
        return false;
    }

    public static Float e(long j) {
        iwc iwcVar = new iwc(j);
        if ((j & Long.MIN_VALUE) == 0) {
            iwcVar = null;
        }
        if (iwcVar != null) {
            return Float.valueOf(Float.intBitsToFloat((int) (iwcVar.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ndw0 ndw0Var, ydw0 ydw0Var, ContinuationImpl continuationImpl) {
        SuperappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1 superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1;
        int i;
        iwc iwcVar;
        if (continuationImpl instanceof SuperappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1) {
            superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1 = (SuperappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1) continuationImpl;
            int i2 = superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (d(ndw0Var, ydw0Var) && !this.b.b()) {
                        tpr tprVar = (tpr) this.a.l.getValue();
                        superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.L$0 = null;
                        superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.L$1 = null;
                        superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.label = 1;
                        obj = kotlinx.coroutines.flow.e.A(tprVar, superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                iwcVar = (iwc) obj;
                if (iwcVar != null) {
                    return e(iwcVar.a);
                }
                return null;
            }
        }
        superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1 = new SuperappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1(this, continuationImpl);
        Object obj2 = superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSearchbarAzimuthInteractor$getLastAzimuthDegrees$1.label;
        if (i != 0) {
        }
        iwcVar = (iwc) obj2;
        if (iwcVar != null) {
        }
        return null;
    }

    public final tpr c(tpr tprVar, gci0 gci0Var) {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new m0(tprVar, gci0Var, new SuperappSearchbarAzimuthInteractor$observeAzimuth$1(3, this, c.class, "shouldTrackAzimuth", "shouldTrackAzimuth(Lcom/yandex/go/superapp/searchbar/impl/domain/SuperappSearchbarConfiguration;Lcom/yandex/go/superapp/searchbar/api/SuperappSearchbarState;)Z", 4))), new SuperappSearchbarAzimuthInteractor$observeAzimuth$$inlined$flatMapLatest$1(null, this)));
    }
}
