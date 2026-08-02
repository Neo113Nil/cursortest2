package xsna;

import com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent;
import com.vk.fave.di.FaveComponent;
import com.vk.im.chat.api.ChatComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mze implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ mze(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (MediaPipelineComponent) this.c.a(fpf0.a(MediaPipelineComponent.class));
            case 1:
                return (ClipsUploadSdkUiComponent) this.c.mo408a(fpf0.a(ClipsUploadSdkUiComponent.class));
            case 2:
                return ((ChatComponent) this.c.a(fpf0.a(ChatComponent.class))).Cf();
            default:
                return ((FaveComponent) this.c.mo408a(fpf0.a(FaveComponent.class))).S8();
        }
    }
}
