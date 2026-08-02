package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4776d8 {
    public final Pc a;

    public AbstractC4776d8() {
        Pc pc = new Pc(0);
        pc.a(EnumC4801e8.b, 0);
        pc.a(EnumC4801e8.c, 1);
        pc.a(EnumC4801e8.d, 2);
        pc.a(EnumC4801e8.e, 3);
        this.a = pc;
    }

    public final Pc a() {
        return this.a;
    }

    public abstract boolean a(Object obj, Object obj2);
}
