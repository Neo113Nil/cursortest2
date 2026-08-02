package com.yandex.go.dynamic.impl;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.dynamic.impl.exceptions.DynamicFeatureException;
import defpackage.a80;
import defpackage.a8n;
import defpackage.alw0;
import defpackage.b64;
import defpackage.b8n;
import defpackage.c8n;
import defpackage.cl7;
import defpackage.d8n;
import defpackage.dvw;
import defpackage.dxd;
import defpackage.e90;
import defpackage.g050;
import defpackage.g7n;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.h7n;
import defpackage.hbp0;
import defpackage.hhs0;
import defpackage.i3y;
import defpackage.i7n;
import defpackage.ij3;
import defpackage.ike;
import defpackage.j1;
import defpackage.j18;
import defpackage.j7n;
import defpackage.jl40;
import defpackage.k7n;
import defpackage.kn2;
import defpackage.lse;
import defpackage.lvt0;
import defpackage.mvt0;
import defpackage.nvt0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pz40;
import defpackage.qoh;
import defpackage.rol0;
import defpackage.sbc;
import defpackage.t8j;
import defpackage.tje;
import defpackage.tt2;
import defpackage.v8e;
import defpackage.vj;
import defpackage.wj;
import defpackage.wjm;
import defpackage.y5e;
import defpackage.y7n;
import defpackage.yw60;
import defpackage.yzh;
import defpackage.z7n;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class b implements i7n, yw60 {
    public static final c8n i = new c8n();
    public static final a8n j = new a8n();
    public static final z7n k = new z7n();
    public final Context a;
    public final tt2 b;
    public final g7n c;
    public final hbp0 g;
    public final LinkedHashMap d = new LinkedHashMap();
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final i3y h = kotlin.a.a(new sbc(16, this));

    public b(Context context, tt2 tt2Var, g7n g7nVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = g7nVar;
        int i2 = 2;
        this.g = new hbp0(new DynamicFeatureLoaderImpl$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, new ij3(lse.a, i2), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, j7n] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.go.dynamic.impl.a, nvt0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(final b bVar, final DynamicFeature dynamicFeature, final r0 r0Var, ContinuationImpl continuationImpl) {
        DynamicFeatureLoaderImpl$downloadFeature$1 dynamicFeatureLoaderImpl$downloadFeature$1;
        int i2;
        bVar.getClass();
        if (continuationImpl instanceof DynamicFeatureLoaderImpl$downloadFeature$1) {
            dynamicFeatureLoaderImpl$downloadFeature$1 = (DynamicFeatureLoaderImpl$downloadFeature$1) continuationImpl;
            int i3 = dynamicFeatureLoaderImpl$downloadFeature$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dynamicFeatureLoaderImpl$downloadFeature$1.label = i3 - Integer.MIN_VALUE;
                Object obj = dynamicFeatureLoaderImpl$downloadFeature$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dynamicFeatureLoaderImpl$downloadFeature$1.label;
                int i4 = 1;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    dynamicFeatureLoaderImpl$downloadFeature$1.L$0 = dynamicFeature;
                    dynamicFeatureLoaderImpl$downloadFeature$1.L$1 = r0Var;
                    dynamicFeatureLoaderImpl$downloadFeature$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(dynamicFeatureLoaderImpl$downloadFeature$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    vj vjVar = new vj(12, y);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    DynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2 dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2 = new DynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2(cl7Var);
                    hhs0 a = SplitInstallRequest.a();
                    a.g(dynamicFeature.getId());
                    SplitInstallRequest h = a.h();
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    final k7n k7nVar = new k7n(bVar, dynamicFeature, dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2, 0);
                    final k7n k7nVar2 = new k7n(bVar, dynamicFeature, dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2, i4);
                    final a80 a80Var = new a80(8, ref$IntRef);
                    ?? r0 = new nvt0() { // from class: com.yandex.go.dynamic.impl.a
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        @Override // defpackage.nvt0
                        public final void a(Object obj2) {
                            Class<?> cls;
                            Activity activity;
                            mvt0 mvt0Var = (mvt0) obj2;
                            Object obj3 = b.k;
                            if (mvt0Var.g() != ((Number) a80.this.invoke()).intValue()) {
                                return;
                            }
                            int h2 = mvt0Var.h();
                            b bVar2 = bVar;
                            DynamicFeature dynamicFeature2 = dynamicFeature;
                            k7n k7nVar3 = k7nVar2;
                            switch (h2) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    bVar2.getClass();
                                    break;
                                case 5:
                                    bVar2.getClass();
                                    try {
                                        cls = Class.forName(dynamicFeature2.getTargetClass());
                                    } catch (ClassNotFoundException | LinkageError unused) {
                                        cls = null;
                                    }
                                    h7n k2 = b.k(dynamicFeature2, cls);
                                    k7nVar.invoke(k2);
                                    obj3 = new b8n(k2);
                                    break;
                                case 6:
                                    final String str = "failed";
                                    k7nVar3.invoke(new RuntimeException(str) { // from class: com.yandex.go.dynamic.impl.analytics.DynamicFeatureAnalytics$DynamicFeatureDownloadError
                                        private final String status;

                                        {
                                            this.status = str;
                                        }

                                        @Override // java.lang.Throwable
                                        public final String getMessage() {
                                            return g8e.o("status: ", this.status);
                                        }
                                    });
                                    obj3 = new y7n(new DynamicFeatureException.DynamicFeatureDownloadingException());
                                    break;
                                case 7:
                                    final String str2 = "canceled";
                                    k7nVar3.invoke(new RuntimeException(str2) { // from class: com.yandex.go.dynamic.impl.analytics.DynamicFeatureAnalytics$DynamicFeatureDownloadError
                                        private final String status;

                                        {
                                            this.status = str2;
                                        }

                                        @Override // java.lang.Throwable
                                        public final String getMessage() {
                                            return g8e.o("status: ", this.status);
                                        }
                                    });
                                    obj3 = new y7n(new DynamicFeatureException.DynamicFeatureCanceledException());
                                    break;
                                case 8:
                                    WeakReference weakReference = y5e.d0;
                                    if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
                                        tje.N(bVar2.g.c(), null, null, new DynamicFeatureLoaderImpl$showConfirmationDialog$1(bVar2, dynamicFeature2, mvt0Var, activity, null), 3);
                                    }
                                    obj3 = null;
                                    break;
                                case 9:
                                    bVar2.getClass();
                                    break;
                                default:
                                    obj3 = null;
                                    break;
                            }
                            if (obj3 != null) {
                                r0 r0Var2 = (r0) r0Var;
                                r0Var2.getClass();
                                r0Var2.m(null, obj3);
                            }
                        }
                    };
                    bVar.m().f(r0);
                    bVar.m().a(h).f(new yzh(new j1(11, ref$IntRef))).d(new wjm(dynamicFeatureLoaderImpl$downloadFeature$$inlined$suspendCallbackApi$2, bVar, dynamicFeature, r0Var, 5));
                    y.element = new j7n(bVar, r0, dynamicFeature, ref$IntRef, r0Var);
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, 12));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        dynamicFeatureLoaderImpl$downloadFeature$1 = new DynamicFeatureLoaderImpl$downloadFeature$1(bVar, continuationImpl);
        Object obj2 = dynamicFeatureLoaderImpl$downloadFeature$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = dynamicFeatureLoaderImpl$downloadFeature$1.label;
        int i42 = 1;
        if (i2 != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(b bVar, DynamicFeature dynamicFeature, ContinuationImpl continuationImpl) {
        DynamicFeatureLoaderImpl$internalFeatureStateFlow$1 dynamicFeatureLoaderImpl$internalFeatureStateFlow$1;
        int i2;
        kotlinx.coroutines.sync.a aVar;
        bVar.getClass();
        try {
            if (continuationImpl instanceof DynamicFeatureLoaderImpl$internalFeatureStateFlow$1) {
                dynamicFeatureLoaderImpl$internalFeatureStateFlow$1 = (DynamicFeatureLoaderImpl$internalFeatureStateFlow$1) continuationImpl;
                int i3 = dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.label;
                    int i4 = 1;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        aVar = bVar.e;
                        dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.L$0 = dynamicFeature;
                        dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.L$1 = aVar;
                        dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.label = 1;
                        if (aVar.a(dynamicFeatureLoaderImpl$internalFeatureStateFlow$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.L$1;
                        DynamicFeature dynamicFeature2 = (DynamicFeature) dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        dynamicFeature = dynamicFeature2;
                    }
                    return (pz40) bVar.d.computeIfAbsent(dynamicFeature, new dxd(i4, new kn2(9, bVar, dynamicFeature)));
                }
            }
            return (pz40) bVar.d.computeIfAbsent(dynamicFeature, new dxd(i4, new kn2(9, bVar, dynamicFeature)));
        } finally {
            aVar.d(null);
        }
        dynamicFeatureLoaderImpl$internalFeatureStateFlow$1 = new DynamicFeatureLoaderImpl$internalFeatureStateFlow$1(bVar, continuationImpl);
        Object obj2 = dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = dynamicFeatureLoaderImpl$internalFeatureStateFlow$1.label;
        int i42 = 1;
        if (i2 != 0) {
        }
    }

    public static h7n k(DynamicFeature dynamicFeature, Class cls) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i2];
            if (jl40.l(field.getName(), "INSTANCE") && jl40.l(field.getType(), cls)) {
                break;
            }
            i2++;
        }
        if (field != null) {
            return (h7n) field.get(null);
        }
        ny61.r(oyr.p("Invalid feature entry point. ", dynamicFeature.getTargetClass(), " must be kotlin object"));
        return null;
    }

    public static d8n n(DynamicFeature dynamicFeature) {
        Class<?> cls;
        List list = alw0.a;
        if (!alw0.a.contains(dynamicFeature)) {
            return i;
        }
        try {
            cls = Class.forName(dynamicFeature.getTargetClass());
        } catch (ClassNotFoundException | LinkageError unused) {
            cls = null;
        }
        return cls != null ? new b8n(k(dynamicFeature, cls)) : j;
    }

    @Override // defpackage.yw60
    public final void e() {
        this.g.a();
    }

    @Override // defpackage.s150
    public final String getName() {
        return "DynamicFeatureLoaderImpl";
    }

    public final rol0 j(DynamicFeature dynamicFeature) {
        return new rol0(new DynamicFeatureLoaderImpl$featureFlow$1(dynamicFeature, this, null));
    }

    @Override // defpackage.yw60
    public final void l() {
        hbp0 hbp0Var = this.g;
        kotlinx.coroutines.a.g(((ike) hbp0Var.c()).a, null);
        this.d.clear();
        hbp0Var.b();
    }

    public final lvt0 m() {
        return (lvt0) this.h.getValue();
    }

    public final void o(DynamicFeature dynamicFeature) {
        m().b(Collections.singletonList(dynamicFeature.getId())).f(new v8e(29, new t8j(21, this, dynamicFeature))).d(new e90(26, this, dynamicFeature));
    }

    public final qoh p(DynamicFeature dynamicFeature) {
        return tje.h(this.g.c(), null, null, new DynamicFeatureLoaderImpl$startDownload$1(dynamicFeature, this, null), 3);
    }
}
