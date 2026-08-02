package io.appmetrica.analytics.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class H {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "FORBIDDEN_BY_REMOTE_CONFIG" : "FORBIDDEN_BY_CLIENT_CONFIG" : "ALLOWED";
    }
}
