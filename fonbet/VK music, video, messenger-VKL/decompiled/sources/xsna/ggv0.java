package xsna;

import com.vk.core.compose.component.defaults.PictureRadius;
import java.util.Collections;
import java.util.List;

/* compiled from: VkResizablePicture.kt */
/* loaded from: classes17.dex */
public final class ggv0 {
    public static final void a(efj efjVar, q630 q630Var, PictureRadius pictureRadius, final iy5 iy5Var, z190 z190Var, wzs wzsVar, androidx.compose.runtime.a aVar, final int i) {
        PictureRadius pictureRadius2;
        final q630 q630Var2;
        final efj efjVar2;
        final wzs wzsVar2;
        androidx.compose.runtime.a M = aVar.M(-73615105);
        int i2 = (M.J(efjVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | (M.o(pictureRadius == null ? -1 : pictureRadius.ordinal()) ? 256 : 128) | (M.J(iy5Var) ? 2048 : 1024) | 221184;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            jai jaiVar = edi.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-73615105, i2, -1, "com.vk.core.compose.component.image.VkResizablePicture (VkResizablePicture.kt:60)");
            }
            int i3 = i2 & 14;
            int i4 = i2 << 3;
            pictureRadius2 = pictureRadius;
            b(efjVar, Collections.singletonList(iy5Var), q630Var, pictureRadius2, jaiVar, M, i3 | (i4 & 896) | (i4 & 7168) | 221184);
            efjVar2 = efjVar;
            q630Var2 = q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z190Var = tgp.a;
            wzsVar2 = jaiVar;
        } else {
            pictureRadius2 = pictureRadius;
            q630Var2 = q630Var;
            efjVar2 = efjVar;
            M.h();
            wzsVar2 = wzsVar;
        }
        final z190 z190Var2 = z190Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final PictureRadius pictureRadius3 = pictureRadius2;
            s.d = new wzs(q630Var2, pictureRadius3, iy5Var, z190Var2, wzsVar2, i) { // from class: xsna.cgv0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ PictureRadius d;
                public final /* synthetic */ iy5 e;
                public final /* synthetic */ z190 f;
                public final /* synthetic */ wzs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ggv0.a(efj.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(efj efjVar, List list, q630 q630Var, PictureRadius pictureRadius, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1146276620);
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
            i2 |= M.o(pictureRadius == null ? -1 : pictureRadius.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(tgp.a) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1146276620, i2, -1, "com.vk.core.compose.component.image.VkResizablePicture (VkResizablePicture.kt:33)");
            }
            xtm0.a(q630Var, new fgv0(efjVar, list, pictureRadius, jaiVar), M, (i2 >> 6) & 14, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jd30(efjVar, list, q630Var, pictureRadius, jaiVar, i);
        }
    }
}
