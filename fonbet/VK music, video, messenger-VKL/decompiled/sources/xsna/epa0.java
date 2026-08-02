package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import one.video.pip.PipCallbackActions;
import one.video.pip.playback.PipPlaybackAction;
import one.video.player.OneVideoPlayer;

/* compiled from: PipPlaybackCallback.kt */
/* loaded from: classes8.dex */
public final class epa0 {
    public final tu80 a;
    public OneVideoPlayer b;
    public AdaptedFunctionReference c;

    /* compiled from: PipPlaybackCallback.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PipPlaybackAction.values().length];
            try {
                iArr[PipPlaybackAction.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PipPlaybackAction.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PipPlaybackAction.REPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PipPlaybackAction.SEEK_FORWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PipPlaybackAction.SEEK_BACKWARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PipPlaybackAction.SKIP_FORWARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public epa0(tu80 tu80Var) {
        this.a = tu80Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.AdaptedFunctionReference, xsna.izs] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.AdaptedFunctionReference, xsna.izs] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.AdaptedFunctionReference, xsna.izs] */
    public final void a(PipPlaybackAction pipPlaybackAction) {
        int i = a.$EnumSwitchMapping$0[pipPlaybackAction.ordinal()];
        tu80 tu80Var = this.a;
        switch (i) {
            case 1:
                if (((Boolean) tu80Var.invoke()).booleanValue()) {
                    PipCallbackActions pipCallbackActions = PipCallbackActions.PLAY;
                    ?? r0 = this.c;
                    if (r0 != 0) {
                        r0.invoke(pipCallbackActions);
                        return;
                    }
                    return;
                }
                OneVideoPlayer oneVideoPlayer = this.b;
                if (oneVideoPlayer == null) {
                    return;
                }
                if (oneVideoPlayer.getError() != null) {
                    oneVideoPlayer.e();
                    return;
                } else {
                    oneVideoPlayer.resume();
                    return;
                }
            case 2:
                if (!((Boolean) tu80Var.invoke()).booleanValue()) {
                    OneVideoPlayer oneVideoPlayer2 = this.b;
                    if (oneVideoPlayer2 != null) {
                        oneVideoPlayer2.pause();
                        return;
                    }
                    return;
                }
                PipCallbackActions pipCallbackActions2 = PipCallbackActions.PAUSE;
                ?? r02 = this.c;
                if (r02 != 0) {
                    r02.invoke(pipCallbackActions2);
                    return;
                }
                return;
            case 3:
                OneVideoPlayer oneVideoPlayer3 = this.b;
                if (oneVideoPlayer3 != null) {
                    oneVideoPlayer3.seekTo(0L);
                }
                OneVideoPlayer oneVideoPlayer4 = this.b;
                if (oneVideoPlayer4 != null) {
                    oneVideoPlayer4.resume();
                    return;
                }
                return;
            case 4:
                OneVideoPlayer oneVideoPlayer5 = this.b;
                if (oneVideoPlayer5 == null) {
                    return;
                }
                oneVideoPlayer5.seekTo(oneVideoPlayer5.getCurrentPosition() + 10000);
                return;
            case 5:
                OneVideoPlayer oneVideoPlayer6 = this.b;
                if (oneVideoPlayer6 == null) {
                    return;
                }
                oneVideoPlayer6.seekTo(oneVideoPlayer6.getCurrentPosition() - 10000);
                return;
            case 6:
                PipCallbackActions pipCallbackActions3 = PipCallbackActions.SKIP_FORWARD;
                ?? r03 = this.c;
                if (r03 != 0) {
                    r03.invoke(pipCallbackActions3);
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
