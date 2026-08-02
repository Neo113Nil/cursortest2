package xsna;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;
import xsna.o2z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class exy0 {
    public final wty0 a;
    public final fvy0 b;
    public final Object c;
    public final String d;
    public final e9i e;
    public WeakReference f;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void b();
    }

    public exy0(wty0 wty0Var, i620 i620Var, o2z0.b bVar) {
        this.a = wty0Var;
        this.c = bVar;
        if (wty0Var == null) {
            this.b = null;
            this.e = null;
            this.d = null;
            return;
        }
        List list = wty0Var.c;
        if (list == null || list.isEmpty()) {
            this.b = null;
        } else {
            this.b = new fvy0(wty0Var, i620Var == null ? new mnh0() : i620Var);
        }
        this.d = wty0Var.b;
        this.e = new e9i(this, 11);
    }

    public final void a(Context context) {
        fvy0 fvy0Var = this.b;
        if (fvy0Var != null) {
            if (fvy0Var.c()) {
                return;
            }
            fvy0Var.b(context);
        } else {
            String str = this.d;
            if (str != null) {
                de.L(str, null, null, null, context);
            }
        }
    }
}
