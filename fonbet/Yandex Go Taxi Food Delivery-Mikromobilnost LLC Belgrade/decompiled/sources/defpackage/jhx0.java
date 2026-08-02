package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes6.dex */
public final class jhx0 extends RecyclerView.d {
    public final int a;
    public final int b;
    public final int c;
    public final int w;
    public final Drawable x;
    public final boolean z;
    public final Rect y = new Rect();
    public int A = -1;
    public int B = -1;

    public jhx0(Context context, int i, int i2, int i3, int i4, Drawable drawable) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = i4;
        this.x = drawable;
        this.z = xw31.n(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r4 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        r9 = r9 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r2 != false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        elx0 item;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.A;
        int i2 = this.b;
        int i3 = this.a;
        int i4 = (i == -1 || i != childAdapterPosition) ? i3 : i2;
        int i5 = this.B;
        if (i5 == -1 || i5 != childAdapterPosition) {
            i2 = i3;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != 0) {
            int itemCount = adapter.getItemCount();
            int i6 = 0;
            boolean z = childAdapterPosition == 0;
            boolean z2 = childAdapterPosition == itemCount - 1;
            if ((z || z2) && (item = ((glx0) adapter).getItem(childAdapterPosition)) != null) {
                int i7 = item.u ? this.w : this.c;
                if (this.z) {
                    i2 += z2 ? i7 : 0;
                } else {
                    i2 += z ? i7 : 0;
                }
            }
        }
        rect.set(i2, rect.top, i4, rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i;
        int i2;
        Drawable drawable = this.x;
        if (drawable == null || (i = this.A) == -1 || (i2 = this.B) == -1) {
            return;
        }
        boolean z = this.z;
        if (z) {
            i = i2;
        }
        x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        x0 findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(z ? this.A : this.B);
        if (findViewHolderForAdapterPosition == null && findViewHolderForAdapterPosition2 == null) {
            return;
        }
        if (findViewHolderForAdapterPosition == null) {
            findViewHolderForAdapterPosition = findViewHolderForAdapterPosition2;
        }
        if (findViewHolderForAdapterPosition2 == null) {
            findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition;
        }
        if (findViewHolderForAdapterPosition == null) {
            ny61.g("Required value was null.");
            return;
        }
        View view = findViewHolderForAdapterPosition.a;
        if (findViewHolderForAdapterPosition2 == null) {
            ny61.g("Required value was null.");
            return;
        }
        View view2 = findViewHolderForAdapterPosition2.a;
        Rect rect = this.y;
        recyclerView.getDecoratedBoundsWithMargins(view, rect);
        int translationX = rect.left + ((int) view.getTranslationX());
        int i3 = this.a;
        int i4 = rect.top;
        recyclerView.getDecoratedBoundsWithMargins(view2, rect);
        drawable.setBounds(translationX + i3, i4, (rect.right + ((int) view2.getTranslationX())) - i3, rect.bottom);
        drawable.draw(canvas);
    }

    public final void f(int i, int i2) {
        if (i > i2) {
            this.A = i2;
            this.B = i;
        } else {
            this.A = i;
            this.B = i2;
        }
    }
}
