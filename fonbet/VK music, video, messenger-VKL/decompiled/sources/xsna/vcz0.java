package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vcz0 {
    public final ArrayList a;
    public final b6z0 b;
    public int c = -1;

    public vcz0(e5z0 e5z0Var) {
        ArrayList arrayList = new ArrayList();
        for (z1z0 z1z0Var : e5z0Var.j("playheadTimerValue").c) {
            if (z1z0Var instanceof cfz0) {
                arrayList.add((cfz0) z1z0Var);
            }
        }
        this.a = arrayList;
        b6z0 b = b6z0.b(e5z0Var, new ArrayList());
        List list = b.c;
        list.addAll(e5z0Var.e);
        Collections.sort(list, new sui0(1));
        this.b = b;
    }
}
