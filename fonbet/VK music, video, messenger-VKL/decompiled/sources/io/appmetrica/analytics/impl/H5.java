package io.appmetrica.analytics.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class H5 {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, AdTrackingInfo.Provider.GOOGLE);
        hashMap.put("huawei", AdTrackingInfo.Provider.HMS);
        hashMap.put("yandex", AdTrackingInfo.Provider.YANDEX);
        a = Collections.unmodifiableMap(hashMap);
    }
}
