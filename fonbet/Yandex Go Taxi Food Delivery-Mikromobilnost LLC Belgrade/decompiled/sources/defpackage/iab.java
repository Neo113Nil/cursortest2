package defpackage;

import com.squareup.moshi.Moshi;
import defpackage.iaz0;
import java.util.Collections;

/* loaded from: classes15.dex */
public abstract class iab extends jab {
    public final qbb w;
    public boolean x;
    public final /* synthetic */ oab y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iab(oab oabVar, qbb qbbVar) {
        super(oabVar);
        this.y = oabVar;
        this.w = qbbVar;
        this.x = false;
    }

    @Override // defpackage.jab
    public final void c(iaz0 iaz0Var) {
        boolean z;
        oab oabVar = this.y;
        vcz0 vcz0Var = oabVar.x;
        k020 k020Var = vcz0Var.b;
        long j = vcz0Var.a.a;
        at2 at2Var = k020Var.b;
        yab yabVar = new yab(at2Var.B().L(j), (Moshi) k020Var.h.get(), at2Var.Y().g(j));
        if (iaz0Var == null) {
            iaz0Var = new iaz0();
            iaz0Var.a(new iaz0.a());
        }
        loop0: while (true) {
            z = false;
            for (haz0 haz0Var : Collections.unmodifiableList(iaz0Var.a)) {
                if (!z) {
                    faz0 faz0Var = haz0Var instanceof faz0 ? (faz0) haz0Var : null;
                    if (faz0Var == null || faz0Var.a != 0) {
                    }
                }
                z = true;
            }
            break loop0;
        }
        if (z || this.x || e()) {
            if (!this.x) {
                iaz0Var = new iaz0();
            }
            this.w.a(yabVar, iaz0Var, oabVar.x.f());
            this.x = true;
        }
    }

    public abstract boolean e();
}
