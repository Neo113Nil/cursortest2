package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: KeyboardKeyFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class fgy extends AppCompatImageView {
    public final /* synthetic */ com.vk.pin.views.keyboard.b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgy(Context context, com.vk.pin.views.keyboard.b bVar) {
        super(context);
        this.b = bVar;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.b.getActualSize(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
