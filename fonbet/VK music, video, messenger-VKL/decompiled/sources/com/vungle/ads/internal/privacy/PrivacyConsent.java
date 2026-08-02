package com.vungle.ads.internal.privacy;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes7.dex */
public enum PrivacyConsent {
    UNKNOWN("unknown"),
    OPT_IN("opted_in"),
    OPT_OUT("opted_out");

    private final String value;

    PrivacyConsent(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
