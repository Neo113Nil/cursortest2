package xsna;

import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class f54 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f54(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, true, this.c, false, null, 831);
            default:
                return VideoViewerState.a((VideoViewerState) obj, null, null, !this.c, 0L, 0L, 27);
        }
    }
}
