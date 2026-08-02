package xsna;

import android.content.Context;
import java.util.Map;
import xsna.s3q0;
import xsna.su8;

/* loaded from: classes9.dex */
public final class lrg0 {
    public final kiz0 a;

    public lrg0(Context context) {
        su8 su8Var;
        this.a = new kiz0(context);
        new su8.a();
        synchronized (su8.a.class) {
            su8Var = su8.g;
            if (su8Var == null) {
                su8Var = new su8(context);
                su8.g = su8Var;
            }
        }
        ru.rustore.sdk.review.f fVar = (ru.rustore.sdk.review.f) su8Var.b.getValue();
        bxy0 bxy0Var = new bxy0((Map) fVar.c.getValue());
        e4z0 e4z0Var = fVar.a;
        e4z0Var.getClass();
        euj0 euj0Var = new euj0(new iuj0(new ru.rustore.sdk.review.i(e4z0Var, bxy0Var)), new ru.rustore.sdk.review.j(e4z0Var));
        bpn0 bpn0Var = adn.a;
        qz9.f(new yuj0(new gwj0(euj0Var, adn.a()), ru.rustore.sdk.review.k.i), new izs<s3q0, s3q0>() { // from class: ru.rustore.sdk.review.RuStoreReviewManager$a
            @Override // xsna.izs
            public final s3q0 invoke(s3q0 s3q0Var) {
                return s3q0.a;
            }
        });
    }
}
