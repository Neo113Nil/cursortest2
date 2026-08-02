package com.yandex.go.location.provider;

import android.hardware.SensorManager;
import defpackage.qwc;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CompassProviderImpl$createOrientationAndMagneticFlow$1 extends AdaptedFunctionReference implements zls {
    public CompassProviderImpl$createOrientationAndMagneticFlow$1(qwc qwcVar) {
        super(3, qwcVar, qwc.class, "computeAngle", "computeAngle([F[F)F", 4);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qwc qwcVar = (qwc) this.receiver;
        SensorManager.getRotationMatrix(qwcVar.e, null, (float[]) obj, (float[]) obj2);
        SensorManager.getOrientation(qwcVar.e, qwcVar.f);
        return new Float((float) Math.toDegrees(r1[0]));
    }
}
