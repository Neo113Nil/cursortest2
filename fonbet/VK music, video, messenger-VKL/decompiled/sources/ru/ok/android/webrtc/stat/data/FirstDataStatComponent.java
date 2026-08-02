package ru.ok.android.webrtc.stat.data;

import java.util.Map;
import kotlin.Pair;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.FirstMediaCallType;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.on00;

/* loaded from: classes9.dex */
public abstract class FirstDataStatComponent implements FirstDataStat {
    public final TimeProvider a;
    public final CallEventualStatSender b;
    public final RTCLog c;
    public boolean d;
    public FirstMediaCallType e = FirstMediaCallType.NONE;
    public final String f = "firstDataStat";
    public Long g;

    public FirstDataStatComponent(TimeProvider timeProvider, CallEventualStatSender callEventualStatSender, RTCLog rTCLog) {
        this.a = timeProvider;
        this.b = callEventualStatSender;
        this.c = rTCLog;
    }

    public FirstMediaCallType getCallType() {
        return this.e;
    }

    public String getLogTag() {
        return this.f;
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public boolean isReported() {
        return this.d;
    }

    @Override // ru.ok.android.webrtc.stat.data.FirstDataStat
    public void onFirstData() {
        if (isReported()) {
            return;
        }
        Long l = this.g;
        if (l == null) {
            this.c.log(getLogTag(), "Data is received but accept event wasn't triggered");
            return;
        }
        this.b.send(CallEventualStatName.FIRST_MEDIA_RECEIVED, EventItemValueKt.toEventItemValue(this.a.getMsSinceBoot() - l.longValue()), new EventItemsMap((Map<String, ? extends EventItemValue>) on00.f(new Pair(StatCustomFieldKey.CALL_TYPE, EventItemValueKt.toEventItemValue(getCallType().getKey())))));
        setReported(true);
    }

    public void setCallType(FirstMediaCallType firstMediaCallType) {
        this.e = firstMediaCallType;
    }

    public void setReported(boolean z) {
        this.d = z;
    }

    public final void trackStart() {
        this.g = Long.valueOf(this.a.getMsSinceBoot());
    }
}
