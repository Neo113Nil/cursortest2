package com.google.firebase.sessions.settings;

import android.os.Build;
import defpackage.d03;
import defpackage.e3n;
import defpackage.e3w;
import defpackage.e7z0;
import defpackage.fwi0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hcr;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tje;
import defpackage.xcr0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public final class a implements xcr0 {
    public static final int g;
    public static final Regex h;
    public final e7z0 a;
    public final hcr b;
    public final d03 c;
    public final fwi0 d;
    public final c e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    static {
        o430 o430Var = e3n.b;
        g = (int) e3n.o(kp50.U(24, DurationUnit.HOURS), DurationUnit.SECONDS);
        h = new Regex("/");
    }

    public a(e7z0 e7z0Var, hcr hcrVar, d03 d03Var, fwi0 fwi0Var, c cVar) {
        this.a = e7z0Var;
        this.b = hcrVar;
        this.c = d03Var;
        this.d = fwi0Var;
        this.e = cVar;
    }

    @Override // defpackage.xcr0
    public final Double a() {
        return this.e.a().b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0084, code lost:
    
        if (r1.a(r3) == r4) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:25:0x0050, B:26:0x00ab, B:30:0x00b9), top: B:24:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[Catch: all -> 0x013e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x013e, blocks: (B:41:0x0088, B:45:0x0094), top: B:40:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v11, types: [g050] */
    @Override // defpackage.xcr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        g050 g050Var2;
        String str;
        a aVar2 = this;
        try {
            if (continuation instanceof RemoteSettings$updateSettings$1) {
                remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) continuation;
                int i2 = remoteSettings$updateSettings$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    remoteSettings$updateSettings$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = remoteSettings$updateSettings$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = remoteSettings$updateSettings$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = aVar2.f;
                        if (!aVar.c() && !aVar2.e.b()) {
                            return zy11Var;
                        }
                        remoteSettings$updateSettings$1.L$0 = aVar2;
                        remoteSettings$updateSettings$1.L$1 = aVar;
                        remoteSettings$updateSettings$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                g050Var = (g050) remoteSettings$updateSettings$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    g050Var.d(null);
                                    return zy11Var;
                                } catch (Throwable th) {
                                    th = th;
                                    g050Var.d(null);
                                    throw th;
                                }
                            }
                            g050Var2 = (g050) remoteSettings$updateSettings$1.L$1;
                            aVar2 = (a) remoteSettings$updateSettings$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                str = ((e3w) obj).a;
                                if (!str.equals("")) {
                                    g050Var2.d(null);
                                    return zy11Var;
                                }
                                Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                                String str2 = Build.MANUFACTURER + Build.MODEL;
                                aVar2.getClass();
                                Regex regex = h;
                                Pair pair2 = new Pair("X-Crashlytics-Device-Model", regex.j(str2, ""));
                                Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", regex.j(Build.VERSION.INCREMENTAL, ""));
                                Pair pair4 = new Pair("X-Crashlytics-OS-Display-Version", regex.j(Build.VERSION.RELEASE, ""));
                                aVar2.c.getClass();
                                Map i3 = kotlin.collections.b.i(pair, pair2, pair3, pair4, new Pair("X-Crashlytics-API-Client-Version", "3.0.3"));
                                fwi0 fwi0Var = aVar2.d;
                                RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(aVar2, null);
                                RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, null);
                                remoteSettings$updateSettings$1.L$0 = g050Var2;
                                remoteSettings$updateSettings$1.L$1 = null;
                                remoteSettings$updateSettings$1.label = 3;
                                Object k0 = tje.k0(fwi0Var.b, new RemoteSettingsFetcher$doConfigFetch$2(fwi0Var, i3, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, null), remoteSettings$updateSettings$1);
                                if (k0 != coroutineSingletons) {
                                    k0 = zy11Var;
                                }
                                if (k0 != coroutineSingletons) {
                                    g050Var = g050Var2;
                                    g050Var.d(null);
                                    return zy11Var;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var = g050Var2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r0 = (g050) remoteSettings$updateSettings$1.L$1;
                        a aVar3 = (a) remoteSettings$updateSettings$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r0;
                        aVar2 = aVar3;
                    }
                    if (aVar2.e.b()) {
                        aVar.d(null);
                        return zy11Var;
                    }
                    com.google.firebase.sessions.b bVar = e3w.c;
                    hcr hcrVar = aVar2.b;
                    remoteSettings$updateSettings$1.L$0 = aVar2;
                    remoteSettings$updateSettings$1.L$1 = aVar;
                    remoteSettings$updateSettings$1.label = 2;
                    Object a = bVar.a(hcrVar, remoteSettings$updateSettings$1);
                    if (a != coroutineSingletons) {
                        g050Var2 = aVar;
                        obj = a;
                        str = ((e3w) obj).a;
                        if (!str.equals("")) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (aVar2.e.b()) {
            }
        } catch (Throwable th3) {
            th = th3;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(aVar2, (ContinuationImpl) continuation);
        Object obj2 = remoteSettings$updateSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteSettings$updateSettings$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    @Override // defpackage.xcr0
    public final Boolean c() {
        return this.e.a().a;
    }

    @Override // defpackage.xcr0
    public final e3n d() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        o430 o430Var = e3n.b;
        return new e3n(kp50.U(num.intValue(), DurationUnit.SECONDS));
    }
}
