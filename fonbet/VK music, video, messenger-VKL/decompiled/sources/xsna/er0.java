package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosOrder;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.related_videos.m;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.lj40;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class er0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ er0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        com.vk.video.ui.discovery.minimizable.related_videos.m a;
        switch (this.b) {
            case 0:
                fm50 fm50Var = (fm50) this.d;
                hr0 hr0Var = (hr0) this.e;
                izs<? super kq0, s3q0> izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(427161325, intValue, -1, "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (AdditionalSettingsContentView.kt:83)");
                    }
                    if (fm50Var instanceof is0) {
                        aVar.K(-424972715);
                        hr0Var.j((is0) fm50Var, izsVar, aVar, 512);
                        aVar.j();
                    } else {
                        aVar.K(fm50Var instanceof js0 ? -424818645 : -429043883);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                izs izsVar2 = (izs) this.c;
                lj40 lj40Var = (lj40) this.d;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1651885387, intValue2, -1, "com.vk.music.offline.ui.presentation.MusicSettingsView.<anonymous>.<anonymous> (MusicDownloadsSettingsView.kt:64)");
                    }
                    q630.a aVar3 = q630.a.a;
                    q630 D = p490.D(txj0.d(aVar3, 1.0f), p490.x(aVar2), 14);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c = qri.c(aVar2, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a2, cri.a.f);
                    k9q0.w(aVar2, D2, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    kj40.c(d370.N(R.string.downloads_settings_common, 0, aVar2).toUpperCase(sta0.a.b().c().a), ahn.E(aVar3, "downloads_settings_header"), aVar2, 48);
                    boolean z = lj40Var.b;
                    boolean J = aVar2.J(izsVar2);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new fr0(izsVar2, 5);
                        aVar2.R(x);
                    }
                    kj40.d(0, aVar2, (gzs) x, null, z);
                    lj40.a aVar5 = lj40Var.c;
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = new u1k(1, wh50Var);
                        aVar2.R(x2);
                    }
                    kj40.b(aVar5, null, (gzs) x2, aVar2, 384);
                    aVar2.G();
                    if (((Boolean) wh50Var.getValue()).booleanValue()) {
                        aVar2.K(418589482);
                        Object x3 = aVar2.x();
                        if (x3 == c0012a) {
                            x3 = new tju(wh50Var, 10);
                            aVar2.R(x3);
                        }
                        gzs gzsVar = (gzs) x3;
                        boolean J2 = aVar2.J(izsVar2);
                        Object x4 = aVar2.x();
                        if (J2 || x4 == c0012a) {
                            x4 = new j97(izsVar2, 5);
                            aVar2.R(x4);
                        }
                        kj40.a(gzsVar, (gzs) x4, aVar2, 6);
                    } else {
                        aVar2.K(414336685);
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                f9a0 f9a0Var = (f9a0) this.d;
                Photo photo = (Photo) this.e;
                VKImageView vKImageView = (VKImageView) this.c;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                return f9a0Var.p.a(vKImageView.getHeight(), photo);
            default:
                o5t0 o5t0Var = (o5t0) this.d;
                VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist = (VideoDiscoveryRelatedVideosSourceArgs.Playlist) this.e;
                com.vk.video.ui.discovery.minimizable.related_videos.k kVar = (com.vk.video.ui.discovery.minimizable.related_videos.k) this.c;
                rbt0 rbt0Var = (rbt0) obj;
                VideoFile videoFile = (VideoFile) obj2;
                VideoFile videoFile2 = (VideoFile) obj3;
                VideoDiscoveryRelatedVideosSource.Playlist playlist2 = new VideoDiscoveryRelatedVideosSource.Playlist(o5t0Var.a, o5t0Var.b, playlist.j);
                if (rbt0Var.e) {
                    a = new m.b(false);
                } else {
                    m.c cVar = m.c.a;
                    Integer num = playlist.g;
                    a = com.vk.video.ui.discovery.minimizable.related_videos.n.a(cVar, num != null ? num.intValue() : playlist.c, rbt0Var, kVar.d, null, null);
                }
                com.vk.video.ui.discovery.minimizable.related_videos.m mVar2 = a;
                VideoRelatedVideosOrder videoRelatedVideosOrder = playlist.l;
                return new c.s0.d(new mgs0(playlist2, mVar2, videoFile, videoFile2, videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Reverse, videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Shuffled));
        }
    }

    public /* synthetic */ er0(izs izsVar, lj40 lj40Var, wh50 wh50Var) {
        this.b = 1;
        this.c = izsVar;
        this.d = lj40Var;
        this.e = wh50Var;
    }
}
