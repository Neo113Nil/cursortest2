package androidx.compose.ui.platform;

import defpackage.a7u0;
import defpackage.g9y;
import defpackage.m390;
import defpackage.ny61;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.uh6;
import defpackage.wls;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public abstract class q {
    public static final a7u0 a = new a7u0(PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1.w);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(g9y g9yVar, wls wlsVar, ContinuationImpl continuationImpl) {
        PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        int i;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (PlatformTextInputModifierNodeKt$establishTextInputSession$1) continuationImpl;
            int i2 = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!g9yVar.getNode().isAttached()) {
                        ny61.g("establishTextInputSession called from an unattached node");
                        return null;
                    }
                    m390 Q = qje.Q(g9yVar);
                    r1b0 r1b0Var = (r1b0) qje.P(g9yVar).U;
                    r1b0Var.getClass();
                    if (uh6.L(r1b0Var, a) != null) {
                        ny61.u();
                        return null;
                    }
                    platformTextInputModifierNodeKt$establishTextInputSession$1.label = 1;
                    if (b(Q, wlsVar, platformTextInputModifierNodeKt$establishTextInputSession$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuationImpl);
        Object obj2 = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons b(m390 m390Var, wls wlsVar, ContinuationImpl continuationImpl) {
        PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 platformTextInputModifierNodeKt$interceptedTextInputSession$1;
        int i;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = (PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) continuationImpl;
            int i2 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = platformTextInputModifierNodeKt$interceptedTextInputSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = 1;
                    if (m390Var.textInputSession(wlsVar, platformTextInputModifierNodeKt$interceptedTextInputSession$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ny61.A();
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(continuationImpl);
        Object obj2 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }
}
