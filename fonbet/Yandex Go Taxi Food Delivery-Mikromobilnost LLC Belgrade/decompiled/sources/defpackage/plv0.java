package defpackage;

import ru.yandex.taxi.summary.promotions.models.TextAlign;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class plv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextAlign.values().length];
        try {
            iArr[TextAlign.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextAlign.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextAlign.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
