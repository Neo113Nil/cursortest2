package com.yandex.passport.internal.ui.social;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;

/* loaded from: classes15.dex */
public interface j {
    void onSocialAccountBound();

    void showSocialAuth(boolean z, SocialConfiguration socialConfiguration, boolean z2, ModernAccount modernAccount);
}
