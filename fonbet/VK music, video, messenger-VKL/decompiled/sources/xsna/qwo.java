package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.InterfaceC4413l1;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.easypromote.impl.domain.BudgetLevel;
import com.vk.ads.easypromote.impl.domain.model.DurationOption;
import com.vk.core.compose.component.datetime.EditingMode;
import com.vk.core.compose.component.datetime.l;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Date;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.fwo;
import xsna.q630;
import xsna.q8z;
import xsna.us2;

/* compiled from: EasyPromoteSettingsView.kt */
/* loaded from: classes14.dex */
public final class qwo extends i6v0<uwo, uvo> {

    /* compiled from: EasyPromoteSettingsView.kt */
    public static final class a implements i9z, g0t {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.i9z
        public final /* synthetic */ void a(q8z q8zVar) {
            this.b.invoke(q8zVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof i9z) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static us2 n(String str, izs izsVar, VkTypographyToken vkTypographyToken, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2093162776, i, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.buildSubtitleWithLink (EasyPromoteSettingsView.kt:364)");
        }
        aVar.K(1484740485);
        us2.b bVar = new us2.b();
        bVar.g(str);
        bVar.g(" ");
        aVar.K(1484743079);
        zqv0 zqv0Var = new zqv0(new klv0(vkTypographyToken, VkColorToken.TextLink), 14);
        a aVar2 = new a(izsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-822338567, 8, -1, "com.vk.core.compose.annotated.VkLinkAnnotation.Clickable.toLinkAnnotation (VkLinkAnnotation.kt:76)");
        }
        aVar.K(6625227);
        tjo0 a2 = zqv0Var.a(aVar);
        aVar.j();
        q8z.a aVar3 = new q8z.a("link_tag", a2, aVar2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        int l = bVar.l(aVar3);
        try {
            bVar.g(d370.N(R.string.easy_promote_settings_why, 0, aVar));
            s3q0 s3q0Var = s3q0.a;
            bVar.k(l);
            aVar.j();
            us2 n = bVar.n();
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return n;
        } catch (Throwable th) {
            bVar.k(l);
            throw th;
        }
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        l((uwo) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(fwo.b bVar, izs<? super uvo, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        Object obj;
        com.vk.core.compose.component.datetime.d dVar;
        androidx.compose.runtime.a M = aVar.M(1408729189);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1408729189, i2, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.ContentInner (EasyPromoteSettingsView.kt:138)");
            }
            wh50 c = jk50.c(bVar.a, M);
            wh50 c2 = jk50.c(bVar.b, M);
            wh50 c3 = jk50.c(bVar.c, M);
            wh50 c4 = jk50.c(bVar.d, M);
            q630.a aVar2 = q630.a.a;
            float f = 16;
            float f2 = 12;
            q630 G = s200.G(p490.D(txj0.d(aVar2, 1.0f), p490.x(M), 14), f, 48, f, f2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c5 = qri.c(M, G);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c5, cri.a.d);
            String O = d370.O(R.string.easy_promote_settings_budget_title, new Object[]{Integer.valueOf(((ul8) c.getValue()).d)}, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(O, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), ylu0Var.getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8120);
            float f3 = 8;
            f9t.e(txj0.h(aVar2, f3), M, 6);
            int i3 = ((ul8) c.getValue()).d;
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (z || x == obj2) {
                x = new qpd(izsVar, 1);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            int i5 = i2 & 896;
            int i6 = 512 | i5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-391514626, i6, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.buildBudgetSubtitle (EasyPromoteSettingsView.kt:347)");
            }
            M.K(1711576332);
            Iterator<E> it = BudgetLevel.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (i3 < ((BudgetLevel) obj).h()) {
                        break;
                    }
                }
            }
            BudgetLevel budgetLevel = (BudgetLevel) obj;
            if (budgetLevel == null) {
                budgetLevel = BudgetLevel.BEST;
            }
            us2 n = n(d370.N(budgetLevel.i(), 0, M), izsVar2, VkTypographyToken.Text, M, 4480 | ((i6 << 3) & 7168));
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.d(n, txj0.f(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 1.0f), wlb0.h(M).getText().p, 3, null, 0, false, 0, null, null, wlb0.l(M).T, M, 48, 0, 8120);
            f9t.e(txj0.h(aVar2, 24), M, 6);
            float f4 = ((ul8) c.getValue()).a;
            bwf<Float> bwfVar = ((ul8) c.getValue()).b;
            int i7 = ((ul8) c.getValue()).c;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == obj2) {
                x2 = new l9a(izsVar, 1);
                M.R(x2);
            }
            hkv0.c(f4, (izs) x2, F, false, null, bwfVar, i7, null, M, 384, InterfaceC4413l1.a.b.h);
            f9t.e(txj0.h(aVar2, f2), M, 6);
            jqu0.a(null, wlb0.h(M).p().b, (float) 0.5d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 384, 9);
            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.easy_promote_settings_duration_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510), kci.m(-16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), b.d.a, null, null, null, false, M, Tensorflow.FRAME_WIDTH, 120);
            k((ioo) c2.getValue(), izsVar, M, i4 | 512 | i5);
            k9x k9xVar = ((ymk) c4.getValue()).a;
            l.a aVar4 = com.vk.core.compose.component.datetime.l.a;
            Date date = ((ymk) c4.getValue()).b;
            aVar4.getClass();
            fai0 fai0Var = new fai0(date, null);
            Long l = ((ymk) c4.getValue()).c;
            com.vk.core.compose.component.datetime.d a3 = com.vk.core.compose.component.datetime.e.a(l != null ? new Date(l.longValue()) : null, null, k9xVar, fai0Var, M, 2);
            if (((ioo) c2.getValue()).a == DurationOption.CUSTOM) {
                M.K(125912255);
                f9t.e(txj0.h(aVar2, f2), M, 6);
                apu0.a(a3, txj0.f(aVar2, 1.0f), null, null, null, false, EditingMode.Picker, M, 100663344, 252);
                dVar = a3;
            } else {
                dVar = a3;
                M.K(117455207);
            }
            M.j();
            f9t.e(txj0.h(aVar2, f3), M, 6);
            String N = d370.N(R.string.easy_promote_settings_duration_subtitle, 0, M);
            boolean z3 = i4 == 32;
            Object x3 = M.x();
            if (z3 || x3 == obj2) {
                x3 = new owo(izsVar, 0);
                M.R(x3);
            }
            yqv0.d(n(N, (izs) x3, VkTypographyToken.Footnote, M, 4480 | ((i2 << 3) & 7168)), txj0.f(aVar2, 1.0f), wlb0.h(M).getText().p, 1, null, 0, false, 0, null, null, wlb0.l(M).i0, M, 48, 0, 8120);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            f9t.e(new xpy(1.0f, true), M, 0);
            String N2 = d370.N(R.string.easy_promote_settings_button_done, 0, M);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z4 = ((Boolean) c3.getValue()).booleanValue() || ((Date) dVar.g.getValue()) != null;
            q630 f5 = txj0.f(aVar2, 1.0f);
            boolean J = M.J(c2) | (i4 == 32) | M.J(c) | M.J(dVar);
            Object x4 = M.x();
            if (J || x4 == obj2) {
                Object qxVar = new qx(izsVar, dVar, c2, c, 1);
                M.R(qxVar);
                x4 = qxVar;
            }
            bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, f5, null, false, false, null, null, null, N2, null, null, null, null, z4, null, null, null, M, 28080, 0, 0, 4059104);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fn7(i, 5, this, bVar, izsVar);
        }
    }

    public final void i(fwo<?> fwoVar, izs<? super uvo, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1700251245);
        int i2 = (M.J(fwoVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1700251245, i2, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.MainContent (EasyPromoteSettingsView.kt:128)");
            }
            if (fwoVar instanceof fwo.b) {
                M.K(1853880075);
                h((fwo.b) fwoVar, izsVar, M, (i2 & 896) | (i2 & 112) | 512);
                M.j();
            } else {
                if (!(fwoVar instanceof fwo.a)) {
                    throw alb0.c(1853878377, M);
                }
                M.K(1853882397);
                f9t.e(q630.a.a, M, 6);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k71(i, 6, this, fwoVar, izsVar);
        }
    }

    public final void j(final DurationOption durationOption, final ioo iooVar, final boolean z, final String str, final izs<? super uvo, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        int i4;
        String str2;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1335553266);
        if ((i & 6) == 0) {
            i2 = (M.o(durationOption.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(iooVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1335553266, i2, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.RadioItem (EasyPromoteSettingsView.kt:280)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            int i6 = 57344 & i2;
            int i7 = i2 & 14;
            boolean z2 = (i6 == 16384) | (i7 == 4);
            Object x = M.x();
            int i8 = 12;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new tx(i8, (Object) durationOption, (izs) izsVar);
                M.R(x);
            }
            float f2 = 12;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, ojc.c(f, false, null, null, (gzs) x, 15));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            boolean z3 = iooVar.a == durationOption;
            boolean z4 = (i6 == 16384) | (i7 == 4);
            Object x2 = M.x();
            int i9 = 9;
            if (z4 || x2 == c0012a) {
                x2 = new uk(i9, izsVar, durationOption);
                M.R(x2);
            }
            int i10 = i2;
            afv0.a(z3, (gzs) x2, null, false, null, null, M, 0, 60);
            f9t.e(txj0.v(aVar2, f2), M, 6);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (durationOption != iooVar.a || durationOption == DurationOption.CUSTOM) {
                M.K(1976181783);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i3 = 1040687336;
                i4 = -1;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.T, M, (i10 >> 9) & 14, 0, 8186);
                M = M;
                M.j();
            } else {
                M.K(1975272181);
                M.K(-351922472);
                us2.b bVar2 = new us2.b();
                bVar2.g(str);
                M.K(-351919890);
                int m = bVar2.m(bkt0.c(new klv0(VkTypographyToken.Text, VkColorToken.TextSecondary), M));
                try {
                    bVar2.g(" — ");
                    bVar2.g(d370.N(R.string.easy_promote_settings_due_date_prefix, 0, M));
                    bVar2.g(" ");
                    bVar2.g(iooVar.b);
                    s3q0 s3q0Var = s3q0.a;
                    bVar2.k(m);
                    M.j();
                    us2 n = bVar2.n();
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        i5 = -1;
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        i5 = -1;
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var2.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, i5, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.d(n, null, j2, 0, null, 0, false, 0, null, null, wuv0Var2.T, M, 0, 0, 8186);
                    M = M;
                    M.j();
                    i4 = i5;
                    str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    i3 = 1040687336;
                } catch (Throwable th) {
                    bVar2.k(m);
                    throw th;
                }
            }
            if (z) {
                M.K(1976445438);
                f9t.e(txj0.h(aVar2, 2), M, 6);
                String N = d370.N(R.string.easy_promote_settings_recommended, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(i3, 0, i4, str2);
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j3 = ylu0Var3.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, i4, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar4 = M;
                yqv0.c(N, null, j3, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var3.i0, aVar4, 0, 0, 8186);
                M = aVar4;
            } else {
                M.K(1962420666);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pwo
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qwo.this.j(durationOption, iooVar, z, str, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void k(ioo iooVar, izs<? super uvo, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(182781079);
        int i2 = i | (M.J(iooVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(182781079, i2, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.RadioItems (EasyPromoteSettingsView.kt:233)");
            }
            DurationOption durationOption = DurationOption.DAYS_5;
            String F = d370.F(R.plurals.days, durationOption.i(), new Object[]{Integer.valueOf(durationOption.i())}, M, 48);
            int i3 = ((i2 << 3) & 112) | 390;
            int i4 = i2 << 9;
            int i5 = i3 | (57344 & i4) | SQLiteDatabase.OPEN_PRIVATECACHE | (i4 & 458752);
            j(durationOption, iooVar, false, F, izsVar, M, i5);
            DurationOption durationOption2 = DurationOption.DAYS_7;
            j(durationOption2, iooVar, true, d370.F(R.plurals.days, durationOption2.i(), new Object[]{Integer.valueOf(durationOption2.i())}, M, 48), izsVar, M, i5);
            DurationOption durationOption3 = DurationOption.DAYS_10;
            j(durationOption3, iooVar, false, d370.F(R.plurals.days, durationOption3.i(), new Object[]{Integer.valueOf(durationOption3.i())}, M, 48), izsVar, M, i5);
            j(DurationOption.CUSTOM, iooVar, false, d370.N(R.string.easy_promote_option_custom_date, 0, M), izsVar, M, i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k3o(i, 1, this, iooVar, izsVar);
        }
    }

    public final void l(uwo uwoVar, izs<? super uvo, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(569981365);
        int i2 = i | (M.J(uwoVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        int i3 = 0;
        int i4 = 1;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(569981365, i2, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.ThemedContent (EasyPromoteSettingsView.kt:80)");
            }
            wh50 d = d(fwo.a.a, new n0u0[]{uwoVar.a}, M, (i2 & 896) | 518);
            if (((fwo) d.getValue()) instanceof fwo.b) {
                M.K(-1985535837);
                q630 A = f9t.A(q630.a.a);
                jai c = kai.c(-312579196, new dr3(this, izsVar, d, i4), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                phv0.b(A, c, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(2142345881, new mwo(this, izsVar, d, i3), M), M, 805306416, 380);
                aVar2 = M;
            } else {
                aVar2 = M;
                aVar2.K(-1989527955);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nwo(i, 0, this, uwoVar, izsVar);
        }
    }

    public final void m(fwo<?> fwoVar, izs<? super uvo, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1155748601);
        int i2 = i | (M.J(fwoVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1155748601, i2, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.TopBar (EasyPromoteSettingsView.kt:100)");
            }
            boolean z = fwoVar instanceof fwo.a;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(1722130263);
                f9t.e(aVar2, M, 6);
                M.j();
            } else {
                if (!(fwoVar instanceof fwo.b)) {
                    throw alb0.c(1722129289, M);
                }
                M.K(1846514458);
                q630 f = txj0.f(aVar2, 1.0f);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.easy_promote_settings_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
                boolean z2 = (i2 & 112) == 32;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new vrc(izsVar, 1);
                    M.R(x);
                }
                muv0.h(a3, null, null, null, e.a.a((gzs) x, d370.N(R.string.vk_back, 0, M), null, null, null, M, 196608, 28), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8174);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                jqu0.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), ylu0Var.p().b, (float) 0.5d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 8);
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bto(i, 1, this, fwoVar, izsVar);
        }
    }
}
