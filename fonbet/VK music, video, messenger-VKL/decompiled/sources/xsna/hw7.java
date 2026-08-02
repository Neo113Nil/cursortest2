package xsna;

import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bv7;

/* compiled from: BookingRecordsScreenReducer.kt */
/* loaded from: classes18.dex */
public final class hw7 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bv7.c(wu7.b((BookingRecord) it.next())));
        }
        return arrayList2;
    }
}
