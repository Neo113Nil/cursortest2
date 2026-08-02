package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.api.AccountListShowMode;
import com.yandex.passport.internal.properties.AccountListProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.VisualProperties;

/* loaded from: classes2.dex */
public final class h1 {
    public static x1 a(s1 s1Var, boolean z) {
        VisualProperties visualProperties;
        AccountListProperties accountListProperties;
        LoginProperties loginProperties = s1Var.c;
        return new x1(z, ((loginProperties == null || (visualProperties = loginProperties.getVisualProperties()) == null || (accountListProperties = visualProperties.getAccountListProperties()) == null) ? null : accountListProperties.getShowMode()) == AccountListShowMode.FULLSCREEN);
    }
}
