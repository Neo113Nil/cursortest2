package com.yandex.go.places.impl.data.repositories.favorites;

import com.yandex.go.places.impl.data.api.OrganizationsDiscoveryInternalApi;
import com.yandex.go.places.impl.data.entities.network.favorites.FavoritesListRequestParams;
import com.yandex.go.places.impl.data.entities.network.favorites.FavoritesListResponse;
import defpackage.bna;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.zn1;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final bna a;
    public final i3y b;

    public a(bna bnaVar, on2 on2Var) {
        this.a = bnaVar;
        this.b = kotlin.a.a(new zn1(on2Var, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(int i, ContinuationImpl continuationImpl) {
        FavoriteOrganizationsPinsRepositoryImpl$fetch$1 favoriteOrganizationsPinsRepositoryImpl$fetch$1;
        int i2;
        try {
            if (continuationImpl instanceof FavoriteOrganizationsPinsRepositoryImpl$fetch$1) {
                favoriteOrganizationsPinsRepositoryImpl$fetch$1 = (FavoriteOrganizationsPinsRepositoryImpl$fetch$1) continuationImpl;
                int i3 = favoriteOrganizationsPinsRepositoryImpl$fetch$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    favoriteOrganizationsPinsRepositoryImpl$fetch$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = favoriteOrganizationsPinsRepositoryImpl$fetch$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = favoriteOrganizationsPinsRepositoryImpl$fetch$1.label;
                    if (i2 != 0) {
                        b.b(obj);
                        cmt<FavoritesListResponse> f = ((OrganizationsDiscoveryInternalApi) this.b.getValue()).f("the_favorites_folder", new FavoritesListRequestParams(9, new Integer(i), new Integer(0)));
                        favoriteOrganizationsPinsRepositoryImpl$fetch$1.I$0 = 0;
                        favoriteOrganizationsPinsRepositoryImpl$fetch$1.I$1 = i;
                        favoriteOrganizationsPinsRepositoryImpl$fetch$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.a(f, null, favoriteOrganizationsPinsRepositoryImpl$fetch$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return this.a.a((FavoritesListResponse) obj);
                }
            }
            if (i2 != 0) {
            }
            return this.a.a((FavoritesListResponse) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return EmptyList.a;
        }
        favoriteOrganizationsPinsRepositoryImpl$fetch$1 = new FavoriteOrganizationsPinsRepositoryImpl$fetch$1(this, continuationImpl);
        Object obj2 = favoriteOrganizationsPinsRepositoryImpl$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = favoriteOrganizationsPinsRepositoryImpl$fetch$1.label;
    }
}
