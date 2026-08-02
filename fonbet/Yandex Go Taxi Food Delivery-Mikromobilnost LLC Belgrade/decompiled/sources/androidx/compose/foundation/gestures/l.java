package androidx.compose.foundation.gestures;

import defpackage.eam;
import defpackage.f530;
import defpackage.k631;
import defpackage.ma91;
import defpackage.zls;
import defpackage.zx40;

/* loaded from: classes10.dex */
public abstract class l {
    public static final zls a = new DraggableKt$NoOpOnDragStarted$1(3, null);
    public static final zls b = new DraggableKt$NoOpOnDragStopped$1(3, null);

    public static f530 a(f530 f530Var, n nVar, Orientation orientation, boolean z, zx40 zx40Var, boolean z2, zls zlsVar, zls zlsVar2, boolean z3, int i) {
        if ((i & 8) != 0) {
            zx40Var = null;
        }
        return f530Var.k(new eam(nVar, orientation, z, zx40Var, z2, (i & 32) != 0 ? a : zlsVar, zlsVar2, (i & 128) != 0 ? false : z3));
    }

    public static final long b(long j) {
        return ma91.a(Float.isNaN(k631.c(j)) ? 0.0f : k631.c(j), Float.isNaN(k631.d(j)) ? 0.0f : k631.d(j));
    }
}
