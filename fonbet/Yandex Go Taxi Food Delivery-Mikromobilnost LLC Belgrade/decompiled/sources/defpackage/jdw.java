package defpackage;

import com.yandex.go.intercity.flex.api.dashboard.analytics.IntercityDashboardFlexAnalytics$PaymentOpenReason;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class jdw {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[IntercityDashboardFlexAnalytics$PaymentOpenReason.values().length];
        try {
            iArr[IntercityDashboardFlexAnalytics$PaymentOpenReason.CHANGE_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityDashboardFlexAnalytics$PaymentOpenReason.FLEX_ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IntercityDashboardFlexAnalytics$PaymentOpenReason.PAYMENT_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[IntercityOpenShuttleClarifyPointAction.FlexPointType.values().length];
        try {
            iArr2[IntercityOpenShuttleClarifyPointAction.FlexPointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[IntercityOpenShuttleClarifyPointAction.FlexPointType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
