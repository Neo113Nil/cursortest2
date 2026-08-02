package defpackage;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes10.dex */
public class aqr0 {
    public final HashMap a;

    public aqr0() {
        new SparseIntArray();
        this.a = new HashMap();
    }

    public final void a(int i, zpr0 zpr0Var) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.a;
        HashSet hashSet = (HashSet) hashMap.get(valueOf);
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(zpr0Var));
    }
}
