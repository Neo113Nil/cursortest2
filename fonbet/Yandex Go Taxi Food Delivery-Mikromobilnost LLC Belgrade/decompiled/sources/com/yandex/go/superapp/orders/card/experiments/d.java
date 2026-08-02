package com.yandex.go.superapp.orders.card.experiments;

import defpackage.lfx;
import defpackage.o4o;
import defpackage.qoi0;
import defpackage.ssp0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class d {
    public static final /* synthetic */ d a = new d();

    public final KSerializer serializer() {
        return new ssp0("com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment.DeliveryTracking.ObjectWithPlateNumber", qoi0.a(g.class), new lfx[]{qoi0.a(e.class), qoi0.a(SuperappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber.class)}, new KSerializer[]{new o4o("filled_plate_number", e.INSTANCE, new Annotation[]{new j()}), SuperappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber$$serializer.INSTANCE}, new Annotation[]{new j()});
    }
}
