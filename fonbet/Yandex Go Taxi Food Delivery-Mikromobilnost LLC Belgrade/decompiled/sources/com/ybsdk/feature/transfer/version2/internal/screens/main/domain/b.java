package com.ybsdk.feature.transfer.version2.internal.screens.main.domain;

import com.ybsdk.di.modules.features.u;
import defpackage.ny61;
import defpackage.r90;
import defpackage.x0e0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final r90 a;
    public final u b;
    public final com.ybsdk.utils.poller.b c;

    public b(r90 r90Var, u uVar, com.ybsdk.utils.poller.b bVar) {
        this.a = r90Var;
        this.b = uVar;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, ContinuationImpl continuationImpl) {
        AddCardInteractor$pollAddedCard$1 addCardInteractor$pollAddedCard$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof AddCardInteractor$pollAddedCard$1) {
            addCardInteractor$pollAddedCard$1 = (AddCardInteractor$pollAddedCard$1) continuationImpl;
            int i2 = addCardInteractor$pollAddedCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addCardInteractor$pollAddedCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addCardInteractor$pollAddedCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addCardInteractor$pollAddedCard$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                com.ybsdk.utils.poller.c c = bVar.c.c(x0e0.b, new AddCardInteractor$pollAddedCard$2(str, null), new AddCardInteractor$pollAddedCard$3(bVar, null));
                addCardInteractor$pollAddedCard$1.label = 1;
                Object e = c.e(addCardInteractor$pollAddedCard$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        addCardInteractor$pollAddedCard$1 = new AddCardInteractor$pollAddedCard$1(bVar, continuationImpl);
        Object obj2 = addCardInteractor$pollAddedCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addCardInteractor$pollAddedCard$1.label;
        if (i == 0) {
        }
    }
}
