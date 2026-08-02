package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ClipDescriptionViews.kt */
/* loaded from: classes17.dex */
public final class iqc {
    public static final void a(final String str, final us2 us2Var, final List list, q630 q630Var, final gzs gzsVar, final gzs gzsVar2, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1944222474);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(us2Var) ? 32 : 16) | (M.J(list) ? 256 : 128) | 3072 | (M.y(gzsVar) ? 16384 : 8192) | (M.y(gzsVar2) ? 131072 : 65536) | (M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1944222474, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.description.ClipInfoBlock (ClipDescriptionViews.kt:31)");
            }
            float f = 12;
            float f2 = 8;
            q630.a aVar2 = q630.a.a;
            q630 f3 = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5)), 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f3);
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
            uog0 b = vog0.b(f2);
            q630 v = txj0.v(aVar2, 65);
            float f4 = Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE;
            q630 d = rte0.d(txj0.h(v, f4), b);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            i4d0.b(str, ojc.b(d, (sg50) x, null, false, null, gzsVar, 28), M, i2 & 14);
            f9t.e(txj0.v(aVar2, f), M, 6);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 h = txj0.h(txj0.f(new xpy(1.0f, false), 1.0f), f4);
            String N = d370.N(R.string.clips_edit_sdk_description_hint, 0, M);
            int i3 = (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            int i4 = i2 >> 6;
            dvd.a(us2Var, list, N, gzsVar2, izsVar, h, null, M, i3 | (i4 & 7168) | (i4 & 57344), 64);
            M.G();
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
            s.d = new wzs(str, us2Var, list, q630Var2, gzsVar, gzsVar2, izsVar, i) { // from class: xsna.hqc
                public final /* synthetic */ String b;
                public final /* synthetic */ us2 c;
                public final /* synthetic */ List d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ izs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    iqc.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
