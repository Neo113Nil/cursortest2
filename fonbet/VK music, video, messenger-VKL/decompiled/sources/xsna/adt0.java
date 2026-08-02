package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoReportParams.kt */
/* loaded from: classes18.dex */
public final class adt0 {
    public final VideoFile a;
    public final String b;
    public final String c;

    /* compiled from: VideoReportParams.kt */
    public static final class a {
        public VideoFile a;
        public String b;
        public String c;

        public final adt0 a() {
            VideoFile videoFile = this.a;
            if (videoFile != null) {
                return new adt0(videoFile, this.c, this.b);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public adt0(VideoFile videoFile, String str, String str2) {
        this.a = videoFile;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final VideoFile c() {
        return this.a;
    }
}
