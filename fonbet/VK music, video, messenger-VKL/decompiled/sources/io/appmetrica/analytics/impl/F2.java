package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes8.dex */
public final class F2 extends BroadcastReceiver {
    public final BiConsumer a;
    public final ICommonExecutor b;

    public F2(Z2 z2, ICommonExecutor iCommonExecutor) {
        this.a = z2;
        this.b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b.execute(new E2(this, context, intent));
    }
}
