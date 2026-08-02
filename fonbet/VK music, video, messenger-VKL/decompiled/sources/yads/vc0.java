package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class vc0 extends Handler {
    public boolean a;
    public final /* synthetic */ zc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(zc0 zc0Var, Looper looper) {
        super(looper);
        this.b = zc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Message message, im1 im1Var) {
        long j;
        wc0 wc0Var = (wc0) message.obj;
        if (!wc0Var.b) {
            return false;
        }
        int i = wc0Var.d + 1;
        wc0Var.d = i;
        if (i > this.b.j.a(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable yc0Var = im1Var.getCause() instanceof IOException ? (IOException) im1Var.getCause() : new yc0(im1Var.getCause());
        ae0 ae0Var = this.b.j;
        int i2 = wc0Var.d;
        ae0Var.getClass();
        if (!(yc0Var instanceof pc2) && !(yc0Var instanceof FileNotFoundException) && !(yc0Var instanceof r11) && !(yc0Var instanceof fh1)) {
            int i3 = q30.c;
            while (yc0Var != null) {
                if (!(yc0Var instanceof q30) || ((q30) yc0Var).b != 2008) {
                    yc0Var = yc0Var.getCause();
                }
            }
            j = Math.min((i2 - 1) * 1000, 5000);
            if (j != C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), j);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        j = -9223372036854775807L;
        if (j != C.TIME_UNSET) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable th;
        wc0 wc0Var = (wc0) message.obj;
        try {
            int i = message.what;
            if (i == 0) {
                th = this.b.l.a((on0) wc0Var.c);
            } else {
                if (i != 1) {
                    throw new RuntimeException();
                }
                zc0 zc0Var = this.b;
                th = zc0Var.l.a(zc0Var.m, (ln0) wc0Var.c);
            }
        } catch (im1 e) {
            boolean a = a(message, e);
            th = e;
            if (a) {
                return;
            }
        } catch (Exception e2) {
            ji1.d("DefaultDrmSession", ji1.a("Key/provisioning request produced an unexpected exception. Not retrying.", e2));
            th = e2;
        }
        ae0 ae0Var = this.b.j;
        long j = wc0Var.a;
        ae0Var.getClass();
        synchronized (this) {
            try {
                if (!this.a) {
                    this.b.n.obtainMessage(message.what, Pair.create(wc0Var.c, th)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
