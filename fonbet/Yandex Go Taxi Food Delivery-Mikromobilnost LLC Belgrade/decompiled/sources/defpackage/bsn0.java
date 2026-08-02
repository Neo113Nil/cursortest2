package defpackage;

import android.content.Context;
import com.yandex.go.scooters.ignition.domain.model.ScootersIgnitionOption;
import defpackage.agd;
import defpackage.asn0;
import defpackage.bcd;
import defpackage.bsn0;
import defpackage.fsn0;
import defpackage.iin0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.yfd;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

/* loaded from: classes13.dex */
public final class bsn0 extends pgd {
    public final Context F;
    public final w030 G;
    public final mu5 H;

    public bsn0(final fsn0 fsn0Var, Context context, w030 w030Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = new mu5(new tls() { // from class: com.yandex.go.scooters.ignition.controlling.permission_info.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                yfd yfdVar = (yfd) obj;
                ScootersIgnitionOption scootersIgnitionOption = ((asn0) ((agd) yfdVar).a).a;
                fsn0 fsn0Var2 = fsn0.this;
                fsn0Var2.getClass();
                tpr t = e.t(new rol0(new ScootersIgnitionPermissionInfoUiStateInteractor$uiStateFlow$1(fsn0Var2, scootersIgnitionOption, null)));
                fsn0Var2.a.getClass();
                tpr F = e.F(t, uyj.a);
                bsn0 bsn0Var = this;
                agd agdVar = (agd) yfdVar;
                agdVar.c = new o(F, new ScootersIgnitionPermissionInfoRouter$content$1$1(bsn0Var, null));
                agdVar.e = new iin0(4, bsn0Var);
                bcd.a.getClass();
                agdVar.g = bcd.b;
                return zy11.a;
            }
        });
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.H;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
