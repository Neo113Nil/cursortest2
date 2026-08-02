package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: RoundedCardItemDecoration.kt */
/* loaded from: classes3.dex */
public class oog0 extends RecyclerView.n implements too0 {
    public final float b;
    public final int c;
    public final mf7 d;
    public Bitmap h;
    public final Paint q;
    public final int e = R.attr.vk_ui_background;
    public final RectF f = new RectF();
    public final boolean[] g = new boolean[2];
    public final Rect i = new Rect();
    public final Rect j = new Rect();
    public final RectF k = new RectF();
    public final Rect l = new Rect();
    public final ArrayList<View> m = new ArrayList<>();
    public boolean n = true;
    public boolean o = true;
    public final tb2 p = new tb2(1);

    public oog0(float f, int i, mf7 mf7Var) {
        this.b = f;
        this.c = i;
        this.d = mf7Var;
        Paint paint = new Paint(1);
        this.q = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(krv0.l(R.attr.vk_ui_background));
        this.h = l();
    }

    public static boolean n(int i, int i2) {
        return (i & i2) == i2;
    }

    @Override // xsna.too0
    public final void Ng() {
        this.q.setColor(krv0.l(this.e));
        this.h = l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return;
        }
        int itemCount = adapter.getItemCount();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition < 0 || childAdapterPosition >= itemCount) {
            return;
        }
        int e0 = this.d.e0(childAdapterPosition);
        if (n(e0, 128)) {
            return;
        }
        if (e0 == 0 || n(e0, 4)) {
            rect.bottom = this.c;
        }
    }

    public final Bitmap l() {
        int i = (int) ((2 * this.b) + 0.5f);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        float f = i;
        path.addOval(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, Path.Direction.CW);
        canvas.drawPath(path, this.q);
        createBitmap.prepareToDraw();
        return createBitmap;
    }

    public void m(RecyclerView recyclerView, View view, RectF rectF, Integer num) {
        Rect rect = this.l;
        recyclerView.getDecoratedBoundsWithMargins(view, rect);
        rectF.set(rect);
        rectF.offset(view.getTranslationX(), view.getTranslationY());
        rect.setEmpty();
    }

    public void o(Canvas canvas, RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
        int childAdapterPosition;
        View view = (View) j5g.k0(this.m);
        if (view == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != adapter.getItemCount() - 1) {
            return;
        }
        RectF rectF = this.k;
        m(recyclerView, view, rectF, null);
        if (n(this.d.e0(childAdapterPosition), 4)) {
            rectF.bottom -= this.c;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = (int) rectF.bottom;
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int bottom = recyclerView.getBottom();
        Rect rect = this.l;
        rect.set(paddingLeft, i, width, bottom);
        rectF.set(rect);
        canvas.drawRect(rectF, this.q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return;
        }
        int itemCount = adapter.getItemCount();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) >= 0 && childAdapterPosition < itemCount && this.d.e0(childAdapterPosition) == 0) {
                Integer valueOf = Integer.valueOf(childAdapterPosition);
                RectF rectF = this.k;
                m(recyclerView, childAt, rectF, valueOf);
                canvas.drawRect(rectF, this.q);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        boolean z;
        Paint paint;
        RectF rectF;
        int i;
        int i2;
        boolean z2;
        Canvas canvas2;
        boolean z3;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return;
        }
        int itemCount = adapter.getItemCount();
        int childCount = recyclerView.getChildCount();
        RectF rectF2 = this.f;
        rectF2.setEmpty();
        boolean[] zArr = this.g;
        jw5.s(zArr);
        ArrayList<View> arrayList = this.m;
        arrayList.clear();
        int i3 = 0;
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            z = true;
            if (i5 >= childCount) {
                break;
            }
            View childAt = recyclerView.getChildAt(i5);
            if (childAt != null) {
                arrayList.add(childAt);
                z4 = z4;
                if (i4 > childAt.getTop()) {
                    z4 = true;
                }
                i4 = childAt.getTop();
            }
            i5++;
            z4 = z4;
        }
        if (z4) {
            g5g.L(arrayList, this.p);
        }
        float f = Float.NaN;
        int size = arrayList.size() - 1;
        while (true) {
            paint = this.q;
            rectF = this.k;
            if (-1 >= size) {
                break;
            }
            View view = arrayList.get(size);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition >= 0 && childAdapterPosition < itemCount) {
                m(recyclerView, view, rectF, null);
                int e0 = this.d.e0(childAdapterPosition);
                boolean n = n(e0, 2);
                boolean n2 = n(e0, 4);
                if (Float.isNaN(f)) {
                    f = rectF.bottom;
                }
                int i6 = this.c;
                if (n2) {
                    rectF.bottom -= i6;
                }
                if (rectF2.isEmpty()) {
                    rectF2.set(rectF);
                } else {
                    rectF2.union(rectF);
                }
                if (n) {
                    zArr[i3] = z;
                }
                if (n2) {
                    zArr[z ? 1 : 0] = z;
                }
                float f2 = f;
                if (n2) {
                    i2 = i3;
                    z2 = e0;
                    canvas2 = canvas;
                    canvas2.drawRect(rectF2.left, Math.min(rectF2.bottom, f2 - i6), rectF2.right, f2, paint);
                } else {
                    i2 = i3;
                    z2 = e0;
                    canvas2 = canvas;
                }
                if (z2 == 0 || z2 == z || n || size == 0) {
                    rectF2.bottom = Math.min(rectF2.bottom, f2 - i6);
                    boolean z5 = zArr[i2];
                    boolean z6 = zArr[z ? 1 : 0];
                    if (z5 || z6) {
                        int width = this.h.getWidth() / 2;
                        int width2 = (int) (rectF2.width() + 0.5f);
                        int height = (int) (rectF2.height() + 0.5f);
                        Rect rect = this.i;
                        int i7 = i2;
                        rect.set(i7, i7, width, width);
                        Rect rect2 = this.j;
                        rect2.set(rect);
                        int i8 = 0;
                        while (i8 < 4) {
                            boolean z7 = i8 % 2 == 0;
                            boolean z8 = i8 / 2 == 0;
                            if ((!z8 || z5) && (z8 || z6)) {
                                z3 = z6;
                                rect.offsetTo(z7 ? 0 : this.h.getWidth() - width, z8 ? 0 : this.h.getHeight() - width);
                                rect2.offsetTo(z7 ? 0 : width2 - width, z8 ? 0 : height - width);
                                rect2.offset((int) rectF2.left, (int) rectF2.top);
                                canvas2.drawBitmap(this.h, rect, rect2, (Paint) null);
                            } else {
                                z3 = z6;
                            }
                            i8++;
                            z6 = z3;
                        }
                    }
                    f = rectF2.top;
                    rectF2.setEmpty();
                    jw5.s(zArr);
                } else {
                    f = f2;
                }
            }
            size--;
            i3 = 0;
            z = true;
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (adapter2 == null || adapter2.getItemCount() == 0) {
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        Rect rect3 = this.l;
        if (paddingLeft > 0) {
            i = 0;
            rect3.set(0, 0, paddingLeft, recyclerView.getHeight());
            rectF.set(rect3);
            canvas.drawRect(rectF, paint);
        } else {
            i = 0;
        }
        int paddingRight = recyclerView.getPaddingRight();
        if (paddingRight > 0) {
            rect3.set(recyclerView.getWidth() - paddingRight, i, recyclerView.getWidth(), recyclerView.getHeight());
            rectF.set(rect3);
            canvas.drawRect(rectF, paint);
        }
        if (q() && recyclerView.getPaddingTop() > 0 && !arrayList.isEmpty()) {
            View view2 = (View) j5g.Y(arrayList);
            int childAdapterPosition2 = recyclerView.getChildAdapterPosition(view2);
            m(recyclerView, view2, rectF, null);
            if (childAdapterPosition2 == 0 && rectF.top > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                rect3.set(recyclerView.getPaddingLeft(), 0, recyclerView.getWidth() - recyclerView.getPaddingRight(), (int) rectF.top);
                rectF.set(rect3);
                canvas.drawRect(rectF, paint);
            }
        }
        if (p()) {
            o(canvas, recyclerView, adapter2);
        }
    }

    public boolean p() {
        return this.o;
    }

    public boolean q() {
        return this.n;
    }
}
