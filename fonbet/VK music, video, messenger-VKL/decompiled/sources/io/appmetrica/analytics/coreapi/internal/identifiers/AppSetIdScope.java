package io.appmetrica.analytics.coreapi.internal.identifiers;

import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes8.dex */
public enum AppSetIdScope {
    UNKNOWN(""),
    APP(MBridgeConstans.DYNAMIC_VIEW_WX_APP),
    DEVELOPER("developer");

    private final String a;

    AppSetIdScope(String str) {
        this.a = str;
    }

    public final String getValue() {
        return this.a;
    }
}
