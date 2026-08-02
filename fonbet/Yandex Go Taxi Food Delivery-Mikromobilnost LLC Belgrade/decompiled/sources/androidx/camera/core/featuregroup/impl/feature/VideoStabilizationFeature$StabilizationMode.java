package androidx.camera.core.featuregroup.impl.feature;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"androidx/camera/core/featuregroup/impl/feature/VideoStabilizationFeature$StabilizationMode", "", "Landroidx/camera/core/featuregroup/impl/feature/VideoStabilizationFeature$StabilizationMode;", "OFF", "ON", "PREVIEW", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VideoStabilizationFeature$StabilizationMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VideoStabilizationFeature$StabilizationMode[] $VALUES;
    public static final VideoStabilizationFeature$StabilizationMode OFF;
    public static final VideoStabilizationFeature$StabilizationMode ON;
    public static final VideoStabilizationFeature$StabilizationMode PREVIEW;

    static {
        VideoStabilizationFeature$StabilizationMode videoStabilizationFeature$StabilizationMode = new VideoStabilizationFeature$StabilizationMode("OFF", 0);
        OFF = videoStabilizationFeature$StabilizationMode;
        VideoStabilizationFeature$StabilizationMode videoStabilizationFeature$StabilizationMode2 = new VideoStabilizationFeature$StabilizationMode("ON", 1);
        ON = videoStabilizationFeature$StabilizationMode2;
        VideoStabilizationFeature$StabilizationMode videoStabilizationFeature$StabilizationMode3 = new VideoStabilizationFeature$StabilizationMode("PREVIEW", 2);
        PREVIEW = videoStabilizationFeature$StabilizationMode3;
        VideoStabilizationFeature$StabilizationMode[] videoStabilizationFeature$StabilizationModeArr = {videoStabilizationFeature$StabilizationMode, videoStabilizationFeature$StabilizationMode2, videoStabilizationFeature$StabilizationMode3};
        $VALUES = videoStabilizationFeature$StabilizationModeArr;
        $ENTRIES = a.a(videoStabilizationFeature$StabilizationModeArr);
    }

    public static VideoStabilizationFeature$StabilizationMode valueOf(String str) {
        return (VideoStabilizationFeature$StabilizationMode) Enum.valueOf(VideoStabilizationFeature$StabilizationMode.class, str);
    }

    public static VideoStabilizationFeature$StabilizationMode[] values() {
        return (VideoStabilizationFeature$StabilizationMode[]) $VALUES.clone();
    }
}
