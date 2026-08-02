package xsna;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: DividerController.kt */
/* loaded from: classes4.dex */
public final class rrn implements View.OnTouchListener {
    public static final bpn0 i = new bpn0(new pr1(20));
    public static final bpn0 j = new bpn0(new i9(21));
    public final View b;
    public final View c;
    public final jmp d;
    public float e;
    public final int f;
    public final int g;
    public final float h;

    /* compiled from: DividerController.kt */
    public static final class a {
        public static final int a() {
            bpn0 bpn0Var = rrn.i;
            return ((Number) rrn.j.getValue()).intValue();
        }
    }

    public rrn(View view, View view2, jmp jmpVar) {
        this.b = view;
        this.c = view2;
        this.d = jmpVar;
        int i2 = -a.a();
        bpn0 bpn0Var = i;
        this.f = ((Number) bpn0Var.getValue()).intValue() + i2;
        this.g = (view2.getWidth() - a.a()) - ((Number) bpn0Var.getValue()).intValue();
        this.h = view2.getWidth();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = motionEvent.getX();
            return true;
        }
        if (actionMasked != 2) {
            return true;
        }
        float x = motionEvent.getX() - this.e;
        View view2 = this.b;
        float translationX = view2.getTranslationX() + x;
        if (translationX <= this.f || translationX >= this.g) {
            return true;
        }
        view2.setTranslationX(translationX);
        this.d.invoke(Float.valueOf((translationX + a.a()) / this.h), Boolean.TRUE);
        return true;
    }
}
