package ru.ok.android.webrtc.video.qualityupdate;

import xsna.de;
import xsna.h5s;
import xsna.odj;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class VideoQualityUpdate {
    public static final int CAMERA_SOURCE = 0;
    public static final Companion Companion = new Companion(null);
    public static final int SCREEN_SHARE_SOURCE = 1;
    public final int a;
    public final int b;
    public final int c;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public VideoQualityUpdate(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static /* synthetic */ VideoQualityUpdate copy$default(VideoQualityUpdate videoQualityUpdate, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = videoQualityUpdate.a;
        }
        if ((i4 & 2) != 0) {
            i2 = videoQualityUpdate.b;
        }
        if ((i4 & 4) != 0) {
            i3 = videoQualityUpdate.c;
        }
        return videoQualityUpdate.copy(i, i2, i3);
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final VideoQualityUpdate copy(int i, int i2, int i3) {
        return new VideoQualityUpdate(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoQualityUpdate)) {
            return false;
        }
        VideoQualityUpdate videoQualityUpdate = (VideoQualityUpdate) obj;
        return this.a == videoQualityUpdate.a && this.b == videoQualityUpdate.b && this.c == videoQualityUpdate.c;
    }

    public final int getMaxBitrate() {
        return this.a;
    }

    public final int getMaxDimension() {
        return this.b;
    }

    public final int getSource() {
        return this.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.c) + de.v(this.b, Integer.hashCode(this.a) * 31);
    }

    public final boolean isForCamera() {
        return this.c == 0;
    }

    public final boolean isForScreenShare() {
        return this.c == 1;
    }

    public String toString() {
        return h5s.c(this.c, ")", odj.a(this.a, this.b, "VideoQualityUpdate(maxBitrate=", ", maxDimension=", ", source="));
    }
}
