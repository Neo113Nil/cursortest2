package defpackage;

import android.content.Context;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.a;

/* loaded from: classes5.dex */
public final class f4 implements v7p {
    public final /* synthetic */ int a;
    public final exf b;

    public /* synthetic */ f4(exf exfVar, int i) {
        this.a = i;
        this.b = exfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        exf exfVar = this.b;
        switch (i) {
            case 0:
                return new a((Context) exfVar.get());
            default:
                return new kn1((Context) exfVar.get(), 0);
        }
    }
}
