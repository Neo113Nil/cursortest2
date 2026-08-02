package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class oo61 {
    public static final oo61 f = new oo61();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static Handler h = null;
    public static final zg61 i = new zg61();
    public static final il61 j = new il61();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final zw71 d = new zw71();
    public final zm81 c = new zm81();
    public final yv81 e = new yv81(new y771());

    public final void a(View view, rq71 rq71Var, JSONObject jSONObject, boolean z) {
        if (jna1.a(view) == null) {
            zw71 zw71Var = this.d;
            HashSet hashSet = zw71Var.d;
            HashMap hashMap = zw71Var.b;
            WeakHashMap weakHashMap = zw71Var.i;
            char c = hashSet.contains(view) ? (char) 1 : zw71Var.j ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            int[] iArr = rq71Var.a;
            int width = view.getWidth();
            int height = view.getHeight();
            view.getLocationOnScreen(iArr);
            boolean z2 = false;
            JSONObject a = y471.a(iArr[0], iArr[1], width, height);
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    jSONObject.put("childViews", optJSONArray);
                }
                optJSONArray.put(a);
            } catch (JSONException unused) {
            }
            HashMap hashMap2 = zw71Var.a;
            String str = null;
            if (hashMap2.size() != 0 && (str = (String) hashMap2.get(view)) != null) {
                hashMap2.remove(view);
            }
            if (str != null) {
                try {
                    a.put("adSessionId", str);
                } catch (JSONException e) {
                    Log.e("OMIDLIB", "Error with setting ad session id", e);
                }
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z2 = true;
                }
                try {
                    a.put("hasWindowFocus", Boolean.valueOf(z2));
                } catch (JSONException e2) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e2);
                }
                boolean contains = zw71Var.h.contains(str);
                Boolean valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        a.put("isPipActive", valueOf);
                    } catch (JSONException e3) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e3);
                    }
                }
                zw71Var.j = true;
                return;
            }
            boolean z3 = c == 1;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z3) {
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        a(viewGroup.getChildAt(i2), rq71Var, a, z);
                    }
                    return;
                }
                HashMap hashMap3 = new HashMap();
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    ArrayList arrayList = (ArrayList) hashMap3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap3.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(hashMap3.keySet());
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ArrayList) hashMap3.get((Float) it.next())).iterator();
                    while (it2.hasNext()) {
                        a((View) it2.next(), rq71Var, a, z);
                    }
                }
            }
        }
    }
}
