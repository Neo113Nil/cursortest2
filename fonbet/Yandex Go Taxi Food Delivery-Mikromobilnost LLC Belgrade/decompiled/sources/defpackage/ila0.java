package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsView;
import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsViewHolder$observeVisibility$$inlined$collectLatestIn$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class ila0 extends v0x {
    public final kjz c;
    public final b3k d;
    public final w0j e;
    public final pdh f = new pdh();

    public ila0(kjz kjzVar, b3k b3kVar, w0j w0jVar) {
        this.c = kjzVar;
        this.d = b3kVar;
        this.e = w0jVar;
    }

    @Override // defpackage.v0x
    public final void b(x0 x0Var, u0x u0xVar) {
        ama0 ama0Var = (ama0) x0Var;
        ama0Var.N.setData(((hla0) u0xVar).b);
        hbp0 hbp0Var = ama0Var.P;
        if (hbp0Var.d()) {
            return;
        }
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new PaymentWidgetsViewHolder$observeVisibility$$inlined$collectLatestIn$1(e.d(((acw0) ama0Var.O.a).d), null, ama0Var), 3);
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        kjz kjzVar = this.c;
        Context context = (Context) kjzVar.b;
        return new ama0(new PaymentWidgetsView(context, this.d.a(context, this.e)), (xla0) ((bma0) kjzVar.c).a.a.get());
    }

    @Override // defpackage.v0x
    public final pdh e() {
        return this.f;
    }

    @Override // defpackage.v0x
    public final void h(x0 x0Var) {
        ama0 ama0Var = (ama0) x0Var;
        bvf0.j(ama0Var.P, null);
        ama0Var.N.unbind();
    }
}
