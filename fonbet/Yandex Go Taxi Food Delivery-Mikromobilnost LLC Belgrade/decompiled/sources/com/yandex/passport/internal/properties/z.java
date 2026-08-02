package com.yandex.passport.internal.properties;

import com.yandex.passport.api.m2;
import com.yandex.passport.api.p2;
import com.yandex.passport.internal.network.UrlOverride;
import java.util.Map;

/* loaded from: classes8.dex */
public final class z {
    public static UpdateableProperties a(m2 m2Var) {
        UrlOverride urlOverride;
        p2 urlOverride2 = m2Var.getUrlOverride();
        if (urlOverride2 != null) {
            UrlOverride.Companion.getClass();
            urlOverride = com.yandex.passport.internal.network.p.a(urlOverride2);
        } else {
            urlOverride = null;
        }
        Map locationsUrlOverride = m2Var.getLocationsUrlOverride();
        return new UpdateableProperties(urlOverride, locationsUrlOverride != null ? com.yandex.passport.internal.util.p.w(locationsUrlOverride) : null, m2Var.getProductLocation(), m2Var.getDeviceGeoLocation(), m2Var.getVpnBlockerAdditionalParams());
    }
}
