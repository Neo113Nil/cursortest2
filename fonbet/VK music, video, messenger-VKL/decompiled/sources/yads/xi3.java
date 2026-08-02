package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class xi3 implements Choreographer.FrameCallback, Handler.Callback {
    public static final xi3 f = new xi3();
    public volatile long b = C.TIME_UNSET;
    public final Handler c;
    public Choreographer d;
    public int e;

    public xi3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler a = mc3.a(handlerThread.getLooper(), (Handler.Callback) this);
        this.c = a;
        a.sendEmptyMessage(0);
    }

    public static xi3 a() {
        return f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.b = j;
        Choreographer choreographer = this.d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                ji1.d("VideoFrameReleaseHelper", ji1.a("Vsync sampling disabled due to platform error", e));
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.d;
            if (choreographer != null) {
                int i2 = this.e + 1;
                this.e = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.d;
        if (choreographer2 != null) {
            int i3 = this.e - 1;
            this.e = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.b = C.TIME_UNSET;
            }
        }
        return true;
    }
}
