package defpackage;

import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyProgramStateDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class lwz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoyaltyProgramStateDto.values().length];
        try {
            iArr[LoyaltyProgramStateDto.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoyaltyProgramStateDto.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoyaltyProgramStateDto.NEED_ACTIVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
