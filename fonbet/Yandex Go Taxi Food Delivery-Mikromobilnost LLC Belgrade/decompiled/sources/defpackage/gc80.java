package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class gc80 {
    public final d380 a(w201 w201Var) {
        String str;
        if (w201Var instanceof q6y0) {
            q6y0 q6y0Var = (q6y0) w201Var;
            String a = q6y0Var.a();
            String alias = ServiceType.TAXI.getAlias();
            String d = cta1.d(q6y0Var.z());
            List m = q6y0Var.m();
            m6y0 x = q6y0Var.x();
            yfb w = q6y0Var.w();
            ArrayList arrayList = new ArrayList();
            Iterator it = m.iterator();
            while (it.hasNext()) {
                arrayList.add(((xw) it.next()).a().getAnalyticAlias());
            }
            if (x.b()) {
                arrayList.add("rating");
            }
            if (!jl40.l(w, yfb.j) && w.c()) {
                if (w.a() instanceof ic8) {
                    arrayList.add("check_in_instruction");
                }
                arrayList.add(w.b().getAnalyticName());
            }
            return new d380(a, alias, d, arrayList);
        }
        if (w201Var instanceof d3p) {
            d3p d3pVar = (d3p) w201Var;
            return new d380(d3pVar.a, d3pVar.c.getValue(), d3pVar.f.getId());
        }
        if (w201Var instanceof jem) {
            jem jemVar = (jem) w201Var;
            return new d380(jemVar.a, ServiceType.DRIVE.getAlias(), jemVar.g);
        }
        if (!(w201Var instanceof y2y0)) {
            if (w201Var instanceof bjz) {
                bjz bjzVar = (bjz) w201Var;
                String str2 = bjzVar.b;
                diz dizVar = bjzVar.q;
                if (str2 == null || dizVar == null) {
                    return null;
                }
                return new fc80(str2, ServiceType.LOGISTICS.getAlias(), dizVar.b(), dizVar.a());
            }
            if (w201Var instanceof q6o0) {
                q6o0 q6o0Var = (q6o0) w201Var;
                return new d380(q6o0Var.a, ServiceType.SCOOTERS.getAlias(), y2b1.b(q6o0Var.g).getStatus(), EmptyList.a);
            }
            if (w201Var instanceof xda) {
                xda xdaVar = (xda) w201Var;
                return new d380(xdaVar.a, ServiceType.CHARGERS.getAlias(), xdaVar.g.b().getStringName());
            }
            if (w201Var instanceof v7y0) {
                return new d380(((v7y0) w201Var).getId(), ServiceType.TAXI.getAlias(), DriveState.COMPLETE.toString());
            }
            return null;
        }
        y2y0 y2y0Var = (y2y0) w201Var;
        String str3 = y2y0Var.a;
        String alias2 = ServiceType.LINKED.getAlias();
        LinkedOrderStatusDto linkedOrderStatusDto = y2y0Var.h;
        switch (linkedOrderStatusDto == null ? -1 : xh70.a[linkedOrderStatusDto.ordinal()]) {
            case 1:
            case 2:
                str = "Scheduled";
                break;
            case 3:
                str = "Search";
                break;
            case 4:
                str = "Driving";
                break;
            case 5:
                str = "Waiting";
                break;
            case 6:
                str = "Transporting";
                break;
            case 7:
                str = CA20Status.STATUS_REQUEST_DESCRIPTION_C;
                break;
            case 8:
                str = "Cancelled";
                break;
            case 9:
                str = "Failed ";
                break;
            case 10:
                str = CA20Status.STATUS_CERTIFICATE_DESCRIPTION_E;
                break;
            default:
                str = "";
                break;
        }
        return new d380(str3, alias2, str);
    }
}
