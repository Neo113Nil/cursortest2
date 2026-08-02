package xsna;

import android.content.Context;
import android.os.SystemClock;
import androidx.media3.common.VideoFrameProcessingException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.webrtc.PeerConnection;
import org.webrtc.VideoFileRenderer;
import ru.ok.android.webrtc.PeerConnectionClient;
import xsna.bkz0;
import xsna.mih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class sgr implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sgr(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yy5 yy5Var;
        switch (this.b) {
            case 0:
                ((zgr) this.c).j.a(VideoFrameProcessingException.a(C.TIME_UNSET, (InterruptedException) this.d));
                return;
            case 1:
                com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.g gVar = (com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.g) this.c;
                mih0.k kVar = (mih0.k) this.d;
                if (!epx.f(gVar.q, kVar) || (yy5Var = gVar.m) == null) {
                    return;
                }
                yy5Var.b(kVar);
                return;
            case 2:
                ((PeerConnectionClient) this.c).b((PeerConnection.IceConnectionState) this.d);
                return;
            case 3:
                ((VideoFileRenderer) this.c).lambda$release$2((CountDownLatch) this.d);
                return;
            case 4:
                yads.ul2.a((yads.ul2) this.c, (yads.j5) this.d);
                return;
            default:
                bkz0 bkz0Var = (bkz0) this.c;
                pp50 pp50Var = (pp50) this.d;
                bkz0Var.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                pp50Var.getClass();
                synchronized (bkz0Var) {
                    bkz0Var.a = new bkz0.a(SystemClock.uptimeMillis() - uptimeMillis, new HashMap());
                }
                return;
        }
    }

    public /* synthetic */ sgr(bkz0 bkz0Var, pp50 pp50Var, Context context) {
        this.b = 5;
        this.c = bkz0Var;
        this.d = pp50Var;
    }
}
