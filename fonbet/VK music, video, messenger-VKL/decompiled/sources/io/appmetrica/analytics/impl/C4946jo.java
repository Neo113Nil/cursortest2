package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4946jo extends M4 {
    public final Q6 b;

    public C4946jo(@NonNull J4 j4, @NonNull Q6 q6) {
        super(j4);
        this.b = q6;
    }

    @Override // io.appmetrica.analytics.impl.M4
    public final boolean a(@NonNull C4722b6 c4722b6, @NonNull G4 g4) {
        A4 a4 = g4.b.d.a;
        this.b.a(a4.i);
        Wb m = C5342za.I.m();
        if (Boolean.TRUE.equals(a4.b)) {
            m.a(true);
        } else {
            if (Boolean.FALSE.equals(a4.b)) {
                m.a(false);
            }
        }
        m.a(a4.c);
        Boolean bool = a4.n;
        C5342za.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
