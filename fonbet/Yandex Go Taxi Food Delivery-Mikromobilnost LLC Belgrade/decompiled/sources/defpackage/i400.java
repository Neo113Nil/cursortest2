package defpackage;

import android.opengl.GLSurfaceView;
import androidx.lifecycle.Lifecycle;
import com.google.ar.core.Session;

/* loaded from: classes2.dex */
public final class i400 implements i1k {
    public final /* synthetic */ GLSurfaceView a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ Lifecycle c;
    public final /* synthetic */ s33 d;

    public i400(GLSurfaceView gLSurfaceView, l1 l1Var, Lifecycle lifecycle, s33 s33Var) {
        this.a = gLSurfaceView;
        this.b = l1Var;
        this.c = lifecycle;
        this.d = s33Var;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        this.a.onPause();
        l1 l1Var = this.b;
        Session session = l1Var.w;
        if (session != null) {
            try {
                session.pause();
                session.close();
            } catch (Exception unused) {
            }
        }
        Lifecycle lifecycle = this.c;
        lifecycle.d(l1Var);
        lifecycle.d(this.d);
    }
}
