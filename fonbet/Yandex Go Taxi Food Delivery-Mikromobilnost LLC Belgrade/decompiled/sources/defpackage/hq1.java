package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.data.TextFont;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class hq1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextFont.values().length];
        try {
            iArr[TextFont.BOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFont.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
