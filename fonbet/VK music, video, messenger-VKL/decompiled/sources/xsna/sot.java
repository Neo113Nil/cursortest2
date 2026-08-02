package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Result;
import xsna.uik;

/* compiled from: GestureTouchListener.kt */
/* loaded from: classes4.dex */
public final class sot implements View.OnTouchListener {
    public a b;
    public final b c;
    public final q4h0 d;
    public final xfo e;
    public final rlb0 f;
    public boolean g;
    public boolean h;
    public int i = 1;
    public boolean j;

    /* compiled from: GestureTouchListener.kt */
    public interface a {
        void a(float f, float f2);

        void b();

        void c();

        void onScale(float f, float f2, float f3);
    }

    /* compiled from: GestureTouchListener.kt */
    public interface b {
    }

    public sot(Context context, a aVar, r41 r41Var) {
        this.b = aVar;
        this.c = r41Var;
        emy emyVar = new emy();
        rlb0 rlb0Var = new rlb0(emyVar);
        this.f = rlb0Var;
        xfo xfoVar = new xfo(context, emyVar, rlb0Var);
        this.e = xfoVar;
        q4h0 q4h0Var = new q4h0(context);
        this.d = q4h0Var;
        q4h0Var.a = this;
        xfoVar.f = this;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object failure;
        if (!this.g) {
            return false;
        }
        this.j = motionEvent.getPointerCount() >= this.i;
        b bVar = this.c;
        if (bVar != null) {
            uik uikVar = (uik) ((r41) bVar).c;
            if (uikVar.q.hasMessages(0)) {
                uik.b bVar2 = uikVar.q;
                bVar2.removeMessages(0);
                bVar2.sendMessage(Message.obtain(bVar2, 0));
            }
            if (motionEvent.getAction() == 2) {
                uikVar.e(false, true, false, false);
                uikVar.d(true);
            } else {
                uikVar.e(true, true, true, true);
                uikVar.d(false);
            }
            sf2 sf2Var = uikVar.j;
            if (sf2Var != null) {
                ((gik) sf2Var.b).L(true);
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b.c();
        } else if (action == 1 || action == 3) {
            this.b.b();
        }
        try {
            this.d.b.onTouchEvent(motionEvent);
            this.f.c(motionEvent);
            this.e.a(motionEvent);
            failure = Boolean.TRUE;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return !(failure instanceof Result.Failure);
    }
}
