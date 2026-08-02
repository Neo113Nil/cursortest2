package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.VkHorizontalArrowDirection;
import com.vk.core.compose.component.VkHorizontalArrowSize;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkHorizontalArrow.kt */
/* loaded from: classes17.dex */
public final class ryu0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final gzs gzsVar, final q630 q630Var, final VkHorizontalArrowSize vkHorizontalArrowSize, final VkHorizontalArrowDirection vkHorizontalArrowDirection, boolean z, sg50 sg50Var, r5j0 r5j0Var, long j, float f, androidx.compose.runtime.a aVar, final int i) {
        final boolean z2;
        final sg50 sg50Var2;
        final r5j0 r5j0Var2;
        final long j2;
        androidx.compose.runtime.a aVar2;
        final float f2;
        r5j0 r5j0Var3;
        boolean z3;
        int i2;
        sg50 sg50Var3;
        float f3;
        long j3;
        int i3;
        int[] iArr;
        int i4;
        lg90 a;
        int i5;
        Pair pair;
        u890 u890Var;
        int i6;
        lg90 lg90Var;
        int i7;
        int i8;
        androidx.compose.runtime.a M = aVar.M(-315046027);
        int i9 = i | (M.o(vkHorizontalArrowSize == null ? -1 : vkHorizontalArrowSize.ordinal()) ? 256 : 128) | (M.o(vkHorizontalArrowDirection == null ? -1 : vkHorizontalArrowDirection.ordinal()) ? 2048 : 1024) | 844849152;
        if (M.t(i9 & 1, (306783379 & i9) != 306783378)) {
            M.V();
            int i10 = i & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i10 == 0 || M.i()) {
                Object x = M.x();
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var4 = (sg50) x;
                r5j0Var3 = vog0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j4 = ylu0Var.getBackground().r;
                z3 = true;
                i2 = i9 & (-264241153);
                sg50Var3 = sg50Var4;
                f3 = 3;
                j3 = j4;
            } else {
                M.h();
                z3 = z;
                sg50Var3 = sg50Var;
                r5j0Var3 = r5j0Var;
                f3 = f;
                i2 = i9 & (-264241153);
                j3 = j;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-315046027, i2, 6, "com.vk.core.compose.component.VkHorizontalArrow (VkHorizontalArrow.kt:67)");
            }
            int i11 = i2 >> 6;
            int i12 = i11 & 14;
            int i13 = i12 | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(664418759, i13, -1, "com.vk.core.compose.component.defaults.VkHorizontalArrowDefaults.iconSize (VkHorizontalArrowDefaults.kt:13)");
            }
            int[] iArr2 = pyu0.$EnumSwitchMapping$0;
            int i14 = iArr2[vkHorizontalArrowSize.ordinal()];
            if (i14 == 1) {
                i3 = 16;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 24;
            }
            float f4 = i3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i15 = (i11 & 112) | i12 | 384;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(647983419, i15, -1, "com.vk.core.compose.component.defaults.VkHorizontalArrowDefaults.iconPainter (VkHorizontalArrowDefaults.kt:22)");
            }
            int i16 = iArr2[vkHorizontalArrowSize.ordinal()];
            if (i16 == 1) {
                iArr = iArr2;
                M.K(-1803760418);
                int i17 = pyu0.$EnumSwitchMapping$1[vkHorizontalArrowDirection.ordinal()];
                if (i17 == 1) {
                    M.K(-58183512);
                    if (androidx.compose.runtime.b.d()) {
                        i4 = 0;
                        androidx.compose.runtime.b.f(1167190318, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronLeft16> (VkSdkIcons.kt:440)");
                    } else {
                        i4 = 0;
                    }
                    a = pg90.a(R.drawable.vk_icon_chevron_left_16, i4, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    if (i17 != 2) {
                        throw alb0.c(-58185820, M);
                    }
                    M.K(-58181180);
                    if (androidx.compose.runtime.b.d()) {
                        i5 = 0;
                        androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
                    } else {
                        i5 = 0;
                    }
                    a = pg90.a(R.drawable.vk_icon_chevron_16, i5, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                M.j();
            } else {
                if (i16 != 2) {
                    throw alb0.c(-58187373, M);
                }
                M.K(-1803551199);
                int i18 = pyu0.$EnumSwitchMapping$1[vkHorizontalArrowDirection.ordinal()];
                if (i18 == 1) {
                    iArr = iArr2;
                    M.K(-58176780);
                    if (androidx.compose.runtime.b.d()) {
                        i7 = 0;
                        androidx.compose.runtime.b.f(1900903966, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronLeftSmallOutline24> (VkSdkIcons.kt:464)");
                    } else {
                        i7 = 0;
                    }
                    a = pg90.a(R.drawable.vk_icon_chevron_left_small_outline_24, i7, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    if (i18 != 2) {
                        throw alb0.c(-58179071, M);
                    }
                    M.K(-58174059);
                    if (androidx.compose.runtime.b.d()) {
                        iArr = iArr2;
                        i8 = 0;
                        androidx.compose.runtime.b.f(363195196, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronRightSmallOutline24> (VkSdkIcons.kt:514)");
                    } else {
                        iArr = iArr2;
                        i8 = 0;
                    }
                    a = pg90.a(R.drawable.vk_icon_chevron_right_small_outline_24, i8, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1989807225, i15, -1, "com.vk.core.compose.component.defaults.VkHorizontalArrowDefaults.iconPadding (VkHorizontalArrowDefaults.kt:37)");
            }
            int i19 = iArr[vkHorizontalArrowSize.ordinal()];
            if (i19 == 1) {
                if (vkHorizontalArrowDirection == VkHorizontalArrowDirection.Left) {
                    float f5 = 8;
                    pair = new Pair(new pco(f5), new pco(f5));
                } else {
                    pair = new Pair(new pco(7), new pco(5));
                }
                float f6 = 6;
                u890Var = new u890(((pco) pair.d()).b, f6, ((pco) pair.g()).b, f6);
            } else {
                if (i19 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f7 = 8;
                u890Var = new u890(f7, f7, f7, f7);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1831842335, i13, -1, "com.vk.core.compose.component.defaults.VkHorizontalArrowDefaults.surfaceSize (VkHorizontalArrowDefaults.kt:50)");
            }
            int i20 = iArr[vkHorizontalArrowSize.ordinal()];
            if (i20 == 1) {
                i6 = 28;
            } else {
                if (i20 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i6 = 40;
            }
            float f8 = i6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wh50 e = sdi.e(sg50Var3, M, 6);
            if (androidx.compose.runtime.b.d()) {
                lg90Var = a;
                androidx.compose.runtime.b.f(1206586544, 6, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:63)");
            } else {
                lg90Var = a;
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ngv(sg50Var3, wh50Var, null);
                M.R(x3);
            }
            bap.g(sg50Var3, (wzs) x3, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f9 = 1.0f;
            float f10 = !z3 ? 0.5f : 1.0f;
            if (!z3) {
                f9 = 0.32f;
            } else if (!((Boolean) e.getValue()).booleanValue() && !((Boolean) wh50Var.getValue()).booleanValue()) {
                f9 = 0.64f;
            }
            long c = l5g.c(14, j3, f10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j5 = j3;
            long c2 = l5g.c(14, ylu0Var2.getIcon().l, f9);
            q630 q = txj0.q(q630Var, 44);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new eyp0(12);
                M.R(x4);
            }
            q630 b = egi0.b(q, false, (izs) x4);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, b);
            cri.h7.getClass();
            r5j0 r5j0Var4 = r5j0Var3;
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c3, dVar);
            q630.a aVar4 = q630.a.a;
            q630 q2 = txj0.q(aVar4, f8);
            ty6 ty6Var2 = dt1.a.f;
            ra8 ra8Var = ra8.a;
            q630 b2 = ra8Var.b(q2, ty6Var2);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new wqf0(13);
                M.R(x5);
            }
            u890 u890Var2 = u890Var;
            uov0.b((gzs) x5, b2, r5j0Var4, c, 0L, null, f3, sg50Var3, null, z3, null, ao8.c, M, 920322054, 48, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
            float f11 = f3;
            q630 b3 = ra8Var.b(txj0.q(aVar4, f8), ty6Var2);
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, b3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            vqv.a(lg90Var, null, txj0.q(s200.C(ra8Var.b(aVar4, ty6Var2), u890Var2), f4), c2, M, 56, 0);
            M.G();
            if (dt.c(ojc.b(rte0.d(ra8Var.b(txj0.q(aVar4, f8), ty6Var2), r5j0Var4), sg50Var3, null, z3, null, gzsVar, 24), M, 0)) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            r5j0Var2 = r5j0Var4;
            sg50Var2 = sg50Var3;
            f2 = f11;
            z2 = z3;
            j2 = j5;
        } else {
            M.h();
            z2 = z;
            sg50Var2 = sg50Var;
            r5j0Var2 = r5j0Var;
            j2 = j;
            aVar2 = M;
            f2 = f;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(q630Var, vkHorizontalArrowSize, vkHorizontalArrowDirection, z2, sg50Var2, r5j0Var2, j2, f2, i) { // from class: xsna.qyu0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ VkHorizontalArrowSize d;
                public final /* synthetic */ VkHorizontalArrowDirection e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ sg50 g;
                public final /* synthetic */ r5j0 h;
                public final /* synthetic */ long i;
                public final /* synthetic */ float j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(55);
                    ryu0.a(gzs.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
