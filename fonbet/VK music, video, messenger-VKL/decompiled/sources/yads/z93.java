package yads;

import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class z93 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ba3 ba3Var = ba3.g;
        ba3Var.getClass();
        ba3Var.b.clear();
        Iterator it = Collections.unmodifiableCollection(rx3.c.b).iterator();
        while (it.hasNext()) {
            ((ax3) it.next()).getClass();
        }
        ba3Var.f = System.nanoTime();
        ba3Var.d.a();
        long nanoTime = System.nanoTime();
        ox3 ox3Var = ba3Var.c.b;
        if (ba3Var.d.f.size() > 0) {
            Iterator it2 = ba3Var.d.f.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                JSONObject a = ox3Var.a(null);
                View view = (View) ba3Var.d.c.get(str);
                wx3 wx3Var = ba3Var.c.a;
                String str2 = (String) ba3Var.d.g.get(str);
                if (str2 != null) {
                    JSONObject a2 = wx3Var.a(view);
                    try {
                        a2.put("adSessionId", str);
                    } catch (JSONException e) {
                        xx3.a("Error with setting ad session id", e);
                    }
                    try {
                        a2.put("notVisibleReason", str2);
                    } catch (JSONException e2) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e2);
                    }
                    px3.a(a, a2);
                }
                px3.a(a);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                jx3 jx3Var = ba3Var.e;
                jx3Var.b.a(new dy3(jx3Var, hashSet, a, nanoTime));
            }
        }
        if (ba3Var.d.e.size() > 0) {
            JSONObject a3 = ox3Var.a(null);
            ox3Var.a(null, a3, ba3Var, true, false);
            px3.a(a3);
            jx3 jx3Var2 = ba3Var.e;
            jx3Var2.b.a(new gy3(jx3Var2, ba3Var.d.e, a3, nanoTime));
        } else {
            jx3 jx3Var3 = ba3Var.e;
            jx3Var3.b.a(new yx3(jx3Var3));
        }
        xw3 xw3Var = ba3Var.d;
        xw3Var.a.clear();
        xw3Var.b.clear();
        xw3Var.c.clear();
        xw3Var.d.clear();
        xw3Var.e.clear();
        xw3Var.f.clear();
        xw3Var.g.clear();
        xw3Var.j = false;
        xw3Var.h.clear();
        long nanoTime2 = System.nanoTime() - ba3Var.f;
        if (ba3Var.a.size() > 0) {
            Iterator it3 = ba3Var.a.iterator();
            if (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                throw null;
            }
        }
        py3.d.a();
    }
}
