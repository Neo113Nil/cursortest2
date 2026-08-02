package defpackage;

import com.yandex.go.scooters.b;
import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;

/* loaded from: classes13.dex */
public final class klo0 implements rpo0 {
    public final /* synthetic */ b a;
    public final /* synthetic */ pxm0 b;
    public final /* synthetic */ sls c;

    public klo0(b bVar, pxm0 pxm0Var, sls slsVar) {
        this.a = bVar;
        this.b = pxm0Var;
        this.c = slsVar;
    }

    @Override // defpackage.rpo0
    public final void B0(String str, String str2, ScootersQrNumberResultSource scootersQrNumberResultSource) {
        ulo0 ulo0Var = new ulo0(new r7p0(str, str2), w3b1.c(scootersQrNumberResultSource));
        b bVar = this.a;
        pxm0 pxm0Var = this.b;
        sls slsVar = this.c;
        bVar.T(ulo0Var, new kqe0(26, bVar, pxm0Var, slsVar), slsVar);
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.h0 = null;
        this.c.invoke();
    }

    @Override // defpackage.rpo0
    public final void d1() {
        this.a.U(this.b, null);
    }
}
