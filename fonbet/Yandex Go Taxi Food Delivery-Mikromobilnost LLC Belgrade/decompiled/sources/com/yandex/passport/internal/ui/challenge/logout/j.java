package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;

/* loaded from: classes2.dex */
public interface j {
    k build();

    j setLogoutBehaviour(LogoutBehaviour logoutBehaviour);

    j setProgressProperties(com.yandex.passport.common.ui.progress.g gVar);

    j setTheme(AppTheme appTheme);

    j setUid(Uid uid);
}
