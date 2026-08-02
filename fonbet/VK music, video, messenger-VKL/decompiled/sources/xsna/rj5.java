package xsna;

import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* loaded from: classes.dex */
public final class rj5 implements mp70<wti0> {
    public static final rj5 a = new rj5();
    public static final f7r b = f7r.b("sessionId");
    public static final f7r c = f7r.b("firstSessionId");
    public static final f7r d = f7r.b("sessionIndex");
    public static final f7r e = f7r.b("eventTimestampUs");
    public static final f7r f = f7r.b("dataCollectionStatus");
    public static final f7r g = f7r.b("firebaseInstallationId");
    public static final f7r h = f7r.b("firebaseAuthenticationToken");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        wti0 wti0Var = (wti0) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, wti0Var.a);
        np70Var2.add(c, wti0Var.b);
        np70Var2.add(d, wti0Var.c);
        np70Var2.add(e, wti0Var.d);
        np70Var2.add(f, wti0Var.e);
        np70Var2.add(g, wti0Var.f);
        np70Var2.add(h, wti0Var.g);
    }
}
