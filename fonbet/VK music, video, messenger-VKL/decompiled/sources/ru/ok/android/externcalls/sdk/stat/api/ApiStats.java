package ru.ok.android.externcalls.sdk.stat.api;

import java.util.Map;
import kotlin.Pair;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.gzs;
import xsna.on00;

/* compiled from: ApiStats.kt */
/* loaded from: classes9.dex */
public final class ApiStats {
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiStats(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void reportExecutionTime(String str, long j) {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            invoke.send(CallEventualStatName.API_CALL, EventItemValueKt.toEventItemValue(j), new EventItemsMap((Map<String, ? extends EventItemValue>) on00.f(new Pair(StatCustomFieldKey.API_METHOD, EventItemValueKt.toEventItemValue(str)))));
        }
    }
}
