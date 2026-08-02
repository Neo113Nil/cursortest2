package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LoopingLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.pagergrid.PagerGridLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fb80;
import xsna.hzp0;
import xsna.z160;

/* compiled from: CatalogUIViewTracker.kt */
/* loaded from: classes16.dex */
public class vha extends d680<Object> {
    public final s1v b;
    public final dha c;
    public final pvx d;
    public c2q0<Object> e;

    /* compiled from: CatalogUIViewTracker.kt */
    public static class b {
        public UIBlock a;
        public final int b;

        public b(int i, UIBlock uIBlock) {
            this.a = uIBlock;
            this.b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vha() {
        this((s1v) null, (dha) (0 == true ? 1 : 0), 7);
    }

    @Override // xsna.d680
    public List<hzp0> j(Object obj) {
        if (!(obj instanceof b)) {
            return null;
        }
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CATALOG_ITEM;
        b bVar = (b) obj;
        UIBlock uIBlock = bVar.a;
        int i = bVar.b;
        s1v s1vVar = this.b;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, null, null, s1v.f(bVar.a), s1vVar.e(uIBlock), null, 38, null);
        dha dhaVar = this.c;
        return rl3.I(new hzp0[]{hzp0.m.a(schemeStat$EventItem, i, dhaVar != null ? dhaVar.a() : null), new hzp0.o0(new SchemeStat$EventItem(type, null, null, null, s1vVar.e(bVar.a), null, 46, null), i, dhaVar != null ? dhaVar.a() : null, new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, CommonVideoStat$TypeScreenMode.PREVIEW))});
    }

    public c2q0 o(RecyclerView recyclerView) {
        return p(recyclerView);
    }

    public c2q0<Object> p(RecyclerView recyclerView) {
        return new a(this, recyclerView, null, this.d, 4);
    }

    public void q() {
        c2q0<Object> c2q0Var = this.e;
        if (c2q0Var != null) {
            c2q0Var.b();
        }
    }

    public void r(List<? extends UIBlock> list) {
        c2q0<Object> c2q0Var = this.e;
        if (c2q0Var != null) {
            c2q0Var.a();
        }
        c2q0<Object> c2q0Var2 = this.e;
        a aVar = c2q0Var2 instanceof a ? (a) c2q0Var2 : null;
        if (aVar != null) {
            LinkedHashMap linkedHashMap = aVar.v;
            Set R0 = j5g.R0(linkedHashMap.keySet());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                R0.remove(((UIBlock) it.next()).Fb());
            }
            if (R0.isEmpty()) {
                return;
            }
            linkedHashMap.keySet().removeAll(R0);
        }
    }

    public void s(RecyclerView recyclerView) {
        this.e = p(recyclerView);
    }

    public void t(boolean z) {
        c2q0<Object> c2q0Var = this.e;
        if (c2q0Var != null) {
            c2q0Var.m(z);
        }
    }

    /* compiled from: CatalogUIViewTracker.kt */
    public static class a extends c2q0<Object> {
        public final RecyclerView u;
        public final LinkedHashMap v;

        /* compiled from: CatalogUIViewTracker.kt */
        /* renamed from: xsna.vha$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3890a implements vtj, g0t {
            public final /* synthetic */ com.vk.metrics.eventtracking.b b;

            public C3890a(com.vk.metrics.eventtracking.b bVar) {
                this.b = bVar;
            }

            @Override // xsna.vtj
            public final void a(IllegalStateException illegalStateException) {
                this.b.a(illegalStateException);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof vtj) && (obj instanceof g0t)) {
                    return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // xsna.g0t
            public final xzs<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(1, this.b, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public /* synthetic */ a(vha vhaVar, RecyclerView recyclerView, z160.a aVar, pvx pvxVar, int i) {
            this(vhaVar, recyclerView, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? new q5u0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3) : pvxVar);
        }

        @Override // xsna.c2q0, xsna.jm6
        public Object c(RecyclerView.e0 e0Var) {
            UIBlock uIBlock;
            tca tcaVar = e0Var instanceof tca ? (tca) e0Var : null;
            if (tcaVar != null && (uIBlock = tcaVar.n) != null) {
                String Fb = uIBlock.Fb();
                LinkedHashMap linkedHashMap = this.v;
                Object obj = linkedHashMap.get(Fb);
                if (obj == null) {
                    obj = n(e0Var, uIBlock, tcaVar);
                    linkedHashMap.put(Fb, obj);
                }
                b bVar = (b) obj;
                bVar.a = uIBlock;
                if (bVar.b >= 0) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // xsna.jm6
        public void g(List<? extends Object> list) {
            ttp0.a(this.v.keySet()).removeAll(list);
        }

        @Override // xsna.c2q0
        public final boolean i(RecyclerView.o oVar) {
            if (super.i(oVar)) {
                return true;
            }
            if ((oVar instanceof LoopingLinearLayoutManager) && ((LoopingLinearLayoutManager) oVar).b == 0) {
                return true;
            }
            if ((oVar instanceof GridLayoutManager) && ((GridLayoutManager) oVar).b == 0) {
                return true;
            }
            if (!(oVar instanceof PagerGridLayoutManager)) {
                return false;
            }
            ((PagerGridLayoutManager) oVar).getClass();
            return true;
        }

        @Override // xsna.c2q0
        public void l() {
            this.v.clear();
        }

        public b n(RecyclerView.e0 e0Var, UIBlock uIBlock, tca tcaVar) {
            return new b(o(uIBlock, tcaVar), uIBlock);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int o(UIBlock uIBlock, tca tcaVar) {
            if (tcaVar.getBindingAdapterPosition() >= 0) {
                return tcaVar.getBindingAdapterPosition();
            }
            RecyclerView.Adapter adapter = this.u.getAdapter();
            pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
            lca lcaVar = pd90Var != null ? pd90Var.c : null;
            lca lcaVar2 = lcaVar instanceof lca ? lcaVar : null;
            if (lcaVar2 == null) {
                return -1;
            }
            try {
                List<UIBlock> y0 = lcaVar2.y0();
                if (y0 != null) {
                    return ((ArrayList) y0).indexOf(uIBlock);
                }
                return -1;
            } catch (Throwable unused) {
                return -1;
            }
        }

        public a(fb80.b<Object> bVar, RecyclerView recyclerView, wzs<? super RecyclerView, ? super Integer, ? extends c2q0<Object>> wzsVar, pvx pvxVar) {
            super(recyclerView, bVar, wzsVar, new C3890a(com.vk.metrics.eventtracking.b.a), pvxVar, 8);
            this.u = recyclerView;
            this.v = new LinkedHashMap();
        }

        @ozl
        public a(fb80.b<Object> bVar, boolean z, RecyclerView recyclerView, wzs<? super RecyclerView, ? super Integer, ? extends c2q0<Object>> wzsVar) {
            this(bVar, recyclerView, wzsVar, new mjf0(z, 6));
        }
    }

    public vha(s1v s1vVar, dha dhaVar, pvx pvxVar) {
        this.b = s1vVar;
        this.c = dhaVar;
        this.d = pvxVar;
    }

    public /* synthetic */ vha(s1v s1vVar, dha dhaVar, int i) {
        this((i & 1) != 0 ? new s1v() : s1vVar, (i & 2) != 0 ? null : dhaVar, new q5u0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
    }

    public vha(boolean z, s1v s1vVar, dha dhaVar, int i) {
        this((i & 2) != 0 ? new s1v() : s1vVar, (i & 4) != 0 ? null : dhaVar, new mjf0(z, 2));
    }
}
