package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.p;
import com.yandex.go.taxi.order.state.search.SearchAccessibilityValues;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class bc6 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ bc6(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        p pVar = this.b;
        switch (i) {
            case 0:
                wl70 wl70Var = (wl70) obj;
                if (wl70Var == null) {
                    ((xb6) pVar.Dg()).W3();
                    break;
                } else {
                    ((xb6) pVar.Dg()).Ec(wl70Var);
                    break;
                }
            case 1:
                SearchAccessibilityValues searchAccessibilityValues = (SearchAccessibilityValues) obj;
                pVar.getClass();
                if (searchAccessibilityValues == null || (str = searchAccessibilityValues.a) == null) {
                    str = "";
                }
                ((xb6) pVar.Dg()).q7(str);
                break;
            case 2:
                wl70 wl70Var2 = (wl70) obj;
                if (wl70Var2 == null) {
                    ((xb6) pVar.Dg()).Ne();
                    break;
                } else {
                    ((xb6) pVar.Dg()).fa(wl70Var2);
                    break;
                }
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    pVar.F.b("ShareRoute");
                }
                ((xb6) pVar.Dg()).Sc(booleanValue);
                break;
            default:
                ((xb6) pVar.Dg()).m6(((OrderStatusInfo.TransportInfo) obj) != null);
                break;
        }
        return zy11Var;
    }
}
