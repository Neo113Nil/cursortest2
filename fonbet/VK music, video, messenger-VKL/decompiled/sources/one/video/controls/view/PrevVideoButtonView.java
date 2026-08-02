package one.video.controls.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import one.video.controls.view.PrevVideoButtonView;
import xsna.hlo;
import xsna.o7j;
import xsna.wn80;
import xsna.x5r0;
import xsna.y3j;

/* compiled from: PrevVideoButtonView.kt */
/* loaded from: classes8.dex */
public final class PrevVideoButtonView extends AppCompatImageView {
    public static final /* synthetic */ int d = 0;
    public final y3j b;
    public hlo c;

    public PrevVideoButtonView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        hlo hloVar = this.c;
        if (hloVar != null) {
            hloVar.a(canvas, getWidth(), getHeight());
        }
        super.draw(canvas);
    }

    public final hlo getDrawer() {
        return this.c;
    }

    public final void setDrawer(hlo hloVar) {
        this.c = hloVar;
        invalidate();
    }

    public PrevVideoButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PrevVideoButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PrevVideoButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    public PrevVideoButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int i3 = wn80.a;
        setBackgroundResource(R.drawable.one_video_button_drawable);
        setImageResource(R.drawable.one_video_icon_skip_back_28);
        int intValue = ((Number) x5r0.f.getValue()).intValue();
        setPadding(intValue, intValue, intValue, intValue);
        setContentDescription(context.getString(R.string.one_video_controls_skip_back_accessibility));
        this.b = new y3j(new o7j() { // from class: xsna.k3d0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                l3d0 l3d0Var = (l3d0) obj;
                int i4 = PrevVideoButtonView.d;
                if (l3d0Var.b) {
                    return;
                }
                PrevVideoButtonView.this.setVisibility(l3d0Var.a ? 0 : 8);
            }
        });
    }
}
