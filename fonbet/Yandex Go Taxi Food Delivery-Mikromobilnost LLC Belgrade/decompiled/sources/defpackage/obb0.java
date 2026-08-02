package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.PfmScrollDirectionPfm;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import com.ybsdk.feature.pfm.internal.ui.interactors.PfmAnalyticsInteractor$Companion$SourceType;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class obb0 extends RecyclerView.g {
    public final /* synthetic */ PfmFragment a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ RecyclerView d;

    public obb0(PfmFragment pfmFragment, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        this.a = pfmFragment;
        this.b = recyclerView;
        this.c = recyclerView2;
        this.d = recyclerView3;
    }

    public final PfmAnalyticsInteractor$Companion$SourceType a(RecyclerView recyclerView) {
        if (recyclerView.equals(this.b)) {
            return PfmAnalyticsInteractor$Companion$SourceType.FILTERS;
        }
        if (recyclerView.equals(this.c) || recyclerView.equals(this.d)) {
            return PfmAnalyticsInteractor$Companion$SourceType.CATEGORIES;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        PfmAnalyticsInteractor$Companion$SourceType a = a(recyclerView);
        if (a == null) {
            return;
        }
        xv10 xv10Var = PfmFragment.access$getViewModel(this.a).K;
        xv10Var.getClass();
        if (i == 1) {
            int i2 = o8b0.a[a.ordinal()];
            if (i2 == 1) {
                xv10Var.c = null;
            } else if (i2 == 2) {
                xv10Var.w = null;
            } else {
                w511.b();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        PfmScrollDirectionPfm pfmScrollDirectionPfm;
        PfmAnalyticsInteractor$Companion$SourceType a = a(recyclerView);
        if (a == null) {
            return;
        }
        xv10 xv10Var = PfmFragment.access$getViewModel(this.a).K;
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) xv10Var.a;
        if (i > 0) {
            pfmScrollDirectionPfm = PfmScrollDirectionPfm.RIGHT;
        } else if (i >= 0) {
            return;
        } else {
            pfmScrollDirectionPfm = PfmScrollDirectionPfm.LEFT;
        }
        int i3 = o8b0.a[a.ordinal()];
        if (i3 == 1) {
            if (((PfmScrollDirectionPfm) xv10Var.c) == pfmScrollDirectionPfm) {
                return;
            }
            xv10Var.c = pfmScrollDirectionPfm;
            l0p l0pVar = appAnalyticsReporter.R;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("direction", pfmScrollDirectionPfm.getOriginalValue());
            l0pVar.a.a("pfm.analytics.filter.scroll", linkedHashMap);
            return;
        }
        if (i3 != 2) {
            w511.b();
            return;
        }
        if (((PfmScrollDirectionPfm) xv10Var.w) == pfmScrollDirectionPfm) {
            return;
        }
        xv10Var.w = pfmScrollDirectionPfm;
        l0p l0pVar2 = appAnalyticsReporter.R;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put("direction", pfmScrollDirectionPfm.getOriginalValue());
        l0pVar2.a.a("pfm.analytics.category.scroll", linkedHashMap2);
    }
}
