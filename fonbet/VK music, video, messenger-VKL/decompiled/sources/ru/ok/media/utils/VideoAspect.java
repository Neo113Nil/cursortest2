package ru.ok.media.utils;

/* loaded from: classes9.dex */
public class VideoAspect {
    public static VideoSize getAspectAdjustedSize(VideoSize videoSize, int i, int i2) {
        int height = videoSize.getHeight();
        int width = videoSize.getWidth();
        if ((i2 > i) != (height > width)) {
            height = width;
            width = height;
        }
        int i3 = (i * height) / width;
        if (i3 > i2) {
            i = (width * i2) / height;
        } else {
            i2 = i3;
        }
        return new VideoSize(i, i2);
    }
}
