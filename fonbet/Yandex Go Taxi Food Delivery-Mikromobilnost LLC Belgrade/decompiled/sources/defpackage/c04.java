package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusEntity;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c04 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutotopupPaymentStatusEntity.Status.values().length];
        try {
            iArr[AutotopupPaymentStatusEntity.Status.DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutotopupPaymentStatusEntity.Status.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
