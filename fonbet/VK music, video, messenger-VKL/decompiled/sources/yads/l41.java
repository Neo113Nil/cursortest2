package yads;

import android.graphics.Bitmap;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class l41 {
    public Bitmap a;
    public final m41 b;
    public final String c;
    public final /* synthetic */ n41 d;

    public l41(n41 n41Var, Bitmap bitmap, String str, m41 m41Var) {
        this.d = n41Var;
        this.a = bitmap;
        this.c = str;
        this.b = m41Var;
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        if (this.b == null) {
            return;
        }
        j41 j41Var = (j41) this.d.c.get(this.c);
        if (j41Var != null) {
            j41Var.d.remove(this);
            if (j41Var.d.size() == 0) {
                j41Var.a.a();
                this.d.c.remove(this.c);
                return;
            }
            return;
        }
        j41 j41Var2 = (j41) this.d.d.get(this.c);
        if (j41Var2 != null) {
            j41Var2.d.remove(this);
            if (j41Var2.d.size() == 0) {
                j41Var2.a.a();
            }
            if (j41Var2.d.size() == 0) {
                this.d.d.remove(this.c);
            }
        }
    }
}
