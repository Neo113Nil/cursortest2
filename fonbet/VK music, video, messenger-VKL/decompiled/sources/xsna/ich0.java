package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipAlreadyAttachedDialogState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.idh0;
import xsna.q630;
import xsna.t44;

/* compiled from: Screen.kt */
/* loaded from: classes7.dex */
public final class ich0 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final sgi0<Integer> b;

    /* compiled from: Screen.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.ScreenKt$HandlePagination$1$1", f = "Screen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<t44.f, s3q0> $onAction;
        final /* synthetic */ boolean $paginationTrigger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spj spjVar, izs izsVar, boolean z) {
            super(2, spjVar);
            this.$paginationTrigger = z;
            this.$onAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(spjVar, this.$onAction, this.$paginationTrigger);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.$paginationTrigger) {
                this.$onAction.invoke(t44.f.b);
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ich0.class, "listItemPosition", "getListItemPosition(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        fpf0.a.getClass();
        a = new qcy[]{mutablePropertyReference1Impl};
        b = new sgi0<>("ListItemPosition");
    }

    public static final void a(idh0.a aVar, izs<? super t44.b, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-1711376709);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1711376709, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.BottomBar (Screen.kt:271)");
            }
            long j = wlb0.h(M).getBackground().g;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            q630.a aVar5 = q630.a.a;
            q630 m = hr80.m(aVar5, j, aVar4);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 12;
            yqv0.c(d370.N(R.string.attached_clips_info, 0, M), s200.H(txj0.f(aVar5, 1.0f), f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 0, 0, 8120);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new yt7(izsVar, 9);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            q630 E = s200.E(aVar5, 16, f);
            boolean z2 = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new xka0(aVar, 8);
                M.R(x2);
            }
            q630 E2 = ahn.E(txj0.f(com.vk.core.compose.component.semantics.b.b(E, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3)), 1.0f), "AttachedClipsScreenTags.BUTTON_ATTACH");
            String N = d370.N(R.string.attached_clips_button_save, 0, M);
            int i3 = aVar.d;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, E2, null, false, false, null, null, null, N, i3 > 0 ? Integer.valueOf(i3) : null, null, null, null, aVar.e, null, null, null, M, X2.b.f, 0, 0, 4050912);
            aVar3 = M;
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new og4(aVar, izsVar, i, 6);
        }
    }

    public static final void b(ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState, izs<? super t44.d, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2068454375);
        int i2 = (M.J(clipAlreadyAttachedDialogState) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2068454375, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.ClipAlreadyAttachedDialog (Screen.kt:332)");
            }
            String N = d370.N(R.string.attached_clips_clip_already_attached_dialog_title, 0, M);
            String N2 = d370.N(R.string.attached_clips_clip_already_attached_dialog_message, 0, M);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new l77(izsVar, 2);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            String N3 = d370.N(R.string.attached_clips_clip_already_attached_dialog_button_attach, 0, M);
            boolean z2 = ((i2 & 14) == 4) | (i3 == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new hc1(22, izsVar, clipAlreadyAttachedDialogState);
                M.R(x2);
            }
            Alert$Button.Style style = Alert$Button.Style.Neutral;
            Alert$Button alert$Button = new Alert$Button(N3, (gzs) x2, style, null);
            String N4 = d370.N(R.string.attached_clips_clip_already_attached_dialog_button_cancel, 0, M);
            boolean z3 = i3 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new z87(izsVar, 10);
                M.R(x3);
            }
            p7u0.c(0, 368, M, alert$Button, new Alert$Button(N4, (gzs) x3, style, null), null, null, N, N2, null, izsVar2, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new au7(clipAlreadyAttachedDialogState, izsVar, i, 9);
        }
    }

    public static final void c(izs<? super t44.e, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1235121300);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1235121300, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.ClipHasCoauthorsDialog (Screen.kt:359)");
            }
            String N = d370.N(R.string.attached_clips_clip_has_coauthors_title, 0, M);
            String N2 = d370.N(R.string.attached_clips_clip_has_coauthors_message, 0, M);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new uq0(izsVar, 2);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            String N3 = d370.N(R.string.attached_clips_clip_has_coauthors_button_cancel, 0, M);
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b97(izsVar, 8);
                M.R(x2);
            }
            p7u0.c(0, 496, M, new Alert$Button(N3, (gzs) x2, Alert$Button.Style.Neutral, null), null, null, null, N, N2, null, izsVar2, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new eg70(i, 1, izsVar);
        }
    }

    public static final void d(idh0.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(512981247);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(512981247, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.ClipsGrid (Screen.kt:204)");
            }
            dsy a2 = gsy.a(0, 3, M);
            jdj0 b2 = ckv0.b(null, M, 1);
            efu.b bVar = new efu.b(3);
            q630 E = ahn.E(skn0.b(q630Var, s3q0.a, t630.a), "AttachedClipsScreenTags.LIST");
            float f = 4;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            a.j g2 = androidx.compose.foundation.layout.a.g(f);
            boolean y = ((i2 & 14) == 4) | ((i2 & 112) == 32) | M.y(b2);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new pps(aVar, izsVar, b2, 3);
                M.R(x);
            }
            uqy.b(bVar, E, a2, null, g, g2, null, false, null, (izs) x, M, 1769472, 0, 920);
            aVar3 = M;
            g(a2, aVar, izsVar, aVar3, (i2 << 3) & 1008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new xce(i, 6, aVar, izsVar, q630Var);
        }
    }

    public static final void e(idh0.a aVar, izs<? super t44, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-260634216);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-260634216, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Dialogs (Screen.kt:311)");
            }
            if (aVar.f != null) {
                M.K(-1361372591);
                b(aVar.f, izsVar, M, i2 & 112);
                M.j();
            } else if (aVar.g) {
                M.K(-1361367238);
                c(izsVar, M, (i2 >> 3) & 14);
                M.j();
            } else {
                if (aVar.h) {
                    M.K(-1361363755);
                    f(izsVar, M, (i2 >> 3) & 14);
                } else {
                    M.K(736154314);
                }
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
            s.d = new iq8(aVar, izsVar, i, 6);
        }
    }

    public static final void f(izs<? super t44.g, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1004981528);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1004981528, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.ExitConfirmDialog (Screen.kt:375)");
            }
            String N = d370.N(R.string.attached_clips_exit_confirm_dialog_title, 0, M);
            String N2 = d370.N(R.string.attached_clips_exit_confirm_dialog_message, 0, M);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new zq0(izsVar, 5);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            String N3 = d370.N(R.string.attached_clips_exit_confirm_dialog_button_exit, 0, M);
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new nxu(izsVar, 4);
                M.R(x2);
            }
            Alert$Button alert$Button = new Alert$Button(N3, (gzs) x2, Alert$Button.Style.Negative, null);
            String N4 = d370.N(R.string.attached_clips_exit_confirm_dialog_button_cancel, 0, M);
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new zc4(izsVar, 6);
                M.R(x3);
            }
            p7u0.c(100663296, 112, M, alert$Button, new Alert$Button(N4, (gzs) x3, Alert$Button.Style.Neutral, null), null, null, N, N2, new xim(false, 5), izsVar2, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new clk(izsVar, i, 2);
        }
    }

    public static final void g(dsy dsyVar, idh0.a aVar, izs<? super t44.f, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(1934011642);
        if ((i & 6) == 0) {
            i2 = (M.J(dsyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1934011642, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.HandlePagination (Screen.kt:401)");
            }
            boolean l = M.l(aVar.c);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (l || x == c0012a) {
                x = !aVar.c ? bbk0.b(new myd0(dsyVar, 7)) : null;
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            boolean booleanValue = mtk0Var != null ? ((Boolean) mtk0Var.getValue()).booleanValue() : false;
            Boolean valueOf = Boolean.valueOf(booleanValue);
            boolean l2 = M.l(booleanValue) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (l2 || x2 == c0012a) {
                x2 = new a(null, izsVar, booleanValue);
                M.R(x2);
            }
            bap.g(valueOf, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bg4(i, 5, dsyVar, aVar, izsVar);
        }
    }

    public static final void h(idh0.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        jai jaiVar;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(-1056394473);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1056394473, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Loaded (Screen.kt:122)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
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
            k9q0.w(M, c, dVar);
            q630.a aVar5 = q630.a.a;
            q630 d2 = txj0.d(aVar5, 1.0f);
            jai c2 = kai.c(1508378008, new dd4(izsVar, 10), M);
            jai c3 = kai.c(-675897929, new ed4(8, aVar, izsVar), M);
            jai c4 = kai.c(1434793430, new hy7(aVar, izsVar), M);
            if (androidx.compose.runtime.b.d()) {
                jaiVar = c4;
                q630Var2 = d2;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                jaiVar = c4;
                q630Var2 = d2;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(q630Var2, c2, c3, jaiVar, null, 0, ylu0Var.getBackground().g, 0L, kai.c(573809197, new nd00(aVar, izsVar), M), M, 805309878, 368);
            aVar3 = M;
            if (aVar.i) {
                aVar3.K(-275208420);
                Object x = aVar3.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(aVar3);
                }
                sg50 sg50Var = (sg50) x;
                Object x2 = aVar3.x();
                if (x2 == c0012a) {
                    x2 = new qbe0(5);
                    aVar3.R(x2);
                }
                q630 d3 = txj0.d(ojc.b(aVar5, sg50Var, null, false, null, (gzs) x2, 28), 1.0f);
                cp10 d4 = ja8.d(dt1.a.f, false);
                int hashCode2 = Long.hashCode(n34.n(aVar3));
                sy90 D2 = aVar3.D();
                q630 c5 = qri.c(aVar3, d3);
                if (aVar3.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar3.H();
                if (aVar3.L()) {
                    aVar3.I(aVar4);
                } else {
                    aVar3.f();
                }
                k9q0.w(aVar3, d4, cVar);
                k9q0.w(aVar3, D2, eVar);
                ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                k9q0.w(aVar3, c5, dVar);
                zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, aVar3, 6, 510);
                aVar3 = aVar3;
                aVar3.G();
            } else {
                aVar3.K(-281986415);
            }
            aVar3.j();
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new h7g(i, 4, (Object) aVar, izsVar, q630Var);
        }
    }

    public static final void i(izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1499906689);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1499906689, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Loading (Screen.kt:93)");
            }
            q630 d = txj0.d(aVar2, 1.0f);
            jai c = kai.c(-1815153722, new hd4(izsVar, 6), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(d, c, null, null, null, 0, ylu0Var.getBackground().g, 0L, ski.a, M, 805306416, 380);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ech0(izsVar, i);
        }
    }

    public static final void j(idh0 idh0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-412870753);
        if ((i & 6) == 0) {
            i2 = (M.J(idh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-412870753, i3, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Screen (Screen.kt:74)");
            }
            boolean z = idh0Var instanceof idh0.b;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(-1631796045);
                i(izsVar, M, (i3 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            } else {
                if (!(idh0Var instanceof idh0.a)) {
                    throw alb0.c(-1631797446, M);
                }
                M.K(-1631792089);
                h((idh0.a) idh0Var, izsVar, aVar2, M, i3 & 1008);
                M.j();
            }
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
            s.d = new mte(i, 3, (Object) idh0Var, izsVar, q630Var2);
        }
    }

    public static final void k(izs<? super t44.j, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1967577031);
        int i2 = i | (M.y(izsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1967577031, i2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Toolbar (Screen.kt:250)");
            }
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.attached_clips_toolbar_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.attached_clips_toolbar_icon_back_talkback, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new n9w(21);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new yd1(izsVar, 8);
                M.R(x2);
            }
            muv0.h(a2, null, null, null, e.a.a((gzs) x2, N, null, null, a3, M, 196608, 12), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8174);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new be1(izsVar, i);
        }
    }
}
