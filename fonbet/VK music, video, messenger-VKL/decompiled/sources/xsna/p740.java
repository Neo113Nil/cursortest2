package xsna;

import com.vk.multiplecoownership.model.MultipleCoownershipType;

/* compiled from: MultipleCoownershipModelToUiDtoMapper.kt */
/* loaded from: classes3.dex */
public final class p740 {
    public final s740 a;

    /* compiled from: MultipleCoownershipModelToUiDtoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MultipleCoownershipType.values().length];
            try {
                iArr[MultipleCoownershipType.Approve.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MultipleCoownershipType.Reject.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p740(s740 s740Var) {
        this.a = s740Var;
    }
}
