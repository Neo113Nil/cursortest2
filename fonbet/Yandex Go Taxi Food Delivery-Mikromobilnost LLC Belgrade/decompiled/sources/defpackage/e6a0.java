package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.data.c;

/* loaded from: classes8.dex */
public final class e6a0 implements lz60 {
    public final Lifecycle a;
    public final cda0 b;
    public final c c;
    public boolean d;

    public e6a0(Lifecycle lifecycle, cda0 cda0Var, c cVar) {
        this.a = lifecycle;
        this.b = cda0Var;
        this.c = cVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        qyy0.c(new ssu(21, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PaymentMethodLargestContentfulListener";
    }
}
