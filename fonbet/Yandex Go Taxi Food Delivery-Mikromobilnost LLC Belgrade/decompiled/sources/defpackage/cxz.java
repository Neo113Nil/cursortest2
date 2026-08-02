package defpackage;

import com.yandex.go.loyalty.impl.selector.domain.model.LoyaltyProgramState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class cxz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoyaltyProgramState.values().length];
        try {
            iArr[LoyaltyProgramState.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoyaltyProgramState.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoyaltyProgramState.NEED_ACTIVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
