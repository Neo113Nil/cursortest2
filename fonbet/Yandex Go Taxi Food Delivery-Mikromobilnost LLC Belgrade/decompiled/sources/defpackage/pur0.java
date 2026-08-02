package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.go.flex.main_screen.presentation.controllers.shimmer.OptimizedShimmerContentView;
import com.yandex.go.flex.main_screen.presentation.controllers.shimmer.ShimmerContentView;

/* loaded from: classes.dex */
public final class pur0 extends v0x {
    public final o370 c;
    public final Object d;
    public final pdh e = new pdh();

    public pur0(o370 o370Var, Object obj) {
        this.c = o370Var;
        this.d = obj;
    }

    @Override // defpackage.v0x
    public final /* bridge */ /* synthetic */ void b(x0 x0Var, u0x u0xVar) {
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        o370 o370Var = this.c;
        o370Var.getClass();
        eid eidVar = (eid) o370Var.a;
        qtr0 qtr0Var = (qtr0) eidVar.b;
        return new zur0(eidVar.a ? new OptimizedShimmerContentView(viewGroup.getContext(), qtr0Var) : new ShimmerContentView(viewGroup.getContext(), qtr0Var));
    }

    @Override // defpackage.v0x
    public final pdh e() {
        return this.e;
    }

    @Override // defpackage.v0x
    public final /* bridge */ /* synthetic */ void h(x0 x0Var) {
    }
}
