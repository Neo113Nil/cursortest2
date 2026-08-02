package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5238v6 implements Ra {
    public final InterfaceC5213u6 a;
    public final ICrashTransformer b;
    public final Y9 c;

    public AbstractC5238v6(InterfaceC5213u6 interfaceC5213u6, ICrashTransformer iCrashTransformer, Y9 y9) {
        this.a = interfaceC5213u6;
        this.b = iCrashTransformer;
        this.c = y9;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(@Nullable Throwable th, @NonNull V v) {
        if (this.a.a(th)) {
            ICrashTransformer iCrashTransformer = this.b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                C4714ao a = Cdo.a(th, v, null, (String) this.c.b.a(), (Boolean) this.c.c.a());
                C5141rc c5141rc = (C5141rc) ((Lh) this).d;
                c5141rc.a.a().a(c5141rc.b).a(a);
            }
        }
    }

    public final InterfaceC5213u6 b() {
        return this.a;
    }

    @Nullable
    public final ICrashTransformer a() {
        return this.b;
    }
}
