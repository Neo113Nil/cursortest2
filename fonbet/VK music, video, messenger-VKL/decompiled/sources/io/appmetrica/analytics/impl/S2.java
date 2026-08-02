package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class S2 implements Co {
    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(Object obj) {
        C5102po[] c5102poArr = ((C5179so) obj).a;
        return (c5102poArr == null || c5102poArr.length == 0) ? new Ao(this, false, "attributes list is empty") : new Ao(this, true, "");
    }
}
