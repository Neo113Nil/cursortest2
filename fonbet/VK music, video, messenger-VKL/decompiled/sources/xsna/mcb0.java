package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.q630;

/* compiled from: PlaylistScreenContent.kt */
/* loaded from: classes3.dex */
public final class mcb0 {
    public static final void a(final peb0 peb0Var, final tab0 tab0Var, final mtk0 mtk0Var, final icb0 icb0Var, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        int i2;
        int i3;
        int i4;
        Object obj;
        zfe0 zfe0Var;
        int i5;
        Object b;
        icb0 icb0Var2 = icb0Var;
        androidx.compose.runtime.a M = aVar.M(-1116824256);
        int i6 = i | (M.J(peb0Var) ? 4 : 2) | (M.J(tab0Var) ? 32 : 16) | (M.J(mtk0Var) ? 256 : 128) | (M.J(icb0Var2) ? 2048 : 1024) | 24576;
        if (M.t(i6 & 1, (i6 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1116824256, i6, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistScreenContent (PlaylistScreenContent.kt:27)");
            }
            boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
            int i7 = i6 & 7168;
            boolean z = i7 == 2048;
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (z || x == obj2) {
                i2 = i7;
                i3 = -1;
                i4 = 0;
                obj = obj2;
                Object w1iVar = new w1i(0, icb0Var, icb0.class, "onRefresh", "onRefresh()V", 0, 1);
                icb0Var2 = icb0Var;
                M.R(w1iVar);
                x = w1iVar;
            } else {
                i2 = i7;
                i3 = -1;
                i4 = 0;
                obj = obj2;
            }
            gzs gzsVar = (gzs) ((fcy) x);
            float f = qfe0.a;
            float f2 = qfe0.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-174977512, i4, i3, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
            }
            if (pco.a(f, i4) <= 0) {
                throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
            }
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            yvj yvjVar = (yvj) x2;
            wh50 c = androidx.compose.runtime.k.c(gzsVar, M, i4);
            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            azl azlVar = (azl) M.r(uvi.h);
            ref$FloatRef.element = azlVar.I0(f);
            ref$FloatRef2.element = azlVar.I0(f2);
            boolean J = M.J(yvjVar);
            Object x3 = M.x();
            if (J || x3 == obj) {
                x3 = new zfe0(yvjVar, c, ref$FloatRef2.element, ref$FloatRef.element);
                M.R(x3);
            }
            zfe0 zfe0Var2 = (zfe0) x3;
            boolean y = M.y(zfe0Var2) | M.l(booleanValue) | M.n(ref$FloatRef.element) | M.n(ref$FloatRef2.element);
            Object x4 = M.x();
            if (y || x4 == obj) {
                x4 = new age0(0, zfe0Var2, ref$FloatRef, ref$FloatRef2, booleanValue);
                zfe0Var = zfe0Var2;
                M.R(x4);
            } else {
                zfe0Var = zfe0Var2;
            }
            bap.i((gzs) x4, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i8 = j13.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1801969826, i4, i3, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1857)");
            }
            Object[] objArr = new Object[i4];
            fh9 fh9Var = y6p0.d;
            boolean n = M.n(-3.4028235E38f) | M.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) | M.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Object x5 = M.x();
            if (n || x5 == obj) {
                x5 = new g13(i4);
                M.R(x5);
            }
            y6p0 y6p0Var = (y6p0) crx0.D(objArr, fh9Var, (gzs) x5, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = new aq0(10);
                M.R(x6);
            }
            gzs gzsVar2 = (gzs) x6;
            xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-671235306, i4, i3, "com.vk.music.playlist.framework.presentation.createDirectedScrollSpanBehavior (DirectedScrollSpanBehavior.kt:32)");
            }
            szm szmVar = new szm(y6p0Var, c2, gzsVar2);
            Integer valueOf = Integer.valueOf(((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).orientation);
            boolean J2 = M.J(y6p0Var);
            Object x7 = M.x();
            if (J2 || x7 == obj) {
                x7 = new tzm(y6p0Var, null);
                M.R(x7);
            }
            bap.g(valueOf, (wzs) x7, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean J3 = M.J(szmVar);
            Object x8 = M.x();
            if (J3 || x8 == obj) {
                x8 = bbk0.b(new in60(szmVar, 8));
                M.R(x8);
            }
            mtk0 mtk0Var2 = (mtk0) x8;
            boolean n2 = M.n(((Number) mtk0Var2.getValue()).floatValue());
            Object x9 = M.x();
            if (n2 || x9 == obj) {
                i5 = 1;
                b = bbk0.b(new lva0(mtk0Var2, 1));
                M.R(b);
            } else {
                b = x9;
                i5 = 1;
            }
            mtk0 mtk0Var3 = (mtk0) b;
            Float valueOf2 = Float.valueOf(((Number) mtk0Var2.getValue()).floatValue());
            int i9 = (M.J(mtk0Var2) ? 1 : 0) | (i2 == 2048 ? i5 : i4);
            Object x10 = M.x();
            if (i9 != 0 || x10 == obj) {
                x10 = new lcb0(icb0Var2, mtk0Var2, null);
                M.R(x10);
            }
            bap.g(valueOf2, (wzs) x10, M, i4);
            rzm rzmVar = szmVar.d;
            q630.a aVar2 = q630.a.a;
            phv0.b(n34.t(n34.t(aVar2, rzmVar, null), new xfe0(new lpd(1, zfe0Var, zfe0.class, "onPull", "onPull$material(F)F", 0, 9), new wfe0(2, zfe0Var, zfe0.class, "onRelease", "onRelease$material(F)F", 4), ((Boolean) mtk0Var3.getValue()).booleanValue()), null), kai.c(673932423, new qx00(peb0Var, szmVar, zfe0Var, mtk0Var2), M), null, null, null, 0, 0L, 0L, kai.c(1738007708, new com.vk.friends.requests.impl.allrequests.presentation.a(tab0Var, 4), M), M, 805306416, IronSourceError.ERROR_CODE_INIT_FAILED);
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
            s.d = new wzs(tab0Var, mtk0Var, icb0Var, q630Var2, i) { // from class: xsna.kcb0
                public final /* synthetic */ tab0 c;
                public final /* synthetic */ mtk0 d;
                public final /* synthetic */ icb0 e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(1);
                    mcb0.a(peb0.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
        }
    }
}
