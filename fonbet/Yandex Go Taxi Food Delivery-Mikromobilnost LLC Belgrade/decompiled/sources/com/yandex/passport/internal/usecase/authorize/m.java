package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;

/* loaded from: classes2.dex */
public interface m {
    AnalyticsFromValue a();

    long b();

    Environment getEnvironment();
}
