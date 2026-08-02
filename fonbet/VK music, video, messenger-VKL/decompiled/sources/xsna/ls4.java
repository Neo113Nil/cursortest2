package xsna;

import com.vk.music.player.PlayState;

/* compiled from: AudioPlayerClickStatsSender.kt */
/* loaded from: classes3.dex */
public final class ls4 {
    public final g950 a;
    public final z290 b;

    /* compiled from: AudioPlayerClickStatsSender.kt */
    public static final /* synthetic */ class a {
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ls4(g950 g950Var, x2b0 x2b0Var, u750 u750Var) {
        this.a = g950Var;
        this.b = new z290(u750Var, x2b0Var);
    }
}
