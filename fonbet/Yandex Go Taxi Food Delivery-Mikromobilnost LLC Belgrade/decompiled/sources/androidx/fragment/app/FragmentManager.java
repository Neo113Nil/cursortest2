package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.n;
import androidx.core.app.t0;
import androidx.core.app.u0;
import androidx.core.app.y0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.lifecycle.Lifecycle;
import defpackage.acs;
import defpackage.aes;
import defpackage.b170;
import defpackage.b64;
import defpackage.b8h0;
import defpackage.bds;
import defpackage.bes;
import defpackage.des;
import defpackage.e9e;
import defpackage.g2m0;
import defpackage.g8e;
import defpackage.gcs;
import defpackage.h50;
import defpackage.hds;
import defpackage.j2m0;
import defpackage.j50;
import defpackage.kds;
import defpackage.kl40;
import defpackage.ls31;
import defpackage.mbs;
import defpackage.mcs;
import defpackage.ncs;
import defpackage.ny61;
import defpackage.o0d;
import defpackage.ocs;
import defpackage.oyr;
import defpackage.pcs;
import defpackage.pey;
import defpackage.qcs;
import defpackage.qs31;
import defpackage.qx60;
import defpackage.rcs;
import defpackage.rk10;
import defpackage.rs31;
import defpackage.rx60;
import defpackage.s50;
import defpackage.scs;
import defpackage.t50;
import defpackage.tcs;
import defpackage.ucs;
import defpackage.udp0;
import defpackage.vcs;
import defpackage.w511;
import defpackage.wcs;
import defpackage.x50;
import defpackage.xx60;
import defpackage.zfz;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSPTLSProxy.tools.Constants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    public Fragment A;
    public s50 E;
    public s50 F;
    public s50 G;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ArrayList P;
    public v Q;
    public boolean b;
    public ArrayList e;
    public qx60 g;
    public final mcs r;
    public final mcs s;
    public final mcs t;
    public final mcs u;
    public gcs x;
    public acs y;
    public Fragment z;
    public final ArrayList a = new ArrayList();
    public final x c = new x();
    public ArrayList d = new ArrayList();
    public final FragmentLayoutInflaterFactory f = new FragmentLayoutInflaterFactory(this);
    public androidx.fragment.app.a h = null;
    public boolean i = false;
    public final q j = new q(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());
    public final ArrayList o = new ArrayList();
    public final o p = new o(this);
    public final CopyOnWriteArrayList q = new CopyOnWriteArrayList();
    public final ncs v = new ncs(this);
    public int w = -1;
    public udp0 B = null;
    public final ocs C = new ocs(this);
    public final kl40 D = new kl40(24);
    public ArrayDeque H = new ArrayDeque();
    public final mbs R = new mbs(1, this);

    /* loaded from: classes10.dex */
    public static abstract class a {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [mcs] */
    /* JADX WARN: Type inference failed for: r1v13, types: [mcs] */
    /* JADX WARN: Type inference failed for: r1v14, types: [mcs] */
    /* JADX WARN: Type inference failed for: r1v15, types: [mcs] */
    public FragmentManager() {
        final int i = 0;
        this.r = new e9e(this) { // from class: mcs
            public final /* synthetic */ FragmentManager b;

            {
                this.b = this;
            }

            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i2 = i;
                FragmentManager fragmentManager = this.b;
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.Q() && num.intValue() == 80) {
                            fragmentManager.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n nVar = (n) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.n(nVar.a(), false);
                            break;
                        }
                        break;
                    default:
                        y0 y0Var = (y0) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.s(y0Var.a(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.s = new e9e(this) { // from class: mcs
            public final /* synthetic */ FragmentManager b;

            {
                this.b = this;
            }

            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i22 = i2;
                FragmentManager fragmentManager = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.Q() && num.intValue() == 80) {
                            fragmentManager.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n nVar = (n) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.n(nVar.a(), false);
                            break;
                        }
                        break;
                    default:
                        y0 y0Var = (y0) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.s(y0Var.a(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.t = new e9e(this) { // from class: mcs
            public final /* synthetic */ FragmentManager b;

            {
                this.b = this;
            }

            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i22 = i3;
                FragmentManager fragmentManager = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.Q() && num.intValue() == 80) {
                            fragmentManager.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n nVar = (n) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.n(nVar.a(), false);
                            break;
                        }
                        break;
                    default:
                        y0 y0Var = (y0) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.s(y0Var.a(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.u = new e9e(this) { // from class: mcs
            public final /* synthetic */ FragmentManager b;

            {
                this.b = this;
            }

            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i22 = i4;
                FragmentManager fragmentManager = this.b;
                switch (i22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (fragmentManager.Q() && num.intValue() == 80) {
                            fragmentManager.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n nVar = (n) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.n(nVar.a(), false);
                            break;
                        }
                        break;
                    default:
                        y0 y0Var = (y0) obj;
                        if (fragmentManager.Q()) {
                            fragmentManager.s(y0Var.a(), false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static Fragment G(View view) {
        while (view != null) {
            Object tag = view.getTag(b8h0.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet I(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aVar.a.size(); i++) {
            Fragment fragment = ((des) aVar.a.get(i)).b;
            if (fragment != null && aVar.g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean O(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean P(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.c.e().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z = P(fragment2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.A) && R(fragmentManager.z);
    }

    public final void A(androidx.fragment.app.a aVar, boolean z) {
        if (z && (this.x == null || this.L)) {
            return;
        }
        y(z);
        androidx.fragment.app.a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.s = false;
            aVar2.k();
            if (O(3)) {
                Objects.toString(this.h);
                Objects.toString(aVar);
            }
            this.h.l(false, false);
            this.h.a(this.N, this.O);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((des) it.next()).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        aVar.a(this.N, this.O);
        this.b = true;
        try {
            f0(this.N, this.O);
            d();
            s0();
            boolean z2 = this.M;
            x xVar = this.c;
            if (z2) {
                this.M = false;
                Iterator it2 = xVar.d().iterator();
                while (it2.hasNext()) {
                    w wVar = (w) it2.next();
                    Fragment fragment2 = wVar.c;
                    if (fragment2.mDeferStart) {
                        if (this.b) {
                            this.M = true;
                        } else {
                            fragment2.mDeferStart = false;
                            wVar.i();
                        }
                    }
                }
            }
            xVar.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9 = i;
        boolean z4 = ((androidx.fragment.app.a) arrayList.get(i9)).p;
        ArrayList arrayList3 = this.P;
        if (arrayList3 == null) {
            this.P = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.P;
        x xVar = this.c;
        arrayList4.addAll(xVar.f());
        Fragment fragment = this.A;
        int i10 = i9;
        boolean z5 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i2) {
                boolean z6 = z4;
                boolean z7 = z5;
                this.P.clear();
                if (!z6 && this.w >= 1) {
                    for (int i12 = i9; i12 < i2; i12++) {
                        Iterator it = ((androidx.fragment.app.a) arrayList.get(i12)).a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((des) it.next()).b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                xVar.g(g(fragment2));
                            }
                        }
                    }
                }
                int i13 = i9;
                while (i13 < i2) {
                    androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i13);
                    if (!((Boolean) arrayList2.get(i13)).booleanValue()) {
                        aVar.j(1);
                        FragmentManager fragmentManager = aVar.r;
                        ArrayList arrayList5 = aVar.a;
                        int size = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size) {
                            des desVar = (des) arrayList5.get(i14);
                            Fragment fragment3 = desVar.b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = aVar.u;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(aVar.f);
                                fragment3.setSharedElementNames(aVar.n, aVar.o);
                            }
                            switch (desVar.a) {
                                case 1:
                                    i3 = i13;
                                    fragment3.setAnimations(desVar.d, desVar.e, desVar.f, desVar.g);
                                    fragmentManager.k0(fragment3, false);
                                    fragmentManager.a(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 2:
                                default:
                                    ny61.e(desVar.a, "Unknown cmd: ");
                                    break;
                                case 3:
                                    i3 = i13;
                                    fragment3.setAnimations(desVar.d, desVar.e, desVar.f, desVar.g);
                                    fragmentManager.e0(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 4:
                                    i3 = i13;
                                    fragment3.setAnimations(desVar.d, desVar.e, desVar.f, desVar.g);
                                    fragmentManager.getClass();
                                    if (O(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (!fragment3.mHidden) {
                                        fragment3.mHidden = true;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                        fragmentManager.p0(fragment3);
                                    }
                                    i14++;
                                    i13 = i3;
                                case 5:
                                    i3 = i13;
                                    fragment3.setAnimations(desVar.d, desVar.e, desVar.f, desVar.g);
                                    fragmentManager.k0(fragment3, false);
                                    if (O(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (fragment3.mHidden) {
                                        fragment3.mHidden = false;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                    }
                                    i14++;
                                    i13 = i3;
                                case 6:
                                    i3 = i13;
                                    fragment3.setAnimations(desVar.d, desVar.e, desVar.f, desVar.g);
                                    fragmentManager.h(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 7:
                                    i3 = i13;
                                    fragment3.setAnimations(desVar.d, desVar.e, desVar.f, desVar.g);
                                    fragmentManager.k0(fragment3, false);
                                    fragmentManager.c(fragment3);
                                    i14++;
                                    i13 = i3;
                                case 8:
                                    fragmentManager.o0(fragment3);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                                case 9:
                                    fragmentManager.o0(null);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                                case 10:
                                    desVar.h = fragment3.mMaxState;
                                    fragmentManager.n0(fragment3, desVar.i);
                                    i3 = i13;
                                    i14++;
                                    i13 = i3;
                            }
                            return;
                        }
                    }
                    aVar.j(-1);
                    FragmentManager fragmentManager2 = aVar.r;
                    ArrayList arrayList6 = aVar.a;
                    boolean z8 = true;
                    for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                        des desVar2 = (des) arrayList6.get(size2);
                        Fragment fragment4 = desVar2.b;
                        if (fragment4 != null) {
                            fragment4.mBeingSaved = aVar.u;
                            fragment4.setPopDirection(z8);
                            int i15 = aVar.f;
                            int i16 = 8194;
                            int i17 = Constants.INTENT_ADDRESS_ID;
                            if (i15 != 4097) {
                                if (i15 != 8194) {
                                    i16 = 4100;
                                    if (i15 != 8197) {
                                        i17 = 4099;
                                        if (i15 != 4099) {
                                            i16 = i15 != 4100 ? 0 : 8197;
                                        }
                                    }
                                }
                                i16 = i17;
                            }
                            fragment4.setNextTransition(i16);
                            fragment4.setSharedElementNames(aVar.o, aVar.n);
                        }
                        switch (desVar2.a) {
                            case 1:
                                fragment4.setAnimations(desVar2.d, desVar2.e, desVar2.f, desVar2.g);
                                z8 = true;
                                fragmentManager2.k0(fragment4, true);
                                fragmentManager2.e0(fragment4);
                            case 2:
                            default:
                                ny61.e(desVar2.a, "Unknown cmd: ");
                                break;
                            case 3:
                                fragment4.setAnimations(desVar2.d, desVar2.e, desVar2.f, desVar2.g);
                                fragmentManager2.a(fragment4);
                                z8 = true;
                            case 4:
                                fragment4.setAnimations(desVar2.d, desVar2.e, desVar2.f, desVar2.g);
                                fragmentManager2.getClass();
                                if (O(2)) {
                                    Objects.toString(fragment4);
                                }
                                if (fragment4.mHidden) {
                                    fragment4.mHidden = false;
                                    fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                }
                                z8 = true;
                            case 5:
                                fragment4.setAnimations(desVar2.d, desVar2.e, desVar2.f, desVar2.g);
                                fragmentManager2.k0(fragment4, true);
                                if (O(2)) {
                                    Objects.toString(fragment4);
                                }
                                if (!fragment4.mHidden) {
                                    fragment4.mHidden = true;
                                    fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                    fragmentManager2.p0(fragment4);
                                }
                                z8 = true;
                            case 6:
                                fragment4.setAnimations(desVar2.d, desVar2.e, desVar2.f, desVar2.g);
                                fragmentManager2.c(fragment4);
                                z8 = true;
                            case 7:
                                fragment4.setAnimations(desVar2.d, desVar2.e, desVar2.f, desVar2.g);
                                fragmentManager2.k0(fragment4, true);
                                fragmentManager2.h(fragment4);
                                z8 = true;
                            case 8:
                                fragmentManager2.o0(null);
                                z8 = true;
                            case 9:
                                fragmentManager2.o0(fragment4);
                                z8 = true;
                            case 10:
                                desVar2.i = fragment4.mMaxState;
                                fragmentManager2.n0(fragment4, desVar2.h);
                                z8 = true;
                        }
                        return;
                    }
                    i13++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList arrayList7 = this.o;
                if (z7 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(I((androidx.fragment.app.a) it2.next()));
                    }
                    if (this.h == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            ucs ucsVar = (ucs) it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                ucsVar.onBackStackChangeStarted((Fragment) it4.next(), booleanValue);
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            ucs ucsVar2 = (ucs) it5.next();
                            Iterator it6 = linkedHashSet.iterator();
                            while (it6.hasNext()) {
                                ucsVar2.onBackStackChangeCommitted((Fragment) it6.next(), booleanValue);
                            }
                        }
                    }
                }
                for (int i18 = i9; i18 < i2; i18++) {
                    androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size3 = aVar2.a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = ((des) aVar2.a.get(size3)).b;
                            if (fragment5 != null) {
                                g(fragment5).i();
                            }
                        }
                    } else {
                        Iterator it7 = aVar2.a.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment6 = ((des) it7.next()).b;
                            if (fragment6 != null) {
                                g(fragment6).i();
                            }
                        }
                    }
                }
                T(this.w, true);
                Iterator it8 = f(i9, i2, arrayList).iterator();
                while (it8.hasNext()) {
                    g gVar = (g) it8.next();
                    gVar.e = booleanValue;
                    gVar.l();
                    gVar.e();
                }
                while (i9 < i2) {
                    androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue() && aVar3.t >= 0) {
                        aVar3.t = -1;
                    }
                    if (aVar3.q != null) {
                        for (int i19 = 0; i19 < aVar3.q.size(); i19++) {
                            ((Runnable) aVar3.q.get(i19)).run();
                        }
                        aVar3.q = null;
                    }
                    i9++;
                }
                if (z7) {
                    for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                        ((ucs) arrayList7.get(i20)).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            androidx.fragment.app.a aVar4 = (androidx.fragment.app.a) arrayList.get(i10);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i10)).booleanValue();
            ArrayList arrayList8 = this.P;
            if (booleanValue2) {
                z = z4;
                i4 = i10;
                z2 = z5;
                int i21 = 1;
                ArrayList arrayList9 = aVar4.a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    des desVar3 = (des) arrayList9.get(size4);
                    int i22 = desVar3.a;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = desVar3.b;
                                    break;
                                case 10:
                                    desVar3.i = desVar3.h;
                                    break;
                            }
                            size4--;
                            i21 = 1;
                        }
                        arrayList8.add(desVar3.b);
                        size4--;
                        i21 = 1;
                    }
                    arrayList8.remove(desVar3.b);
                    size4--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList10 = aVar4.a;
                int i23 = 0;
                while (i23 < arrayList10.size()) {
                    des desVar4 = (des) arrayList10.get(i23);
                    boolean z9 = z4;
                    int i24 = desVar4.a;
                    if (i24 != i11) {
                        if (i24 != 2) {
                            if (i24 == 3 || i24 == 6) {
                                i5 = i10;
                                arrayList8.remove(desVar4.b);
                                Fragment fragment7 = desVar4.b;
                                if (fragment7 == fragment) {
                                    arrayList10.add(i23, new des(fragment7, 9));
                                    i23++;
                                    z3 = z5;
                                    fragment = null;
                                    i6 = 1;
                                }
                            } else if (i24 == 7) {
                                i5 = i10;
                                i6 = 1;
                            } else if (i24 != 8) {
                                i5 = i10;
                            } else {
                                i5 = i10;
                                arrayList10.add(i23, new des(9, fragment, 0));
                                desVar4.c = true;
                                i23++;
                                fragment = desVar4.b;
                            }
                            z3 = z5;
                            i6 = 1;
                        } else {
                            i5 = i10;
                            Fragment fragment8 = desVar4.b;
                            int i25 = fragment8.mContainerId;
                            int size5 = arrayList8.size() - 1;
                            boolean z10 = false;
                            while (size5 >= 0) {
                                boolean z11 = z5;
                                Fragment fragment9 = (Fragment) arrayList8.get(size5);
                                int i26 = size5;
                                if (fragment9.mContainerId != i25) {
                                    i7 = i25;
                                } else if (fragment9 == fragment8) {
                                    i7 = i25;
                                    z10 = true;
                                } else {
                                    if (fragment9 == fragment) {
                                        i7 = i25;
                                        i8 = 0;
                                        arrayList10.add(i23, new des(9, fragment9, 0));
                                        i23++;
                                        fragment = null;
                                    } else {
                                        i7 = i25;
                                        i8 = 0;
                                    }
                                    des desVar5 = new des(3, fragment9, i8);
                                    desVar5.d = desVar4.d;
                                    desVar5.f = desVar4.f;
                                    desVar5.e = desVar4.e;
                                    desVar5.g = desVar4.g;
                                    arrayList10.add(i23, desVar5);
                                    arrayList8.remove(fragment9);
                                    i23++;
                                    fragment = fragment;
                                }
                                size5 = i26 - 1;
                                i25 = i7;
                                z5 = z11;
                            }
                            z3 = z5;
                            i6 = 1;
                            if (z10) {
                                arrayList10.remove(i23);
                                i23--;
                            } else {
                                desVar4.a = 1;
                                desVar4.c = true;
                                arrayList8.add(fragment8);
                            }
                        }
                        i23 += i6;
                        i11 = i6;
                        z4 = z9;
                        i10 = i5;
                        z5 = z3;
                    } else {
                        i5 = i10;
                        i6 = i11;
                    }
                    z3 = z5;
                    arrayList8.add(desVar4.b);
                    i23 += i6;
                    i11 = i6;
                    z4 = z9;
                    i10 = i5;
                    z5 = z3;
                }
                z = z4;
                i4 = i10;
                z2 = z5;
            }
            z5 = z2 || aVar4.g;
            i10 = i4 + 1;
            z4 = z;
        }
    }

    public final void C() {
        z(true);
        H();
    }

    public final int D(int i, String str, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.d.get(size);
            if ((str != null && str.equals(aVar.i)) || (i >= 0 && i == aVar.t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.d.get(size - 1);
            if ((str == null || !str.equals(aVar2.i)) && (i < 0 || i != aVar2.t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment E(int i) {
        x xVar = this.c;
        ArrayList arrayList = xVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (w wVar : xVar.b.values()) {
            if (wVar != null) {
                Fragment fragment2 = wVar.c;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment F(String str) {
        x xVar = this.c;
        ArrayList arrayList = xVar.a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (w wVar : xVar.b.values()) {
            if (wVar != null) {
                Fragment fragment2 = wVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void H() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar.f) {
                O(2);
                gVar.f = false;
                gVar.e();
            }
        }
    }

    public final rcs J(int i) {
        if (i != this.d.size()) {
            return (rcs) this.d.get(i);
        }
        androidx.fragment.app.a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        ny61.s();
        return null;
    }

    public final int K() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final ViewGroup L(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.y.c()) {
            return null;
        }
        View b = this.y.b(fragment.mContainerId);
        if (b instanceof ViewGroup) {
            return (ViewGroup) b;
        }
        return null;
    }

    public final m M() {
        udp0 udp0Var = this.B;
        if (udp0Var != null) {
            return udp0Var;
        }
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.M() : this.C;
    }

    public final kl40 N() {
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.N() : this.D;
    }

    public final boolean Q() {
        Fragment fragment = this.z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.z.getParentFragmentManager().Q();
    }

    public final boolean S() {
        return this.J || this.K;
    }

    public final void T(int i, boolean z) {
        gcs gcsVar;
        if (this.x == null && i != -1) {
            ny61.r("No activity");
            return;
        }
        if (z || i != this.w) {
            this.w = i;
            x xVar = this.c;
            HashMap hashMap = xVar.b;
            Iterator it = xVar.a.iterator();
            while (it.hasNext()) {
                w wVar = (w) hashMap.get(((Fragment) it.next()).mWho);
                if (wVar != null) {
                    wVar.i();
                }
            }
            for (w wVar2 : hashMap.values()) {
                if (wVar2 != null) {
                    wVar2.i();
                    Fragment fragment = wVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !xVar.c.containsKey(fragment.mWho)) {
                            xVar.i(wVar2.l(), fragment.mWho);
                        }
                        xVar.h(wVar2);
                    }
                }
            }
            Iterator it2 = xVar.d().iterator();
            while (it2.hasNext()) {
                w wVar3 = (w) it2.next();
                Fragment fragment2 = wVar3.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.M = true;
                    } else {
                        fragment2.mDeferStart = false;
                        wVar3.i();
                    }
                }
            }
            if (this.I && (gcsVar = this.x) != null && this.w == 7) {
                ((l) gcsVar).x.invalidateMenu();
                this.I = false;
            }
        }
    }

    public final void U() {
        if (this.x == null) {
            return;
        }
        this.J = false;
        this.K = false;
        this.Q.z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void V() {
        x(new wcs(this, null, -1, 0), false);
    }

    public final void W(int i, String str) {
        x(new wcs(this, str, -1, i), false);
    }

    public final void X(int i, boolean z) {
        if (i >= 0) {
            x(new wcs(this, null, i, 1), z);
        } else {
            ny61.g(oyr.i(i, "Bad id: "));
        }
    }

    public final void Y(int i, int i2) {
        if (i >= 0) {
            a0(i, i2);
        } else {
            ny61.g(oyr.i(i, "Bad id: "));
        }
    }

    public final boolean Z() {
        return a0(-1, 0);
    }

    public final w a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            aes aesVar = bes.a;
            bes.b(new FragmentReuseViolation(fragment, str));
            bes.a(fragment).getClass();
        }
        if (O(2)) {
            fragment.toString();
        }
        w g = g(fragment);
        fragment.mFragmentManager = this;
        x xVar = this.c;
        xVar.g(g);
        if (!fragment.mDetached) {
            xVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (P(fragment)) {
                this.I = true;
            }
        }
        return g;
    }

    public final boolean a0(int i, int i2) {
        z(false);
        y(true);
        Fragment fragment = this.A;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().Z()) {
            return true;
        }
        boolean b0 = b0(this.N, this.O, null, i, i2);
        if (b0) {
            this.b = true;
            try {
                f0(this.N, this.O);
            } finally {
                d();
            }
        }
        s0();
        boolean z = this.M;
        x xVar = this.c;
        if (z) {
            this.M = false;
            Iterator it = xVar.d().iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                Fragment fragment2 = wVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.M = true;
                    } else {
                        fragment2.mDeferStart = false;
                        wVar.i();
                    }
                }
            }
        }
        xVar.b.values().removeAll(Collections.singleton(null));
        return b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(gcs gcsVar, acs acsVar, Fragment fragment) {
        if (this.x != null) {
            ny61.r("Already attached");
            return;
        }
        this.x = gcsVar;
        this.y = acsVar;
        this.z = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new qcs(fragment));
        } else if (gcsVar instanceof hds) {
            copyOnWriteArrayList.add((hds) gcsVar);
        }
        if (this.z != null) {
            s0();
        }
        if (gcsVar instanceof rx60) {
            rx60 rx60Var = (rx60) gcsVar;
            qx60 onBackPressedDispatcher = rx60Var.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            pey peyVar = rx60Var;
            if (fragment != null) {
                peyVar = fragment;
            }
            onBackPressedDispatcher.a(peyVar, this.j);
        }
        int i = 0;
        if (fragment != null) {
            v vVar = fragment.mFragmentManager.Q;
            HashMap hashMap = vVar.c;
            v vVar2 = (v) hashMap.get(fragment.mWho);
            if (vVar2 == null) {
                vVar2 = new v(vVar.x);
                hashMap.put(fragment.mWho, vVar2);
            }
            this.Q = vVar2;
        } else if (gcsVar instanceof rs31) {
            qs31 viewModelStore = ((rs31) gcsVar).getViewModelStore();
            bds bdsVar = v.A;
            this.Q = (v) new ls31(viewModelStore, v.A, i).b(v.class);
        } else {
            this.Q = new v(false);
        }
        this.Q.z = S();
        this.c.d = this.Q;
        Object obj = this.x;
        if ((obj instanceof j2m0) && fragment == null) {
            g2m0 savedStateRegistry = ((j2m0) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new o0d(3, this));
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                g0(a2);
            }
        }
        Object obj2 = this.x;
        if (obj2 instanceof x50) {
            t50 activityResultRegistry = ((x50) obj2).getActivityResultRegistry();
            String concat = "FragmentManager:".concat(fragment != null ? oyr.t(new StringBuilder(), fragment.mWho, ":") : "");
            this.E = activityResultRegistry.c(concat.concat("StartActivityForResult"), new j50(), new r(this));
            this.F = activityResultRegistry.c(concat.concat("StartIntentSenderForResult"), new scs(i), new s(this));
            this.G = activityResultRegistry.c(concat.concat("RequestPermissions"), new h50(), new p(this));
        }
        Object obj3 = this.x;
        if (obj3 instanceof xx60) {
            ((xx60) obj3).addOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof b170) {
            ((b170) obj4).addOnTrimMemoryListener(this.s);
        }
        Object obj5 = this.x;
        if (obj5 instanceof t0) {
            ((t0) obj5).addOnMultiWindowModeChangedListener(this.t);
        }
        Object obj6 = this.x;
        if (obj6 instanceof u0) {
            ((u0) obj6).addOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj7 = this.x;
        if ((obj7 instanceof rk10) && fragment == null) {
            ((rk10) obj7).addMenuProvider(this.v);
        }
    }

    public final boolean b0(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int D = D(i, str, (i2 & 1) != 0);
        if (D < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= D; size--) {
            arrayList.add((androidx.fragment.app.a) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void c(Fragment fragment) {
        if (O(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (O(2)) {
                fragment.toString();
            }
            if (P(fragment)) {
                this.I = true;
            }
        }
    }

    public final void c0(Bundle bundle, Fragment fragment, String str) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            q0(new IllegalStateException(oyr.o("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void d() {
        this.b = false;
        this.O.clear();
        this.N.clear();
    }

    public final void d0(a aVar, boolean z) {
        this.p.b.add(new n(aVar, z));
    }

    public final HashSet e() {
        g gVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((w) it.next()).c.mContainer;
            if (viewGroup != null) {
                N();
                Object tag = viewGroup.getTag(b8h0.special_effects_controller_view_tag);
                if (tag instanceof g) {
                    gVar = (g) tag;
                } else {
                    gVar = new g(viewGroup);
                    viewGroup.setTag(b8h0.special_effects_controller_view_tag, gVar);
                }
                hashSet.add(gVar);
            }
        }
        return hashSet;
    }

    public final void e0(Fragment fragment) {
        if (O(2)) {
            Objects.toString(fragment);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        x xVar = this.c;
        synchronized (xVar.a) {
            xVar.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (P(fragment)) {
            this.I = true;
        }
        fragment.mRemoving = true;
        p0(fragment);
    }

    public final HashSet f(int i, int i2, ArrayList arrayList) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((androidx.fragment.app.a) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((des) it.next()).b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(g.j(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            ny61.r("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i)).p) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final w g(Fragment fragment) {
        String str = fragment.mWho;
        x xVar = this.c;
        w wVar = (w) xVar.b.get(str);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.p, xVar, fragment);
        wVar2.j(this.x.b.getClassLoader());
        wVar2.e = this.w;
        return wVar2;
    }

    public final void g0(Bundle bundle) {
        o oVar;
        w wVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.x.b.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.x.b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        x xVar = this.c;
        HashMap hashMap2 = xVar.c;
        HashMap hashMap3 = xVar.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable(ClidProvider.STATE);
        if (fragmentManagerState == null) {
            return;
        }
        hashMap3.clear();
        Iterator<String> it = fragmentManagerState.mActive.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            oVar = this.p;
            if (!hasNext) {
                break;
            }
            Bundle i = xVar.i(null, it.next());
            if (i != null) {
                Fragment fragment = (Fragment) this.Q.b.get(((FragmentState) i.getParcelable(ClidProvider.STATE)).mWho);
                if (fragment != null) {
                    if (O(2)) {
                        fragment.toString();
                    }
                    wVar = new w(oVar, xVar, fragment, i);
                } else {
                    wVar = new w(this.p, this.c, this.x.b.getClassLoader(), M(), i);
                }
                Fragment fragment2 = wVar.c;
                fragment2.mSavedFragmentState = i;
                fragment2.mFragmentManager = this;
                if (O(2)) {
                    fragment2.toString();
                }
                wVar.j(this.x.b.getClassLoader());
                xVar.g(wVar);
                wVar.e = this.w;
            }
        }
        v vVar = this.Q;
        vVar.getClass();
        Iterator it2 = new ArrayList(vVar.b.values()).iterator();
        while (it2.hasNext()) {
            Fragment fragment3 = (Fragment) it2.next();
            if (hashMap3.get(fragment3.mWho) == null) {
                if (O(2)) {
                    fragment3.toString();
                    Objects.toString(fragmentManagerState.mActive);
                }
                this.Q.Y(fragment3);
                fragment3.mFragmentManager = this;
                w wVar2 = new w(oVar, xVar, fragment3);
                wVar2.e = 1;
                wVar2.i();
                fragment3.mRemoving = true;
                wVar2.i();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.mAdded;
        xVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment b = xVar.b(str3);
                if (b == null) {
                    ny61.r(oyr.p("No instantiated fragment for (", str3, Extension.C_BRAKE));
                    return;
                } else {
                    if (O(2)) {
                        b.toString();
                    }
                    xVar.a(b);
                }
            }
        }
        if (fragmentManagerState.mBackStack != null) {
            this.d = new ArrayList(fragmentManagerState.mBackStack.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.mBackStack;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a instantiate = backStackRecordStateArr[i2].instantiate(this);
                if (O(2)) {
                    int i3 = instantiate.t;
                    instantiate.toString();
                    PrintWriter printWriter = new PrintWriter(new zfz());
                    instantiate.o("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(instantiate);
                i2++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(fragmentManagerState.mBackStackIndex);
        String str4 = fragmentManagerState.mPrimaryNavActiveWho;
        if (str4 != null) {
            Fragment b2 = xVar.b(str4);
            this.A = b2;
            r(b2);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.mBackStackStateKeys;
        if (arrayList2 != null) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                this.l.put(arrayList2.get(i4), fragmentManagerState.mBackStackStates.get(i4));
            }
        }
        this.H = new ArrayDeque(fragmentManagerState.mLaunchedFragments);
    }

    public final void h(Fragment fragment) {
        if (O(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (O(2)) {
                fragment.toString();
            }
            x xVar = this.c;
            synchronized (xVar.a) {
                xVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (P(fragment)) {
                this.I = true;
            }
            p0(fragment);
        }
    }

    public final Bundle h0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        H();
        w();
        z(true);
        this.J = true;
        this.Q.z = true;
        x xVar = this.c;
        xVar.getClass();
        HashMap hashMap = xVar.b;
        ArrayList<String> arrayList2 = new ArrayList<>(hashMap.size());
        for (w wVar : hashMap.values()) {
            if (wVar != null) {
                Fragment fragment = wVar.c;
                xVar.i(wVar.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (O(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.c.c;
        if (hashMap2.isEmpty()) {
            O(2);
            return bundle;
        }
        x xVar2 = this.c;
        synchronized (xVar2.a) {
            try {
                backStackRecordStateArr = null;
                if (xVar2.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(xVar2.a.size());
                    Iterator it = xVar2.a.iterator();
                    while (it.hasNext()) {
                        Fragment fragment2 = (Fragment) it.next();
                        arrayList.add(fragment2.mWho);
                        if (O(2)) {
                            fragment2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        int size = this.d.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i = 0; i < size; i++) {
                backStackRecordStateArr[i] = new BackStackRecordState((androidx.fragment.app.a) this.d.get(i));
                if (O(2)) {
                    Objects.toString(this.d.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.mActive = arrayList2;
        fragmentManagerState.mAdded = arrayList;
        fragmentManagerState.mBackStack = backStackRecordStateArr;
        fragmentManagerState.mBackStackIndex = this.k.get();
        Fragment fragment3 = this.A;
        if (fragment3 != null) {
            fragmentManagerState.mPrimaryNavActiveWho = fragment3.mWho;
        }
        fragmentManagerState.mBackStackStateKeys.addAll(this.l.keySet());
        fragmentManagerState.mBackStackStates.addAll(this.l.values());
        fragmentManagerState.mLaunchedFragments = new ArrayList<>(this.H);
        bundle.putParcelable(ClidProvider.STATE, fragmentManagerState);
        for (String str : this.m.keySet()) {
            bundle.putBundle(g8e.o("result_", str), (Bundle) this.m.get(str));
        }
        for (String str2 : hashMap2.keySet()) {
            bundle.putBundle(g8e.o("fragment_", str2), (Bundle) hashMap2.get(str2));
        }
        return bundle;
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && (this.x instanceof xx60)) {
            q0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final Fragment.SavedState i0(Fragment fragment) {
        w wVar = (w) this.c.b.get(fragment.mWho);
        if (wVar != null) {
            Fragment fragment2 = wVar.c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(wVar.l());
                }
                return null;
            }
        }
        q0(new IllegalStateException(oyr.o("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final boolean j(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.c.removeCallbacks(this.R);
                    this.x.c.post(this.R);
                    s0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k0(Fragment fragment, boolean z) {
        ViewGroup L = L(fragment);
        if (L == null || !(L instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) L).setDrawDisappearingViewsLast(!z);
    }

    public final void l() {
        boolean z = true;
        this.L = true;
        z(true);
        w();
        gcs gcsVar = this.x;
        boolean z2 = gcsVar instanceof rs31;
        x xVar = this.c;
        if (z2) {
            z = xVar.d.y;
        } else {
            FragmentActivity fragmentActivity = gcsVar.b;
            if (fragmentActivity != null) {
                z = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                for (String str : ((BackStackState) it.next()).mFragments) {
                    v vVar = xVar.d;
                    vVar.getClass();
                    O(3);
                    vVar.X(str, false);
                }
            }
        }
        u(-1);
        Object obj = this.x;
        if (obj instanceof b170) {
            ((b170) obj).removeOnTrimMemoryListener(this.s);
        }
        Object obj2 = this.x;
        if (obj2 instanceof xx60) {
            ((xx60) obj2).removeOnConfigurationChangedListener(this.r);
        }
        Object obj3 = this.x;
        if (obj3 instanceof t0) {
            ((t0) obj3).removeOnMultiWindowModeChangedListener(this.t);
        }
        Object obj4 = this.x;
        if (obj4 instanceof u0) {
            ((u0) obj4).removeOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj5 = this.x;
        if ((obj5 instanceof rk10) && this.z == null) {
            ((rk10) obj5).removeMenuProvider(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.g();
            this.g = null;
        }
        s50 s50Var = this.E;
        if (s50Var != null) {
            s50Var.b();
            this.F.b();
            this.G.b();
        }
    }

    public final void l0(Bundle bundle, String str) {
        tcs tcsVar = (tcs) this.n.get(str);
        if (tcsVar == null || !tcsVar.a(Lifecycle.State.STARTED)) {
            this.m.put(str, bundle);
        } else {
            tcsVar.s(bundle, str);
        }
        if (O(2)) {
            Objects.toString(bundle);
        }
    }

    public final void m(boolean z) {
        if (z && (this.x instanceof b170)) {
            q0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void m0(String str, pey peyVar, kds kdsVar) {
        Lifecycle lifecycle = peyVar.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        pcs pcsVar = new pcs(this, str, kdsVar, lifecycle);
        tcs tcsVar = (tcs) this.n.put(str, new tcs(lifecycle, kdsVar, pcsVar));
        if (tcsVar != null) {
            tcsVar.b();
        }
        if (O(2)) {
            lifecycle.toString();
            Objects.toString(kdsVar);
        }
        lifecycle.a(pcsVar);
    }

    public final void n(boolean z, boolean z2) {
        if (z2 && (this.x instanceof t0)) {
            q0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.n(z, true);
                }
            }
        }
    }

    public final void n0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
        } else {
            w511.l("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void o() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final void o0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                w511.l("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.A;
        this.A = fragment;
        r(fragment2);
        r(this.A);
    }

    public final boolean p(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p0(Fragment fragment) {
        ViewGroup L = L(fragment);
        if (L != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (L.getTag(b8h0.visible_removing_fragment_view_tag) == null) {
                    L.setTag(b8h0.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) L.getTag(b8h0.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void q(Menu menu) {
        if (this.w < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new zfz());
        gcs gcsVar = this.x;
        if (gcsVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((l) gcsVar).x.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r4.b.remove(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(a aVar) {
        o oVar = this.p;
        synchronized (oVar.b) {
            int size = oVar.b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((n) oVar.b.get(i)).a() == aVar) {
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        if (z2 && (this.x instanceof u0)) {
            q0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.s(z, true);
                }
            }
        }
    }

    public final void s0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.h(true);
                    if (O(3)) {
                        toString();
                    }
                } else {
                    boolean z = K() > 0 && R(this.z);
                    if (O(3)) {
                        toString();
                    }
                    this.j.h(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.z;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            gcs gcsVar = this.x;
            if (gcsVar != null) {
                sb.append(gcsVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (w wVar : this.c.b.values()) {
                if (wVar != null) {
                    wVar.e = i;
                }
            }
            T(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((g) it.next()).i();
            }
            this.b = false;
            z(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String j = b64.j(str, Extension.TAB_CHAR);
        x xVar = this.c;
        ArrayList arrayList = xVar.a;
        String j2 = b64.j(str, Extension.TAB_CHAR);
        HashMap hashMap = xVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (w wVar : hashMap.values()) {
                printWriter.print(str);
                if (wVar != null) {
                    Fragment fragment = wVar.c;
                    printWriter.println(fragment);
                    fragment.dump(j2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(Extension.COLON_SPACE);
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(Extension.COLON_SPACE);
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(Extension.COLON_SPACE);
                printWriter.println(aVar.toString());
                aVar.o(j, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (vcs) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(Extension.COLON_SPACE);
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.J);
        printWriter.print(" mStopped=");
        printWriter.print(this.K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.L);
        if (this.I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.I);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((g) it.next()).i();
        }
    }

    public final void x(vcs vcsVar, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.L) {
                    ny61.r("FragmentManager has been destroyed");
                    return;
                } else {
                    ny61.r("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (S()) {
                ny61.r("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(vcsVar);
                    j0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z) {
        if (this.b) {
            ny61.r("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.L) {
                ny61.r("FragmentManager has been destroyed");
                return;
            } else {
                ny61.r("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.c.getLooper()) {
            ny61.r("Must be called from main thread of fragment host");
            return;
        }
        if (!z && S()) {
            ny61.r("Can not perform this action after onSaveInstanceState");
        } else if (this.N == null) {
            this.N = new ArrayList();
            this.O = new ArrayList();
        }
    }

    public final boolean z(boolean z) {
        boolean z2;
        ArrayList arrayList;
        androidx.fragment.app.a aVar;
        y(z);
        if (!this.i && (aVar = this.h) != null) {
            aVar.s = false;
            aVar.k();
            if (O(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.l(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((des) it.next()).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.N;
            ArrayList arrayList3 = this.O;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((vcs) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.x.c.removeCallbacks(this.R);
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            this.b = true;
            try {
                f0(this.N, this.O);
                d();
                z3 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        s0();
        if (this.M) {
            this.M = false;
            Iterator it2 = this.c.d().iterator();
            while (it2.hasNext()) {
                w wVar = (w) it2.next();
                Fragment fragment2 = wVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.M = true;
                    } else {
                        fragment2.mDeferStart = false;
                        wVar.i();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z3;
    }

    /* loaded from: classes10.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        };
        int mRequestCode;
        String mWho;

        public LaunchedFragmentInfo(Parcel parcel) {
            this.mWho = parcel.readString();
            this.mRequestCode = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mWho);
            parcel.writeInt(this.mRequestCode);
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.mWho = str;
            this.mRequestCode = i;
        }
    }
}
