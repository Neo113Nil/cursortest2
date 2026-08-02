package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.go.chargers.data.model.ChargersDebt;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.messaging.internal.gaps.UserGapWorkflow;
import retrofit2.Response;

/* loaded from: classes12.dex */
public final /* synthetic */ class mq5 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ mq5(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        a261 o;
        z161 p;
        boolean z = false;
        r1 = false;
        r1 = false;
        boolean z2 = false;
        r1 = false;
        boolean z3 = false;
        r1 = false;
        boolean z4 = false;
        int i = 0;
        z = false;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                sq5.b((fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj).intValue();
                break;
            case 2:
                kb5 kb5Var = (kb5) obj;
                kb5 kb5Var2 = (kb5) obj2;
                if (jl40.l(kb5Var2.a, kb5Var.a) && jl40.l(kb5Var2.b, kb5Var.b)) {
                    z = true;
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ybb1.a((fid) obj, vng.O(1));
                break;
            case 4:
                UserGapWorkflow userGapWorkflow = (UserGapWorkflow) obj;
                UserGapWorkflow userGapWorkflow2 = (UserGapWorkflow) obj2;
                int i2 = userGapWorkflow == null ? -1 : pe7.a[userGapWorkflow.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    i = -1;
                } else if (userGapWorkflow != userGapWorkflow2) {
                    i = 1;
                }
                break;
            case 5:
                break;
            case 6:
                View inflate = ((LayoutInflater) obj).inflate(poh0.ybsdk_item_month_header, (ViewGroup) obj2, false);
                int i3 = fch0.monthTitle;
                TextView textView = (TextView) cma1.O(i3, inflate);
                if (textView == null) {
                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    break;
                } else {
                    break;
                }
            case 7:
                String a = ((Response) obj).a.y.a("X-YB-Polling-Attempt-After");
                break;
            case 8:
                ((Integer) obj2).getClass();
                bfb1.a((fid) obj, vng.O(1));
                break;
            case 9:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                TaxiOrder taxiOrder2 = (TaxiOrder) obj2;
                if (taxiOrder.h.getB() == taxiOrder2.h.getB() && jl40.l(taxiOrder.o(), taxiOrder2.o())) {
                    z4 = true;
                }
                break;
            case 10:
                break;
            case 11:
                o = a261.o((LayoutInflater) obj, (ViewGroup) obj2);
                break;
            case 12:
                p = z161.p((LayoutInflater) obj, (ViewGroup) obj2);
                break;
            case 13:
                ((Integer) obj).intValue();
                break;
            case 14:
                fnx0 fnx0Var = (fnx0) obj;
                fnx0 fnx0Var2 = (fnx0) obj2;
                if (jl40.l(fnx0Var.c.b, fnx0Var2.c.b) && jl40.l(fnx0Var.c.Y, fnx0Var2.c.Y)) {
                    z3 = true;
                }
                break;
            case 15:
                ChargersDebt chargersDebt = (ChargersDebt) obj;
                ChargersDebt chargersDebt2 = (ChargersDebt) obj2;
                break;
            case 16:
                u3u0 u3u0Var = (u3u0) obj;
                u3u0 u3u0Var2 = (u3u0) obj2;
                if (u3u0Var.b == u3u0Var2.b && jl40.l(u3u0Var.e, u3u0Var2.e) && u3u0Var.c == u3u0Var2.c) {
                    z2 = true;
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                ws9.a((fid) obj, vng.O(1));
                break;
            case 18:
                break;
            case 19:
                ((Integer) obj2).getClass();
                iv9.c((fid) obj, vng.O(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                iv9.b((fid) obj, vng.O(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                iv9.a((fid) obj, vng.O(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                bz9.b((fid) obj, vng.O(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                bz9.d((fid) obj, vng.O(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                bz9.c((fid) obj, vng.O(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                bz9.a((fid) obj, vng.O(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                oib1.a((fid) obj, vng.O(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                tib1.d((fid) obj, vng.O(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                zib1.b((fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                zib1.d((fid) obj, vng.O(1));
                break;
        }
        return zy11.a;
    }

    public /* synthetic */ mq5(int i, int i2) {
        this.a = i2;
    }
}
