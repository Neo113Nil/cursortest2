package defpackage;

import android.view.View;
import com.google.android.material.internal.e;

/* loaded from: classes11.dex */
public final class ew31 implements hw31 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pm5 w;

    public ew31(boolean z, boolean z2, boolean z3, pm5 pm5Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.w = pm5Var;
    }

    @Override // defpackage.hw31
    public final n751 k(View view, n751 n751Var, iw31 iw31Var) {
        if (this.a) {
            iw31Var.d = n751Var.a() + iw31Var.d;
        }
        boolean i = e.i(view);
        if (this.b) {
            if (i) {
                iw31Var.c = n751Var.b() + iw31Var.c;
            } else {
                iw31Var.a = n751Var.b() + iw31Var.a;
            }
        }
        if (this.c) {
            if (i) {
                iw31Var.a = n751Var.c() + iw31Var.a;
            } else {
                iw31Var.c = n751Var.c() + iw31Var.c;
            }
        }
        view.setPaddingRelative(iw31Var.a, iw31Var.b, iw31Var.c, iw31Var.d);
        this.w.k(view, n751Var, iw31Var);
        return n751Var;
    }
}
