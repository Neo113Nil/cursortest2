package xsna;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ClipsRecyclerViewSnapHelper.kt */
/* loaded from: classes17.dex */
public final class r0f extends androidx.recyclerview.widget.o0 implements e4o0 {
    public final b a;
    public final DecelerateInterpolator b;
    public RecyclerView c;
    public a d;
    public final ArrayList e;
    public final r0f f;

    /* compiled from: ClipsRecyclerViewSnapHelper.kt */
    public static final class a extends androidx.recyclerview.widget.v {
        public final long a;
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ r0f c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, RecyclerView recyclerView, r0f r0fVar) {
            super(context);
            this.b = recyclerView;
            this.c = r0fVar;
            this.a = 50 / context.getResources().getDisplayMetrics().densityDpi;
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
        public final void onTargetFound(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            RecyclerView.o layoutManager = this.b.getLayoutManager();
            if (layoutManager == null) {
                super.onTargetFound(view, a0Var, aVar);
                return;
            }
            r0f r0fVar = this.c;
            int i = r0fVar.calculateDistanceToFinalSnap(layoutManager, view)[1];
            int max = (int) Math.max(r0fVar.a.a, Math.abs(i * this.a));
            if (max > 0) {
                aVar.b(0, i, r0fVar.b, max);
            }
        }
    }

    /* compiled from: ClipsRecyclerViewSnapHelper.kt */
    public static final class b {
        public final long a;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("Config(minSettlingMs="));
        }

        public b(int i) {
            this.a = 250L;
        }
    }

    public r0f() {
        this(0);
    }

    @Override // xsna.e4o0
    public final void a() {
        this.e.clear();
    }

    @Override // androidx.recyclerview.widget.o0
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        Context context;
        super.attachToRecyclerView(recyclerView);
        this.c = recyclerView;
        this.d = (recyclerView == null || (context = recyclerView.getContext()) == null) ? null : new a(context, recyclerView, this);
    }

    @Override // xsna.e4o0
    public final androidx.recyclerview.widget.o0 b() {
        return this.f;
    }

    @Override // xsna.e4o0
    public final void c(izs<? super Integer, s3q0> izsVar) {
        this.e.add(izsVar);
    }

    @Override // androidx.recyclerview.widget.o0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            iArr[1] = (((oVar.getDecoratedBottom(view) - recyclerView.getPaddingBottom()) + (oVar.getDecoratedTop(view) - recyclerView.getPaddingTop())) / 2) - (recyclerView.getHeight() / 2);
            int position = oVar.getPosition(view);
            if (position != -1) {
                int i = iArr[1];
                ArrayList arrayList = this.e;
                if (i != 0 && recyclerView.getScrollState() != 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((izs) it.next()).invoke(Integer.valueOf(position));
                    }
                    s3q0 s3q0Var = s3q0.a;
                    return iArr;
                }
                if (iArr[1] == 0 && recyclerView.getScrollState() == 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((izs) it2.next()).invoke(Integer.valueOf(position));
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o0
    public final RecyclerView.z createScroller(RecyclerView.o oVar) {
        return this.d;
    }

    public final View d(RecyclerView.o oVar, int i) {
        RecyclerView recyclerView;
        int childCount = oVar.getChildCount();
        View view = null;
        if (childCount == 0 || (recyclerView = this.c) == null) {
            return null;
        }
        int height = recyclerView.getHeight() / 2;
        boolean z = i > 0 && recyclerView.canScrollVertically(1);
        boolean z2 = i < 0 && recyclerView.canScrollVertically(-1);
        boolean z3 = (z || z2) ? false : true;
        float f = Float.MAX_VALUE;
        if (!z && z2) {
            f = -3.4028235E38f;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = oVar.getChildAt(i2);
            if (childAt != null) {
                float decoratedBottom = ((oVar.getDecoratedBottom(childAt) + oVar.getDecoratedTop(childAt)) / 2.0f) - height;
                if ((!z || decoratedBottom <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || decoratedBottom >= f) && (!z2 || decoratedBottom >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || decoratedBottom <= f)) {
                    if (z3 && Math.abs(decoratedBottom) < f) {
                        decoratedBottom = Math.abs(decoratedBottom);
                    }
                }
                view = childAt;
                f = decoratedBottom;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.o0
    public final View findSnapView(RecyclerView.o oVar) {
        if (oVar != null) {
            return d(oVar, 0);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o0
    public final int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        View d;
        if (oVar == null || (d = d(oVar, i2)) == null) {
            return 0;
        }
        return oVar.getPosition(d);
    }

    @Override // androidx.recyclerview.widget.o0, androidx.recyclerview.widget.RecyclerView.r
    public final boolean onFling(int i, int i2) {
        View d;
        RecyclerView.o layoutManager;
        RecyclerView recyclerView = this.c;
        RecyclerView.o layoutManager2 = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager2 == null || Math.abs(i2) < recyclerView.getMinFlingVelocity() || (d = d(layoutManager2, i2)) == null) {
            return false;
        }
        int position = layoutManager2.getPosition(d);
        a aVar = this.d;
        if (aVar != null) {
            aVar.setTargetPosition(position);
        }
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 == null || (layoutManager = recyclerView2.getLayoutManager()) == null) {
            return true;
        }
        layoutManager.startSmoothScroll(this.d);
        return true;
    }

    public r0f(int i) {
        b bVar = new b(0);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.a = bVar;
        this.b = decelerateInterpolator;
        this.e = new ArrayList();
        this.f = this;
    }
}
