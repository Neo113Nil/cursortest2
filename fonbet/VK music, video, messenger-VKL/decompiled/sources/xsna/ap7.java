package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BookingEditInteractorFactory.kt */
/* loaded from: classes18.dex */
public final class ap7 {
    public final loi0 a;
    public final cs b;
    public final b25 c;

    /* compiled from: BookingEditInteractorFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingServiceType.values().length];
            try {
                iArr[BookingServiceType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingServiceType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ap7(loi0 loi0Var, bs bsVar, b25 b25Var) {
        this.a = loi0Var;
        this.b = bsVar;
        this.c = b25Var;
    }

    public final g76 a(BookingServiceType bookingServiceType) {
        int i = a.$EnumSwitchMapping$0[bookingServiceType.ordinal()];
        b25 b25Var = this.c;
        cs csVar = this.b;
        loi0 loi0Var = this.a;
        if (i == 1) {
            return new zo7(loi0Var, csVar, b25Var);
        }
        if (i == 2) {
            return new qq7(loi0Var, csVar, b25Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
