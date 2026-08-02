package defpackage;

/* loaded from: classes9.dex */
public abstract class kq6 {
    public static final pi9 a = new pi9(-1, null, null, 0);
    public static final int b = bvf0.Y(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = bvf0.Y(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final jb20 d = new jb20("BUFFERED", 1);
    public static final jb20 e = new jb20("SHOULD_BUFFER", 1);
    public static final jb20 f = new jb20("S_RESUMING_BY_RCV", 1);
    public static final jb20 g = new jb20("RESUMING_BY_EB", 1);
    public static final jb20 h = new jb20("POISONED", 1);
    public static final jb20 i = new jb20("DONE_RCV", 1);
    public static final jb20 j = new jb20("INTERRUPTED_SEND", 1);
    public static final jb20 k = new jb20("INTERRUPTED_RCV", 1);
    public static final jb20 l = new jb20("CHANNEL_CLOSED", 1);
    public static final jb20 m = new jb20("SUSPEND", 1);
    public static final jb20 n = new jb20("SUSPEND_NO_WAITER", 1);
    public static final jb20 o = new jb20("FAILED", 1);
    public static final jb20 p = new jb20("NO_RECEIVE_RESULT", 1);
    public static final jb20 q = new jb20("CLOSE_HANDLER_CLOSED", 1);
    public static final jb20 r = new jb20("CLOSE_HANDLER_INVOKED", 1);
    public static final jb20 s = new jb20("NO_CLOSE_CAUSE", 1);

    public static final boolean a(i18 i18Var, Object obj, zls zlsVar) {
        jb20 m2 = i18Var.m(obj, zlsVar);
        if (m2 == null) {
            return false;
        }
        i18Var.j(m2);
        return true;
    }
}
