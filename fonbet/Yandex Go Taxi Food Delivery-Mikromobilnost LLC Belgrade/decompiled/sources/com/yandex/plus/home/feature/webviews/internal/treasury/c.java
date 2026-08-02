package com.yandex.plus.home.feature.webviews.internal.treasury;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.api.location.GeoPoint;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jqd0;
import defpackage.jse;
import defpackage.jzs;
import defpackage.kqd0;
import defpackage.lzs;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qd11;
import defpackage.rd11;
import defpackage.sbx;
import defpackage.sd11;
import defpackage.skd0;
import defpackage.td11;
import defpackage.tje;
import defpackage.tls;
import defpackage.tnv;
import defpackage.tse;
import defpackage.zv80;
import defpackage.zy11;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c {
    public final kqd0 a;
    public final lzs b;
    public final td11 c;
    public final jse d;
    public jqd0 e;
    public pzt0 f;
    public final kotlinx.coroutines.sync.a g;
    public final ReentrantLock h;

    public c(kqd0 kqd0Var, lzs lzsVar, jse jseVar) {
        td11 td11Var = new td11();
        this.a = kqd0Var;
        this.b = lzsVar;
        this.c = td11Var;
        this.d = jseVar;
        this.g = gtq0.a();
        this.h = new ReentrantLock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        String cVar2;
        jzs a = cVar.b.a();
        if (a != null) {
            GeoPoint geoPoint = a.b;
            if (geoPoint == null) {
                geoPoint = a.a;
            }
            sd11 sd11Var = geoPoint != null ? new sd11(new rd11(new qd11(String.valueOf(geoPoint.getLat()), String.valueOf(geoPoint.getLon()), String.valueOf(geoPoint.getAccuracy())))) : null;
            cVar2 = sd11Var != null ? sbx.d.c(sd11Var, sd11.Companion.serializer()) : null;
        }
        cVar2 = new kotlinx.serialization.json.c(kotlin.collections.b.f()).toString();
        skd0.b(PlusLogTag.TREASURY, "requestShortcut(): json=".concat(cVar2));
        return cVar.a.b(cVar2, continuationImpl);
    }

    public final void b(tse tseVar, tls tlsVar) {
        skd0.b(PlusLogTag.TREASURY, "ensureSubscribeOnTreasuryInMessages()");
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            pzt0 pzt0Var = this.f;
            if (pzt0Var == null || !pzt0Var.isActive()) {
                this.f = tje.N(tseVar, null, null, new TreasuryMessagesBridge$ensureSubscribeOnTreasuryInMessages$1$1(this, tlsVar, null), 3);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object c(Continuation continuation) {
        skd0.b(PlusLogTag.TREASURY, "preload()");
        Object k0 = tje.k0(this.d, new TreasuryMessagesBridge$preload$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:24:0x0093, B:26:0x0097, B:29:0x00a0, B:36:0x00bb), top: B:23:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb A[Catch: all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:24:0x0093, B:26:0x0097, B:29:0x00a0, B:36:0x00bb), top: B:23:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r3v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(zv80 zv80Var, ContinuationImpl continuationImpl) {
        TreasuryMessagesBridge$requestTreasuryState$1 treasuryMessagesBridge$requestTreasuryState$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        String str;
        int i2;
        g050 g050Var;
        jqd0 jqd0Var;
        try {
            if (continuationImpl instanceof TreasuryMessagesBridge$requestTreasuryState$1) {
                treasuryMessagesBridge$requestTreasuryState$1 = (TreasuryMessagesBridge$requestTreasuryState$1) continuationImpl;
                int i3 = treasuryMessagesBridge$requestTreasuryState$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    treasuryMessagesBridge$requestTreasuryState$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = treasuryMessagesBridge$requestTreasuryState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = treasuryMessagesBridge$requestTreasuryState$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        skd0.b(PlusLogTag.TREASURY, "requestTreasuryState(outMessage=" + zv80Var + ')');
                        String str2 = zv80Var.a;
                        if (str2 == null) {
                            str2 = UUID.randomUUID().toString();
                        }
                        treasuryMessagesBridge$requestTreasuryState$1.L$0 = null;
                        treasuryMessagesBridge$requestTreasuryState$1.L$1 = str2;
                        aVar = this.g;
                        treasuryMessagesBridge$requestTreasuryState$1.L$2 = aVar;
                        treasuryMessagesBridge$requestTreasuryState$1.I$0 = 0;
                        treasuryMessagesBridge$requestTreasuryState$1.label = 1;
                        if (aVar.a(treasuryMessagesBridge$requestTreasuryState$1) != coroutineSingletons) {
                            str = str2;
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) treasuryMessagesBridge$requestTreasuryState$1.L$2;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    i2 = treasuryMessagesBridge$requestTreasuryState$1.I$0;
                    ?? r3 = (g050) treasuryMessagesBridge$requestTreasuryState$1.L$2;
                    str = (String) treasuryMessagesBridge$requestTreasuryState$1.L$1;
                    kotlin.b.b(obj);
                    aVar = r3;
                    jqd0Var = this.e;
                    if (jqd0Var == null) {
                        try {
                            this.c.getClass();
                            tnv b = td11.b(jqd0Var, str);
                            skd0.b(PlusLogTag.TREASURY, "requestTreasuryState() get cached inMessage=" + b);
                            aVar.d(null);
                            return b;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var = aVar;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    jse jseVar = this.d;
                    TreasuryMessagesBridge$requestTreasuryState$2$2 treasuryMessagesBridge$requestTreasuryState$2$2 = new TreasuryMessagesBridge$requestTreasuryState$2$2(this, str, null);
                    treasuryMessagesBridge$requestTreasuryState$1.L$0 = null;
                    treasuryMessagesBridge$requestTreasuryState$1.L$1 = null;
                    treasuryMessagesBridge$requestTreasuryState$1.L$2 = aVar;
                    treasuryMessagesBridge$requestTreasuryState$1.I$0 = i2;
                    treasuryMessagesBridge$requestTreasuryState$1.I$1 = 0;
                    treasuryMessagesBridge$requestTreasuryState$1.label = 2;
                    Object k0 = tje.k0(jseVar, treasuryMessagesBridge$requestTreasuryState$2$2, treasuryMessagesBridge$requestTreasuryState$1);
                    if (k0 != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = k0;
                        g050Var = aVar2;
                        g050Var.d(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            jqd0Var = this.e;
            if (jqd0Var == null) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        treasuryMessagesBridge$requestTreasuryState$1 = new TreasuryMessagesBridge$requestTreasuryState$1(this, continuationImpl);
        Object obj2 = treasuryMessagesBridge$requestTreasuryState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = treasuryMessagesBridge$requestTreasuryState$1.label;
        if (i != 0) {
        }
    }
}
