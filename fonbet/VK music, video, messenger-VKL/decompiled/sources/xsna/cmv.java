package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: IBookingEditInteractor.kt */
/* loaded from: classes18.dex */
public interface cmv {

    /* compiled from: IBookingEditInteractor.kt */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConfirmedBooking(recordId=");
            sb.append(this.a);
            sb.append(", recordHash=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: IBookingEditInteractor.kt */
    public static final class b {
        public final BookingScreenParams a;
        public final BookingEditModel.EditMode b;
        public final boolean c;

        public b(BookingScreenParams bookingScreenParams, BookingEditModel.EditMode editMode, boolean z) {
            this.a = bookingScreenParams;
            this.b = editMode;
            this.c = z;
        }
    }

    BookingEditModel a(b bVar, BookingEditModel.c cVar, BookingSettings bookingSettings);

    Object b(b bVar, BookingEditModel bookingEditModel, String str, Boolean bool, ContinuationImpl continuationImpl);
}
