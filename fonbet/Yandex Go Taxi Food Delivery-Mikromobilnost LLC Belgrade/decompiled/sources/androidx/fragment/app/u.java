package androidx.fragment.app;

import defpackage.des;
import defpackage.unr0;
import defpackage.vcs;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class u implements vcs {
    public final /* synthetic */ int a;
    public final String b;
    public final /* synthetic */ FragmentManager c;

    public /* synthetic */ u(FragmentManager fragmentManager, String str, int i) {
        this.a = i;
        this.c = fragmentManager;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r9 != 8) goto L34;
     */
    @Override // defpackage.vcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2 = this.a;
        boolean z = false;
        String str = this.b;
        FragmentManager fragmentManager = this.c;
        switch (i2) {
            case 0:
                BackStackState backStackState = (BackStackState) fragmentManager.l.remove(str);
                if (backStackState != null) {
                    HashMap hashMap = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar.u) {
                            Iterator it2 = aVar.a.iterator();
                            while (it2.hasNext()) {
                                Fragment fragment = ((des) it2.next()).b;
                                if (fragment != null) {
                                    hashMap.put(fragment.mWho, fragment);
                                }
                            }
                        }
                    }
                    Iterator<a> it3 = backStackState.instantiate(fragmentManager, hashMap).iterator();
                    while (it3.hasNext()) {
                        it3.next().a(arrayList, arrayList2);
                        z = true;
                    }
                }
                return z;
            default:
                int D = fragmentManager.D(-1, str, true);
                if (D < 0) {
                    return false;
                }
                int i3 = D;
                while (true) {
                    Throwable th = null;
                    if (i3 >= fragmentManager.d.size()) {
                        HashSet hashSet = new HashSet();
                        int i4 = D;
                        while (i4 < fragmentManager.d.size()) {
                            a aVar2 = (a) fragmentManager.d.get(i4);
                            HashSet hashSet2 = new HashSet();
                            HashSet hashSet3 = new HashSet();
                            Iterator it4 = aVar2.a.iterator();
                            while (it4.hasNext()) {
                                des desVar = (des) it4.next();
                                Fragment fragment2 = desVar.b;
                                if (fragment2 != null) {
                                    Throwable th2 = th;
                                    if (desVar.c) {
                                        int i5 = desVar.a;
                                        i = i4;
                                        if (i5 != 1) {
                                            if (i5 != 2) {
                                                break;
                                            }
                                        }
                                    } else {
                                        i = i4;
                                    }
                                    hashSet.add(fragment2);
                                    hashSet2.add(fragment2);
                                    int i6 = desVar.a;
                                    if (i6 == 1 || i6 == 2) {
                                        hashSet3.add(fragment2);
                                    }
                                    th = th2;
                                    i4 = i;
                                }
                            }
                            int i7 = i4;
                            Throwable th3 = th;
                            hashSet2.removeAll(hashSet3);
                            if (!hashSet2.isEmpty()) {
                                StringBuilder x = unr0.x("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                                x.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                                x.append(" in ");
                                x.append(aVar2);
                                x.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                                fragmentManager.q0(new IllegalArgumentException(x.toString()));
                                throw th3;
                            }
                            i4 = i7 + 1;
                            th = th3;
                        }
                        Throwable th4 = th;
                        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                        while (!arrayDeque.isEmpty()) {
                            Fragment fragment3 = (Fragment) arrayDeque.removeFirst();
                            if (fragment3.mRetainInstance) {
                                StringBuilder x2 = unr0.x("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                                x2.append(hashSet.contains(fragment3) ? "direct reference to retained " : "retained child ");
                                x2.append("fragment ");
                                x2.append(fragment3);
                                fragmentManager.q0(new IllegalArgumentException(x2.toString()));
                                throw th4;
                            }
                            Iterator it5 = fragment3.mChildFragmentManager.c.e().iterator();
                            while (it5.hasNext()) {
                                Fragment fragment4 = (Fragment) it5.next();
                                if (fragment4 != null) {
                                    arrayDeque.addLast(fragment4);
                                }
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it6 = hashSet.iterator();
                        while (it6.hasNext()) {
                            arrayList3.add(((Fragment) it6.next()).mWho);
                        }
                        ArrayList arrayList4 = new ArrayList(fragmentManager.d.size() - D);
                        for (int i8 = D; i8 < fragmentManager.d.size(); i8++) {
                            arrayList4.add(th4);
                        }
                        BackStackState backStackState2 = new BackStackState(arrayList3, arrayList4);
                        for (int size = fragmentManager.d.size() - 1; size >= D; size--) {
                            a aVar3 = (a) fragmentManager.d.remove(size);
                            a aVar4 = new a(aVar3);
                            aVar4.k();
                            arrayList4.set(size - D, new BackStackRecordState(aVar4));
                            aVar3.u = true;
                            arrayList.add(aVar3);
                            arrayList2.add(Boolean.TRUE);
                        }
                        fragmentManager.l.put(str, backStackState2);
                        return true;
                    }
                    a aVar5 = (a) fragmentManager.d.get(i3);
                    if (!aVar5.p) {
                        fragmentManager.q0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar5 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                    i3++;
                }
        }
    }
}
