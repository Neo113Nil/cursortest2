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
final class YandexMediaCodecVideoRenderer$OnFrameRenderedListenerV23 implements ob10, Handler.Callback {
    private static final int HANDLE_FRAME_RENDERED = 0;
    private final Handler handler;
    final /* synthetic */ d this$0;

    public YandexMediaCodecVideoRenderer$OnFrameRenderedListenerV23(d dVar, pb10 pb10Var) {
        this.this$0 = dVar;
        Handler n = tw21.n(this);
        this.handler = n;
        pb10Var.A(this, n);
    }

    private void handleFrameRendered(long j) {
        Surface surface;
        d dVar = this.this$0;
        if (this != dVar.V3 || dVar.I == null) {
            return;
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            dVar.E0 = true;
            return;
        }
        try {
            a201 a201Var = dVar.R0;
            dVar.f0(j);
            do31 do31Var = dVar.B3;
            if (!do31Var.equals(do31.d) && !do31Var.equals(dVar.C3)) {
                dVar.C3 = do31Var;
                a201Var.w(do31Var);
            }
            dVar.F0.e++;
            if (dVar.p1.e() && (surface = dVar.X1) != null) {
                a201Var.q(surface);
                dVar.x2 = true;
            }
            dVar.L(j);
        } catch (ExoPlaybackException e) {
            this.this$0.T = e;
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
