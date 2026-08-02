package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.SubscriptionInfoError;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.ef41;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public e(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        if (r1.emit(r3, r6) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CompositeSubscriptionInfoHolder$special$$inlined$map$1$2$1 compositeSubscriptionInfoHolder$special$$inlined$map$1$2$1;
        int i;
        ef41 ef41Var;
        vpr vprVar;
        int i2;
        if (continuation instanceof CompositeSubscriptionInfoHolder$special$$inlined$map$1$2$1) {
            compositeSubscriptionInfoHolder$special$$inlined$map$1$2$1 = (CompositeSubscriptionInfoHolder$special$$inlined$map$1$2$1) continuation;
            int i3 = compositeSubscriptionInfoHolder$special$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                CompositeSubscriptionInfoHolder$special$$inlined$map$1$2$1 compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12 = compositeSubscriptionInfoHolder$special$$inlined$map$1$2$1;
                Object obj2 = compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ef41Var = (ef41) obj;
                    SubscriptionConfiguration subscriptionConfiguration = ef41Var != null ? ef41Var.c : null;
                    String str = ef41Var != null ? ef41Var.a : null;
                    String str2 = ef41Var != null ? ef41Var.b : null;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$0 = null;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$1 = null;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$2 = null;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$3 = null;
                    vpr vprVar2 = this.a;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$4 = vprVar2;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$5 = null;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$6 = ef41Var;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.I$0 = 0;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.I$1 = 0;
                    compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.label = 1;
                    obj2 = this.b.a(subscriptionConfiguration, str, str2, null, compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12);
                    if (obj2 != obj3) {
                        vprVar = vprVar2;
                        i2 = 0;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                i2 = compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.I$0;
                ef41Var = (ef41) compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$6;
                vprVar = (vpr) compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$4;
                kotlin.b.b(obj2);
                Pair pair = (Pair) obj2;
                CompositeSubscriptionInfo.Home home = new CompositeSubscriptionInfo.Home(ef41Var == null ? ef41Var.c : null, (List) pair.getFirst(), (SubscriptionInfoError) pair.getSecond());
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$0 = null;
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$1 = null;
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$2 = null;
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$3 = null;
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$4 = null;
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$5 = null;
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.L$6 = null;
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.I$0 = i2;
                compositeSubscriptionInfoHolder$special$$inlined$map$1$2$12.label = 2;
            }
        }
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$1 = new CompositeSubscriptionInfoHolder$special$$inlined$map$1$2$1(this, continuation);
        CompositeSubscriptionInfoHolder$special$$inlined$map$1$2$1 compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122 = compositeSubscriptionInfoHolder$special$$inlined$map$1$2$1;
        Object obj22 = compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj22;
        CompositeSubscriptionInfo.Home home2 = new CompositeSubscriptionInfo.Home(ef41Var == null ? ef41Var.c : null, (List) pair2.getFirst(), (SubscriptionInfoError) pair2.getSecond());
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.L$0 = null;
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.L$1 = null;
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.L$2 = null;
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.L$3 = null;
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.L$4 = null;
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.L$5 = null;
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.L$6 = null;
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.I$0 = i2;
        compositeSubscriptionInfoHolder$special$$inlined$map$1$2$122.label = 2;
    }
}
