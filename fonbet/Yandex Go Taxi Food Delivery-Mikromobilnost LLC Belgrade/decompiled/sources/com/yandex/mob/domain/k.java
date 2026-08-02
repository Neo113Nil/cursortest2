package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobTrigger;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qke;
import defpackage.tl20;
import defpackage.ul20;
import defpackage.vl20;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class k {
    public final com.yandex.mob.datastore.d a;

    public k(com.yandex.mob.datastore.d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r7.u(r8, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tl20 tl20Var, ContinuationImpl continuationImpl) {
        IpToGeoResponseResolver$resolve$1 ipToGeoResponseResolver$resolve$1;
        int i;
        String r;
        String str;
        String str2;
        if (continuationImpl instanceof IpToGeoResponseResolver$resolve$1) {
            ipToGeoResponseResolver$resolve$1 = (IpToGeoResponseResolver$resolve$1) continuationImpl;
            int i2 = ipToGeoResponseResolver$resolve$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ipToGeoResponseResolver$resolve$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ipToGeoResponseResolver$resolve$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ipToGeoResponseResolver$resolve$1.label;
                com.yandex.mob.datastore.d dVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r = qke.r(tl20Var, "X-Mob-Country-Code-By-IP");
                    if (r != null) {
                        ipToGeoResponseResolver$resolve$1.L$0 = null;
                        ipToGeoResponseResolver$resolve$1.L$1 = r;
                        ipToGeoResponseResolver$resolve$1.label = 1;
                        obj = dVar.h(ipToGeoResponseResolver$resolve$1);
                    }
                    return ul20.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) ipToGeoResponseResolver$resolve$1.L$3;
                        kotlin.b.b(obj);
                        if (!jl40.l(str2, obj)) {
                            return new vl20(MobTrigger.CountryMismatch);
                        }
                        return ul20.a;
                    }
                    String str3 = (String) ipToGeoResponseResolver$resolve$1.L$2;
                    String str4 = (String) ipToGeoResponseResolver$resolve$1.L$1;
                    kotlin.b.b(obj);
                    str = str3;
                    r = str4;
                    if (str != null && !jl40.l(r, str)) {
                        ipToGeoResponseResolver$resolve$1.L$0 = null;
                        ipToGeoResponseResolver$resolve$1.L$1 = null;
                        ipToGeoResponseResolver$resolve$1.L$2 = null;
                        ipToGeoResponseResolver$resolve$1.L$3 = r;
                        ipToGeoResponseResolver$resolve$1.label = 3;
                        obj = dVar.d(ipToGeoResponseResolver$resolve$1);
                        if (obj != coroutineSingletons) {
                            str2 = r;
                            if (!jl40.l(str2, obj)) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    return ul20.a;
                }
                r = (String) ipToGeoResponseResolver$resolve$1.L$1;
                kotlin.b.b(obj);
                str = (String) obj;
                ipToGeoResponseResolver$resolve$1.L$0 = null;
                ipToGeoResponseResolver$resolve$1.L$1 = r;
                ipToGeoResponseResolver$resolve$1.L$2 = str;
                ipToGeoResponseResolver$resolve$1.label = 2;
            }
        }
        ipToGeoResponseResolver$resolve$1 = new IpToGeoResponseResolver$resolve$1(this, continuationImpl);
        Object obj2 = ipToGeoResponseResolver$resolve$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ipToGeoResponseResolver$resolve$1.label;
        com.yandex.mob.datastore.d dVar2 = this.a;
        if (i != 0) {
        }
        str = (String) obj2;
        ipToGeoResponseResolver$resolve$1.L$0 = null;
        ipToGeoResponseResolver$resolve$1.L$1 = r;
        ipToGeoResponseResolver$resolve$1.L$2 = str;
        ipToGeoResponseResolver$resolve$1.label = 2;
    }
}
