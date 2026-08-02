package xsna;

import android.view.View;
import androidx.media3.exoplayer.video.g;
import com.vk.core.dynamic_loader.b;
import com.vk.log.L;
import com.vk.media.render.RenderBase;
import io.appmetrica.analytics.impl.C5171sg;
import io.appmetrica.analytics.impl.Cg;
import org.chromium.net.impl.CronetUploadDataStream;
import org.webrtc.IceCandidate;
import ru.ok.android.webrtc.PeerConnectionClient;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jx8 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jx8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ay8 ay8Var = (ay8) obj;
                try {
                    v7s0 v7s0Var = ((mx8) obj2).a;
                    r7s0[] r7s0VarArr = {ay8Var.e};
                    v7s0Var.getClass();
                    v7s0Var.e(r7s0VarArr[0]);
                    break;
                } catch (Exception e) {
                    L.i(e);
                    return;
                }
            case 1:
                ((irb) obj2).j = false;
                ((View) obj).animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                break;
            case 2:
                ((qij) obj2).h = false;
                ((gzs) obj).invoke();
                break;
            case 3:
                CronetUploadDataStream.lambda$postTaskToExecutor$0((String) obj2, (Runnable) obj);
                break;
            case 4:
                ((io.reactivex.rxjava3.subjects.d) obj2).onNext(new b.AbstractC0762b.d((int) ((Long) obj).longValue()));
                break;
            case 5:
                ((PeerConnectionClient) obj2).b((IceCandidate) obj);
                break;
            case 6:
                sk9 sk9Var = (sk9) obj2;
                if (((RenderBase.RenderingState) obj) == RenderBase.RenderingState.START) {
                    sk9Var.f();
                    break;
                }
                break;
            case 7:
                androidx.media3.exoplayer.video.g gVar = ((g.a) obj2).b;
                String str = y2r0.a;
                gVar.v((qzf) obj);
                break;
            case 8:
                C5171sg.b((Cg) obj2, (Throwable) obj);
                break;
            default:
                dkz0 dkz0Var = (dkz0) obj2;
                dkz0Var.f.h(dkz0Var.g);
                dkz0Var.g(null, xla.a(iaz0.o), (s3z0) obj);
                break;
        }
    }
}
