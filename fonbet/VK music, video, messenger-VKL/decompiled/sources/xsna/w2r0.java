package xsna;

import com.vk.geo.impl.model.BoundingBox;
import java.util.Iterator;
import java.util.List;

/* compiled from: Util.kt */
/* loaded from: classes2.dex */
public final class w2r0 {
    public static final BoundingBox a(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator it = list.iterator();
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        while (it.hasNext()) {
            lif0 d = ((ktx0) it.next()).d();
            if (d.f() < f3) {
                f3 = d.f();
            }
            if (d.k() < f4) {
                f4 = d.k();
            }
            if (d.g() > f) {
                f = d.g();
            }
            if (d.l() > f2) {
                f2 = d.l();
            }
        }
        return new BoundingBox(f3, f4, f, f2, null);
    }
}
