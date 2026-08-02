package defpackage;

import com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentRequirementTrailAction;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryCommentRequirementType;
import ru.yandex.taxi.requirements.ui.selector.usual.OptionViewType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class bmj0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DeliveryCommentRequirementType.values().length];
        try {
            iArr[DeliveryCommentRequirementType.COURIER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[DeliveryRentRequirementTrailAction.values().length];
        try {
            iArr2[DeliveryRentRequirementTrailAction.REMOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[DeliveryRentRequirementTrailAction.NO_ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
        int[] iArr3 = new int[OptionViewType.values().length];
        try {
            iArr3[OptionViewType.RADIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[OptionViewType.CHECKBOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[OptionViewType.SPINNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
