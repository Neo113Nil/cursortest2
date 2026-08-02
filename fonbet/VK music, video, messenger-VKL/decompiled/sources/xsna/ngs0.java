package xsna;

import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import kotlin.NoWhenBranchMatchedException;
import xsna.l5t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ngs0 implements io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ com.vk.video.ui.discovery.minimizable.related_videos.c b;
    public final /* synthetic */ VideoDiscoveryRelatedVideosSourceArgs c;
    public final /* synthetic */ int d;

    public /* synthetic */ ngs0(com.vk.video.ui.discovery.minimizable.related_videos.c cVar, VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs, int i) {
        this.b = cVar;
        this.c = videoDiscoveryRelatedVideosSourceArgs;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
        io.reactivex.rxjava3.core.x<VideoListWithTotalCount> xVar;
        com.vk.video.ui.discovery.minimizable.related_videos.d dVar = this.b.a;
        skj0 skj0Var = new skj0(yVar, 10);
        io.reactivex.rxjava3.disposables.c cVar = dVar.b;
        if (cVar != null) {
            cVar.dispose();
        }
        dVar.a();
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = this.c;
        String a1 = videoDiscoveryRelatedVideosSourceArgs.b.a1();
        if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist) {
            xVar = dVar.d((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs, new l5t0.a(a1, 50), this.d);
        } else {
            if (!(videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist)) {
                throw new NoWhenBranchMatchedException();
            }
            xVar = io.reactivex.rxjava3.internal.operators.single.a0.b;
        }
        dVar.b = io.reactivex.rxjava3.kotlin.c.e(xVar, new z8l0(skj0Var, 11), new jan0(skj0Var, dVar));
    }
}
