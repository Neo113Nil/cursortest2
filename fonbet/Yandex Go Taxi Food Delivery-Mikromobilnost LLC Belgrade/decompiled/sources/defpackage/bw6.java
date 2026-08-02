package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.shared.business.onboarding.a;

/* loaded from: classes8.dex */
public final class bw6 implements vw60 {
    public final Lifecycle a;
    public final a b;

    public bw6(Lifecycle lifecycle, a aVar) {
        this.a = lifecycle;
        this.b = aVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        cey.b(this.a, Lifecycle.Event.ON_DESTROY, new b7(13, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "BusinessAccountActivityListener";
    }
}
