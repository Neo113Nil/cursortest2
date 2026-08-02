package ru.ok.android.webrtc.stat.call.methods.battery;

import java.util.Map;
import kotlin.Pair;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryRetriever;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.pn00;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CallBatteryStatSenderImpl implements CallBatteryStatSender {
    public final CallAnalyticsSender a;
    public final CallBatteryRetriever b;
    public final TimeProvider c;
    public CallBatteryRetriever.BatteryInfo e;
    public CallBatteryRetriever.BatteryInfo f;
    public CallBatteryRetriever.BatteryInfo g;
    public EventItemsMap i;
    public boolean d = true;
    public final CallBatteryStatSenderImpl$batteryListener$1 h = new CallBatteryRetriever.Listener() { // from class: ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryStatSenderImpl$batteryListener$1
        @Override // ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryRetriever.Listener
        public void onInfoUpdated(CallBatteryRetriever.BatteryInfo batteryInfo) {
            CallBatteryRetriever.BatteryInfo batteryInfo2;
            CallBatteryRetriever.BatteryInfo batteryInfo3;
            CallBatteryRetriever.BatteryInfo batteryInfo4;
            if (batteryInfo.isCharging()) {
                CallBatteryStatSenderImpl.this.d = false;
            }
            batteryInfo2 = CallBatteryStatSenderImpl.this.e;
            if (batteryInfo2 == null) {
                CallBatteryStatSenderImpl.this.e = batteryInfo;
                return;
            }
            batteryInfo3 = CallBatteryStatSenderImpl.this.f;
            if (batteryInfo3 != null) {
                CallBatteryStatSenderImpl.this.g = batteryInfo;
                return;
            }
            batteryInfo4 = CallBatteryStatSenderImpl.this.e;
            if (batteryInfo4 == null || batteryInfo4.getLevel() != batteryInfo.getLevel()) {
                CallBatteryStatSenderImpl.this.f = batteryInfo;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryStatSenderImpl$batteryListener$1] */
    public CallBatteryStatSenderImpl(CallAnalyticsSender callAnalyticsSender, CallBatteryRetriever callBatteryRetriever, TimeProvider timeProvider) {
        this.a = callAnalyticsSender;
        this.b = callBatteryRetriever;
        this.c = timeProvider;
    }

    @Override // ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryStatSender
    public void onCallFinished() {
        long msSinceBoot;
        int i;
        Long serverTimeMs;
        this.b.stopListening();
        CallBatteryRetriever.BatteryInfo batteryInfo = this.e;
        if (batteryInfo != null && this.d) {
            CallBatteryRetriever.BatteryInfo batteryInfo2 = this.f;
            CallBatteryRetriever.BatteryInfo batteryInfo3 = this.g;
            if (batteryInfo2 == null || batteryInfo3 == null) {
                msSinceBoot = this.c.getMsSinceBoot() - batteryInfo.getTimestamp();
                i = 0;
            } else {
                i = batteryInfo3.getLevel() - batteryInfo2.getLevel();
                msSinceBoot = batteryInfo3.getTimestamp() - batteryInfo2.getTimestamp();
            }
            if (msSinceBoot == 0 || (serverTimeMs = this.c.getServerTimeMs()) == null) {
                return;
            }
            Map k = pn00.k(new Pair(CallStatMetric.BatteryLevelChange.getKey(), EventItemValueKt.toEventItemValue(Math.abs(i))), new Pair(StatCustomFieldKey.STAT_TIME_DELTA, EventItemValueKt.toEventItemValue(msSinceBoot)), new Pair("timestamp", EventItemValueKt.toEventItemValue(serverTimeMs.longValue())));
            EventItemsMap eventItemsMap = this.i;
            if (eventItemsMap == null) {
                return;
            }
            this.a.send(new SdkIntervalStatEvent.Builder().addAll(new EventItemsMap(pn00.n(eventItemsMap.getItems(), k))).build());
        }
    }

    @Override // ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryStatSender
    public void onCallStarted() {
        this.e = this.b.startListening(this.h);
    }

    public final void onRtcStats(EventItemsMap eventItemsMap) {
        this.i = eventItemsMap;
    }
}
