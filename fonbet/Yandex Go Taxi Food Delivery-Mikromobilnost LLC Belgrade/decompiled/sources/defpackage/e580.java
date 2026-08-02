package defpackage;

import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class e580 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequirementRemoveSource.values().length];
        try {
            iArr[RequirementRemoveSource.BUBBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequirementRemoveSource.LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
