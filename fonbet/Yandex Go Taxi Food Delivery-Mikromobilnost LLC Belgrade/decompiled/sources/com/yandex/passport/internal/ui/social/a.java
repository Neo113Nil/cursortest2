package com.yandex.passport.internal.ui.social;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;

/* loaded from: classes2.dex */
public interface a {
    void onSocialAccountAdded(ModernAccount modernAccount);

    void showSocialAuth(boolean z, SocialConfiguration socialConfiguration, boolean z2, ModernAccount modernAccount);
}
