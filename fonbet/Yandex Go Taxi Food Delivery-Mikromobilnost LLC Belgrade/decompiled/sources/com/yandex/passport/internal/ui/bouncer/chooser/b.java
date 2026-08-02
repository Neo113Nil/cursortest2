package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.api.AccountListBranding;

/* loaded from: classes2.dex */
public interface b {
    AccountListBranding getBranding();

    com.yandex.passport.common.ui.progress.g getProgressProperties();

    com.yandex.passport.common.ui.lang.b getUiLanguageProvider();

    w getViewModelFactory();

    boolean isWhiteLabel();
}
