package com.yandex.passport.internal.ui.sloth.webauthn;

import com.yandex.passport.internal.report.reporters.j1;

/* loaded from: classes2.dex */
public interface c {
    com.yandex.passport.common.ui.progress.g getProgressProperties();

    com.yandex.passport.internal.ui.sloth.screen.e getSlothScreenComponentBuilder();

    r getViewModelFactory();

    com.yandex.passport.internal.sloth.webauthn.c getWebAuthN();

    j1 getWebAuthNReporter();

    boolean isWhiteLabel();
}
