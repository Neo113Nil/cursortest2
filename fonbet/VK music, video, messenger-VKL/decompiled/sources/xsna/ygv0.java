package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.SexyCell$Align;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public final class ygv0 {
    public static final void a(final q630 q630Var, Cell$Left cell$Left, final RichCell$Middle richCell$Middle, com.vk.core.compose.component.cell.content.o oVar, gzs gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        Cell$Left cell$Left2;
        int i4;
        com.vk.core.compose.component.cell.content.o oVar2;
        int i5;
        gzs gzsVar2;
        int i6;
        final Cell$Left cell$Left3;
        final com.vk.core.compose.component.cell.content.o oVar3;
        final gzs gzsVar3;
        com.vk.core.compose.component.cell.content.j0 j0Var;
        com.vk.core.compose.component.cell.content.e0 e0Var;
        androidx.compose.runtime.a M = aVar.M(-731700575);
        if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = i | (M.J(q630Var2) ? 4 : 2);
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i4 = i3 | 48;
            cell$Left2 = cell$Left;
        } else {
            cell$Left2 = cell$Left;
            i4 = i3 | (M.J(cell$Left2) ? 32 : 16);
        }
        int i8 = i4 | (M.J(richCell$Middle) ? 256 : 128);
        int i9 = i2 & 8;
        if (i9 != 0) {
            i5 = i8 | 3072;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            i5 = i8 | (M.J(oVar2) ? 2048 : 1024);
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i6 = i5 | 24576;
            gzsVar2 = gzsVar;
        } else {
            gzsVar2 = gzsVar;
            i6 = i5 | (M.y(gzsVar2) ? 16384 : 8192);
        }
        int i11 = i6 | 196608;
        if (M.t(i11 & 1, (74899 & i11) != 74898)) {
            com.vk.core.compose.component.cell.content.j0 j0Var2 = null;
            Cell$Left cell$Left4 = i7 != 0 ? null : cell$Left2;
            final com.vk.core.compose.component.cell.content.o oVar4 = i9 != 0 ? null : oVar2;
            gzs gzsVar4 = i10 != 0 ? null : gzsVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-731700575, i11, -1, "com.vk.core.compose.component.cell.rich.VkRichCell (VkRichCell.kt:31)");
            }
            if (cell$Left4 == null) {
                M.K(-1132215732);
                M.j();
                j0Var = null;
            } else {
                M.K(1210402901);
                int i12 = (i11 >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1638500586, i12, -1, "com.vk.core.compose.component.cell.rich.toSexyCellSideSlot (VkRichCell.kt:46)");
                }
                com.vk.core.compose.component.cell.content.j0 t = wwf0.t(kai.c(-1680241548, new blp0(cell$Left4, 1), M), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                j0Var = t;
            }
            if (richCell$Middle == null) {
                M.K(-1132169170);
                M.j();
                e0Var = null;
            } else {
                M.K(1210404403);
                int i13 = (i11 >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(980091141, i13, -1, "com.vk.core.compose.component.cell.rich.toSexyCellMiddle (VkRichCell.kt:54)");
                }
                jai c = kai.c(-1468647365, new v85(richCell$Middle, 3), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-156301732, 54, -1, "com.vk.core.compose.component.cell.content.InternalMiddleRowSlot.Companion.invoke (InternalSlots.kt:29)");
                }
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new com.vk.core.compose.component.cell.content.e0(c);
                    M.R(x);
                }
                e0Var = (com.vk.core.compose.component.cell.content.e0) x;
                ((zak0) e0Var.b).setValue(c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            if (oVar4 == null) {
                M.K(-1132126452);
            } else {
                M.K(1210405781);
                int i14 = (i11 >> 9) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(557581347, i14, -1, "com.vk.core.compose.component.cell.rich.toSexyCellSideSlot (VkRichCell.kt:50)");
                }
                j0Var2 = wwf0.t(kai.c(755790297, new zzs() { // from class: xsna.wgv0
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i15;
                        spg0 spg0Var = (spg0) obj;
                        q630 q630Var3 = (q630) obj2;
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if ((intValue & 6) == 0) {
                            i15 = (aVar2.J(spg0Var) ? 4 : 2) | intValue;
                        } else {
                            i15 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i15 |= aVar2.J(q630Var3) ? 32 : 16;
                        }
                        if (aVar2.t(i15 & 1, (i15 & 147) != 146)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(755790297, i15, -1, "com.vk.core.compose.component.cell.rich.toSexyCellSideSlot.<anonymous> (VkRichCell.kt:50)");
                            }
                            com.vk.core.compose.component.cell.content.o.this.a(spg0Var, q630Var3, aVar2, i15 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            com.vk.core.compose.component.cell.content.j0 j0Var3 = j0Var2;
            com.vk.core.compose.component.cell.content.o oVar5 = oVar4;
            Cell$Left cell$Left5 = cell$Left4;
            mjv0.a(q630Var2, e0Var, j0Var, j0Var3, SexyCell$Size.Medium, SexyCell$Align.Top, false, gzsVar4, null, M, (i11 & 14) | 221184 | ((i11 << 9) & 29360128) | 100663296, 64);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            cell$Left3 = cell$Left5;
            oVar3 = oVar5;
            gzsVar3 = gzsVar4;
        } else {
            M.h();
            cell$Left3 = cell$Left2;
            oVar3 = oVar2;
            gzsVar3 = gzsVar2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xgv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ygv0.a(q630.this, cell$Left3, richCell$Middle, oVar3, gzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
