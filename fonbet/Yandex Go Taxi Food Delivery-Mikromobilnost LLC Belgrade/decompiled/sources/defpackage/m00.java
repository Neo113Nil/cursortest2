package defpackage;

import ru.yandex.taxi.communications.model.widgets.ArrowActionType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class m00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ArrowActionType.values().length];
        try {
            iArr[ArrowActionType.SELECT_ALT_OFFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ArrowActionType.SHOW_REQUIREMENT_INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ArrowActionType.PERSONAL_GOAL_SELECTOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ArrowActionType.SHARE_ROUTE_BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
