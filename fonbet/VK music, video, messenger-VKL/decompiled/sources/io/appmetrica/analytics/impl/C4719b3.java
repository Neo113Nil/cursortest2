package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4719b3 extends SafeRunnable {
    public final /* synthetic */ BatteryInfo a;
    public final /* synthetic */ C4745c3 b;

    public C4719b3(C4745c3 c4745c3, BatteryInfo batteryInfo) {
        this.b = c4745c3;
        this.a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4771d3 c4771d3 = this.b.a;
        ChargeType chargeType = this.a.chargeType;
        ChargeType chargeType2 = C4771d3.d;
        synchronized (c4771d3) {
            Iterator it = c4771d3.c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
