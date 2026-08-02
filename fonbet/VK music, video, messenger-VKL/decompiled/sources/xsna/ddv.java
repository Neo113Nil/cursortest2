package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.themes.VKTheme;
import xsna.dhr0;

/* compiled from: HorizontalDividerDecoration.kt */
/* loaded from: classes17.dex */
public final class ddv<Item> extends RecyclerView.n implements dhr0.e {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final b<Item> h;
    public final a<Item> i;
    public final Paint j;
    public final Rect k;

    /* compiled from: HorizontalDividerDecoration.kt */
    public interface a<Item> {
        boolean a(Item item, Item item2);
    }

    /* compiled from: HorizontalDividerDecoration.kt */
    public interface b<Item> {
        Item a(int i);
    }

    public ddv(int i, int i2, int i3, int i4, int i5, int i6, b<Item> bVar, a<Item> aVar) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = bVar;
        this.i = aVar;
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(i));
        paint.setAntiAlias(false);
        paint.setDither(false);
        this.j = paint;
        this.k = new Rect();
        dhr0.f(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        b<Item> bVar = this.h;
        Item a2 = bVar.a(childAdapterPosition);
        Item a3 = bVar.a(childAdapterPosition + 1);
        if (a2 == null || a3 == null || !this.i.a(a2, a3)) {
            return;
        }
        rect.set(0, 0, 0, this.c + this.e + this.g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            b<Item> bVar = this.h;
            Item a2 = bVar.a(childAdapterPosition);
            Item a3 = bVar.a(childAdapterPosition + 1);
            if (a2 != null && a3 != null && this.i.a(a2, a3)) {
                int left = recyclerView.getLeft() + this.d;
                Rect rect = this.k;
                rect.left = left;
                rect.top = (int) (childAt.getTranslationY() + childAt.getBottom() + this.e);
                rect.right = recyclerView.getRight() - this.f;
                rect.bottom = rect.top + this.c;
                canvas.drawRect(rect, this.j);
            }
        }
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        this.j.setColor(dhr0.t.c(this.b));
    }
}
