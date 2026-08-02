package com.yandex.passport.internal.ui.sloth.menu;

import android.os.Bundle;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.UserMenuProperties;
import com.yandex.passport.internal.properties.a0;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class f {
    public final UserMenuActivity a;
    public final UserMenuProperties b;
    public final ProgressPropertiesImpl c;

    public f(UserMenuActivity userMenuActivity) {
        this.a = userMenuActivity;
        Bundle extras = userMenuActivity.getIntent().getExtras();
        if (extras != null) {
            UserMenuProperties.Companion.getClass();
            UserMenuProperties a = a0.a(extras);
            if (a != null) {
                this.b = a;
                this.c = a.getProgressProperties();
                return;
            }
        }
        ny61.r("no userMenuProperties provided");
        throw null;
    }
}
