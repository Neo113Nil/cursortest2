package xsna;

import com.vk.music.player.LoopMode;

/* compiled from: ParamsResolver.kt */
/* loaded from: classes3.dex */
public final class fi90 extends uzp {
    public final du70 d;
    public final cwa0 e;

    /* compiled from: ParamsResolver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoopMode.values().length];
            try {
                iArr[LoopMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoopMode.TRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoopMode.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fi90(du70 du70Var, cwa0 cwa0Var) {
        this.d = du70Var;
        this.e = cwa0Var;
    }
}
