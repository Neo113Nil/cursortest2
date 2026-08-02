package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: SectionsItemDecoration.kt */
/* loaded from: classes2.dex */
public abstract class m2i0 extends RecyclerView.n implements too0 {
    public final Context b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final Rect f;
    public final Rect g;
    public SparseArray<CharSequence> h;
    public final int i;
    public final TextPaint j;
    public final Paint k;
    public final Paint l;

    public m2i0(Context context, boolean z, boolean z2, int i, int i2) {
        i = (i2 & 16) != 0 ? iah0.a(1.0f) : i;
        Rect rect = new Rect(0, 0, 0, 0);
        this.b = context;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = rect;
        float f = 8;
        iah0.a(f);
        float f2 = 16;
        this.g = new Rect(iah0.a(f2), iah0.a(10), iah0.a(f2), iah0.a(f2));
        this.h = new SparseArray<>();
        this.i = iah0.a(f);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(e3m.f(R.attr.vk_legacy_text_subhead, context));
        com.vk.typography.b.j(textPaint, context, FontFamily.MEDIUM, Float.valueOf(16.0f), 8);
        this.j = textPaint;
        Paint paint = new Paint(1);
        paint.setColor(e3m.f(R.attr.vk_legacy_separator_alpha, context));
        this.k = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(e3m.f(R.attr.vk_legacy_background_content, context));
        this.l = paint2;
    }

    @Override // xsna.too0
    public final void Ng() {
        Context context = this.b;
        int f = e3m.f(R.attr.vk_legacy_text_subhead, context);
        TextPaint textPaint = this.j;
        textPaint.setColor(f);
        this.l.setColor(e3m.f(R.attr.vk_legacy_background_content, context));
        this.k.setColor(e3m.f(R.attr.vk_legacy_separator_alpha, context));
        textPaint.setTextSize(e3m.d(R.attr.tabBarTextSize, context));
    }

    public final SparseArray<CharSequence> b() {
        return this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (m(recyclerView, childAdapterPosition)) {
            int textSize = (int) this.j.getTextSize();
            Rect rect2 = this.g;
            rect.top = textSize + rect2.top + rect2.bottom;
        }
        if (n(recyclerView, childAdapterPosition)) {
            rect.bottom = this.i;
        }
    }

    public CharSequence l(int i, RecyclerView recyclerView, boolean z) {
        if (!z) {
            return this.h.get(i);
        }
        int size = this.h.size();
        int i2 = 0;
        while (true) {
            Integer num = null;
            if (i2 >= size) {
                return null;
            }
            int keyAt = this.h.keyAt(i2);
            SparseArray<CharSequence> sparseArray = this.h;
            int i3 = i2 + 1;
            u4q0 u4q0Var = zik0.a;
            if (i3 < sparseArray.size() && i3 >= 0) {
                num = Integer.valueOf(sparseArray.keyAt(i3));
            }
            int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            if (i >= keyAt && i < intValue) {
                return this.h.valueAt(i2);
            }
            i2 = i3;
        }
    }

    public boolean m(RecyclerView recyclerView, int i) {
        return zik0.a(this.h, i);
    }

    public boolean n(RecyclerView recyclerView, int i) {
        if (!this.d) {
            return false;
        }
        HashSet d = zik0.d(this.h);
        if (d.isEmpty()) {
            return false;
        }
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (i == ((Number) it.next()).intValue() - 1) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i;
        float f;
        CharSequence l;
        float f2;
        int i2;
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = recyclerView.getChildAt(i4);
            int i5 = i4 + 1;
            View childAt2 = recyclerView.getChildAt(i5);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            Rect rect = this.g;
            boolean z = this.c;
            if (!((z && i4 == 0) || m(recyclerView, childAdapterPosition)) || (l = l(childAdapterPosition, recyclerView, z)) == null) {
                i = childCount;
                f = 0.0f;
            } else {
                int width = recyclerView.getWidth();
                float f3 = rect.top + rect.bottom;
                TextPaint textPaint = this.j;
                float textSize = textPaint.getTextSize() + f3;
                float f4 = i3;
                float f5 = textSize + f4;
                float textSize2 = textPaint.getTextSize() + rect.top;
                if (m(recyclerView, childAdapterPosition + 1)) {
                    if (childAt2 != null) {
                        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                        Integer valueOf = layoutManager != null ? Integer.valueOf(layoutManager.getDecoratedTop(childAt2)) : null;
                        if (valueOf != null) {
                            i2 = valueOf.intValue();
                            f2 = Math.min(i2 - f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    }
                    i2 = 0;
                    f2 = Math.min(i2 - f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    f2 = 0.0f;
                }
                float top = childAt.getTop() - f5;
                f = 0.0f;
                if (z) {
                    top = Math.max(top, f2);
                }
                i = childCount;
                float top2 = ((childAt.getTop() - rect.bottom) - f4) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z) {
                    top2 = Math.max(top2, textSize2 + f2);
                }
                int b = l8g.b(childAt.getAlpha());
                Paint paint = this.l;
                paint.setAlpha(b);
                textPaint.setAlpha(b);
                Rect rect2 = this.f;
                canvas.drawRect(rect2.left + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, top + rect2.top, width - rect2.right, (top + f5) - rect2.bottom, paint);
                canvas.drawText(l, 0, l.length(), rect.left + recyclerView.getPaddingStart(), top2, textPaint);
            }
            if (n(recyclerView, childAdapterPosition)) {
                float bottom = childAt.getBottom() + f + this.i;
                canvas.drawRect(rect.left + recyclerView.getPaddingStart(), bottom - this.e, (recyclerView.getWidth() - rect.right) - recyclerView.getPaddingEnd(), bottom, this.k);
            }
            i4 = i5;
            childCount = i;
            i3 = 0;
        }
    }
}
