package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import xsna.i5s;

/* renamed from: io.appmetrica.analytics.impl.je, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4936je implements Co {
    public final String a;

    public C4936je(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable Collection<Object> collection) {
        return vo.a((Collection) collection) ? new Ao(this, false, i5s.a(new StringBuilder(), this.a, " is null or empty.")) : new Ao(this, true, "");
    }
}
