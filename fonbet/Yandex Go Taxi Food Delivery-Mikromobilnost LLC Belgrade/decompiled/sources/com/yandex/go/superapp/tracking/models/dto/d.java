package com.yandex.go.superapp.tracking.models.dto;

import defpackage.l301;
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
        return new ssp0("com.yandex.go.superapp.tracking.models.dto.TrackingCardButtonDto.Action", qoi0.a(l301.class), new lfx[]{qoi0.a(c.class), qoi0.a(TrackingCardButtonDto$Action$Deeplink.class)}, new KSerializer[]{new o4o("cancel", c.INSTANCE, new Annotation[]{new e()}), TrackingCardButtonDto$Action$Deeplink$$serializer.INSTANCE}, new Annotation[]{new e()});
    }
}
