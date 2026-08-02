package xsna;

import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import xsna.gnd;
import xsna.q630;
import xsna.qrx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class o54 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o54(int i, int i2, Object obj, xzs xzsVar, q630 q630Var) {
        this.b = i2;
        this.c = obj;
        this.d = xzsVar;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        char c = 1;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                p54.a((s44) obj5, (izs) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                BookingStartScreenFragment bookingStartScreenFragment = (BookingStartScreenFragment) obj5;
                yw90 yw90Var = (yw90) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = BookingStartScreenFragment.S;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1670005600, intValue, -1, "com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment.onCreateView.<anonymous>.<anonymous> (BookingStartScreenFragment.kt:103)");
                    }
                    nzw nzwVar = bookingStartScreenFragment.Q;
                    qcy<Object> qcyVar = BookingStartScreenFragment.S[0];
                    yz7 yz7Var = (yz7) nzwVar.getValue();
                    View view = bookingStartScreenFragment.getView();
                    boolean y = aVar.y(bookingStartScreenFragment);
                    Object x = aVar.x();
                    if (y || x == c0012a) {
                        x = new k9(bookingStartScreenFragment, 14);
                        aVar.R(x);
                    }
                    vz7.f(yz7Var, this.d, yw90Var, view, (izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((krx) obj5).i((qrx.b) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                v6p0 v6p0Var = (v6p0) obj5;
                mtk0 mtk0Var = (mtk0) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(91737145, intValue2, -1, "com.vk.clips.coauthors.selector.ui.MainContent.<anonymous> (MainContent.kt:77)");
                    }
                    q630 f = txj0.f(q630.a.a, 1.0f);
                    boolean J = aVar2.J(v6p0Var);
                    Object x2 = aVar2.x();
                    if (J || x2 == c0012a) {
                        x2 = new mgz(v6p0Var, 3);
                        aVar2.R(x2);
                    }
                    de00.a(v6p0Var, ahh0.b(f, m4s.C((izs) x2, aVar2, 0), Orientation.Vertical), kai.c(1848596247, new pmg(c == true ? 1 : 0, mtk0Var, izsVar), aVar2), aVar2, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ly00.a(ne7.I(385), (androidx.compose.runtime.a) obj, (String) obj5, (gzs) obj3, (q630) obj4);
                break;
            default:
                ((Integer) obj2).getClass();
                r7p0.b((gnd.a) obj5, (izs) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ o54(BookingStartScreenFragment bookingStartScreenFragment, Object obj, yw90 yw90Var) {
        this.b = 1;
        this.c = bookingStartScreenFragment;
        this.d = obj;
        this.e = yw90Var;
    }

    public /* synthetic */ o54(krx krxVar, qrx.b bVar, izs izsVar, int i) {
        this.b = 2;
        this.c = krxVar;
        this.e = bVar;
        this.d = izsVar;
    }

    public /* synthetic */ o54(v6p0 v6p0Var, wh50 wh50Var, izs izsVar) {
        this.b = 3;
        this.c = v6p0Var;
        this.e = wh50Var;
        this.d = izsVar;
    }
}
