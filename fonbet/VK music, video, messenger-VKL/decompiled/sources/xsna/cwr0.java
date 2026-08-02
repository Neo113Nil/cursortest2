package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoEvents.kt */
/* loaded from: classes14.dex */
public final class cwr0 extends bwr0 {
    public final VideoFile a;
    public final String b;
    public final String c;
    public final boolean d;

    public cwr0(VideoFile videoFile, String str, String str2, boolean z) {
        this.a = videoFile;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final String a() {
        return this.b;
    }

    public final VideoFile b() {
        return this.a;
    }

    public /* synthetic */ cwr0(VideoFile videoFile, String str, int i) {
        this(videoFile, (i & 2) != 0 ? null : str, null, false);
    }
}
