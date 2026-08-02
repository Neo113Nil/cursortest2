package xsna;

import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;

/* compiled from: ClipEditCoauthosContent.kt */
/* loaded from: classes17.dex */
public final class yrc implements wq5<pyf> {
    public final /* synthetic */ ClipsComposeImageLoader b;

    public yrc(ClipsComposeImageLoader clipsComposeImageLoader) {
        this.b = clipsComposeImageLoader;
    }

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void e(pyf pyfVar, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1852030343);
        if ((i & 6) == 0) {
            i2 = (M.J(pyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1852030343, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.coauthos.getCoauthorsLeft.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (ClipEditCoauthosContent.kt:161)");
            }
            yzsVar.invoke(this.b.a(pyfVar.b, M, 0).j(), M, Integer.valueOf((i2 & 112) | 8));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xrc(i, 0, this, pyfVar, yzsVar);
        }
    }
}
