package xsna;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import java.util.List;
import xsna.nr7;
import xsna.ur7;

/* compiled from: BookingMastersStateToViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class vr7 implements izs<nr7, ur7> {
    public static final vr7 b = new vr7();

    @Override // xsna.izs
    public final ur7 invoke(nr7 nr7Var) {
        nr7 nr7Var2 = nr7Var;
        nr7.a aVar = nr7Var2.e;
        if (aVar != null) {
            return new ur7.b(new nr7.a(aVar.a, aVar.b));
        }
        List<BookingMaster> list = nr7Var2.c;
        return list != null ? new ur7.d(list) : nr7Var2.d ? ur7.c.b : ur7.a.b;
    }
}
