package xsna;

import com.vk.media.recorder.impl.Streamer;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import xsna.ppr0;
import xsna.ub9;
import xsna.wpr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class le9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ le9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((me9) this.c).b((ub9.a) this.d);
                return;
            case 1:
                ((SharedPeerConnectionFactory) this.c).a((SharedPeerConnectionFactory.AudioEventsListener) this.d);
                return;
            case 2:
                ((Streamer.b) this.c).e((nhf0) this.d);
                return;
            default:
                wpr0.c cVar = (wpr0.c) this.c;
                ppr0 ppr0Var = (ppr0) this.d;
                if (cVar instanceof wpr0.c.b) {
                    ppr0.a aVar = ppr0Var.h;
                    if (aVar != null) {
                        aVar.f(((wpr0.c.b) cVar).a);
                    }
                } else if (cVar instanceof wpr0.c.C3949c) {
                    ppr0.a aVar2 = ppr0Var.h;
                    if (aVar2 != null) {
                        aVar2.b(((wpr0.c.C3949c) cVar).a);
                    }
                } else {
                    if (!(cVar instanceof wpr0.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ppr0.a aVar3 = ppr0Var.h;
                    if (aVar3 != null) {
                        aVar3.g(((wpr0.c.a) cVar).a);
                    }
                }
                ppr0.a aVar4 = ppr0Var.h;
                if (aVar4 != null) {
                    aVar4.e();
                    return;
                }
                return;
        }
    }
}
