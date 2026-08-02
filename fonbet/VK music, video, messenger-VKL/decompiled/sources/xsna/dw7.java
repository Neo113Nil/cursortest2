package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.iw7;

/* compiled from: BookingRecordsScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class dw7 extends FunctionReferenceImpl implements izs<iw7.d, String> {
    public static final dw7 b = new dw7(1, hw7.class, "composeCurrency", "composeCurrency(Lcom/vk/ecomm/onlinebooking/impl/records/BookingRecordsScreenState$Main;)Ljava/lang/String;", 1);

    @Override // xsna.izs
    public final String invoke(iw7.d dVar) {
        BookingSettings bookingSettings;
        BookingScreenParams bookingScreenParams = dVar.d;
        String str = (bookingScreenParams == null || (bookingSettings = bookingScreenParams.d) == null) ? null : bookingSettings.c;
        return str == null ? "" : str;
    }
}
