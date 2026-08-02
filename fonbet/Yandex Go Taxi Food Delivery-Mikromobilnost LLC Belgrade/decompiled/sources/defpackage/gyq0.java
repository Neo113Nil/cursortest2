package defpackage;

import androidx.camera.core.impl.DeferrableSurface;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class gyq0 {

    public static abstract class a {
    }

    public static g84 a(DeferrableSurface deferrableSurface) {
        g84 g84Var = new g84();
        if (deferrableSurface == null) {
            ny61.t("Null surface");
            return null;
        }
        g84Var.a = deferrableSurface;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            ny61.t("Null sharedSurfaces");
            return null;
        }
        g84Var.b = list;
        g84Var.c = null;
        g84Var.d = -1;
        g84Var.e = -1;
        g84Var.f = q8n.d;
        return g84Var;
    }

    public abstract q8n b();

    public abstract int c();

    public abstract String d();

    public abstract List e();

    public abstract DeferrableSurface f();

    public abstract int g();
}
