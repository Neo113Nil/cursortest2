package com.yandex.mobile.drive.scan.service;

import android.os.SystemClock;
import defpackage.am31;
import defpackage.bn31;
import defpackage.cxt;
import defpackage.gw00;
import defpackage.h2b1;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tk31;
import defpackage.uyj;
import defpackage.ycc;
import defpackage.zls;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes15.dex */
public final class d {
    public static final d a = new d();
    public static final ArrayList b = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, tk31 tk31Var, long j, ContinuationImpl continuationImpl) {
        Grabber$doClipVideo$1 grabber$doClipVideo$1;
        int i;
        Throwable th;
        bn31 bn31Var;
        tk31 tk31Var2;
        qgn0 qgn0Var;
        qgn0 qgn0Var2;
        dVar.getClass();
        try {
            if (continuationImpl instanceof Grabber$doClipVideo$1) {
                grabber$doClipVideo$1 = (Grabber$doClipVideo$1) continuationImpl;
                int i2 = grabber$doClipVideo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    grabber$doClipVideo$1.label = i2 - Integer.MIN_VALUE;
                    Grabber$doClipVideo$1 grabber$doClipVideo$12 = grabber$doClipVideo$1;
                    Object obj = grabber$doClipVideo$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = grabber$doClipVideo$12.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        File file = tk31Var.a;
                        String name = file.getName();
                        bn31 bn31Var2 = new bn31(name);
                        Double d = new Double(file.length());
                        bn31Var2.b = SystemClock.uptimeMillis();
                        HashMap h = kotlin.collections.b.h(new Pair("name", name));
                        h.put("size", d);
                        qgn0 qgn0Var3 = h2b1.c;
                        if (qgn0Var3 != null) {
                            qgn0Var3.n("video_processing", h);
                        }
                        try {
                            try {
                                if (tk31Var.b <= j) {
                                    try {
                                        bn31Var2.b(new Double(file.length()));
                                        return zy11Var;
                                    } catch (TimeoutCancellationException e) {
                                        e = e;
                                        tk31Var2 = tk31Var;
                                        bn31Var = bn31Var2;
                                        bn31Var.a("timeout: " + e.getMessage());
                                        Map e2 = gw00.e(new Pair("duration", Long.valueOf(tk31Var2.b / 1000)));
                                        qgn0Var2 = h2b1.c;
                                        if (qgn0Var2 != null) {
                                            qgn0Var2.n("debug_video_transcode_timed_out", e2);
                                        }
                                        return zy11Var;
                                    }
                                }
                                Grabber$doClipVideo$4 grabber$doClipVideo$4 = new Grabber$doClipVideo$4(bn31Var2, file, tk31Var, j, new File(file.getAbsolutePath() + "_clip"), null);
                                grabber$doClipVideo$12.L$0 = tk31Var;
                                grabber$doClipVideo$12.L$1 = null;
                                grabber$doClipVideo$12.L$2 = bn31Var2;
                                grabber$doClipVideo$12.L$3 = null;
                                grabber$doClipVideo$12.L$4 = null;
                                grabber$doClipVideo$12.J$0 = j;
                                grabber$doClipVideo$12.label = 1;
                                if (kotlinx.coroutines.a.u(15000L, grabber$doClipVideo$4, grabber$doClipVideo$12) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bn31Var = bn31Var2;
                                bn31Var.a("trim failed: " + th.getMessage());
                                qgn0Var = h2b1.c;
                                if (qgn0Var != null) {
                                    qgn0Var.o("debug_video_transcode_failed", th);
                                }
                                return zy11Var;
                            }
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bn31Var = (bn31) grabber$doClipVideo$12.L$2;
                        tk31 tk31Var3 = (tk31) grabber$doClipVideo$12.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (TimeoutCancellationException e4) {
                            e = e4;
                            tk31Var2 = tk31Var3;
                            bn31Var.a("timeout: " + e.getMessage());
                            Map e22 = gw00.e(new Pair("duration", Long.valueOf(tk31Var2.b / 1000)));
                            qgn0Var2 = h2b1.c;
                            if (qgn0Var2 != null) {
                            }
                            return zy11Var;
                        } catch (Throwable th3) {
                            th = th3;
                            bn31Var.a("trim failed: " + th.getMessage());
                            qgn0Var = h2b1.c;
                            if (qgn0Var != null) {
                            }
                            return zy11Var;
                        }
                    }
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            return zy11Var;
        } catch (CancellationException e5) {
            throw e5;
        }
        grabber$doClipVideo$1 = new Grabber$doClipVideo$1(dVar, continuationImpl);
        Grabber$doClipVideo$1 grabber$doClipVideo$122 = grabber$doClipVideo$1;
        Object obj2 = grabber$doClipVideo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = grabber$doClipVideo$122.label;
        zy11 zy11Var2 = zy11.a;
    }

    public static Object b(tk31 tk31Var, ContinuationImpl continuationImpl) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new Grabber$clipVideo$2(tk31Var, 10000L, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e0 -> B:11:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zls zlsVar, ContinuationImpl continuationImpl) {
        Grabber$processAndUploadPending$1 grabber$processAndUploadPending$1;
        int i;
        HashSet hashSet;
        Iterator it;
        int i2;
        int i3;
        int i4;
        zls zlsVar2;
        Iterator it2;
        HashSet hashSet2;
        tk31 tk31Var;
        am31 am31Var;
        if (continuationImpl instanceof Grabber$processAndUploadPending$1) {
            grabber$processAndUploadPending$1 = (Grabber$processAndUploadPending$1) continuationImpl;
            int i5 = grabber$processAndUploadPending$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                grabber$processAndUploadPending$1.label = i5 - Integer.MIN_VALUE;
                Object obj = grabber$processAndUploadPending$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = grabber$processAndUploadPending$1.label;
                ArrayList arrayList = b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (arrayList.isEmpty()) {
                        return Boolean.TRUE;
                    }
                    hashSet = new HashSet();
                    it = new ArrayList(arrayList).iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        int i6 = grabber$processAndUploadPending$1.I$1;
                        int i7 = grabber$processAndUploadPending$1.I$0;
                        tk31Var = (tk31) grabber$processAndUploadPending$1.L$6;
                        am31 am31Var2 = (am31) grabber$processAndUploadPending$1.L$5;
                        it2 = (Iterator) grabber$processAndUploadPending$1.L$3;
                        HashSet hashSet3 = (HashSet) grabber$processAndUploadPending$1.L$1;
                        zlsVar2 = (zls) grabber$processAndUploadPending$1.L$0;
                        kotlin.b.b(obj);
                        i4 = i6;
                        i3 = i7;
                        am31Var = am31Var2;
                        hashSet2 = hashSet3;
                        String str = am31Var.a;
                        File file = tk31Var.a;
                        grabber$processAndUploadPending$1.L$0 = zlsVar2;
                        grabber$processAndUploadPending$1.L$1 = hashSet2;
                        grabber$processAndUploadPending$1.L$2 = null;
                        grabber$processAndUploadPending$1.L$3 = it2;
                        grabber$processAndUploadPending$1.L$4 = null;
                        grabber$processAndUploadPending$1.L$5 = am31Var;
                        grabber$processAndUploadPending$1.L$6 = null;
                        grabber$processAndUploadPending$1.I$0 = i3;
                        grabber$processAndUploadPending$1.I$1 = i4;
                        grabber$processAndUploadPending$1.label = 2;
                        obj = zlsVar2.invoke(str, file, grabber$processAndUploadPending$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = grabber$processAndUploadPending$1.I$0;
                    am31Var = (am31) grabber$processAndUploadPending$1.L$5;
                    Iterator it3 = (Iterator) grabber$processAndUploadPending$1.L$3;
                    hashSet2 = (HashSet) grabber$processAndUploadPending$1.L$1;
                    zls zlsVar3 = (zls) grabber$processAndUploadPending$1.L$0;
                    kotlin.b.b(obj);
                    int i9 = i8;
                    zlsVar = zlsVar3;
                    if (((Boolean) obj).booleanValue()) {
                        am31Var.b.a.delete();
                        hashSet2.add(am31Var.a);
                    }
                    it = it3;
                    hashSet = hashSet2;
                    i2 = i9;
                    if (it.hasNext()) {
                        am31 am31Var3 = (am31) it.next();
                        tk31 tk31Var2 = am31Var3.b;
                        grabber$processAndUploadPending$1.L$0 = zlsVar;
                        grabber$processAndUploadPending$1.L$1 = hashSet;
                        grabber$processAndUploadPending$1.L$2 = null;
                        grabber$processAndUploadPending$1.L$3 = it;
                        grabber$processAndUploadPending$1.L$4 = null;
                        grabber$processAndUploadPending$1.L$5 = am31Var3;
                        grabber$processAndUploadPending$1.L$6 = tk31Var2;
                        grabber$processAndUploadPending$1.I$0 = i2;
                        grabber$processAndUploadPending$1.I$1 = 0;
                        grabber$processAndUploadPending$1.label = 1;
                        if (b(tk31Var2, grabber$processAndUploadPending$1) != coroutineSingletons) {
                            zlsVar2 = zlsVar;
                            i3 = i2;
                            tk31Var = tk31Var2;
                            it2 = it;
                            am31Var = am31Var3;
                            hashSet2 = hashSet;
                            i4 = 0;
                            String str2 = am31Var.a;
                            File file2 = tk31Var.a;
                            grabber$processAndUploadPending$1.L$0 = zlsVar2;
                            grabber$processAndUploadPending$1.L$1 = hashSet2;
                            grabber$processAndUploadPending$1.L$2 = null;
                            grabber$processAndUploadPending$1.L$3 = it2;
                            grabber$processAndUploadPending$1.L$4 = null;
                            grabber$processAndUploadPending$1.L$5 = am31Var;
                            grabber$processAndUploadPending$1.L$6 = null;
                            grabber$processAndUploadPending$1.I$0 = i3;
                            grabber$processAndUploadPending$1.I$1 = i4;
                            grabber$processAndUploadPending$1.label = 2;
                            obj = zlsVar2.invoke(str2, file2, grabber$processAndUploadPending$1);
                            if (obj != coroutineSingletons) {
                                it3 = it2;
                                i9 = i3;
                                zlsVar = zlsVar2;
                                if (((Boolean) obj).booleanValue()) {
                                }
                                it = it3;
                                hashSet = hashSet2;
                                i2 = i9;
                                if (it.hasNext()) {
                                    ycc.w(arrayList, new cxt(0, hashSet), true);
                                    return Boolean.valueOf(arrayList.isEmpty());
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        grabber$processAndUploadPending$1 = new Grabber$processAndUploadPending$1(this, continuationImpl);
        Object obj2 = grabber$processAndUploadPending$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = grabber$processAndUploadPending$1.label;
        ArrayList arrayList2 = b;
        if (i != 0) {
        }
    }
}
