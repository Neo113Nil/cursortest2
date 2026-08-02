package defpackage;

import com.yandex.go.scooters.passes.domain.model.ScootersPassesType;
import com.yandex.go.scooters.passes.e;
import com.yandex.go.scooters.passes.f;
import com.yandex.go.scooters.passes.h;

/* loaded from: classes13.dex */
public final /* synthetic */ class lsm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ moo0 b;

    public /* synthetic */ lsm0(moo0 moo0Var, int i) {
        this.a = i;
        this.b = moo0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        moo0 moo0Var = this.b;
        switch (i) {
            case 0:
                ((jsm0) obj).S0(moo0Var);
                break;
            case 1:
                h.Q(((bgo0) obj).a, moo0Var, ScootersPassesType.SUPER_PASSES);
                break;
            case 2:
                h.Q(((e) obj).a, moo0Var, ScootersPassesType.PACKAGES);
                break;
            case 3:
                h.Q(((f) obj).a, moo0Var, ScootersPassesType.PACKAGES);
                break;
            default:
                h.Q(((dgo0) obj).a, moo0Var, ScootersPassesType.SUPER_PASSES);
                break;
        }
        return zy11Var;
    }
}
