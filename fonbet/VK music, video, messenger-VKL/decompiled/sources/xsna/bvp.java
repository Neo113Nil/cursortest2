package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.clips.upload.ui.api.entities.ErrorType;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: ErrorContent.kt */
/* loaded from: classes17.dex */
public final class bvp {

    /* compiled from: ErrorContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                iArr[ErrorType.Network.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorType.Unknown.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(gzs gzsVar, ErrorType errorType, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1967557426);
        int i4 = i | (M.y(gzsVar) ? 4 : 2) | (M.o(errorType.ordinal()) ? 32 : 16) | 384;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1967557426, i4, -1, "com.vk.clips.upload.ui.impl.compose.views.content.ErrorContent (ErrorContent.kt:24)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i5 = a.$EnumSwitchMapping$0[errorType.ordinal()];
            if (i5 == 1) {
                i2 = -2005982479;
                i3 = R.string.clips_upload_error_subtitle_text;
            } else {
                if (i5 != 2) {
                    throw alb0.c(-2005984219, M);
                }
                i2 = -2005979308;
                i3 = R.string.clips_upload_error_unknown_subtitle;
            }
            aVar2 = M;
            ldv0.d(ra8.a.b(aVar3, dt1.a.f), null, zra0.a.a(null, null, zq.a(M, i2, i3, M, 0), null, M, 196608, 27), wra0.b.a(wra0.a.C3954a.a(d370.N(R.string.clips_upload_error_button_text, 0, M), gzsVar, ButtonSize.Small, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, aVar2, ((i4 << 3) & 112) | 28032, 12582912, 131040), null, null, aVar2, 14), null, null, false, aVar2, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fjh(i, 1, gzsVar, errorType, q630Var2);
        }
    }
}
