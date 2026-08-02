package com.ybsdk.screens.menu.domain;

import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.common.repositiories.menu.a a;

    public a(com.ybsdk.common.repositiories.menu.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MenuInteractor$getMenu$1 menuInteractor$getMenu$1;
        int i;
        if (continuationImpl instanceof MenuInteractor$getMenu$1) {
            menuInteractor$getMenu$1 = (MenuInteractor$getMenu$1) continuationImpl;
            int i2 = menuInteractor$getMenu$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuInteractor$getMenu$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuInteractor$getMenu$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuInteractor$getMenu$1.label;
                if (i != 0) {
                    b.b(obj);
                    menuInteractor$getMenu$1.label = 1;
                    Object a = this.a.a(menuInteractor$getMenu$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        menuInteractor$getMenu$1 = new MenuInteractor$getMenu$1(this, continuationImpl);
        Object obj2 = menuInteractor$getMenu$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuInteractor$getMenu$1.label;
        if (i != 0) {
        }
    }
}
