package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.auto.AndroidAutoException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.k840;

/* compiled from: LegacyAndroidAutoMediaSessionCallback.kt */
/* loaded from: classes16.dex */
public final class g0z extends f22 {
    public final Context a;
    public final MediaSessionCompat b;
    public final u2b0 c;
    public final fa40 d;
    public final xf40 e;
    public final t5a<MusicTrack> f;
    public a h;
    public Bundle j;
    public final SparseArray<MediaDescriptionCompat> g = new SparseArray<>();
    public PlaybackStateCompat i = a();

    /* compiled from: LegacyAndroidAutoMediaSessionCallback.kt */
    public final class a extends e.a {

        /* compiled from: LegacyAndroidAutoMediaSessionCallback.kt */
        /* renamed from: xsna.g0z$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2908a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlayState.values().length];
                try {
                    iArr[PlayState.PLAYING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayState.PAUSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlayState.STOPPED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PlayState.IDLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            MusicTrack f;
            String string;
            long h = fVar != null ? fVar.h() : 0L;
            long e = fVar != null ? fVar.e() : 0L;
            bn40.f("onStateChanged", " state:", String.valueOf(playState), " position:", Long.valueOf(h), " duration:", Long.valueOf(e), " thread: ", Thread.currentThread());
            int i = playState == null ? -1 : C2908a.$EnumSwitchMapping$0[playState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        g0z g0zVar = g0z.this;
                        g0z.e(g0zVar, g0zVar.b, g0z.d(g0zVar, g0zVar.i, 1, h).build());
                        return;
                    } else {
                        if (i != 4) {
                            return;
                        }
                        g0z g0zVar2 = g0z.this;
                        g0z.e(g0zVar2, g0zVar2.b, g0z.d(g0zVar2, g0zVar2.i, 0, h).build());
                        return;
                    }
                }
                r6m.a.getClass();
                if (!r6m.b) {
                    long F0 = g0z.this.c.F0();
                    ms i2 = o25.a().i();
                    if (!k840.a.i.b() && F0 >= TimeUnit.MINUTES.toMillis(i2.E)) {
                        g0z g0zVar3 = g0z.this;
                        g0zVar3.c(g0zVar3.a, "background_exceeded");
                        return;
                    }
                }
                g0z g0zVar4 = g0z.this;
                g0z.e(g0zVar4, g0zVar4.b, g0z.d(g0zVar4, g0zVar4.i, 2, h).build());
                return;
            }
            g0z g0zVar5 = g0z.this;
            if (fVar == null || (f = fVar.f()) == null) {
                return;
            }
            long j = fVar.n() ? 1L : 0L;
            AdvertisementInfo c = fVar.c();
            SparseArray<Uri> sparseArray = c != null ? c.c : null;
            Context context = e43.a;
            int c2 = iah0.c(context != null ? context : null);
            String Kb = fVar.n() ? f.Kb(c2) : sparseArray != null ? new Thumb(sparseArray).Ab(c2, false) : String.valueOf(enj.k(R.drawable.ic_song_placeholder_96, g0zVar5.a));
            if (fVar.n()) {
                string = f.d;
                if (string == null) {
                    string = "";
                }
            } else {
                string = g0zVar5.a.getString(R.string.audio_ad_title);
            }
            String str = fVar.n() ? f.h : "";
            MediaSessionCompat mediaSessionCompat = g0zVar5.b;
            MediaMetadataCompat.Builder putString = new MediaMetadataCompat.Builder().putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, string).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, str);
            if (Kb != null) {
                putString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, Kb);
            }
            putString.putLong(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, j);
            mediaSessionCompat.setMetadata(putString.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, e).putLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, g0zVar5.c.k()).putLong(MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, g0zVar5.c.p()).build());
            g0z.e(g0zVar5, g0zVar5.b, g0z.d(g0zVar5, g0zVar5.i, 3, h).setActiveQueueItemId(g0zVar5.c.k()).build());
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void y4(List<PlayerTrack> list) {
            if (list != null) {
                List<PlayerTrack> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlayerTrack) it.next()).b);
                }
            } else {
                EmptyList emptyList = EmptyList.b;
            }
            g0z g0zVar = g0z.this;
            Bundle bundle = g0zVar.j;
            g0zVar.getClass();
        }
    }

    public g0z(Context context, MediaSessionCompat mediaSessionCompat, u2b0 u2b0Var, fa40 fa40Var, xf40 xf40Var, t5a t5aVar, h0z h0zVar) {
        this.a = context;
        this.b = mediaSessionCompat;
        this.c = u2b0Var;
        this.d = fa40Var;
        this.e = xf40Var;
        this.f = t5aVar;
    }

    public static final PlaybackStateCompat.Builder d(g0z g0zVar, PlaybackStateCompat playbackStateCompat, int i, long j) {
        bn40.f("copyWithState( state:", Integer.valueOf(i), " position: ", Long.valueOf(j), ")");
        return new PlaybackStateCompat.Builder(playbackStateCompat).setState(i, j, i == 3 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static final void e(g0z g0zVar, MediaSessionCompat mediaSessionCompat, PlaybackStateCompat playbackStateCompat) {
        mediaSessionCompat.setPlaybackState(playbackStateCompat);
        bn40.f("state: ", playbackStateCompat);
        g0zVar.i = playbackStateCompat;
    }

    @Override // xsna.f22
    public final PlaybackStateCompat a() {
        return new PlaybackStateCompat.Builder().setActions(2427190L).setBufferedPosition(0L).setState(1, -1L, 1.0f).setActiveQueueItemId(-1L).build();
    }

    @Override // xsna.f22
    public final void b() {
        a aVar = this.h;
        if (aVar != null) {
            this.c.n0(aVar);
        }
        r6m.a.getClass();
        if (r6m.b) {
            this.c.stop(26);
        }
        this.b.setActive(false);
    }

    @Override // xsna.f22
    public final void c(Context context, String str) {
        bn40.f("parentId:", str);
        int i = AndroidAutoException.b;
        AndroidAutoException a2 = AndroidAutoException.a.a(context, str);
        this.b.setPlaybackState(new PlaybackStateCompat.Builder().setState(7, -1L, 1.0f).setErrorMessage(!epx.f(a2.d(), "error") ? 1 : 0, a2.getMessage()).build());
    }

    public final void f(String str, List<MusicTrack> list, Bundle bundle) {
        t5a<MusicTrack> t5aVar = this.f;
        t5aVar.a.remove(str);
        t5aVar.a(str, "", list);
        bundle.putString("com.vk.libcatalog2.tracks.binding", str);
    }

    public final void g(MusicTrack musicTrack, List<MusicTrack> list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, Bundle bundle) {
        this.j = bundle;
        bn40.f("setting queue", Integer.valueOf(list.size()));
        this.c.N0(new lqk0((StartPlaySource) null, musicTrack, list, musicPlaybackLaunchContext, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1009));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        bn40.f("command: " + str + ", extras: " + bundle + ", cb: " + resultReceiver);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        bn40.f("mediaButtonEvent:", String.valueOf(intent));
        return super.onMediaButtonEvent(intent);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        bn40.f(new Object[0]);
        this.c.pause(12);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        bn40.f(new Object[0]);
        super.onPlay();
        this.c.f(new PlaybackActionMeta(12, 0L, 2, null));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromMediaId(final String str, final Bundle bundle) {
        Object obj = null;
        String string = bundle != null ? bundle.getString("com.vk.libcatalog2.tracks.type") : null;
        bn40.f("onPlayFromMediaId(mediaId:", String.valueOf(str), " extras: ", String.valueOf(bundle), " type: ", String.valueOf(string), ")");
        if (string != null) {
            int hashCode = string.hashCode();
            Context context = this.a;
            switch (hashCode) {
                case -1708170852:
                    if (string.equals("com.vk.libcatalog2.tracks.playlist")) {
                        if (str != null) {
                            bn40.f("playPlaylist(mediaId: " + str + ", extras: " + bundle + ')');
                            MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(bundle.getString("com.vk.libcatalog2.ref"));
                            Set<Integer> set = Playlist.P;
                            Triple c = Playlist.a.c(str);
                            itg0.i(4, k840.c.c(g0z.class, (UserId) c.d(), ((Number) c.g()).intValue(), (String) c.h()).F(Fb), null, new aa9(this, str, bundle, Fb, 4), new f0z(this, 0));
                            break;
                        } else {
                            bn40.d("mediaId is null");
                            c(context, "error");
                            break;
                        }
                    }
                    break;
                case -1344587124:
                    if (string.equals("com.vk.libcatalog2.tracks.curator")) {
                        if (str != null) {
                            final MusicPlaybackLaunchContext Fb2 = MusicPlaybackLaunchContext.Fb(bundle.getString("com.vk.libcatalog2.ref"));
                            this.e.getClass();
                            itg0.i(4, xf40.a(str), null, new izs() { // from class: xsna.e0z
                                @Override // xsna.izs
                                public final Object invoke(Object obj2) {
                                    List<MusicTrack> list = (List) obj2;
                                    MusicTrack musicTrack = (MusicTrack) j5g.a0(list);
                                    bn40.f("Curator's popular successfully loaded");
                                    g0z g0zVar = g0z.this;
                                    String str2 = str;
                                    Bundle bundle2 = bundle;
                                    g0zVar.f(str2, list, bundle2);
                                    g0zVar.g(musicTrack, list, Fb2, bundle2);
                                    return s3q0.a;
                                }
                            }, new iie(this, 20));
                            break;
                        } else {
                            bn40.d("mediaId is null");
                            c(context, "error");
                            break;
                        }
                    }
                    break;
                case -405916223:
                    if (string.equals("com.vk.libcatalog2.tracks.track")) {
                        String string2 = bundle != null ? bundle.getString("com.vk.libcatalog2.tracks.binding") : null;
                        MusicPlaybackLaunchContext Fb3 = MusicPlaybackLaunchContext.Fb(bundle != null ? bundle.getString("com.vk.libcatalog2.ref") : null);
                        List<MusicTrack> b = string2 != null ? this.f.b(string2) : EmptyList.b;
                        Iterator<T> it = b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (epx.f(((MusicTrack) next).Ib(), str)) {
                                    obj = next;
                                }
                            }
                        }
                        MusicTrack musicTrack = (MusicTrack) obj;
                        bn40.f("playTrack(mediaId: " + str + ",  extras: " + bundle, " pivot:", String.valueOf(musicTrack), " tracks:", b, " ref", Fb3, " thread: ", Thread.currentThread());
                        g(musicTrack, b, Fb3, bundle);
                        break;
                    }
                    break;
                case -241882735:
                    if (string.equals("com.vk.libcatalog2.tracks.artist")) {
                        if (str != null) {
                            itg0.i(4, this.d.b(str), null, new wyh(this, str, bundle, MusicPlaybackLaunchContext.Fb(bundle.getString("com.vk.libcatalog2.ref")), 3), new ozh(this, 24));
                            break;
                        } else {
                            bn40.d("mediaId is null");
                            c(context, "error");
                            break;
                        }
                    }
                    break;
            }
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        super.onPlayFromSearch(str, bundle);
        bn40.f("onPlayFromSearch(query:", String.valueOf(str), " extras: ", bundle.toString(), ")");
        if (str == null || str.length() == 0) {
            return;
        }
        itg0.i(4, rsg0.y0(new dx4(str, MusicPlaybackLaunchContext.H.t()), null, null, 3), null, new rw(str, this, bundle, 11), new rmg(this, 18));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        bn40.f("onPlayFromUri(uri: : ", String.valueOf(uri), HandleInvocationsFromAdViewer.KEY_EXTRAS, String.valueOf(bundle), ")");
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepare() {
        bn40.f(new Object[0]);
        super.onPrepare();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        super.onPrepareFromSearch(str, bundle);
        bn40.f("onPrepareFromSearch(query:", String.valueOf(str), " extras: ", String.valueOf(bundle), ")");
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        bn40.f(defpackage.k0.a(j, "pos:"));
        PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(19, 0L, 2, null);
        this.c.G0((int) j, playbackActionMeta);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        bn40.f(new Object[0]);
        this.c.s0(new PlaybackActionMeta(13, 0L, 2, null));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        bn40.f(new Object[0]);
        this.c.w0(true, new PlaybackActionMeta(14, 0L, 2, null));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToQueueItem(long j) {
        super.onSkipToQueueItem(j);
        bn40.f("id:", Long.valueOf(j));
        int i = (int) j;
        SparseArray<MediaDescriptionCompat> sparseArray = this.g;
        if (sparseArray.indexOfKey(i) >= 0) {
            MediaDescriptionCompat mediaDescriptionCompat = sparseArray.get(i);
            onPlayFromMediaId(mediaDescriptionCompat.getMediaId(), mediaDescriptionCompat.getExtras());
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onStop() {
        bn40.f(new Object[0]);
        this.c.stop(26);
    }
}
