package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: Cover.kt */
/* loaded from: classes7.dex */
public final class d3k {
    public static final float a = 16;
    public static final long b = f870.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.8f, h8g.e);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n3k n3kVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-878886326);
        int i2 = i | (M.J(n3kVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-878886326, i2, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.cover.Cover (Cover.kt:46)");
            }
            Object aa2Var = new aa2(n3kVar.a);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(new en10(en10.a()));
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Throwable th = (Throwable) wh50Var.getValue();
            int i3 = i2 & 112;
            boolean y = M.y(th) | (i3 == 32);
            Object x4 = M.x();
            if (y || x4 == obj) {
                x4 = new x2k(th, izsVar, null);
                M.R(x4);
            }
            bap.g(th, (wzs) x4, M, 0);
            v2k v2kVar = (v2k) wh50Var2.getValue();
            boolean J = M.J(v2kVar) | (i3 == 32);
            Object x5 = M.x();
            if (J || x5 == obj) {
                x5 = new y2k(v2kVar, izsVar, null);
                M.R(x5);
            }
            bap.g(v2kVar, (wzs) x5, M, 0);
            en10 en10Var = new en10(b(wh50Var3));
            boolean z = i3 == 32;
            Object x6 = M.x();
            if (z || x6 == obj) {
                x6 = new z2k(izsVar, wh50Var3, null);
                M.R(x6);
            }
            bap.g(en10Var, (wzs) x6, M, 0);
            String N = d370.N(R.string.cover_image_talkback, 0, M);
            q630Var2 = q630Var;
            q630 d = txj0.d(q630Var2, 1.0f);
            Object x7 = M.x();
            if (x7 == obj) {
                x7 = new b3k(wh50Var2, wh50Var3);
                M.R(x7);
            }
            q630 b2 = skn0.b(d, null, (PointerInputEventHandler) x7);
            boolean y2 = M.y(aa2Var);
            Object x8 = M.x();
            if (y2 || x8 == obj) {
                Object brfVar = new brf(wh50Var2, aa2Var, wh50Var, wh50Var3, 1);
                M.R(brfVar);
                x8 = brfVar;
            }
            xa4.h(0, M, N, (izs) x8, b2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ax(i, 3, n3kVar, izsVar, q630Var2);
        }
    }

    public static final float[] b(wh50<en10> wh50Var) {
        return wh50Var.getValue().a;
    }
}
