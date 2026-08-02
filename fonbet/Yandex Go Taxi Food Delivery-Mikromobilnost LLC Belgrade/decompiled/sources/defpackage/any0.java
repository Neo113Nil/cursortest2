package defpackage;

import androidx.compose.material.TextFieldType;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class any0 implements ems {
    public final /* synthetic */ wls A;
    public final /* synthetic */ ehr0 B;
    public final /* synthetic */ TextFieldType C;
    public final /* synthetic */ wls D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ j690 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ wls a;
    public final /* synthetic */ wls b;
    public final /* synthetic */ String c;
    public final /* synthetic */ jmy0 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ wls z;

    public any0(wls wlsVar, wls wlsVar2, String str, jmy0 jmy0Var, boolean z, boolean z2, h8w h8wVar, wls wlsVar3, wls wlsVar4, ehr0 ehr0Var, TextFieldType textFieldType, wls wlsVar5, boolean z3, j690 j690Var, boolean z4) {
        this.a = wlsVar;
        this.b = wlsVar2;
        this.c = str;
        this.w = jmy0Var;
        this.x = z;
        this.y = z2;
        this.z = wlsVar3;
        this.A = wlsVar4;
        this.B = ehr0Var;
        this.C = textFieldType;
        this.D = wlsVar5;
        this.E = z3;
        this.F = j690Var;
        this.G = z4;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        bts btsVar;
        a aVar;
        a aVar2;
        a S;
        final float floatValue = ((Number) obj).floatValue();
        final long j = ((ldc) obj2).a;
        final long j2 = ((ldc) obj3).a;
        final float floatValue2 = ((Number) obj4).floatValue();
        fid fidVar = (fid) obj5;
        int intValue = ((Number) obj6).intValue();
        if ((intValue & 6) == 0) {
            i = (fidVar.b(floatValue) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= fidVar.d(j) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= fidVar.d(j2) ? 256 : 128;
        }
        if ((intValue & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i |= fidVar.b(floatValue2) ? 2048 : 1024;
        }
        int i2 = i;
        bts btsVar2 = (bts) fidVar;
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            a aVar3 = null;
            final wls wlsVar = this.a;
            if (wlsVar == null) {
                btsVar2.e0(986681709);
                btsVar2.t(false);
                btsVar = btsVar2;
                aVar = null;
            } else {
                btsVar2.e0(986681710);
                btsVar = btsVar2;
                final boolean z = this.G;
                wls wlsVar2 = new wls() { // from class: wmy0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj7, Object obj8) {
                        fid fidVar2 = (fid) obj7;
                        int intValue2 = ((Integer) obj8).intValue();
                        bts btsVar3 = (bts) fidVar2;
                        if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                            a7u0 a7u0Var = fq11.b;
                            ety0 z2 = bb1.z(((cq11) btsVar3.m(a7u0Var)).g, ((cq11) btsVar3.m(a7u0Var)).l, floatValue);
                            if (z) {
                                z2 = ety0.a(z2, j, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                            }
                            androidx.compose.material.a.c(j2, z2, wlsVar, btsVar3, 384, 0);
                        } else {
                            btsVar3.Y();
                        }
                        return zy11.a;
                    }
                };
                floatValue = floatValue;
                a S2 = wwg.S(723429411, true, wlsVar2, btsVar);
                btsVar.t(false);
                aVar = S2;
            }
            final wls wlsVar3 = this.b;
            final boolean z2 = this.x;
            final jmy0 jmy0Var = this.w;
            if (wlsVar3 == null || this.c.length() != 0 || floatValue2 <= 0.0f) {
                btsVar.e0(988093542);
                btsVar.t(false);
                aVar2 = null;
            } else {
                btsVar.e0(987666549);
                aVar2 = wwg.S(-426706263, true, new zls() { // from class: xmy0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        f530 f530Var = (f530) obj7;
                        fid fidVar2 = (fid) obj8;
                        int intValue2 = ((Integer) obj9).intValue();
                        if ((intValue2 & 6) == 0) {
                            intValue2 |= ((bts) fidVar2).k(f530Var) ? 4 : 2;
                        }
                        bts btsVar3 = (bts) fidVar2;
                        if (btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                            f530 b = tra1.b(f530Var, floatValue2);
                            z910 d = pi6.d(x4c.b, false);
                            int S3 = cma1.S(btsVar3);
                            r1b0 o = btsVar3.o();
                            f530 d2 = b.d(btsVar3, b);
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            if (btsVar3.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar);
                            } else {
                                btsVar3.r0();
                            }
                            qje.W(btsVar3, d.f, d);
                            qje.W(btsVar3, d.e, o);
                            wls wlsVar4 = d.g;
                            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S3))) {
                                b64.z(S3, btsVar3, S3, wlsVar4);
                            }
                            qje.W(btsVar3, d.d, d2);
                            dmh dmhVar = (dmh) jmy0Var;
                            dmhVar.getClass();
                            btsVar3.e0(264799724);
                            oz40 n = f.n(new ldc(z2 ? dmhVar.t : dmhVar.u), btsVar3);
                            btsVar3.t(false);
                            androidx.compose.material.a.c(((ldc) n.getValue()).a, ((cq11) btsVar3.m(fq11.b)).g, wlsVar3, btsVar3, 0, 4);
                            btsVar3.t(true);
                        } else {
                            btsVar3.Y();
                        }
                        return zy11.a;
                    }
                }, btsVar);
                btsVar.t(false);
            }
            dmh dmhVar = (dmh) jmy0Var;
            dmhVar.getClass();
            btsVar.e0(-1519634405);
            boolean z3 = this.y;
            oz40 n = f.n(new ldc(!z2 ? dmhVar.j : z3 ? dmhVar.k : dmhVar.i), btsVar);
            btsVar.t(false);
            long j3 = ((ldc) n.getValue()).a;
            wls wlsVar4 = this.z;
            if (wlsVar4 == null) {
                btsVar.e0(988282301);
                btsVar.t(false);
                S = null;
            } else {
                btsVar.e0(988282302);
                S = wwg.S(-317090443, true, new smy0(j3, wlsVar4, 3, (byte) 0), btsVar);
                btsVar.t(false);
            }
            btsVar.e0(1383318157);
            oz40 n2 = f.n(new ldc(!z2 ? dmhVar.m : z3 ? dmhVar.n : dmhVar.l), btsVar);
            btsVar.t(false);
            long j4 = ((ldc) n2.getValue()).a;
            wls wlsVar5 = this.A;
            if (wlsVar5 == null) {
                btsVar.e0(988575964);
                btsVar.t(false);
            } else {
                btsVar.e0(988575965);
                aVar3 = wwg.S(262889693, true, new smy0(j4, wlsVar5, 4, (byte) 0), btsVar);
                btsVar.t(false);
            }
            btsVar.e0(-1423938813);
            oz40 n3 = f.n(new ldc(dmhVar.o), btsVar);
            btsVar.t(false);
            f530 b = m4m0.b(c530.a, ((ldc) n3.getValue()).a, this.B);
            int i3 = ymy0.a[this.C.ordinal()];
            if (i3 == 1) {
                btsVar.e0(988856360);
                lny0.c(b, this.D, aVar, aVar2, S, aVar3, this.E, floatValue, this.F, btsVar, (i2 << 21) & 29360128);
                btsVar.t(false);
            } else {
                if (i3 != 2) {
                    throw unr0.y(1971561250, btsVar, false);
                }
                btsVar.e0(989436742);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = f.j(new cjs0(0L));
                    btsVar.o0(Q);
                }
                oz40 oz40Var = (oz40) Q;
                a S3 = wwg.S(-1107746014, true, new hex0(8, oz40Var, this.F), btsVar);
                boolean z4 = (i2 & 14) == 4;
                Object Q2 = btsVar.Q();
                if (z4 || Q2 == o430Var) {
                    Q2 = new n0(floatValue, oz40Var, 1);
                    btsVar.o0(Q2);
                }
                yx80.a(b, this.D, aVar2, aVar, S, aVar3, this.E, floatValue, (tls) Q2, S3, this.F, btsVar, ((i2 << 21) & 29360128) | 805306368);
                btsVar.t(false);
            }
        } else {
            btsVar2.Y();
        }
        return zy11.a;
    }
}
