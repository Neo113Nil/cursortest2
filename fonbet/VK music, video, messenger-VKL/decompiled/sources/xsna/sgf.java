package xsna;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;

/* compiled from: ClipsUploadManagerVkImpl.kt */
/* loaded from: classes17.dex */
public final class sgf implements rgf {
    public final com.vk.clips.upload.vk.impl.uploader.a a;
    public final ped b = new ped();
    public final qv20 c = new qv20();

    public sgf(MediaPipelineComponent mediaPipelineComponent, CameraClipsComponent cameraClipsComponent) {
        this.a = new com.vk.clips.upload.vk.impl.uploader.a(mediaPipelineComponent, cameraClipsComponent);
    }

    @Override // xsna.rgf
    public final ped a() {
        return this.b;
    }

    @Override // xsna.rgf
    public final com.vk.clips.upload.vk.impl.uploader.a b() {
        return this.a;
    }

    @Override // xsna.rgf
    public final qv20 c() {
        return this.c;
    }
}
