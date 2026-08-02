package com.yandex.passport.internal.ui.authsdk;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import com.yandex.passport.internal.ui.EventError;

/* loaded from: classes2.dex */
public interface r {
    void onCanceled();

    void onDeclined();

    void onErrorCode(EventError eventError, ModernAccount modernAccount);

    void onResultReceived(AuthSdkResultContainer authSdkResultContainer);

    void showContent(ExternalApplicationPermissionsResult externalApplicationPermissionsResult, ModernAccount modernAccount);

    void showProgress(ModernAccount modernAccount);
}
