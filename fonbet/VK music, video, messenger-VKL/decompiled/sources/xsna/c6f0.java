package xsna;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.ArrayList;

/* compiled from: ReactionsPopupWindow.kt */
/* loaded from: classes5.dex */
public final class c6f0 extends PopupWindow implements View.OnTouchListener {
    public final x6f0 b;
    public final m3r c;

    public c6f0(Context context, ArrayList arrayList, y6f0 y6f0Var, x7d x7dVar, x6f0 x6f0Var, x2f0 x2f0Var) {
        super(context);
        this.b = x6f0Var;
        m3r m3rVar = new m3r(context, arrayList, y6f0Var, x7dVar, new bbb0(this, 7), new b6f0(this, 0), x2f0Var, new nij(0, this, c6f0.class, "dismiss", "dismiss()V", 0, 5));
        this.c = m3rVar;
        setContentView(m3rVar);
        m3rVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setWidth(-1);
        setHeight(-1);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setAnimationStyle(R.style.Animation);
    }

    public final void a() {
        if (!i0q0.b()) {
            i0q0.f(new kld0(this, 2));
        } else if (isShowing()) {
            try {
                super.dismiss();
            } catch (Throwable th) {
                Log.e("ReactionsPopupWindow", mnh0.A(th));
            }
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        this.b.a();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.c.onTouchEvent(motionEvent);
    }
}
