package androidx.compose.ui.layout;

import androidx.compose.ui.layout.o;

/* loaded from: classes10.dex */
public abstract class s {
    public static final float a(o.a aVar, boolean z, r[] rVarArr, float f) {
        float f2 = Float.NaN;
        for (r rVar : rVarArr) {
            float b = aVar.b(rVar);
            if (!Float.isNaN(f2)) {
                int i = z != (b > f2) ? i + 1 : 0;
            }
            f2 = b;
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
