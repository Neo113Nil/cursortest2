package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.feed.model.FeedItem.n;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.nlh0;

/* compiled from: VideoItemViewHolder.kt */
/* loaded from: classes17.dex */
public abstract class tqs0<Item extends FeedItem.n> extends vfz<Item> implements ent0, z8e {
    public final int l;
    public final zof m;
    public final twc<Item> n;
    public Item o;

    public tqs0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tqs0(Context context, h3d h3dVar, pih0 pih0Var, int i, kxc kxcVar, gxp0 gxp0Var, zof zofVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter) {
        super(r10);
        twc<Item> twcVar = new twc<>(context, kxcVar, gxp0Var, h3dVar, pih0Var, clipsScreenPerformanceReporter, zofVar);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(twcVar);
        this.l = i;
        this.m = zofVar;
        this.n = twcVar;
    }

    @Override // xsna.z8e
    public final List<View> N0() {
        List<View> N0;
        z8e transitionViewsProvider = this.n.getTransitionViewsProvider();
        return (transitionViewsProvider == null || (N0 = transitionViewsProvider.N0()) == null) ? EmptyList.b : N0;
    }

    @Override // xsna.vfz
    public final void V5() {
        nlh0 W;
        Item item = this.o;
        if (item == null || (W = item.W()) == null) {
            return;
        }
        W.b(i6());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(hfz hfzVar) {
        FeedItem.n nVar = (FeedItem.n) hfzVar;
        twc<Item> twcVar = this.n;
        njt hierarchy = twcVar.getCover().getHierarchy();
        yg5 autoPlay = twcVar.getAutoPlay();
        hierarchy.n((autoPlay == null || !autoPlay.J()) ? null : twcVar.M);
        h6(nVar, EmptyList.b);
    }

    @Override // xsna.vfz
    public final void a6() {
        nlh0 W;
        Item item = this.o;
        if (item == null || (W = item.W()) == null) {
            return;
        }
        W.a(i6());
    }

    public final void h6(Item item, List<? extends olh0> list) {
        nlh0 W;
        Item item2 = this.o;
        if (item2 != null && (W = item2.W()) != null) {
            W.a(i6());
        }
        item.W().b(i6());
        twc<Item> twcVar = this.n;
        int i = this.l;
        if (i > 0) {
            f4m.q(i, twcVar.G.f);
        }
        twcVar.setAdapterPosition(getAbsoluteAdapterPosition());
        twcVar.P4(item, list);
        this.o = item;
    }

    public abstract nlh0.a i6();

    @Override // xsna.z8e
    public final List<View> q1() {
        List<View> q1;
        z8e transitionViewsProvider = this.n.getTransitionViewsProvider();
        return (transitionViewsProvider == null || (q1 = transitionViewsProvider.q1()) == null) ? EmptyList.b : q1;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.n;
    }

    @Override // xsna.z8e
    public final List<View> w2() {
        List<View> w2;
        z8e transitionViewsProvider = this.n.getTransitionViewsProvider();
        return (transitionViewsProvider == null || (w2 = transitionViewsProvider.w2()) == null) ? EmptyList.b : w2;
    }
}
