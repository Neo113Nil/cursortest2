package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkHorizontalListItem.kt */
/* loaded from: classes17.dex */
public final class azu0 {

    /* compiled from: VkHorizontalListItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HorizontalListItem$VisualContent.Type.values().length];
            try {
                iArr[HorizontalListItem$VisualContent.Type.Picture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HorizontalListItem$VisualContent.Type.Avatar.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final HorizontalListItem$Size.WithPicture withPicture, final phw phwVar, final fsv0 fsv0Var, q630 q630Var, final HorizontalListItem$VisualContent.Type type, iy5 iy5Var, final gev gevVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final iy5 iy5Var2;
        rep repVar;
        HorizontalListItem$VisualContent a2;
        androidx.compose.runtime.a M = aVar.M(593953399);
        int i2 = i | (M.J(phwVar) ? 32 : 16) | (M.J(fsv0Var) ? 256 : 128) | 1772544 | (M.J(gevVar) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            rep repVar2 = rep.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(593953399, i2, -1, "com.vk.core.compose.component.VkHorizontalListItem (VkHorizontalListItem.kt:88)");
            }
            int i3 = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i3 == 1) {
                repVar = repVar2;
                M.K(-441414110);
                a2 = HorizontalListItem$VisualContent.c.a(phwVar, M, ((i2 >> 3) & 14) | X2.b.f, 0);
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(-441416478, M);
                }
                M.K(-441407839);
                repVar = repVar2;
                a2 = HorizontalListItem$VisualContent.a.a(phwVar, repVar, null, 0, M, ((i2 >> 3) & 14) | 221232, 12);
                M.j();
            }
            HorizontalListItem$VisualContent horizontalListItem$VisualContent = a2;
            q630.a aVar2 = q630.a.a;
            b(withPicture, horizontalListItem$VisualContent, fsv0Var, aVar2, gevVar, M, (i2 & 8078) | ((i2 >> 9) & 57344), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            iy5Var2 = repVar;
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
            iy5Var2 = iy5Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(phwVar, fsv0Var, q630Var2, type, iy5Var2, gevVar, i) { // from class: xsna.wyu0
                public final /* synthetic */ phw c;
                public final /* synthetic */ fsv0 d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ HorizontalListItem$VisualContent.Type f;
                public final /* synthetic */ iy5 g;
                public final /* synthetic */ gev h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(24583);
                    azu0.a(HorizontalListItem$Size.WithPicture.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final HorizontalListItem$Size horizontalListItem$Size, final HorizontalListItem$VisualContent horizontalListItem$VisualContent, final iev ievVar, final q630 q630Var, gev gevVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        iev ievVar2;
        gev gevVar2;
        final gev gevVar3;
        androidx.compose.runtime.f s;
        final long j;
        float f;
        s890 s890Var;
        u890 u890Var;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1247117667);
        if ((i & 6) == 0) {
            i3 = (M.J(horizontalListItem$Size) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(horizontalListItem$VisualContent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            ievVar2 = ievVar;
            i3 |= M.J(ievVar2) ? 256 : 128;
        } else {
            ievVar2 = ievVar;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            gevVar2 = gevVar;
            i3 |= M.J(gevVar2) ? 16384 : 8192;
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
                gevVar3 = gevVar2;
            } else {
                gev gevVar4 = i5 != 0 ? null : gevVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1247117667, i3, -1, "com.vk.core.compose.component.VkHorizontalListItem (VkHorizontalListItem.kt:56)");
                }
                uco ucoVar = gevVar4 != null ? gevVar4.a : null;
                if (ucoVar == null) {
                    M.K(-184184276);
                    fdi.w();
                    int i6 = i3 & 14;
                    M.K(842051020);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(842051020, i6, -1, "com.vk.core.compose.component.defaults.HorizontalListItemDefaults.imageSize (HorizontalListItemDefaults.kt:47)");
                    }
                    if (horizontalListItem$Size == HorizontalListItem$Size.WithPlainImage.Large) {
                        M.K(1757183746);
                        M.j();
                        float f2 = 128;
                        j = byc0.b(f2, f2);
                    } else if (horizontalListItem$Size == HorizontalListItem$Size.WithPlainImage.ExtraLarge) {
                        M.K(1757186434);
                        M.j();
                        j = byc0.b(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    } else {
                        if (!(horizontalListItem$Size instanceof HorizontalListItem$Size.WithPicture)) {
                            throw alb0.c(1757181623, M);
                        }
                        M.K(1757189398);
                        HorizontalListItem$Size.WithPicture withPicture = (HorizontalListItem$Size.WithPicture) horizontalListItem$Size;
                        M.K(-789387088);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-789387088, 0, -1, "com.vk.core.compose.component.defaults.HorizontalListItemDefaults.imageSize (HorizontalListItemDefaults.kt:38)");
                        }
                        int i7 = lev.$EnumSwitchMapping$0[withPicture.ordinal()];
                        if (i7 == 1) {
                            i4 = 56;
                        } else {
                            if (i7 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i4 = 88;
                        }
                        float f3 = i4;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        j = byc0.b(f3, f3);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    M.j();
                } else {
                    M.K(-184185454);
                    M.j();
                    j = ucoVar.a;
                }
                jai c = kai.c(-652166549, new yzs() { // from class: xsna.xyu0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-652166549, intValue, -1, "com.vk.core.compose.component.VkHorizontalListItem.<anonymous> (VkHorizontalListItem.kt:59)");
                            }
                            HorizontalListItem$VisualContent.this.a(0, j, aVar2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M);
                s890 s890Var2 = gevVar4 != null ? gevVar4.c : null;
                if (s890Var2 == null) {
                    M.K(-184177161);
                    fdi.w();
                    int i8 = i3 & 14;
                    M.K(1646228158);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1646228158, i8, -1, "com.vk.core.compose.component.defaults.MilkshakeHorizontalListItemDefaults.visualContentPadding (MilkshakeHorizontalListItemDefaults.kt:37)");
                    }
                    if (horizontalListItem$Size == HorizontalListItem$Size.WithPicture.Small) {
                        float f4 = kqu0.s;
                        float f5 = 0;
                        s890Var2 = new u890(f4, f5, f4, f5);
                    } else {
                        if (horizontalListItem$Size != HorizontalListItem$Size.WithPicture.Medium && horizontalListItem$Size != HorizontalListItem$Size.WithPlainImage.Large && horizontalListItem$Size != HorizontalListItem$Size.WithPlainImage.ExtraLarge) {
                            throw new NoWhenBranchMatchedException();
                        }
                        float f6 = 0;
                        s890Var2 = new u890(f6, f6, f6, f6);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(-184178618);
                }
                M.j();
                if (gevVar4 != null) {
                    f = Float.NaN;
                    if (!Float.isNaN(Float.NaN)) {
                        M.K(-1414412752);
                        M.j();
                        float f7 = f;
                        s890Var = gevVar4 == null ? gevVar4.b : null;
                        if (s890Var != null) {
                            M.K(-184166902);
                            fdi.w();
                            int i9 = i3 & 14;
                            M.K(-217090117);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-217090117, i9, -1, "com.vk.core.compose.component.defaults.MilkshakeHorizontalListItemDefaults.padding (MilkshakeHorizontalListItemDefaults.kt:17)");
                            }
                            if (horizontalListItem$Size == HorizontalListItem$Size.WithPicture.Small) {
                                float f8 = kqu0.q;
                                u890Var = new u890(f8, kqu0.r, f8, kqu0.t);
                            } else {
                                if (horizontalListItem$Size != HorizontalListItem$Size.WithPicture.Medium && horizontalListItem$Size != HorizontalListItem$Size.WithPlainImage.Large && horizontalListItem$Size != HorizontalListItem$Size.WithPlainImage.ExtraLarge) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                float f9 = kqu0.s;
                                u890Var = new u890(f9, kqu0.r, f9, kqu0.t);
                            }
                            s890Var = u890Var;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                        } else {
                            M.K(-184167956);
                        }
                        M.j();
                        gev gevVar5 = gevVar4;
                        c(c, ievVar2, s890Var2, f7, s200.C(q630Var, s890Var), M, ((i3 >> 3) & 112) | 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        gevVar3 = gevVar5;
                    }
                }
                M.K(-1414353852);
                fdi.w();
                M.K(1239155401);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1239155401, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeHorizontalListItemDefaults.gapBetweenVisualAndTextContent (MilkshakeHorizontalListItemDefaults.kt:55)");
                }
                float f10 = kqu0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                f = kqu0.s;
                M.j();
                float f72 = f;
                if (gevVar4 == null) {
                }
                if (s890Var != null) {
                }
                M.j();
                gev gevVar52 = gevVar4;
                c(c, ievVar2, s890Var2, f72, s200.C(q630Var, s890Var), M, ((i3 >> 3) & 112) | 6);
                if (androidx.compose.runtime.b.d()) {
                }
                gevVar3 = gevVar52;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.yyu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        azu0.b(HorizontalListItem$Size.this, horizontalListItem$VisualContent, ievVar, q630Var, gevVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        gevVar2 = gevVar;
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void c(final jai jaiVar, final iev ievVar, final s890 s890Var, float f, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        float f2;
        androidx.compose.runtime.a M = aVar.M(465118654);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(ievVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(s890Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f2 = f;
            i2 |= M.n(f2) ? 2048 : 1024;
        } else {
            f2 = f;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(465118654, i2, -1, "com.vk.core.compose.component.VkHorizontalListItem (VkHorizontalListItem.kt:146)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new rni(4);
                M.R(x);
            }
            q630 i3 = dd80.i(q630Var, (yzs) x);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, i3);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 C = s200.C(q630.a.a, s890Var);
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, C);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            jaiVar.invoke(ra8.a, M, Integer.valueOf(((i2 << 3) & 112) | 6));
            M.G();
            bzu0 bzu0Var = new bzu0();
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, bzu0Var);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            ievVar.a((i2 >> 3) & 14, M);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final float f3 = f2;
            s.d = new wzs() { // from class: xsna.zyu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    azu0.c(jai.this, ievVar, s890Var, f3, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
