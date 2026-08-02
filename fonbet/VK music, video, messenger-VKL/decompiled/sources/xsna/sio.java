package xsna;

import android.view.Choreographer;

/* compiled from: Utils.kt */
/* loaded from: classes12.dex */
public final class sio {
    public static long b;
    public static final sio a = new sio();
    public static final Choreographer c = Choreographer.getInstance();
    public static final a d = new a();

    /* compiled from: Utils.kt */
    public static final class a implements Choreographer.FrameCallback {
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            sio.c.postFrameCallback(this);
            sio.b = j;
        }
    }
}
