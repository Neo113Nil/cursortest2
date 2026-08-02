package defpackage;

import com.ybsdk.feature.partnerpayments.api.PartnerPaymentsFeature$BindingStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mh90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PartnerPaymentsFeature$BindingStatus.values().length];
        try {
            iArr[PartnerPaymentsFeature$BindingStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartnerPaymentsFeature$BindingStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
