package com.yandex.passport.internal.properties;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ny61;
import defpackage.vng;

/* loaded from: classes2.dex */
public final class j {
    public static ManagingPlusDevicesPropertiesImpl a(Bundle bundle) {
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle, ManagingPlusDevicesPropertiesImpl.class, "key_managing_plus_devices_properties") : bundle.getParcelable("key_managing_plus_devices_properties");
        if (parcelable != null) {
            return (ManagingPlusDevicesPropertiesImpl) parcelable;
        }
        ny61.r("can't get required parcelable key_managing_plus_devices_properties");
        return null;
    }
}
