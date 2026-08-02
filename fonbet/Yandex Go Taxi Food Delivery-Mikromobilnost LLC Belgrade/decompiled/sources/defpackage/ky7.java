package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.b;
import com.yandex.go.taxi.order.cancel.v3.ui.a;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plaque.PlaqueView;

/* loaded from: classes12.dex */
public final /* synthetic */ class ky7 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ky7(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onStateChangeListener$lambda$0;
        int i = this.a;
        final int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.g((az7) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a.a((zy7) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a.e((cz7) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                a.c((xy7) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 4:
                tls tlsVar = (tls) obj4;
                final vu7 vu7Var = (vu7) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                final int i3 = 0;
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    c530 c530Var = c530.a;
                    f530 c = ljs0.c(c530Var, 1.0f);
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (k || Q == o430Var) {
                        Q = new zp5(15, tlsVar);
                        btsVar.o0(Q);
                    }
                    ulb1.a(c, false, null, (sls) Q, wwg.S(-1809406099, true, new zls() { // from class: y18
                        @Override // defpackage.zls
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i4 = i3;
                            zy11 zy11Var2 = zy11.a;
                            vu7 vu7Var2 = vu7Var;
                            switch (i4) {
                                case 0:
                                    fid fidVar2 = (fid) obj6;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    bts btsVar2 = (bts) fidVar2;
                                    if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        jeb1.f(vu7Var2.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar2, 0, 0, 32766);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj6;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        jeb1.f(vu7Var2.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar3, 0, 0, 32766);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar), btsVar, 24582, 6);
                    f530 c2 = ljs0.c(c530Var, 1.0f);
                    boolean k2 = btsVar.k(tlsVar);
                    Object Q2 = btsVar.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new zp5(16, tlsVar);
                        btsVar.o0(Q2);
                    }
                    ohb1.b(c2, false, null, (sls) Q2, wwg.S(-691315457, true, new zls() { // from class: y18
                        @Override // defpackage.zls
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i4 = i2;
                            zy11 zy11Var2 = zy11.a;
                            vu7 vu7Var2 = vu7Var;
                            switch (i4) {
                                case 0:
                                    fid fidVar2 = (fid) obj6;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    bts btsVar2 = (bts) fidVar2;
                                    if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        jeb1.f(vu7Var2.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar2, 0, 0, 32766);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj6;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        jeb1.f(vu7Var2.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar3, 0, 0, 32766);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar), btsVar, 24582, 6);
                    break;
                }
            case 5:
                ((Integer) obj2).getClass();
                afb1.a((x58) obj3, (tls) obj4, (fid) obj, vng.O(9));
                break;
            case 6:
                onStateChangeListener$lambda$0 = CardInputViewImpl.setOnStateChangeListener$lambda$0((CardInputViewImpl) obj3, (tls) obj4, (CardInput$State) obj, (CardInput$State) obj2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((zs8) obj3).a((wls) obj4, (fid) obj, vng.O(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.g((x2v0) obj3, (f530) obj4, (fid) obj, vng.O(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.h((ajz0) obj3, (f530) obj4, (fid) obj, vng.O(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.f((yfv) obj3, (f530) obj4, (fid) obj, vng.O(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.b((d47) obj3, (f530) obj4, (fid) obj, vng.O(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.e((b) obj3, (tpr) obj4, (fid) obj, vng.O(1));
                break;
            case 13:
                x39 x39Var = (x39) obj3;
                NotificationTimedItemComponent notificationTimedItemComponent = (NotificationTimedItemComponent) obj;
                c.z(new u08(12, x39Var, (wnb0) obj4), notificationTimedItemComponent);
                notificationTimedItemComponent.setExpiresListener(new wz1(i2, x39Var));
                notificationTimedItemComponent.setDetachListener(new e48(13, x39Var));
                break;
            case 14:
                ru.yandex.taxi.cashback.view.a aVar = (ru.yandex.taxi.cashback.view.a) obj3;
                q49 q49Var = (q49) obj4;
                if (!(((brc0) obj2) instanceof zqc0)) {
                    aVar.b.setTouchDelegate(null);
                    break;
                } else {
                    PlaqueView plaqueView = q49Var.a;
                    aVar.getClass();
                    ViewGroup viewGroup = aVar.b;
                    Rect rect = new Rect();
                    plaqueView.getHitRect(rect);
                    if (!rect.isEmpty()) {
                        int i4 = rect.top;
                        int i5 = aVar.h;
                        rect.top = i4 - i5;
                        rect.left -= i5;
                        rect.right += i5;
                        rect.bottom += i5;
                        viewGroup.setTouchDelegate(new TouchDelegate(rect, plaqueView));
                        break;
                    } else {
                        viewGroup.setTouchDelegate(null);
                        break;
                    }
                }
            case 15:
                ((Integer) obj2).getClass();
                ygb1.a((vd9) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ihb1.a((sr9) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ihb1.d((mya) obj3, (tls) obj4, (fid) obj, vng.O(9));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ihb1.c((pna) obj3, (tls) obj4, (fid) obj, vng.O(9));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ihb1.b((kna) obj3, (tls) obj4, (fid) obj, vng.O(9));
                break;
            case 20:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.discounts.discount_stations.ui.b.a((it9) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.discounts.discount_stations.ui.b.b((ft9) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.discounts.activate.c.a((du9) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                shb1.b((dw9) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.feedback.ui.b.b((ty9) obj3, (tls) obj4, (fid) obj, vng.O(9));
                break;
            case 25:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.feedback.ui.b.g((String) obj3, (nvi0) obj4, (fid) obj, vng.O(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.feedback.ui.b.h((dz9) obj3, (sls) obj4, (fid) obj, vng.O(9));
                break;
            case 27:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.feedback.ui.b.k((t0a) obj3, (tls) obj4, (fid) obj, vng.O(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                t691.a((f530) obj3, (lna) obj4, (fid) obj, vng.O(1));
                break;
            default:
                ((tls) obj4).invoke(new eaa((String) obj, ((Boolean) obj2).booleanValue(), true ^ ((oaa) ((paa) obj3)).h));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ky7(tls tlsVar, int i, Object obj) {
        this.a = i;
        this.b = tlsVar;
        this.c = obj;
    }

    public /* synthetic */ ky7(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
    }
}
