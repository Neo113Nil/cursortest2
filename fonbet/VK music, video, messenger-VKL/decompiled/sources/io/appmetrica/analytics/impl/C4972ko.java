package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4972ko extends AbstractC4733bh {
    public C4972ko(C4927j5 c4927j5) {
        super(c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        String j = this.a.c.j();
        String str = c4722b6.h;
        this.a.c.j(str).b();
        if (TextUtils.equals(j, str)) {
            return false;
        }
        this.a.a(Y3.o());
        return false;
    }
}
