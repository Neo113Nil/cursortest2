package com.yandex.go.scooters.bdui.api;

import defpackage.lfx;
import defpackage.n0n0;
import defpackage.qoi0;
import defpackage.ssp0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class c {
    public static final /* synthetic */ c a = new c();

    public final KSerializer serializer() {
        return new ssp0("com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction.ScreenIdentifier", qoi0.a(n0n0.class), new lfx[]{qoi0.a(ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary.class), qoi0.a(ScootersBduiNavigationAction$ScreenIdentifier$DocumentPath.class)}, new KSerializer[]{ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary$$serializer.INSTANCE, ScootersBduiNavigationAction$ScreenIdentifier$DocumentPath$$serializer.INSTANCE}, new Annotation[0]);
    }
}
