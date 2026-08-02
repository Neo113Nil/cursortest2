package defpackage;

import com.ybsdk.feature.card.internal.entities.SetCardStatusScreenEntity$SetResultState$StateType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ko8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SetCardStatusScreenEntity$SetResultState$StateType.values().length];
        try {
            iArr[SetCardStatusScreenEntity$SetResultState$StateType.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SetCardStatusScreenEntity$SetResultState$StateType.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
