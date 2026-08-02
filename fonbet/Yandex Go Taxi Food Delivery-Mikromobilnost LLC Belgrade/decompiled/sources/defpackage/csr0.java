package defpackage;

import com.yandex.go.sharing_personal_goals.SharingPersonalGoalsPrimaryButtonStyle;
import com.yandex.go.sharing_personal_goals.SharingPersonalGoalsProgressStyle;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class csr0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SharingPersonalGoalsPrimaryButtonStyle.values().length];
        try {
            iArr[SharingPersonalGoalsPrimaryButtonStyle.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharingPersonalGoalsPrimaryButtonStyle.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SharingPersonalGoalsProgressStyle.values().length];
        try {
            iArr2[SharingPersonalGoalsProgressStyle.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SharingPersonalGoalsProgressStyle.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
