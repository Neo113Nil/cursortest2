package xsna;

import android.content.Context;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.clips.upload.vk.impl.preview.ClipsPublishViewerOverlayFragment;

/* compiled from: ClipsUploadPreviewNavigatorImpl.kt */
/* loaded from: classes17.dex */
public final class ygf implements xgf {
    @Override // xsna.xgf
    public final void a(Context context, ClipPreviewInputParams clipPreviewInputParams, int i) {
        ClipsPublishViewerOverlayFragment.a aVar = new ClipsPublishViewerOverlayFragment.a(ClipsPublishViewerOverlayFragment.class, null, null);
        aVar.j.putParcelable("input_params", clipPreviewInputParams);
        if (clipPreviewInputParams.f) {
            dhr0.a.getClass();
            aVar.w(dhr0.u().c);
        }
        aVar.s(true);
        bpn0 bpn0Var = enj.a;
        aVar.h(e3m.h(context), i);
    }
}
