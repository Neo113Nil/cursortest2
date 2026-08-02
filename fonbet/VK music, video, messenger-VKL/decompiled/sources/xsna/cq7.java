package xsna;

import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BookingEditScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class cq7 extends FunctionReferenceImpl implements izs<BookingEditScreenState, gq7> {
    public static final cq7 b = new cq7(1, com.vk.ecomm.onlinebooking.impl.edit.p.class, "composeError", "composeError(Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState;)Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenRender$Error;", 1);

    @Override // xsna.izs
    public final gq7 invoke(BookingEditScreenState bookingEditScreenState) {
        BookingEditScreenState.d dVar = bookingEditScreenState.d;
        if (dVar != null) {
            return new gq7(dVar.a, dVar.b);
        }
        return null;
    }
}
