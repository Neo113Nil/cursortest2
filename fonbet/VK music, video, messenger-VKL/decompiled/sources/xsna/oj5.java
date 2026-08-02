package xsna;

import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* loaded from: classes.dex */
public final class oj5 implements mp70<ztk> {
    public static final oj5 a = new oj5();
    public static final f7r b = f7r.b("performance");
    public static final f7r c = f7r.b("crashlytics");
    public static final f7r d = f7r.b("sessionSamplingRate");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        ztk ztkVar = (ztk) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, ztkVar.a);
        np70Var2.add(c, ztkVar.b);
        np70Var2.add(d, ztkVar.c);
    }
}
