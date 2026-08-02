package defpackage;

import com.fluttercandies.photo_manager.constant.AssetType;
import defpackage.d4r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public final class goc extends b5r {
    public final d4r a;
    public final d4r b;
    public final d4r c;
    public final tqg d;
    public final tqg e;
    public final boolean f;
    public final ArrayList g;

    public goc(Map map) {
        this.a = xme.e(map, AssetType.Video);
        this.b = xme.e(map, AssetType.Image);
        this.c = xme.e(map, AssetType.Audio);
        this.d = xme.d((Map) map.get("createDate"));
        this.e = xme.d((Map) map.get("updateDate"));
        this.f = ((Boolean) map.get("containsPathModified")).booleanValue();
        List<Map> list = (List) map.get("orders");
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            arrayList = scc.c(new gj70(ClidProvider._ID, false));
        } else {
            for (Map map2 : list) {
                int intValue = ((Integer) map2.get("type")).intValue();
                boolean booleanValue = ((Boolean) map2.get("asc")).booleanValue();
                String str = intValue != 0 ? intValue != 1 ? null : "date_modified" : "date_added";
                if (str != null) {
                    arrayList.add(new gj70(str, booleanValue));
                }
            }
        }
        this.g = arrayList;
    }

    public static String d(ArrayList arrayList, tqg tqgVar, String str) {
        if (tqgVar.c) {
            return "";
        }
        long j = tqgVar.a;
        long j2 = tqgVar.b;
        String p = unr0.p("AND ( ", str, " >= ? AND ", str, " <= ? )");
        arrayList.add(String.valueOf(j / 1000));
        arrayList.add(String.valueOf(j2 / 1000));
        return p;
    }

    @Override // defpackage.b5r
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.b5r
    public final String b(int i, ArrayList arrayList, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        String str3;
        String p;
        StringBuilder sb = new StringBuilder();
        int i2 = i & 1;
        boolean z5 = i2 == 1;
        int i3 = i & 2;
        boolean z6 = i3 == 2;
        int i4 = i & 4;
        boolean z7 = i4 == 4;
        d4r d4rVar = this.b;
        if (z5) {
            arrayList.add("1");
            d4r.b bVar = d4rVar.a;
            if (bVar == null) {
                bVar = null;
            }
            str = "media_type = ? ";
            if (!bVar.e) {
                String[] b = d4rVar.b();
                str = "media_type = ? ".concat(" AND width >= ? AND width <= ? AND height >= ? AND height <=?");
                ycc.t(arrayList, b);
            }
        } else {
            str = "";
        }
        if (z6) {
            d4r d4rVar2 = this.a;
            z2 = z7;
            d4r.a aVar = d4rVar2.b;
            if (aVar == null) {
                aVar = null;
            }
            String str4 = aVar.c ? "( duration IS NULL OR ( duration >=? AND duration <=? ) )" : "duration >=? AND duration <=?";
            z3 = z5;
            String[] a = d4rVar2.a();
            str2 = "media_type = ? AND ".concat(str4);
            z4 = z6;
            arrayList.add("3");
            ycc.t(arrayList, a);
            d4r.b bVar2 = d4rVar2.a;
            if (bVar2 == null) {
                bVar2 = null;
            }
            if (!bVar2.e) {
                String[] b2 = d4rVar2.b();
                str2 = str2.concat(" AND width >= ? AND width <= ? AND height >= ? AND height <=?");
                ycc.t(arrayList, b2);
            }
        } else {
            z2 = z7;
            z3 = z5;
            z4 = z6;
            str2 = "";
        }
        if (z2) {
            d4r d4rVar3 = this.c;
            d4r.a aVar2 = d4rVar3.b;
            if (aVar2 == null) {
                aVar2 = null;
            }
            String str5 = aVar2.c ? "( duration IS NULL OR ( duration >=? AND duration <=? ) )" : "duration >=? AND duration <=?";
            String[] a2 = d4rVar3.a();
            str3 = "media_type = ? AND ".concat(str5);
            arrayList.add("2");
            ycc.t(arrayList, a2);
        } else {
            str3 = "";
        }
        if (z3) {
            sb.append("( " + str + " )");
        }
        if (z4) {
            if (sb.length() > 0) {
                sb.append("OR ");
            }
            sb.append("( " + str2 + " )");
        }
        if (z2) {
            if (sb.length() > 0) {
                sb.append("OR ");
            }
            sb.append("( " + str3 + " )");
        }
        String str6 = "( " + ((Object) sb) + " )";
        String p2 = g8e.p(d(arrayList, this.d, "date_added"), " ", d(arrayList, this.e, "date_modified"));
        d4r.b bVar3 = d4rVar.a;
        if (!(bVar3 != null ? bVar3 : null).e && i2 == 1) {
            String str7 = i3 == 2 ? "OR ( media_type = 3 )" : "";
            if (i4 == 4) {
                str7 = str7.concat(" OR ( media_type = 2 )");
            }
            p = oyr.p("AND (( media_type = 1 AND width > 0 AND height > 0 ) ", str7, Extension.C_BRAKE);
        } else {
            p = "";
        }
        String q = oyr.q(str6, " ", p2, " ", p);
        return evu0.k0(q).toString().length() == 0 ? "" : z ? oyr.p(" AND ( ", q, " )") : oyr.p(" ( ", q, " ) ");
    }

    @Override // defpackage.b5r
    public final String c() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return null;
        }
        return a.X(arrayList, ",", null, null, new foc(0), 30);
    }
}
