package defpackage;

import com.yandex.xplat.payment.sdk.FamilyInfoFrame;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class etf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FamilyInfoFrame.values().length];
        try {
            iArr[FamilyInfoFrame.day.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FamilyInfoFrame.week.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FamilyInfoFrame.month.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
