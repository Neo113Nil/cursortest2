package com.yandex.go.places.impl.domain.interactors.my.places;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.cav;
import defpackage.ffp;
import defpackage.hbc0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.scc;
import defpackage.ydf;
import defpackage.z050;
import defpackage.zg21;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ru.yandex.taxi.favorites.data.repo.a a;
    public final j b;
    public final pav c;

    public a(ru.yandex.taxi.favorites.data.repo.a aVar, j jVar, pav pavVar) {
        this.a = aVar;
        this.b = jVar;
        this.c = pavVar;
    }

    public final zg21 a(cav cavVar) {
        String str;
        if (cavVar == null || (str = cavVar.a) == null) {
            return null;
        }
        return new zg21(this.c, str, new ydf(5));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7 A[Catch: all -> 0x0138, CancellationException -> 0x0139, TryCatch #2 {CancellationException -> 0x0139, all -> 0x0138, blocks: (B:12:0x0031, B:13:0x006c, B:15:0x0074, B:17:0x0078, B:19:0x0080, B:21:0x0084, B:22:0x008a, B:24:0x0098, B:26:0x009c, B:28:0x00a4, B:30:0x00a8, B:31:0x00ae, B:32:0x00d1, B:34:0x00d7, B:35:0x00e5, B:37:0x00eb, B:41:0x00fa, B:46:0x0133, B:50:0x0100, B:52:0x0108, B:55:0x0112, B:57:0x011a, B:58:0x0123, B:73:0x003b, B:74:0x004d, B:76:0x0051, B:79:0x0058, B:85:0x0042), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0051 A[Catch: all -> 0x0138, CancellationException -> 0x0139, TryCatch #2 {CancellationException -> 0x0139, all -> 0x0138, blocks: (B:12:0x0031, B:13:0x006c, B:15:0x0074, B:17:0x0078, B:19:0x0080, B:21:0x0084, B:22:0x008a, B:24:0x0098, B:26:0x009c, B:28:0x00a4, B:30:0x00a8, B:31:0x00ae, B:32:0x00d1, B:34:0x00d7, B:35:0x00e5, B:37:0x00eb, B:41:0x00fa, B:46:0x0133, B:50:0x0100, B:52:0x0108, B:55:0x0112, B:57:0x011a, B:58:0x0123, B:73:0x003b, B:74:0x004d, B:76:0x0051, B:79:0x0058, B:85:0x0042), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        MyPlacesInteractor$getMyPlaces$1 myPlacesInteractor$getMyPlaces$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        EmptyList emptyList;
        List list;
        Object e;
        List list2;
        Object obj;
        Pair pair;
        zg21 zg21Var;
        z050 z050Var;
        cav cavVar;
        cav cavVar2;
        cav cavVar3;
        cav cavVar4;
        try {
            if (continuationImpl instanceof MyPlacesInteractor$getMyPlaces$1) {
                myPlacesInteractor$getMyPlaces$1 = (MyPlacesInteractor$getMyPlaces$1) continuationImpl;
                int i2 = myPlacesInteractor$getMyPlaces$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    myPlacesInteractor$getMyPlaces$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = myPlacesInteractor$getMyPlaces$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = myPlacesInteractor$getMyPlaces$1.label;
                    emptyList = EmptyList.a;
                    if (i != 0) {
                        b.b(obj2);
                        ru.yandex.taxi.favorites.data.repo.a aVar = this.a;
                        myPlacesInteractor$getMyPlaces$1.label = 1;
                        obj2 = aVar.c(true, myPlacesInteractor$getMyPlaces$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            list2 = (List) myPlacesInteractor$getMyPlaces$1.L$0;
                            b.b(obj2);
                            hbc0 hbc0Var = (hbc0) obj2;
                            PlaceType placeType = PlaceType.HOME;
                            Pair pair2 = new Pair(placeType, new Pair((hbc0Var != null || (cavVar4 = hbc0Var.a) == null) ? null : a(cavVar4), (hbc0Var != null || (cavVar3 = hbc0Var.g) == null) ? null : a(cavVar3)));
                            PlaceType placeType2 = PlaceType.WORK;
                            Map i3 = kotlin.collections.b.i(pair2, new Pair(placeType2, new Pair((hbc0Var != null || (cavVar2 = hbc0Var.b) == null) ? null : a(cavVar2), (hbc0Var != null || (cavVar = hbc0Var.h) == null) ? null : a(cavVar))));
                            List<PlaceType> g = scc.g(placeType, placeType2);
                            ArrayList arrayList = new ArrayList();
                            for (PlaceType placeType3 : g) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (((FavoriteAddress) obj).getPlaceType() == placeType3) {
                                        break;
                                    }
                                }
                                FavoriteAddress favoriteAddress = (FavoriteAddress) obj;
                                if (favoriteAddress != null && (pair = (Pair) i3.get(placeType3)) != null && (zg21Var = (zg21) pair.c()) != null) {
                                    Pair pair3 = (Pair) i3.get(placeType3);
                                    z050Var = new z050(favoriteAddress.getId(), placeType3, favoriteAddress.getPoint(), zg21Var, false, pair3 != null ? (zg21) pair3.f() : null);
                                    if (z050Var == null) {
                                        arrayList.add(z050Var);
                                    }
                                }
                                z050Var = null;
                                if (z050Var == null) {
                                }
                            }
                            return arrayList;
                        }
                        b.b(obj2);
                    }
                    ffp ffpVar = (ffp) obj2;
                    list = ffpVar == null ? ffpVar.a : null;
                    if (list == null) {
                        list = emptyList;
                    }
                    j jVar = this.b;
                    PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                    myPlacesInteractor$getMyPlaces$1.L$0 = list;
                    myPlacesInteractor$getMyPlaces$1.label = 2;
                    e = jVar.e(placesMapConfig$PlacesMapScreenName, myPlacesInteractor$getMyPlaces$1);
                    if (e != coroutineSingletons) {
                        list2 = list;
                        obj2 = e;
                        hbc0 hbc0Var2 = (hbc0) obj2;
                        PlaceType placeType4 = PlaceType.HOME;
                        Pair pair22 = new Pair(placeType4, new Pair((hbc0Var2 != null || (cavVar4 = hbc0Var2.a) == null) ? null : a(cavVar4), (hbc0Var2 != null || (cavVar3 = hbc0Var2.g) == null) ? null : a(cavVar3)));
                        PlaceType placeType22 = PlaceType.WORK;
                        Map i32 = kotlin.collections.b.i(pair22, new Pair(placeType22, new Pair((hbc0Var2 != null || (cavVar2 = hbc0Var2.b) == null) ? null : a(cavVar2), (hbc0Var2 != null || (cavVar = hbc0Var2.h) == null) ? null : a(cavVar))));
                        List<PlaceType> g2 = scc.g(placeType4, placeType22);
                        ArrayList arrayList2 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        return arrayList2;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            ffp ffpVar2 = (ffp) obj2;
            if (ffpVar2 == null) {
            }
            if (list == null) {
            }
            j jVar2 = this.b;
            PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName2 = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
            myPlacesInteractor$getMyPlaces$1.L$0 = list;
            myPlacesInteractor$getMyPlaces$1.label = 2;
            e = jVar2.e(placesMapConfig$PlacesMapScreenName2, myPlacesInteractor$getMyPlaces$1);
            if (e != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused) {
            return emptyList;
        }
        myPlacesInteractor$getMyPlaces$1 = new MyPlacesInteractor$getMyPlaces$1(this, continuationImpl);
        Object obj22 = myPlacesInteractor$getMyPlaces$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = myPlacesInteractor$getMyPlaces$1.label;
        emptyList = EmptyList.a;
    }
}
