package xsna;

import android.content.Context;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.ty6;
import xsna.vd70;

/* compiled from: NotificationMenuModalView.kt */
/* loaded from: classes4.dex */
public final class be70 extends i6v0<ce70, fd70> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        m((ce70) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(vd70.a aVar, izs<? super fd70, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        q630.a aVar3;
        izs<? super fd70, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar2.M(-1720534753);
        int i2 = (M.y(this) ? 256 : 128) | i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1720534753, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.menu.NotificationMenuModalView.ContentSurface (NotificationMenuModalView.kt:126)");
            }
            yzt0<Boolean> yzt0Var = aVar.c;
            Boolean bool = Boolean.FALSE;
            wh50 d = jk50.d(yzt0Var, bool, M, 48);
            wh50 d2 = jk50.d(aVar.d, bool, M, 48);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar5 = q630.a.a;
            q630 c = qri.c(M, aVar5);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 t = n34.t(txj0.h(txj0.f(aVar5, 1.0f), 24), dz5.I(0, 1, M, false), null);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new sm0(6);
                M.R(x);
            }
            q630 b = ahh0.b(t, m4s.C((izs) x, M, 6), Orientation.Vertical);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, aVar4, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(2137843832);
            q630 d3 = rte0.d(txj0.s(new gcv(dt1.a.o), 32, 4), vog0.b(100));
            if (androidx.compose.runtime.b.d()) {
                aVar3 = aVar5;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                aVar3 = aVar5;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d3, ylu0Var.getIcon().n, androidx.compose.ui.graphics.e.a);
            M.j();
            ja8.a(m, M, 0);
            M.G();
            q630 E = ahn.E(p490.D(n34.t(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 7), dz5.I(0, 1, M, false), null), p490.x(M), 14), "NotificationsSettingsBottomSheet");
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, E);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            M.K(305358548);
            izsVar2 = izsVar;
            j(((i2 >> 3) & 14) | 4096 | ((i2 << 3) & 7168), M, izsVar2, ((Boolean) d2.getValue()).booleanValue(), ((Boolean) d.getValue()).booleanValue());
            M.j();
            l(aVar, izsVar2, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | (i2 & 896));
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
            s.d = new n87(this, aVar, izsVar2, i, 5);
        }
    }

    public final void i(final ee70 ee70Var, final boolean z, final izs<? super fd70, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        com.vk.core.compose.component.cell.content.o oVar;
        int i3 = ee70Var.d;
        androidx.compose.runtime.a M = aVar.M(584659967);
        if ((i & 6) == 0) {
            i2 = (M.J(ee70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(584659967, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.menu.NotificationMenuModalView.MilkshakeNotificationSourceItem (NotificationMenuModalView.kt:424)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630 E = ahn.E(q630.a.a, "NotificationSourcesItem");
            boolean y = ((i2 & 896) == 256) | ((i2 & 14) == 4) | M.y(context);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new x0o(izsVar, ee70Var, context, 3);
                M.R(x);
            }
            q630 g = o19.g(E, (gzs) x);
            com.vk.core.compose.component.cell.content.t a = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(ee70Var.c, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(ee70Var.b.a(context).toString(), null, null, 1, null, null, M, 12610560, 102), null, null, null, M, 196608, 30);
            if (z) {
                M.K(1514061168);
                oVar = o.e.a.C0736a.a(true, null, false, null, M, 24582, 14);
                M.j();
            } else if (i3 > 0) {
                M.K(1514205163);
                oVar = com.vk.core.compose.component.cell.content.l.a(i3, CounterAppearance.Design.Accent, M, 24624);
                M.j();
            } else {
                M.K(1514389055);
                M.j();
                oVar = null;
            }
            wiu0.b(g, false, a, a2, oVar, null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ae70
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    be70.this.i(ee70Var, z, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void j(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final boolean z, final boolean z2) {
        int i2;
        int i3;
        a.C0011a.C0012a c0012a;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1390502058);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1390502058, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.menu.NotificationMenuModalView.MilkshakeStaticContent (NotificationMenuModalView.kt:243)");
            }
            int i4 = i2 & 14;
            boolean z3 = i4 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z3 || x == c0012a2) {
                x = new t2(izsVar, 1);
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            wiu0.b(ahn.E(o19.g(aVar3, (gzs) x), "NotificationsSettingsOptions"), false, null, Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.notification_list_menu_settings_title, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30), null, null, null, M, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            androidx.compose.runtime.a aVar4 = M;
            if (z2) {
                aVar4.K(513349323);
                boolean z4 = i4 == 4;
                Object x2 = aVar4.x();
                if (z4 || x2 == c0012a2) {
                    x2 = new u2(izsVar, 4);
                    aVar4.R(x2);
                }
                aVar2 = aVar3;
                i3 = i2;
                c0012a = c0012a2;
                wiu0.b(ahn.E(o19.g(aVar3, (gzs) x2), "NotificationsSettingsProfileStats"), false, null, Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.notification_list_menu_profile_stats_title, 0, aVar4), null, null, 0, null, null, aVar4, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar4, 196608, 30), null, null, null, aVar4, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                aVar4 = aVar4;
            } else {
                i3 = i2;
                c0012a = c0012a2;
                aVar2 = aVar3;
                aVar4.K(502830124);
            }
            aVar4.j();
            float f = 16;
            float f2 = 8;
            q630 E = s200.E(aVar2, f, f2);
            SeparatorDpi separatorDpi = SeparatorDpi.At2x;
            SeparatorAppearance separatorAppearance = SeparatorAppearance.Primary;
            androidx.compose.runtime.a aVar5 = aVar4;
            ijv0.c(separatorDpi, separatorAppearance, E, aVar5, 438, 0);
            boolean z5 = i4 == 4;
            Object x3 = aVar5.x();
            if (z5 || x3 == c0012a) {
                x3 = new w2(izsVar, 6);
                aVar5.R(x3);
            }
            q630 g = o19.g(aVar2, (gzs) x3);
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.notification_list_menu_tab_switch, 0, aVar5), null, null, 0, null, null, aVar5, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar5, 196608, 30);
            boolean z6 = i4 == 4;
            Object x4 = aVar5.x();
            if (z6 || x4 == c0012a) {
                x4 = new vrc(izsVar, 2);
                aVar5.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            Object x5 = aVar5.x();
            if (x5 == c0012a) {
                x5 = new nyq(18);
                aVar5.R(x5);
            }
            wiu0.b(g, false, null, a, com.vk.core.compose.component.cell.content.n.a(z, gzsVar, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), aVar5, ((i3 >> 3) & 14) | 24576, 4), null, null, aVar5, 0, 102);
            ijv0.c(separatorDpi, separatorAppearance, s200.E(aVar2, f, f2), aVar5, 438, 0);
            String N = d370.N(R.string.notification_list_menu_communities_title, 0, aVar5);
            q630 G = s200.G(aVar2, f, 7, f, 9);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, G, 0L, null, null, 0, 1, null, 0, false, 0, 1, null, wuv0Var.M, aVar5, 0, 48, 6076);
            M = aVar5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zd70
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    be70.this.j(I, (androidx.compose.runtime.a) obj, izsVar, z, z2);
                    return s3q0.a;
                }
            };
        }
    }

    public final void k(ce70 ce70Var, izs<? super fd70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2133282073);
        int i2 = i | (M.J(ce70Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2133282073, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.menu.NotificationMenuModalView.NotificationMenuModalContent (NotificationMenuModalView.kt:102)");
            }
            int i3 = 6;
            vd70 vd70Var = (vd70) d(vd70.b.a, (n0u0[]) Arrays.copyOf(new n0u0[]{ce70Var.a}, 1), M, (((((i2 << 3) & 7168) | 4102) >> 3) & 896) | 6).getValue();
            if (vd70Var instanceof vd70.a) {
                M.K(-1395434064);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                uov0.a(null, f5v0.c, ylu0Var.getBackground().r, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1832369473, new fn7(this, (vd70.a) vd70Var, izsVar, i3), M), M, 1572864, 57);
            } else {
                M.K(-1400300351);
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
            s.d = new k3o(i, 5, this, ce70Var, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(vd70.a aVar, izs<? super fd70, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super fd70, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar2.M(778960332);
        be70 be70Var = this;
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16) | (M.y(be70Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(778960332, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.menu.NotificationMenuModalView.SourcesContent (NotificationMenuModalView.kt:301)");
            }
            yzt0<Boolean> yzt0Var = aVar.a;
            Boolean bool = Boolean.FALSE;
            wh50 d = jk50.d(yzt0Var, bool, M, 48);
            wh50 d2 = jk50.d(aVar.b, bool, M, 48);
            wh50 c = jk50.c(aVar.e, M);
            wh50 a = jk50.a(aVar.f, M, 0, 3);
            if (((Boolean) d.getValue()).booleanValue()) {
                M.K(299371895);
                xd70.a(0, M);
                M.j();
            } else {
                boolean booleanValue = ((Boolean) d2.getValue()).booleanValue();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (booleanValue) {
                    M.K(299463159);
                    boolean z = (i2 & 112) == 32;
                    Object x = M.x();
                    if (z || x == c0012a) {
                        x = new ux(izsVar2, 5);
                        M.R(x);
                    }
                    vwp.a(0, 1, M, (gzs) x, null);
                    M.j();
                } else {
                    M.K(299733944);
                    M.K(286538422);
                    M.j();
                    M.K(1256622413);
                    List<ee70> list = (List) c.getValue();
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (ee70 ee70Var : list) {
                        M.K(138712865);
                        int i3 = i2 << 3;
                        int i4 = (i3 & 896) | 4096 | (i3 & 7168);
                        izs<? super fd70, s3q0> izsVar3 = izsVar2;
                        be70Var.i(ee70Var, epx.f((Long) a.getValue(), ee70Var.a), izsVar3, M, i4);
                        izsVar2 = izsVar3;
                        M.j();
                        arrayList.add(s3q0.a);
                        be70Var = this;
                    }
                    M.j();
                    M.K(301229787);
                    q630 E = ahn.E(q630.a.a, "NotificationManageSourcesButton");
                    String N = d370.N(R.string.notification_list_menu_communities_manage_title, 0, M);
                    boolean z2 = (i2 & 112) == 32;
                    Object x2 = M.x();
                    if (z2 || x2 == c0012a) {
                        x2 = new o87(izsVar2, 7);
                        M.R(x2);
                    }
                    qh00.a(384, M, N, (gzs) x2, E);
                    M.j();
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dr3(i, 3, this, aVar, izsVar2);
        }
    }

    public final void m(ce70 ce70Var, izs<? super fd70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-642489331);
        int i2 = (M.J(ce70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-642489331, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.menu.NotificationMenuModalView.ThemedContent (NotificationMenuModalView.kt:82)");
            }
            int i3 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            M.K(-2024906204);
            rrv0.d(null, null, null, null, kai.c(1301092132, new l8c(this, ce70Var, izsVar, 6), M), M, 24576, 15);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h06(i, 5, this, ce70Var, izsVar);
        }
    }
}
