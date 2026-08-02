package androidx.fragment.app;

import defpackage.bds;
import defpackage.qs31;
import defpackage.yr31;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class v extends yr31 {
    public static final bds A = new bds(0);
    public final boolean x;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap w = new HashMap();
    public boolean y = false;
    public boolean z = false;

    public v(boolean z) {
        this.x = z;
    }

    @Override // defpackage.yr31
    public final void V() {
        if (FragmentManager.O(3)) {
            toString();
        }
        this.y = true;
    }

    public final void W(Fragment fragment) {
        if (this.z) {
            FragmentManager.O(2);
            return;
        }
        String str = fragment.mWho;
        HashMap hashMap = this.b;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (FragmentManager.O(2)) {
            fragment.toString();
        }
    }

    public final void X(String str, boolean z) {
        HashMap hashMap = this.c;
        v vVar = (v) hashMap.get(str);
        if (vVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(vVar.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    FragmentManager.O(3);
                    vVar.X(str2, true);
                }
            }
            vVar.V();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.w;
        qs31 qs31Var = (qs31) hashMap2.get(str);
        if (qs31Var != null) {
            qs31Var.a();
            hashMap2.remove(str);
        }
    }

    public final void Y(Fragment fragment) {
        if (this.z) {
            FragmentManager.O(2);
        } else {
            if (this.b.remove(fragment.mWho) == null || !FragmentManager.O(2)) {
                return;
            }
            fragment.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.b.equals(vVar.b) && this.c.equals(vVar.c) && this.w.equals(vVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(Extension.FIX_SPACE);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(Extension.FIX_SPACE);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.w.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(Extension.FIX_SPACE);
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
