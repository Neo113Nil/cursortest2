package com.yandex.passport.internal.ui.challenge.logout;

import android.os.Bundle;
import com.yandex.passport.internal.methods.b3;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;

/* loaded from: classes2.dex */
public final class c extends b3 {
    public final ProgressPropertiesImpl b;

    public c(LogoutActivity logoutActivity, Bundle bundle) {
        super(logoutActivity);
        PassportLogoutPropertiesImpl.Companion.getClass();
        PassportLogoutPropertiesImpl a = com.yandex.passport.internal.properties.l.a(bundle);
        a.getUid();
        this.b = a.getProgressProperties();
    }
}
