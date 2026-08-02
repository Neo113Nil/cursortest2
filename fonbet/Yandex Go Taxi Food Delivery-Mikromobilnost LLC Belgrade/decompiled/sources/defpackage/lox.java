package defpackage;

import com.ybsdk.feature.kyc.internal.screens.photo.model.KycBottomSheetContent$Type;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class lox {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KycBottomSheetContent$Type.values().length];
        try {
            iArr[KycBottomSheetContent$Type.GUIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KycBottomSheetContent$Type.EXIT_WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
