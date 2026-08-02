package defpackage;

import ru.yandex.taxi.address.models.SourcePicker;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ial0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SourcePicker.values().length];
        try {
            iArr[SourcePicker.A_FROM_HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SourcePicker.A_FROM_SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
