package xsna;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.newsfeed.entries.Poster;

/* compiled from: PosterNewsfeedView.kt */
/* loaded from: classes4.dex */
public final class jac0 extends ViewGroup {
    public final bac0 b;
    public final a c;

    /* compiled from: PosterNewsfeedView.kt */
    public static final class a extends dbc0 {
        @Override // android.widget.TextView, android.view.View
        public final boolean performLongClick() {
            if (t5m.b()) {
                return true;
            }
            return super.performLongClick();
        }
    }

    public jac0(Context context) {
        super(context);
        bac0 bac0Var = new bac0(getContext());
        this.b = bac0Var;
        a aVar = new a(getContext());
        aVar.setGravity(17);
        aVar.setMovementMethod(LinkMovementMethod.getInstance());
        this.c = aVar;
        addView(bac0Var);
        addView(aVar);
    }

    public final float getParallaxTranslationX() {
        return this.b.getParallaxTranslationX();
    }

    public final float getParallaxTranslationY() {
        return this.b.getParallaxTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(i, i2, i3, i4);
        a aVar = this.c;
        int measuredHeight = ((i4 - i2) - aVar.getMeasuredHeight()) / 2;
        aVar.layout(i, measuredHeight, i3, aVar.getMeasuredHeight() + measuredHeight);
        aVar.b.a(i3 - i);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = (int) ((size * 1.0f) / 1.3333334f);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        setMeasuredDimension(size, i3);
    }

    public final void setConstants(Poster.Constants constants) {
        this.c.setConstants(constants);
    }

    public final void setPlainTextClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void setText(String str) {
        a aVar = this.c;
        aVar.setText(str);
        aVar.b.a(0);
    }

    public final void setTextColor(int i) {
        this.c.setTextColor(i);
    }
}
