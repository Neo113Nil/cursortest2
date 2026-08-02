package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import kotlin.NoWhenBranchMatchedException;
import xsna.mq7;
import xsna.sm7;

/* compiled from: BookingCalendarInteractorFactory.kt */
/* loaded from: classes18.dex */
public final class xm7 {
    public final loi0 a;

    /* compiled from: BookingCalendarInteractorFactory.kt */
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

    public xm7(loi0 loi0Var) {
        this.a = loi0Var;
    }

    public final vm7 a(BookingServiceType bookingServiceType) {
        int i = a.$EnumSwitchMapping$0[bookingServiceType.ordinal()];
        loi0 loi0Var = this.a;
        if (i == 1) {
            return new sm7(new sm7.a(loi0Var));
        }
        if (i == 2) {
            return new mq7(new mq7.a(loi0Var));
        }
        throw new NoWhenBranchMatchedException();
    }
}
