package defpackage;

import ru.yandex.taxi.persuggest.api.ShouldFinalizeEvent;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class c5s0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShouldFinalizeEvent.values().length];
        try {
            iArr[ShouldFinalizeEvent.TARIFF_CHANGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShouldFinalizeEvent.REQUIREMENTS_CHANGES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
