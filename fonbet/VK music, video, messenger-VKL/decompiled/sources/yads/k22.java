package yads;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class k22 implements View.OnTouchListener, View.OnClickListener {
    public final ou a;
    public final e12 b;

    public k22(ou ouVar, e12 e12Var) {
        this.a = ouVar;
        this.b = e12Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        e12 e12Var = this.b;
        e12Var.getClass();
        if ((view instanceof TextView) || (view instanceof um2)) {
            e12Var.a(view, motionEvent);
        }
        return this.a.onTouch(view, motionEvent);
    }
}
