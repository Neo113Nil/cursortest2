package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.Application;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;

@DoNotInline
@TargetApi(28)
/* loaded from: classes8.dex */
public final class Of implements Mf {
    @Override // io.appmetrica.analytics.impl.Mf
    public String a() {
        return Application.getProcessName();
    }
}
