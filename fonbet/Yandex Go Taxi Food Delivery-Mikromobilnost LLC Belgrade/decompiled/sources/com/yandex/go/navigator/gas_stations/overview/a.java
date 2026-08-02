package com.yandex.go.navigator.gas_stations.overview;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.search.BusinessImagesObjectMetadata;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.search.FuelMetadata;
import com.yandex.mapkit.search.FuelType;
import com.yandex.mapkit.search.RouteDistancesObjectMetadata;
import defpackage.avj0;
import defpackage.dnr;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.g16;
import defpackage.i3y;
import defpackage.jcb1;
import defpackage.kyh0;
import defpackage.nfv;
import defpackage.nts;
import defpackage.ny61;
import defpackage.pav;
import defpackage.sls;
import defpackage.v2h0;
import defpackage.vng;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final pav a;
    public final zuj0 b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new dnr(19, this));

    public a(pav pavVar, zuj0 zuj0Var) {
        this.a = pavVar;
        this.b = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(GeoObject geoObject, ContinuationImpl continuationImpl) {
        GasStationToCardStateMapper$getLogo$1 gasStationToCardStateMapper$getLogo$1;
        int i;
        BusinessImagesObjectMetadata.Logo logo;
        String urlTemplate;
        Bitmap bitmap;
        if (continuationImpl instanceof GasStationToCardStateMapper$getLogo$1) {
            gasStationToCardStateMapper$getLogo$1 = (GasStationToCardStateMapper$getLogo$1) continuationImpl;
            int i2 = gasStationToCardStateMapper$getLogo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationToCardStateMapper$getLogo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationToCardStateMapper$getLogo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationToCardStateMapper$getLogo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    BusinessImagesObjectMetadata businessImagesObjectMetadata = (BusinessImagesObjectMetadata) geoObject.getMetadataContainer().getItem(BusinessImagesObjectMetadata.class);
                    g16 b = this.a.b().b((businessImagesObjectMetadata == null || (logo = businessImagesObjectMetadata.getLogo()) == null || (urlTemplate = logo.getUrlTemplate()) == null) ? null : String.format(urlTemplate, Arrays.copyOf(new Object[]{"M_height"}, 1)));
                    i3y i3yVar = this.c;
                    g16 e = b.g(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue()).e(nfv.a);
                    gasStationToCardStateMapper$getLogo$1.L$0 = null;
                    gasStationToCardStateMapper$getLogo$1.L$1 = null;
                    gasStationToCardStateMapper$getLogo$1.L$2 = null;
                    gasStationToCardStateMapper$getLogo$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(e, gasStationToCardStateMapper$getLogo$1);
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
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    return bitmap;
                }
                Drawable t = vng.t(v2h0.ic_gas_station_bg_rounded_blue_40, ((avj0) this.b).a);
                if (t != null) {
                    return ffx.d0(t, 0, 0, 7);
                }
                return null;
            }
        }
        gasStationToCardStateMapper$getLogo$1 = new GasStationToCardStateMapper$getLogo$1(this, continuationImpl);
        Object obj2 = gasStationToCardStateMapper$getLogo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationToCardStateMapper$getLogo$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.yandex.go.navigator.gas_stations.overview.a] */
    /* JADX WARN: Type inference failed for: r4v3, types: [sls] */
    /* JADX WARN: Type inference failed for: r5v8, types: [sls] */
    /* JADX WARN: Type inference failed for: r6v2, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(GeoObject geoObject, b bVar, b bVar2, b bVar3, ContinuationImpl continuationImpl) {
        GasStationToCardStateMapper$map$1 gasStationToCardStateMapper$map$1;
        int i;
        String str;
        Object a;
        b bVar4;
        b bVar5;
        b bVar6;
        List<FuelType> fuels;
        RouteDistancesObjectMetadata routeDistancesObjectMetadata;
        String str2;
        GeoObject geoObject2 = geoObject;
        if (continuationImpl instanceof GasStationToCardStateMapper$map$1) {
            gasStationToCardStateMapper$map$1 = (GasStationToCardStateMapper$map$1) continuationImpl;
            int i2 = gasStationToCardStateMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationToCardStateMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gasStationToCardStateMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationToCardStateMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FuelMetadata fuelMetadata = (FuelMetadata) geoObject2.getMetadataContainer().getItem(FuelMetadata.class);
                    if (fuelMetadata == null || (fuels = fuelMetadata.getFuels()) == null) {
                        str = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = fuels.iterator();
                        while (it.hasNext()) {
                            String name = ((FuelType) it.next()).getName();
                            if (name != null) {
                                arrayList.add(name);
                            }
                        }
                        str = kotlin.collections.a.X(arrayList, null, null, null, null, 63);
                    }
                    gasStationToCardStateMapper$map$1.L$0 = geoObject2;
                    gasStationToCardStateMapper$map$1.L$1 = bVar;
                    gasStationToCardStateMapper$map$1.L$2 = bVar2;
                    gasStationToCardStateMapper$map$1.L$3 = bVar3;
                    gasStationToCardStateMapper$map$1.L$4 = str;
                    gasStationToCardStateMapper$map$1.label = 1;
                    a = a(geoObject2, gasStationToCardStateMapper$map$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar4 = bVar;
                    bVar5 = bVar2;
                    bVar6 = bVar3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) gasStationToCardStateMapper$map$1.L$4;
                    ?? r4 = (sls) gasStationToCardStateMapper$map$1.L$3;
                    ?? r5 = (sls) gasStationToCardStateMapper$map$1.L$2;
                    ?? r6 = (sls) gasStationToCardStateMapper$map$1.L$1;
                    GeoObject geoObject3 = (GeoObject) gasStationToCardStateMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    str = str3;
                    geoObject2 = geoObject3;
                    a = obj;
                    bVar6 = r4;
                    bVar5 = r5;
                    bVar4 = r6;
                }
                Bitmap bitmap = (Bitmap) a;
                BusinessObjectMetadata b = jcb1.b(geoObject2);
                String name2 = b == null ? b.getName() : null;
                String str4 = name2 != null ? "" : name2;
                String str5 = str != null ? "" : str;
                routeDistancesObjectMetadata = (RouteDistancesObjectMetadata) geoObject2.getMetadataContainer().getItem(RouteDistancesObjectMetadata.class);
                if (routeDistancesObjectMetadata != null || (str2 = jcb1.c(routeDistancesObjectMetadata)) == null || evu0.J(str2)) {
                    str2 = null;
                }
                String i3 = str2 != null ? ((avj0) this.b).i(kyh0.mt_other_variants, str2) : null;
                return new nts(bitmap, str4, str5, i3 != null ? "" : i3, bVar4, bVar5, bVar6);
            }
        }
        gasStationToCardStateMapper$map$1 = new GasStationToCardStateMapper$map$1(this, continuationImpl);
        Object obj2 = gasStationToCardStateMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationToCardStateMapper$map$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) a;
        BusinessObjectMetadata b2 = jcb1.b(geoObject2);
        if (b2 == null) {
        }
        if (name2 != null) {
        }
        if (str != null) {
        }
        routeDistancesObjectMetadata = (RouteDistancesObjectMetadata) geoObject2.getMetadataContainer().getItem(RouteDistancesObjectMetadata.class);
        if (routeDistancesObjectMetadata != null) {
        }
        str2 = null;
        if (str2 != null) {
        }
        return new nts(bitmap2, str4, str5, i3 != null ? "" : i3, bVar4, bVar5, bVar6);
    }
}
