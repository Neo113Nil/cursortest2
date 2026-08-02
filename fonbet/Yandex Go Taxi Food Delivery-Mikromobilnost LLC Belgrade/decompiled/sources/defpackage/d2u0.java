package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.f0;

/* loaded from: classes6.dex */
public class d2u0 extends f0 {
    public c0 f;
    public b0 g;
    public okx0 h;

    @Override // androidx.recyclerview.widget.f0, androidx.recyclerview.widget.e1
    public final int[] c(RecyclerView.e eVar, View view) {
        int[] iArr = new int[2];
        if (eVar.I()) {
            if (this.g == null) {
                this.g = new b0(eVar);
            }
            b0 b0Var = this.g;
            if (b0Var == null) {
                b0Var = new b0(eVar);
            }
            iArr[0] = (RecyclerView.e.o0(view) + b0Var.e(view)) - b0Var.k();
        } else {
            iArr[0] = 0;
        }
        if (eVar.J()) {
            if (this.f == null) {
                this.f = new c0(eVar);
            }
            c0 c0Var = this.f;
            if (c0Var == null) {
                c0Var = new c0(eVar);
            }
            iArr[1] = (RecyclerView.e.o0(view) + c0Var.e(view)) - c0Var.k();
        } else {
            iArr[1] = 0;
        }
        okx0 okx0Var = this.h;
        if (okx0Var != null && (iArr[0] != 0 || iArr[1] != 0)) {
            okx0Var.run();
        }
        return iArr;
    }
}
