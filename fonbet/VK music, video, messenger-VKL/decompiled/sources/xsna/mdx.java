package xsna;

import android.graphics.Bitmap;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import xsna.wkj;

/* compiled from: InterestEmoji.kt */
/* loaded from: classes4.dex */
public final class mdx {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final float f, final int i, androidx.compose.runtime.a aVar, String str, final q630 q630Var) {
        final q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final String str2 = str;
        androidx.compose.runtime.a M = aVar.M(-206302713);
        int i2 = (M.J(str2) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-206302713, i2, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.InterestEmoji (InterestEmoji.kt:21)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                ucp ucpVar = ucp.a;
                x = ucp.b(str2);
                M.R(x);
            }
            gep gepVar = (gep) x;
            if (gepVar == null) {
                M.K(134300702);
                yqv0.c(str2, q630Var, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, (i2 & 14) | 48, 0, 16380);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new wzs(f, i, str2, q630Var) { // from class: xsna.jdx
                        public final /* synthetic */ String b;
                        public final /* synthetic */ float c;
                        public final /* synthetic */ q630 d;

                        {
                            this.b = str2;
                            this.d = q630Var;
                        }

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(433);
                            mdx.a(this.c, I, (androidx.compose.runtime.a) obj, this.b, this.d);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            M.K(133469499);
            M.j();
            azl azlVar = (azl) M.r(uvi.h);
            Object x2 = M.x();
            if (x2 == c0012a) {
                ucp ucpVar2 = ucp.a;
                x2 = new yjo(ucp.c(gepVar, azlVar.r0(f)));
                M.R(x2);
            }
            yjo yjoVar = (yjo) x2;
            ucp ucpVar3 = ucp.a;
            WeakReference weakReference = (WeakReference) rl3.S(gepVar.a, ucp.t);
            Integer valueOf = Integer.valueOf((weakReference != null ? (Bitmap) weakReference.get() : null) == null ? 0 : 1);
            boolean y = M.y(gepVar);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new ldx(gepVar, null);
                M.R(x3);
            }
            M.W(-688380794, Integer.valueOf(((Number) skd.l(valueOf, (wzs) x3, M, 0).getValue()).intValue()));
            vjw.a(yjoVar, str, q630Var, null, wkj.a.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, ((i2 << 3) & 112) | 24968, 104);
            str2 = str;
            q630Var2 = q630Var;
            aVar2 = M;
            aVar2.a0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new wzs(f, i, str2, q630Var2) { // from class: xsna.kdx
                public final /* synthetic */ String b;
                public final /* synthetic */ float c;
                public final /* synthetic */ q630 d;

                {
                    this.b = str2;
                    this.d = q630Var2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(433);
                    mdx.a(this.c, I, (androidx.compose.runtime.a) obj, this.b, this.d);
                    return s3q0.a;
                }
            };
        }
    }
}
