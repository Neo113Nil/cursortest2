package com.yandex.taxi.go_platform.delegates;

import defpackage.a5g0;
import defpackage.b5g0;
import defpackage.g5g0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c {
    public final g5g0 a;

    public c(g5g0 g5g0Var) {
        this.a = g5g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PushDelegateImpl$getPushToken$1 pushDelegateImpl$getPushToken$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        String str2;
        if (continuationImpl instanceof PushDelegateImpl$getPushToken$1) {
            pushDelegateImpl$getPushToken$1 = (PushDelegateImpl$getPushToken$1) continuationImpl;
            int i2 = pushDelegateImpl$getPushToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushDelegateImpl$getPushToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushDelegateImpl$getPushToken$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushDelegateImpl$getPushToken$1.label;
                g5g0 g5g0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pushDelegateImpl$getPushToken$1.label = 1;
                    obj = g5g0Var.a.b(pushDelegateImpl$getPushToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) pushDelegateImpl$getPushToken$1.L$0;
                        kotlin.b.b(obj);
                        str2 = (String) obj;
                        if (str == null && str.length() != 0) {
                            return new a5g0(str);
                        }
                        if (str2 != null || str2.length() == 0) {
                            return null;
                        }
                        return new b5g0(str2);
                    }
                    kotlin.b.b(obj);
                }
                String str3 = (String) obj;
                pushDelegateImpl$getPushToken$1.L$0 = str3;
                pushDelegateImpl$getPushToken$1.label = 2;
                g5g0Var.getClass();
                if (coroutineSingletons != null) {
                    str = str3;
                    obj = null;
                    str2 = (String) obj;
                    if (str == null) {
                    }
                    if (str2 != null) {
                    }
                    return null;
                }
                return coroutineSingletons;
            }
        }
        pushDelegateImpl$getPushToken$1 = new PushDelegateImpl$getPushToken$1(this, continuationImpl);
        Object obj2 = pushDelegateImpl$getPushToken$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushDelegateImpl$getPushToken$1.label;
        g5g0 g5g0Var2 = this.a;
        if (i != 0) {
        }
        String str32 = (String) obj2;
        pushDelegateImpl$getPushToken$1.L$0 = str32;
        pushDelegateImpl$getPushToken$1.label = 2;
        g5g0Var2.getClass();
        if (coroutineSingletons != null) {
        }
        return coroutineSingletons;
    }
}
