package com.yandex.go.flex.common.descriptors.section.payments.loyalty;

import defpackage.lfx;
import defpackage.qoi0;
import defpackage.ssp0;
import defpackage.yvz;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class b {
    public static final /* synthetic */ b a = new b();

    public final KSerializer serializer() {
        return new ssp0("com.yandex.go.flex.common.descriptors.section.payments.loyalty.LoyaltyProgressViewProperties.ProgressArcColor", qoi0.a(yvz.class), new lfx[]{qoi0.a(LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient.class), qoi0.a(LoyaltyProgressViewProperties$ProgressArcColor$Solid.class)}, new KSerializer[]{LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer.INSTANCE, LoyaltyProgressViewProperties$ProgressArcColor$Solid$$serializer.INSTANCE}, new Annotation[0]);
    }
}
