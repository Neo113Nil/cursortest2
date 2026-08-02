package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import defpackage.q5z;
import defpackage.yvf0;

/* loaded from: classes2.dex */
public final class c implements yvf0 {
    public final /* synthetic */ int a;
    public final com.yandex.passport.internal.ui.bouncer.v b;

    public /* synthetic */ c(com.yandex.passport.internal.ui.bouncer.v vVar, int i) {
        this.a = i;
        this.b = vVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        com.yandex.passport.internal.ui.bouncer.v vVar = this.b;
        switch (i) {
            case 0:
                Activity activity = vVar.getActivity();
                q5z.h(activity);
                return activity;
            case 1:
                com.yandex.passport.internal.report.reporters.l badgesReporter = vVar.getBadgesReporter();
                q5z.h(badgesReporter);
                return badgesReporter;
            case 2:
                BouncerActivity bouncerActivity = vVar.getBouncerActivity();
                q5z.h(bouncerActivity);
                return bouncerActivity;
            case 3:
                com.yandex.passport.common.coroutine.a coroutineDispatchers = vVar.getCoroutineDispatchers();
                q5z.h(coroutineDispatchers);
                return coroutineDispatchers;
            case 4:
                com.yandex.passport.internal.report.reporters.s createProfileReporter = vVar.getCreateProfileReporter();
                q5z.h(createProfileReporter);
                return createProfileReporter;
            case 5:
                com.yandex.passport.internal.flags.j flagRepository = vVar.getFlagRepository();
                q5z.h(flagRepository);
                return flagRepository;
            case 6:
                com.yandex.passport.internal.properties.p passportProperties = vVar.getPassportProperties();
                q5z.h(passportProperties);
                return passportProperties;
            case 7:
                com.yandex.passport.internal.report.reporters.n reporter = vVar.getReporter();
                q5z.h(reporter);
                return reporter;
            case 8:
                com.yandex.passport.common.ui.lang.b uiLanguageProvider = vVar.getUiLanguageProvider();
                q5z.h(uiLanguageProvider);
                return uiLanguageProvider;
            default:
                com.yandex.passport.internal.ui.bouncer.t wishSource = vVar.getWishSource();
                q5z.h(wishSource);
                return wishSource;
        }
    }
}
