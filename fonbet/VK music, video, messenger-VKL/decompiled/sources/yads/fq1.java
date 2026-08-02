package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class fq1 {
    public final d4 a;
    public final sy2 b;

    public /* synthetic */ fq1(d4 d4Var) {
        this(d4Var, new sy2());
    }

    public Map a(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g9 g9Var = this.a.e;
        if (g9Var != null) {
            Map map = g9Var.g;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            String str = g9Var.b;
            if (str != null) {
                linkedHashMap.put("age", str);
            }
            List list = g9Var.e;
            if (list != null) {
                linkedHashMap.put("context_tags", list);
            }
            String str2 = g9Var.c;
            if (str2 != null) {
                linkedHashMap.put("gender", str2);
            }
            Boolean b = gx2.a().b();
            if (b != null) {
                linkedHashMap.put("age_restricted_user", b);
            }
            qu2 a = gx2.a().a(context);
            Boolean bool = a != null ? a.Z : null;
            if (bool != null) {
                linkedHashMap.put("user_consent", bool);
            }
        }
        td tdVar = this.a.b.b.a;
        boolean b2 = this.b.b(context);
        if (tdVar != null) {
            boolean z = tdVar.b;
            String str3 = tdVar.a;
            if (!b2 && !z && str3 != null) {
                linkedHashMap.put("google_aid", str3);
            }
        }
        linkedHashMap.put("gms_available", Boolean.valueOf(this.a.b.a.f));
        linkedHashMap.put("sdk_version", "7.18.6");
        return linkedHashMap;
    }

    public fq1(d4 d4Var, sy2 sy2Var) {
        this.a = d4Var;
        this.b = sy2Var;
    }
}
