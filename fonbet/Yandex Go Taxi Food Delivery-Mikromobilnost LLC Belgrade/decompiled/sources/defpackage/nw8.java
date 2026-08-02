package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes12.dex */
public final class nw8 {
    public final zuj0 a;

    public /* synthetic */ nw8(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    public static String b(String str, String str2, String str3) {
        StringBuilder t = qv10.t(str);
        if (str2 != null && !evu0.J(str2)) {
            t.append(Extension.FIX_SPACE.concat(str2));
        }
        if (str3 != null && !evu0.J(str3)) {
            t.append(Extension.FIX_SPACE.concat(str3));
        }
        return t.toString();
    }

    public static /* synthetic */ String c(nw8 nw8Var, String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        nw8Var.getClass();
        return b(str, str2, str3);
    }

    public static jxq0 d(ouq0 ouq0Var, ytv ytvVar, wls wlsVar) {
        String str = ouq0Var.a;
        String str2 = ouq0Var.b;
        String str3 = ouq0Var.c;
        String str4 = ouq0Var.e;
        String str5 = ouq0Var.d;
        List list = ouq0Var.f;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(wlsVar.invoke(Integer.valueOf(i), obj));
            i = i2;
        }
        return new jxq0(str, str2, str3, str5, str4, arrayList, ouq0Var, ytvVar);
    }

    public String a(String str, MtTransportType mtTransportType) {
        ListBuilder a = rcc.a();
        int b = aqb1.b(mtTransportType);
        avj0 avj0Var = (avj0) this.a;
        a.add(avj0Var.h(b));
        if (str != null && str.length() != 0) {
            a.add(avj0Var.i(kyh0.mt_underground_line_number_info, str.toString()));
        }
        return a.X(a.j(), Extension.FIX_SPACE, null, null, null, 62);
    }
}
