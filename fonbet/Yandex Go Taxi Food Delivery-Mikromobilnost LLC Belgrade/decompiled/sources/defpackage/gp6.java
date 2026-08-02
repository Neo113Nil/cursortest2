package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.entities.BudgetGetStatusEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class gp6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BudgetGetStatusEntity$Status.values().length];
        try {
            iArr[BudgetGetStatusEntity$Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BudgetGetStatusEntity$Status.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BudgetGetStatusEntity$Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BudgetGetStatusEntity$Status.TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
