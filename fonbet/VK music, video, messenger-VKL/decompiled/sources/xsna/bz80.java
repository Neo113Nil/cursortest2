package xsna;

import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.dto.common.OriginalSoundStatus;

/* compiled from: OriginalSoundStatusAdapter.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class bz80 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[OriginalSoundStatus.values().length];
        try {
            iArr[OriginalSoundStatus.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OriginalSoundStatus.MODERATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OriginalSoundStatus.APPROVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OriginalSoundStatus.DENIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[SdkOriginalSoundStatus.values().length];
        try {
            iArr2[SdkOriginalSoundStatus.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SdkOriginalSoundStatus.MODERATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SdkOriginalSoundStatus.APPROVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SdkOriginalSoundStatus.DENIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
