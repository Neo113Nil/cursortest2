package defpackage;

import android.view.ViewGroup;
import com.yandex.div.legacy.view.DivView;

/* loaded from: classes11.dex */
public final class h05 {
    public final ViewGroup a;
    public final w5x0 b;
    public final int c;
    public ViewGroup d;
    public final /* synthetic */ x5x0 e;

    public h05(x5x0 x5x0Var, ViewGroup viewGroup, w5x0 w5x0Var, int i) {
        this.e = x5x0Var;
        this.a = viewGroup;
        this.b = w5x0Var;
        this.c = i;
    }

    public final void a() {
        x5x0 x5x0Var = this.e;
        DivView divView = x5x0Var.o;
        if (this.d != null) {
            return;
        }
        w5x0 w5x0Var = this.b;
        ViewGroup viewGroup = this.a;
        viewGroup.removeAllViews();
        zjk zjkVar = w5x0Var.a.a;
        divView.setActionHandlerForView(viewGroup, (x3k) zjkVar.c);
        z5x0 z5x0Var = x5x0Var.p;
        if (z5x0Var.g == null) {
            z83.j("mBlock should have been initialized in the build() method");
        }
        viewGroup.addView(z5x0Var.e.b(divView, zjkVar, n15.a(z5x0Var.g.e(), String.valueOf(this.c))));
        this.d = viewGroup;
        bei beiVar = x5x0Var.h;
        Object obj = w5x0Var.a.b.c;
        beiVar.getClass();
    }
}
