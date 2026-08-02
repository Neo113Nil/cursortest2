package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.masstransit.sdk.order.impl.activation.c;
import com.yandex.go.zone.model.Zone;
import java.util.List;
import ru.yandex.taxi.masstransit.address.interactor.i;

/* loaded from: classes14.dex */
public final /* synthetic */ class pjv0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ pjv0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ch6 ch6Var = (ch6) obj;
                ch6 ch6Var2 = (ch6) obj2;
                if (ch6Var.a == ch6Var2.a && ch6Var.b == ch6Var2.b) {
                    r1 = true;
                }
                break;
            case 1:
                View inflate = ((LayoutInflater) obj).inflate(skh0.super_app_discovery_map_search_loading_favorite_item, (ViewGroup) obj2, false);
                if (inflate == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    break;
                }
            case 2:
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                break;
            case 3:
                ((Boolean) obj).getClass();
                ((Boolean) obj2).getClass();
                break;
            case 4:
                uu30 uu30Var = (uu30) obj;
                uu30 uu30Var2 = (uu30) obj2;
                ZoneAddress zoneAddress = uu30Var.a;
                Zone zone = zoneAddress != null ? zoneAddress.b : null;
                List a = uu30Var.a();
                ZoneAddress zoneAddress2 = uu30Var2.a;
                break;
            case 5:
                d0l0 d0l0Var = (d0l0) obj;
                d0l0 d0l0Var2 = (d0l0) obj2;
                ZoneAddress zoneAddress3 = d0l0Var.a;
                Zone zone2 = zoneAddress3 != null ? zoneAddress3.b : null;
                List a2 = d0l0Var.a();
                ZoneAddress zoneAddress4 = d0l0Var2.a;
                break;
            case 6:
                fnx0 fnx0Var = (fnx0) obj;
                fnx0 fnx0Var2 = (fnx0) obj2;
                boolean l = jl40.l(fnx0Var.a.b, fnx0Var2.a.b);
                boolean l2 = jl40.l(fnx0Var.a.f, fnx0Var2.a.f);
                if (l && l2) {
                    r1 = true;
                }
                break;
            case 7:
                break;
            case 8:
                odj0 odj0Var = (odj0) obj;
                odj0 odj0Var2 = (odj0) obj2;
                if (odj0Var.b.a(odj0Var2.b) && odj0Var.a == odj0Var2.a) {
                    r1 = true;
                }
                break;
            case 9:
                ((List) obj).addAll((List) obj2);
                break;
            case 10:
                ((List) obj).add((uhx0) obj2);
                break;
            case 11:
                ((List) obj).addAll(v891.f((List) obj2));
                break;
            case 12:
                ((List) obj).addAll(v891.f((List) obj2));
                break;
            case 13:
                ((List) obj).addAll(v891.f((List) obj2));
                break;
            case 14:
                break;
            case 15:
                Integer num = (Integer) obj;
                num.intValue();
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                yny0 yny0Var = (yny0) obj2;
                break;
            case 25:
                ((Integer) obj2).getClass();
                c.j((fid) obj, vng.O(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                c.d((fid) obj, vng.O(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                c.e((fid) obj, vng.O(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                c.g((fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                c.f((fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ pjv0(i iVar, int i) {
        this.a = i;
    }
}
