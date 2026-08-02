package com.ybsdk.common.repositiories.menu;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.network.Api;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final Api a;

    public a(Api api) {
        this.a = api;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r5 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MenuItemsRepository$getMenu$1 menuItemsRepository$getMenu$1;
        int i;
        Object p;
        Throwable a;
        if (continuationImpl instanceof MenuItemsRepository$getMenu$1) {
            menuItemsRepository$getMenu$1 = (MenuItemsRepository$getMenu$1) continuationImpl;
            int i2 = menuItemsRepository$getMenu$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuItemsRepository$getMenu$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuItemsRepository$getMenu$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuItemsRepository$getMenu$1.label;
                if (i != 0) {
                    b.b(obj);
                    menuItemsRepository$getMenu$1.label = 1;
                    p = this.a.p(menuItemsRepository$getMenu$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    p = ((Result) obj).getValue();
                }
                a = Result.a(p);
                if (a == null) {
                    return new Result.Failure(a);
                }
                MenuItemsRepository$getMenu$2$1 menuItemsRepository$getMenu$2$1 = MenuItemsRepository$getMenu$2$1.b;
                menuItemsRepository$getMenu$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) p, menuItemsRepository$getMenu$2$1, menuItemsRepository$getMenu$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        menuItemsRepository$getMenu$1 = new MenuItemsRepository$getMenu$1(this, continuationImpl);
        Object obj2 = menuItemsRepository$getMenu$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuItemsRepository$getMenu$1.label;
        if (i != 0) {
        }
        a = Result.a(p);
        if (a == null) {
        }
    }
}
