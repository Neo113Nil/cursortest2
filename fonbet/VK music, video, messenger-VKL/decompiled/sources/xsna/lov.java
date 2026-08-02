package xsna;

import android.graphics.Rect;
import java.util.List;

/* compiled from: ISnowballsCoverHolder.kt */
/* loaded from: classes5.dex */
public interface lov {
    static void a(lov lovVar, d9f0 d9f0Var, gzs gzsVar, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iah0.a(25);
        }
        lovVar.b(d9f0Var, gzsVar, i, i2);
    }

    void b(d9f0 d9f0Var, gzs<? extends List<Rect>> gzsVar, int i, int i2);
}
