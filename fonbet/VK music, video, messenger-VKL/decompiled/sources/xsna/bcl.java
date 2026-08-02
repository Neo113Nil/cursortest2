package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import xsna.o2d0;

/* compiled from: Button.kt */
/* loaded from: classes11.dex */
public final class bcl {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public bcl(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final kq2 a(boolean z, sg50 sg50Var, androidx.compose.runtime.a aVar, int i) {
        if2 if2Var;
        aVar.K(-1588756907);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1588756907, i, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:500)");
        }
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = new SnapshotStateList();
            aVar.R(x);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) x;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && aVar.J(sg50Var)) || (i & 48) == 32;
        Object x2 = aVar.x();
        if (z3 || x2 == obj) {
            x2 = new zbl(sg50Var, snapshotStateList, null);
            aVar.R(x2);
        }
        bap.g(sg50Var, (wzs) x2, aVar, (i >> 3) & 14);
        vax vaxVar = (vax) j5g.k0(snapshotStateList);
        float f = !z ? this.c : vaxVar instanceof o2d0.b ? this.b : vaxVar instanceof lgv ? this.d : vaxVar instanceof pvr ? this.e : this.a;
        Object x3 = aVar.x();
        if (x3 == obj) {
            x3 = new if2(new pco(f), rte0.g, null, 12);
            aVar.R(x3);
        }
        if2 if2Var2 = (if2) x3;
        pco pcoVar = new pco(f);
        boolean y = aVar.y(if2Var2) | aVar.n(f) | ((((i & 14) ^ 6) > 4 && aVar.l(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !aVar.J(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean y2 = y | z2 | aVar.y(vaxVar);
        Object x4 = aVar.x();
        if (y2 || x4 == obj) {
            if2Var = if2Var2;
            Object aclVar = new acl(if2Var, f, z, this, vaxVar, null);
            aVar.R(aclVar);
            x4 = aclVar;
        } else {
            if2Var = if2Var2;
        }
        bap.g(pcoVar, (wzs) x4, aVar, 0);
        kq2<T, V> kq2Var = if2Var.c;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return kq2Var;
    }
}
