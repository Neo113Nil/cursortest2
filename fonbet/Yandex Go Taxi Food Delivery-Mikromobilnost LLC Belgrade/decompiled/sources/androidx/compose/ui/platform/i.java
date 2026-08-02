package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.aw31;
import defpackage.bts;
import defpackage.c1y;
import defpackage.dd2;
import defpackage.did;
import defpackage.duj0;
import defpackage.fgx;
import defpackage.fid;
import defpackage.fsu;
import defpackage.g2m0;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.i72;
import defpackage.j2m0;
import defpackage.jl40;
import defpackage.l28;
import defpackage.l4z;
import defpackage.l7y;
import defpackage.lvc0;
import defpackage.m1m0;
import defpackage.n1m0;
import defpackage.n3z;
import defpackage.ngv;
import defpackage.o0d;
import defpackage.o1k;
import defpackage.o430;
import defpackage.ohh0;
import defpackage.ows0;
import defpackage.oz40;
import defpackage.pey;
import defpackage.pgv;
import defpackage.qwd;
import defpackage.rs31;
import defpackage.sb2;
import defpackage.sls;
import defpackage.sus0;
import defpackage.tls;
import defpackage.ttd;
import defpackage.u2w;
import defpackage.vng;
import defpackage.vvf0;
import defpackage.w6u;
import defpackage.w72;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wxr;
import defpackage.x4c;
import defpackage.x72;
import defpackage.xc2;
import defpackage.xfx;
import defpackage.xw91;
import defpackage.zpn;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {
    public final View a;
    public final ttd b;
    public final pey c;
    public final j2m0 d;
    public final rs31 e;
    public final pgv f;
    public final duj0 g;
    public final Configuration h;
    public final oz40 i;
    public final i72 j;
    public final xc2 k;
    public final x72 l;
    public final w72 m;
    public final wxr n;
    public final oz40 o;
    public final w6u p;
    public final dd2 q;
    public final c1y r;
    public final l7y s;
    public final l28 t;
    public int u;
    public final sls v;
    public final ComposeViewContext$callback$1 w;

    public i(i iVar, View view, ttd ttdVar, pey peyVar, j2m0 j2m0Var, rs31 rs31Var) {
        wxr x4cVar;
        l28 l28Var;
        c1y c1yVar;
        duj0 duj0Var;
        View view2;
        boolean l = jl40.l((iVar == null || (view2 = iVar.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.b = ttdVar;
        this.c = peyVar;
        this.d = j2m0Var;
        this.e = rs31Var;
        this.f = l ? iVar.f : new pgv();
        this.g = (iVar == null || (duj0Var = iVar.g) == null) ? new duj0() : duj0Var;
        Configuration configuration = l ? iVar.h : new Configuration(view.getContext().getResources().getConfiguration());
        this.h = configuration;
        this.i = l ? iVar.i : androidx.compose.runtime.f.j(new Configuration(configuration));
        this.j = l ? iVar.j : new i72(view.getContext());
        this.k = l ? iVar.k : new xc2(view.getContext());
        x72 x72Var = l ? iVar.l : new x72(view.getContext());
        this.l = x72Var;
        this.m = l ? iVar.m : new w72(x72Var);
        if (l) {
            x4cVar = iVar.n;
        } else {
            view.getContext();
            x4cVar = new x4c(16);
        }
        this.n = x4cVar;
        this.o = l ? iVar.o : androidx.compose.runtime.f.i(gtq0.g(view.getContext()), xw91.D);
        this.p = view == (iVar != null ? iVar.a : null) ? iVar.p : new lvc0(view);
        this.q = l ? iVar.q : new dd2(ViewConfiguration.get(view.getContext()));
        this.r = (iVar == null || (c1yVar = iVar.r) == null) ? new c1y(0) : c1yVar;
        this.s = new l7y();
        this.t = (iVar == null || (l28Var = iVar.t) == null) ? new l28() : l28Var;
        this.v = new ComposeViewContext$calculateWindowSizeLambda$1(this);
        this.w = new ComposeViewContext$callback$1(this);
    }

    public final void a(final AndroidComposeView androidComposeView, final wls wlsVar, fid fidVar, final int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(123858079);
        int i2 = (i & 6) == 0 ? (btsVar.e(androidComposeView) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(this) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(ohh0.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof xfx) && !(tag instanceof fgx))) ? null : (Set) tag;
            if (set == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(ohh0.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof xfx) && !(tag2 instanceof fgx))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(btsVar.A());
                btsVar.q = true;
                btsVar.C = true;
                btsVar.c.h();
                btsVar.H.h();
                ows0 ows0Var = btsVar.I;
                sus0 sus0Var = ows0Var.a;
                ows0Var.e = sus0Var.C;
                ows0Var.f = sus0Var.D;
            }
            Object Q = btsVar.Q();
            j2m0 j2m0Var = this.d;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                View view2 = (View) androidComposeView.getParent();
                Object tag3 = view2.getTag(ohh0.compose_view_saveable_id_tag);
                String str = tag3 instanceof String ? (String) tag3 : null;
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String o = g8e.o("SaveableStateRegistry:", str);
                g2m0 savedStateRegistry = j2m0Var.getSavedStateRegistry();
                Bundle a = savedStateRegistry.a(o);
                if (a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : a.keySet()) {
                        linkedHashMap.put(str2, a.getParcelableArrayList(str2));
                    }
                }
                a7u0 a7u0Var = n1m0.a;
                m1m0 m1m0Var = new m1m0(linkedHashMap, DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.w);
                if (savedStateRegistry.b(o) == null) {
                    try {
                        savedStateRegistry.c(o, new o0d(i3, m1m0Var));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                    }
                    o1k o1kVar = new o1k(m1m0Var, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z, savedStateRegistry, o));
                    btsVar.o0(o1kVar);
                    Q = o1kVar;
                }
                z = false;
                o1k o1kVar2 = new o1k(m1m0Var, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z, savedStateRegistry, o));
                btsVar.o0(o1kVar2);
                Q = o1kVar2;
            }
            final o1k o1kVar3 = (o1k) Q;
            boolean e = btsVar.e(o1kVar3);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new tls() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$1$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        return new h(o1k.this);
                    }
                };
                btsVar.o0(Q2);
            }
            zpn.a(zy11.a, (tls) Q2, btsVar);
            qwd qwdVar = j.w;
            boolean booleanValue = ((Boolean) btsVar.m(qwdVar)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui();
            boolean k = btsVar.k(androidComposeView.getView());
            Object Q3 = btsVar.Q();
            if (k || Q3 == o430Var) {
                Q3 = new aw31(androidComposeView.getView());
                btsVar.o0(Q3);
            }
            sb2.c(new vvf0[]{n3z.a.a(this.c), l4z.a.a(j2m0Var), AndroidCompositionLocals_androidKt.d.a(this.f), AndroidCompositionLocals_androidKt.e.a(this.g), AndroidCompositionLocals_androidKt.b.a(androidComposeView.getContext()), u2w.a.a(set), AndroidCompositionLocals_androidKt.a.a(androidComposeView.getConfiguration()), n1m0.a.a(o1kVar3), AndroidCompositionLocals_androidKt.f.a(androidComposeView.getView()), qwdVar.a(Boolean.valueOf(booleanValue)), j.t.a(androidComposeView.getViewConfiguration()), fsu.a.a((aw31) Q3)}, wwg.S(1317454175, true, new wls() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Number) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                        btsVar2.e0(866651995);
                        j.a(AndroidComposeView.this, this.k, wlsVar, btsVar2, 0);
                        btsVar2.t(false);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.ui.platform.ComposeViewContext$ProvideCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    i.this.a(androidComposeView, wlsVar, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public final void b() {
        int i = this.u - 1;
        this.u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.u = 0;
        }
        if (this.u == 0) {
            View view = this.a;
            Context context = view.getContext();
            ComposeViewContext$callback$1 composeViewContext$callback$1 = this.w;
            context.unregisterComponentCallbacks(composeViewContext$callback$1);
            l7y l7yVar = this.s;
            if (l7yVar.b == null) {
                l7yVar.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(composeViewContext$callback$1);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            ComposeViewContext$callback$1 composeViewContext$callback$1 = this.w;
            context.registerComponentCallbacks(composeViewContext$callback$1);
            d(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            l7y l7yVar = this.s;
            l7yVar.c.setValue(Boolean.valueOf(hasWindowFocus));
            oz40 oz40Var = l7yVar.b;
            sls slsVar = this.v;
            if (oz40Var == null) {
                l7yVar.a = slsVar;
            }
            if (oz40Var != null) {
                oz40Var.setValue(((ComposeViewContext$calculateWindowSizeLambda$1) slsVar).invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(composeViewContext$callback$1);
        }
    }

    public final void d(Configuration configuration) {
        int updateFrom = this.h.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                ngv ngvVar = (ngv) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (ngvVar == null || Configuration.needNewResources(updateFrom, ngvVar.a())) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            duj0 duj0Var = this.g;
            synchronized (duj0Var) {
                duj0Var.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.o.setValue(gtq0.g(this.a.getContext()));
            }
            if (((-1342235264) & updateFrom) != 0) {
                l7y l7yVar = this.s;
                sls slsVar = this.v;
                oz40 oz40Var = l7yVar.b;
                if (oz40Var != null) {
                    oz40Var.setValue(((ComposeViewContext$calculateWindowSizeLambda$1) slsVar).invoke());
                }
            }
        }
    }
}
