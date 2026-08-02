package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import xsna.arl0;

/* compiled from: StoryGarlandDecorator.kt */
/* loaded from: classes6.dex */
public final class h3m0 extends RecyclerView.n {
    public final ViewGroup b;
    public final int c;
    public final fm2 d;
    public final fm2 e;
    public final fm2 f;
    public final fm2 g;
    public final fm2 h;
    public final fm2 i;
    public final fm2 j;
    public final fm2 k;
    public final fm2 l;
    public final fm2 m;
    public final boolean n;
    public final int o;
    public final int p;
    public final int q;
    public boolean r;
    public final io.reactivex.rxjava3.subjects.f<Boolean> s;
    public final io.reactivex.rxjava3.disposables.c t;
    public final g3m0 u;

    public h3m0(ViewGroup viewGroup, int i, Activity activity, arl0.a aVar) {
        this.b = viewGroup;
        this.c = i;
        this.d = fm2.a(R.drawable.g_0_anim_my, viewGroup.getContext());
        this.e = fm2.a(R.drawable.g_0_anim, viewGroup.getContext());
        this.f = fm2.a(R.drawable.g_1_anim, viewGroup.getContext());
        this.g = fm2.a(R.drawable.g_2_anim, viewGroup.getContext());
        this.h = fm2.a(R.drawable.g_3_anim, viewGroup.getContext());
        this.i = fm2.a(R.drawable.g_4_anim, viewGroup.getContext());
        this.j = fm2.a(R.drawable.g_1_anim_no_pip, viewGroup.getContext());
        this.k = fm2.a(R.drawable.g_2_anim_no_pip, viewGroup.getContext());
        this.l = fm2.a(R.drawable.g_3_anim_no_pip, viewGroup.getContext());
        this.m = fm2.a(R.drawable.g_4_anim_no_pip, viewGroup.getContext());
        Context context = viewGroup.getContext();
        HashSet hashSet = iah0.a;
        fnj.b(context);
        this.n = gz80.a(26);
        this.o = (int) t1u0.b(2, viewGroup.getContext());
        this.p = (int) t1u0.b(-4, viewGroup.getContext());
        this.q = viewGroup.getPaddingStart();
        io.reactivex.rxjava3.subjects.f<Boolean> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.s = fVar;
        io.reactivex.rxjava3.disposables.c subscribe = fVar.y(300L, TimeUnit.MILLISECONDS).subscribe(new a960(new qzl0(aVar, 1), 19));
        itg0.a(activity, subscribe);
        this.t = subscribe;
        this.u = new g3m0(this);
    }

    public final void l(fm2 fm2Var, Rect rect, Canvas canvas) {
        if (fm2Var != null) {
            fm2Var.setBounds(rect);
        }
        if (this.r) {
            if (fm2Var != null) {
                fm2Var.b(this.u);
            }
            if (fm2Var != null) {
                fm2Var.start();
            }
        }
        if (fm2Var != null) {
            fm2Var.draw(canvas);
        }
    }

    public final fm2 m(int i, boolean z) {
        int i2 = i % 4;
        return !z ? i2 != 1 ? i2 != 2 ? i2 != 3 ? this.f : this.i : this.h : this.g : i2 != 1 ? i2 != 2 ? i2 != 3 ? this.j : this.m : this.l : this.k;
    }

    public final Rect n(int i, int i2, View view, fm2 fm2Var) {
        int left = view.getLeft();
        int i3 = this.q;
        int i4 = left - i3;
        if (i != 0 || i4 > 0) {
            i4 = view.getLeft();
        }
        int i5 = i == 0 ? this.p : this.o;
        int intrinsicWidth = (fm2Var != null ? fm2Var.getIntrinsicWidth() : 0) + i4;
        if (i == i2 - 1) {
            intrinsicWidth += i3 / 2;
        }
        return new Rect(i4, i5, intrinsicWidth, (fm2Var != null ? fm2Var.getIntrinsicHeight() : 0) + i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.b.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            return;
        }
        if (recyclerView.getChildCount() * this.c <= canvas.getWidth() - (this.q * 2)) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        j4i0 j4i0Var = (j4i0) recyclerView.getAdapter();
        if (j4i0Var.W()) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            int itemCount2 = adapter2 != null ? adapter2.getItemCount() : 0;
            View childAt = recyclerView.getChildAt(0);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            int i = childAdapterPosition - 1;
            boolean E = j4i0Var.E(i);
            if (childAdapterPosition == 0) {
                i = 0;
            }
            fm2 m = childAdapterPosition == 0 ? this.d : m(i, E);
            l(m, new Rect(n(childAdapterPosition, itemCount2, childAt, m)), canvas);
            int childCount = recyclerView.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                i2++;
                View childAt2 = recyclerView.getChildAt(i2);
                int childAdapterPosition2 = recyclerView.getChildAdapterPosition(childAt2);
                if (childAdapterPosition2 < 0) {
                    this.r = false;
                    return;
                } else {
                    int i3 = childAdapterPosition2 - 1;
                    fm2 m2 = m(i3, j4i0Var.E(i3));
                    l(m2, n(childAdapterPosition2, itemCount2, childAt2, m2), canvas);
                }
            }
            return;
        }
        int i4 = 0;
        while (true) {
            if (!(i4 < recyclerView.getChildCount())) {
                this.r = false;
                super.onDraw(canvas, recyclerView, a0Var);
                return;
            }
            int i5 = i4 + 1;
            View childAt3 = recyclerView.getChildAt(i4);
            if (childAt3 == null) {
                throw new IndexOutOfBoundsException();
            }
            int childAdapterPosition3 = recyclerView.getChildAdapterPosition(childAt3);
            if (childAdapterPosition3 < 0) {
                return;
            }
            fm2 m3 = childAdapterPosition3 == 0 ? this.e : m(childAdapterPosition3 - 1, j4i0Var.E(childAdapterPosition3));
            l(m3, n(childAdapterPosition3, itemCount, childAt3, m3), canvas);
            i4 = i5;
        }
    }
}
