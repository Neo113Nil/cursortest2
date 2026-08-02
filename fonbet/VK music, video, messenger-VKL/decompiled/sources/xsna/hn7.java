package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.onlinebooking.impl.calendar.a;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hn7 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hn7(com.vk.ecomm.onlinebooking.impl.calendar.j jVar, BookingCalendarScreenState.a aVar, pn7 pn7Var, izs izsVar) {
        this.c = izsVar;
        this.d = aVar;
        this.e = jVar;
        this.f = pn7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        izs<? super a.h, s3q0> izsVar;
        pn7 pn7Var;
        switch (this.b) {
            case 0:
                BookingCalendarScreenState.a aVar = (BookingCalendarScreenState.a) this.d;
                com.vk.ecomm.onlinebooking.impl.calendar.j jVar = (com.vk.ecomm.onlinebooking.impl.calendar.j) this.e;
                pn7 pn7Var2 = (pn7) this.f;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-29943671, intValue, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.ThemedContent.<anonymous> (BookingCalendarScreenMviView.kt:109)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, q630.a.a);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar2, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar2, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar2, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar2, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar2, c, dVar);
                    izs<? super a.h, s3q0> izsVar2 = this.c;
                    boolean J = aVar2.J(izsVar2);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new ln7(izsVar2, 0);
                        aVar2.R(x);
                    }
                    TopBar$Before.e a2 = e.a.a((gzs) x, d370.N(R.string.booking_accessability_back, 0, aVar2), null, null, cq.b("back_button", null, 3), aVar2, 196608, 12);
                    TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.booking_calendar_title, 0, aVar2), null, null, null, null, aVar2, 196608, 30), null, null, cq.b("screen_title", null, 3), aVar2, 6);
                    qzu0.a.getClass();
                    lg90 A = qzu0.A(aVar2);
                    String N = d370.N(R.string.booking_accessability_close, 0, aVar2);
                    boolean J2 = aVar2.J(izsVar2);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new cc1(izsVar2, 1);
                        aVar2.R(x2);
                    }
                    muv0.h(a3, null, null, null, a2, null, d.a.a(d.c.C0760d.a.a(A, N, (gzs) x2, null, null, null, aVar2, 1572872, 56), null, null, cq.b("close_button", null, 3), aVar2, 24576, 6), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8110);
                    androidx.compose.runtime.a aVar4 = aVar2;
                    if (aVar == null || !aVar.c) {
                        aVar4.K(-891211811);
                        sn7 sn7Var = (sn7) jk50.a(jVar.a, aVar4, 0, 3).getValue();
                        if (sn7Var != null) {
                            aVar4.K(-891078480);
                            izsVar = izsVar2;
                            pn7Var = pn7Var2;
                            pn7Var.h(sn7Var, izsVar, aVar4, 512);
                        } else {
                            izsVar = izsVar2;
                            pn7Var = pn7Var2;
                            aVar4.K(-898424829);
                        }
                        aVar4.j();
                        BookingCalendarDayBlockViewKt.a(jVar.b, izsVar, aVar4, 0);
                        q630 q630Var = pn7Var.h;
                        cp10 d = ja8.d(dt1.a.f, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630 c2 = qri.c(aVar4, q630Var);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar3);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, d, cVar);
                        k9q0.w(aVar4, D2, eVar);
                        ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                        k9q0.w(aVar4, c2, dVar);
                        ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, null, aVar4, 54, 4);
                        aVar4 = aVar4;
                        aVar4.G();
                    } else {
                        aVar4.K(-898424829);
                    }
                    aVar4.j();
                    aVar4.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                wqs.a((List) this.d, this.c, (gzs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ hn7(List list, izs izsVar, gzs gzsVar, q630 q630Var, int i) {
        this.d = list;
        this.c = izsVar;
        this.e = gzsVar;
        this.f = q630Var;
    }
}
