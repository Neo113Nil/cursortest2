package defpackage;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes3.dex */
public final class gbm0 {
    public static final /* synthetic */ kgx[] c;
    public final xiu0 a;
    public final JsonAdapter b;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("savedExpandedShelves", 0, "getSavedExpandedShelves()Ljava/lang/String;", gbm0.class);
        qoi0.a.getClass();
        c = new kgx[]{mutablePropertyReference1Impl};
    }

    public gbm0(cab0 cab0Var) {
        SharedPreferences sharedPreferences = cab0Var.b;
        Long b = cab0Var.c.b();
        String l = b != null ? b.toString() : null;
        if (l == null) {
            x4c.g("Passport uid is null", null, null, Collections.singletonList(lrp0.B), 6);
        }
        this.a = new xiu0(sharedPreferences, l != null ? l.concat("::savings_dashboard_v4_expanded_shelves") : "savings_dashboard_v4_expanded_shelves");
        this.b = cab0Var.a.adapter(String[].class);
    }

    public final String a() {
        kgx kgxVar = c[0];
        xiu0 xiu0Var = this.a;
        return xiu0Var.a.getString(xiu0Var.b, null);
    }

    public final void b(Set set) {
        String[] strArr;
        try {
            if (set.isEmpty()) {
                set = null;
            }
            String json2 = (set == null || (strArr = (String[]) set.toArray(new String[0])) == null) ? null : this.b.toJson(strArr);
            xiu0 xiu0Var = this.a;
            kgx kgxVar = c[0];
            xiu0Var.a(json2);
        } catch (Exception e) {
            x4c.g("Savings dashboard V4 expanded shelves saving error", e, null, Collections.singletonList(lrp0.B), 4);
        }
    }
}
