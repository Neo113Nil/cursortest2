package defpackage;

import ru.yandex.taxi.contacts.SelectedFrom;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cvh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SelectedFrom.values().length];
        try {
            iArr[SelectedFrom.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
