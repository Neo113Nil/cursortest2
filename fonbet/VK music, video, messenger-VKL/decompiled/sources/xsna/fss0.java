package xsna;

import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.dto.common.VideoFile;

/* compiled from: VideoLinkCopyUtils.kt */
/* loaded from: classes2.dex */
public final class fss0 implements w8i {
    public static final fss0 b = new fss0();
    public static final bpn0 c = new bpn0(new tqf0(8));

    public static final String a(VideoFile videoFile) {
        return ((LinksGeneratorComponent) c.getValue()).Za().a(videoFile);
    }
}
