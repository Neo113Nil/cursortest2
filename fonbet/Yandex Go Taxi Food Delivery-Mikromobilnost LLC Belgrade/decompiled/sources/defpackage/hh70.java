package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes.dex */
public interface hh70 {
    static Map c(zzs zzsVar) {
        int i = zzsVar.c;
        double d = zzsVar.b;
        double d2 = zzsVar.a;
        return i > 0 ? b.i(new Pair("lat", Double.valueOf(d2)), new Pair("lon", Double.valueOf(d)), new Pair("acc", Integer.valueOf(zzsVar.c))) : b.i(new Pair("lat", Double.valueOf(d2)), new Pair("lon", Double.valueOf(d)));
    }

    String a();

    default LinkedHashMap b() {
        LinkedHashMap l = b.l(new Pair("api_endpoint", f()), new Pair("coordinate", c(e())), new Pair(MetaDataField.SCREEN_FIELD, getScreen()));
        zzs myLocation = getMyLocation();
        if (myLocation != null) {
            l.put("myLocation", c(myLocation));
        }
        String method = getMethod();
        if (method != null) {
            l.put("method", method);
        }
        String a = a();
        if (a != null) {
            l.put("MainScreenVersion", a);
        }
        return l;
    }

    zzs e();

    String f();

    boolean g();

    String getMethod();

    zzs getMyLocation();

    String getScreen();
}
