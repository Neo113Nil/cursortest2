package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.ybsdk.widgets.common.BlendingGradientView;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final class b7c extends RecyclerView.d {
    public final Drawable a;
    public final int b;
    public final int c;
    public final int w;

    public b7c(Drawable drawable, int i, int i2, int i3) {
        this.a = drawable;
        this.b = i;
        this.c = i2;
        this.w = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Integer valueOf = Integer.valueOf(childAdapterPosition);
        if (childAdapterPosition == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            boolean z = recyclerView.getLayoutDirection() == 1;
            ((MaterialCardView) view).setCardBackgroundColor(lhc.f(bb1.o(sng0.pay_sdk_primaryBlockColor, view), BlendingGradientView.BASE_ALPHA));
            if (itemCount != 1) {
                int i = this.b;
                if (itemCount == 2) {
                    if (intValue < itemCount - 1) {
                        if (z) {
                            rect.left = i;
                            return;
                        } else {
                            rect.right = i;
                            return;
                        }
                    }
                    return;
                }
                if (intValue == 0) {
                    rect.left = i;
                    rect.right = i;
                }
                if (z) {
                    rect.left = i;
                } else {
                    rect.right = i;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        Pair pair;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1) {
                int i3 = itemCount - 1;
                if (childAdapterPosition < i3) {
                    int height = childAt.getHeight();
                    Drawable drawable = this.a;
                    int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
                    int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
                    int i4 = this.b;
                    if (z) {
                        int left = childAt.getLeft() - ((i4 - intrinsicWidth) / 2);
                        pair = new Pair(Integer.valueOf(left - intrinsicWidth), Integer.valueOf(left));
                    } else {
                        int c = x4e.c(i4, intrinsicWidth, 2, childAt.getRight());
                        pair = new Pair(Integer.valueOf(c), Integer.valueOf(intrinsicWidth + c));
                    }
                    int intValue = ((Number) pair.getFirst()).intValue();
                    int intValue2 = ((Number) pair.getSecond()).intValue();
                    int top = ((height / 2) + childAt.getTop()) - (intrinsicHeight / 2);
                    int i5 = intrinsicHeight + top;
                    if (drawable != null) {
                        drawable.setBounds(new Rect(intValue, top, intValue2, i5));
                    }
                    if (drawable != null) {
                        drawable.draw(canvas);
                        if (itemCount > 1) {
                            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable((childAdapterPosition != 0 || itemCount <= 1) ? (childAdapterPosition != i3 || itemCount <= 1) ? f(true, true) : f(!z, z) : f(z, !z));
                            materialShapeDrawable.setTint(lhc.f(bb1.o(sng0.pay_sdk_primaryBlockColor, childAt), BlendingGradientView.BASE_ALPHA));
                            materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
                            childAt.setBackground(materialShapeDrawable);
                        }
                    }
                }
                if (itemCount > 1) {
                }
            }
            i = i2;
        }
    }

    public final b f(boolean z, boolean z2) {
        b.a m = new b().m();
        if (z) {
            m.l = new a7c(this);
        }
        if (z2) {
            m.j = new a7c(this);
        }
        m.d(this.w);
        return m.a();
    }
}
