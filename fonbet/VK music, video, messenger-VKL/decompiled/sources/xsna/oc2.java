package xsna;

import java.util.List;

/* compiled from: AndroidShader.android.kt */
/* loaded from: classes11.dex */
public final class oc2 {
    public static final float[] a(List list, List list2) {
        if (list != null) {
            return j5g.L0(list);
        }
        return null;
    }

    public static final void b(List<l5g> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
