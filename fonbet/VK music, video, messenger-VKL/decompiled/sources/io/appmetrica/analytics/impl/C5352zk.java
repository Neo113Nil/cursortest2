package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5352zk implements Uc {
    @Override // io.appmetrica.analytics.impl.Uc
    public final void a(Context context) {
        AbstractC4739bn abstractC4739bn = (AbstractC4739bn) Zm.a(C5203tm.class);
        ProtobufStateStorage<Object> a = abstractC4739bn.a(context, abstractC4739bn.b(context));
        C5203tm c5203tm = (C5203tm) a.read();
        C5177sm a2 = c5203tm.a(c5203tm.m);
        a2.o = 0L;
        a.save(new C5203tm(a2));
    }
}
