package defpackage;

import com.yandex.go.places.impl.data.entities.network.bookings.BookingDto;
import com.yandex.go.places.impl.data.entities.network.bookings.PriceDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes13.dex */
public final class p5c0 {
    public static ArrayList a(BookingDto bookingDto) {
        Pair b = b(4, bookingDto.e);
        Pair b2 = b(1, bookingDto.g);
        PriceDto priceDto = bookingDto.i;
        List A = j73.A(new Pair[]{b, b2, b(2, priceDto != null ? priceDto.d : null)});
        ArrayList arrayList = new ArrayList(tcc.n(A, 10));
        int i = 0;
        for (Object obj : A) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Pair pair = (Pair) obj;
            String str = (String) pair.getFirst();
            int intValue = ((Number) pair.getSecond()).intValue();
            if (i != 0) {
                str = g8e.o(" • ", str);
            }
            arrayList.add(new jwd(str, Integer.valueOf(intValue)));
            i = i2;
        }
        return arrayList;
    }

    public static Pair b(int i, String str) {
        if (str == null) {
            return null;
        }
        if (evu0.J(str)) {
            str = null;
        }
        if (str != null) {
            return new Pair(str, Integer.valueOf(i));
        }
        return null;
    }
}
