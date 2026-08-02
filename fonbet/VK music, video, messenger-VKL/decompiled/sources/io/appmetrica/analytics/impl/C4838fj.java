package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4838fj extends AbstractC4733bh {
    public C4838fj(@NonNull C4927j5 c4927j5) {
        super(c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        String str = c4722b6.h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.a.c.j(str).b();
        return false;
    }
}
