package xsna;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;

/* compiled from: VideoSnapHelper.kt */
/* loaded from: classes3.dex */
public final class oht0 extends androidx.recyclerview.widget.o0 {
    public final Interpolator a;
    public final int b;
    public final int c;
    public final wzs<Integer, View, s3q0> d;
    public final boolean e;
    public final float f;
    public final a g;
    public RecyclerView h;
    public androidx.recyclerview.widget.e0 i;
    public androidx.recyclerview.widget.d0 j;
    public boolean k;
    public int l;
    public int m;
    public float n;
    public final float o;
    public b p;

    /* compiled from: VideoSnapHelper.kt */
    public static final class b extends androidx.recyclerview.widget.v {
        public final /* synthetic */ RecyclerView.o b;
        public final /* synthetic */ RecyclerView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView.o oVar, RecyclerView recyclerView, Context context) {
            super(context);
            this.b = oVar;
            this.c = recyclerView;
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
        public final void onTargetFound(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            RecyclerView.o oVar = this.b;
            oht0 oht0Var = oht0.this;
            int[] calculateDistanceToFinalSnap = oht0Var.calculateDistanceToFinalSnap(oVar, view);
            int i = calculateDistanceToFinalSnap[0];
            int i2 = calculateDistanceToFinalSnap[1];
            int abs = (int) Math.abs((i > 0 ? i : i2) * oht0Var.n);
            int i3 = oht0Var.b;
            if (abs < i3 || abs > (i3 = oht0Var.c)) {
                abs = i3;
            }
            aVar.b(i, oht0Var.g.a(i2), (oht0Var.e && oht0Var.m == 0 && getTargetPosition() == 1) ? new OvershootInterpolator(2.0f) : oht0Var.a, abs);
            wzs<Integer, View, s3q0> wzsVar = oht0Var.d;
            RecyclerView.o layoutManager = this.c.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            wzsVar.invoke(Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.getPosition(view) : -1), view);
        }
    }

    public oht0(DecelerateInterpolator decelerateInterpolator, wzs wzsVar, a aVar, int i) {
        Interpolator overshootInterpolator = (i & 1) != 0 ? new OvershootInterpolator(1.0f) : decelerateInterpolator;
        int i2 = (i & 2) != 0 ? 650 : 150;
        int i3 = (i & 4) != 0 ? 900 : 450;
        wzsVar = (i & 8) != 0 ? new ug4((byte) 0, 7) : wzsVar;
        boolean z = (i & 16) == 0;
        aVar = (i & 64) != 0 ? new a() : aVar;
        this.a = overshootInterpolator;
        this.b = i2;
        this.c = i3;
        this.d = wzsVar;
        this.e = z;
        this.f = 2.0f;
        this.g = aVar;
        this.o = 100.0f;
    }

    @Override // androidx.recyclerview.widget.o0
    public final void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView.o layoutManager;
        super.attachToRecyclerView(recyclerView);
        this.h = recyclerView;
        if (recyclerView != null) {
            this.n = this.o / recyclerView.getContext().getResources().getDisplayMetrics().densityDpi;
            new Scroller(recyclerView.getContext(), this.a);
        }
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        this.p = new b(layoutManager, recyclerView, recyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.o0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            boolean z = this.e;
            iArr[0] = z ? d(oVar, view) : oVar.getDecoratedLeft(view) - recyclerView.getPaddingLeft();
            iArr[1] = z ? d(oVar, view) : oVar.getDecoratedTop(view) - recyclerView.getPaddingTop();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o0
    public final RecyclerView.z createScroller(RecyclerView.o oVar) {
        return this.p;
    }

    public final int d(RecyclerView.o oVar, View view) {
        androidx.recyclerview.widget.f0 orientationHelper = getOrientationHelper(oVar);
        if (orientationHelper == null) {
            return 0;
        }
        int measuredWidth = (view.getMeasuredWidth() / 2) + view.getLeft();
        int l = (orientationHelper.l() / 2) + orientationHelper.k();
        if (this.e && oVar.getPosition(view) == 1) {
            Context context = view.getContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                int right = view.getRight() - (orientationHelper.l() / 2);
                return right > 0 ? -right : right;
            }
        }
        return measuredWidth - l;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View e(RecyclerView.o oVar, int i, int i2) {
        float f;
        View view;
        float f2;
        float f3;
        float x;
        View view2;
        androidx.recyclerview.widget.f0 orientationHelper;
        int i3 = i;
        int childCount = oVar.getChildCount();
        if (childCount == 0) {
            return null;
        }
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        int i4 = 0;
        while (true) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i4 >= childCount) {
                break;
            }
            View childAt = oVar.getChildAt(i4);
            if ((childAt != null ? childAt.getHeight() : 0) < f5) {
                f5 = childAt != null ? childAt.getHeight() : 0.0f;
            }
            if ((childAt != null ? childAt.getWidth() : 0) < f4) {
                f4 = childAt != null ? childAt.getWidth() : 0.0f;
            }
            i4++;
        }
        if (this.e) {
            this.k = i3 != 0;
            RecyclerView recyclerView = this.h;
            if (recyclerView == null || (orientationHelper = getOrientationHelper(oVar)) == null) {
                view2 = null;
            } else {
                boolean z = recyclerView.canScrollHorizontally(-1) || recyclerView.canScrollHorizontally(1);
                if (!z) {
                    i3 = i2;
                }
                if (!z) {
                    f4 = f5;
                }
                if (i3 > 0) {
                    f = f4;
                } else if (i3 < 0) {
                    f = -f4;
                }
                int i5 = ((int) f) / 3;
                if (!recyclerView.canScrollHorizontally(-1)) {
                    view2 = oVar.findViewByPosition(0);
                } else if (!recyclerView.canScrollHorizontally(1)) {
                    view2 = oVar.findViewByPosition(oVar.getItemCount() - 1);
                } else if (this.l != 0 || oVar.findViewByPosition(0) == null) {
                    int childCount2 = oVar.getChildCount();
                    float f6 = Float.MAX_VALUE;
                    view = null;
                    for (int i6 = 0; i6 < childCount2; i6++) {
                        View childAt2 = oVar.getChildAt(i6);
                        if (childAt2 != null) {
                            float abs = Math.abs((((orientationHelper.c(childAt2) / 2) + orientationHelper.e(childAt2)) - i5) - (orientationHelper.l() / 2));
                            if (abs < f6) {
                                view = childAt2;
                                f6 = abs;
                            }
                        }
                    }
                } else {
                    view2 = oVar.findViewByPosition(1);
                }
            }
            if (view2 != null) {
                return null;
            }
            int i7 = this.m;
            int i8 = this.l;
            if (i7 != i8) {
                this.m = i8;
            }
            this.l = oVar.getPosition(view2);
            return view2;
        }
        int childCount3 = oVar.getChildCount();
        float f7 = Float.MAX_VALUE;
        view = null;
        for (int i9 = 0; i9 < childCount3; i9++) {
            View childAt3 = oVar.getChildAt(i9);
            RecyclerView recyclerView2 = this.h;
            if (recyclerView2 != null) {
                boolean canScrollHorizontally = recyclerView2.canScrollHorizontally(-1);
                float f8 = this.f;
                if (canScrollHorizontally || recyclerView2.canScrollHorizontally(1)) {
                    f3 = i3;
                    float f9 = f4 / f8;
                    if (f3 > f9) {
                        f3 = f9;
                    }
                    if (childAt3 != null) {
                        x = childAt3.getX();
                        f2 = x - f3;
                    }
                    x = 0.0f;
                    f2 = x - f3;
                } else {
                    f3 = i2;
                    float f10 = f5 / f8;
                    if (f3 > f10) {
                        f3 = f10;
                    }
                    if (childAt3 != null) {
                        x = childAt3.getY();
                        f2 = x - f3;
                    }
                    x = 0.0f;
                    f2 = x - f3;
                }
            } else {
                f2 = 0.0f;
            }
            float abs2 = Math.abs(f2);
            if (abs2 < f7) {
                f7 = abs2;
                view = childAt3;
            }
        }
        view2 = view;
        if (view2 != null) {
        }
    }

    @Override // androidx.recyclerview.widget.o0
    public final View findSnapView(RecyclerView.o oVar) {
        if (oVar == null) {
            return null;
        }
        if (!this.k) {
            return e(oVar, 0, 0);
        }
        this.k = false;
        return null;
    }

    @Override // androidx.recyclerview.widget.o0
    public final int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        return 0;
    }

    public final androidx.recyclerview.widget.f0 getOrientationHelper(RecyclerView.o oVar) {
        androidx.recyclerview.widget.f0 f0Var;
        if (oVar.canScrollVertically()) {
            androidx.recyclerview.widget.e0 e0Var = this.i;
            if (e0Var != null) {
                f0Var = e0Var.a == oVar ? e0Var : null;
                if (f0Var != null) {
                    return f0Var;
                }
            }
            androidx.recyclerview.widget.e0 e0Var2 = new androidx.recyclerview.widget.e0(oVar);
            this.i = e0Var2;
            return e0Var2;
        }
        if (!oVar.canScrollHorizontally()) {
            return null;
        }
        androidx.recyclerview.widget.d0 d0Var = this.j;
        if (d0Var != null) {
            f0Var = d0Var.a == oVar ? d0Var : null;
            if (f0Var != null) {
                return f0Var;
            }
        }
        androidx.recyclerview.widget.d0 d0Var2 = new androidx.recyclerview.widget.d0(oVar);
        this.j = d0Var2;
        return d0Var2;
    }

    @Override // androidx.recyclerview.widget.o0, androidx.recyclerview.widget.RecyclerView.r
    public final boolean onFling(int i, int i2) {
        RecyclerView.o layoutManager;
        View e;
        RecyclerView.o layoutManager2;
        RecyclerView recyclerView = this.h;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (e = e(layoutManager, i, i2)) == null) {
            return true;
        }
        int position = layoutManager.getPosition(e);
        b bVar = this.p;
        if (bVar != null) {
            bVar.setTargetPosition(position);
        }
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == null || (layoutManager2 = recyclerView2.getLayoutManager()) == null) {
            return true;
        }
        layoutManager2.startSmoothScroll(this.p);
        return true;
    }

    /* compiled from: VideoSnapHelper.kt */
    public static class a {
        public int a(int i) {
            return i;
        }
    }
}
