package xsna;

import com.vk.log.L;
import com.vk.pushes.PushComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class w870 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        L.e("[Push][Channels]: Force init channels by timeout");
        x870 x870Var = x870.a;
        x870.b(((PushComponent) x870.g.getValue()).sc().c, 4);
    }
}
