package xsna;

import com.vk.dto.common.data.PrivacySetting;

/* compiled from: PrivacyUserAndGroupSettings.kt */
/* loaded from: classes8.dex */
public final class rfd0 {
    public final PrivacySetting a;

    public rfd0() {
        this(null, 3);
    }

    public rfd0(PrivacySetting privacySetting, int i) {
        this.a = (i & 1) != 0 ? null : privacySetting;
    }
}
