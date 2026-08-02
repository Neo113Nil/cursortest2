package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.safety.center.safetycenter_web.a;
import com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorView;

/* loaded from: classes13.dex */
public final class lul0 implements to41 {
    public final ful0 b;
    public final a c;
    public final jul0 d;
    public final oul0 e;

    public lul0(ful0 ful0Var, a aVar, jul0 jul0Var, oul0 oul0Var) {
        this.b = ful0Var;
        this.c = aVar;
        this.d = jul0Var;
        this.e = oul0Var;
    }

    @Override // defpackage.to41
    public final View a(Context context, jy31 jy31Var, Runnable runnable) {
        am2 am2Var = this.e.a;
        nul0 nul0Var = new nul0(this.b, this.c, (tt2) ((xvf0) am2Var.a).get(), (pwy0) ((xvf0) am2Var.b).get(), (com.yandex.go.safety.center.safetycenter_web.ui.error.a) ((ggl0) am2Var.c).get());
        mc mcVar = this.d.a;
        return new SafetyCenterWebErrorView((Context) mcVar.a.get(), nul0Var, (ip11) mcVar.b.get());
    }
}
