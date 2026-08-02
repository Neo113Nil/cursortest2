package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import xsna.j5g;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class n62 {
    public final uv3 a;
    public final l62 b;

    public /* synthetic */ n62(Context context, vv3 vv3Var) {
        this(vv3Var.a(context), new l62());
    }

    public final void a() {
        List O0;
        uv3 uv3Var = this.a;
        if (uv3Var != null) {
            synchronized (uv3Var.b) {
                O0 = j5g.O0(uv3Var.c);
                uv3Var.c.clear();
                s3q0 s3q0Var = s3q0.a;
            }
            Iterator it = O0.iterator();
            while (it.hasNext()) {
                uv3Var.a.a((pe3) it.next());
            }
        }
    }

    public n62(uv3 uv3Var, l62 l62Var) {
        this.a = uv3Var;
        this.b = l62Var;
    }
}
