package com.yandex.go.platform.navigation.impl;

import android.content.Context;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.r650;
import defpackage.sjh;
import defpackage.t850;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final Context a;
    public final List b;
    public final r650 c;
    public wls d;
    public ike e;
    public pzt0 g;
    public t850 f = new t850(0);
    public final kotlinx.coroutines.sync.a h = gtq0.a();

    public c(Context context, List list, r650 r650Var) {
        this.a = context;
        this.b = list;
        this.c = r650Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, List list, ContinuationImpl continuationImpl) {
        NavigationPresenter$observeFeaturesForViewState$1 navigationPresenter$observeFeaturesForViewState$1;
        int i;
        ike ikeVar;
        cVar.getClass();
        if (continuationImpl instanceof NavigationPresenter$observeFeaturesForViewState$1) {
            navigationPresenter$observeFeaturesForViewState$1 = (NavigationPresenter$observeFeaturesForViewState$1) continuationImpl;
            int i2 = navigationPresenter$observeFeaturesForViewState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationPresenter$observeFeaturesForViewState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigationPresenter$observeFeaturesForViewState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationPresenter$observeFeaturesForViewState$1.label;
                pzt0 pzt0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pzt0 pzt0Var2 = cVar.g;
                    if (pzt0Var2 != null) {
                        navigationPresenter$observeFeaturesForViewState$1.L$0 = cVar;
                        navigationPresenter$observeFeaturesForViewState$1.L$1 = list;
                        navigationPresenter$observeFeaturesForViewState$1.label = 1;
                        if (kotlinx.coroutines.a.f(pzt0Var2, navigationPresenter$observeFeaturesForViewState$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) navigationPresenter$observeFeaturesForViewState$1.L$1;
                    cVar = (c) navigationPresenter$observeFeaturesForViewState$1.L$0;
                    kotlin.b.b(obj);
                }
                ikeVar = cVar.e;
                if (ikeVar != null) {
                    sjh sjhVar = uyj.a;
                    pzt0Var = tje.N(ikeVar, mdh.b, null, new NavigationPresenter$observeFeaturesForViewState$2(list, cVar, null), 2);
                }
                cVar.g = pzt0Var;
                return zy11.a;
            }
        }
        navigationPresenter$observeFeaturesForViewState$1 = new NavigationPresenter$observeFeaturesForViewState$1(cVar, continuationImpl);
        Object obj2 = navigationPresenter$observeFeaturesForViewState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationPresenter$observeFeaturesForViewState$1.label;
        pzt0 pzt0Var3 = null;
        if (i != 0) {
        }
        ikeVar = cVar.e;
        if (ikeVar != null) {
        }
        cVar.g = pzt0Var3;
        return zy11.a;
    }
}
