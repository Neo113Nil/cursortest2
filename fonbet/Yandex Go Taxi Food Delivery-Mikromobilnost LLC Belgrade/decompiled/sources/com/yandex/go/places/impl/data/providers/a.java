package com.yandex.go.places.impl.data.providers;

import com.yandex.go.places.impl.domain.interactors.map.d;
import defpackage.ny61;
import defpackage.vac0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class a {
    public final vac0 a;

    public a(vac0 vac0Var) {
        this.a = vac0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FavoritesStateProviderImpl$isFavoritesSelected$1 favoritesStateProviderImpl$isFavoritesSelected$1;
        int i;
        if (continuationImpl instanceof FavoritesStateProviderImpl$isFavoritesSelected$1) {
            favoritesStateProviderImpl$isFavoritesSelected$1 = (FavoritesStateProviderImpl$isFavoritesSelected$1) continuationImpl;
            int i2 = favoritesStateProviderImpl$isFavoritesSelected$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesStateProviderImpl$isFavoritesSelected$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesStateProviderImpl$isFavoritesSelected$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesStateProviderImpl$isFavoritesSelected$1.label;
                if (i != 0) {
                    b.b(obj);
                    d dVar = new d(this.a.a.c);
                    favoritesStateProviderImpl$isFavoritesSelected$1.label = 1;
                    obj = e.A(dVar, favoritesStateProviderImpl$isFavoritesSelected$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        favoritesStateProviderImpl$isFavoritesSelected$1 = new FavoritesStateProviderImpl$isFavoritesSelected$1(this, continuationImpl);
        Object obj2 = favoritesStateProviderImpl$isFavoritesSelected$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesStateProviderImpl$isFavoritesSelected$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }
}
