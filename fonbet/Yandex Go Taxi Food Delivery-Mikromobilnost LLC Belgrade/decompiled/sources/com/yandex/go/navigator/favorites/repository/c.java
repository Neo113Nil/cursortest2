package com.yandex.go.navigator.favorites.repository;

import android.util.Range;
import com.yandex.go.navigator.favorites.data.FavoritePlaceType;
import com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto;
import com.yandex.go.navigator.favorites.experiment.f;
import defpackage.i4c0;
import defpackage.ie61;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.oqx;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.vb50;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final rqo a;
    public vb50 b;

    public c(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FavoritesConfigRepository$getConfig$1 favoritesConfigRepository$getConfig$1;
        int i;
        if (continuationImpl instanceof FavoritesConfigRepository$getConfig$1) {
            favoritesConfigRepository$getConfig$1 = (FavoritesConfigRepository$getConfig$1) continuationImpl;
            int i2 = favoritesConfigRepository$getConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesConfigRepository$getConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesConfigRepository$getConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesConfigRepository$getConfig$1.label;
                i4c0 i4c0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vb50 vb50Var = this.b;
                    if (vb50Var != null) {
                        return vb50Var;
                    }
                    NavigatorFavoritesConfigDto.Companion.getClass();
                    t1b0 e = ((jbh) this.a).e(NavigatorFavoritesConfigDto.i);
                    favoritesConfigRepository$getConfig$1.L$0 = null;
                    favoritesConfigRepository$getConfig$1.label = 1;
                    obj = e.b(favoritesConfigRepository$getConfig$1);
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
                NavigatorFavoritesConfigDto navigatorFavoritesConfigDto = (NavigatorFavoritesConfigDto) obj;
                boolean z = navigatorFavoritesConfigDto.b;
                int i3 = navigatorFavoritesConfigDto.c;
                oqx oqxVar = new oqx(navigatorFavoritesConfigDto.d, navigatorFavoritesConfigDto.e, navigatorFavoritesConfigDto.f);
                List<NavigatorFavoritesConfigDto.PlacemarkVariantDto> list = navigatorFavoritesConfigDto.g;
                ArrayList arrayList = new ArrayList();
                for (NavigatorFavoritesConfigDto.PlacemarkVariantDto placemarkVariantDto : list) {
                    int i4 = f.a[placemarkVariantDto.a.ordinal()];
                    FavoritePlaceType favoritePlaceType = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4c0Var : FavoritePlaceType.FAVORITE_ORGANIZATION : FavoritePlaceType.WORK : FavoritePlaceType.HOME;
                    if (favoritePlaceType != 0) {
                        List<NavigatorFavoritesConfigDto.ZoomAppearanceDto> list2 = placemarkVariantDto.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (NavigatorFavoritesConfigDto.ZoomAppearanceDto zoomAppearanceDto : list2) {
                            NavigatorFavoritesConfigDto.ZoomRangeDto zoomRangeDto = zoomAppearanceDto.c;
                            float f = zoomRangeDto.b;
                            if (f <= 0.0f) {
                                f = Float.MIN_VALUE;
                            }
                            float f2 = zoomRangeDto.a;
                            if (f2 <= 0.0f) {
                                f2 = Float.MAX_VALUE;
                            }
                            Object ie61Var = f > f2 ? i4c0Var : new ie61(zoomAppearanceDto.a, zoomAppearanceDto.b, new Range(Float.valueOf(f), Float.valueOf(f2)));
                            if (ie61Var == null) {
                                ie61Var = null;
                            }
                            if (ie61Var != null) {
                                arrayList2.add(ie61Var);
                            }
                            i4c0Var = null;
                        }
                        i4c0Var = new i4c0(favoritePlaceType, arrayList2);
                    }
                    if (i4c0Var != null) {
                        arrayList.add(i4c0Var);
                    }
                    i4c0Var = null;
                }
                vb50 vb50Var2 = new vb50(z, i3, oqxVar, arrayList);
                this.b = vb50Var2;
                return vb50Var2;
            }
        }
        favoritesConfigRepository$getConfig$1 = new FavoritesConfigRepository$getConfig$1(this, continuationImpl);
        Object obj2 = favoritesConfigRepository$getConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesConfigRepository$getConfig$1.label;
        i4c0 i4c0Var2 = null;
        if (i != 0) {
        }
        NavigatorFavoritesConfigDto navigatorFavoritesConfigDto2 = (NavigatorFavoritesConfigDto) obj2;
        boolean z2 = navigatorFavoritesConfigDto2.b;
        int i32 = navigatorFavoritesConfigDto2.c;
        oqx oqxVar2 = new oqx(navigatorFavoritesConfigDto2.d, navigatorFavoritesConfigDto2.e, navigatorFavoritesConfigDto2.f);
        List<NavigatorFavoritesConfigDto.PlacemarkVariantDto> list3 = navigatorFavoritesConfigDto2.g;
        ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        vb50 vb50Var22 = new vb50(z2, i32, oqxVar2, arrayList3);
        this.b = vb50Var22;
        return vb50Var22;
    }
}
