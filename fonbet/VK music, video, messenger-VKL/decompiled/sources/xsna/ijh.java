package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: CommunityProfileContentItemsDecoration.kt */
/* loaded from: classes5.dex */
public final class ijh extends RecyclerView.n {
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final long g;
    public final xso0 h;
    public final RectF i;
    public final Rect j;
    public final a6t k;

    /* compiled from: CommunityProfileContentItemsDecoration.kt */
    @vby
    public static final class a {
        public static final int a(long j) {
            return an10.b(Float.intBitsToFloat((int) (j & 4294967295L)) / 2);
        }
    }

    public ijh(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = (i6 & 8) != 0 ? 0 : i4;
        boolean z = (i6 & 16) != 0;
        int i9 = (i6 & 32) != 0 ? i2 : i5;
        this.b = i;
        this.c = i3;
        this.d = i8;
        this.e = z;
        this.f = i9;
        int i10 = i2 % 2;
        if (i10 == 0) {
            i7 = i2;
        } else {
            int i11 = 2 - i10;
            i7 = i11 > i10 ? i2 - i10 : i2 + i11;
        }
        this.g = gqr.a(i2, i7);
        this.h = new xso0(iah0.b(2.0f), iah0.b(2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, krv0.l(R.attr.vk_ui_background_content), 0, 24);
        this.i = new RectF();
        this.j = new Rect();
        this.k = new a6t(new uzt0(true, true, true, true), 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view) - this.d;
        if (childAdapterPosition >= 0) {
            int i = this.b;
            if (i != 1) {
                long j = this.g;
                if (i == 2 && childAdapterPosition % i == 0) {
                    rect.right = a.a(j);
                } else if (i == 2 && childAdapterPosition % i == i - 1) {
                    rect.left = a.a(j);
                } else {
                    int i2 = childAdapterPosition % i;
                    if (i2 == 0) {
                        rect.right = an10.b((Float.intBitsToFloat((int) (j >> 32)) * 2) / 3);
                    } else if (i2 == i - 1) {
                        rect.left = an10.b((Float.intBitsToFloat((int) (j >> 32)) * 2) / 3);
                    } else {
                        rect.left = i2 == 1 ? an10.b(Float.intBitsToFloat((int) (j >> 32)) / 3) : a.a(j);
                        rect.right = i2 == i + (-2) ? an10.b(Float.intBitsToFloat((int) (j >> 32)) / 3) : a.a(j);
                    }
                }
            }
            if (childAdapterPosition >= i) {
                rect.top = this.f;
            } else {
                rect.top = this.c;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (!this.e) {
            return;
        }
        RectF rectF = this.i;
        rectF.setEmpty();
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (recyclerView.getChildAdapterPosition(childAt) - this.d >= 0) {
                int left = childAt.getLeft();
                int top = childAt.getTop();
                int right = childAt.getRight();
                int bottom = childAt.getBottom();
                Rect rect = this.j;
                rect.set(left, top, right, bottom);
                rectF.set(rect);
                rect.setEmpty();
                this.h.b(canvas, rectF, this.k);
            }
            i = i2;
        }
    }
}
