package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4745c3 implements Consumer {
    public final /* synthetic */ C4771d3 a;

    public C4745c3(C4771d3 c4771d3) {
        this.a = c4771d3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.a.b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.a.getClass();
        BatteryInfo a = C4771d3.a(intent);
        this.a.b = a;
        if (chargeType != a.chargeType) {
            this.a.a.execute(new C4719b3(this, a));
        }
    }
}
