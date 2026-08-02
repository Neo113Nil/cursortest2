package com.yandex.go.navigator.favorites.repository;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.navigator.favorites.data.FavoritePlaceType;
import defpackage.bvf0;
import defpackage.i4c0;
import defpackage.ny61;
import defpackage.tt2;
import defpackage.vb50;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final c a;
    public final e b;
    public final tt2 c;
    public final LinkedHashMap d = new LinkedHashMap();

    public a(c cVar, e eVar, tt2 tt2Var) {
        this.a = cVar;
        this.b = eVar;
        this.c = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r6 == r8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        FavoritePinAppearanceRepository$loadIconByTag$1 favoritePinAppearanceRepository$loadIconByTag$1;
        int i;
        Object obj;
        aVar.getClass();
        e eVar = aVar.b;
        if (continuationImpl instanceof FavoritePinAppearanceRepository$loadIconByTag$1) {
            favoritePinAppearanceRepository$loadIconByTag$1 = (FavoritePinAppearanceRepository$loadIconByTag$1) continuationImpl;
            int i2 = favoritePinAppearanceRepository$loadIconByTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritePinAppearanceRepository$loadIconByTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = favoritePinAppearanceRepository$loadIconByTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritePinAppearanceRepository$loadIconByTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    favoritePinAppearanceRepository$loadIconByTag$1.L$0 = str;
                    favoritePinAppearanceRepository$loadIconByTag$1.label = 1;
                    obj2 = e.i(eVar, str, null, favoritePinAppearanceRepository$loadIconByTag$1, 14);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    str = (String) favoritePinAppearanceRepository$loadIconByTag$1.L$0;
                    kotlin.b.b(obj2);
                }
                obj = (BitmapDrawable) obj2;
                if (obj == null) {
                    favoritePinAppearanceRepository$loadIconByTag$1.L$0 = null;
                    favoritePinAppearanceRepository$loadIconByTag$1.label = 2;
                    obj = e.f(eVar, str, null, favoritePinAppearanceRepository$loadIconByTag$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
        }
        favoritePinAppearanceRepository$loadIconByTag$1 = new FavoritePinAppearanceRepository$loadIconByTag$1(aVar, continuationImpl);
        Object obj22 = favoritePinAppearanceRepository$loadIconByTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritePinAppearanceRepository$loadIconByTag$1.label;
        if (i != 0) {
        }
        obj = (BitmapDrawable) obj22;
        if (obj == null) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FavoritePinAppearanceRepository$getLabelConfig$1 favoritePinAppearanceRepository$getLabelConfig$1;
        int i;
        if (continuationImpl instanceof FavoritePinAppearanceRepository$getLabelConfig$1) {
            favoritePinAppearanceRepository$getLabelConfig$1 = (FavoritePinAppearanceRepository$getLabelConfig$1) continuationImpl;
            int i2 = favoritePinAppearanceRepository$getLabelConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritePinAppearanceRepository$getLabelConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritePinAppearanceRepository$getLabelConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritePinAppearanceRepository$getLabelConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    favoritePinAppearanceRepository$getLabelConfig$1.label = 1;
                    obj = this.a.a(favoritePinAppearanceRepository$getLabelConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((vb50) obj).c;
            }
        }
        favoritePinAppearanceRepository$getLabelConfig$1 = new FavoritePinAppearanceRepository$getLabelConfig$1(this, continuationImpl);
        Object obj2 = favoritePinAppearanceRepository$getLabelConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritePinAppearanceRepository$getLabelConfig$1.label;
        if (i != 0) {
        }
        return ((vb50) obj2).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(FavoritePlaceType favoritePlaceType, ContinuationImpl continuationImpl) {
        FavoritePinAppearanceRepository$getZoomAppearanceListForType$1 favoritePinAppearanceRepository$getZoomAppearanceListForType$1;
        int i;
        Iterator it;
        Object obj;
        i4c0 i4c0Var;
        if (continuationImpl instanceof FavoritePinAppearanceRepository$getZoomAppearanceListForType$1) {
            favoritePinAppearanceRepository$getZoomAppearanceListForType$1 = (FavoritePinAppearanceRepository$getZoomAppearanceListForType$1) continuationImpl;
            int i2 = favoritePinAppearanceRepository$getZoomAppearanceListForType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritePinAppearanceRepository$getZoomAppearanceListForType$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = favoritePinAppearanceRepository$getZoomAppearanceListForType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritePinAppearanceRepository$getZoomAppearanceListForType$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    favoritePinAppearanceRepository$getZoomAppearanceListForType$1.L$0 = favoritePlaceType;
                    favoritePinAppearanceRepository$getZoomAppearanceListForType$1.label = 1;
                    obj2 = this.a.a(favoritePinAppearanceRepository$getZoomAppearanceListForType$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    favoritePlaceType = (FavoritePlaceType) favoritePinAppearanceRepository$getZoomAppearanceListForType$1.L$0;
                    kotlin.b.b(obj2);
                }
                it = ((vb50) obj2).d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((i4c0) obj).a == favoritePlaceType) {
                        break;
                    }
                }
                i4c0Var = (i4c0) obj;
                if (i4c0Var == null) {
                    return i4c0Var.b;
                }
                return null;
            }
        }
        favoritePinAppearanceRepository$getZoomAppearanceListForType$1 = new FavoritePinAppearanceRepository$getZoomAppearanceListForType$1(this, continuationImpl);
        Object obj22 = favoritePinAppearanceRepository$getZoomAppearanceListForType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritePinAppearanceRepository$getZoomAppearanceListForType$1.label;
        if (i != 0) {
        }
        it = ((vb50) obj22).d.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        i4c0Var = (i4c0) obj;
        if (i4c0Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(FavoritePlaceType favoritePlaceType, ContinuationImpl continuationImpl) {
        FavoritePinAppearanceRepository$loadPlacePinAppearances$1 favoritePinAppearanceRepository$loadPlacePinAppearances$1;
        int i;
        List list;
        FavoritePlaceType favoritePlaceType2;
        if (continuationImpl instanceof FavoritePinAppearanceRepository$loadPlacePinAppearances$1) {
            favoritePinAppearanceRepository$loadPlacePinAppearances$1 = (FavoritePinAppearanceRepository$loadPlacePinAppearances$1) continuationImpl;
            int i2 = favoritePinAppearanceRepository$loadPlacePinAppearances$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritePinAppearanceRepository$loadPlacePinAppearances$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritePinAppearanceRepository$loadPlacePinAppearances$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritePinAppearanceRepository$loadPlacePinAppearances$1.label;
                LinkedHashMap linkedHashMap = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = (List) linkedHashMap.get(favoritePlaceType);
                    if (list2 != null) {
                        return list2;
                    }
                    favoritePinAppearanceRepository$loadPlacePinAppearances$1.L$0 = favoritePlaceType;
                    favoritePinAppearanceRepository$loadPlacePinAppearances$1.label = 1;
                    obj = c(favoritePlaceType, favoritePinAppearanceRepository$loadPlacePinAppearances$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        favoritePlaceType2 = (FavoritePlaceType) favoritePinAppearanceRepository$loadPlacePinAppearances$1.L$0;
                        kotlin.b.b(obj);
                        List list3 = (List) obj;
                        linkedHashMap.put(favoritePlaceType2, list3);
                        return list3;
                    }
                    favoritePlaceType = (FavoritePlaceType) favoritePinAppearanceRepository$loadPlacePinAppearances$1.L$0;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                if (list != null) {
                    return EmptyList.a;
                }
                FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1 favoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1 = new FavoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1(list, this, null);
                favoritePinAppearanceRepository$loadPlacePinAppearances$1.L$0 = favoritePlaceType;
                favoritePinAppearanceRepository$loadPlacePinAppearances$1.L$1 = null;
                favoritePinAppearanceRepository$loadPlacePinAppearances$1.label = 2;
                obj = bvf0.n(favoritePinAppearanceRepository$loadPlacePinAppearances$placePinAppearances$1, favoritePinAppearanceRepository$loadPlacePinAppearances$1);
                if (obj != obj2) {
                    favoritePlaceType2 = favoritePlaceType;
                    List list32 = (List) obj;
                    linkedHashMap.put(favoritePlaceType2, list32);
                    return list32;
                }
                return obj2;
            }
        }
        favoritePinAppearanceRepository$loadPlacePinAppearances$1 = new FavoritePinAppearanceRepository$loadPlacePinAppearances$1(this, continuationImpl);
        Object obj3 = favoritePinAppearanceRepository$loadPlacePinAppearances$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritePinAppearanceRepository$loadPlacePinAppearances$1.label;
        LinkedHashMap linkedHashMap2 = this.d;
        if (i != 0) {
        }
        list = (List) obj3;
        if (list != null) {
        }
    }
}
