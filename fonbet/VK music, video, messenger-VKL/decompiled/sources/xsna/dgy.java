package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: KeyboardKeyFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class dgy extends AppCompatTextView {
    public final /* synthetic */ com.vk.pin.views.keyboard.b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgy(Context context, com.vk.pin.views.keyboard.b bVar) {
        super(context);
        this.b = bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.b.getActualSize(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
