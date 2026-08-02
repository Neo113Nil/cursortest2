package xsna;

import android.content.Context;
import android.os.BatteryManager;
import android.os.PowerManager;
import android.util.Log;
import com.vk.music.pref.CrossfadeOnboarding;
import kotlin.Result;
import xsna.tx40;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class ww40 implements gzs {
    public final /* synthetic */ int b = 1;
    public final Object c;
    public final Object d;

    public ww40(rw40 rw40Var, rw40 rw40Var2) {
        this.c = rw40Var;
        this.d = rw40Var2;
    }

    public uwc0 a() {
        PowerManager powerManager = (PowerManager) this.d;
        Boolean valueOf = powerManager != null ? Boolean.valueOf(powerManager.isPowerSaveMode()) : null;
        BatteryManager batteryManager = (BatteryManager) this.c;
        return new uwc0(valueOf, batteryManager != null ? Boolean.valueOf(batteryManager.isCharging()) : null);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                rw40 rw40Var = (rw40) this.d;
                rw40Var.u.b(new tx40.j(rw40Var.i.q() != CrossfadeOnboarding.None));
                return s3q0.a;
            default:
                return a();
        }
    }

    public ww40(Context context) {
        Object failure;
        Object failure2;
        try {
            failure = (BatteryManager) context.getApplicationContext().getSystemService(BatteryManager.class);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        Object obj = null;
        if (a != null) {
            Log.e("PowerConsumptionStatisticsProvider", "Failed to get Battery Service", a);
            failure = null;
        }
        BatteryManager batteryManager = (BatteryManager) failure;
        try {
            failure2 = (PowerManager) context.getApplicationContext().getSystemService(PowerManager.class);
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Throwable a2 = Result.a(failure2);
        if (a2 == null) {
            obj = failure2;
        } else {
            Log.e("PowerConsumptionStatisticsProvider", "Failed to get Power Service", a2);
        }
        this.c = batteryManager;
        this.d = (PowerManager) obj;
    }
}
