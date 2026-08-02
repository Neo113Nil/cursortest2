package xsna;

import android.os.Build;
import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* loaded from: classes.dex */
public final class mj5 implements mp70<a22> {
    public static final mj5 a = new mj5();
    public static final f7r b = f7r.b("packageName");
    public static final f7r c = f7r.b("versionName");
    public static final f7r d = f7r.b("appBuildVersion");
    public static final f7r e = f7r.b("deviceManufacturer");
    public static final f7r f = f7r.b("currentProcessDetails");
    public static final f7r g = f7r.b("appProcessDetails");

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        a22 a22Var = (a22) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, a22Var.a);
        np70Var2.add(c, a22Var.b);
        np70Var2.add(d, a22Var.c);
        np70Var2.add(e, Build.MANUFACTURER);
        np70Var2.add(f, a22Var.d);
        np70Var2.add(g, a22Var.e);
    }
}
