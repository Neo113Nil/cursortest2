package defpackage;

import android.os.ResultReceiver;
import io.appmetrica.analytics.impl.InterfaceC0309ej;
import io.appmetrica.analytics.impl.ResultReceiverC0338fj;
import io.appmetrica.analytics.impl.Wi;
import io.appmetrica.analytics.impl.Z3;

/* loaded from: classes9.dex */
public final /* synthetic */ class bc61 implements Wi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Wi
    public final void a(InterfaceC0309ej interfaceC0309ej) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Z3.a((Z3) obj, interfaceC0309ej);
                break;
            default:
                ResultReceiverC0338fj.a((ResultReceiver) obj, interfaceC0309ej.a());
                break;
        }
    }
}
