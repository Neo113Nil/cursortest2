package xsna;

import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* loaded from: classes13.dex */
public final class gj5 implements mp70<rlg0> {
    public static final gj5 a = new gj5();
    public static final f7r b = f7r.b("rolloutId");
    public static final f7r c = f7r.b("parameterKey");
    public static final f7r d = f7r.b("parameterValue");
    public static final f7r e = f7r.b("variantId");
    public static final f7r f = f7r.b("templateVersion");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        rlg0 rlg0Var = (rlg0) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, rlg0Var.d());
        np70Var2.add(c, rlg0Var.b());
        np70Var2.add(d, rlg0Var.c());
        np70Var2.add(e, rlg0Var.f());
        np70Var2.add(f, rlg0Var.e());
    }
}
