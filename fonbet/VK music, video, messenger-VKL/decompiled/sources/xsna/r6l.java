package xsna;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.debug.design.MockType;
import com.vk.debug.ui.dev.DebugMockApiResponsesFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DebugMockApiResponsesScreen.kt */
/* loaded from: classes17.dex */
public final class r6l {
    public static final fh9 a = q6x.C(new fj1(19), new pv7((byte) 0, 5));
    public static final fh9 b = q6x.C(b.b, a.b);

    /* compiled from: DebugMockApiResponsesScreen.kt */
    public static final class a implements wzs<f2h0, wow<uu20>, List<? extends Object>> {
        public static final a b = new a();

        @Override // xsna.wzs
        public final List<? extends Object> invoke(f2h0 f2h0Var, wow<uu20> wowVar) {
            f2h0 f2h0Var2 = f2h0Var;
            List<uu20> list = wowVar.b;
            ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
            Iterator<uu20> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((wzs) r6l.a.b).invoke(f2h0Var2, it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: DebugMockApiResponsesScreen.kt */
    public static final class b implements izs<List<? extends Object>, wow<uu20>> {
        public static final b b = new b();

        @Override // xsna.izs
        public final wow<uu20> invoke(List<? extends Object> list) {
            List<? extends Object> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                arrayList.add(next != null ? (uu20) ((izs) r6l.a.c).invoke(next) : null);
            }
            return new wow<>(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x021c, code lost:
    
        if (r12 == r2) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final DebugMockApiResponsesFragment.b bVar, final ArrayList arrayList, final boolean z, oh3 oh3Var, final DebugMockApiResponsesFragment.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        Object obj;
        final oh3 oh3Var2 = oh3Var;
        androidx.compose.runtime.a M = aVar.M(277933284);
        int i2 = i | (M.y(bVar) ? 4 : 2) | (M.J(arrayList) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(oh3Var2) ? 2048 : 1024) | (M.y(dVar) ? 16384 : 8192) | 196608;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(277933284, i2, -1, "com.vk.debug.design.DebugMockApiResponsesScreen (DebugMockApiResponsesScreen.kt:84)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (z2 || x == obj2) {
                x = new tvj(arrayList, 2);
                M.R(x);
            }
            wh50 C = crx0.C(objArr, b, (gzs) x, M, 0);
            Object[] objArr2 = new Object[0];
            boolean z3 = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z3 || x2 == obj2) {
                x2 = new gzs() { // from class: xsna.l6l
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return androidx.compose.runtime.k.b(Boolean.valueOf(z));
                    }
                };
                M.R(x2);
            }
            wh50 wh50Var = (wh50) crx0.A(objArr2, (gzs) x2, M, 0);
            Object[] objArr3 = new Object[0];
            Object x3 = M.x();
            if (x3 == obj2) {
                x3 = new af0(11);
                M.R(x3);
            }
            wh50 wh50Var2 = (wh50) crx0.A(objArr3, (gzs) x3, M, 48);
            wa0 wa0Var = new wa0();
            boolean J = M.J(wh50Var2) | M.J(C) | M.y(context);
            Object x4 = M.x();
            if (J || x4 == obj2) {
                x4 = new dlb(wh50Var2, C, context, 2);
                M.R(x4);
            }
            rh00 h = nzo.h(wa0Var, (izs) x4, M);
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.debug_mock_api_responses_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14), null, null, null, e.a.a(bVar, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8174);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            String N = d370.N(R.string.debug_mock_api_responses_enable, 0, M);
            String N2 = d370.N(R.string.debug_mock_api_responses_enable_warning, 0, M);
            boolean J2 = ((i2 & 57344) == 16384) | M.J(wh50Var);
            Object x5 = M.x();
            if (J2) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            x5 = new he3(19, dVar, wh50Var);
            M.R(x5);
            zov0.b(booleanValue, N, (izs) x5, null, N2, false, false, M, 0, 104);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 f = txj0.f(new xpy(1.0f, true), 1.0f);
            boolean J3 = M.J(C) | M.J(wh50Var2) | M.y(h);
            Object x6 = M.x();
            if (J3 || x6 == obj) {
                x6 = new w95(C, wh50Var2, h);
                M.R(x6);
            }
            lqy.a(f, null, null, null, null, null, false, null, (izs) x6, M, 0, 510);
            float f2 = 12;
            q630 D2 = s200.D(txj0.f(aVar2, 1.0f), f2);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.k, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar2);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            String N3 = d370.N(R.string.debug_mock_api_responses_add_mock, 0, M);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean J4 = M.J(C);
            Object x7 = M.x();
            if (J4 || x7 == obj) {
                x7 = new a2k(1, C);
                M.R(x7);
            }
            bhu0.e((gzs) x7, buttonSize, buttonStyle, buttonAppearance, xpyVar, null, false, false, null, null, null, N3, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
            ButtonStyle buttonStyle2 = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
            String N4 = d370.N(R.string.debug_mock_api_responses_save, 0, M);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar2 = new xpy(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            boolean J5 = M.J(C) | ((i2 & 7168) == 2048);
            Object x8 = M.x();
            if (J5 || x8 == obj) {
                oh3Var2 = oh3Var;
                x8 = new i5(9, oh3Var2, C);
                M.R(x8);
            } else {
                oh3Var2 = oh3Var;
            }
            bhu0.e((gzs) x8, buttonSize, buttonStyle2, buttonAppearance2, xpyVar2, null, false, false, null, null, null, N4, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(arrayList, z, oh3Var2, dVar, q630Var2, i) { // from class: xsna.g6l
                public final /* synthetic */ ArrayList c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ oh3 e;
                public final /* synthetic */ DebugMockApiResponsesFragment.d f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(1);
                    r6l.a(DebugMockApiResponsesFragment.b.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List b(wh50 wh50Var) {
        return ((wow) wh50Var.getValue()).b;
    }

    public static final void c(uu20 uu20Var, izs<? super uu20, s3q0> izsVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1219834871);
        int i2 = i | (M.J(uu20Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1219834871, i2, -1, "com.vk.debug.design.MockCard (DebugMockApiResponsesScreen.kt:170)");
            }
            float f = 12;
            q630 E = s200.E(txj0.f(q630.a.a, 1.0f), f, f);
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            int i5 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            f(uu20Var, izsVar, M, i5);
            i(uu20Var, izsVar, M, i5);
            e(uu20Var, gzsVar, M, ((i2 >> 3) & 112) | i3);
            List<rh90> list = uu20Var.e;
            boolean z = (i4 == 32) | (i3 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new n85(3, izsVar, uu20Var);
                M.R(x);
            }
            wzs wzsVar = (wzs) x;
            boolean z2 = (i4 == 32) | (i3 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new mm1(10, izsVar, uu20Var);
                M.R(x2);
            }
            h(0, M, list, (izs) x2, wzsVar);
            boolean z3 = (i4 == 32) | (i3 == 4);
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new defpackage.u(10, izsVar, uu20Var);
                M.R(x3);
            }
            d((gzs) x3, gzsVar2, M, (i2 >> 6) & 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h6l(uu20Var, izsVar, gzsVar, gzsVar2, i);
        }
    }

    public static final void d(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs<s3q0> gzsVar3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1086721431);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1086721431, i2, -1, "com.vk.debug.design.MockCardActions (DebugMockApiResponsesScreen.kt:295)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(12);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, ButtonAppearance.Neutral, null, null, false, false, null, null, null, d370.N(R.string.debug_mock_api_responses_add_param, 0, M), null, null, null, null, false, null, null, null, aVar2, (i2 & 14) | X2.b.f, 0, 0, 4190192);
            gzsVar3 = gzsVar2;
            bhu0.e(gzsVar3, buttonSize, buttonStyle, ButtonAppearance.Negative, null, null, false, false, null, null, null, d370.N(R.string.debug_mock_api_responses_delete_mock, 0, aVar2), null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | X2.b.f, 0, 0, 4190192);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar3 = gzsVar2;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new j6l(gzsVar, gzsVar3, i, 0);
        }
    }

    public static final void e(uu20 uu20Var, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        String a2;
        androidx.compose.runtime.a M = aVar.M(435930368);
        int i2 = i | (M.J(uu20Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(435930368, i2, -1, "com.vk.debug.design.MockFilePickerRow (DebugMockApiResponsesScreen.kt:220)");
            }
            String N = d370.N(R.string.debug_mock_api_responses_file_selected, 0, M);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            bhu0.e(gzsVar, ButtonSize.Small, ButtonStyle.Secondary, ButtonAppearance.Neutral, null, null, false, false, null, null, null, d370.N(R.string.debug_mock_api_responses_pick_file, 0, M), null, null, null, null, false, null, null, null, M, ((i2 >> 3) & 14) | X2.b.f, 0, 0, 4190192);
            if (uu20Var.b == MockType.FILE) {
                M.K(-240459081);
                M.j();
                a2 = String.format(N, Arrays.copyOf(new Object[]{uu20Var.d}, 1));
            } else {
                a2 = zq.a(M, -240381829, R.string.debug_mock_api_responses_file_not_selected, M, 0);
            }
            aVar2 = M;
            yqv0.c(a2, s200.H(aVar3, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 48, 0, 16380);
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
            s.d = new kjc(uu20Var, gzsVar, i, 1);
        }
    }

    public static final void f(uu20 uu20Var, izs<? super uu20, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(111023912);
        int i2 = (M.J(uu20Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(111023912, i2, -1, "com.vk.debug.design.MockMethodField (DebugMockApiResponsesScreen.kt:195)");
            }
            String str = uu20Var.a;
            String N = d370.N(R.string.debug_mock_api_responses_method_placeholder, 0, M);
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new m9(12, izsVar, uu20Var);
                M.R(x);
            }
            aVar2 = M;
            hqv0.c(str, (izs) x, f, N, null, 0, 1, false, false, 0L, 0L, null, null, null, null, null, null, null, aVar2, 1573248, 1048496);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new lug(uu20Var, izsVar, i, 2);
        }
    }

    public static final void g(rh90 rh90Var, izs<? super izs<? super rh90, rh90>, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1446035517);
        int i2 = i | (M.J(rh90Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1446035517, i2, -1, "com.vk.debug.design.MockParamRow (DebugMockApiResponsesScreen.kt:264)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(8), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            String str = rh90Var.a;
            String N = d370.N(R.string.debug_mock_api_responses_param_key_placeholder, 0, M);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new v7b(izsVar, 2);
                M.R(x);
            }
            hqv0.c(str, (izs) x, xpyVar, N, null, 0, 1, false, false, 0L, 0L, null, null, null, null, null, null, null, M, 1572864, 1048496);
            String str2 = rh90Var.b;
            String N2 = d370.N(R.string.debug_mock_api_responses_param_value_placeholder, 0, M);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new ih4(izsVar, 2);
                M.R(x2);
            }
            hqv0.c(str2, (izs) x2, xpyVar2, N2, null, 0, 1, false, false, 0L, 0L, null, null, null, null, null, null, null, M, 1572864, 1048496);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            }
            lg90 b2 = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, b2, d370.N(R.string.debug_mock_api_responses_delete_param, 0, M), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, M, ((i2 >> 6) & 14) | 64, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            aVar2 = M;
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
            s.d = new ez7(rh90Var, izsVar, gzsVar, i, 4);
        }
    }

    public static final void h(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, wzs wzsVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(351974539);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(wzsVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(351974539, i2, -1, "com.vk.debug.design.MockParamsList (DebugMockApiResponsesScreen.kt:246)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            yqv0.c(d370.N(R.string.debug_mock_api_responses_params_header, 0, M), null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 0, 0, 16382);
            aVar2 = M;
            aVar2.K(566485699);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                rh90 rh90Var = (rh90) obj;
                boolean o = ((i2 & 112) == 32) | aVar2.o(i3);
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (o || x == c0012a) {
                    x = new hbe(wzsVar, i3, 1);
                    aVar2.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean o2 = ((i2 & 896) == 256) | aVar2.o(i3);
                Object x2 = aVar2.x();
                if (o2 || x2 == c0012a) {
                    x2 = new i6l(izsVar, i3, 0);
                    aVar2.R(x2);
                }
                g(rh90Var, izsVar2, (gzs) x2, aVar2, 0);
                i3 = i4;
            }
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xce(i, 2, list, wzsVar, izsVar);
        }
    }

    public static final void i(uu20 uu20Var, izs<? super uu20, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1024144826);
        int i2 = (M.J(uu20Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1024144826, i2, -1, "com.vk.debug.design.MockResponseBodyField (DebugMockApiResponsesScreen.kt:206)");
            }
            String str = uu20Var.b == MockType.TEXT ? uu20Var.c : "";
            String N = d370.N(R.string.debug_mock_api_responses_body_placeholder, 0, M);
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new h1(10, izsVar, uu20Var);
                M.R(x);
            }
            aVar2 = M;
            hqv0.c(str, (izs) x, f, N, null, 2, 6, false, false, 0L, 0L, null, null, null, null, null, null, null, aVar2, 1769856, 1048464);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xs8(uu20Var, izsVar, i, 2);
        }
    }

    public static final ArrayList j(int i, List list) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (i2 != i) {
                arrayList.add(obj);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static final String k(Context context, Uri uri) {
        Uri uri2;
        int columnIndex;
        String string;
        try {
            uri2 = uri;
            try {
                Cursor query = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_display_name")) >= 0 && (string = query.getString(columnIndex)) != null && !drm0.N(string)) {
                            query.close();
                            return string;
                        }
                        s3q0 s3q0Var = s3q0.a;
                        query.close();
                        s3q0 s3q0Var2 = s3q0.a;
                    } finally {
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            uri2 = uri;
        }
        String lastPathSegment = uri2.getLastPathSegment();
        return lastPathSegment == null ? uri2.toString() : lastPathSegment;
    }
}
