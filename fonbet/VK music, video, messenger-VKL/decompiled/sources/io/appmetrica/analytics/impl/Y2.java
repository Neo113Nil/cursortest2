package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes8.dex */
public abstract class Y2 implements Vn {
    public final int a;
    public final String b;

    @NonNull
    protected final PublicLogger c;

    public Y2(int i, String str, PublicLogger publicLogger) {
        this.a = i;
        this.b = str;
        this.c = publicLogger;
    }
}
