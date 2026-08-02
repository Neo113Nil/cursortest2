package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import xsna.rwl0;

/* compiled from: ScaleOnTapVH.kt */
/* loaded from: classes6.dex */
public abstract class y4h0 extends RecyclerView.e0 {
    public final v2d0 l;
    public final x4h0 m;

    public y4h0(View view, rwl0.a aVar) {
        super(view);
        this.l = aVar;
        this.m = new x4h0(this);
        new GestureDetector(new w4h0(this));
    }

    public final void a6(View view, boolean z) {
        dzl0.a(view, 0.75f, 1.0f);
        if (z) {
            this.l.c(false);
        }
    }

    public void W5() {
    }

    public void V5(MotionEvent motionEvent) {
    }
}
