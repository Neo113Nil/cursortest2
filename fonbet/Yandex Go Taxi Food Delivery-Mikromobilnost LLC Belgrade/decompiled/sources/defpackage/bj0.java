package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.rida.bids.state.BidsBoostButtonUiState$BoostStyle;
import com.yandex.smartcamera.arscene.ArFragment;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class bj0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        vd9 vd9Var = (vd9) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            jeb1.f(vd9Var.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 0, 0, 16382);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        mya myaVar = (mya) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            so5 so5Var = x4c.H;
            f530 c = ljs0.c(c530.a, 1.0f);
            sic a = qic.a(lr20.e, so5Var, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            qgy.b(myaVar.l.a, null, null, AppColor$Palette.TextOnControl, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.b, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
            CharSequence charSequence = myaVar.l.b;
            if (charSequence == null) {
                btsVar.e0(2100891697);
                btsVar.t(false);
            } else {
                btsVar.e0(2100891698);
                qgy.b(charSequence, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        pna pnaVar = (pna) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            so5 so5Var = x4c.H;
            f530 c = ljs0.c(c530.a, 1.0f);
            sic a = qic.a(lr20.e, so5Var, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            qgy.b(pnaVar.h.a, null, null, AppColor$Palette.TextOnControl, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.b, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
            CharSequence charSequence = pnaVar.h.b;
            if (charSequence == null) {
                btsVar.e0(-1427074937);
                btsVar.t(false);
            } else {
                btsVar.e0(-1427074936);
                qgy.b(charSequence, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        kna knaVar = (kna) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            so5 so5Var = x4c.H;
            f530 c = ljs0.c(c530.a, 1.0f);
            sic a = qic.a(lr20.e, so5Var, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            qgy.b(knaVar.m.a, null, null, AppColor$Palette.TextOnControl, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.b, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
            CharSequence charSequence = knaVar.m.b;
            if (charSequence == null) {
                btsVar.e0(1327268097);
                btsVar.t(false);
            } else {
                btsVar.e0(1327268098);
                qgy.b(charSequence, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        v7a v7aVar = (v7a) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            CharSequence charSequence = v7aVar.a;
            if (charSequence == null) {
                btsVar.e0(-1708809794);
                btsVar.t(false);
            } else {
                btsVar.e0(-1708809793);
                qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).g.b, null, btsVar, 805309440, 6, 10742);
                btsVar.t(false);
            }
            CharSequence charSequence2 = v7aVar.b;
            if (charSequence2 == null) {
                btsVar.e0(-1708507947);
                btsVar.t(false);
            } else {
                btsVar.e0(-1708507946);
                qgy.b(charSequence2, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).h.a, null, btsVar, 805309440, 6, 10742);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        zy11 onCreateView$lambda$12$lambda$11$lambda$10$lambda$9;
        long j3;
        wp2 wp2Var;
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                cj0 cj0Var = (cj0) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
                dmw0 dmw0Var = btsVar.a;
                if (V) {
                    k3r k3rVar = ljs0.c;
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, k3rVar);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar, wlsVar, d);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar, wlsVar3, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar, tlsVar);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar, wlsVar4, d2);
                    sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    c530 c530Var2 = c530.a;
                    f530 d3 = b.d(btsVar, c530Var2);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, a);
                    qje.W(btsVar, wlsVar2, o2);
                    vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                    qje.W(btsVar, wlsVar4, d3);
                    ffb1.d(null, cj0Var.b, null, btsVar, 0, 5);
                    jeb1.f(cj0Var.a, an91.o(c530Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar, 48, 0, 32764);
                    btsVar.t(true);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                s740 s740Var = (s740) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    b411 b411Var = s740Var.a;
                    if (jl40.l(b411Var, y311.a)) {
                        btsVar2.e0(-542165954);
                        f530 m = an91.m(c530Var, 6.0f, 0.0f, 2);
                        long j4 = ldc.l;
                        n9d.a.getClass();
                        gpb1.b(m, j4, n9d.b, btsVar2, 438);
                        btsVar2.t(false);
                    } else if (jl40.l(b411Var, a411.a)) {
                        btsVar2.e0(-541833727);
                        uo5 uo5Var = x4c.y;
                        f530 b = m4m0.b(ymb1.l(ljs0.m(c530Var, 200.0f), cyk0.c(12.0f)), ldc.l, qke.q);
                        z910 d4 = pi6.d(uo5Var, false);
                        int hashCode3 = Long.hashCode(btsVar2.T);
                        r1b0 o3 = btsVar2.o();
                        f530 d5 = b.d(btsVar2, b);
                        ohd.G1.getClass();
                        sls slsVar2 = d.b;
                        if (btsVar2.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar2);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, d.f, d4);
                        qje.W(btsVar2, d.e, o3);
                        qje.W(btsVar2, d.g, Integer.valueOf(hashCode3));
                        qje.M(btsVar2, d.h);
                        qje.W(btsVar2, d.d, d5);
                        com.yandex.go.design.compose.loading.b.a(ljs0.c, cyk0.c(8.0f), false, null, null, null, false, btsVar2, 6, 252);
                        btsVar2.t(true);
                        btsVar2.t(false);
                    } else {
                        if (!jl40.l(b411Var, z311.a)) {
                            throw unr0.y(398151409, btsVar2, false);
                        }
                        btsVar2.e0(-541455031);
                        btsVar2.t(false);
                    }
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                mn0 mn0Var = (mn0) obj4;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    p9b1.c(ebp0Var, mn0Var.a, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue3 & 14, 0, 8190);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                ob obVar = (ob) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    sic a2 = qic.a(lr20.e, x4c.H, btsVar4, 54);
                    int hashCode4 = Long.hashCode(btsVar4.T);
                    r1b0 o4 = btsVar4.o();
                    f530 d6 = b.d(btsVar4, c530Var);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar3);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a2);
                    qje.W(btsVar4, d.e, o4);
                    wls wlsVar5 = d.g;
                    if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode4))) {
                        b64.z(hashCode4, btsVar4, hashCode4, wlsVar5);
                    }
                    qje.W(btsVar4, d.d, d6);
                    String str = obVar.d;
                    ldc ldcVar = obVar.e;
                    if (ldcVar == null) {
                        btsVar4.e0(-318504317);
                        j = ((el51) btsVar4.m(gl51.a)).p();
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-318505526);
                        btsVar4.t(false);
                        j = ldcVar.a;
                    }
                    ymb1.e(str, null, j, null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar4, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                    String str2 = obVar.f;
                    if (str2 == null) {
                        btsVar4.e0(-1283573684);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-1283573683);
                        ldc ldcVar2 = obVar.g;
                        if (ldcVar2 == null) {
                            btsVar4.e0(46348505);
                            j2 = ((el51) btsVar4.m(gl51.a)).o();
                            btsVar4.t(false);
                        } else {
                            btsVar4.e0(46347203);
                            btsVar4.t(false);
                            j2 = ldcVar2.a;
                        }
                        ymb1.f(str2, null, j2, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar4, 0, 0, 65530);
                        btsVar4.t(false);
                    }
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                spl splVar = (spl) obj4;
                gc5 gc5Var = (gc5) obj;
                ((Integer) obj3).getClass();
                return Boolean.valueOf((gc5Var instanceof jpl) && ((jpl) gc5Var).c.equals(splVar));
            case 5:
                final a aVar = (a) obj4;
                final int intValue5 = ((Integer) obj).intValue();
                if (((vu0) obj2) instanceof su0) {
                    lei leiVar = aVar.h.a;
                    if (intValue5 == 0) {
                        r14 = ((kei) leiVar.a.getValue()).c;
                    } else {
                        kei keiVar = (kei) kotlin.collections.a.S(intValue5 - 1, (List) leiVar.b.getValue());
                        if (keiVar != null) {
                            r14 = keiVar.c;
                        }
                    }
                    boj0 boj0Var = aVar.n;
                    final int i2 = r11 ? 1 : 0;
                    boj0Var.p(intValue5, r14, new tls() { // from class: ws0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i3 = i2;
                            zy11 zy11Var2 = zy11.a;
                            int i4 = intValue5;
                            a aVar2 = aVar;
                            s9e s9eVar = (s9e) obj5;
                            switch (i3) {
                                case 0:
                                    if (s9eVar != null) {
                                        aVar2.h.c(i4, s9eVar);
                                        break;
                                    }
                                    break;
                                default:
                                    aVar2.k.a.put(Integer.valueOf(i4), s9eVar);
                                    if (s9eVar != null) {
                                        aVar2.c.e(i4, s9eVar);
                                        break;
                                    }
                                    break;
                            }
                            return zy11Var2;
                        }
                    }, true);
                } else {
                    boj0 boj0Var2 = aVar.n;
                    final int i3 = r5 ? 1 : 0;
                    tls tlsVar2 = new tls() { // from class: ws0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i32 = i3;
                            zy11 zy11Var2 = zy11.a;
                            int i4 = intValue5;
                            a aVar2 = aVar;
                            s9e s9eVar = (s9e) obj5;
                            switch (i32) {
                                case 0:
                                    if (s9eVar != null) {
                                        aVar2.h.c(i4, s9eVar);
                                        break;
                                    }
                                    break;
                                default:
                                    aVar2.k.a.put(Integer.valueOf(i4), s9eVar);
                                    if (s9eVar != null) {
                                        aVar2.c.e(i4, s9eVar);
                                        break;
                                    }
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    qv0 qv0Var = (qv0) kotlin.collections.a.S(intValue5, ((f4l0) boj0Var2.b).getRoute().a);
                    boj0Var2.p(intValue5, qv0Var != null ? qv0Var.g : null, tlsVar2, false);
                }
                return zy11Var;
            case 6:
                j17 j17Var = (j17) obj4;
                fid fidVar5 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    ymb1.e(j17Var.a, null, ((el51) btsVar5.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar5, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                    if (j17Var.b) {
                        btsVar5.e0(-218645189);
                        ocb1.c(ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f), 0.0f, 0L, ldc.l, null, 0, null, btsVar5, HProv.ALG_TYPE_SECURECHANNEL, HProv.PP_INFO);
                        btsVar5.t(false);
                    } else {
                        btsVar5.e0(-218342474);
                        btsVar5.t(false);
                    }
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 7:
                ix0 ix0Var = (ix0) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar6 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((bts) fidVar6).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                    doa1.c(ibp0Var, ix0Var, null, btsVar6, intValue7 & 14);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 8:
                oq0 oq0Var = (oq0) obj4;
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar7 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar7).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    doa1.a(ebp0Var2, oq0Var, null, btsVar7, intValue8 & 14);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 9:
                PlainAddress plainAddress = (PlainAddress) obj4;
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar8 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((bts) fidVar8).k(ebp0Var3) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                    p9b1.c(ebp0Var3, plainAddress.getAddress().f, an91.o(c530.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), null, xya1.e(btsVar8).g.a, 5, 1, String.valueOf(plainAddress.getAddress().g), null, null, 5, 1, null, btsVar8, (intValue9 & 14) | 1769856, 54, 6532);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 10:
                h71 h71Var = (h71) obj4;
                fid fidVar9 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue10 & 1, (intValue10 & 17) != 16)) {
                    jeb1.f(h71Var.b, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 2, false, 0, 0, null, xya1.e(btsVar9).h.a, btsVar9, 805306752, 0, 15866);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 11:
                vn1 vn1Var = (vn1) obj4;
                fid fidVar10 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    s3b1.f(vn1Var.a, null, null, btsVar10, 0, 6);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 12:
                wo70 wo70Var = (wo70) obj4;
                fid fidVar11 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue12 & 1, (intValue12 & 17) != 16)) {
                    jeb1.f(wo70Var.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar11).g.b, btsVar11, 0, 0, 16382);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 13:
                onCreateView$lambda$12$lambda$11$lambda$10$lambda$9 = ArFragment.onCreateView$lambda$12$lambda$11$lambda$10$lambda$9((yx40) obj4, (mhl0) obj, (fid) obj2, ((Integer) obj3).intValue());
                return onCreateView$lambda$12$lambda$11$lambda$10$lambda$9;
            case 14:
                xd3 xd3Var = (xd3) obj4;
                fid fidVar12 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    sya1.a(xd3Var.a, null, xd3Var.c, null, btsVar12, 0, 10);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 15:
                qm5 qm5Var = (qm5) obj4;
                fid fidVar13 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                    jeb1.f(qm5Var.d, pfb1.b(c530Var, qm5Var.f, 14), AppColor$Palette.TextOnControl, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar13).g.b, btsVar13, 384, 0, 16376);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 16:
                kp5 kp5Var = (kp5) obj4;
                fid fidVar14 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    f530 o5 = an91.o(an91.m(c530Var, 0.0f, 12.0f, 1), 28.0f, 0.0f, 12.0f, 0.0f, 10);
                    lhl0 a3 = khl0.a(lr20.a, x4c.E, btsVar14, 48);
                    int hashCode5 = Long.hashCode(btsVar14.T);
                    r1b0 o6 = btsVar14.o();
                    f530 d7 = b.d(btsVar14, o5);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar14.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar14.i0();
                    if (btsVar14.S) {
                        btsVar14.n(slsVar4);
                    } else {
                        btsVar14.r0();
                    }
                    qje.W(btsVar14, d.f, a3);
                    qje.W(btsVar14, d.e, o6);
                    qje.W(btsVar14, d.g, Integer.valueOf(hashCode5));
                    qje.M(btsVar14, d.h);
                    x2y d8 = n.d(btsVar14, d7, d.d, 1.0f, false);
                    boolean z = kp5Var.c;
                    BidsBoostButtonUiState$BoostStyle bidsBoostButtonUiState$BoostStyle = kp5Var.b;
                    jeb1.f(kp5Var.a, ofb1.b(d8, z, null, 14), null, 0L, 0L, null, null, 0L, 2, false, 2, 0, null, xya1.c(btsVar14).g.c, btsVar14, 805306368, 48, 13820);
                    oeb1.c(btsVar14, ljs0.q(c530Var, 12.0f));
                    f530 l = ymb1.l(ljs0.m(c530Var, 48.0f), cyk0.a);
                    int[] iArr = ip5.a;
                    int i4 = iArr[bidsBoostButtonUiState$BoostStyle.ordinal()];
                    if (i4 == 1) {
                        j3 = hq2.b;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        j3 = zp2.a;
                    }
                    f530 k = an91.k(bzk0.c(l, new up2(j3), qke.q), 12.0f);
                    au2 b2 = cq91.b();
                    int i5 = iArr[bidsBoostButtonUiState$BoostStyle.ordinal()];
                    if (i5 == 1) {
                        wp2Var = AppColor$Palette.TextInvert;
                    } else {
                        if (i5 != 2) {
                            w511.b();
                            return null;
                        }
                        wp2Var = new up2(hq2.b);
                    }
                    sya1.a(b2, k, null, wp2Var, btsVar14, 0, 4);
                    btsVar14.t(true);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 17:
                dq5 dq5Var = (dq5) obj4;
                ebp0 ebp0Var4 = (ebp0) obj;
                fid fidVar15 = (fid) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((bts) fidVar15).k(ebp0Var4) ? 4 : 2;
                }
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue16 & 1, (intValue16 & 19) != 18)) {
                    p9b1.c(ebp0Var4, dq5Var.a, null, AppColor$Palette.Error, null, 0, 0, null, null, null, 0, 0, null, btsVar15, (intValue16 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0, 8186);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 18:
                cq5 cq5Var = (cq5) obj4;
                ebp0 ebp0Var5 = (ebp0) obj;
                fid fidVar16 = (fid) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((bts) fidVar16).k(ebp0Var5) ? 4 : 2;
                }
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue17 & 1, (intValue17 & 19) != 18)) {
                    p9b1.c(ebp0Var5, cq5Var.a, null, AppColor$Palette.Text, null, 0, 0, null, null, null, 0, 0, null, btsVar16, (intValue17 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0, 8186);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 19:
                tj7 tj7Var = (tj7) obj4;
                ebp0 ebp0Var6 = (ebp0) obj;
                fid fidVar17 = (fid) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((bts) fidVar17).k(ebp0Var6) ? 4 : 2;
                }
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue18 & 1, (intValue18 & 19) != 18)) {
                    p9b1.c(ebp0Var6, tj7Var.c, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar17, intValue18 & 14, 0, 8190);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 20:
                fv7 fv7Var = (fv7) obj4;
                fid fidVar18 = (fid) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(intValue19 & 1, (intValue19 & 17) != 16)) {
                    String str3 = fv7Var.c;
                    jeb1.f(str3 == null ? "" : str3, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar18).g.b, btsVar18, 0, 0, 16382);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            case 21:
                cz7 cz7Var = (cz7) obj4;
                fid fidVar19 = (fid) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue20 & 1, (intValue20 & 17) != 16)) {
                    String str4 = cz7Var.d.a;
                    jeb1.f(str4 == null ? "" : str4, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar19).g.b, btsVar19, 0, 0, 16382);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
            case 22:
                d47 d47Var = (d47) obj4;
                fid fidVar20 = (fid) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                bts btsVar20 = (bts) fidVar20;
                if (btsVar20.V(intValue21 & 1, (intValue21 & 17) != 16)) {
                    f530 l2 = an91.l(c530Var, 8.0f, 4.0f);
                    lhl0 a4 = khl0.a(new i43(2.0f, true, new quz(11)), x4c.E, btsVar20, 54);
                    int hashCode6 = Long.hashCode(btsVar20.T);
                    r1b0 o7 = btsVar20.o();
                    f530 d9 = b.d(btsVar20, l2);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (btsVar20.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar20.i0();
                    if (btsVar20.S) {
                        btsVar20.n(slsVar5);
                    } else {
                        btsVar20.r0();
                    }
                    qje.W(btsVar20, d.f, a4);
                    qje.W(btsVar20, d.e, o7);
                    qje.W(btsVar20, d.g, Integer.valueOf(hashCode6));
                    qje.M(btsVar20, d.h);
                    qje.W(btsVar20, d.d, d9);
                    String str5 = d47Var.b;
                    boolean z2 = str5 == null || evu0.J(str5);
                    boolean z3 = !z2;
                    tp2 tp2Var = tp2.a;
                    if (z2) {
                        btsVar20.e0(1004406204);
                        btsVar20.t(false);
                    } else {
                        btsVar20.e0(1004158018);
                        jeb1.f(d47Var.b, new x2y(1.0f, true), tp2Var, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar20).h.a, btsVar20, 805306752, 48, 13816);
                        btsVar20.t(false);
                    }
                    boolean a5 = btsVar20.a(z3);
                    Object Q = btsVar20.Q();
                    if (a5 || Q == did.a) {
                        Q = ly3.h(!z2 ? 12.0f : 20.0f, btsVar20);
                    }
                    sya1.a(d47Var.a, ljs0.m(c530Var, ((y7m) Q).a), null, tp2Var, btsVar20, HProv.ALG_TYPE_SECURECHANNEL, 4);
                    btsVar20.t(true);
                } else {
                    btsVar20.Y();
                }
                return zy11Var;
            case 23:
                return b(obj, obj2, obj3);
            case 24:
                return d(obj, obj2, obj3);
            case 25:
                return e(obj, obj2, obj3);
            case 26:
                return f(obj, obj2, obj3);
            case 27:
                return g(obj, obj2, obj3);
            case 28:
                f530 f530Var = (f530) obj4;
                fid fidVar21 = (fid) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                bts btsVar21 = (bts) fidVar21;
                if (btsVar21.V(intValue22 & 1, (intValue22 & 17) != 16)) {
                    jib1.a(f530Var, btsVar21, 0);
                } else {
                    btsVar21.Y();
                }
                return zy11Var;
            default:
                sea seaVar = (sea) obj4;
                fid fidVar22 = (fid) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                bts btsVar22 = (bts) fidVar22;
                if (btsVar22.V(intValue23 & 1, (intValue23 & 17) != 16)) {
                    qgy.b(seaVar.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar22).g.b, null, btsVar22, 0, 0, 12286);
                } else {
                    btsVar22.Y();
                }
                return zy11Var;
        }
    }
}
