package com.yandex.go.scooters.discovery;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.scooters.requirements.SkipCheck;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.odn0;
import defpackage.q970;
import defpackage.v1b1;
import defpackage.vje;
import defpackage.z970;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes13.dex */
public final class l implements vje {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, Continuation continuation) {
        ScootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1 scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1;
        int i;
        m mVar;
        q qVar;
        odn0 odn0Var;
        z970 e;
        if (continuation instanceof ScootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1) {
            scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1 = (ScootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1) continuation;
            int i2 = scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.label;
                mVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uri data = intent.getData();
                    if (data != null) {
                        q qVar2 = (q) mVar.J.get();
                        scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.L$0 = null;
                        scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.L$1 = null;
                        scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.L$2 = qVar2;
                        scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.label = 1;
                        Object p = qVar2.p(data, scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1);
                        if (p == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = p;
                        qVar = qVar2;
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qVar = (q) scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.L$2;
                kotlin.b.b(obj);
                odn0Var = (odn0) obj;
                if (odn0Var != null && (e = v1b1.e(qVar, odn0Var)) != null) {
                    mVar.getClass();
                    mVar.R(e instanceof q970 ? SkipCheck.DEBT : null, new k(mVar, e));
                    return new m5u(false, false);
                }
                return n5u.a;
            }
        }
        scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1 = new ScootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDiscoveryRouter$handleScootersIntents$1$1$processIntent$1.label;
        mVar = this.a;
        if (i != 0) {
        }
        odn0Var = (odn0) obj2;
        if (odn0Var != null) {
            mVar.getClass();
            mVar.R(e instanceof q970 ? SkipCheck.DEBT : null, new k(mVar, e));
            return new m5u(false, false);
        }
        return n5u.a;
    }
}
