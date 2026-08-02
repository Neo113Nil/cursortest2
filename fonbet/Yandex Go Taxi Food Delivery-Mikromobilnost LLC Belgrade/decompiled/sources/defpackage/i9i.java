package defpackage;

import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryCommentRequirementType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i9i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryCommentRequirementType.values().length];
        try {
            iArr[DeliveryCommentRequirementType.COURIER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
