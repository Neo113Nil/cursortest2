package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.ak00;
import defpackage.bw31;
import defpackage.jyt0;
import defpackage.kyt0;
import defpackage.lyt0;
import defpackage.ny61;
import defpackage.nyt0;
import defpackage.oyr;
import defpackage.swd;
import defpackage.xm50;
import defpackage.yf3;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class f implements xm50 {
    public final e a;
    public final bw31 b;
    public final ArrayList c;
    public final IdentityHashMap d;
    public final ArrayList e;
    public yf3 f;
    public final ConcatAdapter$Config$StableIdMode g;
    public final nyt0 h;

    public f(e eVar) {
        swd swdVar = swd.b;
        this.c = new ArrayList();
        this.d = new IdentityHashMap();
        this.e = new ArrayList();
        this.f = new yf3();
        this.a = eVar;
        swdVar.getClass();
        this.b = new bw31();
        ConcatAdapter$Config$StableIdMode concatAdapter$Config$StableIdMode = swdVar.a;
        this.g = concatAdapter$Config$StableIdMode;
        if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS) {
            this.h = new kyt0();
            return;
        }
        if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.ISOLATED_STABLE_IDS) {
            this.h = new jyt0();
        } else if (concatAdapter$Config$StableIdMode == ConcatAdapter$Config$StableIdMode.SHARED_STABLE_IDS) {
            this.h = new lyt0();
        } else {
            ny61.g("unknown stable id mode");
            throw null;
        }
    }

    public final void a() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
                break;
            }
            a0 a0Var = (a0) it.next();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = a0Var.c.getStateRestorationPolicy();
            stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy2 == stateRestorationPolicy || (stateRestorationPolicy2 == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && a0Var.e == 0)) {
                break;
            }
        }
        e eVar = this.a;
        if (stateRestorationPolicy != eVar.getStateRestorationPolicy()) {
            eVar.f(stateRestorationPolicy);
        }
    }

    public final int b(a0 a0Var) {
        a0 a0Var2;
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (a0Var2 = (a0) it.next()) != a0Var) {
            i += a0Var2.e;
        }
        return i;
    }

    public final yf3 c(int i) {
        yf3 yf3Var = this.f;
        if (yf3Var.b) {
            yf3Var = new yf3();
        } else {
            yf3Var.b = true;
        }
        Iterator it = this.e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a0 a0Var = (a0) it.next();
            int i3 = a0Var.e;
            if (i3 > i2) {
                yf3Var.c = a0Var;
                yf3Var.a = i2;
                break;
            }
            i2 -= i3;
        }
        if (((a0) yf3Var.c) != null) {
            return yf3Var;
        }
        ny61.g(oyr.i(i, "Cannot find wrapper for "));
        return null;
    }

    public final a0 d(x0 x0Var) {
        a0 a0Var = (a0) this.d.get(x0Var);
        if (a0Var != null) {
            return a0Var;
        }
        ak00.h("Cannot find wrapper for ", x0Var, ", seems like it is not bound by this adapter: ", this);
        return null;
    }
}
