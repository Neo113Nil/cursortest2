package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class Ub {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Vb.a(configuration) : Collections.singletonList(Re.a(configuration.locale));
    }
}
