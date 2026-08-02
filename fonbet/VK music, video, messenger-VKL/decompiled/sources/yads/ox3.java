package yads;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ox3 implements uw3 {
    public final uw3 a;

    public ox3(wx3 wx3Var) {
        this.a = wx3Var;
    }

    @Override // yads.uw3
    public final JSONObject a(View view) {
        JSONObject a = px3.a(0, 0, 0, 0);
        try {
            a.put("noOutputDevice", nx3.a[hg0.a(ww3.a() != 1 ? 2 : cy3.a)] == 1);
            return a;
        } catch (JSONException e) {
            Log.e("OMIDLIB", "Error with setting output device status", e);
            return a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.uw3
    public final void a(View view, JSONObject jSONObject, rw3 rw3Var, boolean z, boolean z2) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        rx3 rx3Var = rx3.c;
        if (rx3Var != null) {
            Collection unmodifiableCollection = Collections.unmodifiableCollection(rx3Var.b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            Iterator it = unmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((ax3) it.next()).d.get();
                if (view2 != null && ly3.d(view2) && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float b = ly3.b(rootView);
                    int size = arrayList.size();
                    while (size > 0 && ly3.b((View) arrayList.get(size - 1)) > b) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ba3) rw3Var).a((View) it2.next(), this.a, jSONObject, z2);
        }
    }
}
