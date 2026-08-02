package defpackage;

import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class dwz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActionAccessibilityType.values().length];
        try {
            iArr[ActionAccessibilityType.CHECKBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionAccessibilityType.WALKING_ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionAccessibilityType.NOOP_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
