package com.ybsdk.utils.poller;

import defpackage.bvf0;
import defpackage.eja1;
import defpackage.ndy;
import defpackage.nop0;
import defpackage.ny61;
import defpackage.pey;
import defpackage.tje;
import defpackage.vru;
import defpackage.w511;
import defpackage.wls;
import defpackage.yyd0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements yyd0 {
    public final vru a;
    public final nop0 b;

    public a(vru vruVar, nop0 nop0Var) {
        this.a = vruVar;
        this.b = nop0Var;
    }

    @Override // defpackage.yyd0
    public final int a() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.yyd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PollerScopeType pollerScopeType, wls wlsVar, Continuation continuation) {
        LifecycleAwarePollerLauncher$launch$1 lifecycleAwarePollerLauncher$launch$1;
        int i;
        if (continuation instanceof LifecycleAwarePollerLauncher$launch$1) {
            lifecycleAwarePollerLauncher$launch$1 = (LifecycleAwarePollerLauncher$launch$1) continuation;
            int i2 = lifecycleAwarePollerLauncher$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lifecycleAwarePollerLauncher$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lifecycleAwarePollerLauncher$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lifecycleAwarePollerLauncher$launch$1.label;
                if (i == 0) {
                    if (i == 1) {
                        wlsVar = (wls) lifecycleAwarePollerLauncher$launch$1.L$0;
                        kotlin.b.b(obj);
                        return eja1.s((pey) obj).c(wlsVar);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wlsVar = (wls) lifecycleAwarePollerLauncher$launch$1.L$0;
                    kotlin.b.b(obj);
                    return eja1.s((pey) obj).c(wlsVar);
                }
                kotlin.b.b(obj);
                int i3 = ndy.a[pollerScopeType.ordinal()];
                if (i3 == 1) {
                    return tje.N(bvf0.a(lifecycleAwarePollerLauncher$launch$1.get_context()), null, null, new LifecycleAwarePollerLauncher$launch$2(this, wlsVar, null), 3);
                }
                if (i3 == 2) {
                    lifecycleAwarePollerLauncher$launch$1.L$0 = wlsVar;
                    lifecycleAwarePollerLauncher$launch$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(this.b.a, lifecycleAwarePollerLauncher$launch$1);
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    lifecycleAwarePollerLauncher$launch$1.L$0 = wlsVar;
                    lifecycleAwarePollerLauncher$launch$1.label = 2;
                    obj = kotlinx.coroutines.flow.e.y(this.a.a, lifecycleAwarePollerLauncher$launch$1);
                }
                return coroutineSingletons;
            }
        }
        lifecycleAwarePollerLauncher$launch$1 = new LifecycleAwarePollerLauncher$launch$1(this, (ContinuationImpl) continuation);
        Object obj2 = lifecycleAwarePollerLauncher$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lifecycleAwarePollerLauncher$launch$1.label;
        if (i == 0) {
        }
    }
}
