package defpackage;

import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final class jjn0 implements rgn {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.rgn
    public final pxn0 a(String str, String str2, zzs zzsVar, c cVar) {
        Integer k;
        String g;
        String str3;
        String g2;
        String str4 = "";
        int i = 0;
        i = 0;
        switch (str.hashCode()) {
            case -708569268:
                if (str.equals("pick_scooter_parking")) {
                    kdx kdxVar = new kdx();
                    abb1.d(kdxVar, "type", "cluster_complete_request");
                    b bVar = (b) cVar.get("provider");
                    if (bVar != null && (g = qcx.g(qcx.n(bVar))) != null) {
                        str4 = g;
                    }
                    abb1.d(kdxVar, "provider", str4);
                    b bVar2 = (b) cVar.get("cluster_id");
                    if (bVar2 == null) {
                        bVar2 = JsonNull.INSTANCE;
                    }
                    kdxVar.b("cluster_id", bVar2);
                    c a = kdxVar.a();
                    b bVar3 = (b) cVar.get("allow_panorama");
                    boolean e = bVar3 != null ? qcx.e(qcx.n(bVar3)) : false;
                    b bVar4 = (b) cVar.get("objects_count");
                    if (bVar4 != null && (k = qcx.k(qcx.n(bVar4))) != null) {
                        i = k.intValue();
                    }
                    return new wxn0(str2, zzsVar, a, i, e);
                }
                break;
            case -540852269:
                if (str.equals("pick_scooter")) {
                    b bVar5 = (b) cVar.get("number");
                    if (bVar5 == null || (str3 = qcx.g(qcx.n(bVar5))) == null) {
                        str3 = "";
                    }
                    b bVar6 = (b) cVar.get(DRMInfoProvider.MediaDRMKeys.VENDOR);
                    if (bVar6 != null && (g2 = qcx.g(qcx.n(bVar6))) != null) {
                        str4 = g2;
                    }
                    return new xxn0(str2, zzsVar, new r7p0(str3, str4));
                }
                break;
            case 400435642:
                if (str.equals("show_description")) {
                    b bVar7 = (b) cVar.get("allow_panorama");
                    return new mxn0(zzsVar, bVar7 != null ? qcx.e(qcx.n(bVar7)) : false);
                }
                break;
            case 1407347795:
                if (str.equals("walk_route")) {
                    return new oxn0(zzsVar);
                }
                break;
        }
        return nxn0.a;
    }
}
