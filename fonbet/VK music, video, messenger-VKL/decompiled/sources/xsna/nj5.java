package xsna;

import android.os.Build;
import java.io.IOException;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;

/* compiled from: AutoSessionEventEncoder.java */
/* loaded from: classes.dex */
public final class nj5 implements mp70<ad3> {
    public static final nj5 a = new nj5();
    public static final f7r b = f7r.b("appId");
    public static final f7r c = f7r.b("deviceModel");
    public static final f7r d = f7r.b("sessionSdkVersion");
    public static final f7r e = f7r.b(EndpointParameters.Name.OS_VERSION);
    public static final f7r f = f7r.b("logEnvironment");
    public static final f7r g = f7r.b("androidAppInfo");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        ad3 ad3Var = (ad3) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, ad3Var.a);
        np70Var2.add(c, Build.MODEL);
        np70Var2.add(d, "2.1.2");
        np70Var2.add(e, Build.VERSION.RELEASE);
        np70Var2.add(f, ad3Var.b);
        np70Var2.add(g, ad3Var.c);
    }
}
