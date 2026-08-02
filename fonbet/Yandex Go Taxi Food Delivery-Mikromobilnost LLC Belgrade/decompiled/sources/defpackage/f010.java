package defpackage;

import com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.c;
import ru.yandex.taxi.masstransit.d;

/* loaded from: classes6.dex */
public final class f010 implements sy60 {
    public final /* synthetic */ yq30 a;
    public final /* synthetic */ c b;
    public final /* synthetic */ d c;
    public final /* synthetic */ e310 w;

    public f010(yq30 yq30Var, c cVar, d dVar, e310 e310Var) {
        this.a = yq30Var;
        this.b = cVar;
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
