package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: AboutProfileInfoSlotImpl.kt */
/* loaded from: classes5.dex */
public final class x3 implements l95 {
    public final wh50 a;

    public x3(AuthorHeaderConfig.Info.InfoSlotData.b bVar) {
        this.a = androidx.compose.runtime.k.b(bVar);
    }

    @Override // xsna.l95
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        x3 x3Var;
        int i3;
        q630 q630Var;
        x3 x3Var2;
        x3 x3Var3;
        boolean z;
        x3 x3Var4 = this;
        androidx.compose.runtime.a M = aVar.M(-724242234);
        if ((i & 384) == 0) {
            i2 = (M.J(x3Var4) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-724242234, i2, -1, "com.vk.profile.design.compose.header.info.AboutProfileInfoSlotImpl.Content (AboutProfileInfoSlotImpl.kt:44)");
            }
            izs izsVar = (izs) M.r(h85.a);
            boolean z2 = x3Var4.e().a != null;
            boolean z3 = x3Var4.e().b != null;
            boolean J = M.J(izsVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new s3(izsVar, 0);
                M.R(x);
            }
            q630 q630Var2 = q630.a.a;
            q630 E = s200.E(txj0.f(ojc.c(q630Var2, false, null, null, (gzs) x, 15), 1.0f), kqu0.w, kqu0.r);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = kqu0.t;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            boolean z4 = z2;
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (z4 || z3) {
                M.K(1927726338);
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), bVar, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, q630Var2);
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
                k9q0.w(M, a2, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar2, M, c2678a);
                k9q0.w(M, c2, dVar);
                AuthorHeaderConfig.Info.InfoSlotData.b.a aVar3 = x3Var4.e().a;
                if (aVar3 == null) {
                    M.K(1605672309);
                    M.j();
                    i3 = 1924939128;
                    q630Var = null;
                } else {
                    M.K(1605672310);
                    if (z3) {
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        q630Var2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    }
                    i3 = 1924939128;
                    q630Var = null;
                    x3Var4.c(aVar3, true, q630Var2, M, ((i2 << 3) & 7168) | 48);
                    M.j();
                }
                AuthorHeaderConfig.Info.InfoSlotData.b.a aVar4 = e().b;
                if (aVar4 == null) {
                    M.K(1606126986);
                    M.j();
                    x3Var2 = this;
                } else {
                    M.K(1606126987);
                    gri.b(q630Var, M, 0);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    x3 x3Var5 = this;
                    x3Var5.c(aVar4, false, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), M, ((i2 << 3) & 7168) | 48);
                    M.j();
                    x3Var2 = x3Var5;
                }
                M.G();
                M.j();
                x3Var3 = x3Var2;
            } else {
                M.K(1924939128);
                M.j();
                i3 = 1924939128;
                q630Var = null;
                x3Var3 = x3Var4;
            }
            if (x3Var3.e().a != null) {
                M.K(1928778602);
                z = false;
                gri.b(q630Var, M, 0);
            } else {
                z = false;
                M.K(i3);
            }
            M.j();
            x3Var3.b(z3, (x3Var3.e().a != null || z3) ? z : true, M, i2 & 896);
            M.G();
            x3Var = x3Var3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                x3Var = x3Var3;
            }
        } else {
            M.h();
            x3Var = x3Var4;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t3(x3Var, i);
        }
    }

    public final void b(final boolean z, boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z3;
        androidx.compose.runtime.a M = aVar.M(-425501177);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-425501177, i2, -1, "com.vk.profile.design.compose.header.info.AboutProfileInfoSlotImpl.DetailsItem (AboutProfileInfoSlotImpl.kt:121)");
            }
            if (z) {
                M.K(-1656939868);
                q630 q = txj0.q(q630.a.a, 20);
                qzu0.a.getClass();
                lg90 t0 = qzu0.t0(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(t0, null, q, ylu0Var.getIcon().j, M, 440, 0);
                M.j();
                z3 = z2;
            } else {
                M.K(-1656687714);
                qzu0.a.getClass();
                lg90 t02 = qzu0.t0(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z3 = z2;
                d(t02, new l5g(ylu0Var2.getIcon().j), z3, d370.N(R.string.author_header_about_profile_user, 0, M), null, M, ((i2 << 3) & 896) | 8 | ((i2 << 9) & 458752), 16);
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z3 = z2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.v3
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    x3.this.b(z, z3, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(AuthorHeaderConfig.Info.InfoSlotData.b.a aVar, boolean z, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        boolean z2;
        q630 q630Var2;
        boolean z3;
        lg90 b;
        l5g c;
        androidx.compose.runtime.a M = aVar2.M(-231444044);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-231444044, i2, -1, "com.vk.profile.design.compose.header.info.AboutProfileInfoSlotImpl.FieldItem (AboutProfileInfoSlotImpl.kt:107)");
            }
            int i3 = (i2 & 14) | ((i2 >> 6) & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(44950214, i3, -1, "com.vk.profile.design.compose.header.info.AboutProfileInfoSlotImpl.getFieldText (AboutProfileInfoSlotImpl.kt:194)");
            }
            boolean z4 = aVar instanceof AuthorHeaderConfig.Info.InfoSlotData.b.a.c;
            if (z4) {
                ((AuthorHeaderConfig.Info.InfoSlotData.b.a.c) aVar).getClass();
            } else if (aVar instanceof AuthorHeaderConfig.Info.InfoSlotData.b.a.C1656a) {
                ((AuthorHeaderConfig.Info.InfoSlotData.b.a.C1656a) aVar).getClass();
            } else {
                if (!(aVar instanceof AuthorHeaderConfig.Info.InfoSlotData.b.a.C1657b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((AuthorHeaderConfig.Info.InfoSlotData.b.a.C1657b) aVar).getClass();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-765658276, i3, -1, "com.vk.profile.design.compose.header.info.AboutProfileInfoSlotImpl.getFieldIcon (AboutProfileInfoSlotImpl.kt:177)");
            }
            if (z4) {
                M.K(-1358190745);
                ((AuthorHeaderConfig.Info.InfoSlotData.b.a.c) aVar).getClass();
                z3 = z4;
                b = fwu0.l(null, null, null, null, M, 0, 61);
                M.j();
            } else {
                z3 = z4;
                if (aVar instanceof AuthorHeaderConfig.Info.InfoSlotData.b.a.C1656a) {
                    M.K(-1358187766);
                    qzu0.a.getClass();
                    b = qzu0.b1(M);
                    M.j();
                } else {
                    if (!(aVar instanceof AuthorHeaderConfig.Info.InfoSlotData.b.a.C1657b)) {
                        throw alb0.c(-1358192363, M);
                    }
                    M.K(-1358185522);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(322264354, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-EducationOutline20> (VkIcons.kt:2360)");
                    }
                    b = or.b(M, 1325640063, R.drawable.vk_icon_education_outline_20, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
            }
            lg90 lg90Var = b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1292398065, i3, -1, "com.vk.profile.design.compose.header.info.AboutProfileInfoSlotImpl.getFieldIconTint (AboutProfileInfoSlotImpl.kt:186)");
            }
            if (z3) {
                M.K(-1743760178);
                M.j();
                c = null;
            } else {
                M.K(-748985542);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(ylu0Var.getIcon().j, M);
            }
            l5g l5gVar = c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = ((i2 << 3) & 896) | 8;
            int i5 = i2 << 6;
            d(lg90Var, l5gVar, z2, null, q630Var2, M, i4 | (57344 & i5) | (i5 & 458752), 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u3(this, aVar, z, q630Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(final lg90 lg90Var, final l5g l5gVar, final boolean z, final String str, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        a.j g;
        oe7 oe7Var;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(1284482266);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(l5gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(str) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 16384 : 8192;
            i4 = i3;
            if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630.a aVar2 = q630.a.a;
                q630 q630Var4 = i5 != 0 ? aVar2 : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1284482266, i4, -1, "com.vk.profile.design.compose.header.info.AboutProfileInfoSlotImpl.IconText (AboutProfileInfoSlotImpl.kt:146)");
                }
                dt1.a.getClass();
                ty6.b bVar = dt1.a.l;
                if (z) {
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    g = androidx.compose.foundation.layout.a.g(kqu0.v);
                } else {
                    a.l lVar2 = androidx.compose.foundation.layout.a.a;
                    g = androidx.compose.foundation.layout.a.g(kqu0.t);
                }
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, bVar, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var4);
                cri.h7.getClass();
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
                k9q0.w(M, a, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                q630 d = rte0.d(txj0.q(aVar2, 20), y3.a);
                if (l5gVar != null) {
                    long j = l5gVar.a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        se7.b();
                        porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                    }
                    oe7Var = new oe7(j, 5, porterDuffColorFilter);
                } else {
                    oe7Var = null;
                }
                q630 q630Var5 = q630Var4;
                r0v0.a(lg90Var, d, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, null, null, M, 12582968 | (i4 & 14), 92);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.U;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, ((i4 >> 9) & 14) | 905969664, 48, 5370);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.w3
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x3.this.d(lg90Var, l5gVar, z, str, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i4 = i3;
        if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public final AuthorHeaderConfig.Info.InfoSlotData.b e() {
        return (AuthorHeaderConfig.Info.InfoSlotData.b) ((zak0) this.a).getValue();
    }
}
