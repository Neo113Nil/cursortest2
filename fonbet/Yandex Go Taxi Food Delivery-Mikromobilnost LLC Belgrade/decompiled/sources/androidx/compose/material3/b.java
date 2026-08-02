package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.g8e;
import defpackage.g8w;
import defpackage.gtq0;
import defpackage.jxe0;
import defpackage.kj2;
import defpackage.ltu;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.s9m;
import defpackage.wls;
import defpackage.y7m;
import defpackage.zpn;
import defpackage.ztr;
import defpackage.zx40;

/* loaded from: classes10.dex */
public final class b {
    public final float a;
    public final float b;

    public b(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final m3u0 a(boolean z, zx40 zx40Var, fid fidVar, int i) {
        androidx.compose.animation.core.a aVar;
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1763481333);
        float f = 0.0f;
        o430 o430Var = did.a;
        if (zx40Var == null) {
            btsVar.e0(167726411);
            Object Q = btsVar.Q();
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.j(new y7m(0.0f));
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            btsVar.t(false);
            btsVar.t(false);
            return oz40Var;
        }
        btsVar.e0(138113847);
        btsVar.t(false);
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = new SnapshotStateList();
            btsVar.o0(Q2);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) Q2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && btsVar.k(zx40Var)) || (i & 48) == 32;
        Object Q3 = btsVar.Q();
        if (z3 || Q3 == o430Var) {
            Q3 = new CardElevation$animateElevation$1$1(zx40Var, snapshotStateList, null);
            btsVar.o0(Q3);
        }
        zpn.e(btsVar, (wls) Q3, zx40Var);
        g8w g8wVar = (g8w) kotlin.collections.a.b0(snapshotStateList);
        if (z && !(g8wVar instanceof jxe0)) {
            if (g8wVar instanceof ltu) {
                f = this.a;
            } else if (!(g8wVar instanceof ztr) && (g8wVar instanceof s9m)) {
                f = this.b;
            }
        }
        Object Q4 = btsVar.Q();
        if (Q4 == o430Var) {
            Q4 = new androidx.compose.animation.core.a(new y7m(f), gtq0.h, (Object) null, 12);
            btsVar.o0(Q4);
        }
        androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) Q4;
        y7m y7mVar = new y7m(f);
        boolean e = btsVar.e(aVar2) | btsVar.b(f) | ((((i & 14) ^ 6) > 4 && btsVar.a(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !btsVar.k(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean e2 = e | z2 | btsVar.e(g8wVar);
        Object Q5 = btsVar.Q();
        if (e2 || Q5 == o430Var) {
            aVar = aVar2;
            CardElevation$animateElevation$2$1 cardElevation$animateElevation$2$1 = new CardElevation$animateElevation$2$1(aVar, f, z, this, g8wVar, null);
            btsVar.o0(cardElevation$animateElevation$2$1);
            Q5 = cardElevation$animateElevation$2$1;
        } else {
            aVar = aVar2;
        }
        zpn.e(btsVar, (wls) Q5, y7mVar);
        kj2 kj2Var = aVar.d;
        btsVar.t(false);
        return kj2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return y7m.b(0.0f, 0.0f) && y7m.b(0.0f, 0.0f) && y7m.b(0.0f, 0.0f) && y7m.b(this.a, ((b) obj).a) && y7m.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + g8e.c(this.a, g8e.c(0.0f, g8e.c(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
