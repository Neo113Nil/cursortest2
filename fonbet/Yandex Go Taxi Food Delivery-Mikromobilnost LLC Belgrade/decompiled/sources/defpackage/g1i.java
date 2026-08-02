package defpackage;

import ru.yandex.taxi.contacts.SelectedFrom;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class g1i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SelectedFrom.values().length];
        try {
            iArr[SelectedFrom.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedFrom.LAST_CONTACTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectedFrom.STANDALONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
