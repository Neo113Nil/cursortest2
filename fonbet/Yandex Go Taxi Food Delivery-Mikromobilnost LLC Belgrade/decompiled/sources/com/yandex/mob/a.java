package com.yandex.mob;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Geocoder$GeocodeListener;
import android.os.Build;
import defpackage.d9;
import defpackage.dvw;
import defpackage.i3y;
import defpackage.jse;
import defpackage.kol0;
import defpackage.ny61;
import defpackage.sf;
import defpackage.tje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final jse b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.SYNCHRONIZED, new d9(11, this));

    public a(Context context, jse jseVar) {
        this.a = context;
        this.b = jseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Geocoder geocoder, double d, double d2, int i, ContinuationImpl continuationImpl) {
        AndroidDeviceGeocodeGateway$getFromLocationCompat$1 androidDeviceGeocodeGateway$getFromLocationCompat$1;
        int i2;
        List<Address> fromLocation;
        aVar.getClass();
        if (continuationImpl instanceof AndroidDeviceGeocodeGateway$getFromLocationCompat$1) {
            androidDeviceGeocodeGateway$getFromLocationCompat$1 = (AndroidDeviceGeocodeGateway$getFromLocationCompat$1) continuationImpl;
            int i3 = androidDeviceGeocodeGateway$getFromLocationCompat$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                androidDeviceGeocodeGateway$getFromLocationCompat$1.label = i3 - Integer.MIN_VALUE;
                Object obj = androidDeviceGeocodeGateway$getFromLocationCompat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = androidDeviceGeocodeGateway$getFromLocationCompat$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (Build.VERSION.SDK_INT < 33) {
                        fromLocation = geocoder.getFromLocation(d, d2, i);
                        return fromLocation == null ? EmptyList.a : fromLocation;
                    }
                    androidDeviceGeocodeGateway$getFromLocationCompat$1.L$0 = null;
                    androidDeviceGeocodeGateway$getFromLocationCompat$1.D$0 = d;
                    androidDeviceGeocodeGateway$getFromLocationCompat$1.D$1 = d2;
                    androidDeviceGeocodeGateway$getFromLocationCompat$1.I$0 = i;
                    androidDeviceGeocodeGateway$getFromLocationCompat$1.label = 1;
                    final kol0 kol0Var = new kol0(dvw.b(androidDeviceGeocodeGateway$getFromLocationCompat$1));
                    geocoder.getFromLocation(d, d2, i, sf.i(new Geocoder$GeocodeListener() { // from class: com.yandex.mob.AndroidDeviceGeocodeGateway$getFromLocation33$2$1
                        public final void onGeocode(List<Address> list) {
                            kol0Var.resumeWith(list);
                        }
                    }));
                    obj = kol0Var.a();
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                fromLocation = (List) obj;
                if (fromLocation == null) {
                }
            }
        }
        androidDeviceGeocodeGateway$getFromLocationCompat$1 = new AndroidDeviceGeocodeGateway$getFromLocationCompat$1(aVar, continuationImpl);
        Object obj2 = androidDeviceGeocodeGateway$getFromLocationCompat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = androidDeviceGeocodeGateway$getFromLocationCompat$1.label;
        if (i2 != 0) {
        }
        fromLocation = (List) obj2;
        if (fromLocation == null) {
        }
    }

    public final Object b(double d, double d2, Continuation continuation) {
        return tje.k0(this.b, new AndroidDeviceGeocodeGateway$geocode$2(this, d, d2, null), continuation);
    }
}
