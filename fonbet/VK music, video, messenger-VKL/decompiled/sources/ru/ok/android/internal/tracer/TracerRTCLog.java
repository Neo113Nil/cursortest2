package ru.ok.android.internal.tracer;

import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import kotlin.Pair;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;

/* compiled from: TracerRTCLog.kt */
/* loaded from: classes9.dex */
public final class TracerRTCLog implements RTCLog {
    private ConversationIdProvider cidProvider;
    private final RTCLog delegate;
    private final TracerLiteFacade tracer;

    public TracerRTCLog(TracerLiteFacade tracerLiteFacade, RTCLog rTCLog) {
        this.tracer = tracerLiteFacade;
        this.delegate = rTCLog;
    }

    public final ConversationIdProvider getCidProvider() {
        return this.cidProvider;
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void log(String str, String str2) {
        this.delegate.log(str, str2);
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void logException(String str, String str2, Throwable th) {
        this.delegate.logException(str, str2, th);
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void reportException(String str, String str2, Throwable th) {
        this.delegate.reportException(str, str2, th);
        TracerLiteFacade tracerLiteFacade = this.tracer;
        ConversationIdProvider conversationIdProvider = this.cidProvider;
        TracerLiteFacade.reportCrash$default(tracerLiteFacade, ThrowableDecoratorKt.withMetadata(th, (Pair<String, ? extends Object>[]) new Pair[]{new Pair(BidResponsedEx.KEY_CID, conversationIdProvider != null ? conversationIdProvider.getConversationId() : null)}), null, 2, null);
    }

    public final void setCidProvider(ConversationIdProvider conversationIdProvider) {
        this.cidProvider = conversationIdProvider;
    }
}
