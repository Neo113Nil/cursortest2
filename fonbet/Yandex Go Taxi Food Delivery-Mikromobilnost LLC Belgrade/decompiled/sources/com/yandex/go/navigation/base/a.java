package com.yandex.go.navigation.base;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import defpackage.dvw;
import defpackage.gtq0;
import defpackage.h55;
import defpackage.j18;
import defpackage.m950;
import defpackage.ny61;
import defpackage.q1j0;
import defpackage.sy60;
import defpackage.tpr;
import defpackage.y4c0;
import defpackage.zem;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h55 h55Var, m950 m950Var, Object obj, sy60 sy60Var, q1j0 q1j0Var, ContinuationImpl continuationImpl) {
        NavigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1 navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1;
        int i;
        if (continuationImpl instanceof NavigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1) {
            navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1 = (NavigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1) continuationImpl;
            int i2 = navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                    return zy11Var;
                }
                b.b(obj2);
                navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.L$0 = h55Var;
                navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.L$1 = m950Var;
                navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.L$2 = obj;
                navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.L$3 = sy60Var;
                navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.L$4 = q1j0Var;
                navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.label = 1;
                j18 j18Var = new j18(1, dvw.b(navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1));
                j18Var.u();
                h55Var.B(new y4c0(m950Var, obj, sy60Var, j18Var, 1), zy11Var, sy60.Q2, q1j0Var);
                return j18Var.s() == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1 = new NavigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1(continuationImpl);
        Object obj22 = navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h55 h55Var, ContinuationImpl continuationImpl) {
        NavigationRouterExtensionsAsyncKt$waitForDetach$1 navigationRouterExtensionsAsyncKt$waitForDetach$1;
        int i;
        if (continuationImpl instanceof NavigationRouterExtensionsAsyncKt$waitForDetach$1) {
            navigationRouterExtensionsAsyncKt$waitForDetach$1 = (NavigationRouterExtensionsAsyncKt$waitForDetach$1) continuationImpl;
            int i2 = navigationRouterExtensionsAsyncKt$waitForDetach$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationRouterExtensionsAsyncKt$waitForDetach$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigationRouterExtensionsAsyncKt$waitForDetach$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationRouterExtensionsAsyncKt$waitForDetach$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                if (h55Var.getLifecycle().w != Lifecycle.State.DESTROYED) {
                    tpr b = r.b(h55Var.getLifecycle());
                    NavigationRouterExtensionsAsyncKt$waitForDetach$2 navigationRouterExtensionsAsyncKt$waitForDetach$2 = new NavigationRouterExtensionsAsyncKt$waitForDetach$2(2, null);
                    navigationRouterExtensionsAsyncKt$waitForDetach$1.L$0 = null;
                    navigationRouterExtensionsAsyncKt$waitForDetach$1.label = 1;
                    if (e.x(b, navigationRouterExtensionsAsyncKt$waitForDetach$2, navigationRouterExtensionsAsyncKt$waitForDetach$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        navigationRouterExtensionsAsyncKt$waitForDetach$1 = new NavigationRouterExtensionsAsyncKt$waitForDetach$1(continuationImpl);
        Object obj2 = navigationRouterExtensionsAsyncKt$waitForDetach$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationRouterExtensionsAsyncKt$waitForDetach$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public static final Object c(zem zemVar, Continuation continuation) {
        return b(gtq0.b(zemVar), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(h55 h55Var, ContinuationImpl continuationImpl) {
        NavigationRouterExtensionsAsyncKt$waitForDismiss$1 navigationRouterExtensionsAsyncKt$waitForDismiss$1;
        int i;
        if (continuationImpl instanceof NavigationRouterExtensionsAsyncKt$waitForDismiss$1) {
            navigationRouterExtensionsAsyncKt$waitForDismiss$1 = (NavigationRouterExtensionsAsyncKt$waitForDismiss$1) continuationImpl;
            int i2 = navigationRouterExtensionsAsyncKt$waitForDismiss$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationRouterExtensionsAsyncKt$waitForDismiss$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigationRouterExtensionsAsyncKt$waitForDismiss$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationRouterExtensionsAsyncKt$waitForDismiss$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                if (h55Var.getLifecycle().w != Lifecycle.State.DESTROYED) {
                    tpr b = r.b(h55Var.getLifecycle());
                    NavigationRouterExtensionsAsyncKt$waitForDismiss$2 navigationRouterExtensionsAsyncKt$waitForDismiss$2 = new NavigationRouterExtensionsAsyncKt$waitForDismiss$2(2, null);
                    navigationRouterExtensionsAsyncKt$waitForDismiss$1.L$0 = null;
                    navigationRouterExtensionsAsyncKt$waitForDismiss$1.label = 1;
                    if (e.x(b, navigationRouterExtensionsAsyncKt$waitForDismiss$2, navigationRouterExtensionsAsyncKt$waitForDismiss$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        navigationRouterExtensionsAsyncKt$waitForDismiss$1 = new NavigationRouterExtensionsAsyncKt$waitForDismiss$1(continuationImpl);
        Object obj2 = navigationRouterExtensionsAsyncKt$waitForDismiss$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationRouterExtensionsAsyncKt$waitForDismiss$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
