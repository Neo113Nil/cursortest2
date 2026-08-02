package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ProfileRoundedCardItemDecoration.kt */
/* loaded from: classes3.dex */
public final class kzd0 extends oog0 {
    public final wzs<View, RecyclerView, Boolean> r;

    /* JADX WARN: Multi-variable type inference failed */
    public kzd0(float f, int i, mf7 mf7Var, wzs<? super View, ? super RecyclerView, Boolean> wzsVar) {
        super(f, i, mf7Var);
        this.r = wzsVar;
    }

    @Override // xsna.oog0, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.r.invoke(view, recyclerView).booleanValue()) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
        }
    }

    @Override // xsna.oog0
    public final void m(RecyclerView recyclerView, View view, RectF rectF, Integer num) {
        Rect rect = this.l;
        recyclerView.getDecoratedBoundsWithMargins(view, rect);
        rectF.set(rect);
        if (num != null && num.intValue() == 0) {
            float translationY = view.getTranslationY() + recyclerView.getPaddingTop();
            rectF.left = view.getTranslationX() + rectF.left;
            rectF.right = view.getTranslationX() + rectF.right;
            rectF.top += translationY;
        } else {
            rectF.offset(view.getTranslationX(), view.getTranslationY());
        }
        rect.setEmpty();
    }

    @Override // xsna.oog0
    public final boolean q() {
        return false;
    }
}
