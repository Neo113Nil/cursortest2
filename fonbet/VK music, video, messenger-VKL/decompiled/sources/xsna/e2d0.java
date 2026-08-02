package xsna;

import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;
import ru.ok.android.webrtc.RTCLog;

/* compiled from: PrepareBase.kt */
/* loaded from: classes8.dex */
public final class e2d0<T1, T2> implements io.reactivex.rxjava3.functions.b {
    public final /* synthetic */ y1d0<Object> b;

    public e2d0(y1d0<Object> y1d0Var) {
        this.b = y1d0Var;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public final void accept(Object obj, Object obj2) {
        Throwable th = (Throwable) obj2;
        y1d0<Object> y1d0Var = this.b;
        ConversationPreparedStat conversationPreparedStat = y1d0Var.c;
        RTCLog rTCLog = y1d0Var.f;
        conversationPreparedStat.onConversationPrepared();
        if (th != null) {
            rTCLog.logException("ConversationPrepare", "Conversation prepare failed", th);
        } else {
            rTCLog.log("ConversationPrepare", "Conversation prepared");
        }
    }
}
