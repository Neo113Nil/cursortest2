package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.zg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C5348zg {
    public final Za a;
    public final InterfaceC5223ug b;
    public final Xa c;

    public C5348zg(Za za, InterfaceC5223ug interfaceC5223ug, Xa xa) {
        this.a = za;
        this.b = interfaceC5223ug;
        this.c = xa;
    }

    public final void a(@Nullable C5298xg c5298xg) {
        if (this.a.a(c5298xg)) {
            this.b.a(c5298xg);
            this.c.a();
        }
    }

    @NonNull
    public final InterfaceC5223ug b() {
        return this.b;
    }

    @NonNull
    public final Xa c() {
        return this.c;
    }

    @NonNull
    public final Za a() {
        return this.a;
    }
}
