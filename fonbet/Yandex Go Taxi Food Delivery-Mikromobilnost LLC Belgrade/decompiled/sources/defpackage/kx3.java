package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class kx3 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[FrequencyType.values().length];
        try {
            iArr[FrequencyType.ONCE_PER_WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrequencyType.ONCE_PER_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FrequencyType.TWICE_PER_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target.values().length];
        try {
            iArr2[AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target.AMOUNT_FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target.AMOUNT_SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType.values().length];
        try {
            iArr3[AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType.SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}
