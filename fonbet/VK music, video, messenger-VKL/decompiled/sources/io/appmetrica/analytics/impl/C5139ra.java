package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5139ra implements ProtobufConverter {
    public final AbstractC5296xe a;

    public C5139ra() {
        this(new C4764cm());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bm fromModel(@NonNull C5286x4 c5286x4) {
        Bm bm = new Bm();
        bm.b = c5286x4.b;
        bm.a = c5286x4.a;
        bm.c = c5286x4.c;
        bm.d = c5286x4.d;
        bm.e = c5286x4.e;
        bm.f = this.a.a(c5286x4.f);
        return bm;
    }

    public C5139ra(C4764cm c4764cm) {
        this.a = c4764cm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5286x4 toModel(@NonNull Bm bm) {
        C5236v4 c5236v4 = new C5236v4();
        c5236v4.d = bm.d;
        c5236v4.c = bm.c;
        c5236v4.b = bm.b;
        c5236v4.a = bm.a;
        c5236v4.e = bm.e;
        c5236v4.f = this.a.a(bm.f);
        return new C5286x4(c5236v4);
    }
}
