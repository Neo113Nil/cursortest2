package xsna;

import androidx.compose.runtime.a;
import com.vk.clips.upload.ui.api.entities.ErrorType;
import com.vk.dto.common.Peer;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.yhf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mn7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mn7(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                sn7 sn7Var = (sn7) this.d;
                izs izsVar = (izs) this.c;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(jjVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(440944128, intValue, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.BookingCalendarMasterFilter.<anonymous> (BookingCalendarScreenMviView.kt:237)");
                    }
                    boolean z = true ^ sn7Var.b;
                    String str = sn7Var.a;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new j87(izsVar, 1);
                        aVar.R(x);
                    }
                    int i = (intValue & 14) | 3072;
                    pn7.i(jjVar, z, str, "master_tab", (gzs) x, aVar, i);
                    boolean z2 = sn7Var.b;
                    String N = d370.N(R.string.booking_master_filter_any_button, 0, aVar);
                    boolean J2 = aVar.J(izsVar);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new dn7(izsVar, 0);
                        aVar.R(x2);
                    }
                    pn7.i(jjVar, z2, N, "all-masters_tab", (gzs) x2, aVar, i);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                yhf yhfVar = (yhf) this.d;
                izs izsVar2 = (izs) this.c;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(s890Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(52112830, intValue2, -1, "com.vk.clips.upload.ui.impl.compose.views.Content.<anonymous> (ClipsUploadScreen.kt:231)");
                    }
                    if (yhfVar instanceof yhf.a) {
                        aVar2.K(2010218637);
                        ErrorType errorType = ((yhf.a) yhfVar).b;
                        boolean J3 = aVar2.J(izsVar2);
                        Object x3 = aVar2.x();
                        if (J3 || x3 == a.C0011a.a) {
                            x3 = new nq0(izsVar2, 2);
                            aVar2.R(x3);
                        }
                        bvp.a((gzs) x3, errorType, null, aVar2, 0);
                        aVar2.j();
                    } else {
                        boolean z3 = yhfVar instanceof yhf.b;
                        q630.a aVar3 = q630.a.a;
                        if (z3) {
                            aVar2.K(2010494320);
                            yhf.b bVar = (yhf.b) yhfVar;
                            khf.b(bVar.a, bVar.b, bVar.c, bVar.d, izsVar2, s200.C(txj0.d(aVar3, 1.0f), s890Var), aVar2, 0);
                            aVar2.j();
                        } else {
                            if (!(yhfVar instanceof yhf.c)) {
                                throw alb0.c(-1459176250, aVar2);
                            }
                            aVar2.K(-1459147740);
                            zsz.a(txj0.d(aVar3, 1.0f), aVar2, 6);
                            aVar2.j();
                        }
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                dxf dxfVar = (dxf) this.d;
                return dxfVar.a.D0((Peer) this.c, (gkx0) obj, (gkx0) obj2, ((Integer) obj3).intValue());
        }
    }
}
