package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fnv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FormattedText.Type.values().length];
        try {
            iArr[FormattedText.Type.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormattedText.Type.IMAGE_URL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FormattedText.Type.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FormattedText.Type.TEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FormattedText.Type.LINK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FormattedText.Type.CONTAINER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
