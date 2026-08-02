package defpackage;

import ru.yandex.logistics.sdk.cargo_form.core.api.models.FormEventType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h6s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FormEventType.values().length];
        try {
            iArr[FormEventType.APP_ENTERED_BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormEventType.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
