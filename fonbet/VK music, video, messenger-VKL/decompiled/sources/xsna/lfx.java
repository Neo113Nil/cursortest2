package xsna;

import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: IntermediatePixelsProcessor.java */
/* loaded from: classes8.dex */
public final class lfx implements pqa0 {

    @NonNull
    public final ry70 a;
    public boolean b = false;

    public lfx(@NonNull ry70 ry70Var) {
        this.a = ry70Var;
    }

    public static void c(zpa0 zpa0Var, Exception exc) {
        Log.e("CtcPixels", "error processing pixel: " + zpa0Var.toString() + " error: " + exc);
    }

    @Override // xsna.pqa0
    public final void a(@NonNull zpa0 zpa0Var, long j) {
        for (String str : zpa0Var.a) {
            this.a.a(str, new jx0(this, str, zpa0Var), new vx6(this, zpa0Var));
        }
    }

    @Override // xsna.pqa0
    public final boolean b(@NonNull zpa0 zpa0Var) {
        return zpa0Var instanceof jfx;
    }

    @Override // xsna.pqa0
    public final void release() {
        this.b = true;
    }
}
