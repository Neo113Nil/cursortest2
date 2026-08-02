package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;

/* compiled from: WebViewMarkerSettingImpl.kt */
/* loaded from: classes7.dex */
public final class bjx0 implements ajx0 {
    @Override // xsna.ajx0
    public final boolean isEnabled() {
        return BuildInfo.p() && Preference.j().getBoolean("webViewBetaMarker", BuildInfo.e());
    }

    @Override // xsna.ajx0
    public final void setEnabled(boolean z) {
        qaj0.c(Preference.j(), "webViewBetaMarker", Boolean.valueOf(z));
    }
}
