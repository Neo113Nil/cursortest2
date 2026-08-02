package xsna;

import xsna.fma;
import xsna.ima;
import xsna.q630;

/* compiled from: VkCellButtonGroup.kt */
/* loaded from: classes17.dex */
public abstract class mma {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final ima.a aVar, final gzs<s3q0> gzsVar, q630 q630Var, hma hmaVar, kma kmaVar, fma.a aVar2, boolean z, androidx.compose.runtime.a aVar3, final int i, final int i2) {
        int i3;
        gzs<s3q0> gzsVar2;
        hma hmaVar2;
        int i4;
        kma kmaVar2;
        int i5;
        fma.a aVar4;
        int i6;
        mma mmaVar;
        final q630 q630Var2;
        final hma hmaVar3;
        androidx.compose.runtime.a aVar5;
        final kma kmaVar3;
        final fma.a aVar6;
        final boolean z2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar3.M(1485179099);
        if ((i & 6) == 0) {
            i3 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        int i7 = i3 | 384;
        int i8 = i2 & 8;
        if (i8 != 0) {
            i7 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            hmaVar2 = hmaVar;
            i7 |= M.J(hmaVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i7 |= 24576;
            } else if ((i & 24576) == 0) {
                kmaVar2 = kmaVar;
                i7 |= M.J(kmaVar2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i7 |= 196608;
                } else if ((196608 & i) == 0) {
                    aVar4 = aVar2;
                    i7 |= M.J(aVar4) ? 131072 : 65536;
                    i6 = i7 | 1572864;
                    if ((12582912 & i) != 0) {
                        mmaVar = this;
                        i6 |= M.J(mmaVar) ? 8388608 : 4194304;
                    } else {
                        mmaVar = this;
                    }
                    if (M.t(i6 & 1, (4793491 & i6) == 4793490)) {
                        M.h();
                        q630Var2 = q630Var;
                        hmaVar3 = hmaVar2;
                        aVar5 = M;
                        kmaVar3 = kmaVar2;
                        aVar6 = aVar4;
                        z2 = z;
                    } else {
                        if (i8 != 0) {
                            hmaVar2 = null;
                        }
                        kma kmaVar4 = i4 != 0 ? null : kmaVar2;
                        fma.a aVar7 = i5 != 0 ? null : aVar4;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1485179099, i6, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupScope.GroupItem (VkCellButtonGroup.kt:109)");
                        }
                        int i9 = i6 & 33554430;
                        hma hmaVar4 = hmaVar2;
                        mmaVar.b(aVar, gzsVar2, hmaVar4, kmaVar4, aVar7, M, i9);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var2 = q630.a.a;
                        aVar5 = M;
                        aVar6 = aVar7;
                        kmaVar3 = kmaVar4;
                        hmaVar3 = hmaVar4;
                        z2 = true;
                    }
                    s = aVar5.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.lma
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                mma.this.a(aVar, gzsVar, q630Var2, hmaVar3, kmaVar3, aVar6, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                aVar4 = aVar2;
                i6 = i7 | 1572864;
                if ((12582912 & i) != 0) {
                }
                if (M.t(i6 & 1, (4793491 & i6) == 4793490)) {
                }
                s = aVar5.s();
                if (s == null) {
                }
            }
            kmaVar2 = kmaVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            aVar4 = aVar2;
            i6 = i7 | 1572864;
            if ((12582912 & i) != 0) {
            }
            if (M.t(i6 & 1, (4793491 & i6) == 4793490)) {
            }
            s = aVar5.s();
            if (s == null) {
            }
        }
        hmaVar2 = hmaVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        kmaVar2 = kmaVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        aVar4 = aVar2;
        i6 = i7 | 1572864;
        if ((12582912 & i) != 0) {
        }
        if (M.t(i6 & 1, (4793491 & i6) == 4793490)) {
        }
        s = aVar5.s();
        if (s == null) {
        }
    }

    public abstract void b(ima.a aVar, gzs gzsVar, hma hmaVar, kma kmaVar, fma.a aVar2, androidx.compose.runtime.a aVar3, int i);
}
