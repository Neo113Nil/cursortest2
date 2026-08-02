package defpackage;

import com.yandex.go.taxi.order.change.requirements.api.ChangeRequirementsResponse;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class kf9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangeRequirementsResponse.ChangeStatus.values().length];
        try {
            iArr[ChangeRequirementsResponse.ChangeStatus.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeRequirementsResponse.ChangeStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChangeRequirementsResponse.ChangeStatus.UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
