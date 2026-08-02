package com.yandex.go.flex.common.descriptors.action;

import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction;
import com.yandex.go.flex.common.api.actions.p0;
import defpackage.eqh;
import defpackage.i2s0;
import defpackage.mu;
import defpackage.qoi0;
import defpackage.yvf0;
import defpackage.z8u0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class h {
    public final yvf0 a;

    public h(eqh eqhVar) {
        this.a = eqhVar;
    }

    public final mu a(i2s0 i2s0Var) {
        return new mu("TaxiExpectedDestinationAction", qoi0.a(TaxiExpectedDestinationAction.class), new TaxiExpectedDestinationActionDescriptorFactoryImpl$create$1(0, TaxiExpectedDestinationAction.Companion, p0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new z8u0(1, this, i2s0Var)), EmptyList.a, false);
    }
}
