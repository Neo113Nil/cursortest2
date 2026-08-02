package xsna;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.zk3;

/* compiled from: FragmentTransition.kt */
/* loaded from: classes12.dex */
public final class bds {
    public static final cds a = new cds();
    public static final gds b;

    static {
        gds gdsVar = null;
        try {
            gdsVar = (gds) jds.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = gdsVar;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z, zk3 zk3Var) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(zk3Var.d);
            Iterator it = ((zk3.a) zk3Var.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(zk3Var.d);
            Iterator it2 = ((zk3.a) zk3Var.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(zk3<String, String> zk3Var, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((zk3.a) zk3Var.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (epx.f(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return (String) j5g.a0(arrayList);
    }

    public static final void c(zk3<String, String> zk3Var, zk3<String, View> zk3Var2) {
        int i = zk3Var.d;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (!zk3Var2.containsKey(zk3Var.j(i))) {
                zk3Var.h(i);
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
