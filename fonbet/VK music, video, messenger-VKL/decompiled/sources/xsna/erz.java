package xsna;

import androidx.annotation.NonNull;
import xsna.csz;
import xsna.lz3;

/* compiled from: Loader.java */
/* loaded from: classes12.dex */
public class erz<D> {
    public csz.a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a() {
        lz3 lz3Var = (lz3) this;
        if (lz3Var.g != null) {
            boolean z = lz3Var.b;
            if (!z) {
                if (z) {
                    lz3Var.a();
                    lz3Var.g = new lz3.a();
                    lz3Var.b();
                } else {
                    lz3Var.e = true;
                }
            }
            if (lz3Var.h != null) {
                lz3Var.g.getClass();
                lz3Var.g = null;
                return;
            }
            lz3Var.g.getClass();
            lz3<D>.a aVar = lz3Var.g;
            aVar.d.set(true);
            if (aVar.b.cancel(false)) {
                lz3Var.h = lz3Var.g;
            }
            lz3Var.g = null;
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
