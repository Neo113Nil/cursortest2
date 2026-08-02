package defpackage;

import com.yandex.go.agreement.api.Acceptance$Default$IconStyle;
import com.yandex.go.zone.dto.response.ZoneAcceptance$Default;
import com.yandex.go.zone.dto.response.ZoneAcceptance$Trackable;
import com.yandex.go.zone.dto.response.p;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.am.k;

/* loaded from: classes.dex */
public final class kd implements jd {
    public final k a;

    public kd(k kVar) {
        this.a = kVar;
    }

    public final ArrayList a(Zone zone) {
        Iterator it;
        dd cdVar;
        List list = zone.r;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            boolean z = pVar instanceof ZoneAcceptance$Default;
            k kVar = this.a;
            if (z) {
                ZoneAcceptance$Default zoneAcceptance$Default = (ZoneAcceptance$Default) pVar;
                it = it2;
                cdVar = new bd(zoneAcceptance$Default.a, kVar.Lg(), zoneAcceptance$Default.h, zoneAcceptance$Default.b, zoneAcceptance$Default.c, zoneAcceptance$Default.d, zoneAcceptance$Default.e, zoneAcceptance$Default.f, zoneAcceptance$Default.g, zoneAcceptance$Default.i, zoneAcceptance$Default.j, zoneAcceptance$Default.k, zoneAcceptance$Default.h ? Acceptance$Default$IconStyle.LEFT : zoneAcceptance$Default.l == ZoneAcceptance$Default.IconStyle.LEFT ? Acceptance$Default$IconStyle.LEFT : Acceptance$Default$IconStyle.CENTER);
            } else {
                it = it2;
                if (!(pVar instanceof ZoneAcceptance$Trackable)) {
                    w511.b();
                    return null;
                }
                ZoneAcceptance$Trackable zoneAcceptance$Trackable = (ZoneAcceptance$Trackable) pVar;
                cdVar = new cd(zoneAcceptance$Trackable.a, kVar.Lg(), zoneAcceptance$Trackable.b, zoneAcceptance$Trackable.c, zoneAcceptance$Trackable.d, zoneAcceptance$Trackable.e, zoneAcceptance$Trackable.f, zone.a, zone.f);
            }
            arrayList.add(cdVar);
            it2 = it;
        }
        return arrayList;
    }
}
