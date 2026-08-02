package xsna;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class n2z0 extends androidx.recyclerview.widget.w {
    public androidx.recyclerview.widget.e0 e;
    public androidx.recyclerview.widget.d0 f;
    public RecyclerView g;
    public int d = 17;
    public final DecelerateInterpolator c = new DecelerateInterpolator(1.7f);

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a extends androidx.recyclerview.widget.v {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 60.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.v
        public final int calculateTimeForDeceleration(int i) {
            return (int) Math.ceil(calculateTimeForScrolling(i) / 0.3d);
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.z
        public final void onTargetFound(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            n2z0 n2z0Var = n2z0.this;
            RecyclerView recyclerView = n2z0Var.g;
            if (recyclerView == null || recyclerView.getLayoutManager() == null) {
                return;
            }
            int[] calculateDistanceToFinalSnap = n2z0Var.calculateDistanceToFinalSnap(n2z0Var.g.getLayoutManager(), view);
            int i = calculateDistanceToFinalSnap[0];
            int i2 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                aVar.b(i, i2, n2z0Var.c, calculateTimeForDeceleration);
            }
        }
    }

    @Override // androidx.recyclerview.widget.o0
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            this.g = recyclerView;
        } else {
            this.g = null;
        }
        try {
            super.attachToRecyclerView(recyclerView);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.o0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
        int i = this.d;
        if (i == 17) {
            return super.calculateDistanceToFinalSnap(oVar, view);
        }
        int[] iArr = new int[2];
        if (!(oVar instanceof LinearLayoutManager)) {
            return iArr;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
        if (i != 8388611) {
            androidx.recyclerview.widget.f0 horizontalHelper = getHorizontalHelper(linearLayoutManager);
            int b = horizontalHelper.b(view);
            RecyclerView.o oVar2 = ((androidx.recyclerview.widget.d0) horizontalHelper).a;
            iArr[0] = b >= oVar2.getWidth() - ((oVar2.getWidth() - horizontalHelper.g()) / 2) ? horizontalHelper.b(view) - oVar2.getWidth() : b - horizontalHelper.g();
            return iArr;
        }
        androidx.recyclerview.widget.f0 horizontalHelper2 = getHorizontalHelper(linearLayoutManager);
        int e = horizontalHelper2.e(view);
        RecyclerView.o oVar3 = ((androidx.recyclerview.widget.d0) horizontalHelper2).a;
        if (e >= oVar3.getPaddingLeft() / 2) {
            e -= oVar3.getPaddingLeft();
        }
        iArr[0] = e;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o0
    public final RecyclerView.z createScroller(RecyclerView.o oVar) {
        RecyclerView recyclerView;
        if (!(oVar instanceof RecyclerView.z.b) || (recyclerView = this.g) == null) {
            return null;
        }
        return new a(recyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.o0
    public final View findSnapView(RecyclerView.o oVar) {
        return i(oVar, true);
    }

    public final androidx.recyclerview.widget.f0 getHorizontalHelper(RecyclerView.o oVar) {
        androidx.recyclerview.widget.d0 d0Var = this.f;
        if (d0Var == null || d0Var.a != oVar) {
            this.f = new androidx.recyclerview.widget.d0(oVar);
        }
        return this.f;
    }

    public final View h(RecyclerView.o oVar, androidx.recyclerview.widget.f0 f0Var, int i, boolean z) {
        boolean z2;
        View view = null;
        if (oVar.getChildCount() != 0 && (oVar instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
            if (!z || (((z2 = linearLayoutManager.f) || this.d != 8388611) && ((!z2 || this.d != 8388613) && ((z2 || this.d != 48) && (!z2 || this.d != 80))) ? this.d != 17 ? linearLayoutManager.s() != 0 : linearLayoutManager.s() != 0 && linearLayoutManager.w() != linearLayoutManager.getItemCount() - 1 : linearLayoutManager.w() != linearLayoutManager.getItemCount() - 1)) {
                int l = oVar.getClipToPadding() ? (f0Var.l() / 2) + f0Var.k() : f0Var.f() / 2;
                boolean z3 = i == 8388611;
                int i2 = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < linearLayoutManager.getChildCount(); i3++) {
                    View childAt = linearLayoutManager.getChildAt(i3);
                    int abs = z3 ? Math.abs(f0Var.e(childAt)) : Math.abs(((f0Var.c(childAt) / 2) + f0Var.e(childAt)) - l);
                    if (abs < i2) {
                        view = childAt;
                        i2 = abs;
                    }
                }
            }
        }
        return view;
    }

    public final View i(RecyclerView.o oVar, boolean z) {
        int i = this.d;
        if (i == 17) {
            return h(oVar, getHorizontalHelper(oVar), 17, z);
        }
        if (i == 48) {
            androidx.recyclerview.widget.e0 e0Var = this.e;
            if (e0Var == null || e0Var.a != oVar) {
                this.e = new androidx.recyclerview.widget.e0(oVar);
            }
            return h(oVar, this.e, 8388611, z);
        }
        if (i != 80) {
            if (i == 8388611) {
                return h(oVar, getHorizontalHelper(oVar), 8388611, z);
            }
            if (i != 8388613) {
                return null;
            }
            return h(oVar, getHorizontalHelper(oVar), 8388613, z);
        }
        androidx.recyclerview.widget.e0 e0Var2 = this.e;
        if (e0Var2 == null || e0Var2.a != oVar) {
            this.e = new androidx.recyclerview.widget.e0(oVar);
        }
        return h(oVar, this.e, 8388613, z);
    }

    public final void j(int i) {
        RecyclerView.o layoutManager;
        View i2;
        if (this.d != i) {
            this.d = i;
            RecyclerView recyclerView = this.g;
            if (recyclerView == null || recyclerView.getLayoutManager() == null || (i2 = i((layoutManager = this.g.getLayoutManager()), false)) == null) {
                return;
            }
            int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, i2);
            this.g.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
        }
    }
}
