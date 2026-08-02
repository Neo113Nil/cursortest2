package yads;

import android.content.Context;
import java.util.ArrayList;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class uv3 {
    public final ya2 a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();

    public uv3(Context context) {
        this.a = ya2.g.a(context);
    }

    public final void a(pe3 pe3Var) {
        synchronized (this.b) {
            this.c.add(pe3Var);
            this.a.b(pe3Var);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
