package ru.ok.android.externcalls.sdk.stat.connect;

import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;

/* compiled from: ConversationConnectedToSignalingStat.kt */
/* loaded from: classes9.dex */
public final class ConversationConnectedToSignalingStat extends SingleShotStat {
    private final long startTimeMs;
    private final TimeProvider timeProvider;

    public ConversationConnectedToSignalingStat(TimeProvider timeProvider, gzs<? extends CallEventualStatSender> gzsVar) {
        super(gzsVar);
        this.timeProvider = timeProvider;
        this.startTimeMs = timeProvider.getMsSinceBoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(CallEventualStatSender callEventualStatSender) {
        CallEventualStatSender.send$default(callEventualStatSender, CallEventualStatName.SIGNALING_CONNECTED, EventItemValueKt.toEventItemValue(this.timeProvider.getMsSinceBoot() - this.startTimeMs), null, 4, null);
    }

    public final void onConnectedToSignaling() {
        reportOnce(new ConversationConnectedToSignalingStat$onConnectedToSignaling$1(this));
    }
}
