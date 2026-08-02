package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.g;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import androidx.camera.core.j;
import defpackage.glg0;
import defpackage.w8v;
import defpackage.xi21;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements glg0 {
    public static final HashSet a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar instanceof g) {
                    z = true;
                } else if (jVar instanceof w8v) {
                    z3 = true;
                } else if (jVar.h.d(xi21.t4)) {
                    z2 = jVar.h.y() == UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
