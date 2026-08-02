package xsna;

import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class miz0 implements w8y0 {
    public final zey0 a;
    public final phz0 b;
    public final boolean[] c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e;

    public miz0(zey0 zey0Var, ArrayList arrayList, phz0 phz0Var) {
        this.a = zey0Var;
        this.b = phz0Var;
        this.e = new ArrayList(arrayList);
        this.c = new boolean[arrayList.size()];
        zey0Var.setListener(this);
    }
}
