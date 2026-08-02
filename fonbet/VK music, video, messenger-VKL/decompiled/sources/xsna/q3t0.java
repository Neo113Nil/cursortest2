package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.video.growth.api.data.VideoGrowthCommunitySource;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoPipStateHolderExt.kt */
/* loaded from: classes16.dex */
public final class q3t0 {

    /* compiled from: VideoPipStateHolderExt.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((VideoPipStateHolder) this.receiver).getClass();
            VideoPipStateHolder.a();
            return s3q0.a;
        }
    }

    public static final void a(VideoPipStateHolder videoPipStateHolder, VideoGrowthComponent videoGrowthComponent, long j, Context context, VideoGrowthCommunitySource videoGrowthCommunitySource) {
        videoPipStateHolder.getClass();
        yg5 c = VideoPipStateHolder.c();
        VideoFile A = c != null ? c.A() : null;
        String a1 = A != null ? A.a1() : null;
        Long valueOf = c != null ? Long.valueOf(c.getPosition()) : null;
        VideoGrowthVideoParams videoGrowthVideoParams = (a1 == null || valueOf == null) ? null : new VideoGrowthVideoParams(a1, valueOf.longValue(), false, false, 12, null);
        if (videoGrowthComponent != null) {
            videoGrowthComponent.B6().b(context, videoGrowthVideoParams, j, videoGrowthCommunitySource, new a(0, VideoPipStateHolder.a, VideoPipStateHolder.class, "forceClosePip", "forceClosePip()V", 0));
        }
    }
}
