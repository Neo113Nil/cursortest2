package com.yandex.passport.internal.ui.bouncer;

import android.app.Activity;
import com.yandex.passport.internal.report.reporters.v0;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public interface v {
    Activity getActivity();

    com.yandex.passport.internal.report.reporters.l getBadgesReporter();

    BouncerActivity getBouncerActivity();

    yvf0 getBouncerMasterChooserComponentBuilderProvider();

    yvf0 getBouncerSlothComposeComponentBuilderProvider();

    com.yandex.passport.common.coroutine.a getCoroutineDispatchers();

    com.yandex.passport.internal.report.reporters.s getCreateProfileReporter();

    com.yandex.passport.internal.flags.j getFlagRepository();

    com.yandex.passport.sloth.ui.r getNetworkObserver();

    com.yandex.passport.internal.properties.p getPassportProperties();

    com.yandex.passport.common.ui.progress.g getProgressProperties();

    com.yandex.passport.internal.report.reporters.n getReporter();

    v0 getSocialActionReporter();

    com.yandex.passport.common.ui.lang.b getUiLanguageProvider();

    t getWishSource();

    boolean isWhiteLabel();
}
