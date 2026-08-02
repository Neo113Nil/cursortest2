package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.tile.Tile$TextAlignment;
import com.vk.core.compose.component.tile.Tile$TextSize;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.cto0;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: VkTileTextContent.kt */
/* loaded from: classes17.dex */
public final class fsv0 extends iev {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;

    /* compiled from: VkTileTextContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tile$TextAlignment.values().length];
            try {
                iArr[Tile$TextAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tile$TextAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fsv0(us2 us2Var, us2 us2Var2, us2 us2Var3, azo0 azo0Var, azo0 azo0Var2, azo0 azo0Var3, us2 us2Var4, azo0 azo0Var4, azo0 azo0Var5, us2 us2Var5, Tile$TextAlignment tile$TextAlignment, Tile$TextSize tile$TextSize) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.b = androidx.compose.runtime.k.b(us2Var2);
        this.c = androidx.compose.runtime.k.b(us2Var3);
        this.d = androidx.compose.runtime.k.b(azo0Var);
        this.e = androidx.compose.runtime.k.b(azo0Var2);
        this.f = androidx.compose.runtime.k.b(azo0Var3);
        this.g = androidx.compose.runtime.k.b(us2Var4);
        this.h = androidx.compose.runtime.k.b(azo0Var4);
        this.i = androidx.compose.runtime.k.b(azo0Var5);
        this.j = androidx.compose.runtime.k.b(us2Var5);
        this.k = androidx.compose.runtime.k.b(tile$TextAlignment);
        this.l = androidx.compose.runtime.k.b(tile$TextSize);
    }

    @Override // xsna.iev
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        wh50 wh50Var;
        int i4;
        wh50 wh50Var2;
        String str;
        int i5;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar.M(682555000);
        if ((i & 6) == 0) {
            i2 = i | (M.J(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(682555000, i2, -1, "com.vk.core.compose.component.horizontal.VkTileTextContent.Draw (VkTileTextContent.kt:50)");
            }
            wh50 wh50Var3 = this.k;
            int i6 = a.$EnumSwitchMapping$0[((Tile$TextAlignment) ((zak0) wh50Var3).getValue()).ordinal()];
            if (i6 == 1) {
                i3 = 5;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 3;
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1443771206, 6, -1, "com.vk.core.compose.component.tile.TileDefaults.textElementsGap (TileDefaults.kt:118)");
            }
            float f = kqu0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.q);
            q630.a aVar4 = q630.a.a;
            q630 f2 = txj0.f(aVar4, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            us2 us2Var = (us2) ((zak0) this.b).getValue();
            wh50 wh50Var4 = this.l;
            if (us2Var == null) {
                M.K(-1656972273);
                M.j();
                wh50Var2 = wh50Var3;
                i4 = i2;
                aVar3 = aVar4;
                wh50Var = wh50Var4;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i5 = 1040687336;
            } else {
                M.K(-1656972272);
                Tile$TextAlignment tile$TextAlignment = (Tile$TextAlignment) ((zak0) wh50Var3).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(396647623, 384, -1, "com.vk.core.compose.component.tile.TileDefaults.overtitleTextStyle (TileDefaults.kt:111)");
                }
                M.K(1074507433);
                frv0 c2 = cto0.c(tile$TextAlignment, M);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                wh50Var = wh50Var4;
                i4 = i2;
                wh50Var2 = wh50Var3;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i5 = 1040687336;
                aVar3 = aVar4;
                ntu0.c(us2Var, txj0.f(aVar4, 1.0f), c2, ylu0Var.getText().r, 0, false, false, false, null, i3, null, 0, null, M, 48, 0, 7600);
                M = M;
                M.j();
            }
            int i7 = (i4 << 3) & 112;
            c(i3, i7, M);
            b(i3, i7, M);
            us2 us2Var2 = (us2) ((zak0) this.j).getValue();
            if (us2Var2 == null) {
                M.K(-1656461114);
                M.j();
                aVar2 = M;
            } else {
                M.K(-1656461113);
                Tile$TextAlignment tile$TextAlignment2 = (Tile$TextAlignment) ((zak0) wh50Var2).getValue();
                frv0 c3 = cto0.c(tile$TextAlignment2, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(i5, 0, -1, str);
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                ntu0.c(us2Var2, txj0.f(aVar3, 1.0f), c3, ylu0Var2.getText().p, 0, false, false, false, null, i3, null, 0, null, aVar2, 48, 0, 7600);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new iy9(this, i, 2);
        }
    }

    public final void b(final int i, final int i2, androidx.compose.runtime.a aVar) {
        int i3;
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(2121397958);
        if ((i2 & 6) == 0) {
            i3 = i2 | (M.o(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(this) ? 32 : 16;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2121397958, i4, -1, "com.vk.core.compose.component.horizontal.VkTileTextContent.SubtitleRow (VkTileTextContent.kt:135)");
            }
            us2 us2Var = (us2) ((zak0) this.g).getValue();
            if (us2Var == null) {
                M.K(-1877072310);
            } else {
                M.K(-1877072309);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-368109723, 6, -1, "com.vk.core.compose.component.tile.TileDefaults.subtitleElementsGap (TileDefaults.kt:128)");
                }
                float f = kqu0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
                dt1.a.getClass();
                ty6.b bVar = dt1.a.l;
                q630 f2 = txj0.f(q630.a.a, 1.0f);
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, bVar, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f2);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                azo0 azo0Var = (azo0) ((zak0) this.h).getValue();
                if (azo0Var == null) {
                    M.K(-1660857372);
                } else {
                    M.K(-1660857371);
                    lg90 lg90Var = azo0Var.a;
                    l5g l5gVar = azo0Var.b;
                    if (l5gVar == null) {
                        M.K(90881811);
                        j = cto0.b(M);
                        M.j();
                    } else {
                        M.K(90880571);
                        M.j();
                        j = l5gVar.a;
                    }
                    uqv.b(lg90Var, null, null, j, M, 56, 4);
                }
                M.j();
                Tile$TextAlignment tile$TextAlignment = (Tile$TextAlignment) ((zak0) this.k).getValue();
                frv0 c2 = cto0.c(tile$TextAlignment, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j3 = ylu0Var.getText().p;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                ntu0.c(us2Var, new xpy(1.0f, true), c2, j3, 0, false, false, false, null, i, null, 0, null, M, (i4 << 27) & 1879048192, 0, 7664);
                M = M;
                azo0 azo0Var2 = (azo0) ((zak0) this.i).getValue();
                if (azo0Var2 == null) {
                    M.K(-1660189849);
                } else {
                    M.K(-1660189848);
                    lg90 lg90Var2 = azo0Var2.a;
                    l5g l5gVar2 = azo0Var2.b;
                    if (l5gVar2 == null) {
                        M.K(882865322);
                        j2 = cto0.b(M);
                        M.j();
                    } else {
                        M.K(882864113);
                        M.j();
                        j2 = l5gVar2.a;
                    }
                    uqv.b(lg90Var2, null, null, j2, M, 56, 4);
                }
                M.j();
                M.G();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dsv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    fsv0.this.b(i, I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(int i, final int i2, androidx.compose.runtime.a aVar) {
        int i3;
        final int i4;
        long j;
        float f;
        String str;
        frv0 frv0Var;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        long j3;
        androidx.compose.runtime.a M = aVar.M(-258551902);
        if ((i2 & 6) == 0) {
            i3 = i2 | (M.o(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(this) ? 32 : 16;
        }
        int i9 = i3;
        if (M.t(i9 & 1, (i9 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-258551902, i9, -1, "com.vk.core.compose.component.horizontal.VkTileTextContent.TitleRow (VkTileTextContent.kt:86)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-681543607, 6, -1, "com.vk.core.compose.component.tile.TileDefaults.titleElementsGap (TileDefaults.kt:121)");
            }
            float f2 = kqu0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.r);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            q630 f3 = txj0.f(q630.a.a, 1.0f);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f3);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            azo0 azo0Var = (azo0) ((zak0) this.d).getValue();
            if (azo0Var == null) {
                M.K(-460213070);
                M.j();
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                f = 1.0f;
            } else {
                M.K(-460213069);
                lg90 lg90Var = azo0Var.a;
                l5g l5gVar = azo0Var.b;
                if (l5gVar == null) {
                    M.K(419263758);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(367435507, 6, -1, "com.vk.core.compose.component.tile.TileDefaults.titleDefaultIconBeforeTint (TileDefaults.kt:135)");
                    }
                    M.K(-1600317087);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().a;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(419262611);
                    M.j();
                    j = l5gVar.a;
                }
                f = 1.0f;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                uqv.b(lg90Var, null, null, j, M, 56, 4);
                M.j();
            }
            us2 us2Var = (us2) ((zak0) this.a).getValue();
            Tile$TextAlignment tile$TextAlignment = (Tile$TextAlignment) ((zak0) this.k).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-139372813, 384, -1, "com.vk.core.compose.component.tile.TileDefaults.titleTextStyle (TileDefaults.kt:79)");
            }
            M.K(1178219227);
            int i10 = cto0.a.$EnumSwitchMapping$4[tile$TextAlignment.ordinal()];
            if (i10 == 1) {
                M.K(-793274278);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.d0;
                M.j();
            } else {
                if (i10 != 2) {
                    throw alb0.c(-793276617, M);
                }
                M.K(-793272101);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.s0;
                M.j();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j4 = wlb0.h(M).getText().m;
            int i11 = i == 5 ? Integer.MAX_VALUE : 1;
            if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            ntu0.c(us2Var, new xpy(f, true), frv0Var, j4, i11, false, false, false, null, i, null, 0, null, M, (i9 << 27) & 1879048192, 0, 7584);
            i4 = i;
            M = M;
            us2 us2Var2 = (us2) ((zak0) this.c).getValue();
            if (us2Var2 == null) {
                M.K(-459495978);
            } else {
                M.K(-459495977);
                yqv0.b(us2Var2, null, wlb0.h(M).getText().p, 0L, 0L, 0L, 0, false, 0, null, null, wlb0.l(M).i0, M, 0, 0, 262138);
                M = M;
            }
            M.j();
            azo0 azo0Var2 = (azo0) ((zak0) this.e).getValue();
            if (azo0Var2 == null) {
                M.K(-459227797);
                M.j();
                str2 = str;
                i5 = 6;
                i6 = -1;
                i7 = 1040687336;
                i8 = 0;
            } else {
                M.K(-459227796);
                lg90 lg90Var2 = azo0Var2.a;
                l5g l5gVar2 = azo0Var2.b;
                if (l5gVar2 == null || l5gVar2.a == 16) {
                    l5gVar2 = null;
                }
                if (l5gVar2 == null) {
                    M.K(1588850449);
                    if (androidx.compose.runtime.b.d()) {
                        i5 = 6;
                        i6 = -1;
                        androidx.compose.runtime.b.f(-557661147, 6, -1, "com.vk.core.compose.component.tile.TileDefaults.titleDefaultIcon1Tint (TileDefaults.kt:142)");
                    } else {
                        i5 = 6;
                        i6 = -1;
                    }
                    M.K(-349602929);
                    str2 = str;
                    i7 = 1040687336;
                    i8 = 0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, i6, str2);
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var2.getIcon().a;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    str2 = str;
                    i5 = 6;
                    i6 = -1;
                    i7 = 1040687336;
                    i8 = 0;
                    M.K(1588846946);
                    M.j();
                    j2 = l5gVar2.a;
                }
                uqv.b(lg90Var2, null, null, j2, M, 56, 4);
                M.j();
            }
            azo0 azo0Var3 = (azo0) ((zak0) this.f).getValue();
            if (azo0Var3 == null) {
                M.K(-458859145);
            } else {
                M.K(-458859144);
                lg90 lg90Var3 = azo0Var3.a;
                l5g l5gVar3 = azo0Var3.b;
                if (l5gVar3 == null) {
                    M.K(904617712);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1527952154, i5, i6, "com.vk.core.compose.component.tile.TileDefaults.titleDefaultIcon2Tint (TileDefaults.kt:149)");
                    }
                    M.K(-1159090293);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(i7, i8, i6, str2);
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j3 = ylu0Var3.getIcon().l;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(904616565);
                    M.j();
                    j3 = l5gVar3.a;
                }
                uqv.b(lg90Var3, null, null, j3, M, 56, 4);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i4 = i;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.esv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    fsv0.this.c(i4, I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
