package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.util.Size;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicPreviewUrl;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.music.OnMediaTitleWrapperView;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioPlayMode;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ikv0;
import xsna.k840;
import xsna.ry40;

/* compiled from: OnMediaAudioClickDelegate.kt */
/* loaded from: classes4.dex */
public final class s780 {
    public final cr4 a;
    public final OnMediaAudioComponentProvider b;

    public s780(cr4 cr4Var, OnMediaAudioComponentProvider onMediaAudioComponentProvider) {
        this.a = cr4Var;
        this.b = onMediaAudioComponentProvider;
    }

    public final void a(Context context, MusicTrack musicTrack, String str, v780 v780Var) {
        cr4 cr4Var = this.a;
        boolean i = cr4Var.c().i(musicTrack);
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.b;
        if (i || musicTrack.l) {
            onMediaAudioComponentProvider.c().a(itg0.l(hg1.l(onMediaAudioComponentProvider.c().b(musicTrack, str), context, 62).i(new n780(p780.b, 0))));
            k780 b = onMediaAudioComponentProvider.b();
            Integer a = v780Var.a();
            Long b2 = v780Var.b();
            String i2 = v780Var.i();
            b.getClass();
            k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostAddedAudio(k780.a(a, b2, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO)), i2);
            return;
        }
        if (cr4Var.c().i0(musicTrack)) {
            onMediaAudioComponentProvider.c().a(itg0.l(hg1.l(onMediaAudioComponentProvider.c().l(musicTrack), context, 62).i(new o780(r780.b, 0))));
            k780 b3 = onMediaAudioComponentProvider.b();
            Integer a2 = v780Var.a();
            Long b4 = v780Var.b();
            String i3 = v780Var.i();
            b3.getClass();
            k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostRemovedAudio(k780.a(a2, b4, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO)), i3);
        }
    }

    public final void b(Context context, v780 v780Var) {
        j880 j880Var;
        MusicTrack musicTrack;
        if (v780Var.B()) {
            return;
        }
        if (v780Var instanceof x880) {
            x880 x880Var = (x880) v780Var;
            MusicTrack musicTrack2 = x880Var.j;
            if (musicTrack2 == null) {
                return;
            }
            String str = x880Var.h;
            a(context, musicTrack2, str != null ? str : "", x880Var);
            return;
        }
        if (!(v780Var instanceof s880)) {
            if (!(v780Var instanceof j880) || (musicTrack = (j880Var = (j880) v780Var).h) == null) {
                return;
            }
            String str2 = j880Var.f;
            a(context, musicTrack, str2 != null ? str2 : "", j880Var);
            return;
        }
        s880 s880Var = (s880) v780Var;
        Playlist playlist = s880Var.j;
        String str3 = s880Var.f;
        MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType itemType = s880Var.k;
        if (playlist == null) {
            return;
        }
        boolean z = playlist.g == null;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.b;
        lm4 c = onMediaAudioComponentProvider.c();
        String str4 = s880Var.g;
        c.getClass();
        onMediaAudioComponentProvider.c().a(itg0.l(hg1.l(new io.reactivex.rxjava3.internal.operators.observable.b1(c.c.J(playlist, MusicPlaybackLaunchContext.Fb(str4))), context, 62).i(new y730(q780.b, 5))));
        if (z) {
            k780 b = onMediaAudioComponentProvider.b();
            boolean a = onMediaAudioComponentProvider.a();
            Integer valueOf = Integer.valueOf(playlist.b);
            Long valueOf2 = Long.valueOf(playlist.c.b);
            b.getClass();
            k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostAddedPlaylist(a ? MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.AUTOPLAY : MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.MANUAL, k780.a(valueOf, valueOf2, itemType)), str3);
            return;
        }
        k780 b2 = onMediaAudioComponentProvider.b();
        boolean a2 = onMediaAudioComponentProvider.a();
        Integer valueOf3 = Integer.valueOf(playlist.b);
        Long valueOf4 = Long.valueOf(playlist.c.b);
        b2.getClass();
        k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist(a2 ? MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.AUTOPLAY : MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.MANUAL, k780.a(valueOf3, valueOf4, itemType)), str3);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    public final void c(Context context, NewsEntry newsEntry, v780 v780Var) {
        MusicTrack musicTrack;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.b;
        ?? r2 = onMediaAudioComponentProvider.i;
        onMediaAudioComponentProvider.d().q = true;
        if (v780Var instanceof x880) {
            x880 x880Var = (x880) v780Var;
            onMediaAudioComponentProvider.b().e = true;
            ((w0x) r2.getValue()).d = true;
            onMediaAudioComponentProvider.g().j(28);
            lm4 c = onMediaAudioComponentProvider.c();
            MusicTrack musicTrack2 = x880Var.j;
            EmptyList emptyList = EmptyList.b;
            AdsAudioPixelsContainer adsAudioPixelsContainer = null;
            String str = x880Var.h;
            PostInteract postInteract = x880Var.i;
            int currentPosition = (int) onMediaAudioComponentProvider.f().getCurrentPosition();
            PromoPost promoPost = newsEntry instanceof PromoPost ? (PromoPost) newsEntry : null;
            if (promoPost != null) {
                adsAudioPixelsContainer = promoPost.I;
            }
            c.g(context, musicTrack2, emptyList, str, postInteract, currentPosition, adsAudioPixelsContainer);
            hd60.a().r1(newsEntry);
            k780 b = onMediaAudioComponentProvider.b();
            Integer num = x880Var.d;
            Long l = x880Var.e;
            String str2 = x880Var.f;
            b.getClass();
            k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio(k780.a(num, l, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO)), str2);
            return;
        }
        AdsAudioPixelsContainer adsAudioPixelsContainer2 = null;
        if (v780Var instanceof s880) {
            s880 s880Var = (s880) v780Var;
            Playlist playlist = s880Var.j;
            if (playlist == null) {
                return;
            }
            if (s880Var.b) {
                MusicTrack musicTrack3 = (MusicTrack) j5g.a0(playlist.y);
                if (musicTrack3 == null) {
                    return;
                }
                com.vk.music.notifications.restriction.a aVar = k840.a.d;
                (aVar != null ? aVar : null).g(musicTrack3);
                return;
            }
            onMediaAudioComponentProvider.b().e = true;
            onMediaAudioComponentProvider.e().a(s880Var);
            onMediaAudioComponentProvider.g().j(28);
            String str3 = s880Var.g;
            boolean d = onMediaAudioComponentProvider.c().d(playlist);
            cr4 cr4Var = this.a;
            if (!d || !cr4Var.a().h()) {
                if (d) {
                    cr4Var.a().w1(new PlaybackActionMeta(6, 0L, 2, null));
                } else {
                    feb0 feb0Var = (feb0) cr4Var.d.getValue();
                    MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(str3);
                    int currentPosition2 = (int) onMediaAudioComponentProvider.f().getCurrentPosition();
                    t780 e = onMediaAudioComponentProvider.e();
                    if (e.f.isEmpty()) {
                        musicTrack = null;
                    } else {
                        ?? r5 = e.f;
                        musicTrack = (MusicTrack) r5.get(e.d % r5.size());
                    }
                    feb0Var.b(playlist, Fb, currentPosition2, musicTrack, ShuffleMode.SHUFFLE_OFF);
                }
            }
            onMediaAudioComponentProvider.c().getClass();
            hd60.a().d1(context, playlist, newsEntry, MusicPlaybackLaunchContext.Fb(str3));
            hd60.a().r1(newsEntry);
            k780 b2 = onMediaAudioComponentProvider.b();
            MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType itemType = s880Var.k;
            boolean a = onMediaAudioComponentProvider.a();
            Integer valueOf = Integer.valueOf(playlist.b);
            Long valueOf2 = Long.valueOf(playlist.c.b);
            String str4 = s880Var.f;
            b2.getClass();
            k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostOpenPlaylist(a ? MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.AUTOPLAY : MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.MANUAL, k780.a(valueOf, valueOf2, itemType)), str4);
            return;
        }
        if (v780Var instanceof j880) {
            j880 j880Var = (j880) v780Var;
            Integer valueOf3 = Integer.valueOf(R.attr.vk_ui_icon_negative);
            if (j880Var.b) {
                ikv0.a aVar2 = new ikv0.a(context);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_outline_28, valueOf3, (Size) null, 12);
                aVar2.u = new ikv0.d(context.getString(R.string.on_media_all_tracks_disabled), (String) null, (ikv0.d.a) null, 6);
                aVar2.n();
                return;
            }
            List<MusicTrack> list = j880Var.j;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MusicTrack) it.next()).B()) {
                        ikv0.a aVar3 = new ikv0.a(context);
                        aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_outline_28, valueOf3, (Size) null, 12);
                        aVar3.u = new ikv0.d(context.getString(R.string.on_media_some_tracks_disabled), (String) null, (ikv0.d.a) null, 6);
                        aVar3.n();
                        break;
                    }
                }
            }
            onMediaAudioComponentProvider.b().e = true;
            ((w0x) r2.getValue()).d = true;
            onMediaAudioComponentProvider.g().j(28);
            lm4 c2 = onMediaAudioComponentProvider.c();
            MusicTrack musicTrack4 = j880Var.h;
            List<MusicTrack> list2 = j880Var.j;
            String str5 = j880Var.f;
            PostInteract postInteract2 = j880Var.g;
            int currentPosition3 = (int) onMediaAudioComponentProvider.f().getCurrentPosition();
            PromoPost promoPost2 = newsEntry instanceof PromoPost ? (PromoPost) newsEntry : null;
            if (promoPost2 != null) {
                adsAudioPixelsContainer2 = promoPost2.I;
            }
            c2.g(context, musicTrack4, list2, str5, postInteract2, currentPosition3, adsAudioPixelsContainer2);
            hd60.a().r1(newsEntry);
            k780 b3 = onMediaAudioComponentProvider.b();
            Integer num2 = j880Var.c;
            Long l2 = j880Var.d;
            String str6 = j880Var.e;
            b3.getClass();
            k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostOpenAudio(k780.a(num2, l2, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO)), str6);
        }
    }

    public final void d(Context context, NewsEntry newsEntry, v780 v780Var) {
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.b;
        if (onMediaAudioComponentProvider.d().q) {
            return;
        }
        if (v780Var.B()) {
            c(context, newsEntry, v780Var);
        }
        onMediaAudioComponentProvider.d().j = true;
        hd60.a().r1(newsEntry);
        onMediaAudioComponentProvider.b().d = true;
        if (!onMediaAudioComponentProvider.g().c.getState().j()) {
            f(newsEntry, v780Var);
            return;
        }
        k780 b = onMediaAudioComponentProvider.b();
        Integer a = v780Var.a();
        Long b2 = v780Var.b();
        String i = v780Var.i();
        b.getClass();
        k780.f(new MobileOfficialAppsFeedStat$TypeFeedPostPauseAudio(k780.a(a, b2, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.AUDIO)), i);
        onMediaAudioComponentProvider.g().j(6);
    }

    public final void e(Context context, NewsEntry newsEntry, v780 v780Var) {
        if (v780Var.B()) {
            c(context, newsEntry, v780Var);
        }
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.b;
        m780 d = onMediaAudioComponentProvider.d();
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        d.i = com.vk.libvideo.autoplay.e.c();
        onMediaAudioComponentProvider.b().d = true;
        if (onMediaAudioComponentProvider.d().i) {
            m780 d2 = onMediaAudioComponentProvider.d();
            d2.getClass();
            z2s0.b.g(d2.s, 0);
            f(newsEntry, v780Var);
        } else {
            onMediaAudioComponentProvider.g().j(6);
        }
        com.vk.libvideo.autoplay.e.f(!onMediaAudioComponentProvider.d().i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(NewsEntry newsEntry, v780 v780Var) {
        MusicTrack musicTrack;
        boolean z;
        boolean z2;
        dx40 dx40Var;
        boolean z3;
        boolean z4;
        if (v780Var.B()) {
            return;
        }
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.b;
        onMediaAudioComponentProvider.e().a(v780Var);
        t780 e = onMediaAudioComponentProvider.e();
        PromoPost promoPost = newsEntry instanceof PromoPost ? (PromoPost) newsEntry : null;
        AdsAudioPixelsContainer adsAudioPixelsContainer = promoPost != null ? promoPost.I : null;
        osj0 osj0Var = e.a;
        if (e.f.isEmpty()) {
            musicTrack = null;
        } else {
            ?? r3 = e.f;
            musicTrack = (MusicTrack) r3.get(e.d % r3.size());
        }
        if (musicTrack == null) {
            return;
        }
        l880 l880Var = e.g;
        if (l880Var != null) {
            y780 y780Var = l880Var.M;
            if (!musicTrack.equals(l880Var.H.h)) {
                MusicTrack musicTrack2 = musicTrack;
                musicTrack = musicTrack2;
                l880Var.H = j880.c(l880Var.H, false, false, null, null, null, null, null, musicTrack2, 0, null, 3583);
                l880Var.d7();
                l880Var.e7(true);
                int i = l880Var.H.i;
                RunningLineTextView runningLineTextView = y780Var.f;
                jkm jkmVar = new jkm(l880Var, i, 1);
                cvh cvhVar = new cvh(l880Var, 29);
                if (runningLineTextView != null && runningLineTextView.getVisibility() == 0) {
                    float alpha = runningLineTextView.getAlpha();
                    Property property = View.ALPHA;
                    z3 = false;
                    z4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(runningLineTextView, (Property<RunningLineTextView, Float>) property, alpha, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L);
                    duration.addListener(new yo2(jkmVar, runningLineTextView));
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(runningLineTextView, (Property<RunningLineTextView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, alpha).setDuration(300L);
                    duration2.addListener(new zo2(cvhVar, runningLineTextView));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(duration, duration2);
                    animatorSet.start();
                } else {
                    z3 = false;
                    z4 = true;
                }
                l880Var.c7();
                RunningLineTextView runningLineTextView2 = y780Var.f;
                OnMediaTitleWrapperView onMediaTitleWrapperView = y780Var.i;
                if (onMediaTitleWrapperView != null) {
                    onMediaTitleWrapperView.setSizeFrozen(z4);
                }
                if (((float) (onMediaTitleWrapperView != null ? onMediaTitleWrapperView.getMeasuredWidth() : z3)) * 0.6f > runningLineTextView2.getPaint().measureText(runningLineTextView2.getText().toString())) {
                    z2 = true;
                    runningLineTextView2.setDisabled(true);
                    z = z3;
                } else {
                    z = z3;
                    z2 = true;
                    runningLineTextView2.setDisabled(z);
                }
                dx40Var = osj0Var.c;
                if ((dx40Var.getState() instanceof ry40.d) && !(dx40Var.getState() instanceof ry40.a)) {
                    MusicPreviewUrl musicPreviewUrl = musicTrack.Y;
                    if (musicPreviewUrl != null && musicPreviewUrl.d - musicPreviewUrl.c > 0) {
                        z = z2;
                    }
                    osj0Var.k(new bck0(new kx40(null, musicTrack, z ? new wva0(musicPreviewUrl.c, musicPreviewUrl.d) : new wva0(e.e, 2), new PlaybackLaunchMeta(MusicPlaybackLaunchContext.Fb(e.h), "", z ? PlayableType.SNIPPET : PlayableType.MUSIC_TRACK, PlaySourceMeta.Default.b, adsAudioPixelsContainer), null, true, musicTrack.a0, 401), (Bundle) null, 6));
                    return;
                }
                if (dx40Var.getState().i()) {
                    osj0Var.j(6);
                    return;
                }
                osj0Var.m(new PlaybackActionMeta(6, 0L, 2, null));
                if (adsAudioPixelsContainer != null) {
                    e.c.c(adsAudioPixelsContainer);
                    return;
                }
                return;
            }
        }
        z = false;
        z2 = true;
        dx40Var = osj0Var.c;
        if (dx40Var.getState() instanceof ry40.d) {
        }
        if (dx40Var.getState().i()) {
        }
    }
}
