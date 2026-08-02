package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: BookingStartStateToViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class e08 implements izs<com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k, o.a> {
    public static final e08 b = new e08();

    @Override // xsna.izs
    public final o.a invoke(com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k kVar) {
        com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.k kVar2 = kVar;
        k.a aVar = kVar2.c;
        boolean z = kVar2.d;
        String str = kVar2.e;
        String str2 = kVar2.f;
        List<BookingMaster> list = kVar2.h;
        BookingRecord bookingRecord = kVar2.i;
        av7 b2 = bookingRecord != null ? wu7.b(bookingRecord) : null;
        boolean z2 = kVar2.j;
        BookingSettings bookingSettings = kVar2.g;
        return new o.a(aVar, z, str, str2, list, b2, z2, bookingSettings != null ? bookingSettings.c : "", kVar2.k, bookingSettings != null ? bookingSettings.i : EmptyList.b, kVar2.l);
    }
}
