package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class dwd {
    public final ArrayList a = new ArrayList();

    public final void a(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ff11 ff11Var = (ff11) arrayList.get(size);
            Matrix matrix = zw21.a;
            if (ff11Var != null && !ff11Var.a) {
                zw21.a(path, ff11Var.d.m() / 100.0f, ff11Var.e.m() / 100.0f, ff11Var.f.m() / 360.0f);
            }
        }
    }
}
