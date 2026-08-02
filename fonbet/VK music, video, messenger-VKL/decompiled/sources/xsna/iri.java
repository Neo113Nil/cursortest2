package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import xsna.jmw;
import xsna.n4s;
import xsna.v4s;

/* compiled from: ComposeViewContext.android.kt */
/* loaded from: classes11.dex */
public final class iri {
    public final View a;
    public final cvi b;
    public final f5z c;
    public final z1h0 d;
    public final xyt0 e;
    public final jmw f;
    public final vag0 g;
    public final Configuration h;
    public final wh50<Configuration> i;
    public final p12 j;
    public final rd2 k;
    public final i52 l;
    public final h52 m;
    public final n4s.a n;
    public final wh50<v4s.a> o;
    public final vtu p;
    public final ud2 q;
    public final toy r;
    public final hyy s;
    public final ir9 t;
    public int u;
    public final jri v;
    public final kri w;

    /* compiled from: ComposeViewContext.android.kt */
    public static final class a extends Lambda implements izs<lgn, kgn> {
        final /* synthetic */ qgn $saveableStateRegistry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qgn qgnVar) {
            super(1);
            this.$saveableStateRegistry = qgnVar;
        }

        @Override // xsna.izs
        public final kgn invoke(lgn lgnVar) {
            return new u72(this.$saveableStateRegistry, 1);
        }
    }

    /* compiled from: ComposeViewContext.android.kt */
    public static final class b extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ p52 $owner;
        final /* synthetic */ iri this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p52 p52Var, iri iriVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
            super(2);
            this.$owner = p52Var;
            this.this$0 = iriVar;
            this.$content = wzsVar;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1317454175, intValue, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals.<anonymous> (ComposeViewContext.android.kt:436)");
                }
                aVar2.K(866651995);
                uvi.a(this.$owner, this.this$0.k, this.$content, aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: ComposeViewContext.android.kt */
    public static final class c extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ p52 $owner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(p52 p52Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, int i) {
            super(2);
            this.$owner = p52Var;
            this.$content = wzsVar;
            this.$$changed = i;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            iri.this.a(this.$owner, this.$content, aVar, ne7.I(this.$$changed | 1));
            return s3q0.a;
        }
    }

    public iri(iri iriVar, View view, cvi cviVar, f5z f5zVar, z1h0 z1h0Var, xyt0 xyt0Var) {
        n4s.a y82Var;
        ir9 ir9Var;
        toy toyVar;
        vag0 vag0Var;
        View view2;
        boolean f = epx.f((iriVar == null || (view2 = iriVar.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.b = cviVar;
        this.c = f5zVar;
        this.d = z1h0Var;
        this.e = xyt0Var;
        this.f = f ? iriVar.f : new jmw();
        this.g = (iriVar == null || (vag0Var = iriVar.g) == null) ? new vag0() : vag0Var;
        Configuration configuration = f ? iriVar.h : new Configuration(view.getContext().getResources().getConfiguration());
        this.h = configuration;
        this.i = f ? iriVar.i : androidx.compose.runtime.k.b(new Configuration(configuration));
        this.j = f ? iriVar.j : new p12(view.getContext());
        this.k = f ? iriVar.k : new rd2(view.getContext());
        i52 i52Var = f ? iriVar.l : new i52(view.getContext());
        this.l = i52Var;
        this.m = f ? iriVar.m : new h52(i52Var);
        if (f) {
            y82Var = iriVar.n;
        } else {
            view.getContext();
            y82Var = new y82();
        }
        this.n = y82Var;
        this.o = f ? iriVar.o : androidx.compose.runtime.k.a(y4s.a(view.getContext()), hg10.g);
        this.p = view == (iriVar != null ? iriVar.a : null) ? iriVar.p : new nta0(view);
        this.q = f ? iriVar.q : new ud2(ViewConfiguration.get(view.getContext()));
        this.r = (iriVar == null || (toyVar = iriVar.r) == null) ? new toy() : toyVar;
        this.s = new hyy();
        this.t = (iriVar == null || (ir9Var = iriVar.t) == null) ? new ir9() : ir9Var;
        this.v = new jri(this);
        this.w = new kri(this);
    }

    public final void a(p52 p52Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(123858079);
        int i2 = (i & 6) == 0 ? (M.y(p52Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.y(wzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(this) ? 256 : 128;
        }
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(123858079, i2, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals (ComposeViewContext.android.kt:403)");
            }
            Object tag = p52Var.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = ttp0.h(tag) ? (Set) tag : null;
            if (set == null) {
                Object parent = p52Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = ttp0.h(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(M.U());
                M.u();
            }
            Object x = M.x();
            z1h0 z1h0Var = this.d;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                View view2 = (View) p52Var.getParent();
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag3 instanceof String ? (String) tag3 : null;
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String b2 = go9.b("SaveableStateRegistry:", str);
                v1h0 savedStateRegistry = z1h0Var.getSavedStateRegistry();
                Bundle a2 = savedStateRegistry.a(b2);
                if (a2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : a2.keySet()) {
                        linkedHashMap.put(str2, a2.getParcelableArrayList(str2));
                    }
                }
                iyk0 iyk0Var = o1h0.a;
                n1h0 n1h0Var = new n1h0(linkedHashMap, tgn.i);
                if (savedStateRegistry.b(b2) == null) {
                    try {
                        savedStateRegistry.c(b2, new rgn(n1h0Var, 0));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                qgn qgnVar = new qgn(n1h0Var, new sgn(z, savedStateRegistry, b2));
                M.R(qgnVar);
                x = qgnVar;
            }
            qgn qgnVar2 = (qgn) x;
            s3q0 s3q0Var = s3q0.a;
            boolean y = M.y(qgnVar2);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new a(qgnVar2);
                M.R(x2);
            }
            bap.c(s3q0Var, (izs) x2, M, 6);
            pqo pqoVar = uvi.w;
            boolean booleanValue = ((Boolean) M.r(pqoVar)).booleanValue() | p52Var.getScrollCaptureInProgress$ui();
            boolean J = M.J(p52Var.getView());
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new o1u0(p52Var.getView());
                M.R(x3);
            }
            rvi.b(new c9e0[]{bvz.a.b(this.c), vvz.a.b(z1h0Var), AndroidCompositionLocals_androidKt.d.b(this.f), AndroidCompositionLocals_androidKt.e.b(this.g), AndroidCompositionLocals_androidKt.b.b(p52Var.getContext()), d5x.a.b(set), AndroidCompositionLocals_androidKt.a.b(p52Var.getConfiguration()), o1h0.a.b(qgnVar2), AndroidCompositionLocals_androidKt.f.b(p52Var.getView()), pqoVar.b(Boolean.valueOf(booleanValue)), uvi.t.b(p52Var.getViewConfiguration()), bgv.a.b((o1u0) x3)}, kai.c(1317454175, new b(p52Var, this, wzsVar), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c(p52Var, wzsVar, i);
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
            kri kriVar = this.w;
            context.unregisterComponentCallbacks(kriVar);
            hyy hyyVar = this.s;
            if (hyyVar.b == null) {
                hyyVar.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(kriVar);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            kri kriVar = this.w;
            context.registerComponentCallbacks(kriVar);
            d(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            hyy hyyVar = this.s;
            ((zak0) hyyVar.c).setValue(Boolean.valueOf(hasWindowFocus));
            wh50<d1m> wh50Var = hyyVar.b;
            jri jriVar = this.v;
            if (wh50Var == null) {
                hyyVar.a = jriVar;
            }
            if (wh50Var != null) {
                ((zak0) wh50Var).setValue(jriVar.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(kriVar);
        }
    }

    public final void d(Configuration configuration) {
        wh50<d1m> wh50Var;
        int updateFrom = this.h.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator<Map.Entry<jmw.b, WeakReference<jmw.a>>> it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                jmw.a aVar = it.next().getValue().get();
                if (aVar == null || Configuration.needNewResources(updateFrom, aVar.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            this.g.a();
            if ((268435456 & updateFrom) != 0) {
                this.o.setValue(y4s.a(this.a.getContext()));
            }
            if (((-1342235264) & updateFrom) == 0 || (wh50Var = this.s.b) == null) {
                return;
            }
            ((zak0) wh50Var).setValue(this.v.invoke());
        }
    }
}
