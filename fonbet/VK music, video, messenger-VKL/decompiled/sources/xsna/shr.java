package xsna;

import androidx.annotation.Nullable;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import xsna.ex1;

/* compiled from: FirebaseABTesting.java */
/* loaded from: classes.dex */
public final class shr {
    public final f9e0<ex1> a;

    @Nullable
    public Integer b = null;

    public shr(f9e0 f9e0Var) {
        this.a = f9e0Var;
    }

    public final void a(ArrayList arrayList) throws AbtException {
        f9e0<ex1> f9e0Var = this.a;
        if (f9e0Var.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ii.a((Map) it.next()));
        }
        if (arrayList2.isEmpty()) {
            if (f9e0Var.get() == null) {
                throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
            Iterator it2 = f9e0Var.get().a().iterator();
            while (it2.hasNext()) {
                f9e0Var.get().b(((ex1.a) it2.next()).b);
            }
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            hashSet.add(((ii) it3.next()).b());
        }
        ArrayList a = f9e0Var.get().a();
        HashSet hashSet2 = new HashSet();
        Iterator it4 = a.iterator();
        while (it4.hasNext()) {
            hashSet2.add(((ex1.a) it4.next()).b);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = a.iterator();
        while (it5.hasNext()) {
            ex1.a aVar = (ex1.a) it5.next();
            if (!hashSet.contains(aVar.b)) {
                arrayList3.add(aVar);
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            f9e0Var.get().b(((ex1.a) it6.next()).b);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            ii iiVar = (ii) it7.next();
            if (!hashSet2.contains(iiVar.b())) {
                arrayList4.add(iiVar);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(f9e0Var.get().a());
        if (this.b == null) {
            this.b = Integer.valueOf(f9e0Var.get().h());
        }
        int intValue = this.b.intValue();
        Iterator it8 = arrayList4.iterator();
        while (it8.hasNext()) {
            ii iiVar2 = (ii) it8.next();
            while (arrayDeque.size() >= intValue) {
                f9e0Var.get().b(((ex1.a) arrayDeque.pollFirst()).b);
            }
            ex1.a c = iiVar2.c();
            f9e0Var.get().g(c);
            arrayDeque.offer(c);
        }
    }
}
