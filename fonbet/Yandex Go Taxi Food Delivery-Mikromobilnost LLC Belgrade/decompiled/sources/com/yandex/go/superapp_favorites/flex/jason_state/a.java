package com.yandex.go.superapp_favorites.flex.jason_state;

import defpackage.g6u;
import defpackage.k6x;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final k6x b;

    public a(tt2 tt2Var, k6x k6xVar) {
        this.a = tt2Var;
        this.b = k6xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperappFavoritesScreenStateInteractor$setErrorScreenState$1 superappFavoritesScreenStateInteractor$setErrorScreenState$1;
        int i;
        if (continuationImpl instanceof SuperappFavoritesScreenStateInteractor$setErrorScreenState$1) {
            superappFavoritesScreenStateInteractor$setErrorScreenState$1 = (SuperappFavoritesScreenStateInteractor$setErrorScreenState$1) continuationImpl;
            int i2 = superappFavoritesScreenStateInteractor$setErrorScreenState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappFavoritesScreenStateInteractor$setErrorScreenState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappFavoritesScreenStateInteractor$setErrorScreenState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappFavoritesScreenStateInteractor$setErrorScreenState$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    SuperappFavoritesScreenStateInteractor$setErrorScreenState$2 superappFavoritesScreenStateInteractor$setErrorScreenState$2 = new SuperappFavoritesScreenStateInteractor$setErrorScreenState$2(this, null);
                    superappFavoritesScreenStateInteractor$setErrorScreenState$1.label = 1;
                    if (tje.k0(g6uVar, superappFavoritesScreenStateInteractor$setErrorScreenState$2, superappFavoritesScreenStateInteractor$setErrorScreenState$1) == coroutineSingletons) {
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
        superappFavoritesScreenStateInteractor$setErrorScreenState$1 = new SuperappFavoritesScreenStateInteractor$setErrorScreenState$1(this, continuationImpl);
        Object obj2 = superappFavoritesScreenStateInteractor$setErrorScreenState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappFavoritesScreenStateInteractor$setErrorScreenState$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
