package com.yandex.go.superapp.orders.card.experiments;

import defpackage.ahw0;
import defpackage.lfx;
import defpackage.o4o;
import defpackage.qoi0;
import defpackage.ssp0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class q {
    public static final /* synthetic */ q a = new q();

    public final KSerializer serializer() {
        return new ssp0("com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment.ObjectWithPlateNumber", qoi0.a(ahw0.class), new lfx[]{qoi0.a(r.class), qoi0.a(s.class)}, new KSerializer[]{new o4o("filled_plate_number", r.INSTANCE, new Annotation[]{new j()}), new o4o("outlined_plate_number", s.INSTANCE, new Annotation[]{new j()})}, new Annotation[]{new j()});
    }
}
