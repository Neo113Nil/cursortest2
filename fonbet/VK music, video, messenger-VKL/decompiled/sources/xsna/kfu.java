package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: GridCornersRoundingDecorator.kt */
/* loaded from: classes17.dex */
public final class kfu extends RecyclerView.n {
    public final int b;
    public final int c;
    public final xso0 d;
    public final RectF e = new RectF();
    public final Rect f = new Rect();
    public final a6t g = new a6t((uzt0) null, 3);

    public kfu(float f, int i, int i2, Context context) {
        this.b = i;
        this.c = i2;
        this.d = new xso0(cn70.a() * f, cn70.a() * 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dm10.b(R.attr.vk_ui_background_content, 0, context), 0, 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r5 < r14) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean z;
        int b = a0Var.b();
        int i = this.c;
        int i2 = b - i;
        RectF rectF = this.e;
        rectF.setEmpty();
        int i3 = 0;
        while (i3 < recyclerView.getChildCount()) {
            int i4 = i3 + 1;
            View childAt = recyclerView.getChildAt(i3);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt) - i;
            if (childAdapterPosition >= 0) {
                int left = childAt.getLeft();
                int top = childAt.getTop();
                int right = childAt.getRight();
                int bottom = childAt.getBottom();
                Rect rect = this.f;
                rect.set(left, top, right, bottom);
                rectF.set(rect);
                rect.setEmpty();
                a6t a6tVar = this.g;
                uzt0 uzt0Var = a6tVar.a;
                int i5 = this.b;
                boolean z2 = true;
                uzt0Var.a = childAdapterPosition % i5 == 0 && childAdapterPosition >= 0 && childAdapterPosition < i5;
                uzt0Var.b = childAdapterPosition % i5 == i5 + (-1) && childAdapterPosition >= 0 && childAdapterPosition < i5;
                if (childAdapterPosition % i5 == i5 - 1) {
                    int i6 = i2 % i5;
                    if (i6 == 0) {
                        i6 = i5;
                    }
                    if (i2 - i6 <= childAdapterPosition && childAdapterPosition < i2) {
                        z = true;
                        uzt0Var.c = z;
                        if (childAdapterPosition % i5 == 0) {
                            int i7 = i2 % i5;
                            if (i7 != 0) {
                                i5 = i7;
                            }
                            if (i2 - i5 <= childAdapterPosition) {
                            }
                        }
                        z2 = false;
                        uzt0Var.d = z2;
                        this.d.b(canvas, rectF, a6tVar);
                    }
                }
                z = false;
                uzt0Var.c = z;
                if (childAdapterPosition % i5 == 0) {
                }
                z2 = false;
                uzt0Var.d = z2;
                this.d.b(canvas, rectF, a6tVar);
            }
            i3 = i4;
        }
    }
}
