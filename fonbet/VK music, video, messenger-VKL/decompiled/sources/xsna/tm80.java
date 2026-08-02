package xsna;

import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioDiscontinuityReason;
import com.vk.music.player.api.helper.dto.AudioPlaybackError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: OneVideoPlayerListenerWrapper.kt */
/* loaded from: classes3.dex */
public final class tm80 implements one.video.player.f {
    public final CopyOnWriteArrayList<rs4> a = new CopyOnWriteArrayList<>();
    public boolean b;
    public boolean c;

    /* compiled from: OneVideoPlayerListenerWrapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OneVideoPlayer.DiscontinuityReason.values().length];
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.SEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.SEEK_ADJUSTMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.REMOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OneVideoPlayer.State.values().length];
            try {
                iArr2[OneVideoPlayer.State.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OneVideoPlayer.State.RELEASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OneVideoPlayer.State.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OneVideoPlayer.State.PLAYING.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OneVideoPlayer.State.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OneVideoPlayer.State.BUFFERING.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OneVideoPlayer.State.ENDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        AudioDiscontinuityReason audioDiscontinuityReason;
        switch (a.$EnumSwitchMapping$0[discontinuityReason.ordinal()]) {
            case 1:
                audioDiscontinuityReason = AudioDiscontinuityReason.AUTO_TRANSITION;
                break;
            case 2:
                audioDiscontinuityReason = AudioDiscontinuityReason.SEEK;
                break;
            case 3:
                audioDiscontinuityReason = AudioDiscontinuityReason.SEEK_ADJUSTMENT;
                break;
            case 4:
                audioDiscontinuityReason = AudioDiscontinuityReason.SKIP;
                break;
            case 5:
                audioDiscontinuityReason = AudioDiscontinuityReason.REMOVE;
                break;
            case 6:
                audioDiscontinuityReason = AudioDiscontinuityReason.INTERNAL;
                break;
            case 7:
                audioDiscontinuityReason = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (audioDiscontinuityReason != null) {
            Iterator<rs4> it = this.a.iterator();
            while (it.hasNext()) {
                rs4 next = it.next();
                long j = deb0Var2.b;
                next.g(audioDiscontinuityReason);
            }
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        AudioPlaybackError.Type type;
        Iterator<rs4> it = this.a.iterator();
        while (it.hasNext()) {
            rs4 next = it.next();
            String message = oneVideoPlaybackException.getMessage();
            if (message == null) {
                message = "";
            }
            Throwable cause = oneVideoPlaybackException.getCause();
            int i = AudioPlaybackError.a.$EnumSwitchMapping$0[oneVideoPlaybackException.j().ordinal()];
            if (i == 1) {
                type = AudioPlaybackError.Type.SOURCE;
            } else if (i == 2) {
                type = AudioPlaybackError.Type.RENDERER;
            } else if (i == 3) {
                type = AudioPlaybackError.Type.UNEXPECTED;
            } else if (i == 4) {
                type = AudioPlaybackError.Type.REMOTE;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                type = AudioPlaybackError.Type.UNRESOLVED;
            }
            next.c(new AudioPlaybackError(message, cause, type, oneVideoPlaybackException.d().name()));
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
        AudioPlayer.State state3;
        AudioPlayer.State state4;
        int[] iArr = a.$EnumSwitchMapping$1;
        switch (iArr[state.ordinal()]) {
            case 1:
            case 2:
            case 3:
                state3 = AudioPlayer.State.IDLE;
                break;
            case 4:
                state3 = AudioPlayer.State.PLAYING;
                break;
            case 5:
                state3 = AudioPlayer.State.PAUSED;
                break;
            case 6:
                state3 = AudioPlayer.State.BUFFERING;
                break;
            case 7:
                state3 = AudioPlayer.State.ENDED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
                state4 = AudioPlayer.State.IDLE;
                break;
            case 4:
                state4 = AudioPlayer.State.PLAYING;
                break;
            case 5:
                state4 = AudioPlayer.State.PAUSED;
                break;
            case 6:
                state4 = AudioPlayer.State.BUFFERING;
                break;
            case 7:
                state4 = AudioPlayer.State.ENDED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        CopyOnWriteArrayList<rs4> copyOnWriteArrayList = this.a;
        if (state3 != state4) {
            Iterator<rs4> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().e(state4);
            }
        }
        OneVideoPlayer.State state5 = OneVideoPlayer.State.PLAYING;
        if (state2 == state5 && !this.b) {
            Iterator<rs4> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                rs4 next = it2.next();
                this.b = true;
                next.onIsPlayingChanged(true);
            }
        } else if (state2 != state5 && this.b) {
            Iterator<rs4> it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                rs4 next2 = it3.next();
                this.b = false;
                next2.onIsPlayingChanged(false);
            }
        }
        OneVideoPlayer.State state6 = OneVideoPlayer.State.BUFFERING;
        if (state2 == state6 && !this.c) {
            Iterator<rs4> it4 = copyOnWriteArrayList.iterator();
            while (it4.hasNext()) {
                rs4 next3 = it4.next();
                this.c = true;
                next3.onIsLoadingChanged(true);
            }
            return;
        }
        if (state2 == state6 || !this.c) {
            return;
        }
        Iterator<rs4> it5 = copyOnWriteArrayList.iterator();
        while (it5.hasNext()) {
            rs4 next4 = it5.next();
            this.c = false;
            next4.onIsLoadingChanged(false);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void d(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void f(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void h(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void j(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void l(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void p(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void r(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void s(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void v(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void w(BaseVideoPlayer baseVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void x(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void b(OneVideoPlayer oneVideoPlayer, boolean z) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void i(OneVideoPlayer oneVideoPlayer, int i) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void k(OneVideoPlayer oneVideoPlayer, long j) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void o(BaseVideoPlayer baseVideoPlayer, float f) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void u(BaseVideoPlayer baseVideoPlayer, RepeatMode repeatMode) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
    }
}
