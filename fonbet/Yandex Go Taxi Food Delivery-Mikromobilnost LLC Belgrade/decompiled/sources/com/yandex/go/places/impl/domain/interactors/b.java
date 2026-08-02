package com.yandex.go.places.impl.domain.interactors;

import defpackage.b601;
import defpackage.br;
import defpackage.c601;
import defpackage.cmt;
import defpackage.d601;
import defpackage.d6w;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jse;
import defpackage.jst;
import defpackage.kb20;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.rs2;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.z1b1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.layers.api.TrackerApi;

/* loaded from: classes13.dex */
public final class b {
    public static final d6w f = new d6w(0, 1073741823, 1);
    public final TrackerApi a;
    public final kb20 b;
    public final jse c;
    public final kotlinx.coroutines.sync.a d;
    public final List e;

    public b(TrackerApi trackerApi, kb20 kb20Var, rs2 rs2Var, tt2 tt2Var) {
        this.a = trackerApi;
        this.b = kb20Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.c = mdh.b.P(1);
        this.d = gtq0.a();
        rs2Var.getClass();
        this.e = scc.g(new b601("ru.yandex.taxi"), c601.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #0 {all -> 0x00bc, blocks: (B:25:0x0069, B:26:0x007a, B:28:0x0080, B:39:0x00b0, B:42:0x00be, B:30:0x0089, B:31:0x0094, B:33:0x009a), top: B:24:0x0069, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, br brVar, ContinuationImpl continuationImpl) {
        TrackingLinkInteractor$processAction$1 trackingLinkInteractor$processAction$1;
        Object obj;
        Object obj2;
        int i;
        br brVar2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        bVar.getClass();
        try {
            if (continuationImpl instanceof TrackingLinkInteractor$processAction$1) {
                trackingLinkInteractor$processAction$1 = (TrackingLinkInteractor$processAction$1) continuationImpl;
                int i2 = trackingLinkInteractor$processAction$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    trackingLinkInteractor$processAction$1.label = i2 - Integer.MIN_VALUE;
                    obj = trackingLinkInteractor$processAction$1.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingLinkInteractor$processAction$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = bVar.d;
                        trackingLinkInteractor$processAction$1.L$0 = brVar;
                        trackingLinkInteractor$processAction$1.L$1 = aVar;
                        trackingLinkInteractor$processAction$1.label = 1;
                        if (aVar.a(trackingLinkInteractor$processAction$1) != obj2) {
                            brVar2 = brVar;
                            g050Var = aVar;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) trackingLinkInteractor$processAction$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            obj2 = (Boolean) obj;
                            obj2.getClass();
                            g050Var2.d(null);
                            return obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) trackingLinkInteractor$processAction$1.L$1;
                    brVar2 = (br) trackingLinkInteractor$processAction$1.L$0;
                    kotlin.b.b(obj);
                    StringBuilder sb = new StringBuilder(brVar2.getUrl());
                    for (d601 d601Var : bVar.e) {
                        d601Var.getClass();
                        try {
                            Matcher matcher = d601Var.a.matcher(sb);
                            String a = d601Var.a(brVar2);
                            for (int i3 = 0; matcher.find(i3); i3 = matcher.start() + a.length()) {
                                sb.replace(matcher.start(), matcher.end(), a);
                            }
                        } catch (Throwable th3) {
                            jst.e.k(th3, "Placeholder.replace error");
                        }
                    }
                    String sb2 = sb.toString();
                    trackingLinkInteractor$processAction$1.L$0 = null;
                    trackingLinkInteractor$processAction$1.L$1 = g050Var;
                    trackingLinkInteractor$processAction$1.L$2 = null;
                    trackingLinkInteractor$processAction$1.L$3 = null;
                    trackingLinkInteractor$processAction$1.label = 2;
                    obj = bVar.b(sb2, trackingLinkInteractor$processAction$1);
                    if (obj != obj2) {
                        g050Var2 = g050Var;
                        obj2 = (Boolean) obj;
                        obj2.getClass();
                        g050Var2.d(null);
                    }
                    return obj2;
                }
            }
            StringBuilder sb3 = new StringBuilder(brVar2.getUrl());
            while (r4.hasNext()) {
            }
            String sb22 = sb3.toString();
            trackingLinkInteractor$processAction$1.L$0 = null;
            trackingLinkInteractor$processAction$1.L$1 = g050Var;
            trackingLinkInteractor$processAction$1.L$2 = null;
            trackingLinkInteractor$processAction$1.L$3 = null;
            trackingLinkInteractor$processAction$1.label = 2;
            obj = bVar.b(sb22, trackingLinkInteractor$processAction$1);
            if (obj != obj2) {
            }
            return obj2;
        } catch (Throwable th4) {
            g050 g050Var3 = g050Var;
            th = th4;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        trackingLinkInteractor$processAction$1 = new TrackingLinkInteractor$processAction$1(bVar, continuationImpl);
        obj = trackingLinkInteractor$processAction$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingLinkInteractor$processAction$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        TrackingLinkInteractor$trackGoal$1 trackingLinkInteractor$trackGoal$1;
        int i;
        try {
            if (continuationImpl instanceof TrackingLinkInteractor$trackGoal$1) {
                trackingLinkInteractor$trackGoal$1 = (TrackingLinkInteractor$trackGoal$1) continuationImpl;
                int i2 = trackingLinkInteractor$trackGoal$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    trackingLinkInteractor$trackGoal$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = trackingLinkInteractor$trackGoal$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingLinkInteractor$trackGoal$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        TrackerApi trackerApi = this.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String a = this.b.a();
                        if (a != null && !evu0.J(a)) {
                            linkedHashMap.put("DeviceId", a);
                        }
                        cmt b = TrackerApi.b(trackerApi, str, linkedHashMap, 2);
                        trackingLinkInteractor$trackGoal$1.L$0 = null;
                        trackingLinkInteractor$trackGoal$1.L$1 = null;
                        trackingLinkInteractor$trackGoal$1.label = 1;
                        obj = b.a(trackingLinkInteractor$trackGoal$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return Boolean.valueOf(z1b1.b(((fmt) obj).b));
                }
            }
            if (i != 0) {
            }
            return Boolean.valueOf(z1b1.b(((fmt) obj).b));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
        trackingLinkInteractor$trackGoal$1 = new TrackingLinkInteractor$trackGoal$1(this, continuationImpl);
        Object obj2 = trackingLinkInteractor$trackGoal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingLinkInteractor$trackGoal$1.label;
    }
}
