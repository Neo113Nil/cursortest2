package defpackage;

import ru.yandex.taxi.common_models.net.TextMetaStyle;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class iot {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextMetaStyle.values().length];
        try {
            iArr[TextMetaStyle.CondensedHeader.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextMetaStyle.CondensedTitle1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextMetaStyle.CondensedTitle2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextMetaStyle.CondensedTitle3.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TextMetaStyle.CondensedTitle4.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TextMetaStyle.CondensedTitle5.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
