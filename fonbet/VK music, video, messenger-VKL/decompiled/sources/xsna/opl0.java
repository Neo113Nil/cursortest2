package xsna;

import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.PromoStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoriesAdapter.kt */
/* loaded from: classes6.dex */
public final class opl0 extends zoj0<StoriesContainer, vif0<StoriesContainer>> implements j4i0 {
    public static final int u = iah0.a(64);
    public final ViewGroup e;
    public final xsl0 f;
    public final RecyclerView g;
    public final y4m0 h;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint i;
    public final String j;
    public final StoryViewerRouter k;
    public final wvl0 l;
    public final fsl0 m;
    public final xxl0 n;
    public final Object o;
    public final Object p;
    public final Object q;
    public FunctionReferenceImpl r;
    public final io.reactivex.rxjava3.disposables.b s;
    public boolean t;

    public opl0(ViewGroup viewGroup, xsl0 xsl0Var, RecyclerView recyclerView, y4m0 y4m0Var, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, StoryViewerRouter storyViewerRouter, wvl0 wvl0Var, fsl0 fsl0Var, xxl0 xxl0Var) {
        this.e = viewGroup;
        this.f = xsl0Var;
        this.g = recyclerView;
        this.h = y4m0Var;
        this.i = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.j = str;
        this.k = storyViewerRouter;
        this.l = wvl0Var;
        this.m = fsl0Var;
        this.n = xxl0Var;
        y84 y84Var = new y84(28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, y84Var);
        this.p = msy.a(lazyThreadSafetyMode, new gwd0(7));
        this.q = msy.a(lazyThreadSafetyMode, new qkd0(this, 13));
        this.s = new io.reactivex.rxjava3.disposables.b();
        setHasStableIds(true);
    }

    @Override // xsna.j4i0
    public final boolean E(int i) {
        if (((StoriesContainer) j5g.b0(i, y0())) != null) {
            return !r2.Cb();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void K0(gzs<s3q0> gzsVar) {
        if (!((Boolean) this.o.getValue()).booleanValue()) {
            gzsVar.invoke();
            return;
        }
        RecyclerView recyclerView = this.g;
        if (!recyclerView.isComputingLayout()) {
            ViewGroup viewGroup = this.e;
            RecyclerView recyclerView2 = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
            if (recyclerView2 == null || !recyclerView2.isComputingLayout()) {
                gzsVar.invoke();
                return;
            }
        }
        recyclerView.post(new ku5(3, this, gzsVar));
    }

    @Override // xsna.j4i0
    public final boolean W() {
        StoriesContainer storiesContainer = (StoriesContainer) j5g.a0(y0());
        return (storiesContainer == null || !storiesContainer.Rb() || storiesContainer.g.isEmpty()) ? false : true;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return super.getItemCount() + (this.t ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        StoriesContainer storiesContainer = (StoriesContainer) this.c.c(i);
        if (storiesContainer == null) {
            return Long.MIN_VALUE;
        }
        return storiesContainer instanceof LiveFinishedStoriesContainer ? storiesContainer.Ab().b ^ Long.MAX_VALUE : fsk.A(storiesContainer) ? storiesContainer.Ab().b ^ 9223372036854775806L : storiesContainer instanceof PromoStoriesContainer ? storiesContainer.Ab().b ^ 9223372036854775805L : storiesContainer.Ab().b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (this.t && i == 0) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        if (vif0Var.getItemViewType() != 0) {
            return;
        }
        jtl0 jtl0Var = vif0Var instanceof jtl0 ? (jtl0) vif0Var : null;
        if (jtl0Var != null) {
            if (this.t) {
                i--;
            }
            jtl0Var.V5(this.c.c(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        xxl0 xxl0Var = this.n;
        if (i == 1) {
            int i2 = sn0.o;
            return new sn0(this.j, xxl0Var.a(), viewGroup);
        }
        return new jtl0(new l0m0(viewGroup.getContext(), xxl0Var), viewGroup, this, this.h, this.i, this.j, this.k, this.f, this.l, this.m);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        vif0 vif0Var = (vif0) e0Var;
        L.e("STORIES:", "Story container VH recycled");
        super.onViewRecycled(vif0Var);
        if (((Boolean) this.o.getValue()).booleanValue()) {
            this.r = null;
            this.s.e();
            if (vif0Var.getItemViewType() != 0) {
                return;
            }
            jtl0 jtl0Var = vif0Var instanceof jtl0 ? (jtl0) vif0Var : null;
            if (jtl0Var != null) {
                KeyEvent.Callback callback = jtl0Var.itemView;
                y8m0 y8m0Var = callback instanceof y8m0 ? (y8m0) callback : null;
                if (y8m0Var != null) {
                    y8m0Var.a();
                }
            }
        }
    }

    public final String toString() {
        return "StoriesAdapter";
    }
}
