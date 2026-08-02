package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.endview.VideoEndView;

/* compiled from: VideoEndDataMapperImpl.kt */
/* loaded from: classes3.dex */
public final class djs0 implements com.vk.libvideo.design.view.endview.a {
    public final VideoFile a;

    public djs0(VideoFile videoFile) {
        this.a = videoFile;
    }

    @Override // com.vk.libvideo.design.view.endview.a
    public final VideoEndView.a c() {
        VideoFile videoFile;
        boolean z;
        boolean z2;
        VideoFile videoFile2 = this.a;
        boolean O9 = videoFile2.O9();
        boolean z3 = true;
        boolean z4 = false;
        if (videoFile2.j0() || qr.f(videoFile2.I0())) {
            videoFile = videoFile2;
            z = true;
        } else {
            videoFile = videoFile2;
            z = false;
        }
        boolean H6 = videoFile.H6();
        if (videoFile.i9()) {
            fxc0.B().getClass();
            z2 = true;
        } else {
            z2 = true;
            z3 = false;
        }
        if (videoFile.i0()) {
            fxc0.B().getClass();
            z4 = z2;
        }
        return new VideoEndView.a(O9, z, H6, z3, z4, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r());
    }
}
