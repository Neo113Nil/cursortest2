package yads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ba3 implements rw3 {
    public static final ba3 g = new ba3();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final z93 j = new z93();
    public static final aa3 k = new aa3();
    public long f;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final xw3 d = new xw3();
    public final gx3 c = new gx3();
    public final jx3 e = new jx3(new qx3());

    public final void a(View view, uw3 uw3Var, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z2;
        if (ly3.a(view) == null) {
            xw3 xw3Var = this.d;
            char c = xw3Var.d.contains(view) ? (char) 1 : xw3Var.j ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject a = uw3Var.a(view);
            px3.a(jSONObject, a);
            xw3 xw3Var2 = this.d;
            if (xw3Var2.a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) xw3Var2.a.get(view);
                if (obj2 != null) {
                    xw3Var2.a.remove(view);
                }
                obj = obj2;
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    a.put("adSessionId", obj);
                } catch (JSONException e) {
                    xx3.a("Error with setting ad session id", e);
                }
                xw3 xw3Var3 = this.d;
                if (xw3Var3.i.containsKey(view)) {
                    xw3Var3.i.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    a.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException e2) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e2);
                }
                boolean contains = this.d.h.contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        a.put("isPipActive", valueOf);
                    } catch (JSONException e3) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e3);
                    }
                }
                this.d.j = true;
                return;
            }
            xw3 xw3Var4 = this.d;
            qw3 qw3Var = (qw3) xw3Var4.b.get(view);
            if (qw3Var != null) {
                xw3Var4.b.remove(view);
            }
            if (qw3Var != null) {
                by3 by3Var = qw3Var.a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = qw3Var.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    a.put("isFriendlyObstructionFor", jSONArray);
                    a.put("friendlyObstructionClass", by3Var.b);
                    a.put("friendlyObstructionPurpose", by3Var.c);
                    a.put("friendlyObstructionReason", by3Var.d);
                } catch (JSONException e4) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e4);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            uw3Var.a(view, a, this, c == 1, z || z2);
        }
    }
}
