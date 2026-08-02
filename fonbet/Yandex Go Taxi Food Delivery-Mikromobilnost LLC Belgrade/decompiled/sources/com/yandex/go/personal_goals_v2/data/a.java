package com.yandex.go.personal_goals_v2.data;

import defpackage.g16;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pav;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final pav a;
    public final k7x0 b;

    public a(pav pavVar, k7x0 k7x0Var) {
        this.a = pavVar;
        this.b = k7x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PersonalGoalsImageLoader$loadByTag$1 personalGoalsImageLoader$loadByTag$1;
        int i;
        try {
            if (continuationImpl instanceof PersonalGoalsImageLoader$loadByTag$1) {
                personalGoalsImageLoader$loadByTag$1 = (PersonalGoalsImageLoader$loadByTag$1) continuationImpl;
                int i2 = personalGoalsImageLoader$loadByTag$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    personalGoalsImageLoader$loadByTag$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = personalGoalsImageLoader$loadByTag$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = personalGoalsImageLoader$loadByTag$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                    if (str != null && str.length() != 0) {
                        g16 b = this.a.b().b(((m7x0) this.b).a(str));
                        personalGoalsImageLoader$loadByTag$1.L$0 = str;
                        personalGoalsImageLoader$loadByTag$1.L$1 = null;
                        personalGoalsImageLoader$loadByTag$1.label = 1;
                        Object a = b.a(personalGoalsImageLoader$loadByTag$1);
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    }
                    return null;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.h("personal_goals", "Failed to load image with tag: " + str, th);
            return null;
        }
        personalGoalsImageLoader$loadByTag$1 = new PersonalGoalsImageLoader$loadByTag$1(this, continuationImpl);
        Object obj2 = personalGoalsImageLoader$loadByTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalGoalsImageLoader$loadByTag$1.label;
    }
}
