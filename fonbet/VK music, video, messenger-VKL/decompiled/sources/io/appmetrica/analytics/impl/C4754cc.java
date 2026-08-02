package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* renamed from: io.appmetrica.analytics.impl.cc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4754cc extends Lambda implements izs {
    public static final C4754cc a = new C4754cc();

    public C4754cc() {
        super(1);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return s3q0.a;
    }
}
