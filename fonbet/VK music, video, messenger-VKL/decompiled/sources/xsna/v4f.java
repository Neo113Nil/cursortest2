package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.gxp0;
import xsna.u4f;

/* compiled from: ClipsStateBadgeController.kt */
/* loaded from: classes17.dex */
public final class v4f implements gxp0.a {
    public final /* synthetic */ u4f b;

    public v4f(u4f u4fVar) {
        this.b = u4fVar;
    }

    @Override // xsna.gxp0.a
    public final void X2(ixp0 ixp0Var) {
        u4f.c cVar;
        u4f.c a;
        u4f.c cVar2;
        u4f.c a2;
        boolean z = ixp0Var.f;
        u4f u4fVar = this.b;
        if (z) {
            int i = u4f.d.$EnumSwitchMapping$1[u4fVar.c.b.ordinal()];
            if (i == 1) {
                a2 = u4f.c.a(u4fVar.c, null, u4f.b.SHOW, false, 5);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = u4fVar.c;
            }
            u4fVar.a(a2);
            return;
        }
        u4f.c cVar3 = u4fVar.c;
        u4f.b bVar = cVar3.b;
        u4f.a aVar = cVar3.a;
        if (bVar == u4f.b.SHOW) {
            int i2 = u4f.d.$EnumSwitchMapping$1[bVar.ordinal()];
            if (i2 == 1) {
                cVar2 = u4fVar.c;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2 = u4f.c.a(u4fVar.c, u4f.a.HIDE, u4f.b.HIDE, false, 4);
            }
            u4fVar.a(cVar2);
            return;
        }
        if (ixp0Var.b) {
            int i3 = u4f.d.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i3 == 1) {
                a = u4f.c.a(u4fVar.c, u4f.a.SHOW, null, false, 6);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a = u4fVar.c;
            }
            u4fVar.a(a);
            return;
        }
        int i4 = u4f.d.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i4 == 1) {
            cVar = u4fVar.c;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = u4f.c.a(u4fVar.c, u4f.a.HIDE, null, false, 6);
        }
        u4fVar.a(cVar);
    }
}
