package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoEvents.kt */
/* loaded from: classes.dex */
public final class wxr0 extends bwr0 {
    public final VideoFile a;
    public final String b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wxr0(VideoFile videoFile) {
        this(videoFile, r0, r0, 6);
        String str = null;
    }

    public wxr0(VideoFile videoFile, String str, String str2) {
        this.a = videoFile;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ wxr0(VideoFile videoFile, String str, String str2, int i) {
        this(videoFile, (i & 2) != 0 ? "videos_remove" : str, (i & 4) != 0 ? null : str2);
    }
}
