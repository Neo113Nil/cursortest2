package com.yandex.passport.internal.ui.challenge.logout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import defpackage.d6z;
import defpackage.wwg;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class g {
    public static Intent a(Context context, PassportLogoutPropertiesImpl passportLogoutPropertiesImpl, LogoutBehaviour logoutBehaviour) {
        Bundle[] bundleArr = {passportLogoutPropertiesImpl.toBundle(), wwg.g(new Pair("passport-logout-behaviour", logoutBehaviour))};
        Bundle bundle = new Bundle();
        for (int i = 0; i < 2; i++) {
            bundle.putAll(bundleArr[i]);
        }
        return d6z.B(context, LogoutComposeActivity.class, bundle);
    }
}
