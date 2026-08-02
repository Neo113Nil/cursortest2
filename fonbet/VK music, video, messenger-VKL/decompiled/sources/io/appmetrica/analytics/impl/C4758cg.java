package io.appmetrica.analytics.impl;

import xsna.gq;

/* renamed from: io.appmetrica.analytics.impl.cg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4758cg implements Co {
    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(Object obj) {
        Integer num = (Integer) obj;
        return (num == null || num.intValue() > 0) ? new Ao(this, true, "") : new Ao(this, false, gq.d(num, "Invalid quantity value "));
    }
}
