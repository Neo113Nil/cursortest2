package ru.ok.android.webrtc.stat.call.methods.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryRetriever;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.bjn0;

/* loaded from: classes9.dex */
public final class CallBatteryRetriever {
    public final Context a;
    public final RTCLog b;
    public final TimeProvider c;
    public Listener d;
    public final CallBatteryRetriever$receiver$1 e = new BroadcastReceiver() { // from class: ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryRetriever$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CallBatteryRetriever.Listener listener;
            listener = CallBatteryRetriever.this.d;
            if (listener != null) {
                listener.onInfoUpdated(CallBatteryRetriever.access$parse(CallBatteryRetriever.this, intent));
            }
        }
    };

    public static final class BatteryInfo {
        public final boolean a;
        public final long b;
        public final int c;

        public BatteryInfo(boolean z, long j, int i) {
            this.a = z;
            this.b = j;
            this.c = i;
        }

        public final int getLevel() {
            return this.c;
        }

        public final long getTimestamp() {
            return this.b;
        }

        public final boolean isCharging() {
            return this.a;
        }
    }

    public interface Listener {
        void onInfoUpdated(BatteryInfo batteryInfo);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryRetriever$receiver$1] */
    public CallBatteryRetriever(Context context, RTCLog rTCLog, TimeProvider timeProvider) {
        this.a = context;
        this.b = rTCLog;
        this.c = timeProvider;
    }

    public static final BatteryInfo access$parse(CallBatteryRetriever callBatteryRetriever, Intent intent) {
        callBatteryRetriever.getClass();
        int intExtra = intent.getIntExtra("level", 0);
        long msSinceBoot = callBatteryRetriever.c.getMsSinceBoot();
        int intExtra2 = intent.getIntExtra("status", -1);
        return new BatteryInfo(intExtra2 == 2 || intExtra2 == 5, msSinceBoot, intExtra);
    }

    public final BatteryInfo startListening(Listener listener) {
        Intent intent;
        this.d = listener;
        try {
            intent = this.a.registerReceiver(this.e, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception e) {
            bjn0.b("Can't register BroadcastReceiver: ", e.getMessage(), this.b, "CallBatteryRetriever");
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra("level", 0);
        long msSinceBoot = this.c.getMsSinceBoot();
        int intExtra2 = intent.getIntExtra("status", -1);
        return new BatteryInfo(intExtra2 == 2 || intExtra2 == 5, msSinceBoot, intExtra);
    }

    public final void stopListening() {
        this.d = null;
        try {
            this.a.unregisterReceiver(this.e);
        } catch (Exception e) {
            bjn0.b("Can't unregister BroadcastReceiver: ", e.getMessage(), this.b, "CallBatteryRetriever");
        }
    }
}
