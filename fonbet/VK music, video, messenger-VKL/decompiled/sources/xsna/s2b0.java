package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerInvalidateMessage;

/* compiled from: PlayerMessageHandler.kt */
/* loaded from: classes3.dex */
public final class s2b0 {
    public final r2b0 a;
    public final io.reactivex.rxjava3.subjects.f<PlayerInvalidateMessage> b = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public PlayState d;

    /* compiled from: PlayerMessageHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerInvalidateMessage.values().length];
            try {
                iArr[PlayerInvalidateMessage.STATE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerInvalidateMessage.TRACKS_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerInvalidateMessage.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerInvalidateMessage.BUFFERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerInvalidateMessage.PARAMETERS_CHANGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlayerInvalidateMessage.LOOPING_MODE_CHANGED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PlayerInvalidateMessage.SHUFFLE_MODE_CHANGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PlayerInvalidateMessage.PLAYBACK_SPEED_CHANGED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PlayerInvalidateMessage.ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PlayerInvalidateMessage.VOLUME_CHANGED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s2b0(r2b0 r2b0Var) {
        this.a = r2b0Var;
    }
}
