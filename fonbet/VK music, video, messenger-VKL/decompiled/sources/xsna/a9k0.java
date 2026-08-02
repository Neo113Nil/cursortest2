package xsna;

import android.content.Context;
import android.util.Size;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.f7k0;
import xsna.ikv0;
import xsna.kpv;
import xsna.phw;
import xsna.q630;

/* compiled from: SnackbarScreenContent.kt */
/* loaded from: classes18.dex */
public final class a9k0 implements yah0 {
    public final wh50 b = androidx.compose.runtime.k.b("None");
    public final Object c;
    public final wh50 d;
    public final Object e;
    public final wh50 f;
    public final Object g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;

    public a9k0() {
        Pair pair = new Pair("None", null);
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent);
        float f = 28;
        this.c = pn00.k(pair, new Pair("Icon", new ikv0.e.b(R.drawable.vk_icon_camera_28, valueOf, new Size(iah0.a(f), iah0.a(f)), (izs) null, 24)), new Pair("Button", new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "Button", new wx30(11))));
        this.d = androidx.compose.runtime.k.b("None");
        float f2 = 24;
        this.e = pn00.k(new Pair("None", null), new Pair("Icon", new ikv0.c.C3058c(R.drawable.vk_icon_camera_28, valueOf, new Size(iah0.a(f2), iah0.a(f2)), 8)), new Pair("Error", ikv0.c.b.a), new Pair("Success", ikv0.c.f.a), new Pair("Avatar", new ikv0.c.a(new c.d("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", null))), new Pair("Image", new ikv0.c.e(new c.d("https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg", null), null, null, 14)), new Pair("Image&Badge", new ikv0.c.e(new c.d("https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg", null), new ikv0.c.e.a(), null, 12)), new Pair("Loading", ikv0.c.d.a));
        this.f = androidx.compose.runtime.k.b("Title");
        this.g = pn00.k(new Pair("Title", new ikv0.d(new ikv0.d.c("Title"), (ikv0.d.b) null, (ikv0.d.a) null, 6)), new Pair("Subtitle", new ikv0.d(new ikv0.d.c("Title"), new ikv0.d.b("Subtitle"), (ikv0.d.a) null, 4)), new Pair("Button", new ikv0.d(new ikv0.d.c("Title"), new ikv0.d.b("Subtitle"), new ikv0.d.a("Button", null, new dl70(14), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE))));
        this.h = androidx.compose.runtime.k.b(Boolean.TRUE);
        this.i = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.j = androidx.compose.runtime.k.b(null);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        lg90 c;
        LayoutNode.a aVar2;
        final ikv0.e eVar;
        final a9k0 a9k0Var;
        int i3;
        cri.a.c cVar;
        final ikv0.c cVar2;
        cri.a.b bVar;
        final dlv0 dlv0Var;
        ikv0.d dVar;
        androidx.compose.runtime.a M = aVar.M(-1261784727);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i4 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i4 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1261784727, i2, -1, "com.vk.design.demo.presentation.screens.SnackbarScreenContent.Content (SnackbarScreenContent.kt:97)");
            }
            q630 d = txj0.d(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
            cri.h7.getClass();
            int i5 = i2;
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar3 = cri.a.f;
            k9q0.w(M, a, cVar3);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c2, dVar2);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Snackbar", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a3 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar, null, null, null, M, 1572872 | ((i5 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(-121282485);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(-121281652);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a4 = d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, M, 1572872 | ((i5 << 3) & 896), 58);
            M.K(535513071);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a2, null, null, null, null, a3, d.a.a(a4, d.b.a.C0757a.a(q, null, x5Var, null, null, null, M, 12582920 | (i5 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, M, 24576, 12), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            djn0.a(true, true, M, 438, 0);
            int i6 = (i5 >> 15) & 14;
            d(i6, M);
            final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            final yvj yvjVar = (yvj) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = yq.f(M);
            }
            dlv0 dlv0Var2 = (dlv0) x2;
            final ikv0.d dVar3 = (ikv0.d) this.g.get((String) ((zak0) this.f).getValue());
            ikv0.e eVar3 = (ikv0.e) this.c.get((String) ((zak0) this.b).getValue());
            ikv0.c cVar4 = (ikv0.c) this.e.get((String) ((zak0) this.d).getValue());
            gcv gcvVar = new gcv(dt1.a.o);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Outline;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int i7 = i5 & 458752;
            boolean y = (i7 == 131072) | M.y(yvjVar) | M.y(context) | M.y(eVar3) | M.y(cVar4) | M.y(dVar3);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                aVar2 = aVar4;
                eVar = eVar3;
                a9k0Var = this;
                i3 = i5;
                cVar = cVar3;
                cVar2 = cVar4;
                bVar = bVar2;
                dlv0Var = dlv0Var2;
                x3 = new gzs() { // from class: xsna.x8k0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        a9k0 a9k0Var2 = a9k0.this;
                        if (a9k0Var2.f()) {
                            myc0.h(yvjVar, null, null, new z8k0(dlv0Var, a9k0Var2, null), 3);
                        } else {
                            ikv0.a aVar5 = new ikv0.a(context);
                            ikv0.e eVar4 = eVar;
                            if (eVar4 != null) {
                                aVar5.s = eVar4;
                            }
                            ikv0.c cVar5 = cVar2;
                            if (cVar5 != null) {
                                aVar5.t = cVar5;
                            }
                            ikv0.d dVar4 = dVar3;
                            if (dVar4 != null) {
                                aVar5.u = dVar4;
                            }
                            if (((Boolean) ((zak0) a9k0Var2.i).getValue()).booleanValue()) {
                                aVar5.e = -1L;
                            }
                            aVar5.n();
                        }
                        return s3q0.a;
                    }
                };
                dVar = dVar3;
                M.R(x3);
            } else {
                aVar2 = aVar4;
                eVar = eVar3;
                a9k0Var = this;
                i3 = i5;
                dVar = dVar3;
                cVar = cVar3;
                bVar = bVar2;
                dlv0Var = dlv0Var2;
                cVar2 = cVar4;
            }
            cri.a.b bVar3 = bVar;
            cri.a.c cVar5 = cVar;
            LayoutNode.a aVar5 = aVar2;
            ikv0.e eVar4 = eVar;
            dlv0 dlv0Var3 = dlv0Var;
            ikv0.d dVar4 = dVar;
            bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance, gcvVar, null, false, false, null, null, null, "Show", null, null, null, null, false, null, null, null, M, X2.b.f, 384, 0, 4190176);
            M = M;
            rv5 c3 = lv5.c(M);
            q630 f = txj0.f(q9g.a(aVar3, 1.0f), 1.0f);
            cp10 d2 = ja8.d(dt1.a.i, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, f);
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
            k9q0.w(M, d2, cVar5);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar3, M, c2678a);
            k9q0.w(M, c4, dVar2);
            if (a9k0Var.f()) {
                M.K(1738519055);
                q630 a5 = ra8.a.a(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 b = lv5.b(a5, c3, ylu0Var.getBackground().a, 2);
                cp10 d3 = ja8.d(dt1.a.b, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c5 = qri.c(M, b);
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
                k9q0.w(M, d3, cVar5);
                k9q0.w(M, D3, eVar2);
                ur.d(hashCode3, M, bVar3, M, c2678a);
                k9q0.w(M, c5, dVar2);
                a9k0Var.b(i6, M);
                M.G();
                M.j();
            } else {
                M.K(1738909066);
                a9k0Var.e(((i3 >> 12) & 112) | 6, M);
                M.j();
            }
            a9k0Var.c(dlv0Var3, dVar4, c3, cVar2, eVar4, M, 70 | i7);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.y8k0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a9k0.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-554312293);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-554312293, i, -1, "com.vk.design.demo.presentation.screens.SnackbarScreenContent.ComposeImage (SnackbarScreenContent.kt:193)");
            }
            r0v0.a(fwu0.l("https://upload.wikimedia.org/wikipedia/commons/5/58/Shiba_inu_taiki.jpg", null, null, null, M, 6, 62), s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jma(this, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(dlv0 dlv0Var, ikv0.d dVar, rv5 rv5Var, ikv0.c cVar, ikv0.e eVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        rv5 rv5Var2;
        tl20 a;
        a.C0011a.C0012a c0012a;
        q630 q630Var;
        int i3;
        String str;
        akg0 akg0Var;
        int i4;
        e7k0 e7k0Var;
        int i5;
        Object a2;
        phw phwVar;
        List list;
        wep wepVar;
        tgp tgpVar;
        PictureRadius pictureRadius;
        int i6;
        int i7;
        tgp tgpVar2;
        wep wepVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        long j;
        lg90 lg90Var;
        akg0 akg0Var2;
        int i12;
        lg90 lg90Var2;
        ikv0.d.b d;
        ikv0.d.c a3;
        androidx.compose.runtime.a M = aVar.M(-716024055);
        if ((i & 6) == 0) {
            i2 = (M.J(dlv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(dVar) : M.y(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            rv5Var2 = rv5Var;
            i2 |= M.J(rv5Var2) ? 256 : 128;
        } else {
            rv5Var2 = rv5Var;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(cVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(eVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-716024055, i2, -1, "com.vk.design.demo.presentation.screens.SnackbarScreenContent.ComposeSnackbar (SnackbarScreenContent.kt:285)");
            }
            q630 D = s200.D(q630.a.a, ((azl) M.r(uvi.h)).j1(iah0.a(8)));
            String str2 = (dVar == null || (a3 = dVar.a()) == null) ? null : a3.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (dVar == null || (d = dVar.b.d()) == null) ? null : d.a;
            ikv0.d.a d2 = dVar != null ? dVar.c.d() : null;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (d2 == null) {
                M.K(2030500308);
                M.j();
                a = null;
            } else {
                M.K(2030500309);
                String str4 = d2.a;
                Object x = M.x();
                if (x == c0012a2) {
                    x = new jo60(10);
                    M.R(x);
                }
                a = f7k0.a.a(str4, (gzs) x, M, 48);
                M.j();
            }
            wl20 m = wlb0.m(str2, str3, a, M, 0);
            if (epx.f(cVar, ikv0.c.b.a)) {
                M.K(2030672917);
                e7k0 g = jvi.g(M);
                M.j();
                q630Var = D;
                i3 = i2;
                c0012a = c0012a2;
                e7k0Var = g;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i4 = -1;
                akg0Var = null;
            } else if (epx.f(cVar, ikv0.c.f.a)) {
                M.K(2030769203);
                if (androidx.compose.runtime.b.d()) {
                    i8 = -1;
                    androidx.compose.runtime.b.f(-1728836925, 48, -1, "com.vk.core.compose.component.snackbar.SnackbarContent.Left.Success.Companion.invoke (SnackbarContent.kt:116)");
                } else {
                    i8 = -1;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1882784490, 6, i8, "com.vk.core.compose.component.snackbar.remember (IconImpl.kt:108)");
                }
                w65.k().getClass();
                M.K(-1796684276);
                if (androidx.compose.runtime.b.d()) {
                    i9 = 0;
                    androidx.compose.runtime.b.f(-1796684276, 0, i8, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSnackbarDefaults.successIcon (MilkshakeSnackbarDefaults.kt:42)");
                } else {
                    i9 = 0;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(316178300, i9, i8, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline28> (VkSdkIcons.kt:364)");
                }
                lg90 b = or.b(M, 404637919, R.drawable.vk_icon_check_circle_outline_28, M, i9);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                w65.k().getClass();
                M.K(-1928539185);
                if (androidx.compose.runtime.b.d()) {
                    i10 = 0;
                    i11 = -1;
                    androidx.compose.runtime.b.f(-1928539185, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSnackbarDefaults.successIconTint (MilkshakeSnackbarDefaults.kt:35)");
                } else {
                    i10 = 0;
                    i11 = -1;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i10, i11, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var.getIcon().i;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                Object x2 = M.x();
                if (x2 == c0012a2) {
                    float f = 28;
                    x2 = new mqv(b, j2, byc0.b(f, f), 0);
                    lg90Var = b;
                    j = j2;
                    M.R(x2);
                } else {
                    j = j2;
                    lg90Var = b;
                }
                mqv mqvVar = (mqv) x2;
                ((zak0) mqvVar.a).setValue(lg90Var);
                mqvVar.b(j);
                ((zak0) mqvVar.f).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                q630Var = D;
                i3 = i2;
                c0012a = c0012a2;
                e7k0Var = mqvVar;
                akg0Var = null;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i4 = -1;
            } else {
                boolean z = cVar instanceof ikv0.c.a;
                tgp tgpVar3 = tgp.a;
                wep wepVar3 = wep.a;
                if (z) {
                    M.K(2030874603);
                    q630Var = D;
                    i3 = i2;
                    str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    phw a4 = phw.a.a(fwu0.l(((ikv0.c.a) cVar).a.a, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30);
                    M = M;
                    rep repVar = rep.a;
                    if (androidx.compose.runtime.b.d()) {
                        i7 = -1;
                        androidx.compose.runtime.b.f(-400273379, 1572864, -1, "com.vk.core.compose.component.snackbar.SnackbarContent.Left.Avatar.Companion.invoke (SnackbarContent.kt:137)");
                    } else {
                        i7 = -1;
                    }
                    List singletonList = Collections.singletonList(repVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1072823011, 6, i7, "com.vk.core.compose.component.snackbar.remember (LeftAvatarImpl.kt:88)");
                    }
                    Object x3 = M.x();
                    c0012a = c0012a2;
                    if (x3 == c0012a) {
                        tgpVar2 = tgpVar3;
                        wepVar2 = wepVar3;
                        x3 = new mzy(a4, singletonList, wepVar2, tgpVar2);
                        M.R(x3);
                    } else {
                        tgpVar2 = tgpVar3;
                        wepVar2 = wepVar3;
                    }
                    mzy mzyVar = (mzy) x3;
                    ((zak0) mzyVar.a).setValue(a4);
                    ((zak0) mzyVar.b).setValue(new wow(singletonList));
                    ((zak0) mzyVar.c).setValue(wepVar2);
                    ((zak0) mzyVar.d).setValue(tgpVar2);
                    ((zak0) mzyVar.e).setValue(null);
                    ((zak0) mzyVar.f).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    e7k0Var = mzyVar;
                    i4 = i7;
                    akg0Var = null;
                } else {
                    c0012a = c0012a2;
                    q630Var = D;
                    i3 = i2;
                    str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    if (cVar instanceof ikv0.c.C3058c) {
                        M.K(2031138165);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            i6 = 0;
                            androidx.compose.runtime.b.f(1528580802, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Camera24> (VkIcons.kt:986)");
                        } else {
                            i6 = 0;
                        }
                        lg90 a5 = pg90.a(R.drawable.vk_icon_camera_24, i6, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i6, -1, str);
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        e7k0 z2 = s200.z(a5, ylu0Var2.getIcon().a, M);
                        M.j();
                        akg0Var = null;
                        i4 = -1;
                        e7k0Var = z2;
                    } else if (cVar instanceof ikv0.c.e) {
                        M.K(2031372339);
                        ikv0.c.e eVar2 = (ikv0.c.e) cVar;
                        i4 = -1;
                        phw a6 = phw.a.a(fwu0.l(eVar2.a.a, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30);
                        M = M;
                        if (eVar2.b == null) {
                            M.K(2031554866);
                            M.j();
                            a2 = null;
                        } else {
                            M.K(2031554867);
                            qzu0.a.getClass();
                            if (androidx.compose.runtime.b.d()) {
                                i5 = 0;
                                androidx.compose.runtime.b.f(-1917497182, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-StarCircleFillBlue16> (VkIcons.kt:10282)");
                            } else {
                                i5 = 0;
                            }
                            lg90 b2 = or.b(M, -1093331461, R.drawable.vk_icon_star_circle_fill_blue_16, M, i5);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            a2 = kpv.a.a(b2, l5g.k, 0L, null, false, null, null, M, 100663352, 252);
                            M = M;
                            M.j();
                        }
                        if (a2 == null) {
                            a2 = rep.a;
                        }
                        PictureRadius pictureRadius2 = PictureRadius.Medium;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(429216669, 12582912, -1, "com.vk.core.compose.component.snackbar.SnackbarContent.Left.Picture.Companion.invoke (SnackbarContent.kt:177)");
                        }
                        List singletonList2 = Collections.singletonList(a2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-705578169, 6, -1, "com.vk.core.compose.component.snackbar.remember (LeftPictureImpl.kt:94)");
                        }
                        Object x4 = M.x();
                        c0012a = c0012a;
                        if (x4 == c0012a) {
                            x4 = new zzy(a6, singletonList2, wepVar3, tgpVar3, pictureRadius2);
                            phwVar = a6;
                            list = singletonList2;
                            wepVar = wepVar3;
                            tgpVar = tgpVar3;
                            pictureRadius = pictureRadius2;
                            M.R(x4);
                        } else {
                            phwVar = a6;
                            list = singletonList2;
                            wepVar = wepVar3;
                            tgpVar = tgpVar3;
                            pictureRadius = pictureRadius2;
                        }
                        zzy zzyVar = (zzy) x4;
                        ((zak0) zzyVar.a).setValue(phwVar);
                        ((zak0) zzyVar.b).setValue(new wow(list));
                        ((zak0) zzyVar.c).setValue(wepVar);
                        ((zak0) zzyVar.d).setValue(tgpVar);
                        akg0Var = null;
                        ((zak0) zzyVar.f).setValue(null);
                        ((zak0) zzyVar.e).setValue(pictureRadius);
                        ((zak0) zzyVar.g).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        e7k0Var = zzyVar;
                    } else {
                        akg0Var = null;
                        i4 = -1;
                        if (epx.f(cVar, ikv0.c.d.a)) {
                            M.K(-904287502);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(316907780, 6, -1, "com.vk.core.compose.component.snackbar.SnackbarContent.Left.Loading.Companion.invoke (SnackbarContent.kt:211)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-768750517, 6, -1, "com.vk.core.compose.component.snackbar.remember (LeftLoadingImpl.kt:20)");
                            }
                            Object x5 = M.x();
                            if (x5 == c0012a) {
                                x5 = new vzy();
                                M.R(x5);
                            }
                            e7k0 e7k0Var2 = (vzy) x5;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            e7k0Var = e7k0Var2;
                        } else {
                            if (cVar != null) {
                                throw alb0.c(-904325734, M);
                            }
                            M.K(2031894317);
                            M.j();
                            e7k0Var = null;
                        }
                    }
                }
            }
            if (eVar instanceof ikv0.e.a) {
                M.K(-904281696);
                String str5 = ((ikv0.e.a) eVar).a;
                Object x6 = M.x();
                if (x6 == c0012a) {
                    x6 = new uv80(7);
                    M.R(x6);
                }
                androidx.compose.runtime.a aVar2 = M;
                akg0Var2 = xx1.q(48, 16380, aVar2, null, str5, (gzs) x6);
                M = aVar2;
                M.j();
            } else if (eVar instanceof ikv0.e.b) {
                M.K(-904279068);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    i12 = 0;
                    androidx.compose.runtime.b.f(76040258, 0, i4, "com.vk.core.compose.icons.generated.VkIcons.<get-Camera28> (VkIcons.kt:990)");
                } else {
                    i12 = 0;
                }
                lg90 b3 = or.b(M, 1867726442, R.drawable.vk_icon_camera_28, M, i12);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i12, i4, str);
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j3 = ylu0Var3.getIcon().a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(69681290, 1572872, i4, "com.vk.core.compose.component.snackbar.SnackbarContent.Right.Icon.Companion.invoke (SnackbarContent.kt:43)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-663761685, 70, i4, "com.vk.core.compose.component.snackbar.remember (IconImpl.kt:63)");
                }
                Object x7 = M.x();
                if (x7 == c0012a) {
                    x7 = new mqv(b3, j3, 9205357640488583168L, 0);
                    lg90Var2 = b3;
                    M.R(x7);
                } else {
                    lg90Var2 = b3;
                }
                mqv mqvVar2 = (mqv) x7;
                ((zak0) mqvVar2.a).setValue(lg90Var2);
                mqvVar2.b(j3);
                ((zak0) mqvVar2.d).setValue(new uco(9205357640488583168L));
                ((zak0) mqvVar2.e).setValue(akg0Var);
                ((zak0) mqvVar2.b).setValue(akg0Var);
                ((zak0) mqvVar2.f).setValue(akg0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                akg0Var2 = mqvVar2;
            } else {
                if (eVar != null) {
                    throw alb0.c(-904283519, M);
                }
                M.K(2032264084);
                M.j();
                akg0Var2 = akg0Var;
            }
            androidx.compose.runtime.a aVar3 = M;
            zkv0.c(dlv0Var, m, q630Var, e7k0Var, akg0Var2, rv5Var2, aVar3, (i3 & 14) | ((i3 << 9) & 458752), 64);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jig0(this, dlv0Var, dVar, rv5Var, cVar, eVar, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        if (r4 == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        if (r3 == r2) goto L54;
     */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(final int i, androidx.compose.runtime.a aVar) {
        int i2;
        a.C0011a.C0012a c0012a;
        a.C0011a.C0012a c0012a2;
        androidx.compose.runtime.a M = aVar.M(1638649210);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1638649210, i2, -1, "com.vk.design.demo.presentation.screens.SnackbarScreenContent.SnackbarSettings (SnackbarScreenContent.kt:235)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(gVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            tpg0 tpg0Var = tpg0.a;
            q630 b = tpg0Var.b(1.0f, aVar2, true);
            String str = (String) ((zak0) this.d).getValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (z || x == c0012a3) {
                x = new c230(this, 26);
                M.R(x);
            }
            y9i0.a("Left", this.e, str, (izs) x, b, M, 6, 0);
            q630 b2 = tpg0Var.b(1.0f, aVar2, true);
            String str2 = (String) ((zak0) this.f).getValue();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2) {
                c0012a = c0012a3;
            } else {
                c0012a = c0012a3;
            }
            x2 = new ksg0(this, 5);
            M.R(x2);
            a.C0011a.C0012a c0012a4 = c0012a;
            y9i0.a("Middle", this.g, str2, (izs) x2, b2, M, 6, 0);
            q630 b3 = tpg0Var.b(1.0f, aVar2, true);
            String str3 = (String) ((zak0) this.b).getValue();
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3) {
                c0012a2 = c0012a4;
            } else {
                c0012a2 = c0012a4;
            }
            x3 = new j5b0(this, 12);
            M.R(x3);
            y9i0.a("Right", this.c, str3, (izs) x3, b3, M, 6, 0);
            M.G();
            boolean f2 = f();
            boolean z4 = i3 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a2) {
                x4 = new tbe0(this, 10);
                M.R(x4);
            }
            eku0.d("Compose", (gzs) x4, null, f2, null, false, false, M, 6, 116);
            boolean booleanValue = ((Boolean) ((zak0) this.i).getValue()).booleanValue();
            boolean z5 = i3 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a2) {
                x5 = new irc0(this, 8);
                M.R(x5);
            }
            eku0.d("Show forever", (gzs) x5, null, booleanValue, null, false, false, M, 6, 116);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.w8k0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    a9k0.this.d(I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(19391843);
        int i3 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i3 == 0) {
            i2 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(19391843, i2, -1, "com.vk.design.demo.presentation.screens.SnackbarScreenContent.ViewImage (SnackbarScreenContent.kt:203)");
            }
            q630 a = ra8Var.a(q630.a.a);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new pb00(this, 27);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                x2 = new b8e0(this, 6);
                M.R(x2);
            }
            ae2.a(0, 0, M, izsVar, (izs) x2, a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l440(this, i, 1);
        }
    }

    public final boolean f() {
        return ((Boolean) ((zak0) this.h).getValue()).booleanValue();
    }
}
