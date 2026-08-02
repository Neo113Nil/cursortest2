package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.in, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4919in extends F4 {
    public final Vn g;

    public C4919in(@NonNull String str, @NonNull String str2, @NonNull Vn vn, @NonNull Co co, @NonNull V2 v2) {
        super(0, str, str2, co, v2);
        this.g = vn;
    }

    @Override // io.appmetrica.analytics.impl.F4
    public final void a(@NonNull C5102po c5102po) {
        String str = (String) this.g.a((String) this.f);
        c5102po.d.a = str == null ? new byte[0] : str.getBytes();
    }

    public final Vn h() {
        return this.g;
    }
}
