package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import defpackage.des;
import defpackage.gcs;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.rcs;
import defpackage.vcs;
import defpackage.w511;
import defpackage.xfo;
import defpackage.zfz;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a extends y implements rcs, vcs {
    public final FragmentManager r;
    public boolean s;
    public int t;
    public boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a aVar) {
        super(0);
        aVar.r.M();
        gcs gcsVar = aVar.r.x;
        if (gcsVar != null) {
            gcsVar.b.getClassLoader();
        }
        Iterator it = aVar.a.iterator();
        while (it.hasNext()) {
            des desVar = (des) it.next();
            ArrayList arrayList = this.a;
            des desVar2 = new des();
            desVar2.a = desVar.a;
            desVar2.b = desVar.b;
            desVar2.c = desVar.c;
            desVar2.d = desVar.d;
            desVar2.e = desVar.e;
            desVar2.f = desVar.f;
            desVar2.g = desVar.g;
            desVar2.h = desVar.h;
            desVar2.i = desVar.i;
            arrayList.add(desVar2);
        }
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.l = aVar.l;
        this.m = aVar.m;
        this.j = aVar.j;
        this.k = aVar.k;
        if (aVar.n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.n = arrayList2;
            arrayList2.addAll(aVar.n);
        }
        if (aVar.o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.o = arrayList3;
            arrayList3.addAll(aVar.o);
        }
        this.p = aVar.p;
        this.t = -1;
        this.u = false;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
    }

    @Override // defpackage.vcs
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.O(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.r.d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.y
    public final int d() {
        return l(false, true);
    }

    @Override // androidx.fragment.app.y
    public final void e(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.r) {
            super.e(fragment);
        } else {
            xfo.f(fragment, "Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    @Override // androidx.fragment.app.y
    public final void f(int i, Fragment fragment, String str, int i2) {
        super.f(i, fragment, str, i2);
        fragment.mFragmentManager = this.r;
    }

    @Override // androidx.fragment.app.y
    public final y g(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.r) {
            super.g(fragment);
            return this;
        }
        xfo.f(fragment, "Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        return null;
    }

    public final void j(int i) {
        if (this.g) {
            if (FragmentManager.O(2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                des desVar = (des) arrayList.get(i2);
                Fragment fragment = desVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.O(2)) {
                        Objects.toString(desVar.b);
                        int i3 = desVar.b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final void k() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            des desVar = (des) arrayList.get(size);
            if (desVar.c) {
                if (desVar.a == 8) {
                    desVar.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = desVar.b.mContainerId;
                    desVar.a = 2;
                    desVar.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        des desVar2 = (des) arrayList.get(i2);
                        if (desVar2.c && desVar2.b.mContainerId == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int l(boolean z, boolean z2) {
        if (this.s) {
            ny61.r("commit already called");
            return 0;
        }
        if (FragmentManager.O(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new zfz());
            o("  ", printWriter, true);
            printWriter.close();
        }
        this.s = true;
        boolean z3 = this.g;
        FragmentManager fragmentManager = this.r;
        if (z3) {
            this.t = fragmentManager.k.getAndIncrement();
        } else {
            this.t = -1;
        }
        if (z2) {
            fragmentManager.x(this, z);
        }
        return this.t;
    }

    public final void m() {
        if (this.g) {
            ny61.r("This transaction is already being added to the back stack");
        } else {
            this.h = false;
            this.r.A(this, false);
        }
    }

    public final void n() {
        if (this.g) {
            ny61.r("This transaction is already being added to the back stack");
        } else {
            this.h = false;
            this.r.A(this, true);
        }
    }

    public final void o(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            des desVar = (des) arrayList.get(i);
            switch (desVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + desVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(Extension.COLON_SPACE);
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(desVar.b);
            if (z) {
                if (desVar.d != 0 || desVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(desVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(desVar.e));
                }
                if (desVar.f != 0 || desVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(desVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(desVar.g));
                }
            }
        }
    }

    public final void p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.r) {
            b(new des(fragment, 3));
        } else {
            xfo.f(fragment, "Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    public final void q(Fragment fragment, Lifecycle.State state) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.r;
        if (fragmentManager != fragmentManager2) {
            kbs.f(fragmentManager2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            w511.t("Cannot set maximum Lifecycle to ", state, " after the Fragment has been created");
            return;
        }
        if (state == Lifecycle.State.DESTROYED) {
            w511.t("Cannot set maximum Lifecycle to ", state, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            return;
        }
        des desVar = new des();
        desVar.a = 10;
        desVar.b = fragment;
        desVar.c = false;
        desVar.h = fragment.mMaxState;
        desVar.i = state;
        b(desVar);
    }

    public final void r(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.r) {
            b(new des(fragment, 8));
        } else {
            xfo.f(fragment, "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentManager fragmentManager) {
        super(0);
        fragmentManager.M();
        gcs gcsVar = fragmentManager.x;
        if (gcsVar != null) {
            gcsVar.b.getClassLoader();
        }
        this.t = -1;
        this.u = false;
        this.r = fragmentManager;
    }
}
