package com.yandex.passport.internal.ui.domik.di;

import com.yandex.passport.internal.ui.domik.call.e;
import com.yandex.passport.internal.ui.domik.identifier.d;
import com.yandex.passport.internal.ui.domik.k;
import com.yandex.passport.internal.ui.domik.q;

/* loaded from: classes2.dex */
public interface a {
    k getDomikDesignProvider();

    q getDomikRouter();

    com.yandex.passport.internal.ui.domik.smsauth.b newAuthBySmsViewModel();

    e newCallConfirmViewModel();

    com.yandex.passport.internal.ui.domik.extaction.b newExternalActionViewModel();

    d newIdentifierCredentialManagerViewModel();

    com.yandex.passport.internal.ui.domik.phone_number.a newPhoneNumberViewModel();

    com.yandex.passport.internal.ui.domik.relogin.c newReloginViewModel();

    com.yandex.passport.internal.ui.domik.sms.b newSmsViewModel();

    com.yandex.passport.internal.ui.domik.username.b newUsernameInputViewModel();
}
