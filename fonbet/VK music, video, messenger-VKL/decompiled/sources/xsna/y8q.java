package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragmentInternalComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class y8q implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ y8q(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                gzsVar.invoke();
                return s3q0.a;
            case 1:
                gzsVar.invoke();
                return s3q0.a;
            case 2:
                if (frf0.a.zb() != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 3:
                gzsVar.invoke();
                return s3q0.a;
            default:
                VideoViewerFragmentInternalComponent.a aVar = VideoViewerFragmentInternalComponent.e;
                VideoViewerState videoViewerState = (VideoViewerState) gzsVar.invoke();
                if (videoViewerState != null) {
                    return videoViewerState;
                }
                return new VideoViewerState(null, null, false, 0L, 0L, 31, null);
        }
    }
}
