package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.presentation.holders.ReactionsFeedPhotosBlockHolder;
import com.vk.stat.recycler.Measurement;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NewsfeedListAdapter.kt */
/* loaded from: classes4.dex */
public final class ho60 extends RecyclerView.Adapter<RecyclerView.e0> implements mf7 {
    public final jn60 c;
    public final s1c0 d;
    public final LinkedHashSet e;
    public final Lazy f;
    public final Object g;
    public final Object h;
    public final ci60 i;
    public final vd60 j;
    public com.vk.stat.recycler.d k;
    public a l;
    public final WeakReference<fo60> m;
    public final ac20 n;
    public final v20 o;
    public final km60 p;

    public ho60() {
        throw null;
    }

    public ho60(jn60 jn60Var, fo60 fo60Var, Executor executor, s1c0 s1c0Var, Lazy lazy) {
        mh60 mh60Var = new mh60();
        this.c = jn60Var;
        this.d = s1c0Var;
        this.e = new LinkedHashSet();
        this.f = lazy;
        vf1 vf1Var = new vf1(13, this, mh60Var);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, vf1Var);
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.a(19));
        ci60 ci60Var = new ci60(executor);
        this.i = ci60Var;
        vd60 vd60Var = new vd60();
        this.j = vd60Var;
        this.m = new WeakReference<>(fo60Var);
        vd60Var.b.add(ci60Var);
        ac20 ac20Var = new ac20(this, 7);
        this.n = ac20Var;
        this.o = new v20(this, 29);
        this.p = new km60(ac20Var);
        setHasStableIds(true);
    }

    public final boolean A0(List<? extends ol60> list) {
        return z0().a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void B0(RecyclerView.e0 e0Var, int i, List<Object> list) {
        com.vk.stat.recycler.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
        ol60 item = z0().getItem(i);
        boolean z = e0Var instanceof rp6;
        ac20 ac20Var = this.n;
        if (z) {
            ((rp6) e0Var).D = ac20Var;
        }
        boolean z2 = e0Var instanceof sdv;
        v20 v20Var = this.o;
        km60 km60Var = this.p;
        if (z2) {
            sdv sdvVar = (sdv) e0Var;
            if (ac20Var != null) {
                sdvVar.N.l = ac20Var;
            }
        } else if (e0Var instanceof tdv) {
            ((tdv) e0Var).F.setAttachmentClickListener(km60Var);
        } else if (e0Var instanceof cui) {
            ((cui) e0Var).q5(km60Var, v20Var);
        }
        if (e0Var instanceof qi6) {
            qi6 qi6Var = (qi6) e0Var;
            qi6Var.A = v20Var;
            ((e2c0) this.c.a().p.F.getValue()).a.b = v20Var;
            qi6Var.O6(km60Var);
            qi6Var.z = new h2s(this, 23);
            qi6Var.W5(item, list);
        }
        this.j.d(e0Var, item);
        int i2 = item.b;
        com.vk.stat.recycler.d dVar2 = this.k;
        if (dVar2 != null) {
            dVar2.b(i2, Measurement.Type.Bind, (String) j4c0.a().get(Integer.valueOf(i2)));
        }
    }

    public final void C0(zjf0<ol60> zjf0Var) {
        this.i.c.add(zjf0Var);
    }

    public final void D0(zjf0<ol60> zjf0Var) {
        this.j.b.add(zjf0Var);
    }

    public final void E0() {
        a aVar = this.l;
        if (aVar != null) {
            aVar.b = null;
            aVar.c = null;
        }
        this.l = null;
        jn60 jn60Var = this.c;
        jn60Var.a().h = null;
        jn60Var.a().N0(null);
    }

    public final void F0(zjf0<ol60> zjf0Var) {
        this.i.c.remove(zjf0Var);
    }

    public final void G0(zjf0<ol60> zjf0Var) {
        this.j.b.remove(zjf0Var);
    }

    public final void H0(RecyclerView recyclerView, Runnable runnable, Runnable runnable2, List list, c9x c9xVar) {
        z0().e(recyclerView, runnable, runnable2, list, c9xVar);
    }

    public final void clear() {
        z0().clear();
        this.e.clear();
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        if (i > 0 && i < getItemCount() - 1) {
            return 1;
        }
        ol60 y0 = y0(i);
        if (y0 != null) {
            return y0.e;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return z0().getItemCount();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((Number) z0().getItem(i).g.getValue()).longValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return z0().getItem(i).b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        if (e0Var instanceof com.vk.newsfeed.common.recycler.holders.a) {
            B0(e0Var, i, list);
            return;
        }
        if (e0Var instanceof f6s) {
            B0(e0Var, i, list);
        } else if (((Boolean) this.h.getValue()).booleanValue() && (e0Var instanceof s2n)) {
            B0(e0Var, i, list);
        } else {
            onBindViewHolder(e0Var, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.e0 a2;
        RecyclerView.e0 h2m0Var;
        RecyclerView.e0 e0Var;
        com.vk.stat.recycler.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
        jn60 jn60Var = this.c;
        ro60 ro60Var = jn60Var.d;
        Lazy lazy = jn60Var.f;
        Lazy lazy2 = jn60Var.e;
        if (i == 1101) {
            a2 = ((StoryViewerComponent) lazy2.getValue()).va().a(viewGroup.getContext(), viewGroup, MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST, new y4m0(true), (String) ro60Var.invoke());
        } else if (i == 1124) {
            a2 = new slt(viewGroup);
        } else if (i == 1104) {
            a2 = new nv60(viewGroup);
        } else if (i != 1105) {
            switch (i) {
                case 1107:
                    a2 = new uqq(viewGroup);
                    break;
                case 1108:
                    a2 = new ReactionsFeedPhotosBlockHolder(viewGroup);
                    break;
                case 1109:
                    a2 = new q3f0(viewGroup);
                    break;
                case 1110:
                    a2 = new e5f0(R.layout.holder_reactions_feed_placeholder, viewGroup);
                    break;
                case 1111:
                    h2m0Var = new h2m0(viewGroup, ((s1c0) lazy.getValue()).z, ((s1c0) lazy.getValue()).A, (String) ro60Var.invoke(), ((StoryViewerComponent) lazy2.getValue()).z3(), ((StoryViewerComponent) lazy2.getValue()).tb());
                    a2 = h2m0Var;
                    break;
                case 1112:
                    e0Var = new nnq(viewGroup);
                    a2 = e0Var;
                    break;
                case 1113:
                    e0Var = new vnq(viewGroup);
                    a2 = e0Var;
                    break;
                case 1114:
                    grq grqVar = new grq(R.layout.fave_likes_entry_point_holder, viewGroup);
                    grqVar.itemView.findViewById(R.id.fave_likes_entry_point_view).setOnClickListener(new bd0(grqVar, 3));
                    ((TextView) grqVar.itemView.findViewById(R.id.text)).setText(viewGroup.getContext().getString(R.string.sett_reactions));
                    e0Var = grqVar;
                    a2 = e0Var;
                    break;
                default:
                    switch (i) {
                        case 1116:
                            vmq vmqVar = new vmq(R.layout.fave_cart_entry_point_holder, viewGroup);
                            vmqVar.itemView.setOnClickListener(new s01(vmqVar, 3));
                            e0Var = vmqVar;
                            a2 = e0Var;
                            break;
                        case 1117:
                            h2m0Var = new pu60(viewGroup, (h170) jn60Var.h.getValue());
                            a2 = h2m0Var;
                            break;
                        case 1118:
                            su60 su60Var = new su60(R.layout.vk_view_default_list_error_view, viewGroup);
                            su60Var.D = t980.a;
                            ((TextView) su60Var.itemView.findViewById(R.id.error_button)).setOnClickListener(su60Var);
                            e0Var = su60Var;
                            a2 = e0Var;
                            break;
                        default:
                            a2 = jn60Var.a().onCreateViewHolder(i, viewGroup);
                            break;
                    }
            }
        } else {
            a2 = new swj0(viewGroup);
        }
        this.j.e(a2);
        com.vk.stat.recycler.d dVar2 = this.k;
        if (dVar2 != null) {
            dVar2.b(i, Measurement.Type.Create, (String) j4c0.a().get(Integer.valueOf(i)));
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        super.onViewRecycled(e0Var);
        this.j.b(e0Var);
        if (e0Var instanceof qi6) {
            qi6 qi6Var = (qi6) e0Var;
            qi6Var.I6();
            qi6Var.z = null;
            qi6Var.O6(null);
            qi6Var.A = null;
        }
        if (e0Var instanceof rp6) {
            ((rp6) e0Var).D = t980.a;
        }
        if (e0Var instanceof sdv) {
            return;
        }
        if (e0Var instanceof tdv) {
            ((tdv) e0Var).F.setAttachmentClickListener(null);
            return;
        }
        if (e0Var instanceof cui) {
            ((cui) e0Var).q5(null, null);
        } else if (e0Var instanceof f8q) {
            ((f8q) e0Var).K0(null);
        } else if (e0Var instanceof rql0) {
            ((rql0) e0Var).s6();
        }
    }

    public final void x0(q530 q530Var) {
        a aVar = new a();
        aVar.b = this;
        jn60 jn60Var = this.c;
        aVar.c = jn60Var;
        jn60Var.a().h = aVar;
        jn60Var.a().N0(q530Var);
        this.l = aVar;
    }

    public final ol60 y0(int i) {
        return z0().b(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xo60 z0() {
        return (xo60) this.g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        com.vk.stat.recycler.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
        ol60 item = z0().getItem(i);
        boolean z = e0Var instanceof rp6;
        ac20 ac20Var = this.n;
        if (z) {
            ((rp6) e0Var).D = ac20Var;
        }
        boolean z2 = e0Var instanceof sdv;
        v20 v20Var = this.o;
        km60 km60Var = this.p;
        if (z2) {
            sdv sdvVar = (sdv) e0Var;
            if (ac20Var != null) {
                sdvVar.N.l = ac20Var;
            } else {
                sdvVar.getClass();
            }
        } else if (e0Var instanceof tdv) {
            ((tdv) e0Var).F.setAttachmentClickListener(km60Var);
        } else if (e0Var instanceof cui) {
            ((cui) e0Var).q5(km60Var, v20Var);
        }
        if (e0Var instanceof qi6) {
            qi6 qi6Var = (qi6) e0Var;
            qi6Var.A = v20Var;
            ((e2c0) this.c.a().p.F.getValue()).a.b = v20Var;
            qi6Var.O6(km60Var);
            qi6Var.z = new kn20(this, 13);
            qi6Var.V5(item);
        }
        this.j.d(e0Var, item);
        int i2 = item.b;
        com.vk.stat.recycler.d dVar2 = this.k;
        if (dVar2 != null) {
            dVar2.b(i2, Measurement.Type.Bind, (String) j4c0.a().get(Integer.valueOf(i2)));
        }
    }

    /* compiled from: NewsfeedListAdapter.kt */
    public static final class a implements g530 {
        public ho60 b;
        public jn60 c;

        @Override // xsna.g530
        public final void H2() {
            List<ol60> items;
            ho60 ho60Var;
            ho60 ho60Var2 = this.b;
            if (ho60Var2 == null || (items = ho60Var2.z0().getItems()) == null) {
                return;
            }
            int i = 0;
            for (Object obj : items) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                int i3 = ((ol60) obj).b;
                jn60 jn60Var = this.c;
                if (jn60Var != null) {
                    jn60Var.a().getClass();
                    if (b2c0.K0(i3) && (ho60Var = this.b) != null) {
                        ho60Var.notifyItemChanged(i);
                    }
                }
                i = i2;
            }
        }

        @Override // xsna.g530
        public final void g3() {
        }
    }
}
