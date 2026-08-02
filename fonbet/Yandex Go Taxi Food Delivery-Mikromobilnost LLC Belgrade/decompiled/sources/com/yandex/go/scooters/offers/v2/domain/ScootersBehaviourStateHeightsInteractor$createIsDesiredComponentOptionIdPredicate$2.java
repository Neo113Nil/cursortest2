package com.yandex.go.scooters.offers.v2.domain;

import defpackage.qfh0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersBehaviourStateHeightsInteractor$createIsDesiredComponentOptionIdPredicate$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        ((b) this.receiver).getClass();
        return Boolean.valueOf(intValue == qfh0.scooters_component_option_insurance || intValue == qfh0.scooters_component_option_super_pass || intValue == qfh0.scooters_component_option_subscription || intValue == qfh0.scooters_component_option_active_packages);
    }
}
