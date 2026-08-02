package defpackage;

import ru.yandex.taxi.map_common.map.intersection.ParticipantRelationsMode;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class pp00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ParticipantRelationsMode.values().length];
        try {
            iArr[ParticipantRelationsMode.ONE_TO_ONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParticipantRelationsMode.ONE_TO_MANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParticipantRelationsMode.MANY_TO_ONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ParticipantRelationsMode.MANY_TO_MANY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
