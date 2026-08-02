package xsna;

import android.view.View;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes13.dex */
public final class jm10 implements u080 {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public jm10(int i, int i2, View view) {
        this.b = i;
        this.c = view;
        this.d = i2;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        int i = bqx0Var.a.i(519).b;
        View view2 = this.c;
        int i2 = this.b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.d + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return bqx0Var;
    }
}
