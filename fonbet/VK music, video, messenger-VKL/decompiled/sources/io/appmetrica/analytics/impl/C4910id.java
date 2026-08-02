package io.appmetrica.analytics.impl;

import xsna.v1v;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4910id extends P2 {
    public final String b;

    public C4910id(String str, El el) {
        super(el);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.P2
    public final String a(String str) {
        StringBuilder b = v1v.b(str, '-');
        b.append(this.b);
        return b.toString();
    }
}
