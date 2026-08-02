package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5319yc extends AbstractC4818f {
    public C5319yc(Context context, Lg lg) {
        super(context, lg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4818f
    public final void b(@NonNull C4722b6 c4722b6, @NonNull B4 b4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(b4.b.b, Boolean.FALSE)).booleanValue();
        Wb m = C5342za.I.m();
        m.a(booleanValue);
        m.a(b4.b.c);
        Boolean bool = b4.b.n;
        if (bool != null) {
            C5342za.I.c().b(bool.booleanValue());
        }
        this.b.a(c4722b6, b4);
    }
}
