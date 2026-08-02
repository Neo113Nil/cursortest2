package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* loaded from: classes8.dex */
public final class Bd extends Lambda implements izs {
    public final /* synthetic */ C5140rb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(C5140rb c5140rb) {
        super(1);
        this.a = c5140rb;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        C4935jd c4935jd = (C4935jd) ((Map.Entry) obj).getValue();
        return c4935jd.b.parse(this.a);
    }
}
