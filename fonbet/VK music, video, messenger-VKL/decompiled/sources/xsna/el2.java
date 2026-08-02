package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.dt1;
import xsna.q630;

/* compiled from: AnimatedRadioButton.kt */
/* loaded from: classes17.dex */
public final class el2 {
    public static final float a = 24;

    public static final void a(final boolean z, final gzs gzsVar, final q630 q630Var, final boolean z2, final sg50 sg50Var, final ill illVar, final float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar2;
        q630 q630Var2;
        llr0 llr0Var;
        mtk0 c;
        androidx.compose.runtime.a M = aVar.M(-963545142);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(sg50Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(illVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.n(f) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-963545142, i2, -1, "com.vk.core.compose.component.internal.AnimatedRadioButton (AnimatedRadioButton.kt:35)");
            }
            int i3 = (i2 << 3) & 112;
            llr0 C = xx1.C(im2.a(R.drawable.ds_internal_avd_radio_button, 6, M), z, M, i3);
            int i4 = i2 >> 9;
            int i5 = i3 | (i4 & 14) | (i4 & 896);
            illVar.getClass();
            M.K(1243421834);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1243421834, i5, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:176)");
            }
            long j = !z2 ? illVar.c : !z ? illVar.b : illVar.a;
            if (z2) {
                M.K(-1312667467);
                llr0Var = C;
                c = lwj0.b(j, jq2.d(100, 0, null, 6), null, M, 48, 12);
                M.j();
            } else {
                llr0Var = C;
                M.K(-1312564764);
                c = androidx.compose.runtime.k.c(new l5g(j), M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            long j2 = ((l5g) c.getValue()).a;
            int i6 = (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | (i4 & 7168);
            int i7 = i2 << 6;
            b(z, gzsVar2, llr0Var, f, q630Var2, z2, j2, sg50Var, M, i6 | (57344 & i7) | (i7 & 458752) | ((i2 << 9) & 29360128));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cl2
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    el2.a(z, gzsVar, q630Var, z2, sg50Var, illVar, f, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final gzs gzsVar, final llr0 llr0Var, final float f, final q630 q630Var, final boolean z2, final long j, final sg50 sg50Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1074462617);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(llr0Var) : M.y(llr0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.n(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.p(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.J(sg50Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1074462617, i3, -1, "com.vk.core.compose.component.internal.PainterRadioButton (AnimatedRadioButton.kt:61)");
            }
            q630 q630Var2 = q630.a.a;
            if (gzsVar != null) {
                q630Var2 = lai0.a(q630Var2, z, sg50Var, qer0.a(a, 4, 0L, false), z2, new plg0(3), gzsVar);
            }
            q630 g = q630Var.g(q630Var2);
            dt1.a.getClass();
            aVar2 = M;
            vqv.a(llr0Var, null, txj0.m(txj0.B(g, dt1.a.f, 2), f), j, aVar2, ((i3 >> 6) & 14) | 56 | ((i3 >> 9) & 7168), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dl2
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    el2.b(z, gzsVar, llr0Var, f, q630Var, z2, j, sg50Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
