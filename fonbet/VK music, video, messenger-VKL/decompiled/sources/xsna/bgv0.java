package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.Collections;
import java.util.List;

/* compiled from: VkResizableAvatar.kt */
/* loaded from: classes17.dex */
public final class bgv0 {
    public static final void a(efj efjVar, q630 q630Var, final iy5 iy5Var, k18 k18Var, z190 z190Var, wzs wzsVar, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var2;
        k18 k18Var2;
        final efj efjVar2;
        final wzs wzsVar2;
        androidx.compose.runtime.a M = aVar.M(-933219693);
        int i2 = (M.J(efjVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | (M.J(iy5Var) ? 256 : 128) | (M.J(k18Var) ? 2048 : 1024) | 1794048;
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            jai jaiVar = i35.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-933219693, i2, -1, "com.vk.core.compose.component.image.VkResizableAvatar (VkResizableAvatar.kt:62)");
            }
            q630Var2 = q630Var;
            k18Var2 = k18Var;
            b(efjVar, Collections.singletonList(iy5Var), q630Var2, k18Var2, jaiVar, M, (i2 & 14) | ((i2 << 3) & 896) | (i2 & 7168) | 1794048);
            efjVar2 = efjVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z190Var = tgp.a;
            wzsVar2 = jaiVar;
        } else {
            q630Var2 = q630Var;
            k18Var2 = k18Var;
            efjVar2 = efjVar;
            M.h();
            wzsVar2 = wzsVar;
        }
        final z190 z190Var2 = z190Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            final k18 k18Var3 = k18Var2;
            s.d = new wzs(q630Var3, iy5Var, k18Var3, z190Var2, wzsVar2, i) { // from class: xsna.xfv0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ iy5 d;
                public final /* synthetic */ k18 e;
                public final /* synthetic */ z190 f;
                public final /* synthetic */ wzs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    bgv0.a(efj.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(efj efjVar, List list, q630 q630Var, k18 k18Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(668285320);
        if ((i & 6) == 0) {
            i2 = (M.J(efjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(k18Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(tgp.a) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(668285320, i2, -1, "com.vk.core.compose.component.image.VkResizableAvatar (VkResizableAvatar.kt:32)");
            }
            xtm0.a(q630Var, new agv0(efjVar, list, k18Var, jaiVar), M, (i2 >> 6) & 14, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tw00(efjVar, list, q630Var, k18Var, jaiVar, i);
        }
    }
}
