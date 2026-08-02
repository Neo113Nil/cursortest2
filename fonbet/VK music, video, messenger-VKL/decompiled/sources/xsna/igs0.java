package xsna;

import android.content.Context;
import androidx.recyclerview.widget.t0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoSimilarVideosTitleRedesignDelegate;
import com.vk.video.ui.discovery.minimizable.preinflate.DiscoveryAsyncPrefetch;
import kotlin.collections.builders.MapBuilder;

/* compiled from: VideoDiscoveryPrefetchItemsConfig.kt */
/* loaded from: classes7.dex */
public final class igs0 {
    public final egs0 a;

    public igs0(egs0 egs0Var) {
        this.a = egs0Var;
    }

    public static q0w0 a(Context context, kfs0 kfs0Var, DiscoveryAsyncPrefetch discoveryAsyncPrefetch) {
        MapBuilder mapBuilder = new MapBuilder();
        int i = 0;
        for (Object obj : kfs0Var.p) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            p1u0 p1u0Var = (p1u0) obj;
            if ((p1u0Var instanceof unj0) || (p1u0Var instanceof wnj0) || (p1u0Var instanceof com.vk.libvideo.bottomsheet.about.delegate.x) || (p1u0Var instanceof com.vk.libvideo.bottomsheet.about.delegate.w) || (p1u0Var instanceof com.vk.libvideo.bottomsheet.about.delegate.z)) {
                mapBuilder.put(Integer.valueOf(i), 10);
            } else if (p1u0Var instanceof com.vk.libvideo.bottomsheet.about.delegate.y) {
                mapBuilder.put(Integer.valueOf(i), 4);
            } else if ((p1u0Var instanceof w4) || (p1u0Var instanceof com.vk.libvideo.bottomsheet.about.delegate.b) || (p1u0Var instanceof n1k0) || (p1u0Var instanceof AboutVideoSimilarVideosTitleRedesignDelegate) || (p1u0Var instanceof tg0) || (p1u0Var instanceof cd0)) {
                mapBuilder.put(Integer.valueOf(i), 1);
            }
            i = i2;
        }
        MapBuilder h = mapBuilder.h();
        return new q0w0(new t0.b(discoveryAsyncPrefetch == DiscoveryAsyncPrefetch.VIEW_HOLDER ? 5 : 3, 0, h, context, qjg.a(kfs0Var), new mcj0(kfs0Var, 20), new bjm0(h, 9), PsExtractor.AUDIO_STREAM));
    }
}
