package yads;

import java.util.ArrayList;
import java.util.Arrays;
import xsna.j5g;

/* loaded from: classes10.dex */
public abstract class p4 {
    public static final void a(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        oc1.a(String.format("Found following errors for %s ad type: %s", Arrays.copyOf(new Object[]{str, j5g.g0(arrayList, "\n - ", "\n - ", null, 0, null, 60)}, 2)), new Object[0]);
    }

    public static final void a(String str) {
        oc1.b(String.format("Ad type %s was integrated successfully", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
    }
}
