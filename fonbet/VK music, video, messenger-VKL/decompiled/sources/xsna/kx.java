package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ry;
import xsna.xu;

/* compiled from: ActionButtonsContentView.kt */
/* loaded from: classes4.dex */
public final class kx extends i6v0<oy, nw> {

    /* compiled from: ActionButtonsContentView.kt */
    public static final class a implements Cell$Middle.d {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
        public final void c(q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-308640406);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.o(size.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-308640406, i2, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.HighlightedTitle.Content (ActionButtonsContentView.kt:305)");
                }
                d8v0.a(new Pair(0, Integer.valueOf(this.a.length())), q630Var, null, null, this.b, false, true, null, kai.c(-2017583058, new ix(0, this, size), M), M, ((i2 << 3) & 112) | 806879232, 428);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new jx(this, q630Var, size, i);
            }
        }
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        m((oy) ao50Var, izsVar, aVar, 512);
    }

    public final void h(xu.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        boolean z;
        ActionButton actionButton;
        com.vk.core.compose.component.cell.content.x xVar;
        androidx.compose.runtime.a M = aVar2.M(124405729);
        int i3 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(this) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(124405729, i3, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.ActionItem (ActionButtonsContentView.kt:226)");
            }
            M.K(-705171988);
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            int i6 = ((i3 >> 3) & 896) | (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-782849397, i6, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.RightActionIcon (ActionButtonsContentView.kt:254)");
            }
            boolean z2 = aVar.c;
            ActionButton actionButton2 = aVar.b;
            ActionButton.Type type = actionButton2.f;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 && type == ActionButton.Type.VkTicket) {
                M.K(-193688319);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1589335940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel20> (VkSdkIcons.kt:216)");
                }
                lg90 b = or.b(M, -187349011, R.drawable.vk_icon_cancel_20, M, 0);
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
                long j = ylu0Var.getIcon().n;
                String N = d370.N(R.string.action_button_accessibility_selected, 0, M);
                boolean z3 = (((i6 & 112) ^ 48) > 32 && M.J(izsVar)) || (i6 & 48) == 32;
                Object x = M.x();
                if (z3 || x == c0012a) {
                    x = new dx(izsVar, 0);
                    M.R(x);
                }
                actionButton = actionButton2;
                i2 = i5;
                z = false;
                xVar = com.vk.core.compose.component.cell.content.p.a(b, j, 0L, N, (gzs) x, null, M, 1572872, 36);
                M.j();
            } else {
                i2 = i5;
                z = false;
                actionButton = actionButton2;
                if (z2 && type != ActionButton.Type.VkTicket) {
                    M.K(-193227101);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_check_circle_on_24, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    xVar = com.vk.core.compose.component.cell.content.p.a(a2, ylu0Var2.getIcon().b, 0L, d370.N(R.string.action_button_accessibility_selected, 0, M), null, null, M, 1572872, 52);
                    M.j();
                } else if (z2 || type != ActionButton.Type.VkTicket) {
                    M.K(-192508398);
                    M.j();
                    xVar = null;
                } else {
                    M.K(-192828255);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1231053620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronCompactRight24> (VkSdkIcons.kt:416)");
                    }
                    lg90 a3 = pg90.a(R.drawable.vk_icon_chevron_compact_right_24, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    xVar = com.vk.core.compose.component.cell.content.p.a(a3, ylu0Var3.getIcon().n, 0L, d370.N(R.string.action_button_accessibility_selected, 0, M), null, null, M, 1572872, 52);
                    M.j();
                }
            }
            com.vk.core.compose.component.cell.content.x xVar2 = xVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(new a(actionButton.d, aVar.e), Cell$Middle.c.b.b(aVar.d, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28);
            boolean z4 = (i4 == 4 ? true : z) | (i2 == 32 ? true : z);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new pw(0, izsVar, aVar);
                M.R(x2);
            }
            q630 j2 = txj0.j(58, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ojc.c(q630Var, false, null, null, (gzs) x2, 15));
            boolean z5 = i4 == 4 ? true : z;
            Object x3 = M.x();
            if (z5 || x3 == c0012a) {
                x3 = new com.vk.movika.sdk.base.hooks.p(aVar, 1);
                M.R(x3);
            }
            wiu0.b(egi0.b(j2, true, (izs) x3), false, null, a4, xVar2, null, null, M, 384, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bx(this, aVar, izsVar, q630Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final ry ryVar, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1499345528);
        int i2 = i | (M.J(ryVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1499345528, i2, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.BottomBarContent (ActionButtonsContentView.kt:139)");
            }
            if (!(ryVar instanceof ry.b)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new wzs(ryVar, izsVar, q630Var, i) { // from class: xsna.vw
                        public final /* synthetic */ ry c;
                        public final /* synthetic */ izs d;
                        public final /* synthetic */ q630 e;

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(4481);
                            kx.this.i(this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            wh50 a2 = jk50.a(((ry.b) ryVar).b, M, 0, 3);
            boolean z = ((ActionButton) a2.getValue()) != null;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630.a aVar4 = q630.a.a;
            q630 m = hr80.m(aVar4, j, aVar3);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            iec0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, M, txj0.f(aVar4, 1.0f));
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            String N = d370.N(R.string.done, 0, M);
            q630 E = ahn.E(s200.D(txj0.f(q630Var, 1.0f), 12), "PostingCreatePostButton");
            boolean J = M.J(a2) | ((i2 & 112) == 32);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new ww(0, izsVar, a2);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, z, null, null, null, aVar2, X2.b.f, 0, 0, 4059104);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new xw(i, 0, this, ryVar, izsVar, q630Var);
        }
    }

    public final void j(ry.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(122928049);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(122928049, i2, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.MainScreen (ActionButtonsContentView.kt:167)");
            }
            wh50 c = jk50.c(bVar.a, M);
            q630 f = txj0.f(q630Var, 1.0f);
            boolean J = ((i2 & 7168) == 2048 || M.y(this)) | M.J(c) | ((i2 & 112) == 32);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new rw(c, this, izsVar, 0);
                M.R(x);
            }
            x1v0.a(f, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sw(this, bVar, izsVar, q630Var, i);
        }
    }

    public final void k(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(233243855);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(233243855, i2, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.SectionDivider (ActionButtonsContentView.kt:328)");
            }
            iec0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2 & 14, M, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cx(this, q630Var, i, 0);
        }
    }

    public final void l(xu.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        String f;
        androidx.compose.runtime.a M = aVar.M(638225467);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(638225467, i2, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.SectionTitle (ActionButtonsContentView.kt:287)");
            }
            Integer num = bVar.b;
            if (num == null) {
                M.K(-445147668);
                M.j();
                f = null;
            } else {
                f = l4.f(M, -445147667, num, M, 0);
            }
            if (f == null) {
                f = "";
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().r;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(f, q630Var, j, null, null, 0, 0, null, 2, false, 0, 1, null, wuv0Var.d0, aVar2, (i2 & 112) | 100663296, 48, 5880);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new m2(this, bVar, q630Var, i, 1);
        }
    }

    public final void m(oy oyVar, izs<? super nw, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1527849112);
        int i2 = i | (M.J(oyVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1527849112, i2, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.ThemedContent (ActionButtonsContentView.kt:64)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1359473, new ex(this, oyVar, izsVar, 0), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fx(i, 0, this, oyVar, izsVar);
        }
    }

    public final void n(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(940647000);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(940647000, i2, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.TopBarContent (ActionButtonsContentView.kt:105)");
            }
            String N = d370.N(R.string.previous_step_talkback_title, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N2 = d370.N(R.string.previous_step_talkback_title, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            boolean J = M.J(N);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new yw(N, 0);
                M.R(x);
            }
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, N2, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2), M, 1572872 | ((i2 << 6) & 896), 24);
            String N3 = d370.N(R.string.action_button_title_default, 0, M);
            TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(d370.N(R.string.action_button_title_default, 0, M), null, null, null, null, M, 196608, 30);
            boolean J2 = M.J(N3);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new zw(N3, 0);
                M.R(x2);
            }
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(a3, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), M, 6);
            q630.a aVar2 = q630.a.a;
            muv0.h(a4, aVar2, null, null, null, a2, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 1572912, 0, 8092);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ax(i, 0, this, gzsVar, q630Var2);
        }
    }
}
