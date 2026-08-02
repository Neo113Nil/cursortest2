package defpackage;

import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class lyx {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Participant.values().length];
        try {
            iArr[Participant.ONLY_STEM_OF_PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Participant.LABELS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Participant.BODIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Participant.BUBBLES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
