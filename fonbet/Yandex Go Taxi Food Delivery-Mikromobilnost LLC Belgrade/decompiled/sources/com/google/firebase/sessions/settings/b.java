package com.google.firebase.sessions.settings;

import defpackage.ny61;
import defpackage.xcr0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    public final xcr0 a;
    public final xcr0 b;

    public b(xcr0 xcr0Var, xcr0 xcr0Var2) {
        this.a = xcr0Var;
        this.b = xcr0Var2;
    }

    public final double a() {
        Double a = this.a.a();
        if (a != null) {
            double doubleValue = a.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double a2 = this.b.a();
        if (a2 != null) {
            double doubleValue2 = a2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r6.b(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r6.a.b(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SessionsSettings$updateSettings$1 sessionsSettings$updateSettings$1;
        int i;
        if (continuationImpl instanceof SessionsSettings$updateSettings$1) {
            sessionsSettings$updateSettings$1 = (SessionsSettings$updateSettings$1) continuationImpl;
            int i2 = sessionsSettings$updateSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sessionsSettings$updateSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sessionsSettings$updateSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sessionsSettings$updateSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sessionsSettings$updateSettings$1.L$0 = this;
                    sessionsSettings$updateSettings$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (b) sessionsSettings$updateSettings$1.L$0;
                    kotlin.b.b(obj);
                }
                xcr0 xcr0Var = this.b;
                sessionsSettings$updateSettings$1.L$0 = null;
                sessionsSettings$updateSettings$1.label = 2;
            }
        }
        sessionsSettings$updateSettings$1 = new SessionsSettings$updateSettings$1(this, continuationImpl);
        Object obj2 = sessionsSettings$updateSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sessionsSettings$updateSettings$1.label;
        if (i != 0) {
        }
        xcr0 xcr0Var2 = this.b;
        sessionsSettings$updateSettings$1.L$0 = null;
        sessionsSettings$updateSettings$1.label = 2;
    }
}
