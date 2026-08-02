package xsna;

import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;

/* compiled from: OriginalSoundStatusHelper.kt */
/* loaded from: classes17.dex */
public final class dz80 {
    public dw20 a;

    /* compiled from: OriginalSoundStatusHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SdkOriginalSoundStatus.values().length];
            try {
                iArr[SdkOriginalSoundStatus.MODERATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SdkOriginalSoundStatus.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
