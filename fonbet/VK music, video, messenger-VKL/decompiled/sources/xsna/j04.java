package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import java.util.Map;
import java.util.function.BiConsumer;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class j04 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j04(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                m04 m04Var = (m04) this.b;
                Map map = (Map) this.c;
                q94 q94Var = (q94) obj;
                jlb0 a = ((sb1) obj2).a(m04Var.s, m04Var.t, q94Var, true);
                if (m04Var.h == MemoryMode.REUSABLE_DATA) {
                    jlb0 jlb0Var = (jlb0) m04Var.l.a();
                    m04Var.f.d(a, jlb0Var);
                    a = jlb0Var;
                }
                map.put(q94Var, a);
                break;
            default:
                WebTransportSocket.configureSession$lambda$3((WebTransportSocket) this.b, (NALSocket.Listener) this.c, (Long) obj, (String) obj2);
                break;
        }
    }
}
