package one.video.player.model;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import ru.ok.proto.PublisherConfiguration;
import xsna.asp;
import xsna.l6g;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FrameSize.kt */
/* loaded from: classes8.dex */
public final class FrameSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FrameSize[] $VALUES;
    public static final a Companion;
    public static final FrameSize _1080p;
    public static final FrameSize _1440p;
    public static final FrameSize _144p;
    public static final FrameSize _2160p;
    public static final FrameSize _240p;
    public static final FrameSize _360p;
    public static final FrameSize _4320p;
    public static final FrameSize _480p;
    public static final FrameSize _720p;
    private final int area;
    private final int height;
    private final int width;

    /* compiled from: FrameSize.kt */
    public static final class a {
    }

    static {
        FrameSize frameSize = new FrameSize("_144p", 0, 256, 144);
        _144p = frameSize;
        FrameSize frameSize2 = new FrameSize("_240p", 1, 426, PsExtractor.VIDEO_STREAM_MASK);
        _240p = frameSize2;
        FrameSize frameSize3 = new FrameSize("_360p", 2, 640, 360);
        _360p = frameSize3;
        FrameSize frameSize4 = new FrameSize("_480p", 3, 853, 480);
        _480p = frameSize4;
        FrameSize frameSize5 = new FrameSize("_720p", 4, CoverVideoUploadTask.y, PublisherConfiguration.DEFAULT_MAX_RES);
        _720p = frameSize5;
        FrameSize frameSize6 = new FrameSize("_1080p", 5, 1920, 1080);
        _1080p = frameSize6;
        FrameSize frameSize7 = new FrameSize("_1440p", 6, 2560, 1440);
        _1440p = frameSize7;
        FrameSize frameSize8 = new FrameSize("_2160p", 7, 3840, 2160);
        _2160p = frameSize8;
        FrameSize frameSize9 = new FrameSize("_4320p", 8, 7680, 4320);
        _4320p = frameSize9;
        FrameSize[] frameSizeArr = {frameSize, frameSize2, frameSize3, frameSize4, frameSize5, frameSize6, frameSize7, frameSize8, frameSize9};
        $VALUES = frameSizeArr;
        $ENTRIES = new asp(frameSizeArr);
        Companion = new a();
    }

    public FrameSize(String str, int i, int i2, int i3) {
        this.width = i2;
        this.height = i3;
        this.area = i2 * i3;
    }

    public static zrp<FrameSize> h() {
        return $ENTRIES;
    }

    public static FrameSize valueOf(String str) {
        return (FrameSize) Enum.valueOf(FrameSize.class, str);
    }

    public static FrameSize[] values() {
        return (FrameSize[]) $VALUES.clone();
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return l6g.a(this.height, TtmlNode.TAG_P);
    }
}
