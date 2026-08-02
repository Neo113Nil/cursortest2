package xsna;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: CommunityLiveCoverDialog.kt */
/* loaded from: classes5.dex */
public final class e8h extends View implements too0 {
    public final /* synthetic */ f8h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8h(f8h f8hVar, Activity activity) {
        super(activity);
        this.b = f8hVar;
    }

    @Override // xsna.too0
    public final void Ng() {
        f8h f8hVar = this.b;
        f8hVar.x.setColor(f8hVar.w.a());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPaint(this.b.x);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(this.b.u, 1073741824));
    }
}
