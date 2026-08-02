package xsna;

import android.graphics.Path;
import java.util.List;

/* compiled from: SmoothPathCalculator.kt */
/* loaded from: classes4.dex */
public final class g6k0 implements eq90 {
    public static final g6k0 b = new g6k0();
    public static final Path c = new Path();

    @Override // xsna.eq90
    public final void e(List<glb0> list, Path path, boolean z, boolean z2) {
        Path path2 = c;
        path2.rewind();
        if (list.isEmpty()) {
            return;
        }
        glb0 glb0Var = (glb0) j5g.Y(list);
        if (list.size() < 2) {
            float f = glb0Var.a;
            float f2 = glb0Var.b;
            path2.moveTo(f, f2);
            path2.lineTo(glb0Var.a + 1.0f, f2);
            if (z2) {
                path.set(path2);
                return;
            } else {
                path.addPath(path2);
                return;
            }
        }
        path2.moveTo(glb0Var.a, glb0Var.b);
        int h = e43.h(list);
        int i = 1;
        if (1 <= h) {
            while (true) {
                int i2 = i - 1;
                glb0 glb0Var2 = list.get(i2);
                glb0 glb0Var3 = list.get(i);
                if (glb0Var2 != null) {
                    float f3 = glb0Var2.a;
                    float f4 = glb0Var2.b;
                    float f5 = glb0Var3.a;
                    float f6 = glb0Var3.b;
                    if (((float) Math.hypot(f5 - f3, f6 - f4)) < 2.0f) {
                        path2.lineTo(f5, f6);
                    } else {
                        path2.quadTo(f3, f4, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f);
                    }
                }
                if (i == e43.h(list)) {
                    glb0 glb0Var4 = list.get(i2);
                    glb0 glb0Var5 = list.get(i);
                    if (glb0Var4 != null) {
                        float f7 = glb0Var4.a;
                        float f8 = glb0Var4.b;
                        float f9 = glb0Var5.a;
                        float f10 = glb0Var5.b;
                        path2.quadTo((f7 + f9) / 2.0f, (f8 + f10) / 2.0f, f9, f10);
                    }
                }
                if (i == h) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z2) {
            path.set(path2);
        } else {
            path.addPath(path2);
        }
    }
}
