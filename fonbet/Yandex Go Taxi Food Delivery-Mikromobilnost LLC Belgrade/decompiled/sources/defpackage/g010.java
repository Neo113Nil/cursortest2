package defpackage;

import com.yandex.go.masstransit.sdk.checkout.impl.checkout.a;
import ru.yandex.taxi.masstransit.d;

/* loaded from: classes5.dex */
public final class g010 implements sy60 {
    public final /* synthetic */ yq30 a;
    public final /* synthetic */ a b;
    public final /* synthetic */ d c;
    public final /* synthetic */ e310 w;

    public g010(yq30 yq30Var, a aVar, d dVar, e310 e310Var) {
        this.a = yq30Var;
        this.b = aVar;
        this.c = dVar;
        this.w = e310Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        yq30 yq30Var = this.a;
        boolean z = yq30Var instanceof xq30;
        if (z && ((xq30) yq30Var).b) {
            this.b.i();
            return;
        }
        boolean z2 = yq30Var instanceof wq30;
        e310 e310Var = this.w;
        d dVar = this.c;
        if (z2) {
            dVar.c0(e310Var);
        } else if (z) {
            d.Z(dVar, e310Var, ((xq30) yq30Var).a, null, 6);
        }
    }
}
