package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: PhotosRootPhotoDecorator.kt */
/* loaded from: classes4.dex */
public final class dga0 extends RecyclerView.n implements too0 {
    public final int b;
    public final a c;
    public xso0 d = l();
    public final RectF e = new RectF();
    public final Rect f = new Rect();
    public final a6t g = new a6t((uzt0) null, 3);

    public dga0(int i, a aVar) {
        this.b = i;
        this.c = aVar;
    }

    public static xso0 l() {
        return new xso0(12.0f * cn70.a(), 2.0f * cn70.a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, krv0.l(R.attr.vk_ui_background_content), 0, 24);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.d = l();
    }

    public final boolean m(int i, int i2) {
        int i3 = this.b;
        int i4 = i2 % i3;
        if (i4 != 0) {
            i3 = i4;
        }
        return i2 - i3 <= i && i < i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        a aVar = this.c;
        int c = aVar.c(a0Var);
        RectF rectF = this.e;
        rectF.setEmpty();
        int i = 0;
        while (i < recyclerView.getChildCount()) {
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            int b2 = aVar.b(childAdapterPosition);
            if (aVar.a(childAdapterPosition, a0Var)) {
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
                int i3 = this.b;
                uzt0Var.a = b2 % i3 == 0 && b2 >= 0 && b2 < i3;
                uzt0Var.b = b2 % i3 == i3 + (-1) && b2 >= 0 && b2 < i3;
                uzt0Var.c = b2 % i3 == i3 + (-1) && m(b2, c);
                uzt0Var.d = b2 % i3 == 0 && m(b2, c);
                boolean z = b2 % i3 == 0 && (b2 < 0 || b2 >= i3) && !m(b2, c);
                boolean z2 = b2 % i3 == i3 + (-1) && (b2 < 0 || b2 >= i3) && !m(b2, c);
                bvj bvjVar = a6tVar.b;
                uzt0 uzt0Var2 = a6tVar.a;
                boolean z3 = z || (uzt0Var2.d && !uzt0Var2.a);
                boolean z4 = z2 || (uzt0Var2.c && !uzt0Var2.b);
                boolean z5 = z2 || (uzt0Var2.b && !uzt0Var2.c);
                boolean z6 = z || (uzt0Var2.a && !uzt0Var2.d) || (uzt0Var2.d && c % i3 != 0);
                bvjVar.a = !z3;
                bvjVar.b = !z4;
                bvjVar.c = !z5;
                bvjVar.d = !z6;
                this.d.b(canvas, rectF, a6tVar);
            }
            i = i2;
        }
    }

    /* compiled from: PhotosRootPhotoDecorator.kt */
    public interface a {
        boolean a(int i, RecyclerView.a0 a0Var);

        default int c(RecyclerView.a0 a0Var) {
            return a0Var.b();
        }

        default int b(int i) {
            return i;
        }
    }

    /* compiled from: PhotosRootPhotoDecorator.kt */
    public static final class b implements a {
        @Override // xsna.dga0.a
        public final boolean a(int i, RecyclerView.a0 a0Var) {
            return true;
        }

        @Override // xsna.dga0.a
        public final int c(RecyclerView.a0 a0Var) {
            return a0Var.b();
        }

        @Override // xsna.dga0.a
        public final int b(int i) {
            return i;
        }
    }
}
