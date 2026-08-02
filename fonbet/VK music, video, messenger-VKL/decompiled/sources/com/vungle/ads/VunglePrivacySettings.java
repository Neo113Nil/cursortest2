package com.vungle.ads;

import com.ironsource.Hb;
import com.ironsource.Wa;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;

/* loaded from: classes7.dex */
public final class VunglePrivacySettings {
    public static final VunglePrivacySettings INSTANCE = new VunglePrivacySettings();

    public static final String getCCPAStatus() {
        String value;
        PrivacyManager.INSTANCE.getClass();
        PrivacyConsent privacyConsent = PrivacyManager.h;
        return (privacyConsent == null || (value = privacyConsent.getValue()) == null) ? PrivacyConsent.UNKNOWN.getValue() : value;
    }

    public static final String getCOPPAStatus() {
        PrivacyManager.INSTANCE.getClass();
        return PrivacyManager.c().name();
    }

    public static final String getGDPRMessageVersion() {
        PrivacyManager.INSTANCE.getClass();
        String str = PrivacyManager.f;
        return str == null ? "" : str;
    }

    public static final String getGDPRSource() {
        PrivacyManager.INSTANCE.getClass();
        String str = PrivacyManager.e;
        return str == null ? "no_interaction" : str;
    }

    public static final String getGDPRStatus() {
        PrivacyManager.INSTANCE.getClass();
        return PrivacyManager.b();
    }

    public static final long getGDPRTimestamp() {
        PrivacyManager.INSTANCE.getClass();
        Long l = PrivacyManager.g;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final void setCCPAStatus(boolean z) {
        PrivacyManager.INSTANCE.updateCcpaConsent(z ? PrivacyConsent.OPT_IN : PrivacyConsent.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean z) {
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.b.set(Boolean.valueOf(z));
        FilePreferences filePreferences = PrivacyManager.i;
        if (filePreferences != null) {
            filePreferences.a(z, Wa.G).b();
        }
    }

    public static final void setGDPRStatus(boolean z, String str) {
        String value = z ? PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue();
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.a(value, Hb.b, str);
    }
}
