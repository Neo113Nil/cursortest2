package xsna;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes11.dex */
public final class s23 extends f0u0 {
    public final /* synthetic */ o23 a;

    public s23(o23 o23Var) {
        this.a = o23Var;
    }

    @Override // xsna.f0u0, xsna.e0u0
    public final void a() {
        o23 o23Var = this.a;
        o23Var.w.setVisibility(0);
        if (o23Var.w.getParent() instanceof View) {
            View view = (View) o23Var.w.getParent();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.requestApplyInsets();
        }
    }

    @Override // xsna.e0u0
    public final void b() {
        o23 o23Var = this.a;
        o23Var.w.setAlpha(1.0f);
        o23Var.z.d(null);
        o23Var.z = null;
    }
}
