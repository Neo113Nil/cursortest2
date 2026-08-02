package xsna;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class e5z0 {
    public final giy0 a;
    public final nl b;
    public final bqz0 c;
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final d5z0 j = new d5z0();
    public boolean k = false;

    public e5z0(giy0 giy0Var, nl nlVar, bqz0 bqz0Var) {
        this.a = giy0Var;
        this.b = nlVar;
        this.c = bqz0Var;
    }

    public static e5z0 a(giy0 giy0Var, nl nlVar) {
        return new e5z0(giy0Var, nlVar, null);
    }

    public static e5z0 b(giy0 giy0Var, bqz0 bqz0Var) {
        return new e5z0(giy0Var, null, bqz0Var);
    }

    public static boolean n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((z1z0) it.next()).d) {
                return true;
            }
        }
        return false;
    }

    public final b6z0 c(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            oiz0 oiz0Var = (oiz0) it.next();
            if (oiz0Var.g == i) {
                arrayList.add(oiz0Var);
            }
        }
        return b6z0.b(this, arrayList);
    }

    public final b6z0 d(String str) {
        return b6z0.b(this, new ArrayList(str.equals(X3.i.D) ? this.f : this.g));
    }

    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f((z1z0) it.next());
        }
    }

    public final void f(z1z0 z1z0Var) {
        if (z1z0Var.d) {
            this.k = true;
        }
        if (z1z0Var instanceof ddy0) {
            String str = ((ddy0) z1z0Var).f;
            if (X3.i.C.equals(str)) {
                this.g.add(z1z0Var);
                return;
            } else {
                if (X3.i.D.equals(str)) {
                    this.f.add(z1z0Var);
                    return;
                }
                return;
            }
        }
        if (z1z0Var instanceof e9z0) {
            this.e.add((e9z0) z1z0Var);
            return;
        }
        if (!(z1z0Var instanceof ghy0)) {
            if (z1z0Var instanceof oiz0) {
                this.i.add((oiz0) z1z0Var);
                return;
            } else {
                this.d.add(z1z0Var);
                return;
            }
        }
        ghy0 ghy0Var = (ghy0) z1z0Var;
        d5z0 d5z0Var = this.j;
        ArrayList arrayList = this.h;
        int binarySearch = Collections.binarySearch(arrayList, ghy0Var, d5z0Var);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        arrayList.add(binarySearch, ghy0Var);
    }

    public final void g(e5z0 e5z0Var, float f) {
        HashSet hashSet = e5z0Var.d;
        ArrayList arrayList = e5z0Var.h;
        HashSet hashSet2 = e5z0Var.e;
        this.d.addAll(hashSet);
        this.i.addAll(e5z0Var.i);
        this.f.addAll(e5z0Var.f);
        this.g.addAll(e5z0Var.g);
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.e.addAll(hashSet2);
            this.h.addAll(arrayList);
            return;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            e9z0 e9z0Var = (e9z0) it.next();
            float f2 = e9z0Var.g;
            if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                e9z0Var.f = (f2 * f) / 100.0f;
                e9z0Var.g = -1.0f;
            }
            f(e9z0Var);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ghy0 ghy0Var = (ghy0) it2.next();
            float f3 = ghy0Var.j;
            if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ghy0Var.i = (f3 * f) / 100.0f;
                ghy0Var.j = -1.0f;
            }
            f(ghy0Var);
        }
    }

    public final boolean h(ooy0 ooy0Var) {
        Iterator it = this.d.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            z1z0 z1z0Var = (z1z0) it.next();
            String str = z1z0Var.a;
            if (z1z0Var.d || "show".equals(str) || "playbackStarted".equals(str) || "playheadViewabilityValue".equals(str)) {
                z = true;
            }
            if ("click".equals(str)) {
                z2 = true;
            }
        }
        if (!z) {
            ooy0Var.h(3008, "isImpression stats not found");
        }
        if (ooy0Var.d && !z2) {
            ooy0Var.h(3008, "click stat is not found");
        }
        return z && z2;
    }

    public final b6z0 i(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ghy0 ghy0Var = (ghy0) it.next();
            if (ghy0Var.g == i) {
                arrayList.add(ghy0Var);
            }
        }
        return b6z0.b(this, arrayList);
    }

    public final b6z0 j(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            z1z0 z1z0Var = (z1z0) it.next();
            if (str.equals(z1z0Var.a)) {
                arrayList.add(z1z0Var);
            }
        }
        return b6z0.b(this, arrayList);
    }

    public final void k(e5z0 e5z0Var, float f) {
        ArrayList l = e5z0Var.l("playbackStarted");
        HashSet hashSet = e5z0Var.e;
        HashSet hashSet2 = this.d;
        hashSet2.addAll(l);
        hashSet2.addAll(e5z0Var.l("playbackResumed"));
        hashSet2.addAll(e5z0Var.l("playbackPaused"));
        hashSet2.addAll(e5z0Var.l("playbackStopped"));
        hashSet2.addAll(e5z0Var.l("playbackCompleted"));
        hashSet2.addAll(e5z0Var.l("playbackError"));
        hashSet2.addAll(e5z0Var.l("volumeOn"));
        hashSet2.addAll(e5z0Var.l("volumeOff"));
        hashSet2.addAll(e5z0Var.l("fullscreenOn"));
        hashSet2.addAll(e5z0Var.l("fullscreenOff"));
        hashSet2.addAll(e5z0Var.l("error"));
        hashSet2.addAll(e5z0Var.l("playbackTimeout"));
        this.i.addAll(e5z0Var.c(2).c);
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.e.addAll(hashSet);
            this.h.addAll(e5z0Var.i(2).c);
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            e9z0 e9z0Var = (e9z0) it.next();
            float f2 = e9z0Var.g;
            if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                e9z0Var.f = (f2 * f) / 100.0f;
                e9z0Var.g = -1.0f;
            }
            f(e9z0Var);
        }
        for (ghy0 ghy0Var : e5z0Var.i(2).c) {
            float f3 = ghy0Var.j;
            if (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ghy0Var.i = (f3 * f) / 100.0f;
                ghy0Var.j = -1.0f;
            }
            f(ghy0Var);
        }
    }

    public final ArrayList l(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            z1z0 z1z0Var = (z1z0) it.next();
            if (str.equals(z1z0Var.a)) {
                arrayList.add(z1z0Var);
            }
        }
        return arrayList;
    }

    public final b6z0 m() {
        return b6z0.b(this, new ArrayList(this.e));
    }

    public final boolean o(String str) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (str.equals(((z1z0) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        return (this.d.isEmpty() && this.e.isEmpty() && this.h.isEmpty() && this.i.isEmpty() && this.g.isEmpty() && this.f.isEmpty()) ? false : true;
    }
}
