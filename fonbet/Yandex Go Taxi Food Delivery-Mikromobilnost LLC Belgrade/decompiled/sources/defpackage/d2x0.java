package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.g2x0;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class d2x0 implements c2x0, e2x0 {
    public final ViewGroup a;
    public final g2x0 b;
    public final pwy0 c;

    public d2x0(ViewGroup viewGroup, g2x0 g2x0Var, pwy0 pwy0Var) {
        this.a = viewGroup;
        this.b = g2x0Var;
        this.c = pwy0Var;
    }

    @Override // defpackage.e2x0
    public final void a(int i, Object obj, boolean z) {
        this.b.a(i, obj, z);
    }

    @Override // defpackage.e2x0
    public final void b(Object obj) {
        this.b.b(obj);
    }

    public final void c() {
        Boolean a;
        h2x0 h2x0Var = (h2x0) a.b0((List) this.b.b.getValue());
        f2x0 f2x0Var = h2x0Var != null ? (f2x0) h2x0Var.b : null;
        ViewGroup viewGroup = this.a;
        ((Activity) viewGroup.getContext()).getWindow().setNavigationBarContrastEnforced(f2x0Var != null ? f2x0Var.b() : true);
        Window window = ((Activity) viewGroup.getContext()).getWindow();
        va90 va90Var = new va90(((Activity) viewGroup.getContext()).getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).T((f2x0Var == null || (a = f2x0Var.a()) == null) ? this.c.getThemeType().f() : a.booleanValue());
    }

    public final void d() {
        Boolean a;
        ViewGroup viewGroup = this.a;
        Window window = ((Activity) viewGroup.getContext()).getWindow();
        va90 va90Var = new va90(((Activity) viewGroup.getContext()).getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        h2x0 h2x0Var = (h2x0) a.b0((List) this.b.a.getValue());
        g2x0.a aVar = h2x0Var != null ? (g2x0.a) h2x0Var.b : null;
        q751Var.U((aVar == null || (a = aVar.a()) == null) ? this.c.getThemeType().f() : a.booleanValue());
    }

    public final void e(int i, Object obj) {
        g2x0 g2x0Var = this.b;
        g2x0Var.getClass();
        g2x0Var.e(new g2x0.a(i, 1), obj);
    }
}
