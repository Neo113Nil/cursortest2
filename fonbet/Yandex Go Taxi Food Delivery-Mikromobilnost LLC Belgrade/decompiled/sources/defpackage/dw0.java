package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;

/* loaded from: classes5.dex */
public final /* synthetic */ class dw0 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f530 w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ dw0(f530 f530Var, boolean z, long j, uv0 uv0Var, sls slsVar, int i) {
        this.w = f530Var;
        this.c = z;
        this.b = j;
        this.x = uv0Var;
        this.y = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                coa1.c(this.w, this.c, this.b, (uv0) obj4, (sls) obj3, (fid) obj, vng.O(24577));
                break;
            default:
                xp31 xp31Var = (xp31) obj4;
                final mv60 mv60Var = (mv60) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    vvf0 a = j.t.a(xp31Var);
                    final long j = this.b;
                    final boolean z = this.c;
                    final f530 f530Var = this.w;
                    sb2.b(a, wwg.S(1260045569, true, new wls() { // from class: ec2
                        @Override // defpackage.wls
                        public final Object invoke(Object obj5, Object obj6) {
                            fid fidVar2 = (fid) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            final int i2 = 1;
                            final int i3 = 0;
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                long j2 = j;
                                boolean z2 = z;
                                f530 f530Var2 = f530Var;
                                final mv60 mv60Var2 = mv60Var;
                                o430 o430Var = did.a;
                                if (j2 != 9205357640488583168L) {
                                    btsVar2.e0(3458246);
                                    f43 f43Var = z2 ? rh10.c : rh10.a;
                                    f530 k = ljs0.k(f530Var2, c8m.b(j2), c8m.a(j2), 0.0f, 0.0f, 12);
                                    lhl0 a2 = khl0.a(f43Var, x4c.D, btsVar2, 0);
                                    int hashCode = Long.hashCode(btsVar2.T);
                                    r1b0 o = btsVar2.o();
                                    f530 d = b.d(btsVar2, k);
                                    ohd.G1.getClass();
                                    sls slsVar = d.b;
                                    if (btsVar2.a == null) {
                                        cma1.b0();
                                        throw null;
                                    }
                                    btsVar2.i0();
                                    if (btsVar2.S) {
                                        btsVar2.n(slsVar);
                                    } else {
                                        btsVar2.r0();
                                    }
                                    qje.W(btsVar2, d.f, a2);
                                    qje.W(btsVar2, d.e, o);
                                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                    qje.M(btsVar2, d.h);
                                    qje.W(btsVar2, d.d, d);
                                    boolean e = btsVar2.e(mv60Var2);
                                    Object Q = btsVar2.Q();
                                    if (e || Q == o430Var) {
                                        Q = new sls() { // from class: fc2
                                            @Override // defpackage.sls
                                            public final Object invoke() {
                                                int i4 = i3;
                                                mv60 mv60Var3 = mv60Var2;
                                                switch (i4) {
                                                    case 0:
                                                        return Boolean.valueOf((9223372034707292159L & mv60Var3.a()) != 9205357640488583168L);
                                                    default:
                                                        return Boolean.valueOf((9223372034707292159L & mv60Var3.a()) != 9205357640488583168L);
                                                }
                                            }
                                        };
                                        btsVar2.o0(Q);
                                    }
                                    pva1.c(6, btsVar2, (sls) Q, c530.a, z2);
                                    btsVar2.t(true);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(4389176);
                                    boolean e2 = btsVar2.e(mv60Var2);
                                    Object Q2 = btsVar2.Q();
                                    if (e2 || Q2 == o430Var) {
                                        Q2 = new sls() { // from class: fc2
                                            @Override // defpackage.sls
                                            public final Object invoke() {
                                                int i4 = i2;
                                                mv60 mv60Var3 = mv60Var2;
                                                switch (i4) {
                                                    case 0:
                                                        return Boolean.valueOf((9223372034707292159L & mv60Var3.a()) != 9205357640488583168L);
                                                    default:
                                                        return Boolean.valueOf((9223372034707292159L & mv60Var3.a()) != 9205357640488583168L);
                                                }
                                            }
                                        };
                                        btsVar2.o0(Q2);
                                    }
                                    pva1.c(0, btsVar2, (sls) Q2, f530Var2, z2);
                                    btsVar2.t(false);
                                }
                            } else {
                                btsVar2.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar), btsVar, 56);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ dw0(xp31 xp31Var, long j, boolean z, f530 f530Var, mv60 mv60Var) {
        this.x = xp31Var;
        this.b = j;
        this.c = z;
        this.w = f530Var;
        this.y = mv60Var;
    }
}
