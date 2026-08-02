package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.y9c0;

/* compiled from: PosterTextView.kt */
/* loaded from: classes15.dex */
public final class ebc0 extends AppCompatTextView {
    public final zac0 b;

    public ebc0(Context context) {
        super(context, null, 0);
        this.b = new zac0(this);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.a(i3 - i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = cac0.e;
        setMeasuredDimension(size, (int) ((size * 1.0f) / 1.3333334f));
    }

    public final void setConstants(y9c0.a aVar) {
        this.b.c = aVar;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.b.d = i;
    }
}
