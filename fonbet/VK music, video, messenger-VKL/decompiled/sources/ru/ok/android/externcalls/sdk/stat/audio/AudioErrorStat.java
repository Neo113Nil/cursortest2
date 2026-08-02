package ru.ok.android.externcalls.sdk.stat.audio;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.audio.AudioErrorEvent;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: AudioErrorStat.kt */
/* loaded from: classes9.dex */
public final class AudioErrorStat {
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioErrorStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void report(AudioErrorEvent audioErrorEvent) {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            Integer code = audioErrorEvent.getCode();
            EventItemValue eventItemValue = code != null ? EventItemValueKt.toEventItemValue(code.intValue()) : null;
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set("string_value", audioErrorEvent.description());
            s3q0 s3q0Var = s3q0.a;
            invoke.send(CallEventualStatName.AUDIO_ERROR, eventItemValue, eventItemsMap);
        }
    }
}
