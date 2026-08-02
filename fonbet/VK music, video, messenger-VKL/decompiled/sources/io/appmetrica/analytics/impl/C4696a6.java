package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4696a6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC5316y9 enumC5316y9;
        Bundle readBundle = parcel.readBundle(N6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i = readBundle.getInt("CounterReport.Source");
            EnumC5316y9[] values = EnumC5316y9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC5316y9 = EnumC5316y9.NATIVE;
                    break;
                }
                enumC5316y9 = values[i2];
                if (enumC5316y9.a == i) {
                    break;
                }
                i2++;
            }
        } else {
            enumC5316y9 = null;
        }
        C4722b6 c4722b6 = new C4722b6("", "", 0);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        c4722b6.d = readBundle.getInt("CounterReport.Type", -1);
        c4722b6.e = readBundle.getInt("CounterReport.CustomType");
        c4722b6.b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        c4722b6.c = readBundle.getString("CounterReport.Environment");
        c4722b6.a = readBundle.getString("CounterReport.Event");
        c4722b6.f = C4722b6.a(readBundle);
        c4722b6.g = readBundle.getInt("CounterReport.TRUNCATED");
        c4722b6.h = readBundle.getString("CounterReport.ProfileID");
        c4722b6.i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        c4722b6.j = readBundle.getLong("CounterReport.CreationTimestamp");
        c4722b6.k = EnumC5088pa.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        c4722b6.l = enumC5316y9;
        c4722b6.m = readBundle.getBundle("CounterReport.Payload");
        c4722b6.n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        c4722b6.o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        c4722b6.p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return c4722b6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C4722b6[i];
    }
}
