package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4780dc extends Lambda implements izs {
    public static final C4780dc a = new C4780dc();

    public C4780dc() {
        super(1);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return s3q0.a;
    }
}
