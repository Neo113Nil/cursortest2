package com.yandex.go.taxi.order.experiments;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class p extends xqt {
    public static final p e = new p();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, q.INSTANCE.serializer(), qoi0.a(q.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("fixed", TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed.Companion.serializer(), qoi0.a(TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed.class)), new f9("adaptive", m.INSTANCE.serializer(), qoi0.a(m.class)));
    }
}
