package xsna;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes11.dex */
public final class tm8 {
    public static final qbb<Object> a = new qbb<>(-1, null, null, 0);
    public static final int b = m9u0.c(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = m9u0.c(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final con0 d = new con0("BUFFERED");
    public static final con0 e = new con0("SHOULD_BUFFER");
    public static final con0 f = new con0("S_RESUMING_BY_RCV");
    public static final con0 g = new con0("RESUMING_BY_EB");
    public static final con0 h = new con0("POISONED");
    public static final con0 i = new con0("DONE_RCV");
    public static final con0 j = new con0("INTERRUPTED_SEND");
    public static final con0 k = new con0("INTERRUPTED_RCV");
    public static final con0 l = new con0("CHANNEL_CLOSED");
    public static final con0 m = new con0("SUSPEND");
    public static final con0 n = new con0("SUSPEND_NO_WAITER");
    public static final con0 o = new con0(SignalingProtocol.HUNGUP_REASON_FAILED);
    public static final con0 p = new con0("NO_RECEIVE_RESULT");
    public static final con0 q = new con0("CLOSE_HANDLER_CLOSED");
    public static final con0 r = new con0("CLOSE_HANDLER_INVOKED");
    public static final con0 s = new con0("NO_CLOSE_CAUSE");

    public static final <T> boolean a(kq9<? super T> kq9Var, T t, yzs<? super Throwable, ? super T, ? super kotlin.coroutines.d, s3q0> yzsVar) {
        con0 K = kq9Var.K(t, yzsVar);
        if (K == null) {
            return false;
        }
        kq9Var.D(K);
        return true;
    }
}
