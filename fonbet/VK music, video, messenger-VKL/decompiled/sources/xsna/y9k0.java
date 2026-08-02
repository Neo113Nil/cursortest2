package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SnapRecyclerView.kt */
/* loaded from: classes16.dex */
public class y9k0 extends RecyclerView {
    public final androidx.recyclerview.widget.w b;
    public b c;
    public final DecelerateInterpolator d;
    public izs<? super Integer, s3q0> e;
    public d f;

    /* compiled from: SnapRecyclerView.kt */
    public final class a extends LinearLayoutManager {

        /* compiled from: SnapRecyclerView.kt */
        /* renamed from: xsna.y9k0$a$a, reason: collision with other inner class name */
        public static final class C4086a extends androidx.recyclerview.widget.v {
            @Override // androidx.recyclerview.widget.v
            public final int calculateTimeForScrolling(int i) {
                return 150;
            }
        }

        public a(Context context) {
            super(0, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final int getPaddingLeft() {
            View childAt = getChildAt(0);
            if (childAt == null) {
                return 0;
            }
            Object parent = childAt.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                return 0;
            }
            return (view.getMeasuredWidth() - childAt.getMeasuredWidth()) / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final int getPaddingRight() {
            return getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
            super.onLayoutCompleted(a0Var);
            y9k0.a(y9k0.this);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
            C4086a c4086a = new C4086a(recyclerView.getContext());
            c4086a.setTargetPosition(i);
            startSmoothScroll(c4086a);
        }
    }

    /* compiled from: SnapRecyclerView.kt */
    public final class b extends RecyclerView.t {
        public final androidx.recyclerview.widget.o0 b;
        public int c = -1;

        public b(androidx.recyclerview.widget.w wVar) {
            this.b = wVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View findSnapView;
            y9k0 y9k0Var = y9k0.this;
            if (i != 0) {
                d snapStateScrollListener = y9k0Var.getSnapStateScrollListener();
                if (snapStateScrollListener != null) {
                    snapStateScrollListener.b();
                    return;
                }
                return;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            int i2 = -1;
            if (layoutManager != null && (findSnapView = this.b.findSnapView(layoutManager)) != null) {
                i2 = layoutManager.getPosition(findSnapView);
            }
            if (i2 != this.c) {
                this.c = i2;
                izs<Integer, s3q0> snapPositionListener = y9k0Var.getSnapPositionListener();
                if (snapPositionListener != null) {
                    snapPositionListener.invoke(Integer.valueOf(this.c));
                }
            }
            d snapStateScrollListener2 = y9k0Var.getSnapStateScrollListener();
            if (snapStateScrollListener2 != null) {
                snapStateScrollListener2.a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            y9k0.a(y9k0.this);
        }
    }

    /* compiled from: SnapRecyclerView.kt */
    public interface c {
        void C4(float f);
    }

    /* compiled from: SnapRecyclerView.kt */
    public interface d {
        void a();

        void b();
    }

    public y9k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void a(y9k0 y9k0Var) {
        RecyclerView.o layoutManager = y9k0Var.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        float measuredWidth = y9k0Var.getMeasuredWidth() / 2.0f;
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                float f = swe0.f(1.0f - (Math.abs(measuredWidth - ((childAt.getMeasuredWidth() / 2.0f) + childAt.getLeft())) / childAt.getMeasuredWidth()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                Object childViewHolder = y9k0Var.getChildViewHolder(childAt);
                if (childViewHolder instanceof c) {
                    ((c) childViewHolder).C4(f);
                }
            }
        }
    }

    public final DecelerateInterpolator getInterpolator() {
        return this.d;
    }

    public final izs<Integer, s3q0> getSnapPositionListener() {
        return this.e;
    }

    public final d getSnapStateScrollListener() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = new b(this.b);
        addOnScrollListener(bVar);
        this.c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.c;
        if (bVar != null) {
            removeOnScrollListener(bVar);
        }
        this.c = null;
    }

    public final void setSnapPositionListener(izs<? super Integer, s3q0> izsVar) {
        this.e = izsVar;
    }

    public final void setSnapStateScrollListener(d dVar) {
        this.f = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollBy(int i, int i2) {
        super.smoothScrollBy(i, i2, this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollToPosition(int i) {
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            layoutManager.smoothScrollToPosition(this, null, i);
        }
    }

    public y9k0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w();
        this.b = wVar;
        this.d = new DecelerateInterpolator();
        wVar.attachToRecyclerView(this);
        setLayoutManager(new a(getContext()));
    }
}
