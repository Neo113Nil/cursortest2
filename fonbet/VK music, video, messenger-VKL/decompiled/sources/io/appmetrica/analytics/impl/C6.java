package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes8.dex */
public final class C6 {
    public static Mf a() {
        return AndroidUtils.isApiAchieved(28) ? new Of() : new Nf();
    }
}
