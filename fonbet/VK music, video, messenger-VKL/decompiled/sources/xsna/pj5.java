package xsna;

import java.io.IOException;
import ru.ok.tracer.SystemState;

/* compiled from: AutoSessionEventEncoder.java */
/* loaded from: classes.dex */
public final class pj5 implements mp70<ngd0> {
    public static final pj5 a = new pj5();
    public static final f7r b = f7r.b(SystemState.PROPERTY_KEY_PROCESS_NAME);
    public static final f7r c = f7r.b("pid");
    public static final f7r d = f7r.b("importance");
    public static final f7r e = f7r.b("defaultProcess");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        ngd0 ngd0Var = (ngd0) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, ngd0Var.a);
        np70Var2.add(c, ngd0Var.b);
        np70Var2.add(d, ngd0Var.c);
        np70Var2.add(e, ngd0Var.d);
    }
}
