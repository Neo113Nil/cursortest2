package defpackage;

import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final class ain0 implements rgn {
    @Override // defpackage.rgn
    public final pxn0 a(String str, String str2, zzs zzsVar, c cVar) {
        String g;
        Integer k;
        int hashCode = str.hashCode();
        int i = 0;
        i = 0;
        if (hashCode != -708569268) {
            if (hashCode != -540852269) {
                if (hashCode == 400435642 && str.equals("show_description")) {
                    b bVar = (b) cVar.get("allow_panorama");
                    return new mxn0(zzsVar, bVar != null ? qcx.e(qcx.n(bVar)) : false);
                }
            } else if (str.equals("pick_scooter")) {
                b bVar2 = (b) cVar.get("number");
                String g2 = bVar2 != null ? qcx.g(qcx.n(bVar2)) : null;
                if (g2 == null) {
                    g2 = "";
                }
                b bVar3 = (b) cVar.get(DRMInfoProvider.MediaDRMKeys.VENDOR);
                g = bVar3 != null ? qcx.g(qcx.n(bVar3)) : null;
                return new xxn0(str2, zzsVar, new r7p0(g2, g != null ? g : ""));
            }
        } else if (str.equals("pick_scooter_parking")) {
            kdx kdxVar = new kdx();
            abb1.d(kdxVar, "type", "cluster_complete_request");
            b bVar4 = (b) cVar.get("provider");
            g = bVar4 != null ? qcx.g(qcx.n(bVar4)) : null;
            abb1.d(kdxVar, "provider", g != null ? g : "");
            b bVar5 = (b) cVar.get("cluster_id");
            if (bVar5 == null) {
                bVar5 = JsonNull.INSTANCE;
            }
            kdxVar.b("cluster_id", bVar5);
            c a = kdxVar.a();
            b bVar6 = (b) cVar.get("allow_panorama");
            boolean e = bVar6 != null ? qcx.e(qcx.n(bVar6)) : false;
            b bVar7 = (b) cVar.get("objects_count");
            if (bVar7 != null && (k = qcx.k(qcx.n(bVar7))) != null) {
                i = k.intValue();
            }
            return new wxn0(str2, zzsVar, a, i, e);
        }
        return nxn0.a;
    }
}
