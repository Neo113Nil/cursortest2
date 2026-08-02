package xsna;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.rustore.sdk.core.config.a;
import xsna.fz5;
import xsna.pn00;
import xsna.r9y0;

/* loaded from: classes9.dex */
public final class r9y0 {
    public final kyy0 a;
    public final pvp0 b;
    public final vgq c;
    public final Context d;
    public final bpn0 e = new bpn0(new gzs<Map<String, ? extends String>>() { // from class: ru.rustore.sdk.appupdate.a$a
        {
            super(0);
        }

        @Override // xsna.gzs
        public final Map<String, ? extends String> invoke() {
            fz5 fz5Var = r9y0.this.b.a;
            return pn00.k(new Pair("sdkName", "ru.rustore.sdk:appupdate"), new Pair("sdkType", a.C2396a.a().a.h()), new Pair("sdkVersion", "6.1.1"));
        }
    });

    public r9y0(kyy0 kyy0Var, pvp0 pvp0Var, vgq vgqVar, Context context) {
        this.a = kyy0Var;
        this.b = pvp0Var;
        this.c = vgqVar;
        this.d = context;
    }

    public final LinkedHashMap a(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = (String) this.c.a.b.getValue();
        if (str == null) {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put("appVersion", str);
        }
        linkedHashMap.put("app_bundle", this.d.getPackageName());
        linkedHashMap.put(HiAnalyticsConstant.BI_KEY_UPDATE_TYPE, i != 0 ? i != 1 ? "SILENT" : "IMMEDIATE" : "FLEXIBLE");
        return linkedHashMap;
    }

    public final void b(int i, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(a(i));
        linkedHashMap.put("errorCode", str);
        jiy0 jiy0Var = new jiy0("updateStart.error", linkedHashMap);
        Context context = this.d;
        xx1.A(context, context.getPackageName(), jiy0Var);
    }
}
