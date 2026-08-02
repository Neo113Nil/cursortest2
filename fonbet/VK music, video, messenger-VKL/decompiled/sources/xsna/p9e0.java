package xsna;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.irk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p9e0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p9e0(r9e0 r9e0Var, okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        this.c = r9e0Var;
        this.d = dVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Iterator<f360> it = ((r9e0) this.c).d.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                break;
            default:
                fsk0.k((fsk0) this.c, ((Boolean) obj).booleanValue(), ((irk0.a) this.d).j > ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, 4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p9e0(fsk0 fsk0Var, irk0.a aVar) {
        this.c = fsk0Var;
        this.d = aVar;
    }
}
