package xsna;

import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vkontakte.android.data.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a7f0;
import xsna.o0r0;

/* compiled from: PodcastEpisodeFragment.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class vgb0 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgb0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        com.vk.music.podcast.impl.ui.episode.b bVar;
        PodcastPage podcastPage;
        MusicTrack musicTrack;
        int i = 8;
        int i2 = 2;
        switch (this.b) {
            case 0:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) this.receiver;
                VkTopBar vkTopBar = podcastEpisodeFragment.Y;
                if (vkTopBar != null && (bVar = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S) != null && (podcastPage = bVar.e) != null && (musicTrack = podcastPage.b) != null) {
                    if (jnj.d(musicTrack.V)) {
                        i0q0.f(new i3r(vkTopBar.getContext(), 2));
                    } else {
                        String Fb = musicTrack.Fb();
                        com.vk.music.podcast.impl.ui.episode.b bVar2 = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S;
                        String t = bVar2 != null ? bVar2.n().t() : null;
                        String str = musicTrack.y;
                        b.d dVar = new b.d("podcast_to_author");
                        dVar.b(t, "ref");
                        dVar.b(Fb, "audio_id");
                        dVar.b(str, "track_code");
                        dVar.e();
                        ((o0r0) podcastEpisodeFragment.l0.getValue()).m(vkTopBar.getContext(), musicTrack.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    }
                }
                break;
            case 1:
                ((uzh0) this.receiver).b();
                break;
            case 2:
                ((g3a) this.receiver).d();
                break;
            case 3:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) this.receiver;
                int i3 = VideoCatalogRootVh.M0;
                videoCatalogRootVh.q0(false);
                VkImage vkImage = videoCatalogRootVh.j0.f;
                if (vkImage != null) {
                    vkImage.setVisibility(8);
                }
                break;
            default:
                plx0 plx0Var = (plx0) this.receiver;
                bpn0 bpn0Var = plx0Var.h;
                ilx0 ilx0Var = (ilx0) bpn0Var.getValue();
                ilx0Var.getClass();
                com.vk.voip.ui.c.b.getClass();
                u4x0 u4x0Var = com.vk.voip.ui.c.Y;
                int i4 = 24;
                io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(u4x0Var.f(), new a4x0(new d4r(i4), i2));
                io.reactivex.rxjava3.internal.operators.observable.y g = u4x0Var.g();
                new d4r(i4);
                io.reactivex.rxjava3.internal.operators.observable.p1 p1Var2 = new io.reactivex.rxjava3.internal.operators.observable.p1(g, new qft0());
                io.reactivex.rxjava3.internal.operators.observable.p1 p1Var3 = new io.reactivex.rxjava3.internal.operators.observable.p1(ilx0Var.b.d(), new i4f0(new lcq0(12), 17));
                io.reactivex.rxjava3.internal.operators.observable.y K0 = com.vk.voip.ui.c.K0();
                new d4r(i4);
                io.reactivex.rxjava3.internal.operators.observable.p1 p1Var4 = new io.reactivex.rxjava3.internal.operators.observable.p1(K0, new kax0());
                io.reactivex.rxjava3.internal.operators.observable.p1 p1Var5 = new io.reactivex.rxjava3.internal.operators.observable.p1(com.vk.voip.ui.c.L0(), new aoq0(new d4r(i4), 6));
                io.reactivex.rxjava3.internal.operators.observable.p1 p1Var6 = new io.reactivex.rxjava3.internal.operators.observable.p1(com.vk.voip.ui.c.M0(), new iyo0(new d4r(i4), 4));
                io.reactivex.rxjava3.internal.operators.observable.p1 p1Var7 = new io.reactivex.rxjava3.internal.operators.observable.p1(com.vk.voip.ui.c.J0(true, new q0s0(i)), new sni0(new d4r(i4), 10));
                io.reactivex.rxjava3.internal.operators.observable.j1 F0 = com.vk.voip.ui.c.F0();
                new dax0(1);
                io.reactivex.rxjava3.internal.operators.observable.n n = io.reactivex.rxjava3.core.q.n(e43.l(p1Var, p1Var2, p1Var3, p1Var4, p1Var5, p1Var6, p1Var7, new io.reactivex.rxjava3.internal.operators.observable.p1(F0, new hlx0())), new hi70(new ixu0(ilx0Var, 9), 21));
                int i5 = 25;
                a7f0.a.e(plx0Var, n, null, new c3k0(plx0Var, i5), null, null, 13);
                ((ilx0) bpn0Var.getValue()).c = new htb0(plx0Var, 1);
                a7f0.a.e(plx0Var, ((klx0) plx0Var.g.getValue()).b(), null, new lzl0(plx0Var, i5), null, null, 13);
                ((com.vk.voip.ui.c) plx0Var.i.getValue()).getClass();
                a7f0.a.e(plx0Var, com.vk.voip.ui.c.H0(true), null, new m2l0(plx0Var, 29), null, null, 13);
                plx0Var.j.a = new olx0(plx0Var);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgb0(Object obj) {
        super(0, obj, PodcastEpisodeFragment.class, "goToAuthor", "goToAuthor()V", 0);
        this.b = 0;
    }
}
