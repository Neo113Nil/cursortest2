package one.video.controls.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import xsna.hlo;
import xsna.ozl;
import xsna.wn80;
import xsna.x5r0;

/* compiled from: SkipForwardButton.kt */
@ozl
/* loaded from: classes8.dex */
public final class SkipForwardButton extends AppCompatImageView {
    public hlo b;

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    public SkipForwardButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = wn80.a;
        setBackgroundResource(R.drawable.one_video_button_drawable);
        setImageResource(R.drawable.one_video_icon_skip_forward_28);
        int intValue = ((Number) x5r0.f.getValue()).intValue();
        setPadding(intValue, intValue, intValue, intValue);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        hlo hloVar = this.b;
        if (hloVar != null) {
            hloVar.a(canvas, getWidth(), getHeight());
        }
        super.draw(canvas);
    }

    public final hlo getDrawer() {
        return this.b;
    }

    public final void setDrawer(hlo hloVar) {
        this.b = hloVar;
        invalidate();
    }
}
