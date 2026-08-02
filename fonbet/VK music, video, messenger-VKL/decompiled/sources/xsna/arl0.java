package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.stories.model.IdeasStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.arl0;
import xsna.d5u0;
import xsna.mzp0;

/* compiled from: StoriesBlockHolderImpl.kt */
/* loaded from: classes6.dex */
public final class arl0 extends rql0 implements w8i, y4u0 {
    public static boolean J = true;
    public final d5u0 A;
    public boolean B;
    public final bpn0 C;
    public View D;
    public final hmp0 E;
    public io.reactivex.rxjava3.disposables.c F;
    public mzp0 G;
    public boolean H;
    public boolean I;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint p;
    public final wvl0 q;
    public final StoryViewerRouter r;
    public final xsl0 s;
    public final fsl0 t;
    public final Object u;
    public final wql0 v;
    public final a w;
    public final opl0 x;
    public final h3m0 y;
    public final b25 z;

    /* compiled from: StoriesBlockHolderImpl.kt */
    public static final class a implements gzs<s3q0> {
        public gzs<s3q0> b;

        @Override // xsna.gzs
        public final s3q0 invoke() {
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            return s3q0.a;
        }
    }

    public arl0(Context context, ViewGroup viewGroup, y4m0 y4m0Var, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, wvl0 wvl0Var, StoryViewerRouter storyViewerRouter, xsl0 xsl0Var, fsl0 fsl0Var, xxl0 xxl0Var, int i) {
        super(new RecyclerView(context), viewGroup);
        h3m0 h3m0Var;
        this.p = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.q = wvl0Var;
        this.r = storyViewerRouter;
        this.s = xsl0Var;
        this.t = fsl0Var;
        this.u = msy.a(LazyThreadSafetyMode.NONE, new w2a0(9));
        this.v = new wql0(0);
        a aVar = new a();
        this.w = aVar;
        b25 s = ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).s();
        this.z = s;
        this.B = true;
        this.C = new bpn0(new in60(this, 20));
        View view = this.itemView;
        this.D = view;
        this.E = new hmp0(view, new lva0(this, 23));
        this.F = EmptyDisposable.INSTANCE;
        final RecyclerView recyclerView = (RecyclerView) this.itemView;
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        int a2 = iah0.a(8);
        recyclerView.setPadding(a2, recyclerView.getPaddingTop(), a2, recyclerView.getPaddingBottom());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.vk.story.viewer.impl.presentation.holders.StoriesBlockHolderImpl$setupRecyclerViewLayout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
                mzp0 mzp0Var;
                super.onLayoutCompleted(a0Var);
                arl0 arl0Var = arl0.this;
                arl0Var.t.d();
                if (!arl0Var.H || arl0Var.x.getItemCount() <= 0 || (mzp0Var = arl0Var.G) == null) {
                    return;
                }
                mzp0Var.d(recyclerView);
                mzp0Var.h();
                mzp0Var.j();
            }
        });
        awt0.t(recyclerView, new j3(25, this, recyclerView));
        if (com.vk.toggle.d.e().b) {
            recyclerView.setClipChildren(false);
        }
        if (J && com.vk.toggle.d.e().a) {
            Activity w = bwt0.w(recyclerView);
            if (w != null) {
                h3m0Var = new h3m0(recyclerView, xxl0Var.g() + xxl0Var.d(), w, aVar);
            } else {
                h3m0Var = null;
            }
            this.y = h3m0Var;
            recyclerView.addItemDecoration(new ehk0(xxl0Var.g()));
            h3m0 h3m0Var2 = this.y;
            if (h3m0Var2 != null) {
                recyclerView.addItemDecoration(h3m0Var2);
            }
        }
        fsl0Var.h();
        opl0 opl0Var = new opl0(viewGroup, xsl0Var, recyclerView, y4m0Var, mobileOfficialAppsConStoriesStat$ViewEntryPoint, str, storyViewerRouter, wvl0Var, fsl0Var, xxl0Var);
        recyclerView.setAdapter(opl0Var);
        this.x = opl0Var;
        this.A = new d5u0((RecyclerView) this.itemView, s, new ae8(1, this, arl0.class, "getVisibleStoryContainer", "getVisibleStoryContainer(I)Lcom/vk/dto/stories/model/StoriesContainer;", 0, 9));
        this.itemView.addOnAttachStateChangeListener(new zql0(this, recyclerView));
    }

    @Override // xsna.y4u0
    public final void B5(boolean z) {
        if (z == this.B) {
            return;
        }
        this.B = z;
        this.x.r = null;
    }

    @Override // xsna.rov
    public final void E1(List<? extends StoryEntry> list) {
        Set S0 = j5g.S0(list);
        opl0 opl0Var = this.x;
        opl0Var.K0(new x0o(this, (ListDataSet.ArrayListImpl) opl0Var.y0(), S0, 4));
    }

    @Override // xsna.rov
    public final void G1(StoryEntry storyEntry) {
        opl0 opl0Var = this.x;
        ArrayList arrayList = (ArrayList) opl0Var.y0();
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            StoriesContainer storiesContainer = (StoriesContainer) arrayList.get(i);
            if (storiesContainer.Eb()) {
                Iterator<StoryEntry> it = storiesContainer.g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    StoryEntry next = it.next();
                    if (epx.f(next, storyEntry)) {
                        next.A = 0;
                        z = true;
                        break;
                    }
                }
                if (z) {
                    if (opl0Var.t) {
                        i++;
                    }
                    opl0Var.K0(new vql0(this, i, 0));
                    return;
                }
            }
            i++;
        }
    }

    @Override // xsna.rov
    public final void H3(zjm0 zjm0Var) {
        StoryEntry storyEntry = zjm0Var.g;
        if (storyEntry == null) {
            return;
        }
        StoriesContainer storiesContainer = (StoriesContainer) ((ListDataSet) this.x.c).t(new ti40(new i0b0(storyEntry, 15), 1));
        if (storiesContainer == null) {
            return;
        }
        Iterator<StoryEntry> it = storiesContainer.g.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            StoryEntry next = it.next();
            if (next.b && next.c == zjm0Var.a) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i >= storiesContainer.g.size()) {
            return;
        }
        storiesContainer.g.set(i, storyEntry);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.rov
    public final void X3(as80 as80Var) {
        StoriesContainer storiesContainer = as80Var.a;
        opl0 opl0Var = this.x;
        List<StoriesContainer> y0 = opl0Var.y0();
        ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
        Iterator it = ((ArrayList) y0).iterator();
        while (it.hasNext()) {
            StoriesContainer storiesContainer2 = (StoriesContainer) it.next();
            if (epx.f(storiesContainer2.f, storiesContainer.f)) {
                storiesContainer.n = storiesContainer2.n;
                CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
                CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList2 = storiesContainer2.g;
                if (copyOnWriteArrayList != copyOnWriteArrayList2) {
                    copyOnWriteArrayList2.clear();
                    storiesContainer2.g.addAll(storiesContainer.g);
                }
                storiesContainer2 = storiesContainer;
            }
            arrayList.add(storiesContainer2);
        }
        opl0Var.K0(new ax5(this, arrayList, storiesContainer, 8));
        if (!this.B) {
            opl0Var.r = null;
            return;
        }
        ?? r0 = opl0Var.r;
        if (r0 != 0) {
            r0.invoke(as80Var);
        }
    }

    @Override // xsna.rov
    public final void d4(ArrayList<StoriesContainer> arrayList) {
        this.x.K0(new jl4(21, this, arrayList));
    }

    @Override // xsna.vif0
    public final void i6(ArrayList<StoriesContainer> arrayList) {
        ArrayList<StoriesContainer> arrayList2 = arrayList;
        final boolean z = true;
        this.H = true;
        su80 su80Var = new su80(this, 25);
        opl0 opl0Var = this.x;
        opl0Var.K0(su80Var);
        d5u0 d5u0Var = this.A;
        d5u0Var.getClass();
        d5u0Var.j = System.currentTimeMillis();
        d5u0Var.k.onNext(d5u0.a.C2708a.a);
        d5u0Var.g.clear();
        d5u0Var.l();
        if (J) {
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                ((StoriesContainer) obj).n = i;
                i = i2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            StoriesContainer storiesContainer = (StoriesContainer) obj2;
            if (storiesContainer.Eb() || storiesContainer.Qb()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            StoriesContainer storiesContainer2 = (StoriesContainer) next;
            if (!(storiesContainer2 instanceof IdeasStoriesContainer) || ((IdeasStoriesContainer) storiesContainer2).r == null) {
                arrayList4.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        final ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (hashSet.add(((StoriesContainer) next2).Ob())) {
                arrayList5.add(next2);
            }
        }
        if (arrayList5.isEmpty()) {
            this.itemView.setVisibility(8);
            mzp0 mzp0Var = this.G;
            if (mzp0Var != null) {
                mzp0Var.f();
            }
        } else {
            if (!arrayList5.isEmpty()) {
                Iterator it3 = arrayList5.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((StoriesContainer) it3.next()).Eb()) {
                        if (!this.I) {
                            this.I = true;
                            mzp0 mzp0Var2 = this.G;
                            if (mzp0Var2 != null) {
                                mzp0Var2.c(this.o);
                            }
                        }
                    }
                }
            }
            if (!arrayList5.isEmpty()) {
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    if (((Boolean) this.v.invoke(it4.next())).booleanValue()) {
                        break;
                    }
                }
            }
            z = false;
            opl0Var.K0(new gzs() { // from class: xsna.yql0
                @Override // xsna.gzs
                public final Object invoke() {
                    arl0 arl0Var = arl0.this;
                    opl0 opl0Var2 = arl0Var.x;
                    boolean z2 = arl0Var.n && z;
                    if (z2 != opl0Var2.t) {
                        opl0Var2.t = z2;
                        if (z2) {
                            opl0Var2.notifyItemInserted(0);
                        } else {
                            opl0Var2.notifyItemRemoved(0);
                        }
                    }
                    opl0Var2.n0(arrayList5);
                    return s3q0.a;
                }
            });
            this.itemView.setVisibility(0);
        }
        if (this.p == MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER) {
            new b.d("stories_discover_seen_in_feed").e();
        }
    }

    @Override // xsna.rov, xsna.y4u0
    public final void onDestroy() {
        d5u0 d5u0Var = this.A;
        d5u0Var.l.dispose();
        d5u0Var.k.onNext(d5u0.a.C2708a.a);
        d5u0Var.g.clear();
        e5u0.a.evictAll();
        d5u0Var.b.removeOnScrollListener(d5u0Var);
        this.x.r = null;
    }

    @Override // xsna.rov
    public final void onPause() {
        this.x.r = null;
    }

    @Override // xsna.rql0
    public final void q6() {
        this.x.r = null;
        h3m0 h3m0Var = this.y;
        if (h3m0Var != null) {
            h3m0Var.r = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rql0
    public final void s6() {
        L.e("STORIES:", "Story block in feed recycled");
        if (((Boolean) this.u.getValue()).booleanValue()) {
            this.x.r = null;
            ((RecyclerView) this.itemView).stopScroll();
        }
    }

    @Override // xsna.rql0
    public final void t6() {
        ((RecyclerView) this.itemView).scrollToPosition(0);
    }

    @Override // xsna.rql0
    public final void v6(gzs<s3q0> gzsVar) {
        this.w.b = gzsVar;
    }
}
