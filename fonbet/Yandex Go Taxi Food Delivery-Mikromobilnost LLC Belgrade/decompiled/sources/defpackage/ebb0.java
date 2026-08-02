package defpackage;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes3.dex */
public final class ebb0 {
    public static final /* synthetic */ kgx[] c;
    public final xiu0 a;
    public final JsonAdapter b;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("savedFilters", 0, "getSavedFilters()Ljava/lang/String;", ebb0.class);
        qoi0.a.getClass();
        c = new kgx[]{mutablePropertyReference1Impl};
    }

    public ebb0(cab0 cab0Var) {
        SharedPreferences sharedPreferences = cab0Var.b;
        Long b = cab0Var.c.b();
        String l = b != null ? b.toString() : null;
        if (l == null) {
            x4c.g("Passport uid is null", null, null, Collections.singletonList(lrp0.u), 6);
        }
        this.a = new xiu0(sharedPreferences, l != null ? l.concat("::pfm_saved_filters") : "pfm_saved_filters");
        this.b = cab0Var.a.adapter(ybb0[].class);
    }

    public final String a() {
        kgx kgxVar = c[0];
        xiu0 xiu0Var = this.a;
        return xiu0Var.a.getString(xiu0Var.b, null);
    }

    public final void b(Set set) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (obj instanceof ucb0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ni91.m((ucb0) it.next()));
            }
            Object[] array = arrayList2.toArray(new ybb0[0]);
            if (((ybb0[]) array).length == 0) {
                array = null;
            }
            ybb0[] ybb0VarArr = (ybb0[]) array;
            String json2 = ybb0VarArr != null ? this.b.toJson(ybb0VarArr) : null;
            xiu0 xiu0Var = this.a;
            kgx kgxVar = c[0];
            xiu0Var.a(json2);
        } catch (Exception e) {
            x4c.g("Pfm filters local saving error", e, null, Collections.singletonList(lrp0.u), 4);
        }
    }
}
