package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class o8s {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FormattedText.LineThroughStyle.values().length];
        try {
            iArr[FormattedText.LineThroughStyle.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormattedText.LineThroughStyle.DIAGONALLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[FormattedText.VerticalAlignment.values().length];
        try {
            iArr2[FormattedText.VerticalAlignment.BASELINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FormattedText.VerticalAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FormattedText.VerticalAlignment.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
