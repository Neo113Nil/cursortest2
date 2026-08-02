package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyList;
import xsna.cct0;
import xsna.dct0;
import xsna.hct0;
import xsna.jct0;

/* compiled from: VideoRelatedVideosMoreActionsFeature.kt */
/* loaded from: classes7.dex */
public final class gct0 extends wk50<lct0, kct0, dct0, hct0> {
    public final b25 f;
    public final cpu g;
    public final f4z h;

    public gct0(VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource, rcg0 rcg0Var, b25 b25Var, cpu cpuVar) {
        super(new dct0.a(videoDiscoveryRelatedVideosSource), new ict0(new kct0(videoDiscoveryRelatedVideosSource, EmptyList.b)));
        this.f = b25Var;
        this.g = cpuVar;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(kct0 kct0Var, dct0 dct0Var) {
        List l;
        dct0 dct0Var2 = dct0Var;
        VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = kct0Var.b;
        if (dct0Var2 instanceof dct0.a) {
            VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource2 = ((dct0.a) dct0Var2).b;
            if (videoDiscoveryRelatedVideosSource2 instanceof VideoDiscoveryRelatedVideosSource.Playlist) {
                VideoAlbum videoAlbum = ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource2).b;
                if (this.g.a(videoAlbum.c)) {
                    l = videoAlbum.f == 0 ? e43.l(cct0.c.C2657c.b, cct0.a.b, cct0.c.d.b, cct0.c.b.b) : e43.l(cct0.a.b, cct0.c.d.b, cct0.c.b.b);
                } else {
                    l = e43.l(cct0.b.b, videoAlbum.l ? cct0.c.f.b : cct0.c.e.b, cct0.a.b, cct0.c.d.b);
                }
                T(new hct0.a(l));
                return;
            }
            return;
        }
        if (!(dct0Var2 instanceof dct0.b)) {
            if (!dct0Var2.equals(dct0.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new NotImplementedError();
        }
        cct0 cct0Var = ((dct0.b) dct0Var2).b;
        boolean f = epx.f(cct0Var, cct0.a.b);
        f4z f4zVar = this.h;
        if (f) {
            String Eb = videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist ? ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource).b.Eb() : null;
            if (Eb != null) {
                f4zVar.b(new jct0.a(Eb));
                return;
            }
            return;
        }
        if (epx.f(cct0Var, cct0.b.b)) {
            UserId userId = videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist ? ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource).b.c : null;
            if (userId != null) {
                f4zVar.b(new jct0.c(userId));
                return;
            }
            return;
        }
        if (!(cct0Var instanceof cct0.c)) {
            throw new NoWhenBranchMatchedException();
        }
        VideoAlbum videoAlbum2 = videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist ? ((VideoDiscoveryRelatedVideosSource.Playlist) videoDiscoveryRelatedVideosSource).b : null;
        if (videoAlbum2 != null) {
            cct0.c cVar = (cct0.c) cct0Var;
            if (epx.f(cVar, cct0.c.a.b)) {
                f4zVar.b(new jct0.d.a(videoAlbum2));
                return;
            }
            if (epx.f(cVar, cct0.c.b.b)) {
                f4zVar.b(new jct0.d.c(videoAlbum2));
                return;
            }
            if (epx.f(cVar, cct0.c.C2657c.b)) {
                f4zVar.b(new jct0.d.b(videoAlbum2));
                return;
            }
            if (epx.f(cVar, cct0.c.d.b)) {
                f4zVar.b(new jct0.d.C3116d(videoAlbum2));
                return;
            }
            if (epx.f(cVar, cct0.c.e.b)) {
                f4zVar.b(new jct0.d.f(videoAlbum2));
            } else if (epx.f(cVar, cct0.c.f.b)) {
                f4zVar.b(new jct0.d.g(videoAlbum2));
            } else {
                if (!epx.f(cVar, cct0.c.g.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new jct0.d.e(videoAlbum2));
            }
        }
    }
}
