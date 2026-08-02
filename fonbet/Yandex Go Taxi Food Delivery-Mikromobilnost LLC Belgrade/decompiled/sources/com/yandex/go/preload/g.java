package com.yandex.go.preload;

import defpackage.axw0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zww0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g implements zww0 {
    public final axw0 a;
    public final tt2 b;

    public g(axw0 axw0Var, tt2 tt2Var) {
        this.a = axw0Var;
        this.b = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1 suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1;
        int i;
        if (continuationImpl instanceof SuspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1) {
            suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1 = (SuspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1) continuationImpl;
            int i2 = suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    SuspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$2 suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$2 = new SuspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$2(this, null);
                    suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1.label = 1;
                    if (tje.k0(mdhVar, suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$2, suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1) == coroutineSingletons) {
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
        suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1 = new SuspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1(this, continuationImpl);
        Object obj2 = suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suspendUntilMainScreenLoadedInteractorImpl$waitMainScreenLoaded$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
