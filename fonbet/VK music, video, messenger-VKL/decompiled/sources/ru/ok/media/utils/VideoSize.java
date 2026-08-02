package ru.ok.media.utils;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.proto.PublisherConfiguration;

@Keep
/* loaded from: classes9.dex */
public class VideoSize implements Comparable<VideoSize> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int height;
    private final boolean locked;
    private int width;
    public static final VideoSize FULLHD_VIDEO_SIZE = new VideoSize(1920, 1080);
    public static final VideoSize HD_VIDEO_SIZE = new VideoSize(CoverVideoUploadTask.y, PublisherConfiguration.DEFAULT_MAX_RES);
    public static final VideoSize FAST_VIDEO_SIZE = new VideoSize(1024, 576);
    public static final VideoSize FASTER_VIDEO_SIZE = new VideoSize(Tensorflow.FRAME_HEIGHT, Tensorflow.FRAME_WIDTH);
    public static final VideoSize FASTEST_VIDEO_SIZE = new VideoSize(512, 288);

    public VideoSize(int i, int i2, boolean z) {
        this.width = i;
        this.height = i2;
        this.locked = z;
    }

    public int compareWithoutOrientation(@NonNull VideoSize videoSize) {
        int compare = Integer.compare(getMin(), videoSize.getMin());
        return compare == 0 ? Integer.compare(getMax(), videoSize.getMax()) : compare;
    }

    @NonNull
    public VideoSize copy() {
        return new VideoSize(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.width == videoSize.width && this.height == videoSize.height) {
                return true;
            }
        }
        return false;
    }

    public boolean equalsWithoutOrientation(@NonNull VideoSize videoSize) {
        return compareWithoutOrientation(videoSize) == 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMax() {
        return Math.max(this.width, this.height);
    }

    public int getMin() {
        return Math.min(this.width, this.height);
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public boolean isLandscape() {
        return this.width >= this.height;
    }

    public boolean isPortrait() {
        return this.width <= this.height;
    }

    public boolean isSameOrientation(@Nullable VideoSize videoSize) {
        return videoSize != null && isPortrait() == videoSize.isPortrait();
    }

    public boolean lessThan(@NonNull VideoSize videoSize) {
        return compareWithoutOrientation(videoSize) < 0;
    }

    public VideoSize makeLandscape() {
        if (!isLandscape()) {
            transpose();
        }
        return this;
    }

    public VideoSize makePortrait() {
        if (!isPortrait()) {
            transpose();
        }
        return this;
    }

    public void makeSameOrientation(@NonNull VideoSize videoSize) {
        if (videoSize.isPortrait() != isPortrait()) {
            transpose();
        }
    }

    public VideoSize newWithSameOrientation(@NonNull VideoSize videoSize) {
        return videoSize.isPortrait() == isPortrait() ? new VideoSize(this.width, this.height) : new VideoSize(this.height, this.width);
    }

    public VideoSize rotate(int i) {
        return (i + 3600) % 180 == 90 ? new VideoSize(this.height, this.width) : new VideoSize(this);
    }

    @NonNull
    public String toString() {
        return this.width + "x" + this.height;
    }

    public void transpose() {
        int i = this.width;
        this.width = this.height;
        this.height = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull VideoSize videoSize) {
        int compare = Integer.compare(getMin(), videoSize.getMin());
        return compare == 0 ? Integer.compare(getMax(), videoSize.getMax()) : compare;
    }

    public VideoSize(int i, int i2) {
        this(i, i2, false);
    }

    public VideoSize(@NonNull VideoSize videoSize) {
        this(videoSize, false);
    }

    public VideoSize(@NonNull VideoSize videoSize, boolean z) {
        this(videoSize.width, videoSize.height, z);
    }
}
