package defpackage;

import ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class hr3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoFsSessionPhase.values().length];
        try {
            iArr[AutoFsSessionPhase.AwaitingCycleStart.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoFsSessionPhase.ReadyForAutoFs.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutoFsSessionPhase.WarmUp.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AutoFsSessionPhase.Silent.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
