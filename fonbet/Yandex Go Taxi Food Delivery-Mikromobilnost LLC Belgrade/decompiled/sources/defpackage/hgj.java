package defpackage;

import ru.yandex.taxi.communications.model.TextAlign;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class hgj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextAlign.values().length];
        try {
            iArr[TextAlign.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextAlign.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
