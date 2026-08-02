package defpackage;

import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ooj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequirementsChangedNotifier.ChangeType.values().length];
        try {
            iArr[RequirementsChangedNotifier.ChangeType.CHANGE_WITH_ADDRESS_REQUIREMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequirementsChangedNotifier.ChangeType.REMOVE_UNSUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequirementsChangedNotifier.ChangeType.CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
