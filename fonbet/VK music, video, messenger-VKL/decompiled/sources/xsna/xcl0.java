package xsna;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class xcl0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xcl0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                nov novVar = (nov) obj;
                if (!(novVar instanceof dh9) && !(novVar instanceof qx5)) {
                    arrayList.add(novVar);
                    break;
                }
                break;
            case 1:
                ((ArrayList) this.b).add((Map.Entry) obj);
                break;
            default:
                WebTransportSocket.configureSession$lambda$5((WebTransportSocket) this.b, (opy0) obj);
                break;
        }
    }
}
