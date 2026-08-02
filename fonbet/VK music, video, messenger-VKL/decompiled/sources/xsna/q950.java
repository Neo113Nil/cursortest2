package xsna;

import com.vk.dto.common.account.AudioAdConfig;

/* compiled from: MusicSwitchingPlayerHelper.kt */
/* loaded from: classes3.dex */
public final class q950 {
    public final /* synthetic */ r950 a;

    /* compiled from: MusicSwitchingPlayerHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioAdConfig.Type.values().length];
            try {
                iArr[AudioAdConfig.Type.POSTROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q950(r950 r950Var) {
        this.a = r950Var;
    }
}
