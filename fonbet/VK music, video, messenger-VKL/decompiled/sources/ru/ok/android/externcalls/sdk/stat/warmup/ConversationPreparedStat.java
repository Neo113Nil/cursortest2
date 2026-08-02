package ru.ok.android.externcalls.sdk.stat.warmup;

import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;

/* compiled from: ConversationPreparedStat.kt */
/* loaded from: classes9.dex */
public final class ConversationPreparedStat extends SingleShotStat {
    private final long startTimeMs;
    private final TimeProvider timeProvider;

    public ConversationPreparedStat(TimeProvider timeProvider, gzs<? extends CallEventualStatSender> gzsVar) {
        super(gzsVar);
        this.timeProvider = timeProvider;
        this.startTimeMs = timeProvider.getMsSinceBoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(CallEventualStatSender callEventualStatSender) {
        CallEventualStatSender.send$default(callEventualStatSender, CallEventualStatName.WARMUP_COMPLETED, EventItemValueKt.toEventItemValue(this.timeProvider.getMsSinceBoot() - this.startTimeMs), null, 4, null);
    }

    public final void onConversationPrepared() {
        reportOnce(new ConversationPreparedStat$onConversationPrepared$1(this));
    }
}
