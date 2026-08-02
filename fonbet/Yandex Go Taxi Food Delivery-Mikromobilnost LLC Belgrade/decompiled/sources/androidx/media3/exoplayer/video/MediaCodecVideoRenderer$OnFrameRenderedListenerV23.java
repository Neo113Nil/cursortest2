package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import defpackage.a201;
import defpackage.do31;
import defpackage.ob10;
import defpackage.pb10;
import defpackage.tw21;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
final class MediaCodecVideoRenderer$OnFrameRenderedListenerV23 implements ob10, Handler.Callback {
    private static final int HANDLE_FRAME_RENDERED = 0;
    private final Handler handler;
    final /* synthetic */ a this$0;

    public MediaCodecVideoRenderer$OnFrameRenderedListenerV23(a aVar, pb10 pb10Var) {
        this.this$0 = aVar;
        Handler n = tw21.n(this);
        this.handler = n;
        pb10Var.A(this, n);
    }

    private void handleFrameRendered(long j) {
        Surface surface;
        a aVar = this.this$0;
        if (this != aVar.X2 || aVar.N == null) {
            return;
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            aVar.A0 = true;
            return;
        }
        try {
            a201 a201Var = aVar.J0;
            aVar.e0(j);
            do31 do31Var = aVar.C2;
            if (!do31Var.equals(do31.d) && !do31Var.equals(aVar.H2)) {
                aVar.H2 = do31Var;
                a201Var.w(do31Var);
            }
            aVar.C0.e++;
            if (aVar.M0.e() && (surface = aVar.y1) != null) {
                a201Var.q(surface);
                aVar.H1 = true;
            }
            aVar.K(j);
        } catch (ExoPlaybackException e) {
            this.this$0.B0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        handleFrameRendered(tw21.k0(message.arg1, message.arg2));
        return true;
    }

    @Override // defpackage.ob10
    public void onFrameRendered(pb10 pb10Var, long j, long j2) {
        if (tw21.a >= 30) {
            handleFrameRendered(j);
        } else {
            this.handler.sendMessageAtFrontOfQueue(Message.obtain(this.handler, 0, (int) (j >> 32), (int) j));
        }
    }
}
