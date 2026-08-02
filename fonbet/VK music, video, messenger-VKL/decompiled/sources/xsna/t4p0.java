package xsna;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class t4p0 implements gzs {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ izs f;

    public /* synthetic */ t4p0(View view, gzs gzsVar, boolean z, boolean z2, izs izsVar) {
        this.b = view;
        this.c = gzsVar;
        this.d = z;
        this.e = z2;
        this.f = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        final boolean z = this.d;
        final boolean z2 = this.e;
        final gzs gzsVar = this.c;
        final izs izsVar = this.f;
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.m4p0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                boolean contains = ((RectF) gzsVar.invoke()).contains(motionEvent.getX(), motionEvent.getY());
                if (contains && !z) {
                    return false;
                }
                boolean z3 = z2;
                if (z3) {
                    izsVar.invoke(Integer.valueOf(contains ? 1 : 0));
                }
                return z3;
            }
        });
        return s3q0.a;
    }
}
