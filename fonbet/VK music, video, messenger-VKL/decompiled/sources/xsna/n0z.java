package xsna;

import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommunityProfileScrollViewDelegate.kt */
/* loaded from: classes5.dex */
public final class n0z extends qth {
    @Override // xsna.qth
    public final boolean a() {
        return true;
    }

    @Override // xsna.qth
    public final Float c(CommunityProfileViewState.Data.c cVar, int i) {
        View view;
        View view2;
        boolean z = cVar instanceof CommunityProfileViewState.Data.c.b;
        final float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            CommunityProfileViewState.Data.c.b bVar = (CommunityProfileViewState.Data.c.b) cVar;
            RecyclerView.e0 findViewHolderForAdapterPosition = this.a.findViewHolderForAdapterPosition(0);
            float a = iah0.a(64);
            float floatValue = ((Number) swe0.k(Float.valueOf(a - (-((findViewHolderForAdapterPosition == null || (view2 = findViewHolderForAdapterPosition.itemView) == null) ? -((int) a) : view2.getTop()))), new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a))).floatValue();
            if (!bVar.a.d) {
                f = 1 - (floatValue / a);
            }
        } else if (cVar instanceof CommunityProfileViewState.Data.c.AbstractC1625c) {
            RecyclerView recyclerView = this.a;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            int v = linearLayoutManager != null ? linearLayoutManager.v() : 1;
            RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager2 == null) {
                v = 0;
            } else {
                while (v > 0 && linearLayoutManager2.findViewByPosition(v - 1) != null) {
                    v--;
                }
            }
            boolean z2 = v == 0;
            RecyclerView.e0 findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(0);
            float paddingTop = recyclerView.getPaddingTop();
            float top = paddingTop - ((findViewHolderForAdapterPosition2 == null || (view = findViewHolderForAdapterPosition2.itemView) == null) ? -((int) paddingTop) : view.getTop());
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paddingTop);
            float floatValue2 = ((Number) swe0.k(Float.valueOf(top), new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, max))).floatValue();
            if (z2) {
                if (!(max == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    f = floatValue2 / max;
                    if (max > top && z2 && i != 0) {
                        final float f2 = max - top;
                        Handler handler = this.g;
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(new Runnable() { // from class: xsna.oth
                            @Override // java.lang.Runnable
                            public final void run() {
                                RecyclerView recyclerView2 = qth.this.a;
                                if (recyclerView2.getScrollState() == 0) {
                                    float f3 = f;
                                    float f4 = f2;
                                    if (f3 > 0.5f) {
                                        recyclerView2.smoothScrollBy(0, (int) f4, new LinearInterpolator());
                                    } else {
                                        recyclerView2.smoothScrollBy(0, -((int) f4), new LinearInterpolator());
                                    }
                                }
                            }
                        }, 50L);
                    }
                }
            }
            f = 1.0f;
            if (max > top) {
                final float f22 = max - top;
                Handler handler2 = this.g;
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(new Runnable() { // from class: xsna.oth
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView recyclerView2 = qth.this.a;
                        if (recyclerView2.getScrollState() == 0) {
                            float f3 = f;
                            float f4 = f22;
                            if (f3 > 0.5f) {
                                recyclerView2.smoothScrollBy(0, (int) f4, new LinearInterpolator());
                            } else {
                                recyclerView2.smoothScrollBy(0, -((int) f4), new LinearInterpolator());
                            }
                        }
                    }
                }, 50L);
            }
        } else if (!(cVar instanceof CommunityProfileViewState.Data.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Float.valueOf(f);
    }
}
