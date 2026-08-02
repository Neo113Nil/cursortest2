package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.hu7;
import xsna.lu7;

/* compiled from: BookingRecordCompletedScreenReducer.kt */
/* loaded from: classes18.dex */
public final class ku7 implements bm50<lu7, hu7> {
    @Override // xsna.bm50
    public final lu7 a(lu7 lu7Var, hu7 hu7Var) {
        lu7 lu7Var2 = lu7Var;
        hu7 hu7Var2 = hu7Var;
        if (hu7Var2 instanceof hu7.a) {
            return lu7.a(lu7Var2, false, null, null, false, 6);
        }
        if (hu7Var2.equals(hu7.b.a)) {
            return lu7.a(lu7Var2, false, null, null, true, 7);
        }
        if (hu7Var2.equals(iu7.a)) {
            return lu7.a(lu7Var2, false, null, null, false, 14);
        }
        if (hu7Var2.equals(ju7.a)) {
            return lu7.a(lu7Var2, true, null, null, false, 14);
        }
        if (hu7Var2 instanceof hu7.c) {
            hu7.c cVar = (hu7.c) hu7Var2;
            return lu7.a(lu7Var2, false, new lu7.a(com.vk.ecomm.onlinebooking.impl.common.b.c(cVar.a), cVar.b), null, false, 12);
        }
        if (hu7Var2 instanceof hu7.e) {
            return lu7.a(lu7Var2, false, null, ((hu7.e) hu7Var2).a, false, 10);
        }
        if (hu7Var2 instanceof hu7.d) {
            return lu7.a(lu7Var2, false, null, null, false, 7);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(hu7 hu7Var) {
        return true;
    }
}
