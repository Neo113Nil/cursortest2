package xsna;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class rm7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rm7(int i, int i2, int i3, Object obj, Object obj2) {
        this.b = i3;
        this.e = obj;
        this.f = obj2;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                BookingCalendarDayBlockViewKt.b((BookingCalendarScreenState.DaySelector.a) this.e, this.c, (gzs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                c7d.b((jdj0) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                mnx0.h((spg0) this.e, (String) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rm7(BookingCalendarScreenState.DaySelector.a aVar, int i, gzs gzsVar, int i2) {
        this.b = 0;
        this.e = aVar;
        this.c = i;
        this.f = gzsVar;
        this.d = i2;
    }
}
