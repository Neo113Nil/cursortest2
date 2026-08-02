package defpackage;

import android.content.Context;
import com.yandex.go.about.domain.c;
import com.yandex.go.about.domain.d;
import com.yandex.go.inapp_calls.api.navigation.ResumeInAppCallSource;
import com.yandex.go.inapp_calls.navigation.g;
import com.yandex.go.yb.data.u;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.am.k;

/* loaded from: classes12.dex */
public final class ap9 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap9(m19 m19Var, nl9 nl9Var) {
        super(null);
        this.D = 0;
        this.E = m19Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = this.D;
        int i2 = 0;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                zo9 zo9Var = (zo9) obj;
                if (!(zo9Var instanceof zo9)) {
                    w511.b();
                    break;
                } else {
                    A((m950) ((m19) obj2).get(), zo9Var, new dl1(7, this));
                    break;
                }
            case 1:
                i6r i6rVar = (i6r) obj2;
                i6rVar.getClass();
                fwf fwfVar = new fwf(i6rVar, 1);
                c0g c0gVar = (c0g) i6rVar;
                zuj0 N2 = c0gVar.N2();
                q5z.h(N2);
                tt2 Z1 = c0gVar.Z1();
                q5z.h(Z1);
                zzf zzfVar = c0gVar.z;
                rs2 rs2Var = (rs2) zzfVar.e.get();
                u uVar = (u) zzfVar.V1.get();
                q5z.h(uVar);
                c1x0 c1x0Var = new c1x0(rs2Var, uVar, msb1.E);
                pk51 pk51Var = (pk51) zzfVar.cq.get();
                q5z.h(pk51Var);
                o k3 = c0gVar.k3();
                q5z.h(k3);
                zuj0 N22 = c0gVar.N2();
                q5z.h(N22);
                f6 f6Var = new f6(N2, Z1, new s4(c1x0Var, pk51Var, k3, N22));
                Context W1 = c0gVar.W1();
                q5z.h(W1);
                w030 C2 = c0gVar.C2();
                q5z.h(C2);
                Context W12 = c0gVar.W1();
                q5z.h(W12);
                lg21 d3 = c0gVar.d3();
                q5z.h(d3);
                k3c k3cVar = new k3c(zzfVar.a);
                pho k2 = c0gVar.k2();
                q5z.h(k2);
                b1 b1Var = new b1(k2);
                xl51 xl51Var = (xl51) zzfVar.bq.get();
                q5z.h(xl51Var);
                kb20 kb20Var = (kb20) zzfVar.k.get();
                q5z.h(kb20Var);
                k kVar = (k) zzfVar.L0.get();
                q5z.h(kVar);
                w8h j = zzfVar.j();
                rqo l2 = c0gVar.l2();
                q5z.h(l2);
                s66 s66Var = new s66(l2, 2);
                rs2 rs2Var2 = (rs2) zzfVar.e.get();
                bpt bptVar = (bpt) zzfVar.v3.get();
                q5z.h(bptVar);
                d dVar = new d(W12, d3, k3cVar, b1Var, xl51Var, new c(kb20Var, kVar, j, s66Var, rs2Var2, bptVar));
                v3u0 v3u0Var = (v3u0) c0gVar.Nb.get();
                q5z.h(v3u0Var);
                z(new c5(f6Var, W1, C2, dVar, fwfVar, v3u0Var), new bb0(this, 8));
                break;
            case 2:
                A((g) obj2, (ResumeInAppCallSource) obj, new ikv(this, i2));
                break;
            case 3:
                A((ru.yandex.taxi.cashback.router.c) obj2, (qrd0) obj, sy60.Q2);
                break;
            default:
                A((abu0) obj2, (zau0) obj, new lbu0(this, i2));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap9(int i, Object obj) {
        super(null);
        this.D = i;
        this.E = obj;
    }
}
