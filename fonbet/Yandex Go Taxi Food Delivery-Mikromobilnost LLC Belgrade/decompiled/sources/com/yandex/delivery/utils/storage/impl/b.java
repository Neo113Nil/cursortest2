package com.yandex.delivery.utils.storage.impl;

import defpackage.g6s0;
import defpackage.i6s0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    public final a a;
    public final i6s0 b;

    public b(a aVar, i6s0 i6s0Var) {
        this.a = aVar;
        this.b = i6s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ShowCountRepository$clear$1 showCountRepository$clear$1;
        int i;
        if (continuationImpl instanceof ShowCountRepository$clear$1) {
            showCountRepository$clear$1 = (ShowCountRepository$clear$1) continuationImpl;
            int i2 = showCountRepository$clear$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showCountRepository$clear$1.label = i2 - Integer.MIN_VALUE;
                Object obj = showCountRepository$clear$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showCountRepository$clear$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    showCountRepository$clear$1.label = 1;
                    Object a = androidx.datastore.preferences.core.b.a(g6s0.a(a.b, this.a.a), new ShowCountPersistentDataStore$clear$2(2, null), showCountRepository$clear$1);
                    if (a != coroutineSingletons) {
                        a = zy11Var;
                    }
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.b.a.clear();
                return zy11Var;
            }
        }
        showCountRepository$clear$1 = new ShowCountRepository$clear$1(this, continuationImpl);
        Object obj2 = showCountRepository$clear$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showCountRepository$clear$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.b.a.clear();
        return zy11Var2;
    }
}
