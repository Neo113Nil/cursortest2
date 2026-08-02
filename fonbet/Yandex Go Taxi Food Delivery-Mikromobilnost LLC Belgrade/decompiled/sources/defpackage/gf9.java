package defpackage;

import ru.yandex.taxi.requirements.interactor.ChangeRequirementCounterInteractor$RequirementChangeType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class gf9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangeRequirementCounterInteractor$RequirementChangeType.values().length];
        try {
            iArr[ChangeRequirementCounterInteractor$RequirementChangeType.INCREMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeRequirementCounterInteractor$RequirementChangeType.DECREMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
