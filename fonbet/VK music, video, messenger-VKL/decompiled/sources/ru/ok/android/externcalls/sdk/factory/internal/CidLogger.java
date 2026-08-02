package ru.ok.android.externcalls.sdk.factory.internal;

import com.ironsource.X3;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;
import xsna.erm0;
import xsna.y57;

/* compiled from: CidLogger.kt */
/* loaded from: classes9.dex */
public final class CidLogger implements RTCLog {
    private final ConversationIdProvider cidProvider;
    private final RTCLog delegate;

    public CidLogger(ConversationIdProvider conversationIdProvider, RTCLog rTCLog) {
        this.cidProvider = conversationIdProvider;
        this.delegate = rTCLog;
    }

    private final String withCid(String str) {
        return y57.a(X3.j.d, erm0.D0(4, this.cidProvider.getConversationId()), "] ", str);
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void log(String str, String str2) {
        this.delegate.log(str, withCid(str2));
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void logException(String str, String str2, Throwable th) {
        this.delegate.logException(str, withCid(str2), th);
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void reportException(String str, String str2, Throwable th) {
        this.delegate.reportException(str, withCid(str2), th);
    }
}
