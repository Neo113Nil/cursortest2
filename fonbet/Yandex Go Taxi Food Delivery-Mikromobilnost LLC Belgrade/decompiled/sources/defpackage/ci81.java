package defpackage;

import android.app.Dialog;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class ci81 implements f391 {
    public final y381 a;
    public final fp61 b;
    public final List c;
    public jl81 d;

    public ci81(y381 y381Var) {
        fp61 fp61Var = new fp61();
        this.a = y381Var;
        this.b = fp61Var;
        this.c = Collections.singletonList(new p371(new h3s0(17, this), "noInterestAd"));
    }

    @Override // defpackage.f391
    public final void onReceivedError(int i) {
        for (int i2 : this.b.a) {
            if (i == i2) {
                jl81 jl81Var = this.d;
                if (jl81Var != null) {
                    nga1.c((Dialog) ((t181) jl81Var).a.b);
                    return;
                }
                return;
            }
        }
    }
}
