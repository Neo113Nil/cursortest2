package defpackage;

import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mqy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PartnerWithAction$Status.values().length];
        try {
            iArr[PartnerWithAction$Status.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartnerWithAction$Status.CHECKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PartnerWithAction$Status.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PartnerWithAction$Status.FOUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
