package xsna;

import com.vk.audio.AudioMessageSource;

/* compiled from: AudioRecordReporter.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class zu4 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AudioMessageSource.values().length];
        try {
            iArr[AudioMessageSource.PUSH_TO_TALK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioMessageSource.RAISE_TO_TALK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudioMessageSource.HANDS_FREE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
