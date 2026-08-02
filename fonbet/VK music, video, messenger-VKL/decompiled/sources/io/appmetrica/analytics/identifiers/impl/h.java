package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import xsna.m5k;

/* loaded from: classes8.dex */
public final class h implements b {
    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new c(IdentifierStatus.OK, new a(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "could not resolve google services", 2);
        } catch (Throwable th) {
            return new c(IdentifierStatus.UNKNOWN, null, m5k.b(th, new StringBuilder("exception while fetching google adv_id: ")), 2);
        }
    }
}
