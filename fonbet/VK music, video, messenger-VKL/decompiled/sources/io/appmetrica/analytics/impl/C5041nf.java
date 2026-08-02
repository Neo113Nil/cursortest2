package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.ms9;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5041nf implements InterfaceC4750c8 {

    @NonNull
    public final Af a;

    @NonNull
    public final List<C5015mf> b;

    public C5041nf(@NonNull Af af, @NonNull List<C5015mf> list) {
        this.a = af;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4750c8
    @NonNull
    public final List<C5015mf> a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4750c8
    @Nullable
    public final Object b() {
        return this.a;
    }

    @Nullable
    public final Af c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb.append(this.a);
        sb.append(", candidates=");
        return ms9.a('}', sb, this.b);
    }
}
