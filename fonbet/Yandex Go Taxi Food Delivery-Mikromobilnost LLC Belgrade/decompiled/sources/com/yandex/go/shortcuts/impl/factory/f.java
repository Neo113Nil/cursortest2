package com.yandex.go.shortcuts.impl.factory;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.shortcuts.dto.request.SavedPlace;
import com.yandex.go.shortcuts.factory.SavedPlaceFactory$CreationCacheStrategy;
import defpackage.ffp;
import defpackage.ny61;
import defpackage.q1m0;
import defpackage.r1m0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f implements q1m0 {
    public final ru.yandex.taxi.favorites.data.repo.a a;

    public f(ru.yandex.taxi.favorites.data.repo.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(3:11|12|13)(2:35|36))(3:37|38|39))(5:40|41|42|(1:(2:45|(1:47)(2:48|49))(3:50|(1:52)|13))(1:54)|53)|(1:17)|18|(5:21|(1:23)|(2:30|31)(2:27|28)|29|19)|32|33))|59|6|7|(0)(0)|(2:15|17)|18|(1:19)|32|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e5, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(SavedPlaceFactory$CreationCacheStrategy savedPlaceFactory$CreationCacheStrategy, ContinuationImpl continuationImpl) {
        SavedPlaceFactoryImpl$create$1 savedPlaceFactoryImpl$create$1;
        int i;
        Collection collection;
        String name;
        ffp a;
        Collection collection2;
        if (continuationImpl instanceof SavedPlaceFactoryImpl$create$1) {
            savedPlaceFactoryImpl$create$1 = (SavedPlaceFactoryImpl$create$1) continuationImpl;
            int i2 = savedPlaceFactoryImpl$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savedPlaceFactoryImpl$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savedPlaceFactoryImpl$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savedPlaceFactoryImpl$create$1.label;
                collection = EmptyList.a;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i4 = r1m0.a[savedPlaceFactory$CreationCacheStrategy.ordinal()];
                    ru.yandex.taxi.favorites.data.repo.a aVar = this.a;
                    if (i4 == 1) {
                        savedPlaceFactoryImpl$create$1.L$0 = null;
                        savedPlaceFactoryImpl$create$1.label = 1;
                        obj = aVar.c(false, savedPlaceFactoryImpl$create$1);
                    } else if (i4 == 2) {
                        savedPlaceFactoryImpl$create$1.L$0 = null;
                        savedPlaceFactoryImpl$create$1.label = 2;
                        obj = aVar.c(true, savedPlaceFactoryImpl$create$1);
                        if (obj == coroutineSingletons) {
                        }
                        a = (ffp) obj;
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a = aVar.f.a();
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    a = (ffp) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = (ffp) obj;
                }
                if (a != null && (collection2 = a.a) != null) {
                    collection = collection2;
                }
                Collection<FavoriteAddress> collection3 = collection;
                ArrayList arrayList = new ArrayList(tcc.n(collection3, 10));
                for (FavoriteAddress favoriteAddress : collection3) {
                    PlaceType placeType = favoriteAddress.getPlaceType();
                    if (placeType == PlaceType.OTHER) {
                        placeType = null;
                    }
                    String lowerCase = (placeType == null || (name = placeType.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
                    zzs point = favoriteAddress.getPoint();
                    arrayList.add(new SavedPlace(lowerCase, new SavedPlace.Location(scc.g(Double.valueOf(point.a), Double.valueOf(point.b)), i3)));
                }
                return arrayList;
            }
        }
        savedPlaceFactoryImpl$create$1 = new SavedPlaceFactoryImpl$create$1(this, continuationImpl);
        Object obj2 = savedPlaceFactoryImpl$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savedPlaceFactoryImpl$create$1.label;
        collection = EmptyList.a;
        int i32 = 2;
        if (i != 0) {
        }
        if (a != null) {
            collection = collection2;
        }
        Collection<FavoriteAddress> collection32 = collection;
        ArrayList arrayList2 = new ArrayList(tcc.n(collection32, 10));
        while (r10.hasNext()) {
        }
        return arrayList2;
    }
}
