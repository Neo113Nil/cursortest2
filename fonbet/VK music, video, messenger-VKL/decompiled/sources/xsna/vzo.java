package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.edit.presentation.model.OrdVS;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.k;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.d9k0;
import xsna.dt1;
import xsna.q630;
import xsna.r8d;

/* compiled from: EditContent.kt */
/* loaded from: classes17.dex */
public final class vzo {

    /* compiled from: EditContent.kt */
    @b6l(c = "com.vk.clips.viewer.edit.presentation.compose.EditContentKt$SnackbarStateHandler$1$1", f = "EditContent.kt", l = {196}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $message;
        final /* synthetic */ gzs<s3q0> $onDismiss;
        final /* synthetic */ dlv0 $snackBarHostState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, dlv0 dlv0Var, gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$message = str;
            this.$snackBarHostState = dlv0Var;
            this.$onDismiss = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$message, this.$snackBarHostState, this.$onDismiss, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                String str = this.$message;
                if (str != null) {
                    dlv0 dlv0Var = this.$snackBarHostState;
                    this.label = 1;
                    if (dlv0.d(dlv0Var, str, null, this, 30) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onDismiss.invoke();
            return s3q0.a;
        }
    }

    public static final void a(euc eucVar, izs<? super usc, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        boolean z;
        androidx.compose.runtime.a M = aVar.M(-1970423392);
        int i2 = (M.J(eucVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1970423392, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.Dialogs (EditContent.kt:207)");
            }
            r8d r8dVar = eucVar.j;
            boolean f = epx.f(r8dVar, r8d.a.a);
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (f) {
                M.K(-1565018553);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new z87(izsVar, 5);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                z = i3 == 32;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new tzo(izsVar, 0);
                    M.R(x2);
                }
                rmd.a(0, M, gzsVar, (gzs) x2, null);
                M.j();
            } else if (epx.f(r8dVar, r8d.b.a)) {
                M.K(-1564588645);
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new tq0(izsVar, 5);
                    M.R(x3);
                }
                gzs gzsVar2 = (gzs) x3;
                z = i4 == 32;
                Object x4 = M.x();
                if (z || x4 == c0012a) {
                    x4 = new a97(izsVar, 3);
                    M.R(x4);
                }
                dnf.a(0, M, gzsVar2, (gzs) x4, null);
                M.j();
            } else {
                if (r8dVar != null) {
                    throw alb0.c(503702604, M);
                }
                M.K(503731428);
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
            s.d = new yf4(eucVar, izsVar, i, 3);
        }
    }

    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String, java.lang.Throwable, xsna.tl20] */
    public static final void b(euc eucVar, izs<? super usc, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        q630.a aVar2;
        cri.a.C2678a c2678a;
        us2 us2Var;
        char c;
        ?? r3;
        int i2;
        q630.a aVar3;
        ra8 ra8Var;
        OrdVS ordVS = eucVar.g;
        ksc kscVar = eucVar.i;
        androidx.compose.runtime.a M = aVar.M(353343108);
        int i3 = i | (M.J(eucVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(353343108, i3, -1, "com.vk.clips.viewer.edit.presentation.compose.EditContent (EditContent.kt:59)");
            }
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, "clip_edit_container");
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            float f = 12;
            q630 d2 = rte0.d(aVar4, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                aVar2 = aVar4;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                aVar2 = aVar4;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d2, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a);
            ty6 ty6Var2 = dt1.a.i;
            ra8 ra8Var2 = ra8.a;
            q630 b = ra8Var2.b(m, ty6Var2);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a2);
            k9q0.w(M, c3, dVar);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new d97(izsVar, 1);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                c2678a = c2678a2;
                x2 = new cr0(izsVar, 4);
                M.R(x2);
            } else {
                c2678a = c2678a2;
            }
            d(gzsVar, (gzs) x2, M, 0);
            String str = eucVar.b;
            us2 e = ws2.e(eucVar.c);
            List list = eucVar.d;
            boolean z3 = i4 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                us2Var = e;
                x3 = new v67(izsVar, 3);
                M.R(x3);
            } else {
                us2Var = e;
            }
            gzs gzsVar2 = (gzs) x3;
            boolean z4 = i4 == 32;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new zc4(izsVar, 3);
                M.R(x4);
            }
            gzs gzsVar3 = (gzs) x4;
            boolean z5 = i4 == 32;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new uzo(izsVar, 0);
                M.R(x5);
            }
            q630.a aVar6 = aVar2;
            cri.a.C2678a c2678a3 = c2678a;
            iqc.a(str, us2Var, list, null, gzsVar2, gzsVar3, (izs) x5, M, 0);
            M = M;
            duc ducVar = eucVar.h;
            boolean z6 = i4 == 32;
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new fr0(izsVar, 1);
                M.R(x6);
            }
            gzs gzsVar4 = (gzs) x6;
            boolean z7 = i4 == 32;
            Object x7 = M.x();
            if (z7 || x7 == c0012a) {
                x7 = new i97(izsVar, 3);
                M.R(x7);
            }
            juc.a(ducVar, gzsVar4, (gzs) x7, M, 0);
            if (kscVar == null || !kscVar.a()) {
                M.K(1240450082);
            } else {
                M.K(1245096796);
                wrc.a(kscVar, izsVar, null, M, i4);
            }
            M.j();
            if (ordVS instanceof OrdVS.Shown) {
                M.K(1245308402);
                boolean z8 = ((OrdVS.Shown) ordVS).b;
                c = ' ';
                boolean z9 = i4 == 32;
                Object x8 = M.x();
                if (z9 || x8 == c0012a) {
                    x8 = new gy7(izsVar, 2);
                    M.R(x8);
                }
                bsc.a(z8, (gzs) x8, M, 0);
            } else {
                c = ' ';
                M.K(1240450082);
            }
            M.j();
            if (kscVar == null || kscVar.a()) {
                r3 = 0;
                M.K(1240450082);
            } else {
                M.K(1245605692);
                r3 = 0;
                wrc.a(kscVar, izsVar, null, M, i4);
            }
            M.j();
            f9t.e(txj0.h(aVar6, 18), M, 6);
            M.G();
            if (eucVar.e) {
                M.K(436317310);
                q630 d3 = txj0.d(aVar6, 1.0f);
                cp10 d4 = ja8.d(ty6Var, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c4 = qri.c(M, d3);
                if (M.N() == null) {
                    n34.r();
                    throw r3;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar5);
                } else {
                    M.f();
                }
                k9q0.w(M, d4, cVar);
                k9q0.w(M, D3, eVar);
                ur.d(hashCode3, M, bVar, M, c2678a3);
                k9q0.w(M, c4, dVar);
                i2 = 6;
                aVar3 = aVar6;
                ra8Var = ra8Var2;
                zfr0.d(SpinnerState.Loading, ahn.E(ra8Var2.b(aVar6, dt1.a.f), "clip_edit_loader"), null, null, null, 0L, 0L, null, null, M, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
                M = M;
                M.G();
            } else {
                i2 = 6;
                aVar3 = aVar6;
                ra8Var = ra8Var2;
                M.K(430907128);
            }
            M.j();
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = yq.f(M);
            }
            dlv0 dlv0Var = (dlv0) x9;
            zkv0.c(dlv0Var, wlb0.m(d370.N(R.string.clips_edit_network_error, 0, M), r3, r3, M, i2), ra8Var.b(aVar3, ty6Var2), null, null, null, M, 6, 120);
            boolean z10 = i4 == 32;
            Object x10 = M.x();
            if (z10 || x10 == c0012a) {
                x10 = new j97(izsVar, 1);
                M.R(x10);
            }
            c(eucVar, dlv0Var, (gzs) x10, M, (i3 & 14) | 48);
            a(eucVar, izsVar, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mog(eucVar, izsVar, i, 4);
        }
    }

    public static final void c(euc eucVar, dlv0 dlv0Var, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        String str;
        androidx.compose.runtime.a M = aVar.M(900059181);
        int i2 = (M.J(eucVar) ? 4 : 2) | i | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(900059181, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.SnackbarStateHandler (EditContent.kt:187)");
            }
            d9k0 d9k0Var = eucVar.f;
            if (epx.f(d9k0Var, d9k0.a.a)) {
                str = zq.a(M, 1668455166, R.string.clips_edit_network_error, M, 0);
            } else {
                if (d9k0Var != null) {
                    throw alb0.c(1668453426, M);
                }
                M.K(182566672);
                M.j();
                str = null;
            }
            boolean J = M.J(str) | ((i2 & 896) == 256);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new a(str, dlv0Var, gzsVar, null);
                M.R(x);
            }
            bap.g(str, (wzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v(eucVar, dlv0Var, gzsVar, i, 3);
        }
    }

    public static final void d(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        gzs<s3q0> gzsVar3;
        gzs<s3q0> gzsVar4 = gzsVar2;
        androidx.compose.runtime.a M = aVar.M(895787803);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar4) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(895787803, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.TopBarContent (EditContent.kt:149)");
            }
            String N = d370.N(R.string.clips_edit_sdk_back_a11y, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new g8(21);
                M.R(x);
            }
            TopBar$Before.d a2 = TopBar$Before.d.a.a(N, gzsVar4, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, (i2 & 112) | 24576, 4);
            String N2 = d370.N(R.string.clips_edit_sdk_title, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new dz(24);
                M.R(x2);
            }
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(N2, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 196608, 14), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_done_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N3 = d370.N(R.string.clips_edit_sdk_done_a11y, 0, M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new y8m(3);
                M.R(x3);
            }
            gzsVar3 = gzsVar;
            com.vk.core.compose.component.topbar.a a5 = d.a.a(d.c.C0760d.a.a(a4, N3, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, ((i2 << 6) & 896) | 1572872, 24), null, null, null, M, 24576, 14);
            M = M;
            k.b bVar = k.b.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gzsVar4 = gzsVar2;
            muv0.h(a3, ahn.E(q630.a.a, "clip_edit_toolbar"), bVar, null, null, a2, a5, null, false, ylu0Var.getBackground().r, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, Tensorflow.FRAME_WIDTH, 0, 7576);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar3 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o1k(gzsVar3, gzsVar4, i, 1);
        }
    }
}
