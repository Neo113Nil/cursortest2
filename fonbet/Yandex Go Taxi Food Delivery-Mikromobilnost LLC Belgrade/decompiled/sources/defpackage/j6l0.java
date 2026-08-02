package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.preorder.source.routeoverlay.a;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final /* synthetic */ class j6l0 implements MapObjectTapListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ j6l0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    @Override // com.yandex.mapkit.map.MapObjectTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        String str;
        mi31 d;
        pex0 pex0Var;
        is60 is60Var;
        List list;
        Object obj;
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                mjc mjcVar = (mjc) aVar.J;
                pex0 m = ((k) mjcVar.c).m();
                String str2 = null;
                if (m != null && (list = m.S) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((ServiceLevel.Branding) obj).c == ServiceLevel.Branding.Type.COMBO_INNER_PIN) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ServiceLevel.Branding branding = (ServiceLevel.Branding) obj;
                    if (branding != null) {
                        str = branding.e;
                        d = b8r.d(mjcVar.d, "combo", null, 6);
                        if (d != null && (pex0Var = d.a) != null && (is60Var = pex0Var.J0.b) != null) {
                            str2 = is60Var.a();
                        }
                        kf00 kf00Var = (kf00) mjcVar.a.b;
                        HashMap A = oyr.A(kf00Var);
                        if (str2 != null) {
                            A.put("offer_id", str2);
                        }
                        if (str != null) {
                            A.put("title", str);
                        }
                        kf00Var.a.a("Map.ComboBubble.Tapped", A, 1, new HashMap());
                        mjcVar.b.b(SelectionOrigin.DEEPLINK, "combo", "", false);
                        break;
                    }
                }
                str = null;
                d = b8r.d(mjcVar.d, "combo", null, 6);
                if (d != null) {
                    str2 = is60Var.a();
                }
                kf00 kf00Var2 = (kf00) mjcVar.a.b;
                HashMap A2 = oyr.A(kf00Var2);
                if (str2 != null) {
                }
                if (str != null) {
                }
                kf00Var2.a.a("Map.ComboBubble.Tapped", A2, 1, new HashMap());
                mjcVar.b.b(SelectionOrigin.DEEPLINK, "combo", "", false);
                break;
            default:
                if (!(aVar.N.a() instanceof vyb0)) {
                    lft0 lft0Var = aVar.c0;
                    if (lft0Var != null) {
                        lft0Var.h();
                        break;
                    }
                } else {
                    aVar.O.c();
                    break;
                }
                break;
        }
        return true;
    }
}
