package defpackage;

import com.yandex.go.navigator.repository.SoundMode;
import com.yandex.go.navigator.repository.VoiceMode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class p6r0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[VoiceMode.values().length];
        try {
            iArr[VoiceMode.TURN_OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VoiceMode.ACCIDENTS_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VoiceMode.ALL_SOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SoundMode.values().length];
        try {
            iArr2[SoundMode.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SoundMode.MID.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SoundMode.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
