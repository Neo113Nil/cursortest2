package com.yandex.go.yb.data;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.adjust.sdk.Constants;
import com.yandex.go.yb.api.domain.model.YbActivationStatus;
import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import com.yandex.go.yb.data.e;
import com.yandex.go.yb.domain.model.YbSdkEnvironment;
import com.ybsdk.api.push.YbPushPlatform;
import defpackage.bu51;
import defpackage.bvf0;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.fva0;
import defpackage.g050;
import defpackage.g5g0;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.hh51;
import defpackage.ie60;
import defpackage.ike;
import defpackage.j5z;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.kg51;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mu51;
import defpackage.mw51;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pse;
import defpackage.pw2;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qhw0;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.t1b0;
import defpackage.t4o;
import defpackage.tj21;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.u02;
import defpackage.uyj;
import defpackage.v4o;
import defpackage.vmp0;
import defpackage.vv51;
import defpackage.w4o;
import defpackage.w511;
import defpackage.wmp0;
import defpackage.ww51;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class e {
    public boolean A;
    public volatile cma1 B;
    public final r0 C;
    public final zuj0 a;
    public final Context b;
    public final j5z c;
    public final tt2 d;
    public final ru.yandex.taxi.am.g e;
    public final pw2 f;
    public final g5g0 g;
    public final tj21 h;
    public final ww51 i;
    public final mu51 j;
    public final fva0 k;
    public final h3y l;
    public final ru.yandex.taxi.am.m m;
    public final YbSdkEnvironment n;
    public final t1b0 o;
    public final ike p;
    public final LinkedBlockingDeque q;
    public final com.yandex.go.yb.domain.i r;
    public final com.yandex.go.yb.domain.f s;
    public final r0 t;
    public final r0 u;
    public final mth v;
    public pzt0 w;
    public pzt0 x;
    public pzt0 y;
    public final kotlinx.coroutines.sync.a z;

    public e(u02 u02Var, zuj0 zuj0Var, pwy0 pwy0Var, rqo rqoVar, Context context, Lifecycle lifecycle, j5z j5zVar, tt2 tt2Var, ru.yandex.taxi.am.g gVar, pw2 pw2Var, g5g0 g5g0Var, tj21 tj21Var, ww51 ww51Var, mu51 mu51Var, fva0 fva0Var, h3y h3yVar, ru.yandex.taxi.am.m mVar) {
        this.a = zuj0Var;
        this.b = context;
        this.c = j5zVar;
        this.d = tt2Var;
        this.e = gVar;
        this.f = pw2Var;
        this.g = g5g0Var;
        this.h = tj21Var;
        this.i = ww51Var;
        this.j = mu51Var;
        this.k = fva0Var;
        this.l = h3yVar;
        this.m = mVar;
        u02Var.getClass();
        this.n = YbSdkEnvironment.PROD;
        this.o = ((jbh) rqoVar).e(YbWalletEntryPointExperiment.i);
        qhw0 a = jl40.a();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        ike M = bvf0.M(bvf0.a(cvw.U(a, mdh.b)), new pse("SdkActivator"));
        this.p = M;
        this.q = new LinkedBlockingDeque();
        this.r = new com.yandex.go.yb.domain.i(lifecycle, M, gVar);
        this.s = new com.yandex.go.yb.domain.f(lifecycle, M, pwy0Var);
        this.t = bvf0.c(mw51.a);
        r0 c = bvf0.c(null);
        this.u = c;
        this.v = new mth(c, 6);
        this.z = gtq0.a();
        this.B = vv51.g;
        this.C = bvf0.c(YbActivationStatus.WAITING);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r1v6, types: [ump0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ump0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ContinuationImpl continuationImpl) {
        SdkActivator$initializeYbSdk$1 sdkActivator$initializeYbSdk$1;
        int i;
        w4o w4oVar;
        eVar.getClass();
        if (continuationImpl instanceof SdkActivator$initializeYbSdk$1) {
            sdkActivator$initializeYbSdk$1 = (SdkActivator$initializeYbSdk$1) continuationImpl;
            int i2 = sdkActivator$initializeYbSdk$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkActivator$initializeYbSdk$1.label = i2 - Integer.MIN_VALUE;
                SdkActivator$initializeYbSdk$1 sdkActivator$initializeYbSdk$12 = sdkActivator$initializeYbSdk$1;
                Object obj = sdkActivator$initializeYbSdk$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkActivator$initializeYbSdk$12.label;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i4 = wmp0.a[eVar.n.ordinal()];
                    if (i4 == 1) {
                        w4oVar = t4o.d;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        w4oVar = v4o.d;
                    }
                    w4o w4oVar2 = w4oVar;
                    final int i5 = 0;
                    hh51 hh51Var = new hh51(eVar.b, eVar.r, w4oVar2, new SdkActivator$initializeYbSdk$initDependencies$1(eVar.c, j5z.class, "acceptLanguageString", "getAcceptLanguageString()Ljava/lang/String;", 0), new SdkActivator$initializeYbSdk$initDependencies$2(eVar.h, tj21.class, "appUserAgent", "getAppUserAgent()Ljava/lang/String;", 0), new SdkActivator$initializeYbSdk$initDependencies$3(1, eVar, e.class, "providePushToken", "providePushToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new tls(eVar) { // from class: ump0
                        public final /* synthetic */ e b;

                        {
                            this.b = eVar;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i6 = i5;
                            e eVar2 = this.b;
                            switch (i6) {
                                case 0:
                                    eVar2.getClass();
                                    Uri.Builder builder = new Uri.Builder();
                                    ((pux0) eVar2.f).getClass();
                                    return builder.scheme(pux0.c).authority("yandex_bank").appendQueryParameter(Constants.DEEPLINK, Uri.encode(((Uri) obj2).toString())).build();
                                default:
                                    return Boolean.valueOf(((fs51) eVar2.l.get()).a((String) obj2));
                            }
                        }
                    }, eVar.s.a(), new tls(eVar) { // from class: ump0
                        public final /* synthetic */ e b;

                        {
                            this.b = eVar;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i6 = i3;
                            e eVar2 = this.b;
                            switch (i6) {
                                case 0:
                                    eVar2.getClass();
                                    Uri.Builder builder = new Uri.Builder();
                                    ((pux0) eVar2.f).getClass();
                                    return builder.scheme(pux0.c).authority("yandex_bank").appendQueryParameter(Constants.DEEPLINK, Uri.encode(((Uri) obj2).toString())).build();
                                default:
                                    return Boolean.valueOf(((fs51) eVar2.l.get()).a((String) obj2));
                            }
                        }
                    }, 7712);
                    kg51 kg51Var = new kg51(0);
                    eVar.d.getClass();
                    sjh sjhVar = uyj.a;
                    SdkActivator$initializeYbSdk$2 sdkActivator$initializeYbSdk$2 = new SdkActivator$initializeYbSdk$2(eVar, hh51Var, kg51Var, null);
                    sdkActivator$initializeYbSdk$12.L$0 = null;
                    sdkActivator$initializeYbSdk$12.L$1 = null;
                    sdkActivator$initializeYbSdk$12.L$2 = null;
                    sdkActivator$initializeYbSdk$12.label = 1;
                    if (tje.k0(sjhVar, sdkActivator$initializeYbSdk$2, sdkActivator$initializeYbSdk$12) == coroutineSingletons) {
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
        sdkActivator$initializeYbSdk$1 = new SdkActivator$initializeYbSdk$1(eVar, continuationImpl);
        SdkActivator$initializeYbSdk$1 sdkActivator$initializeYbSdk$122 = sdkActivator$initializeYbSdk$1;
        Object obj2 = sdkActivator$initializeYbSdk$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkActivator$initializeYbSdk$122.label;
        final int i32 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r6 == r7) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, Continuation continuation) {
        SdkActivator$providePushToken$1 sdkActivator$providePushToken$1;
        int i;
        String str;
        String str2;
        g5g0 g5g0Var = eVar.g;
        if (continuation instanceof SdkActivator$providePushToken$1) {
            sdkActivator$providePushToken$1 = (SdkActivator$providePushToken$1) continuation;
            int i2 = sdkActivator$providePushToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkActivator$providePushToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkActivator$providePushToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkActivator$providePushToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sdkActivator$providePushToken$1.label = 1;
                    obj = g5g0Var.a.b(sdkActivator$providePushToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        str2 = (String) obj;
                        if (str2 == null) {
                            return new bu51(str2, YbPushPlatform.HUAWEI);
                        }
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return new bu51(str, YbPushPlatform.FIREBASE);
                }
                sdkActivator$providePushToken$1.label = 2;
                g5g0Var.getClass();
                if (coroutineSingletons != null) {
                    obj = null;
                    str2 = (String) obj;
                    if (str2 == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        sdkActivator$providePushToken$1 = new SdkActivator$providePushToken$1(eVar, continuation);
        Object obj2 = sdkActivator$providePushToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkActivator$providePushToken$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    public final void c(boolean z) {
        this.B = new l(this.a, z, this.i, this.j);
        this.x = tje.N(this.p, null, null, new SdkActivator$activate$$inlined$safeCollectIn$1(this.B.i0(), com.yandex.go.coroutines.b.e(), null, this), 3);
        this.y = tje.N(this.p, null, null, new SdkActivator$activate$$inlined$safeCollectIn$2(this.B.h0(), com.yandex.go.coroutines.b.e(), null, this), 3);
    }

    public final void d(vmp0 vmp0Var) {
        int i = wmp0.b[((YbActivationStatus) this.C.getValue()).ordinal()];
        if (i == 1) {
            this.q.add(vmp0Var);
            return;
        }
        if (i == 2) {
            vmp0Var.a();
        } else if (i == 3) {
            vmp0Var.b();
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(3:(1:(5:15|16|17|18|19)(2:12|13))(10:24|25|26|27|28|(1:30)(1:35)|(2:32|33)|34|18|19)|22|23)(1:39))(3:72|(1:74)|33)|40|41|(2:(1:(1:(1:46))(2:65|66))(1:67)|(2:48|49)(2:(2:51|(1:53)(7:54|28|(0)(0)|(0)|34|18|19))(6:55|(1:57)|58|(1:60)|61|(1:63))|33))|68|(0)(0)))|75|6|(0)(0)|40|41|(0)|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
    
        if (r12 == r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ff, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fb, code lost:
    
        r11 = r13;
        r13 = r12;
        r12 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(YbWalletEntryPointExperiment ybWalletEntryPointExperiment, Continuation continuation) {
        SdkActivator$changeActivation$1 sdkActivator$changeActivation$1;
        int i;
        boolean z;
        YbWalletEntryPointExperiment ybWalletEntryPointExperiment2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        boolean z2;
        int i2;
        YbWalletEntryPointExperiment ybWalletEntryPointExperiment3;
        Object k0;
        zy11 zy11Var = zy11.a;
        if (continuation instanceof SdkActivator$changeActivation$1) {
            sdkActivator$changeActivation$1 = (SdkActivator$changeActivation$1) continuation;
            int i3 = sdkActivator$changeActivation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sdkActivator$changeActivation$1.label = i3 - Integer.MIN_VALUE;
                Object obj = sdkActivator$changeActivation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkActivator$changeActivation$1.label;
                z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.sync.a aVar = this.z;
                    sdkActivator$changeActivation$1.L$0 = ybWalletEntryPointExperiment;
                    sdkActivator$changeActivation$1.L$1 = aVar;
                    sdkActivator$changeActivation$1.label = 1;
                    if (aVar.a(sdkActivator$changeActivation$1) != coroutineSingletons) {
                        ybWalletEntryPointExperiment2 = ybWalletEntryPointExperiment;
                        g050Var = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        boolean z3 = sdkActivator$changeActivation$1.Z$0;
                        g050 g050Var3 = (g050) sdkActivator$changeActivation$1.L$1;
                        ybWalletEntryPointExperiment3 = (YbWalletEntryPointExperiment) sdkActivator$changeActivation$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            z2 = z3;
                            g050Var = g050Var3;
                            c(ybWalletEntryPointExperiment3.e);
                            sdkActivator$changeActivation$1.L$0 = null;
                            sdkActivator$changeActivation$1.L$1 = g050Var;
                            sdkActivator$changeActivation$1.L$2 = null;
                            sdkActivator$changeActivation$1.Z$0 = z2;
                            sdkActivator$changeActivation$1.label = 3;
                            this.C.l(YbActivationStatus.ACTIVATED);
                            this.d.getClass();
                            sjh sjhVar = uyj.a;
                            k0 = tje.k0(o400.a, new SdkActivator$onActivated$2(this, null), sdkActivator$changeActivation$1);
                            if (k0 == coroutineSingletons) {
                                k0 = zy11Var;
                            }
                            if (k0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            g050Var2 = g050Var;
                            g050Var2.d(null);
                            return zy11Var;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2 = g050Var3;
                        }
                    } else {
                        if (i != 3 && i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) sdkActivator$changeActivation$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            g050Var2.d(null);
                            return zy11Var;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    g050Var2.d(null);
                    throw th;
                }
                g050Var = (g050) sdkActivator$changeActivation$1.L$1;
                ybWalletEntryPointExperiment2 = (YbWalletEntryPointExperiment) sdkActivator$changeActivation$1.L$0;
                kotlin.b.b(obj);
                z2 = ybWalletEntryPointExperiment2.b;
                i2 = wmp0.b[((YbActivationStatus) this.C.getValue()).ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        z = z2;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!z2) {
                        }
                    }
                    if (z) {
                        g050Var.d(null);
                        return zy11Var;
                    }
                    if (z2) {
                        ie60 ie60Var = ie60.a;
                        SdkActivator$changeActivation$2$1 sdkActivator$changeActivation$2$1 = new SdkActivator$changeActivation$2$1(this, null);
                        sdkActivator$changeActivation$1.L$0 = ybWalletEntryPointExperiment2;
                        sdkActivator$changeActivation$1.L$1 = g050Var;
                        sdkActivator$changeActivation$1.L$2 = null;
                        sdkActivator$changeActivation$1.Z$0 = z2;
                        sdkActivator$changeActivation$1.label = 2;
                        if (tje.k0(ie60Var, sdkActivator$changeActivation$2$1, sdkActivator$changeActivation$1) != coroutineSingletons) {
                            ybWalletEntryPointExperiment3 = ybWalletEntryPointExperiment2;
                            c(ybWalletEntryPointExperiment3.e);
                            sdkActivator$changeActivation$1.L$0 = null;
                            sdkActivator$changeActivation$1.L$1 = g050Var;
                            sdkActivator$changeActivation$1.L$2 = null;
                            sdkActivator$changeActivation$1.Z$0 = z2;
                            sdkActivator$changeActivation$1.label = 3;
                            this.C.l(YbActivationStatus.ACTIVATED);
                            this.d.getClass();
                            sjh sjhVar2 = uyj.a;
                            k0 = tje.k0(o400.a, new SdkActivator$onActivated$2(this, null), sdkActivator$changeActivation$1);
                            if (k0 == coroutineSingletons) {
                            }
                            if (k0 == coroutineSingletons) {
                            }
                            g050Var2 = g050Var;
                            g050Var2.d(null);
                            return zy11Var;
                        }
                    } else {
                        pzt0 pzt0Var = this.x;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        pzt0 pzt0Var2 = this.y;
                        if (pzt0Var2 != null) {
                            pzt0Var2.a(null);
                        }
                        r0 r0Var = this.t;
                        mw51 mw51Var = mw51.a;
                        r0Var.getClass();
                        r0Var.m(null, mw51Var);
                        this.u.l(null);
                        this.B = vv51.g;
                        sdkActivator$changeActivation$1.L$0 = null;
                        sdkActivator$changeActivation$1.L$1 = g050Var;
                        sdkActivator$changeActivation$1.L$2 = null;
                        sdkActivator$changeActivation$1.Z$0 = z2;
                        sdkActivator$changeActivation$1.label = 4;
                        this.C.l(YbActivationStatus.REJECTED);
                        this.d.getClass();
                        sjh sjhVar3 = uyj.a;
                        Object k02 = tje.k0(o400.a, new SdkActivator$onRejected$2(this, null), sdkActivator$changeActivation$1);
                        if (k02 != coroutineSingletons) {
                            k02 = zy11Var;
                        }
                    }
                    return coroutineSingletons;
                }
                z = false;
                if (z) {
                }
            }
        }
        sdkActivator$changeActivation$1 = new SdkActivator$changeActivation$1(this, continuation);
        Object obj2 = sdkActivator$changeActivation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkActivator$changeActivation$1.label;
        z = true;
        if (i != 0) {
        }
        z2 = ybWalletEntryPointExperiment2.b;
        i2 = wmp0.b[((YbActivationStatus) this.C.getValue()).ordinal()];
        if (i2 != 1) {
        }
        z = false;
        if (z) {
        }
    }

    public final boolean f() {
        return this.C.getValue() == YbActivationStatus.ACTIVATED;
    }

    public final void g() {
        this.w = tje.N(this.p, null, null, new SdkActivator$start$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (e(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        SdkActivator$tryActivate$1 sdkActivator$tryActivate$1;
        int i;
        YbWalletEntryPointExperiment ybWalletEntryPointExperiment;
        if (continuationImpl instanceof SdkActivator$tryActivate$1) {
            sdkActivator$tryActivate$1 = (SdkActivator$tryActivate$1) continuationImpl;
            int i2 = sdkActivator$tryActivate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkActivator$tryActivate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkActivator$tryActivate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkActivator$tryActivate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (f()) {
                        return Boolean.TRUE;
                    }
                    if (this.e.f()) {
                        return Boolean.FALSE;
                    }
                    sdkActivator$tryActivate$1.label = 1;
                    obj = this.o.b(sdkActivator$tryActivate$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return Boolean.valueOf(f());
                    }
                    kotlin.b.b(obj);
                }
                ybWalletEntryPointExperiment = (YbWalletEntryPointExperiment) obj;
                if (ybWalletEntryPointExperiment.b) {
                    return Boolean.FALSE;
                }
                sdkActivator$tryActivate$1.L$0 = null;
                sdkActivator$tryActivate$1.label = 2;
            }
        }
        sdkActivator$tryActivate$1 = new SdkActivator$tryActivate$1(this, continuationImpl);
        Object obj3 = sdkActivator$tryActivate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkActivator$tryActivate$1.label;
        if (i != 0) {
        }
        ybWalletEntryPointExperiment = (YbWalletEntryPointExperiment) obj3;
        if (ybWalletEntryPointExperiment.b) {
        }
    }
}
