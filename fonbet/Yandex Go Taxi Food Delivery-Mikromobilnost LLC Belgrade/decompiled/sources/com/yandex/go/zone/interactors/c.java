package com.yandex.go.zone.interactors;

import com.yandex.go.zone.repository.o;
import defpackage.be61;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        defpackage.jst.e.k(r5, "Failed fetching zone from LaunchIdChangedZoneLifecycleInteractor");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1 launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        if (continuation instanceof LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1) {
            launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1 = (LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i2 = launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    be61 be61Var = (be61) obj;
                    o oVar = this.a.a;
                    String str = be61Var.b;
                    String str2 = be61Var.a.a;
                    launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                    launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                    launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                    launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = 1;
                    if (oVar.d(str, str2, launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1 = new LaunchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchIdChangedZoneLifecycleInteractor$onFirstContentfulPaint$1$1$1$invokeSuspend$$inlined$safeCollect$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
