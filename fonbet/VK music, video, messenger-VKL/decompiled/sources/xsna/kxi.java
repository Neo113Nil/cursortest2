package xsna;

import android.graphics.Rect;
import android.util.Size;
import one.video.pip.config.data.PlaybackStatus;
import one.video.player.OneVideoPlayer;

/* compiled from: ConfigFactory.kt */
/* loaded from: classes8.dex */
public final class kxi {
    public Rect a;
    public boolean b;
    public boolean c;

    /* compiled from: ConfigFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OneVideoPlayer.State.values().length];
            try {
                iArr[OneVideoPlayer.State.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneVideoPlayer.State.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlaybackStatus.values().length];
            try {
                iArr2[PlaybackStatus.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlaybackStatus.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final yva0 a(OneVideoPlayer oneVideoPlayer) {
        int i = a.$EnumSwitchMapping$0[oneVideoPlayer.getState().ordinal()];
        PlaybackStatus playbackStatus = i != 1 ? i != 2 ? PlaybackStatus.PAUSE : PlaybackStatus.PLAYING : PlaybackStatus.COMPLETE;
        if (this.b) {
            int i2 = a.$EnumSwitchMapping$1[playbackStatus.ordinal()];
            if (i2 == 1) {
                playbackStatus = PlaybackStatus.AD_PLAYING;
            } else if (i2 == 2) {
                playbackStatus = PlaybackStatus.AD_PAUSE;
            }
        }
        return b(oneVideoPlayer, playbackStatus);
    }

    public final yva0 b(OneVideoPlayer oneVideoPlayer, PlaybackStatus playbackStatus) {
        Size size;
        cms0 cms0Var;
        one.video.player.tracks.c E = oneVideoPlayer.E();
        if (E == null || (cms0Var = (cms0) E.c) == null || (size = cms0Var.c()) == null) {
            size = new Size(0, 0);
        }
        Size size2 = size;
        Rect rect = this.a;
        if (rect == null) {
            rect = new Rect();
        }
        Rect rect2 = rect;
        boolean w = oneVideoPlayer.w();
        if (this.b) {
            int i = a.$EnumSwitchMapping$1[playbackStatus.ordinal()];
            if (i == 1) {
                playbackStatus = PlaybackStatus.AD_PLAYING;
            } else if (i == 2) {
                playbackStatus = PlaybackStatus.AD_PAUSE;
            }
        }
        PlaybackStatus playbackStatus2 = playbackStatus;
        this.b = playbackStatus2 == PlaybackStatus.AD_PAUSE || playbackStatus2 == PlaybackStatus.AD_PLAYING;
        return new yva0(size2, playbackStatus2, w, oneVideoPlayer.canPause(), rect2, this.b, this.c);
    }
}
