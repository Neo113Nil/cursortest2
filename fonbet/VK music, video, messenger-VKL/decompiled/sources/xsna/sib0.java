package xsna;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.di.PodcastBottomSheetHeaderComponent;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.podcast.impl.ui.list.PodcastEpisodesListFragment;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.k840;
import xsna.v4a;
import xsna.xl40;
import xsna.ykb0;

/* compiled from: PodcastPresenter.kt */
/* loaded from: classes3.dex */
public final class sib0 implements gjb0, c.l<ykb0.a> {
    public final PodcastFragment b;
    public final phb0 c;
    public final w950 d;
    public final xl40 e;
    public final mzp0 f;
    public boolean h;
    public boolean i;
    public ej90 j;
    public PodcastInfo k;
    public com.vk.lists.c q;
    public boolean g = true;
    public MusicPlaybackLaunchContext l = MusicPlaybackLaunchContext.d;
    public final ArrayList<MusicTrack> m = new ArrayList<>(200);
    public final ListDataSet<zif0> n = new ListDataSet<>();
    public UserId o = UserId.d;
    public final u2b0 p = k840.a.g().b();
    public final io.reactivex.rxjava3.disposables.b r = new io.reactivex.rxjava3.disposables.b();

    public sib0(PodcastFragment podcastFragment, phb0 phb0Var, w950 w950Var, xl40 xl40Var, mzp0 mzp0Var) {
        this.b = podcastFragment;
        this.c = phb0Var;
        this.d = w950Var;
        this.e = xl40Var;
        this.f = mzp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(VKList vKList) {
        ArrayList arrayList = new ArrayList(vKList.size());
        int size = vKList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new eib0((MusicTrack) vKList.get(i), 5));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gjb0
    public final void E0() {
        PodcastInfo podcastInfo = this.k;
        PodcastFragment podcastFragment = this.b;
        FragmentActivity activity = podcastFragment.getActivity();
        if (activity == null) {
            return;
        }
        new aib0(podcastFragment.Z, podcastInfo, new xd40(podcastFragment, 8), ((xl40) podcastFragment.X.getValue()).isEnabled().getValue().booleanValue()).d(activity);
    }

    @Override // xsna.gjb0
    public final void E1() {
        FragmentActivity activity = this.b.getActivity();
        if (activity != null) {
            xl40.a aVar = xl40.a;
            this.e.a(activity);
        }
    }

    @Override // xsna.gjb0
    public final void F(Bundle bundle) {
        if (bundle != null) {
            UserId userId = (UserId) bundle.getParcelable("owner_id");
            if (userId == null) {
                userId = UserId.d;
            }
            this.o = userId;
            String string = bundle.getString("ref", MusicPlaybackLaunchContext.d.t());
            String string2 = bundle.getString("launch_origin");
            if (string2 == null) {
                string2 = "unknown";
            }
            this.l = MusicPlaybackLaunchContext.Fb(string).Cb(string2);
        }
    }

    @Override // xsna.gjb0
    public final com.vk.music.player.f H() {
        return this.p.H();
    }

    @Override // xsna.gjb0
    public final void H5(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        int i;
        Episode episode = musicTrack.w;
        int i2 = 0;
        if (episode != null && (i = (int) episode.d) >= 0) {
            i2 = i;
        }
        this.p.N0(new lqk0((StartPlaySource) null, musicTrack, this.m, musicPlaybackLaunchContext, i2, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 977));
    }

    @Override // xsna.gjb0
    public final boolean I6() {
        return this.i && !g7();
    }

    @Override // xsna.gjb0
    public final void K1(b140 b140Var, fa00 fa00Var) {
        io.reactivex.rxjava3.core.a c;
        boolean z = this.g;
        phb0 phb0Var = this.c;
        if (z) {
            UserId userId = this.o;
            PodcastInfo podcastInfo = this.k;
            c = phb0Var.b(userId, podcastInfo != null ? Integer.valueOf(podcastInfo.n) : null, this.l.Gb(), this.l.Lb());
        } else {
            UserId userId2 = this.o;
            PodcastInfo podcastInfo2 = this.k;
            c = phb0Var.c(userId2, podcastInfo2 != null ? Integer.valueOf(podcastInfo2.n) : null, this.l.Gb(), this.l.Lb());
        }
        UserId userId3 = this.o;
        com.vk.lists.c cVar = this.q;
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new ykb0(0, userId3, cVar != null ? cVar.k() : 100, this.l.Lb()), null, null, 3);
        UserId userId4 = this.o;
        b.d dVar = new b.d(this.g ? "subscribe_to_podcast_page" : "unsubscribe_from_podcast_page");
        dVar.b(Long.valueOf(userId4.b), "podcast_id");
        dVar.e();
        this.b.eo(com.vkontakte.android.data.b.d().L(new v34(new defpackage.v(18, c, y0), 23), false).C(new rib0()).subscribe(new q440(new bv1(28, this, b140Var), 12), new oo20(new pb00(fa00Var, 15), 13)));
    }

    @Override // xsna.gjb0
    public final void L() {
        com.vk.lists.c cVar = this.q;
        if (cVar != null) {
            cVar.p(false);
        }
    }

    @Override // xsna.gjb0
    public final void P0() {
        UserId userId = this.o;
        PodcastEpisodesListFragment.a aVar = new PodcastEpisodesListFragment.a(PodcastEpisodesListFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("owner_id", userId);
        bundle.putString("arg_episodes_order", "popular");
        aVar.l(this.b);
    }

    @Override // xsna.gjb0
    public final boolean U() {
        return !this.g;
    }

    @Override // xsna.gjb0
    public final void V4(MusicTrack musicTrack) {
        UserId userId = musicTrack.c;
        int i = musicTrack.b;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.l;
        String str = musicTrack.y;
        PodcastEpisodeFragment.a aVar = new PodcastEpisodeFragment.a(userId, i);
        aVar.C(str);
        aVar.B(musicPlaybackLaunchContext.t());
        aVar.z(musicPlaybackLaunchContext.Gb());
        aVar.l(this.b);
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.gm6
    public final void d() {
        s0d0 s0d0Var = new s0d0() { // from class: xsna.oib0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                Thumb Jb;
                sib0 sib0Var = sib0.this;
                zif0 c = sib0Var.n.c(i);
                eib0 eib0Var = c instanceof eib0 ? (eib0) c : null;
                MusicTrack musicTrack = eib0Var != null ? eib0Var.a : null;
                MusicTrack musicTrack2 = musicTrack instanceof MusicTrack ? musicTrack : null;
                if (musicTrack2 != null && (Jb = musicTrack2.Jb()) != null) {
                    int a = iah0.a(72.0f);
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    String Ab = Jb.Ab(a, false);
                    if (Ab != null) {
                        io.reactivex.rxjava3.disposables.c subscribe = mcr0.s(Ab).subscribe();
                        sib0Var.b.eo(subscribe);
                        return new v0d0(subscribe);
                    }
                }
                return u0d0.a;
            }
        };
        v4a.a aVar = new v4a.a();
        aVar.b = true;
        by2 by2Var = new by2(R.string.music_playlist_not_found, 12, null);
        SparseArray<by2> sparseArray = aVar.a;
        sparseArray.put(104, by2Var);
        sparseArray.put(15, new by2(R.string.music_playlist_access_denied, 12, null));
        v4a a = aVar.a();
        PodcastFragment podcastFragment = this.b;
        zhb0 zhb0Var = podcastFragment.f0;
        PodcastFragment.b bVar = podcastFragment.l0;
        com.vk.lists.c cVar = new com.vk.lists.c(this, null, zhb0Var, new v1d0(33, s0d0Var), true, 33, true, 100, 100, null, "0", a, null, null, false, false, true, true, true);
        cVar.b(bVar, true, true, 0L, null);
        this.q = cVar;
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        this.r.b(new io.reactivex.rxjava3.internal.operators.observable.i0(r5v0Var.a.a.b0(ib50.class), new kxa0(new tcu(19), 2)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new g600(new t440(this, 10), 13)));
    }

    @Override // xsna.gjb0
    public final void f4(MusicTrack musicTrack) {
        DownloadingState downloadingState = musicTrack.J;
        boolean f = epx.f(downloadingState, DownloadingState.NotLoaded.b);
        PodcastFragment podcastFragment = this.b;
        if (f) {
            PodcastInfo podcastInfo = this.k;
            FragmentActivity activity = podcastFragment.getActivity();
            if (podcastInfo == null || activity == null) {
                return;
            }
            k840.a.d().U(activity, podcastInfo, musicTrack);
            return;
        }
        if (!epx.f(downloadingState, DownloadingState.Corrupted.b) && !epx.f(downloadingState, DownloadingState.Downloaded.b) && !(downloadingState instanceof DownloadingState.Downloading) && !epx.f(downloadingState, DownloadingState.PartlyDownloaded.b) && !epx.f(downloadingState, DownloadingState.PendingDownload.b)) {
            throw new NoWhenBranchMatchedException();
        }
        podcastFragment.ko(musicTrack, MusicBottomSheetLaunchPoint.Delete.b);
    }

    @Override // xsna.gjb0
    public final boolean g7() {
        return this.l.Gb().equals("kids_section");
    }

    @Override // xsna.gjb0
    public final MusicPlaybackLaunchContext h4() {
        return this.l;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<ykb0.a> hj(com.vk.lists.c cVar, boolean z) {
        cVar.r(true);
        return ui(0, cVar).U(new b9(new owv(this, 26), 29));
    }

    @Override // xsna.gjb0
    public final PlayState m0() {
        return this.p.m0();
    }

    @Override // xsna.gjb0
    public final void m7() {
        this.b.finish();
    }

    @Override // xsna.gjb0
    public final void n0(com.vk.music.player.e eVar) {
        this.p.n0(eVar);
    }

    @Override // xsna.gjb0
    public final void n3(final b810 b810Var, h440 h440Var) {
        final boolean z = !this.h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.o);
        sb.append('_');
        PodcastInfo podcastInfo = this.k;
        sb.append(podcastInfo != null ? Integer.valueOf(podcastInfo.n) : null);
        String sb2 = sb.toString();
        boolean z2 = this.h;
        phb0 phb0Var = this.c;
        io.reactivex.rxjava3.core.a d = z2 ? phb0Var.d(sb2) : phb0Var.a(sb2);
        asu0 asu0Var = asu0.a;
        this.b.eo(d.q(asu0Var.c()).o(asu0Var.d()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.qib0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                sib0 sib0Var = sib0.this;
                boolean z3 = z;
                sib0Var.h = z3;
                b810Var.invoke(Boolean.valueOf(z3));
            }
        }, new d750(new hb40(h440Var, 9), 4)));
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        this.r.e();
    }

    @Override // xsna.gjb0
    public final boolean r6() {
        return this.e.isEnabled().getValue().booleanValue();
    }

    @Override // xsna.gjb0
    public final boolean r7() {
        return this.h && !g7();
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<ykb0.a> ui(int i, com.vk.lists.c cVar) {
        mzp0 mzp0Var = this.f;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        return rsg0.T(new ykb0(i, this.o, cVar.k(), this.l.Lb())).U(new xq70(new amp(19), 4)).a0(asu0.a.d());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gjb0
    public final void v3(int i) {
        fib0 fib0Var;
        PodcastFragment podcastFragment = this.b;
        if (i == R.id.music_action_go_to_community) {
            if (g7()) {
                FragmentActivity activity = podcastFragment.getActivity();
                if (activity == null) {
                    return;
                }
                i0q0.f(new i3r(activity, 2));
                return;
            }
            UserId userId = this.o;
            FragmentActivity activity2 = podcastFragment.getActivity();
            if (activity2 == null) {
                return;
            }
            PodcastBottomSheetHeaderComponent podcastBottomSheetHeaderComponent = (PodcastBottomSheetHeaderComponent) podcastFragment.V.getValue();
            long j = userId.b;
            podcastFragment.requireArguments().getString("ref");
            podcastBottomSheetHeaderComponent.R3(j, activity2);
            return;
        }
        if (i == R.id.music_action_share) {
            UserId userId2 = this.o;
            FragmentActivity activity3 = podcastFragment.getActivity();
            if (activity3 == null) {
                return;
            }
            kbj0.c((kbj0) podcastFragment.W.getValue(), activity3, "https://" + a0a.d + "/podcasts" + userId2.b, false, null, null, false, 120);
            return;
        }
        if (i != R.id.music_action_copy_link) {
            if (i != R.id.music_action_podcast_unsubscribe || (fib0Var = podcastFragment.g0) == null) {
                return;
            }
            fib0Var.b();
            return;
        }
        UserId userId3 = this.o;
        FragmentActivity activity4 = podcastFragment.getActivity();
        if (activity4 == null) {
            return;
        }
        mhy.a(activity4, "https://" + a0a.d + "/podcasts" + userId3.b);
        cvk.u(R.string.link_copied, false);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<ykb0.a> qVar, boolean z, com.vk.lists.c cVar) {
        this.b.eo(qVar.subscribe(new o3y(new al7(this, z, cVar), 13), new sl30(new zl20(this, 18), 12)));
    }

    @Override // xsna.gjb0
    public final void x5(MusicTrack musicTrack) {
        this.b.ko(musicTrack, MusicBottomSheetLaunchPoint.App.b);
    }

    @Override // xsna.gjb0
    public final void y2(com.vk.music.player.e eVar) {
        this.p.P0(eVar, true);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
