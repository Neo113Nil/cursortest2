package xsna;

import java.util.Comparator;

/* compiled from: Rtree.kt */
/* loaded from: classes2.dex */
public final class nl20 implements Comparator<luu> {
    public static final nl20 c = new nl20(true);
    public static final nl20 d = new nl20(false);
    public final boolean b;

    public nl20(boolean z) {
        this.b = z;
    }

    public final float a(luu luuVar) {
        float k;
        float l;
        boolean z = luuVar instanceof elb0;
        boolean z2 = this.b;
        if (z) {
            elb0 elb0Var = (elb0) luuVar;
            return z2 ? elb0Var.h : elb0Var.i;
        }
        lif0 d2 = luuVar.n().d();
        if (z2) {
            k = d2.f();
            l = d2.g();
        } else {
            k = d2.k();
            l = d2.l();
        }
        return (l + k) / 2;
    }

    @Override // java.util.Comparator
    public final int compare(luu luuVar, luu luuVar2) {
        return Float.compare(a(luuVar), a(luuVar2));
    }
}
