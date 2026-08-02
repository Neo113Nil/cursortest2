package com.yandex.go.loyalty.impl.common.domain;

import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class m {
    public final a a;
    public final com.yandex.go.loyalty.impl.common.data.d b;

    public m(a aVar, com.yandex.go.loyalty.impl.common.data.d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        UnbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1 unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1;
        int i;
        Object a;
        if (continuationImpl instanceof UnbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1) {
            unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1 = (UnbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1) continuationImpl;
            int i2 = unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.label = i2 - Integer.MIN_VALUE;
                Object obj = unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.L$0 = null;
                    unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.L$1 = null;
                    unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.label = 1;
                    a = this.b.a(str, str2, unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.L$2;
                        kotlin.b.b(obj);
                        return obj2;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.L$0 = null;
                    unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.L$1 = null;
                    unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.L$2 = a;
                    unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.L$3 = null;
                    unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.label = 2;
                    if (this.a.a(unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return a;
            }
        }
        unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1 = new UnbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1(this, continuationImpl);
        Object obj3 = unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unbindLoyaltyProgramInteractorImpl$unbindLoyaltyProgram$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return a;
    }
}
