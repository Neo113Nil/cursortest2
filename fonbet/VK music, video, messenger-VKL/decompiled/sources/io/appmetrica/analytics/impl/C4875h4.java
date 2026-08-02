package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4875h4 extends Vc {
    public final C4834ff a;

    public C4875h4(@NonNull Context context) {
        this(new C4834ff(C5030n4.l().c(context).b(context)));
    }

    @Override // io.appmetrica.analytics.impl.Vc
    public final void a(int i) {
        this.a.c(i);
    }

    @Override // io.appmetrica.analytics.impl.Vc
    public final int b() {
        return (int) this.a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Vc
    public final SparseArray<Uc> c() {
        return new SparseArray<>();
    }

    public C4875h4(C4834ff c4834ff) {
        this.a = c4834ff;
    }
}
