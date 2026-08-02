package defpackage;

import ru.yandex.logistics.sdk.cargo_form.core.api.models.PopupType$TextHintPopup$ArrowDirection;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.FormSection;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fae0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FormSection.values().length];
        try {
            iArr[FormSection.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormSection.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FormSection.MAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PopupType$TextHintPopup$ArrowDirection.values().length];
        try {
            iArr2[PopupType$TextHintPopup$ArrowDirection.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PopupType$TextHintPopup$ArrowDirection.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PopupType$TextHintPopup$ArrowDirection.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PopupType$TextHintPopup$ArrowDirection.RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
