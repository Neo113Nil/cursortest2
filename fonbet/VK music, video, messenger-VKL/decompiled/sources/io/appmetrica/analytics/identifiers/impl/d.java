package io.appmetrica.analytics.identifiers.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes8.dex */
public final class d {
    public final Map a;

    public d(Map map) {
        this.a = map;
    }

    public d() {
        this(pn00.k(new Pair(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, new h()), new Pair("huawei", new j()), new Pair("yandex", new q())));
    }
}
