package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment;
import com.vk.catalog2.feature.music.ui.fragment.audiobook.AudioBookPersonCatalogFragment;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.EditPlaylistFragment;
import com.vk.music.fragment.impl.MusicCuratorCatalogFragment;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment;
import com.vk.music.playlist.display.audiobook.offline.presentation.fragment.OfflineAudioBookChaptersFragment;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.fragment.OfflinePodcastEpisodesFragment;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.music.snippet.ui.presentation.MusicSnippetsFragment;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.k840;
import xsna.ka40;
import xsna.s550;
import xsna.wym0;

/* compiled from: CommonAudioBridge.kt */
/* loaded from: classes11.dex */
public final class khg implements fl4 {
    public final zk40 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public khg(int i) {
        xb3 xb3Var = new xb3(3);
        this.b = new zk40();
        z56 z56Var = new z56(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, z56Var);
        this.d = msy.a(lazyThreadSafetyMode, new ihg(0));
        this.e = msy.a(lazyThreadSafetyMode, xb3Var);
        this.f = msy.a(lazyThreadSafetyMode, new jhg(this, 0));
        this.g = msy.a(lazyThreadSafetyMode, new ag7(1));
    }

    @Override // xsna.fl4
    public final void A() {
        k840.a.g().b().q0();
    }

    @Override // xsna.fl4
    public final void B() {
        bzu.c = false;
    }

    @Override // xsna.fl4
    public final io.reactivex.rxjava3.disposables.c C(Context context, List<? extends Pair<String, ? extends List<Integer>>> list, int i, Object obj) {
        e4b0 e = jvi.e(context, list);
        e.c(i);
        e.a();
        return e.b((MusicPlaybackLaunchContext) obj);
    }

    @Override // xsna.fl4
    public final io.reactivex.rxjava3.disposables.c D(String str, gzs gzsVar, boolean z) {
        return x870.a.c(str, z, gzsVar, new pr0(24));
    }

    @Override // xsna.fl4
    public final void E(Activity activity, UserId userId) {
        int i = ArticleAuthorPageFragment.a.m;
        ArticleAuthorPageFragment.a.C0378a.a(userId).k(activity);
    }

    @Override // xsna.fl4
    public final void G(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        AudioBookPersonCatalogFragment.a aVar = new AudioBookPersonCatalogFragment.a(i);
        aVar.C(musicPlaybackLaunchContext.t());
        aVar.B(musicPlaybackLaunchContext.Gb());
        aVar.k(context);
    }

    @Override // xsna.fl4
    public final void H(Context context, Artist artist) {
        Activity h = e3m.h(context);
        if (h != null) {
            String str = ka40.B;
            ka40.a.f(h, Collections.singletonList(artist), null, MusicPlaybackLaunchContext.d.Cb(jnj.a(qv20.c(artist))), null);
        }
    }

    @Override // xsna.fl4
    public final void I(Context context, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        Activity h = e3m.h(context);
        if (h != null) {
            String str = ka40.B;
            ka40.a.e(h, playlist, musicPlaybackLaunchContext);
        }
    }

    @Override // xsna.fl4
    public final void J(Activity activity, UserId userId, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
        OfflinePodcastEpisodesFragment.a aVar = new OfflinePodcastEpisodesFragment.a(userId, str);
        aVar.z(musicPlaybackLaunchContext.t());
        aVar.y(musicPlaybackLaunchContext.Gb());
        aVar.k(activity);
    }

    @Override // xsna.fl4
    public final void K(Context context, VideoFile videoFile, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        Activity h = e3m.h(context);
        if (h != null) {
            String str = ka40.B;
            ka40.a.a(h, videoFile, MusicPlaybackLaunchContext.d, searchStatsLoggingInfo);
        }
    }

    @Override // xsna.fl4
    public final void L(Activity activity, VideoFile videoFile) {
        Activity h = e3m.h(activity);
        if (h != null) {
            String str = ka40.B;
            ka40.a.c(h, videoFile, MusicPlaybackLaunchContext.d);
        }
    }

    @Override // xsna.fl4
    public final void M(Context context, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, Boolean bool) {
        StringBuilder b = v1v.b(MusicCatalogRootVh.class.getCanonicalName(), '_');
        b.append(UUID.randomUUID());
        String sb = b.toString();
        CatalogShowAllFragment.a aVar = new CatalogShowAllFragment.a();
        aVar.C(sb);
        aVar.F(s550.a.a(bool, str));
        aVar.E(searchStatsLoggingInfo);
        aVar.k(context);
    }

    @Override // xsna.fl4
    public final void N(Activity activity) {
        MusicOfflineCatalogFragment.a aVar = new MusicOfflineCatalogFragment.a();
        if (k840.a.h()) {
            StringBuilder sb = new StringBuilder();
            String str = vm40.a;
            sb.append(vm40.b());
            sb.append("?view_context=kids_section");
            MusicOfflineCatalogFragment.a.y(aVar, sb.toString());
        }
        aVar.k(activity);
    }

    @Override // xsna.fl4
    public final void O(Context context, UserId userId, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicTrack.AssistantData assistantData) {
        PodcastEpisodeFragment.a aVar = new PodcastEpisodeFragment.a(userId, i);
        aVar.y(assistantData);
        aVar.B(musicPlaybackLaunchContext.t());
        aVar.z(musicPlaybackLaunchContext.Gb());
        aVar.k(context);
    }

    @Override // xsna.fl4
    public final void P() {
        bzu.c = true;
    }

    @Override // xsna.fl4
    public final void Q(Context context) {
        new MusicDownloadsSettingsFragment.a().k(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fl4
    public final y050 U() {
        return (y050) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fl4
    public final r24 a() {
        return (r24) this.d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [android.content.Context] */
    public final void b(Context context, boolean z) {
        Intent intent;
        Handler handler = x93.a;
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            b = context != null ? e3m.h(context) : null;
            if (b == null) {
                ?? r6 = e43.a;
                b = r6 != 0 ? r6 : null;
            }
        }
        Activity b2 = c63.b();
        Class<?> cls = b2 != null ? b2.getClass() : null;
        if (cls == null) {
            Activity h = e3m.h(b);
            cls = h != null ? h.getClass() : null;
            if (cls == null) {
                cls = MainActivity.class;
            }
        }
        String a = k840.b.a();
        if (a == null) {
            intent = new Intent(b, cls);
            fdi.f(b, intent);
            intent.addFlags(603979776);
        } else {
            Intent intent2 = new Intent(a, null, b, cls);
            fdi.f(b, intent2);
            intent2.addFlags(603979776);
            intent = intent2;
        }
        if (z) {
            intent.putExtra("com.vk.music.common.FLAG_SECURE", true);
        }
        CoreFeatures coreFeatures = CoreFeatures.NAVIGATION_WAIT_BIOMETRICS;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            s57.a.a(new xk(7, this, intent));
        } else {
            q5v0 q5v0Var = k840.a.g;
            (q5v0Var != null ? q5v0Var : null).a(new eqd(intent, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fl4
    public final wk40 g() {
        return (wk40) this.f.getValue();
    }

    @Override // xsna.fl4
    public final boolean h() {
        return k840.a.g().b().h();
    }

    @Override // xsna.fl4
    public final void i(Context context) {
        wym0.a aVar = new wym0.a(context.getString(R.string.music_subscription_push_title), context.getString(R.string.music_subscription_push_text));
        asu0.a.getClass();
        asu0.n().submit(new vr2(4, context, aVar));
    }

    @Override // xsna.fl4
    public final void j(Activity activity, MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, MusicBottomSheetActionTracker musicBottomSheetActionTracker) {
        w().l(activity, musicPlaybackLaunchContext, playlist, musicBottomSheetLaunchPoint, musicBottomSheetActionTracker);
    }

    @Override // xsna.fl4
    public final void k(Activity activity, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
        if (musicTrack.B()) {
            com.vk.music.notifications.restriction.a aVar = k840.a.d;
            if (aVar == null) {
                aVar = null;
            }
            aVar.g(musicTrack);
            return;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            new z550(activity, musicTrack, musicPlaybackLaunchContext, str).show();
        }
    }

    @Override // xsna.fl4
    public final void l(Context context, String str) {
        Activity h = e3m.h(context);
        if (h != null) {
            new MusicCuratorCatalogFragment.a(str).k(h);
        }
    }

    @Override // xsna.fl4
    public final void m(Activity activity, MusicTrack musicTrack, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        new ea40(g()).a(activity, musicTrack, musicPlaybackLaunchContext, z);
    }

    @Override // xsna.fl4
    public final void n(Context context) {
        new MusicSnippetsFragment.a().k(context);
    }

    @Override // xsna.fl4
    public final void o(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
        OfflineAudioBookChaptersFragment.a aVar = new OfflineAudioBookChaptersFragment.a(i, str);
        aVar.z(musicPlaybackLaunchContext.t());
        aVar.y(musicPlaybackLaunchContext.Gb());
        aVar.k(context);
    }

    @Override // xsna.fl4
    public final void q(Activity activity, String str, String str2) {
        StringBuilder b = v1v.b(MusicCatalogRootVh.class.getCanonicalName(), '_');
        b.append(UUID.randomUUID());
        String sb = b.toString();
        CatalogShowAllFragment.a aVar = new CatalogShowAllFragment.a();
        aVar.C(sb);
        aVar.F(str);
        aVar.D(str2);
        aVar.k(activity);
    }

    @Override // xsna.fl4
    public final void r(Activity activity, MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        Activity h = e3m.h(activity);
        if (h != null) {
            String str = ka40.B;
            ka40.a.d(h, musicTrack, musicPlaybackLaunchContext);
        }
    }

    @Override // xsna.fl4
    public final void s(Context context, int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        DisplayAudioBookChaptersFragment.a aVar = new DisplayAudioBookChaptersFragment.a(i);
        aVar.z(musicPlaybackLaunchContext.t());
        aVar.y(musicPlaybackLaunchContext.Gb());
        aVar.k(context);
    }

    @Override // xsna.fl4
    public final void t(Activity activity) {
        this.b.getClass();
        yk40 yk40Var = new yk40();
        String str = vm40.a;
        yk40Var.b(vm40.a(), true);
        yk40Var.B(activity);
    }

    @Override // xsna.fl4
    public final void u(Context context, Playlist playlist) {
        EditPlaylistFragment.a aVar = new EditPlaylistFragment.a();
        aVar.y(playlist);
        aVar.k(context);
    }

    @Override // xsna.fl4
    public final void v(Context context, UserId userId, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        PodcastFragment.a aVar = new PodcastFragment.a(userId);
        aVar.z(musicPlaybackLaunchContext.t());
        aVar.y(musicPlaybackLaunchContext.Gb());
        aVar.k(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fl4
    public final ic40 w() {
        return (ic40) this.e.getValue();
    }

    @Override // xsna.fl4
    public final void x(Context context, boolean z) {
        u2b0 b = k840.a.g().b();
        if (b.m0().i()) {
            b.v1(new hhg(this, z));
        } else {
            b(context, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fl4
    public final a550 z() {
        return (a550) this.c.getValue();
    }
}
