package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ViewMode;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class lo6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ViewMode.values().length];
        try {
            iArr[ViewMode.BOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewMode.ROW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
