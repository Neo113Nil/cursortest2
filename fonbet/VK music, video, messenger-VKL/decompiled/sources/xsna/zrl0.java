package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.vk.photo.editor.markup.view.DrawingView;

/* compiled from: StoriesDrawingView.kt */
/* loaded from: classes14.dex */
public final class zrl0 extends DrawingView {
    public int i;

    public zrl0(Context context, int i) {
        super(context, null, 0);
        this.i = 255;
    }

    @Override // com.vk.photo.editor.markup.view.DrawingView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = this.i;
        if (i != 255) {
            canvas.drawColor(i, PorterDuff.Mode.DST_IN);
        }
    }
}
