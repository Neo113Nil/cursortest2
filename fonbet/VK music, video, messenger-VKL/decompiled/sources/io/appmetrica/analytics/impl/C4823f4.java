package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.f4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4823f4 {
    public final Km a;
    public final U b;

    public C4823f4(Km km, U u) {
        this.a = km;
        this.b = u;
    }

    public final C4797e4 a(HashMap hashMap) {
        AdvertisingIdsHolder a;
        C5100pm e = this.a.e();
        U u = this.b;
        synchronized (u) {
            a = u.a(new C4911ie());
        }
        return new C4797e4(C4797e4.a(e.d), C4797e4.a(e.a), C4797e4.a(e.b), C4797e4.a(e.j), C4797e4.a(e.i), C4797e4.a(AbstractC5166sb.a(Pm.a(e.k))), C4797e4.a(AbstractC5166sb.a(hashMap)), new IdentifiersResult(a.getGoogle().mAdTrackingInfo == null ? null : a.getGoogle().mAdTrackingInfo.advId, a.getGoogle().mStatus, a.getGoogle().mErrorExplanation), new IdentifiersResult(a.getHuawei().mAdTrackingInfo == null ? null : a.getHuawei().mAdTrackingInfo.advId, a.getHuawei().mStatus, a.getHuawei().mErrorExplanation), new IdentifiersResult(a.getYandex().mAdTrackingInfo == null ? null : a.getYandex().mAdTrackingInfo.advId, a.getYandex().mStatus, a.getYandex().mErrorExplanation), C4797e4.a(AbstractC5166sb.a(e.h)), Sn.a(), e.o + e.z.a, C4797e4.a(e.n.f), new Bundle());
    }
}
