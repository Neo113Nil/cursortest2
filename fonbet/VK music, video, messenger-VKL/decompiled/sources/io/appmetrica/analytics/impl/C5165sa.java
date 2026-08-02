package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5165sa extends M4 {
    public C5165sa(J4 j4) {
        super(j4);
    }

    @Override // io.appmetrica.analytics.impl.M4
    public final boolean a(C4722b6 c4722b6, G4 g4) {
        Bundle bundle = c4722b6.m;
        C4933jb c4933jb = bundle != null ? (C4933jb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c4933jb != null) {
            if (c4933jb.d) {
                A4 a4 = g4.b.d.a;
                Boolean bool = a4.n;
                Boolean bool2 = a4.i;
                C5342za.I.c().c(bool != null ? bool.booleanValue() : true);
                C5342za.I.h().b(bool2);
            }
        }
        this.a.a(c4933jb);
        return false;
    }
}
