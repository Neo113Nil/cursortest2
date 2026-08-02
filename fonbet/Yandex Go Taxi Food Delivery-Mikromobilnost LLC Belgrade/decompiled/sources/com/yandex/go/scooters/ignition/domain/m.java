package com.yandex.go.scooters.ignition.domain;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionResponse;
import defpackage.brn0;
import defpackage.g6u;
import defpackage.gsn0;
import defpackage.ief;
import defpackage.m2o0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qsn0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.ton0;
import defpackage.tsn0;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class m {
    public static final /* synthetic */ int k = 0;
    public final tt2 a;
    public final m2o0 b;
    public final tsn0 c;
    public final com.yandex.go.scooters.ignition.data.e d;
    public final com.yandex.go.scooters.ignition.data.b e;
    public final com.yandex.go.scooters.ignition.analytics.a f;
    public final brn0 g;
    public final qsn0 h;
    public final gsn0 i;
    public final com.yandex.go.scooters.ignition.data.h j;

    static {
        int i = com.yandex.go.scooters.ignition.data.b.e;
    }

    public m(tt2 tt2Var, m2o0 m2o0Var, tsn0 tsn0Var, com.yandex.go.scooters.ignition.data.e eVar, com.yandex.go.scooters.ignition.data.b bVar, com.yandex.go.scooters.ignition.analytics.a aVar, brn0 brn0Var, qsn0 qsn0Var, gsn0 gsn0Var, com.yandex.go.scooters.ignition.data.h hVar) {
        this.a = tt2Var;
        this.b = m2o0Var;
        this.c = tsn0Var;
        this.d = eVar;
        this.e = bVar;
        this.f = aVar;
        this.g = brn0Var;
        this.h = qsn0Var;
        this.i = gsn0Var;
        this.j = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, ScootersIgnitionResponse.Notification notification, ief iefVar, ContinuationImpl continuationImpl) {
        ScootersIgnitionRequestInteractor$showNotification$1 scootersIgnitionRequestInteractor$showNotification$1;
        int i;
        mVar.getClass();
        if (continuationImpl instanceof ScootersIgnitionRequestInteractor$showNotification$1) {
            scootersIgnitionRequestInteractor$showNotification$1 = (ScootersIgnitionRequestInteractor$showNotification$1) continuationImpl;
            int i2 = scootersIgnitionRequestInteractor$showNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRequestInteractor$showNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionRequestInteractor$showNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRequestInteractor$showNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    ScootersIgnitionRequestInteractor$showNotification$2 scootersIgnitionRequestInteractor$showNotification$2 = new ScootersIgnitionRequestInteractor$showNotification$2(mVar, notification, iefVar, null);
                    scootersIgnitionRequestInteractor$showNotification$1.L$0 = null;
                    scootersIgnitionRequestInteractor$showNotification$1.L$1 = null;
                    scootersIgnitionRequestInteractor$showNotification$1.label = 1;
                    if (tje.k0(g6uVar, scootersIgnitionRequestInteractor$showNotification$2, scootersIgnitionRequestInteractor$showNotification$1) == coroutineSingletons) {
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
        scootersIgnitionRequestInteractor$showNotification$1 = new ScootersIgnitionRequestInteractor$showNotification$1(mVar, continuationImpl);
        Object obj2 = scootersIgnitionRequestInteractor$showNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRequestInteractor$showNotification$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r0.add(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(m mVar, List list, Continuation continuation) {
        UUID fromString;
        Integer b;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScootersIgnitionResponse.Beacon beacon = (ScootersIgnitionResponse.Beacon) it.next();
            ton0 ton0Var = null;
            try {
                String a = beacon.getA();
                if (a != null && (fromString = UUID.fromString(a)) != null && (b = beacon.getB()) != null) {
                    int intValue = b.intValue();
                    Integer c = beacon.getC();
                    if (c != null) {
                        ton0Var = new ton0(fromString, c.intValue(), intValue);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return mVar.e.b(arrayList, (ContinuationImpl) continuation);
    }

    public final Object c(tls tlsVar, Continuation continuation) {
        zy11 zy11Var = zy11.a;
        if (!this.i.a) {
            this.a.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new ScootersIgnitionRequestInteractor$request$2(this, tlsVar, null), continuation);
            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k0;
            }
        }
        return zy11Var;
    }
}
