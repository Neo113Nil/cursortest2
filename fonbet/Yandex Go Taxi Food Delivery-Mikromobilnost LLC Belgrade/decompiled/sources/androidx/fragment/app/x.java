package androidx.fragment.app;

import android.os.Bundle;
import defpackage.yci0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class x {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public v d;

    public final void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            yci0.k(fragment, "Fragment already added: ");
            return;
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        w wVar = (w) this.b.get(str);
        if (wVar != null) {
            return wVar.c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (w wVar : this.b.values()) {
            if (wVar != null && (findFragmentByWho = wVar.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.b.values()) {
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.b.values()) {
            if (wVar != null) {
                arrayList.add(wVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(w wVar) {
        Fragment fragment = wVar.c;
        String str = fragment.mWho;
        HashMap hashMap = this.b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, wVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z = fragment.mRetainInstance;
            v vVar = this.d;
            if (z) {
                vVar.W(fragment);
            } else {
                vVar.Y(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.O(2)) {
            fragment.toString();
        }
    }

    public final void h(w wVar) {
        Fragment fragment = wVar.c;
        if (fragment.mRetainInstance) {
            this.d.Y(fragment);
        }
        String str = fragment.mWho;
        HashMap hashMap = this.b;
        if (hashMap.get(str) == wVar && ((w) hashMap.put(fragment.mWho, null)) != null && FragmentManager.O(2)) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap hashMap = this.c;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }
}
