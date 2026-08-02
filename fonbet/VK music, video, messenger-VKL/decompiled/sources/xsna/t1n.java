package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;

/* compiled from: DiscoverCatalogClipClickListener.kt */
/* loaded from: classes16.dex */
public final class t1n implements mba {
    public final wzs<View, UIBlockVideo, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public t1n(wzs<? super View, ? super UIBlockVideo, s3q0> wzsVar) {
        this.b = wzsVar;
    }

    @Override // xsna.mba
    public final void w(View view, UIBlock uIBlock, Object obj) {
        if (uIBlock == null ? true : uIBlock instanceof UIBlockVideo) {
            UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
            if ((uIBlockVideo != null ? uIBlockVideo.b : null) != null) {
                this.b.invoke(view, uIBlock);
            }
        }
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.mba
    public final void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
    }

    @Override // xsna.mba
    public final void q(int i, UIBlock uIBlock, Object obj) {
    }
}
