package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public abstract class ees {
    public static final z a = new z();
    public static final ges b;

    static {
        ges gesVar = null;
        try {
            gesVar = (ges) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = gesVar;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z, w53 w53Var) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(w53Var.c);
            Iterator it = ((q53) w53Var.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(w53Var.c);
            Iterator it2 = ((q53) w53Var.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(w53 w53Var, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((q53) w53Var.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (jl40.l(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return (String) a.R(arrayList);
    }

    public static final void c(w53 w53Var, w53 w53Var2) {
        int i = w53Var.c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (!w53Var2.containsKey((String) w53Var.j(i))) {
                w53Var.h(i);
            }
        }
    }

    public static final void d(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    public static final boolean e() {
        return (a == null && b == null) ? false : true;
    }
}
