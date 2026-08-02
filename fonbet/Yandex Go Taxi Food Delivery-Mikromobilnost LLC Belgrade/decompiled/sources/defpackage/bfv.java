package defpackage;

import com.yandex.div.core.view2.spannable.TextVerticalAlignment;

/* loaded from: classes.dex */
public abstract /* synthetic */ class bfv {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextVerticalAlignment.values().length];
        try {
            iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
