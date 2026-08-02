package com.yandex.go.platform.navigation.impl;

import defpackage.g050;
import defpackage.ny61;
import defpackage.t850;
import defpackage.vpr;
import defpackage.wg41;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ List a;
    public final /* synthetic */ c b;
    public final /* synthetic */ d c;

    public b(List list, c cVar, d dVar) {
        this.a = list;
        this.b = cVar;
        this.c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
    
        if (com.yandex.go.platform.navigation.impl.c.a(r2, r11, r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #3 {all -> 0x00ce, blocks: (B:30:0x009a, B:33:0x00a6, B:35:0x00ac), top: B:29:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v16, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v19, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v8, types: [g050] */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(wg41 wg41Var, Continuation continuation) {
        NavigationPresenter$onLaunched$1$1$emit$1 navigationPresenter$onLaunched$1$1$emit$1;
        int i;
        ArrayList m0;
        kotlinx.coroutines.sync.a aVar;
        wg41 wg41Var2;
        c cVar;
        ?? r9;
        wls wlsVar;
        b bVar;
        wg41 wg41Var3;
        ArrayList arrayList;
        wg41 wg41Var4;
        b bVar2;
        kotlinx.coroutines.sync.a aVar2;
        try {
            try {
                if (continuation instanceof NavigationPresenter$onLaunched$1$1$emit$1) {
                    navigationPresenter$onLaunched$1$1$emit$1 = (NavigationPresenter$onLaunched$1$1$emit$1) continuation;
                    int i2 = navigationPresenter$onLaunched$1$1$emit$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        navigationPresenter$onLaunched$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = navigationPresenter$onLaunched$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = navigationPresenter$onLaunched$1$1$emit$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            wg41Var.getClass();
                            m0 = kotlin.collections.a.m0(this.a, EmptyList.a);
                            c cVar2 = this.b;
                            aVar = cVar2.h;
                            navigationPresenter$onLaunched$1$1$emit$1.L$0 = this;
                            navigationPresenter$onLaunched$1$1$emit$1.L$1 = wg41Var;
                            navigationPresenter$onLaunched$1$1$emit$1.L$2 = m0;
                            navigationPresenter$onLaunched$1$1$emit$1.L$3 = cVar2;
                            navigationPresenter$onLaunched$1$1$emit$1.L$4 = aVar;
                            navigationPresenter$onLaunched$1$1$emit$1.label = 1;
                            if (aVar.a(navigationPresenter$onLaunched$1$1$emit$1) != coroutineSingletons) {
                                wg41Var2 = wg41Var;
                                cVar = cVar2;
                            }
                            return coroutineSingletons;
                        }
                        if (i == 1) {
                            ?? r92 = (g050) navigationPresenter$onLaunched$1$1$emit$1.L$4;
                            cVar = (c) navigationPresenter$onLaunched$1$1$emit$1.L$3;
                            ?? r2 = (List) navigationPresenter$onLaunched$1$1$emit$1.L$2;
                            wg41Var2 = (wg41) navigationPresenter$onLaunched$1$1$emit$1.L$1;
                            b bVar3 = (b) navigationPresenter$onLaunched$1$1$emit$1.L$0;
                            kotlin.b.b(obj);
                            aVar = r92;
                            this = bVar3;
                            m0 = r2;
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                wg41Var3 = (wg41) navigationPresenter$onLaunched$1$1$emit$1.L$1;
                                bVar = (b) navigationPresenter$onLaunched$1$1$emit$1.L$0;
                                kotlin.b.b(obj);
                                wg41Var3.getClass();
                                d dVar = bVar.c;
                                dVar.e(dVar.d());
                                return zy11.a;
                            }
                            r9 = (g050) navigationPresenter$onLaunched$1$1$emit$1.L$3;
                            ?? r10 = (List) navigationPresenter$onLaunched$1$1$emit$1.L$2;
                            wg41Var4 = (wg41) navigationPresenter$onLaunched$1$1$emit$1.L$1;
                            bVar2 = (b) navigationPresenter$onLaunched$1$1$emit$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                aVar2 = r9;
                                arrayList = r10;
                                aVar = aVar2;
                                m0 = arrayList;
                                wg41Var3 = wg41Var4;
                                bVar = bVar2;
                                aVar.d(null);
                                c cVar3 = bVar.b;
                                navigationPresenter$onLaunched$1$1$emit$1.L$0 = bVar;
                                navigationPresenter$onLaunched$1$1$emit$1.L$1 = wg41Var3;
                                navigationPresenter$onLaunched$1$1$emit$1.L$2 = null;
                                navigationPresenter$onLaunched$1$1$emit$1.L$3 = null;
                                navigationPresenter$onLaunched$1$1$emit$1.L$4 = null;
                                navigationPresenter$onLaunched$1$1$emit$1.label = 3;
                            } catch (Throwable th) {
                                th = th;
                                r9.d(null);
                                throw th;
                            }
                        }
                        t850 t850Var = cVar.f;
                        Map map = t850Var.b;
                        t850Var.getClass();
                        t850 t850Var2 = new t850(m0, map);
                        cVar.f = t850Var2;
                        wlsVar = cVar.d;
                        if (wlsVar == null) {
                            navigationPresenter$onLaunched$1$1$emit$1.L$0 = this;
                            navigationPresenter$onLaunched$1$1$emit$1.L$1 = wg41Var2;
                            navigationPresenter$onLaunched$1$1$emit$1.L$2 = m0;
                            navigationPresenter$onLaunched$1$1$emit$1.L$3 = aVar;
                            navigationPresenter$onLaunched$1$1$emit$1.L$4 = null;
                            navigationPresenter$onLaunched$1$1$emit$1.label = 2;
                            try {
                                if (((NavigatorViewHolderImpl$1$onViewAttachedToWindow$1) wlsVar).invoke(t850Var2, navigationPresenter$onLaunched$1$1$emit$1) != coroutineSingletons) {
                                    arrayList = m0;
                                    wg41Var4 = wg41Var2;
                                    bVar2 = this;
                                    aVar2 = aVar;
                                    aVar = aVar2;
                                    m0 = arrayList;
                                    wg41Var3 = wg41Var4;
                                    bVar = bVar2;
                                    aVar.d(null);
                                    c cVar32 = bVar.b;
                                    navigationPresenter$onLaunched$1$1$emit$1.L$0 = bVar;
                                    navigationPresenter$onLaunched$1$1$emit$1.L$1 = wg41Var3;
                                    navigationPresenter$onLaunched$1$1$emit$1.L$2 = null;
                                    navigationPresenter$onLaunched$1$1$emit$1.L$3 = null;
                                    navigationPresenter$onLaunched$1$1$emit$1.L$4 = null;
                                    navigationPresenter$onLaunched$1$1$emit$1.label = 3;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                r9 = aVar;
                                r9.d(null);
                                throw th;
                            }
                        }
                        bVar = this;
                        wg41Var3 = wg41Var2;
                        aVar.d(null);
                        c cVar322 = bVar.b;
                        navigationPresenter$onLaunched$1$1$emit$1.L$0 = bVar;
                        navigationPresenter$onLaunched$1$1$emit$1.L$1 = wg41Var3;
                        navigationPresenter$onLaunched$1$1$emit$1.L$2 = null;
                        navigationPresenter$onLaunched$1$1$emit$1.L$3 = null;
                        navigationPresenter$onLaunched$1$1$emit$1.L$4 = null;
                        navigationPresenter$onLaunched$1$1$emit$1.label = 3;
                    }
                }
                Map map2 = t850Var.b;
                t850Var.getClass();
                t850 t850Var22 = new t850(m0, map2);
                cVar.f = t850Var22;
                wlsVar = cVar.d;
                if (wlsVar == null) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
            t850 t850Var3 = cVar.f;
        } catch (Throwable th4) {
            th = th4;
        }
        navigationPresenter$onLaunched$1$1$emit$1 = new NavigationPresenter$onLaunched$1$1$emit$1(this, continuation);
        Object obj2 = navigationPresenter$onLaunched$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationPresenter$onLaunched$1$1$emit$1.label;
        if (i != 0) {
        }
    }
}
