package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import defpackage.e530;
import defpackage.ixv;
import defpackage.iz40;
import defpackage.qje;
import defpackage.sls;
import defpackage.t300;
import defpackage.v7x0;
import defpackage.ytr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class FocusInvalidationManager$scheduleInvalidation$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        t300 t300Var;
        a aVar = (a) this.receiver;
        iz40 iz40Var = aVar.c;
        iz40 iz40Var2 = aVar.d;
        c cVar = aVar.a;
        d i = cVar.i();
        if (i == null) {
            Object[] objArr = iz40Var2.b;
            long[] jArr = iz40Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j & 255) < 128) {
                                ((ytr) objArr[(i2 << 3) + i4]).x0(FocusStateImpl.Inactive);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        } else if (i.isAttached()) {
            if (iz40Var.c(i)) {
                i.K0();
            }
            FocusStateImpl J0 = i.J0();
            if (!i.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 node = i.getNode();
            LayoutNode P = qje.P(i);
            int i5 = 0;
            while (P != null) {
                if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 5120) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 5120) != 0) {
                            if ((node.getKindSet$ui() & 1024) != 0) {
                                i5++;
                            }
                            if ((node instanceof ytr) && iz40Var2.c(node)) {
                                if (i5 <= 1) {
                                    ((ytr) node).x0(J0);
                                } else {
                                    ((ytr) node).x0(FocusStateImpl.ActiveParent);
                                }
                                iz40Var2.l(node);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                P = P.s();
                node = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
            }
            Object[] objArr2 = iz40Var2.b;
            long[] jArr2 = iz40Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j2 = jArr2[i6];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j2 & 255) < 128) {
                                ((ytr) objArr2[(i6 << 3) + i8]).x0(FocusStateImpl.Inactive);
                            }
                            j2 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length2) {
                        break;
                    }
                    i6++;
                }
            }
        }
        if (cVar.i() == null || cVar.c.J0() == FocusStateImpl.Inactive) {
            cVar.a.clearOwnerFocus();
        }
        iz40Var.b();
        iz40Var2.b();
        aVar.e = false;
        return zy11.a;
    }
}
