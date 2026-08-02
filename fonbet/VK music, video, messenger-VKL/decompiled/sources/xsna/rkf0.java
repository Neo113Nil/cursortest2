package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.LinkedHashSet;

/* compiled from: RecyclerViewVisibilityTracker.kt */
/* loaded from: classes6.dex */
public final class rkf0 extends RecyclerView.t {
    public final izs<String, s3q0> d;
    public long g;
    public final float b = 0.7f;
    public final long c = 300;
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();

    public rkf0(izs izsVar) {
        this.d = izsVar;
    }

    public static float l(RecyclerView recyclerView, View view) {
        if (!view.isShown()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        recyclerView.getGlobalVisibleRect(rect);
        view.getGlobalVisibleRect(rect2);
        if (!rect.intersect(rect2)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int height = rect2.height() * rect2.width();
        int height2 = view.getHeight() * view.getWidth();
        return height2 > 0 ? height / height2 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[LOOP:0: B:11:0x0025->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(RecyclerView recyclerView) {
        View findViewByPosition;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (linearLayoutManager == null || adapter == null) {
            return;
        }
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        if (v == -1 || x == -1 || v > x) {
            return;
        }
        while (true) {
            WebApiApplication webApiApplication = adapter instanceof fdf0 ? (WebApiApplication) ((fdf0) adapter).c.c(v) : null;
            float f = this.b;
            if (webApiApplication != null) {
                String str = webApiApplication.w;
                LinkedHashSet linkedHashSet = this.e;
                if (!j5g.P(linkedHashSet, str)) {
                    View findViewByPosition2 = linearLayoutManager.findViewByPosition(v);
                    if (findViewByPosition2 != null && l(recyclerView, findViewByPosition2) >= f && str != null) {
                        linkedHashSet.add(str);
                        izs<String, s3q0> izsVar = this.d;
                        if (izsVar != null) {
                            izsVar.invoke(str);
                        }
                    }
                    if (v != x) {
                        return;
                    } else {
                        v++;
                    }
                }
            }
            Integer valueOf = Integer.valueOf(v);
            LinkedHashSet linkedHashSet2 = this.f;
            if (!linkedHashSet2.contains(valueOf) && (findViewByPosition = linearLayoutManager.findViewByPosition(v)) != null && l(recyclerView, findViewByPosition) >= f) {
                linkedHashSet2.add(Integer.valueOf(v));
            }
            if (v != x) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            m(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (System.currentTimeMillis() - this.g < this.c) {
            return;
        }
        m(recyclerView);
        this.g = System.currentTimeMillis();
    }
}
