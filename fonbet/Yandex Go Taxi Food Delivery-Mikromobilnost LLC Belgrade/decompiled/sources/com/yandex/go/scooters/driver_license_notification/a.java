package com.yandex.go.scooters.driver_license_notification;

import defpackage.bvf0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ ScootersDriverLicenseNotification a;

    public a(ScootersDriverLicenseNotification scootersDriverLicenseNotification) {
        this.a = scootersDriverLicenseNotification;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object n = bvf0.n(new ScootersDriverLicenseNotification$onAttachedToWindow$1$1(this.a, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
