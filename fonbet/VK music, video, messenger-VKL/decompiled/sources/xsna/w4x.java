package xsna;

import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.design.inspector.DesignInspectorComponent;
import xsna.b5x;
import xsna.e5x;

/* compiled from: InspectableImageView.kt */
/* loaded from: classes17.dex */
public final class w4x extends AppCompatImageView implements b5x {
    public b5x.c b;

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
        return (n != null ? ((q5x) n).c(this, motionEvent) : false) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // xsna.b5x
    public b5x.c getDesignInspectorParams() {
        return this.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
        if (n != null) {
            ((q5x) n).g(this, canvas);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
        return (n != null ? ((q5x) n).i(this, motionEvent) : false) || super.onTouchEvent(motionEvent);
    }

    @Override // xsna.b5x
    public void setDesignInspectorParams(b5x.c cVar) {
        this.b = cVar;
    }
}
