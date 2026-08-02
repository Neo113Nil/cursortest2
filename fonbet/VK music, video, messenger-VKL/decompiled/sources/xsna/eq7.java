package xsna;

import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BookingEditScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class eq7 extends FunctionReferenceImpl implements izs<BookingEditScreenState, BookingEditModel.EditMode> {
    public static final eq7 b = new eq7(1, com.vk.ecomm.onlinebooking.impl.edit.p.class, "composeEditMode", "composeEditMode(Lcom/vk/ecomm/onlinebooking/impl/edit/BookingEditScreenState;)Lcom/vk/ecomm/onlinebooking/impl/edit/model/BookingEditModel$EditMode;", 1);

    @Override // xsna.izs
    public final BookingEditModel.EditMode invoke(BookingEditScreenState bookingEditScreenState) {
        return bookingEditScreenState.c.a;
    }
}
