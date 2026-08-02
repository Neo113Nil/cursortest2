package xsna;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.CompoundButton;
import com.vk.design.inspector.DesignInspectorComponent;
import xsna.b5x;
import xsna.e5x;

/* compiled from: InspectableCompoundButton.kt */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes17.dex */
public final class u4x extends CompoundButton implements b5x {
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
        if (n != null) {
            ((q5x) n).g(this, canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
        return (n != null ? ((q5x) n).i(this, motionEvent) : false) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
        if (n != null) {
            ((q5x) n).j(this, i);
        }
    }

    @Override // xsna.b5x
    public void setDesignInspectorParams(b5x.c cVar) {
        this.b = cVar;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
        if (n != null) {
            ((q5x) n).k(this, i);
        }
    }
}
