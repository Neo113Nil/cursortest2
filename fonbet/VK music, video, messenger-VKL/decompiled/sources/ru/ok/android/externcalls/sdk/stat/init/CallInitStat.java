package ru.ok.android.externcalls.sdk.stat.init;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.externcalls.sdk.stat.internal.StatExtensionsKt;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: CallInitStat.kt */
/* loaded from: classes9.dex */
public final class CallInitStat extends SingleShotStat {
    private final Conversation.CallType callType;
    private final boolean isAnon;

    public CallInitStat(Conversation.CallType callType, boolean z, gzs<? extends CallEventualStatSender> gzsVar) {
        super(gzsVar);
        this.callType = callType;
        this.isAnon = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(CallEventualStatSender callEventualStatSender) {
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue("");
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set("source", StatExtensionsKt.asString(this.callType, this.isAnon));
        s3q0 s3q0Var = s3q0.a;
        callEventualStatSender.send(CallEventualStatName.CALL_INIT, eventItemValue, eventItemsMap);
    }

    public final void onCallInitialized() {
        reportOnce(new CallInitStat$onCallInitialized$1(this));
    }
}
