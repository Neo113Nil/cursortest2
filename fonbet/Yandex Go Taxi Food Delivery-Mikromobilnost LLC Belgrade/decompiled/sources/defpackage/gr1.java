package defpackage;

import ru.yandex.taxi.widget.dialog.Toggleable;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class gr1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Toggleable.values().length];
        try {
            iArr[Toggleable.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Toggleable.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
