package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoFileStateAdapter.kt */
/* loaded from: classes3.dex */
public final class nls0 {
    public VideoFile a;
    public final io.reactivex.rxjava3.subjects.d<VideoFile> b;
    public final io.reactivex.rxjava3.subjects.d c;

    public nls0(VideoFile videoFile) {
        this.a = videoFile;
        io.reactivex.rxjava3.subjects.d<VideoFile> O0 = io.reactivex.rxjava3.subjects.d.O0(videoFile);
        this.b = O0;
        this.c = O0;
    }
}
