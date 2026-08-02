package xsna;

import android.graphics.Path;
import java.util.List;

/* compiled from: PathCalculator.kt */
/* loaded from: classes4.dex */
public interface eq90 {
    static /* synthetic */ void d(eq90 eq90Var, List list, Path path, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        eq90Var.e(list, path, z, true);
    }

    void e(List<glb0> list, Path path, boolean z, boolean z2);
}
