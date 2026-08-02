package com.vungle.ads.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e1 implements Runnable {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ f1 c;

    public e1(f1 f1Var) {
        this.c = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        boolean z;
        Map map3;
        c1 a;
        Map map4;
        c1 a2;
        this.c.g = false;
        map = this.c.a;
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getKey();
            if (f1.a(this.c, view, ((d1) entry.getValue()).b())) {
                this.a.add(view);
            } else {
                this.b.add(view);
            }
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            map4 = this.c.a;
            d1 d1Var = (d1) map4.get(view2);
            if (d1Var != null && (a2 = d1Var.a()) != null) {
                a2.onImpression(view2);
            }
            this.c.a(view2);
        }
        this.a.clear();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            View view3 = (View) it2.next();
            map3 = this.c.a;
            d1 d1Var2 = (d1) map3.get(view3);
            if (d1Var2 != null && (a = d1Var2.a()) != null) {
                a.onViewInvisible(view3);
            }
        }
        this.b.clear();
        map2 = this.c.a;
        if (map2.isEmpty()) {
            return;
        }
        z = this.c.h;
        if (z) {
            return;
        }
        f1.d(this.c);
    }
}
