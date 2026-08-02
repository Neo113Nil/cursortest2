package defpackage;

import com.yandex.go.payments.api.composite.CompositePaymentState;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes8.dex */
public final class nrd {
    public final g a;
    public final r0 b = bvf0.c(mrd.f);

    public nrd(g gVar) {
        this.a = gVar;
    }

    public final CompositePaymentState a(CompositePaymentState compositePaymentState) {
        lv90 a = this.a.a();
        CompositePaymentState compositePaymentState2 = CompositePaymentState.ENABLED_CHECKED;
        if (compositePaymentState != compositePaymentState2 && a != null) {
            jst.e.p("CompositePayment: state != checked, but payment in preorder != null", new Throwable());
        }
        if (compositePaymentState != compositePaymentState2 || a != null) {
            return compositePaymentState;
        }
        jst.e.p("CompositePayment: state == checked, payment in preorder = null", new Throwable());
        return CompositePaymentState.ENABLED_UNCHECKED;
    }

    public final boolean b() {
        return a(((mrd) this.b.getValue()).a) == CompositePaymentState.ENABLED_CHECKED;
    }
}
