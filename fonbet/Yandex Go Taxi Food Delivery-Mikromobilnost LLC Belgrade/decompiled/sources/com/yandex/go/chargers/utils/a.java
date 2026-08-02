package com.yandex.go.chargers.utils;

import android.os.SystemClock;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.o430;
import defpackage.rol0;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public abstract class a {
    public static rol0 a(int i) {
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        return e.Y(com.yandex.go.coroutines.e.a(e3n.e(kp50.U(1, durationUnit))), new ChargersCountdownTimerFlow$start$1(SystemClock.elapsedRealtime() + e3n.e(kp50.U(i, durationUnit)), null));
    }
}
