package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5232v0 implements Na {
    public final Handler a;
    public final IHandlerExecutor b;
    public final C5108q4 c;

    public C5232v0() {
        IHandlerExecutor a = C5030n4.l().g().a();
        this.b = a;
        this.a = a.getHandler();
        this.c = new C5108q4();
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(@Nullable AppMetricaConfig appMetricaConfig, @NonNull InterfaceC4830fb interfaceC4830fb) {
    }

    @Override // io.appmetrica.analytics.impl.Na
    @NonNull
    public final Handler b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.Na
    @NonNull
    public final C4795e2 c() {
        return new C4795e2();
    }

    @Override // io.appmetrica.analytics.impl.Na
    @NonNull
    public final C5268wb d() {
        return new C5268wb();
    }

    @Override // io.appmetrica.analytics.impl.Na
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.Na
    @NonNull
    public final C5108q4 a() {
        return this.c;
    }
}
