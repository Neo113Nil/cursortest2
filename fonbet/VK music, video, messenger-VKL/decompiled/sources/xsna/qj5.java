package xsna;

import java.io.IOException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: AutoSessionEventEncoder.java */
/* loaded from: classes.dex */
public final class qj5 implements mp70<kti0> {
    public static final qj5 a = new qj5();
    public static final f7r b = f7r.b(SignalingProtocol.KEY_EVENT_TYPE);
    public static final f7r c = f7r.b("sessionData");
    public static final f7r d = f7r.b("applicationInfo");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        kti0 kti0Var = (kti0) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, kti0Var.a);
        np70Var2.add(c, kti0Var.b);
        np70Var2.add(d, kti0Var.c);
    }
}
