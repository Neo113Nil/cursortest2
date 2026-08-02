package com.yandex.plus.home.internal.di;

import defpackage.lj;
import defpackage.ny61;
import defpackage.wog;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d {
    public final /* synthetic */ wog a;

    public d(wog wogVar) {
        this.a = wogVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DataModule$plusStateRepository$2$1$get$1 dataModule$plusStateRepository$2$1$get$1;
        int i;
        if (continuationImpl instanceof DataModule$plusStateRepository$2$1$get$1) {
            dataModule$plusStateRepository$2$1$get$1 = (DataModule$plusStateRepository$2$1$get$1) continuationImpl;
            int i2 = dataModule$plusStateRepository$2$1$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataModule$plusStateRepository$2$1$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataModule$plusStateRepository$2$1$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataModule$plusStateRepository$2$1$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.domain.auth.impl.a aVar = this.a.g;
                    dataModule$plusStateRepository$2$1$get$1.label = 1;
                    obj = aVar.e(dataModule$plusStateRepository$2$1$get$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((lj) obj).getId();
            }
        }
        dataModule$plusStateRepository$2$1$get$1 = new DataModule$plusStateRepository$2$1$get$1(this, continuationImpl);
        Object obj2 = dataModule$plusStateRepository$2$1$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataModule$plusStateRepository$2$1$get$1.label;
        if (i != 0) {
        }
        return ((lj) obj2).getId();
    }
}
