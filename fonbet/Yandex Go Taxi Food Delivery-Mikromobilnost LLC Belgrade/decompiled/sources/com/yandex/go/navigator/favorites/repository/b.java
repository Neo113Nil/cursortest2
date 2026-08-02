package com.yandex.go.navigator.favorites.repository;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.navigator.favorites.data.FavoritePlaceType;
import defpackage.bvf0;
import defpackage.ffp;
import defpackage.gci0;
import defpackage.i4c0;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.pgp;
import defpackage.qgp;
import defpackage.rgp;
import defpackage.sgp;
import defpackage.tt2;
import defpackage.uip;
import defpackage.vb50;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b {
    public final ru.yandex.taxi.favorites.data.repo.a a;
    public final com.yandex.go.places.impl.data.repositories.favorites.a b;
    public final c c;
    public final tt2 d;
    public final r0 e;
    public final gci0 f;
    public final ArrayList g;
    public final ArrayList h;
    public Pair i;

    public b(ru.yandex.taxi.favorites.data.repo.a aVar, com.yandex.go.places.impl.data.repositories.favorites.a aVar2, c cVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = cVar;
        this.d = tt2Var;
        r0 c = bvf0.c(EmptyList.a);
        this.e = c;
        this.f = e.d(c);
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (r9.c(r11, r1) != r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        if (r11 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, RefreshType refreshType, ContinuationImpl continuationImpl) {
        FavoritePlacesRepository$refreshInternal$1 favoritePlacesRepository$refreshInternal$1;
        int i;
        vb50 vb50Var;
        RefreshType refreshType2;
        vb50 vb50Var2;
        r0 r0Var = bVar.e;
        if (continuationImpl instanceof FavoritePlacesRepository$refreshInternal$1) {
            favoritePlacesRepository$refreshInternal$1 = (FavoritePlacesRepository$refreshInternal$1) continuationImpl;
            int i2 = favoritePlacesRepository$refreshInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritePlacesRepository$refreshInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritePlacesRepository$refreshInternal$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritePlacesRepository$refreshInternal$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = bVar.c;
                    favoritePlacesRepository$refreshInternal$1.L$0 = refreshType;
                    favoritePlacesRepository$refreshInternal$1.label = 1;
                    obj = cVar.a(favoritePlacesRepository$refreshInternal$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            ArrayList m0 = kotlin.collections.a.m0(bVar.h, bVar.g);
                            r0Var.getClass();
                            r0Var.m(null, m0);
                            return zy11Var;
                        }
                        vb50Var2 = (vb50) favoritePlacesRepository$refreshInternal$1.L$1;
                        refreshType2 = (RefreshType) favoritePlacesRepository$refreshInternal$1.L$0;
                        kotlin.b.b(obj);
                        vb50Var = vb50Var2;
                        refreshType = refreshType2;
                        RefreshType refreshType3 = RefreshType.FAVORITE_ORGANIZATIONS_ONLY;
                        if (refreshType != RefreshType.ALL || refreshType == refreshType3) {
                            favoritePlacesRepository$refreshInternal$1.L$0 = null;
                            favoritePlacesRepository$refreshInternal$1.L$1 = null;
                            favoritePlacesRepository$refreshInternal$1.label = 3;
                        }
                        ArrayList m02 = kotlin.collections.a.m0(bVar.h, bVar.g);
                        r0Var.getClass();
                        r0Var.m(null, m02);
                        return zy11Var;
                    }
                    refreshType = (RefreshType) favoritePlacesRepository$refreshInternal$1.L$0;
                    kotlin.b.b(obj);
                }
                vb50Var = (vb50) obj;
                if (vb50Var.a) {
                    r0Var.getClass();
                    r0Var.m(null, EmptyList.a);
                    return zy11Var;
                }
                RefreshType refreshType4 = RefreshType.DAT_UM_ONLY;
                if (refreshType == RefreshType.ALL || refreshType == refreshType4) {
                    ArrayList arrayList = vb50Var.d;
                    favoritePlacesRepository$refreshInternal$1.L$0 = refreshType;
                    favoritePlacesRepository$refreshInternal$1.L$1 = vb50Var;
                    favoritePlacesRepository$refreshInternal$1.label = 2;
                    if (bVar.b(arrayList, favoritePlacesRepository$refreshInternal$1) != obj2) {
                        refreshType2 = refreshType;
                        vb50Var2 = vb50Var;
                        vb50Var = vb50Var2;
                        refreshType = refreshType2;
                    }
                    return obj2;
                }
                RefreshType refreshType32 = RefreshType.FAVORITE_ORGANIZATIONS_ONLY;
                if (refreshType != RefreshType.ALL) {
                }
                favoritePlacesRepository$refreshInternal$1.L$0 = null;
                favoritePlacesRepository$refreshInternal$1.L$1 = null;
                favoritePlacesRepository$refreshInternal$1.label = 3;
            }
        }
        favoritePlacesRepository$refreshInternal$1 = new FavoritePlacesRepository$refreshInternal$1(bVar, continuationImpl);
        Object obj3 = favoritePlacesRepository$refreshInternal$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritePlacesRepository$refreshInternal$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        vb50Var = (vb50) obj3;
        if (vb50Var.a) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v13, types: [sgp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        FavoritePlacesRepository$handleDatUmPlaces$1 favoritePlacesRepository$handleDatUmPlaces$1;
        int i;
        List<FavoriteAddress> list;
        if (continuationImpl instanceof FavoritePlacesRepository$handleDatUmPlaces$1) {
            favoritePlacesRepository$handleDatUmPlaces$1 = (FavoritePlacesRepository$handleDatUmPlaces$1) continuationImpl;
            int i2 = favoritePlacesRepository$handleDatUmPlaces$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritePlacesRepository$handleDatUmPlaces$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritePlacesRepository$handleDatUmPlaces$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritePlacesRepository$handleDatUmPlaces$1.label;
                ArrayList arrayList2 = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList2.clear();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        FavoritePlaceType favoritePlaceType = ((i4c0) obj2).a;
                        if (favoritePlaceType == FavoritePlaceType.HOME || favoritePlaceType == FavoritePlaceType.WORK) {
                            arrayList3.add(obj2);
                        }
                    }
                    boolean isEmpty = arrayList3.isEmpty();
                    int i3 = !isEmpty ? 1 : 0;
                    if (!isEmpty) {
                        favoritePlacesRepository$handleDatUmPlaces$1.L$0 = null;
                        favoritePlacesRepository$handleDatUmPlaces$1.L$1 = null;
                        favoritePlacesRepository$handleDatUmPlaces$1.I$0 = i3;
                        favoritePlacesRepository$handleDatUmPlaces$1.label = 1;
                        obj = this.a.c(false, favoritePlacesRepository$handleDatUmPlaces$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ffp ffpVar = (ffp) obj;
                list = ffpVar == null ? ffpVar.a : null;
                if (list == null) {
                    list = EmptyList.a;
                }
                for (FavoriteAddress favoriteAddress : list) {
                    PlaceType placeType = favoriteAddress.getPlaceType();
                    int i4 = placeType == null ? -1 : uip.a[placeType.ordinal()];
                    rgp sgpVar = i4 != 1 ? i4 != 2 ? null : new sgp(favoriteAddress) : new rgp(favoriteAddress);
                    if (sgpVar != null) {
                        arrayList2.add(sgpVar);
                    }
                }
                return zy11.a;
            }
        }
        favoritePlacesRepository$handleDatUmPlaces$1 = new FavoritePlacesRepository$handleDatUmPlaces$1(this, continuationImpl);
        Object obj3 = favoritePlacesRepository$handleDatUmPlaces$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritePlacesRepository$handleDatUmPlaces$1.label;
        ArrayList arrayList22 = this.g;
        if (i != 0) {
        }
        ffp ffpVar2 = (ffp) obj3;
        if (ffpVar2 == null) {
        }
        if (list == null) {
        }
        while (r8.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[LOOP:0: B:11:0x0077->B:13:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(vb50 vb50Var, ContinuationImpl continuationImpl) {
        FavoritePlacesRepository$handleFavoriteOrganizations$1 favoritePlacesRepository$handleFavoriteOrganizations$1;
        int i;
        if (continuationImpl instanceof FavoritePlacesRepository$handleFavoriteOrganizations$1) {
            favoritePlacesRepository$handleFavoriteOrganizations$1 = (FavoritePlacesRepository$handleFavoriteOrganizations$1) continuationImpl;
            int i2 = favoritePlacesRepository$handleFavoriteOrganizations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritePlacesRepository$handleFavoriteOrganizations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritePlacesRepository$handleFavoriteOrganizations$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritePlacesRepository$handleFavoriteOrganizations$1.label;
                ArrayList arrayList = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList.clear();
                    ArrayList arrayList2 = vb50Var.d;
                    int i3 = 0;
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((i4c0) it.next()).a == FavoritePlaceType.FAVORITE_ORGANIZATION) {
                                i3 = 1;
                                break;
                            }
                        }
                    }
                    if (i3 != 0) {
                        int i4 = vb50Var.b;
                        favoritePlacesRepository$handleFavoriteOrganizations$1.L$0 = null;
                        favoritePlacesRepository$handleFavoriteOrganizations$1.I$0 = i3;
                        favoritePlacesRepository$handleFavoriteOrganizations$1.label = 1;
                        obj = this.b.a(i4, favoritePlacesRepository$handleFavoriteOrganizations$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                for (pgp pgpVar : (List) obj) {
                    arrayList.add(new qgp(pgpVar.a, pgpVar.b, pgpVar.c, pgpVar.d, pgpVar.e));
                }
                return zy11.a;
            }
        }
        favoritePlacesRepository$handleFavoriteOrganizations$1 = new FavoritePlacesRepository$handleFavoriteOrganizations$1(this, continuationImpl);
        Object obj3 = favoritePlacesRepository$handleFavoriteOrganizations$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritePlacesRepository$handleFavoriteOrganizations$1.label;
        ArrayList arrayList3 = this.h;
        if (i != 0) {
        }
        while (r11.hasNext()) {
        }
        return zy11.a;
    }

    public final Object d(RefreshType refreshType, SuspendLambda suspendLambda) {
        l8x l8xVar;
        RefreshType refreshType2;
        Pair pair = this.i;
        zy11 zy11Var = zy11.a;
        if (pair != null && ((refreshType2 = (RefreshType) pair.getFirst()) == RefreshType.ALL || refreshType2 == refreshType)) {
            return zy11Var;
        }
        Pair pair2 = this.i;
        if (pair2 != null && (l8xVar = (l8x) pair2.f()) != null) {
            l8xVar.a(null);
        }
        Object n = bvf0.n(new FavoritePlacesRepository$refresh$2(this, refreshType, null), suspendLambda);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11Var;
    }
}
