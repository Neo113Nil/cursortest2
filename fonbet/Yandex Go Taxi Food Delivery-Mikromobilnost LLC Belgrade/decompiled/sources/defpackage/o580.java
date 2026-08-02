package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.FlexStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.flex.common.FlexibleGridVersion;
import com.yandex.go.flex.screens.common.flexible.layout.manager.FlexibleGridLayoutManager;
import com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.VerticalStaggeredGridLayoutManager;
import com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features.TrackingFeedClientFeaturesExperiment;
import core.flex.ui.OrientationAwareRecyclerView;

/* loaded from: classes12.dex */
public final class o580 implements bki0 {
    public final Context a;
    public final xu70 b;
    public final a c;
    public final ipq d;

    public o580(Context context, xu70 xu70Var, a aVar, ipq ipqVar) {
        this.a = context;
        this.b = xu70Var;
        this.c = aVar;
        this.d = ipqVar;
    }

    @Override // defpackage.bki0
    public final void a(OrientationAwareRecyclerView orientationAwareRecyclerView) {
        RecyclerView.e verticalStaggeredGridLayoutManager;
        FlexibleGridVersion flexibleGridVersion = null;
        orientationAwareRecyclerView.setItemAnimator(null);
        orientationAwareRecyclerView.setClipToPadding(false);
        ((jpq) this.d).getClass();
        orientationAwareRecyclerView.addOnScrollListener(new kpq(this.c));
        xu70 xu70Var = this.b;
        if (xu70Var.a.a().d) {
            RecyclerView.Adapter adapter = orientationAwareRecyclerView.getAdapter();
            TrackingFeedClientFeaturesExperiment a = xu70Var.a.a();
            if (a.d) {
                pnr pnrVar = FlexibleGridVersion.Companion;
                String str = a.e;
                pnrVar.getClass();
                flexibleGridVersion = pnr.a(str);
            }
            if (!(adapter instanceof cfx) || flexibleGridVersion == null) {
                return;
            }
            amt0 amt0Var = new amt0((cfx) adapter);
            int i = n580.a[flexibleGridVersion.ordinal()];
            if (i == 1) {
                verticalStaggeredGridLayoutManager = new VerticalStaggeredGridLayoutManager(amt0Var);
                verticalStaggeredGridLayoutManager.A = true;
            } else if (i == 2) {
                FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = new FlexStaggeredGridLayoutManager(amt0Var, false);
                flexStaggeredGridLayoutManager.W1();
                flexStaggeredGridLayoutManager.A = true;
                verticalStaggeredGridLayoutManager = flexStaggeredGridLayoutManager;
            } else if (i != 3) {
                w511.b();
                return;
            } else {
                verticalStaggeredGridLayoutManager = new FlexibleGridLayoutManager(amt0Var.e, new jln(20, amt0Var), this.a);
            }
            orientationAwareRecyclerView.setLayoutManager(verticalStaggeredGridLayoutManager);
        }
    }
}
