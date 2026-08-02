package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.IconButtonAppearance;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vk.core.compose.component.defaults.IconButtonSize;
import com.vk.core.compose.component.defaults.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.gzu0;
import xsna.q630;

/* compiled from: VkIconButton.kt */
/* loaded from: classes17.dex */
public final class nzu0 {

    /* compiled from: VkIconButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconButtonSize.values().length];
            try {
                iArr[IconButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconButtonRippleType.values().length];
            try {
                iArr2[IconButtonRippleType.Bounded.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconButtonRippleType.Unbounded.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gzs gzsVar, final lg90 lg90Var, final String str, final q630 q630Var, IconButtonAppearance iconButtonAppearance, IconButtonSize iconButtonSize, com.vk.core.compose.component.defaults.b bVar, final boolean z, boolean z2, IconButtonRippleType iconButtonRippleType, boolean z3, dt1 dt1Var, sg50 sg50Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final IconButtonAppearance iconButtonAppearance2;
        final boolean z4;
        final IconButtonRippleType iconButtonRippleType2;
        final boolean z5;
        final dt1 dt1Var2;
        final sg50 sg50Var2;
        final com.vk.core.compose.component.defaults.b bVar2;
        androidx.compose.runtime.a aVar2;
        final IconButtonSize iconButtonSize2;
        androidx.compose.runtime.f s;
        int i6;
        IconButtonAppearance iconButtonAppearance3;
        long j;
        int i7;
        long j2;
        int i8;
        androidx.compose.runtime.a aVar3;
        q630 l;
        com.vk.core.compose.component.defaults.b bVar3 = bVar;
        androidx.compose.runtime.a M = aVar.M(-783377623);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= M.o(iconButtonAppearance == null ? -1 : iconButtonAppearance.ordinal()) ? 16384 : 8192;
        }
        int i10 = i2 & 32;
        int i11 = 196608;
        if (i10 == 0) {
            if ((196608 & i) == 0) {
                i11 = M.o(iconButtonSize == null ? -1 : iconButtonSize.ordinal()) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            int i12 = 1572864;
            if (i4 == 0) {
                if ((i & 1572864) == 0) {
                    i12 = (i & 2097152) == 0 ? M.J(bVar3) : M.y(bVar3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if ((i & 12582912) == 0) {
                    i3 |= M.l(z) ? 8388608 : 4194304;
                }
                i5 = i3 | 905969664;
                if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
                    IconButtonAppearance iconButtonAppearance4 = i9 != 0 ? IconButtonAppearance.Accent : iconButtonAppearance;
                    IconButtonSize iconButtonSize3 = i10 != 0 ? IconButtonSize.Medium : iconButtonSize;
                    if (i4 != 0) {
                        bVar3 = b.d.a;
                    }
                    IconButtonRippleType iconButtonRippleType3 = IconButtonRippleType.Unbounded;
                    dt1.a aVar4 = dt1.a;
                    aVar4.getClass();
                    ty6 ty6Var = dt1.a.f;
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = ir.h(M);
                    }
                    sg50 sg50Var3 = (sg50) x;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-783377623, i5, 438, "com.vk.core.compose.component.VkIconButton (VkIconButton.kt:326)");
                    }
                    float f = gzu0.a;
                    int i13 = ((i5 >> 12) & 14) | 48;
                    if (androidx.compose.runtime.b.d()) {
                        i6 = i5;
                        androidx.compose.runtime.b.f(1605355114, i13, -1, "com.vk.core.compose.component.defaults.VkIconButtonDefault.iconColor (VkIconButtonDefault.kt:21)");
                    } else {
                        i6 = i5;
                    }
                    int i14 = gzu0.a.$EnumSwitchMapping$0[iconButtonAppearance4.ordinal()];
                    if (i14 == 1) {
                        iconButtonAppearance3 = iconButtonAppearance4;
                        M.K(853012244);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getIcon().a;
                        M.j();
                    } else if (i14 == 2) {
                        iconButtonAppearance3 = iconButtonAppearance4;
                        M.K(853014678);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getIcon().i;
                        M.j();
                    } else if (i14 == 3) {
                        iconButtonAppearance3 = iconButtonAppearance4;
                        M.K(853017174);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var3.getIcon().h;
                        M.j();
                    } else if (i14 == 4) {
                        iconButtonAppearance3 = iconButtonAppearance4;
                        M.K(853019637);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var4.getIcon().j;
                        M.j();
                    } else {
                        if (i14 != 5) {
                            throw alb0.c(853009804, M);
                        }
                        M.K(853022070);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        iconButtonAppearance3 = iconButtonAppearance4;
                        j = ylu0Var5.getIcon().c;
                        M.j();
                    }
                    wh50 f2 = bo.f(0, j, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i15 = ((i6 >> 21) & 14) | 48;
                    if (androidx.compose.runtime.b.d()) {
                        i7 = -1;
                        androidx.compose.runtime.b.f(245910654, i15, -1, "com.vk.core.compose.component.defaults.VkIconButtonDefault.backgroundColor (VkIconButtonDefault.kt:39)");
                    } else {
                        i7 = -1;
                    }
                    if (z) {
                        M.K(96942358);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, i7, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var6.getBackground().z;
                        M.j();
                    } else {
                        M.K(96944425);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var7 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var7.d().a;
                        M.j();
                    }
                    wh50 f3 = bo.f(0, j2, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    rv5 c = lv5.c(M);
                    aVar4.getClass();
                    ty6 ty6Var2 = dt1.a.b;
                    cp10 d = ja8.d(ty6Var2, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c2 = qri.c(M, q630Var);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    IconButtonSize iconButtonSize4 = iconButtonSize3;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(M, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar4 = cri.a.g;
                    k9q0.w(M, valueOf, bVar4);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c2, dVar);
                    com.vk.core.compose.component.defaults.b bVar5 = bVar3;
                    q630.a aVar6 = q630.a.a;
                    q630 b = lv5.b(aVar6, c, 0L, 6);
                    cp10 d2 = ja8.d(ty6Var2, false);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c3 = qri.c(M, b);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d2, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar4, M, c2678a);
                    k9q0.w(M, c3, dVar);
                    q630 d3 = vmx.d(aVar6, gzu0.b, ((l5g) f3.getValue()).a, null);
                    int i16 = gzu0.a.$EnumSwitchMapping$1[iconButtonSize4.ordinal()];
                    if (i16 == 1) {
                        i8 = 30;
                    } else if (i16 == 2) {
                        i8 = 36;
                    } else {
                        if (i16 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i8 = 44;
                    }
                    float f4 = i8;
                    int i17 = i6 >> 15;
                    d(gzsVar, byc0.b(f4, f4), d3, true, iconButtonRippleType3, true, ty6Var, sg50Var3, kai.c(1647052744, new kv7(lg90Var, str, f2, 8), M), M, (i6 & 14) | 100663296 | (i17 & 7168) | (i17 & 57344) | 14352384, 0);
                    M.G();
                    boolean z6 = bVar5 instanceof b.a;
                    ra8 ra8Var = ra8.a;
                    if (z6) {
                        M.K(300678723);
                        Object x2 = M.x();
                        if (x2 == c0012a) {
                            int i18 = a.$EnumSwitchMapping$0[iconButtonSize4.ordinal()];
                            if (i18 == 1) {
                                l = kci.l(aVar6, 1, -1);
                            } else if (i18 == 2) {
                                l = kci.l(aVar6, -1, 1);
                            } else {
                                if (i18 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l = kci.l(aVar6, -1, 1);
                            }
                            x2 = l;
                            M.R(x2);
                        }
                        rdu0.a(ra8Var.b((q630) x2, dt1.a.d), ((b.a) bVar5).a, M, 0, 0);
                        M.j();
                    } else if (bVar5 instanceof b.c) {
                        M.K(301286137);
                        q630 l2 = kci.l(ra8Var.b(aVar6, dt1.a.d), 6, -6);
                        b.c cVar2 = (b.c) bVar5;
                        nou0.a(cVar2.a, cVar2.b, cVar2.c, l2, cVar2.d, false, M, 0, 32);
                        M.j();
                    } else {
                        if (bVar5 instanceof b.C0741b) {
                            M.K(301671498);
                            q630 l3 = kci.l(ra8Var.b(aVar6, dt1.a.d), 6, -6);
                            b.C0741b c0741b = (b.C0741b) bVar5;
                            rnu0.c(c0741b.a, c0741b.b, c0741b.c, l3, c0741b.d, null, null, null, null, null, false, null, false, c, M, 134250496, 0, 6272);
                            aVar3 = M;
                            aVar3.j();
                        } else {
                            aVar3 = M;
                            aVar3.K(1533772199);
                            aVar3.j();
                        }
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        iconButtonRippleType2 = iconButtonRippleType3;
                        aVar2 = aVar3;
                        z5 = true;
                        bVar2 = bVar5;
                        sg50Var2 = sg50Var3;
                        iconButtonSize2 = iconButtonSize4;
                        dt1Var2 = ty6Var;
                        z4 = true;
                        iconButtonAppearance2 = iconButtonAppearance3;
                    }
                    aVar3 = M;
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    iconButtonRippleType2 = iconButtonRippleType3;
                    aVar2 = aVar3;
                    z5 = true;
                    bVar2 = bVar5;
                    sg50Var2 = sg50Var3;
                    iconButtonSize2 = iconButtonSize4;
                    dt1Var2 = ty6Var;
                    z4 = true;
                    iconButtonAppearance2 = iconButtonAppearance3;
                } else {
                    M.h();
                    iconButtonAppearance2 = iconButtonAppearance;
                    z4 = z2;
                    iconButtonRippleType2 = iconButtonRippleType;
                    z5 = z3;
                    dt1Var2 = dt1Var;
                    sg50Var2 = sg50Var;
                    bVar2 = bVar3;
                    aVar2 = M;
                    iconButtonSize2 = iconButtonSize;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.hzu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            nzu0.a(gzs.this, lg90Var, str, q630Var, iconButtonAppearance2, iconButtonSize2, bVar2, z, z4, iconButtonRippleType2, z5, dt1Var2, sg50Var2, (androidx.compose.runtime.a) obj, I, i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i3 |= i12;
            if ((i & 12582912) == 0) {
            }
            i5 = i3 | 905969664;
            if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        i3 |= i11;
        i4 = i2 & 64;
        int i122 = 1572864;
        if (i4 == 0) {
        }
        i3 |= i122;
        if ((i & 12582912) == 0) {
        }
        i5 = i3 | 905969664;
        if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final gzs<s3q0> gzsVar, final lg90 lg90Var, final long j, final String str, q630 q630Var, final long j2, boolean z, IconButtonRippleType iconButtonRippleType, boolean z2, dt1 dt1Var, sg50 sg50Var, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        long j3;
        q630 q630Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        androidx.compose.runtime.a aVar2;
        final boolean z3;
        final IconButtonRippleType iconButtonRippleType2;
        final boolean z4;
        final dt1 dt1Var2;
        final q630 q630Var3;
        final sg50 sg50Var2;
        androidx.compose.runtime.f s;
        int i14;
        q630 q630Var4;
        dt1 dt1Var3;
        sg50 sg50Var3;
        androidx.compose.runtime.a M = aVar.M(1694392846);
        if ((i & 6) == 0) {
            i4 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i4 |= M.p(j3) ? 256 : 128;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            i4 |= M.J(str) ? 2048 : 1024;
        }
        int i15 = i3 & 16;
        if (i15 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 16384 : 8192;
            if ((i & 196608) == 0) {
                i4 |= M.p(j2) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= M.o(iconButtonRippleType == null ? -1 : iconButtonRippleType.ordinal()) ? 8388608 : 4194304;
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i8 = i6;
                i4 |= M.l(z2) ? 67108864 : 33554432;
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i10 = i9;
                    i4 |= M.J(dt1Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                    } else {
                        if ((i2 & 6) != 0) {
                            i12 = i2;
                            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                                if (i15 != 0) {
                                    q630Var4 = q630.a.a;
                                    i14 = 100663296;
                                } else {
                                    i14 = 100663296;
                                    q630Var4 = q630Var2;
                                }
                                boolean z5 = i5 != 0 ? false : z;
                                IconButtonRippleType iconButtonRippleType3 = i8 != 0 ? IconButtonRippleType.Unbounded : iconButtonRippleType;
                                int i16 = i10;
                                boolean z6 = i7 != 0 ? true : z2;
                                if (i16 != 0) {
                                    dt1.a.getClass();
                                    dt1Var3 = dt1.a.f;
                                } else {
                                    dt1Var3 = dt1Var;
                                }
                                if (i11 != 0) {
                                    Object x = M.x();
                                    if (x == a.C0011a.a) {
                                        x = ir.h(M);
                                    }
                                    sg50Var3 = (sg50) x;
                                } else {
                                    sg50Var3 = sg50Var;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1694392846, i4, i12, "com.vk.core.compose.component.VkIconButton (VkIconButton.kt:101)");
                                }
                                int i17 = i14 | (i4 & 14) | ((i4 >> 3) & 112) | ((i4 >> 6) & 896);
                                int i18 = i4 >> 9;
                                aVar2 = M;
                                d(gzsVar, j3, q630Var4, z5, iconButtonRippleType3, z6, dt1Var3, sg50Var3, kai.c(1427194051, new wzs() { // from class: xsna.izu0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1427194051, intValue, -1, "com.vk.core.compose.component.VkIconButton.<anonymous> (VkIconButton.kt:112)");
                                            }
                                            vqv.a(lg90Var, str, q630.a.a, j2, aVar3, 392, 0);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar3.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, M), aVar2, i17 | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | ((i12 << 21) & 29360128), 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630Var3 = q630Var4;
                                z3 = z5;
                                iconButtonRippleType2 = iconButtonRippleType3;
                                z4 = z6;
                                dt1Var2 = dt1Var3;
                                sg50Var2 = sg50Var3;
                            } else {
                                aVar2 = M;
                                aVar2.h();
                                z3 = z;
                                iconButtonRippleType2 = iconButtonRippleType;
                                z4 = z2;
                                dt1Var2 = dt1Var;
                                q630Var3 = q630Var2;
                                sg50Var2 = sg50Var;
                            }
                            s = aVar2.s();
                            if (s != null) {
                                s.d = new wzs() { // from class: xsna.jzu0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int I = ne7.I(i | 1);
                                        int I2 = ne7.I(i2);
                                        nzu0.b(gzs.this, lg90Var, j, str, q630Var3, j2, z3, iconButtonRippleType2, z4, dt1Var2, sg50Var2, (androidx.compose.runtime.a) obj, I, I2, i3);
                                        return s3q0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i13 = i2 | (M.J(sg50Var) ? 4 : 2);
                    }
                    i12 = i13;
                    if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i12 = i13;
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i12 & 3) != 2)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            i8 = i6;
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i12 = i13;
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i12 & 3) != 2)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 196608) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i6;
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i12 = i13;
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i12 & 3) != 2)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final gzs gzsVar, final lg90 lg90Var, final String str, q630 q630Var, float f, long j, boolean z, IconButtonRippleType iconButtonRippleType, boolean z2, dt1 dt1Var, sg50 sg50Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        gzs gzsVar2;
        int i3;
        q630 q630Var2;
        int i4;
        float f2;
        int i5;
        long j2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final IconButtonRippleType iconButtonRippleType2;
        final dt1 dt1Var2;
        final sg50 sg50Var2;
        final q630 q630Var3;
        final float f3;
        final long j3;
        final boolean z4;
        final boolean z5;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(355907361);
        if ((i & 6) == 0) {
            gzsVar2 = gzsVar;
            i3 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            gzsVar2 = gzsVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(str) ? 256 : 128;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= M.n(f2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    j2 = j;
                } else {
                    j2 = j;
                    if ((196608 & i) == 0) {
                        i3 |= M.p(j2) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    z3 = z;
                } else {
                    z3 = z;
                    if ((i & 1572864) == 0) {
                        i3 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i8 = i7;
                    i3 |= M.o(iconButtonRippleType == null ? -1 : iconButtonRippleType.ordinal()) ? 8388608 : 4194304;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i3 |= M.l(z2) ? 67108864 : 33554432;
                        i11 = i2 & 512;
                        if (i11 != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i12 = i11;
                            i3 |= M.J(dt1Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                            if (M.t(i3 & 1, (i3 & 306783379) == 306783378)) {
                                M.h();
                                iconButtonRippleType2 = iconButtonRippleType;
                                dt1Var2 = dt1Var;
                                sg50Var2 = sg50Var;
                                q630Var3 = q630Var2;
                                f3 = f2;
                                j3 = j2;
                                z4 = z2;
                                z5 = z3;
                            } else {
                                if (i13 != 0) {
                                    q630Var2 = q630.a.a;
                                }
                                float f4 = i4 != 0 ? gzu0.a : f2;
                                j3 = i5 != 0 ? l5g.k : j2;
                                q630 q630Var4 = q630Var2;
                                z5 = i6 != 0 ? false : z3;
                                iconButtonRippleType2 = i8 != 0 ? IconButtonRippleType.Unbounded : iconButtonRippleType;
                                z4 = i10 != 0 ? true : z2;
                                if (i12 != 0) {
                                    dt1.a.getClass();
                                    dt1Var2 = dt1.a.f;
                                } else {
                                    dt1Var2 = dt1Var;
                                }
                                Object x = M.x();
                                if (x == a.C0011a.a) {
                                    x = ir.h(M);
                                }
                                sg50Var2 = (sg50) x;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(355907361, i3, 6, "com.vk.core.compose.component.VkIconButton (VkIconButton.kt:66)");
                                }
                                int i14 = i3 << 3;
                                float f5 = f4;
                                b(gzsVar2, lg90Var, byc0.b(f4, f4), str, q630Var4, j3, z5, iconButtonRippleType2, z4, dt1Var2, sg50Var2, M, (i14 & 7168) | (i3 & 14) | 64 | (i3 & 112) | (57344 & i14) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), 6, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630Var3 = q630Var4;
                                f3 = f5;
                            }
                            s = M.s();
                            if (s == null) {
                                s.d = new wzs() { // from class: xsna.kzu0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int I = ne7.I(i | 1);
                                        nzu0.c(gzs.this, lg90Var, str, q630Var3, f3, j3, z5, iconButtonRippleType2, z4, dt1Var2, sg50Var2, (androidx.compose.runtime.a) obj, I, i2);
                                        return s3q0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i12 = i11;
                        if (M.t(i3 & 1, (i3 & 306783379) == 306783378)) {
                        }
                        s = M.s();
                        if (s == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i2 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if (M.t(i3 & 1, (i3 & 306783379) == 306783378)) {
                    }
                    s = M.s();
                    if (s == null) {
                    }
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i2 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                if (M.t(i3 & 1, (i3 & 306783379) == 306783378)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i2 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            if (M.t(i3 & 1, (i3 & 306783379) == 306783378)) {
            }
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i2 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        if (M.t(i3 & 1, (i3 & 306783379) == 306783378)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final gzs<s3q0> gzsVar, final long j, final q630 q630Var, boolean z, final IconButtonRippleType iconButtonRippleType, final boolean z2, dt1 dt1Var, sg50 sg50Var, final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        final dt1 dt1Var2;
        final sg50 sg50Var2;
        androidx.compose.runtime.f s;
        dt1 dt1Var3;
        sg50 sg50Var3;
        float f;
        float f2;
        androidx.compose.runtime.a M = aVar.M(-808147588);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z;
            i3 |= M.l(z3) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.o(iconButtonRippleType == null ? -1 : iconButtonRippleType.ordinal()) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= M.l(z2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= M.J(dt1Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= M.J(sg50Var) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i3 |= M.y(wzsVar) ? 67108864 : 33554432;
            }
            if (M.t(i3 & 1, (i3 & 38347923) == 38347922)) {
                M.h();
                dt1Var2 = dt1Var;
                sg50Var2 = sg50Var;
            } else {
                if (i6 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    dt1.a.getClass();
                    dt1Var3 = dt1.a.f;
                } else {
                    dt1Var3 = dt1Var;
                }
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i5 != 0) {
                    Object x = M.x();
                    if (x == c0012a) {
                        x = ir.h(M);
                    }
                    sg50Var3 = (sg50) x;
                } else {
                    sg50Var3 = sg50Var;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-808147588, i3, -1, "com.vk.core.compose.component.VkIconButton (VkIconButton.kt:424)");
                }
                boolean z4 = ((57344 & i3) == 16384) | ((i3 & 112) == 32);
                Object x2 = M.x();
                if (z4 || x2 == c0012a) {
                    if (j != 9205357640488583168L) {
                        int i7 = a.$EnumSwitchMapping$1[iconButtonRippleType.ordinal()];
                        if (i7 == 1) {
                            float f3 = 2;
                            f = Math.max(uco.c(j) / f3, uco.b(j) / f3);
                        } else {
                            if (i7 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f = Math.max(uco.c(j), uco.b(j));
                        }
                    } else {
                        f = Float.NaN;
                    }
                    x2 = new pco(f);
                    M.R(x2);
                }
                sg50 sg50Var4 = sg50Var3;
                int i8 = i3;
                q630 b = ojc.b(q630Var, sg50Var4, qer0.a(((pco) x2).b, 4, 0L, z3), z2, new plg0(0), gzsVar, 8);
                q630 q630Var2 = q630.a.a;
                if (j != 9205357640488583168L) {
                    q630Var2 = txj0.r(j, q630Var2);
                }
                q630 g = b.g(q630Var2);
                cp10 d = ja8.d(dt1Var3, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, g);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                if (z2) {
                    M.K(-1104524995);
                    f2 = ((Number) M.r(hfj.a)).floatValue();
                    M.j();
                } else {
                    M.K(1178797804);
                    M.j();
                    f2 = 0.64f;
                }
                rvi.a(hfj.a.b(Float.valueOf(f2)), wzsVar, M, ((i8 >> 21) & 112) | 8);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                dt1Var2 = dt1Var3;
                sg50Var2 = sg50Var4;
            }
            final boolean z5 = z3;
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.lzu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nzu0.d(gzs.this, j, q630Var, z5, iconButtonRippleType, z2, dt1Var2, sg50Var2, wzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 38347923) == 38347922)) {
        }
        final boolean z52 = z3;
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final gzs gzsVar, q630 q630Var, float f, IconButtonRippleType iconButtonRippleType, boolean z, dt1 dt1Var, sg50 sg50Var, final wzs wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        float f2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        androidx.compose.runtime.a aVar2;
        final sg50 sg50Var2;
        final q630 q630Var3;
        final float f3;
        final boolean z3;
        final IconButtonRippleType iconButtonRippleType2;
        final dt1 dt1Var2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(700961287);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f2 = f;
                i3 |= M.n(f2) ? 256 : 128;
                int i9 = i3 | 3072;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i9 = i3 | 27648;
                } else if ((i & 24576) == 0) {
                    i9 |= M.o(iconButtonRippleType == null ? -1 : iconButtonRippleType.ordinal()) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i9 |= 196608;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i9 |= M.l(z2) ? 131072 : 65536;
                    i7 = i9 | 14155776;
                    if ((100663296 & i) == 0) {
                        i7 |= M.y(wzsVar) ? 67108864 : 33554432;
                    }
                    if (M.t(i7 & 1, (38347923 & i7) == 38347922)) {
                        aVar2 = M;
                        aVar2.h();
                        sg50Var2 = sg50Var;
                        q630Var3 = q630Var2;
                        f3 = f2;
                        z3 = z2;
                        iconButtonRippleType2 = iconButtonRippleType;
                        dt1Var2 = dt1Var;
                    } else {
                        q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                        if (i4 != 0) {
                            f2 = gzu0.a;
                        }
                        IconButtonRippleType iconButtonRippleType3 = i5 != 0 ? IconButtonRippleType.Unbounded : iconButtonRippleType;
                        boolean z4 = i6 == 0 ? z2 : true;
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.f;
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = ir.h(M);
                        }
                        sg50 sg50Var3 = (sg50) x;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(700961287, i7, -1, "com.vk.core.compose.component.VkIconButton (VkIconButton.kt:287)");
                        }
                        aVar2 = M;
                        d(gzsVar, byc0.b(f2, f2), q630Var4, false, iconButtonRippleType3, z4, ty6Var, sg50Var3, wzsVar, aVar2, (i7 & 14) | ((i7 << 3) & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7), 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        f3 = f2;
                        q630Var3 = q630Var4;
                        iconButtonRippleType2 = iconButtonRippleType3;
                        z3 = z4;
                        dt1Var2 = ty6Var;
                        sg50Var2 = sg50Var3;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.mzu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nzu0.e(gzs.this, q630Var3, f3, iconButtonRippleType2, z3, dt1Var2, sg50Var2, wzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z2 = z;
                i7 = i9 | 14155776;
                if ((100663296 & i) == 0) {
                }
                if (M.t(i7 & 1, (38347923 & i7) == 38347922)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            f2 = f;
            int i92 = i3 | 3072;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            z2 = z;
            i7 = i92 | 14155776;
            if ((100663296 & i) == 0) {
            }
            if (M.t(i7 & 1, (38347923 & i7) == 38347922)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        int i922 = i3 | 3072;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        z2 = z;
        i7 = i922 | 14155776;
        if ((100663296 & i) == 0) {
        }
        if (M.t(i7 & 1, (38347923 & i7) == 38347922)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
