package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.focus.a;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.node.d;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class fqa1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var, CharSequence charSequence) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(726607077);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.b(56.0f) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 e = ljs0.e(ljs0.c(f530Var, 1.0f), 56.0f);
            lhl0 a = khl0.a(lr20.g, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, e);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            int i3 = wzg0.ic_delivery_smartcam_cross;
            c530 c530Var = c530.a;
            f530 e2 = ljs0.e(ljs0.q(c530Var, 50.0f), 42.0f);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, e2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            cuj0 cuj0Var = new cuj0(i3, null, null, new zez0(ldc.f), 22);
            boolean z = (i2 & 7168) == 2048;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new jc0(7, slsVar);
                btsVar.o0(Q);
            }
            s3b1.f(cuj0Var, q791.d(c530Var, false, null, null, (sls) Q, 15), null, btsVar, 0, 4);
            btsVar.t(true);
            zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, (i2 >> 3) & 14, 254);
            pi6.a(ljs0.e(ljs0.q(c530Var, 50.0f), 42.0f), btsVar, 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(f530Var, charSequence, slsVar, i, 5);
        }
    }

    public static final void b(ebp0 ebp0Var, msk0 msk0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(321471416);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ebp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(msk0Var) : btsVar.e(msk0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean equals = msk0Var.equals(lsk0.a);
            c530 c530Var2 = c530.a;
            if (equals) {
                btsVar.e0(-821948684);
                com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var2, 1.0f), 16.0f), null, false, null, null, null, false, btsVar, 0, 254);
                btsVar.t(false);
                c530Var = c530Var2;
            } else {
                if (!(msk0Var instanceof ksk0)) {
                    throw unr0.y(-303610639, btsVar, false);
                }
                btsVar.e0(-821781222);
                ksk0 ksk0Var = (ksk0) msk0Var;
                c530Var = c530Var2;
                p9b1.c(ebp0Var, ksk0Var.a, c530Var, AppColor$Palette.Text, xya1.e(btsVar).g.a, 0, 0, ksk0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar).h.a, 0, 0, null, btsVar, (i3 & 14) | 100666368 | (i3 & 896), 0, 7728);
                btsVar = btsVar;
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(ebp0Var, msk0Var, f530Var2, i, 15);
        }
    }

    public static final void c(final stk0 stk0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        Object cc2Var;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1239893057);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(stk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            kuk0 kuk0Var = stk0Var.e;
            boolean z2 = kuk0Var != null;
            int i7 = i4 & 896;
            boolean a = (i7 == 256) | ((i4 & 14) == 4) | btsVar.a(z2) | btsVar.e(kuk0Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (a || Q == o430Var) {
                z = z2;
                cc2Var = new cc2(stk0Var, z, tlsVar, kuk0Var, 5);
                btsVar.o0(cc2Var);
            } else {
                cc2Var = Q;
                z = z2;
            }
            c530 c530Var = c530.a;
            f530 a2 = fnq0.a(c530Var, (tls) cc2Var);
            boolean a3 = btsVar.a(z) | (i7 == 256) | btsVar.e(kuk0Var);
            Object Q2 = btsVar.Q();
            if (a3 || Q2 == o430Var) {
                Q2 = new ex0(z, tlsVar, kuk0Var, 17);
                btsVar.o0(Q2);
            }
            final int i8 = 3;
            ydb1.a(ooc.d(q791.d(a2, z, null, null, (sls) Q2, 14), null, 3), wwg.S(977758807, true, new zls() { // from class: zsk0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = i5;
                    zy11 zy11Var = zy11.a;
                    stk0 stk0Var2 = stk0Var;
                    switch (i9) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                fqa1.d(ibp0Var, stk0Var2.a, null, btsVar2, intValue & 14);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                fqa1.b(ebp0Var, stk0Var2.b, null, btsVar3, intValue2 & 14);
                                break;
                            }
                        case 2:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                fqa1.e(ibp0Var2, stk0Var2.c, null, btsVar4, intValue3 & 14);
                                break;
                            }
                        default:
                            ibp0 ibp0Var3 = (ibp0) obj;
                            fid fidVar5 = (fid) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((bts) fidVar5).k(ibp0Var3) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar5;
                            if (!btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                btsVar5.Y();
                                break;
                            } else {
                                fqa1.f(ibp0Var3, stk0Var2.d, null, btsVar5, intValue4 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(1175012178, true, new zls() { // from class: zsk0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = i6;
                    zy11 zy11Var = zy11.a;
                    stk0 stk0Var2 = stk0Var;
                    switch (i9) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                fqa1.d(ibp0Var, stk0Var2.a, null, btsVar2, intValue & 14);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                fqa1.b(ebp0Var, stk0Var2.b, null, btsVar3, intValue2 & 14);
                                break;
                            }
                        case 2:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                fqa1.e(ibp0Var2, stk0Var2.c, null, btsVar4, intValue3 & 14);
                                break;
                            }
                        default:
                            ibp0 ibp0Var3 = (ibp0) obj;
                            fid fidVar5 = (fid) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((bts) fidVar5).k(ibp0Var3) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar5;
                            if (!btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                btsVar5.Y();
                                break;
                            } else {
                                fqa1.f(ibp0Var3, stk0Var2.d, null, btsVar5, intValue4 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(363385161, true, new zls() { // from class: zsk0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = i3;
                    zy11 zy11Var = zy11.a;
                    stk0 stk0Var2 = stk0Var;
                    switch (i9) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                fqa1.d(ibp0Var, stk0Var2.a, null, btsVar2, intValue & 14);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                fqa1.b(ebp0Var, stk0Var2.b, null, btsVar3, intValue2 & 14);
                                break;
                            }
                        case 2:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                fqa1.e(ibp0Var2, stk0Var2.c, null, btsVar4, intValue3 & 14);
                                break;
                            }
                        default:
                            ibp0 ibp0Var3 = (ibp0) obj;
                            fid fidVar5 = (fid) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((bts) fidVar5).k(ibp0Var3) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar5;
                            if (!btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                btsVar5.Y();
                                break;
                            } else {
                                fqa1.f(ibp0Var3, stk0Var2.d, null, btsVar5, intValue4 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(769013388, true, new zls() { // from class: zsk0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = i8;
                    zy11 zy11Var = zy11.a;
                    stk0 stk0Var2 = stk0Var;
                    switch (i9) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                fqa1.d(ibp0Var, stk0Var2.a, null, btsVar2, intValue & 14);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                fqa1.b(ebp0Var, stk0Var2.b, null, btsVar3, intValue2 & 14);
                                break;
                            }
                        case 2:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                fqa1.e(ibp0Var2, stk0Var2.c, null, btsVar4, intValue3 & 14);
                                break;
                            }
                        default:
                            ibp0 ibp0Var3 = (ibp0) obj;
                            fid fidVar5 = (fid) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((bts) fidVar5).k(ibp0Var3) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar5;
                            if (!btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                btsVar5.Y();
                                break;
                            } else {
                                fqa1.f(ibp0Var3, stk0Var2.d, null, btsVar5, intValue4 & 14);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, SlotSize.L, false, btsVar, 1600944, 160);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0((Object) stk0Var, f530Var2, tlsVar, i, 16);
        }
    }

    public static final void d(ibp0 ibp0Var, ctk0 ctk0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1616736126);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(ctk0Var) : btsVar2.e(ctk0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            boolean equals = ctk0Var.equals(btk0.a);
            c530 c530Var = c530.a;
            if (equals) {
                btsVar2.e0(422838701);
                btsVar = btsVar2;
                com.yandex.go.design.compose.loading.b.a(ljs0.m(an91.k(c530Var, 8.0f), 40.0f), null, false, null, null, null, false, btsVar, 0, 254);
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                if (!(ctk0Var instanceof atk0)) {
                    throw unr0.y(-1094740217, btsVar, false);
                }
                btsVar.e0(422999095);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new q0c0(AppColor$Palette.ControlMinor, AppColor$Palette.Text);
                    btsVar.o0(Q);
                }
                vdb1.b(ibp0Var, an91.k(c530Var, 2.0f), (q0c0) Q, wwg.S(-547950077, true, new pdf0(14, ctk0Var), btsVar), btsVar, (i3 & 14) | 3456);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(ibp0Var, ctk0Var, f530Var2, i, 13);
        }
    }

    public static final void e(ibp0 ibp0Var, qtk0 qtk0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var2;
        c530 c530Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1920369874);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(qtk0Var) : btsVar2.e(qtk0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            if (qtk0Var != null) {
                btsVar2.e0(-774348232);
                c530Var = c530Var2;
                jeb1.f(qtk0Var.a, an91.o(c530Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, 384, 0, 16376);
                btsVar = btsVar2;
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                c530Var = c530Var2;
                if (qtk0Var != null) {
                    throw unr0.y(1360492244, btsVar, false);
                }
                btsVar.e0(1360500827);
                x901.a.invoke(ibp0Var, btsVar, Integer.valueOf(i3 & 14));
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(ibp0Var, qtk0Var, f530Var2, i, 14);
        }
    }

    public static final void f(ibp0 ibp0Var, rtk0 rtk0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1567085170);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(rtk0Var) : btsVar.e(rtk0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.e0(-1260030139);
            boolean z = rtk0Var.b;
            boolean z2 = rtk0Var.a;
            float f = ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f;
            c530 c530Var = c530.a;
            wfa1.a(z, an91.o(c530Var, 8.0f, 0.0f, f, 0.0f, 10), null, null, z2, btsVar, 0, 4);
            btsVar.t(false);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(ibp0Var, rtk0Var, f530Var2, i, 17);
        }
    }

    public static final void g(ytr ytrVar) {
        a aVar = ((c) qje.Q(ytrVar).getFocusOwner()).d;
        if (aVar.d.a(ytrVar)) {
            aVar.a();
        }
    }

    public static void h(ClassLoader classLoader, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(((File) it.next()).getParentFile());
        }
        Field i = ora1.i(classLoader, "pathList");
        try {
            Object cast = Object.class.cast(i.get(classLoader));
            int i2 = 3;
            p891 p891Var = new p891(i2, cast, ora1.i(cast, "nativeLibraryDirectories"), List.class);
            synchronized (b3b1.class) {
                ArrayList arrayList = new ArrayList((Collection) p891Var.h());
                hashSet2.removeAll(arrayList);
                arrayList.addAll(hashSet2);
                p891Var.k(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] objArr = (Object[]) ora1.h(cast, "makePathElements", Object[].class, List.class, new ArrayList(hashSet2));
            if (arrayList2.isEmpty()) {
                synchronized (b3b1.class) {
                    ora1.f(Object.class, cast, "nativeLibraryPathElements").m(Arrays.asList(objArr));
                }
                return;
            }
            zzbh zzbhVar = new zzbh("Error in makePathElements");
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i3));
                } catch (Exception unused) {
                }
            }
            throw zzbhVar;
        } catch (Exception e) {
            String name = i.getName();
            String name2 = classLoader.getClass().getName();
            String name3 = Object.class.getName();
            StringBuilder v = b64.v("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            v.append(name3);
            throw new zzbl(v.toString(), e);
        }
    }
}
