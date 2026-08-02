package xsna;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerMode;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import xsna.k840;

/* compiled from: MediaSessionCallbackImpl.kt */
/* loaded from: classes3.dex */
public final class dy10 extends MediaSessionCompat.Callback {
    public final e2b0 a;
    public final jg8 b;
    public final u2b0 c;
    public final nd50 d;
    public final bpn0 e;

    public dy10(e2b0 e2b0Var, jg8 jg8Var) {
        this.a = e2b0Var;
        this.b = jg8Var;
        u2b0 b = k840.a.g().b();
        this.c = b;
        this.d = new nd50(b, o25.a());
        this.e = new bpn0(new nly(this, 4));
        new Handler(Looper.getMainLooper());
    }

    public final vs4 a() {
        return (vs4) this.e.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        MusicTrack f;
        e2b0 e2b0Var = this.a;
        if (e2b0Var.T() || str == null) {
            return;
        }
        int hashCode = str.hashCode();
        jg8 jg8Var = this.b;
        switch (hashCode) {
            case -528730005:
                if (str.equals("ACTION_STOP")) {
                    e2b0Var.stop(32);
                    vs4 a = a();
                    boolean j = ((xch0) jg8Var.c).j();
                    MusicTrack f2 = a.b.C().f();
                    if (f2 != null && f2.Tb()) {
                        a.a.k0(j ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_STOP_CLOSE_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_STOP_CLOSE_NOTICE_BLOCK, a.c);
                    }
                    e2b0Var.F();
                    break;
                }
                break;
            case -243332334:
                if (str.equals("ACTION_ADD_CURRENT") && (f = e2b0Var.e.f()) != null) {
                    nd50 nd50Var = this.d;
                    if (nd50Var.i(f)) {
                        nd50Var.o1(f, e2b0Var.t);
                        vs4 a2 = a();
                        boolean j2 = ((xch0) jg8Var.c).j();
                        MusicTrack f3 = a2.b.C().f();
                        if (f3 != null && f3.Tb()) {
                            a2.a.k0(j2 ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_ADD_MY_MUSIC_NOTICE_BLOCK, a2.c);
                            break;
                        }
                    }
                }
                break;
            case -184270169:
                if (str.equals("ACTION_PREV_15") && ((xch0) jg8Var.c).i()) {
                    e2b0Var.v(new PlaybackActionMeta(25, 0L, 2, null), null);
                    break;
                }
                break;
            case 654581271:
                if (str.equals("ACTION_TOGGLE_SHUFFLE")) {
                    e2b0Var.o();
                    vs4 a3 = a();
                    boolean M = e2b0Var.q.M();
                    boolean j3 = ((xch0) jg8Var.c).j();
                    PlayerMode playerMode = a3.c;
                    u750 u750Var = a3.a;
                    MusicTrack f4 = a3.b.C().f();
                    if (f4 != null && f4.Tb()) {
                        if (!M) {
                            u750Var.k0(j3 ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_OFF_NOTICE_BLOCK, playerMode);
                            break;
                        } else {
                            u750Var.k0(j3 ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_SHUFFLE_ON_NOTICE_BLOCK, playerMode);
                            break;
                        }
                    }
                }
                break;
            case 1980998119:
                if (str.equals("ACTION_NEXT_15") && ((xch0) jg8Var.c).i()) {
                    e2b0Var.u(new PlaybackActionMeta(24, 0L, 2, null), null);
                    break;
                }
                break;
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        this.a.f0(12);
        vs4 a = a();
        boolean j = ((xch0) this.b.c).j();
        MusicTrack f = a.b.C().f();
        if (f == null || !f.Tb()) {
            return;
        }
        a.a.k0(j ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PAUSE_NOTICE_BLOCK, a.c);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        jg8 jg8Var = this.b;
        if (((xch0) jg8Var.c).i()) {
            e2b0 e2b0Var = this.a;
            if (e2b0Var.T()) {
                return;
            }
            e2b0Var.f(new PlaybackActionMeta(12, 0L, 2, null));
            vs4 a = a();
            boolean j = ((xch0) jg8Var.c).j();
            MusicTrack f = a.b.C().f();
            if (f == null || !f.Tb()) {
                return;
            }
            a.a.k0(j ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PLAY_NOTICE_BLOCK, a.c);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onRewind() {
        if (((xch0) this.b.c).i()) {
            e2b0 e2b0Var = this.a;
            if (e2b0Var.T()) {
                return;
            }
            e2b0Var.q0(new PlaybackActionMeta(31, 0L, 2, null), null);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        jg8 jg8Var = this.b;
        if (((xch0) jg8Var.c).i()) {
            e2b0 e2b0Var = this.a;
            if (e2b0Var.T()) {
                return;
            }
            e2b0Var.j((int) j, new PlaybackActionMeta(19, 0L, 2, null));
            vs4 a = a();
            boolean j2 = ((xch0) jg8Var.c).j();
            MusicTrack f = a.b.C().f();
            if (f == null || !f.Tb()) {
                return;
            }
            a.a.k0(j2 ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TIMELINE_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TIMELINE_NOTICE_BLOCK, a.c);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetRating(RatingCompat ratingCompat) {
        MusicTrack f;
        e2b0 e2b0Var = this.a;
        if (e2b0Var.T() || (f = e2b0Var.e.f()) == null || !ratingCompat.hasHeart()) {
            return;
        }
        nd50 nd50Var = this.d;
        if (nd50Var.i(f)) {
            nd50Var.o1(f, e2b0Var.t);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        jg8 jg8Var = this.b;
        if (((xch0) jg8Var.c).i()) {
            e2b0 e2b0Var = this.a;
            if (e2b0Var.T() || jg8Var.a()) {
                return;
            }
            e2b0Var.j0(new PlaybackActionMeta(13, 0L, 2, null), "next");
            vs4 a = a();
            boolean j = ((xch0) jg8Var.c).j();
            MusicTrack f = a.b.C().f();
            if (f == null || !f.Tb()) {
                return;
            }
            a.a.k0(j ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_NEXT_NOTICE_BLOCK, a.c);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        jg8 jg8Var = this.b;
        if (((xch0) jg8Var.c).i()) {
            e2b0 e2b0Var = this.a;
            if (e2b0Var.T() || jg8Var.b()) {
                return;
            }
            e2b0Var.y(true, new PlaybackActionMeta(14, 0L, 2, null), null);
            vs4 a = a();
            boolean j = ((xch0) jg8Var.c).j();
            MusicTrack f = a.b.C().f();
            if (f == null || !f.Tb()) {
                return;
            }
            a.a.k0(j ? CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV_LOCK_SCREEN : CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_PREV_NOTICE_BLOCK, a.c);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
    }
}
