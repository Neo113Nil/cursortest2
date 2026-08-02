package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4818f implements InterfaceC5133r4 {
    public final Context a;
    public final Lg b;

    public AbstractC4818f(@NonNull Context context, @NonNull Lg lg) {
        this.a = context.getApplicationContext();
        this.b = lg;
        lg.a(this);
        C5342za.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5133r4
    public final void a(@NonNull C4722b6 c4722b6, @NonNull B4 b4) {
        b(c4722b6, b4);
    }

    @NonNull
    public final Lg b() {
        return this.b;
    }

    public abstract void b(@NonNull C4722b6 c4722b6, @NonNull B4 b4);

    @NonNull
    public final Context c() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5133r4
    public final void a() {
        this.b.b(this);
        C5342za.I.m().a(this);
    }
}
