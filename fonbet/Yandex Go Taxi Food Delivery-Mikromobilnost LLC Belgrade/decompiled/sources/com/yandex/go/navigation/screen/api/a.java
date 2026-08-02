package com.yandex.go.navigation.screen.api;

import com.yandex.go.navigation.screen.c;
import defpackage.cvw;
import defpackage.n35;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, n35 n35Var, ContinuationImpl continuationImpl) {
        CurrentScreenRepositoryKt$awaitScreen$1 currentScreenRepositoryKt$awaitScreen$1;
        int i;
        if (continuationImpl instanceof CurrentScreenRepositoryKt$awaitScreen$1) {
            currentScreenRepositoryKt$awaitScreen$1 = (CurrentScreenRepositoryKt$awaitScreen$1) continuationImpl;
            int i2 = currentScreenRepositoryKt$awaitScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentScreenRepositoryKt$awaitScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentScreenRepositoryKt$awaitScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentScreenRepositoryKt$awaitScreen$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.go.navigation.screen.b c = cVar.c();
                    CurrentScreenRepositoryKt$awaitScreen$2 currentScreenRepositoryKt$awaitScreen$2 = new CurrentScreenRepositoryKt$awaitScreen$2(2, n35Var, cvw.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/yandex/go/navigation/screen/api/Screen;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    currentScreenRepositoryKt$awaitScreen$1.L$0 = null;
                    currentScreenRepositoryKt$awaitScreen$1.L$1 = null;
                    currentScreenRepositoryKt$awaitScreen$1.label = 1;
                    if (e.x(c, currentScreenRepositoryKt$awaitScreen$2, currentScreenRepositoryKt$awaitScreen$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        currentScreenRepositoryKt$awaitScreen$1 = new CurrentScreenRepositoryKt$awaitScreen$1(continuationImpl);
        Object obj2 = currentScreenRepositoryKt$awaitScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentScreenRepositoryKt$awaitScreen$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
