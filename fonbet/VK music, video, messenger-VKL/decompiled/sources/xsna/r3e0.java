package xsna;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.ProgressView;
import com.vk.dto.attaches.Attach;

/* compiled from: ProgressVc.kt */
/* loaded from: classes2.dex */
public final class r3e0 {
    public static final SparseBooleanArray e = new SparseBooleanArray();
    public static final SparseBooleanArray f = new SparseBooleanArray();
    public static final SparseIntArray g = new SparseIntArray();
    public static final SparseIntArray h = new SparseIntArray();
    public final ProgressView a;
    public View b;
    public final View.OnClickListener c;
    public Attach d;

    public r3e0(ProgressView progressView, ImageView imageView, View.OnClickListener onClickListener) {
        this.a = progressView;
        this.b = imageView;
        this.c = onClickListener;
        jjc.f(onClickListener, progressView);
    }

    public final void a(Attach attach) {
        this.d = attach;
        View view = this.b;
        if (view != null) {
            d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        }
        ProgressView progressView = this.a;
        d3m.b(progressView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        progressView.setOnVisibleProgressUpdateListener(new uf20(attach, 7));
        int i = g.get(attach.xb(), 0);
        int i2 = h.get(attach.xb(), 0);
        if (e.get(attach.xb(), false)) {
            progressView.setVisibility(0);
            progressView.a(i2, i, 1000);
            progressView.setProgressMax(1000);
            progressView.setProgressMin(2);
            long j = ProgressView.E;
            long j2 = ProgressView.D;
            d3m.e(this.a, (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            View view2 = this.b;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            View view3 = this.b;
            if (view3 != null) {
                d3m.c(view3, (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        if (f.get(attach.xb(), false)) {
            progressView.setVisibility(0);
            progressView.a(i2, i, 0);
            progressView.setProgressMax(1000);
            progressView.setProgressMin(0);
            long j3 = ProgressView.E;
            long j4 = ProgressView.D;
            d3m.e(this.a, (r15 & 1) != 0 ? 300L : j3, (r15 & 2) != 0 ? 0L : j4, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            View view4 = this.b;
            if (view4 != null) {
                view4.setVisibility(4);
            }
            View view5 = this.b;
            if (view5 != null) {
                d3m.c(view5, (r15 & 1) != 0 ? 300L : j3, (r15 & 2) != 0 ? 0L : j4, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        if (!attach.h0()) {
            progressView.setVisibility(8);
            View view6 = this.b;
            if (view6 != null) {
                view6.setVisibility(0);
                return;
            }
            return;
        }
        progressView.setVisibility(0);
        progressView.a(i2, i, 0);
        progressView.setProgressMax(1000);
        progressView.setProgressMin((int) (progressView.getProgressMax() * 0.02f));
        View view7 = this.b;
        if (view7 != null) {
            view7.setVisibility(4);
        }
    }

    public final void b(final int i) {
        Attach attach;
        Attach attach2 = this.d;
        if (attach2 == null || attach2.xb() != i || (attach = this.d) == null || !attach.h0()) {
            return;
        }
        int i2 = g.get(i, 0);
        int i3 = h.get(i, 0);
        f.put(i, true);
        ProgressView progressView = this.a;
        progressView.setVisibility(0);
        progressView.a(i3, i2, 0);
        long j = ProgressView.E;
        long j2 = ProgressView.D;
        d3m.e(this.a, (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        View view = this.b;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.b;
        if (view2 != null) {
            d3m.c(view2, (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        i0q0.d(j2 + j, new Runnable() { // from class: xsna.p3e0
            @Override // java.lang.Runnable
            public final void run() {
                r3e0.f.put(i, false);
            }
        });
    }

    public final void c(final int i) {
        Attach attach = this.d;
        if (attach == null || attach.xb() != i) {
            return;
        }
        int i2 = g.get(i, 0);
        int i3 = h.get(i, 0);
        e.put(i, true);
        ProgressView progressView = this.a;
        progressView.setVisibility(0);
        progressView.a(i3, i2, 1000);
        long j = ProgressView.E;
        long j2 = ProgressView.D;
        d3m.e(this.a, (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        View view = this.b;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.b;
        if (view2 != null) {
            d3m.c(view2, (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        i0q0.d(j2 + j, new Runnable() { // from class: xsna.q3e0
            @Override // java.lang.Runnable
            public final void run() {
                r3e0.e.put(i, false);
            }
        });
    }

    public final void d(int i, int i2, int i3) {
        Attach attach;
        ProgressView progressView = this.a;
        if (progressView.getProgressMax() != i3) {
            progressView.setProgressMax(i3);
            progressView.setProgressMin((int) (progressView.getProgressMax() * 0.02f));
        }
        Attach attach2 = this.d;
        if (attach2 == null || attach2.xb() != i || (attach = this.d) == null || !attach.h0()) {
            return;
        }
        int i4 = g.get(i, 0);
        int i5 = h.get(i, 0);
        progressView.setVisibility(0);
        progressView.a(i5, i4, i2);
        progressView.setProgressMax(i3);
        d3m.b(progressView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        View view = this.b;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.b;
        if (view2 != null) {
            d3m.b(view2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        }
    }

    public final void e() {
        View view = this.b;
        if (view != null) {
            d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        }
        d3m.b(this.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }
}
