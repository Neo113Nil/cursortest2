package yads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class ia {
    public final sc2 a;
    public final WebView b;
    public final ArrayList c;
    public final HashMap d;
    public final String e;
    public final String f;
    public final String g;
    public final ja h;

    public ia(sc2 sc2Var, String str, List list) {
        ja jaVar = ja.d;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new HashMap();
        this.a = sc2Var;
        this.b = null;
        this.e = str;
        this.h = jaVar;
        arrayList.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qe3 qe3Var = (qe3) it.next();
            this.d.put(UUID.randomUUID().toString(), qe3Var);
        }
        this.g = null;
        this.f = null;
    }

    public final ja a() {
        return this.h;
    }

    public final Map b() {
        return Collections.unmodifiableMap(this.d);
    }

    public final String c() {
        return this.e;
    }

    public final WebView d() {
        return this.b;
    }
}
