package defpackage;

import com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentRequirementTrailAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dmi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryRentRequirementTrailAction.values().length];
        try {
            iArr[DeliveryRentRequirementTrailAction.REMOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryRentRequirementTrailAction.NO_ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
