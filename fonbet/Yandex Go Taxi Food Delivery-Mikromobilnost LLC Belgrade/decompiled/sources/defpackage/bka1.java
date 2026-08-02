package defpackage;

import com.yandex.go.fallback_experiment.network.FallbackExperimentApi;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.network.api.models.GoApiName;
import yads.d4;
import yads.h01;
import yads.x3;

/* loaded from: classes5.dex */
public abstract class bka1 {
    public static final void a(final xs xsVar, final tls tlsVar, fid fidVar, int i) {
        int i2;
        Pair pair;
        bts btsVar = (bts) fidVar;
        btsVar.g0(991666468);
        final int i3 = 2;
        final int i4 = 4;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(xsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        final int i5 = 1;
        final int i6 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i7 = us.a[xsVar.c.ordinal()];
            final int i8 = 3;
            if (i7 == 1) {
                btsVar.e0(-491258587);
                pair = new Pair(new y7m(32.0f), ((YandexShapes) btsVar.m(qm51.a)).e());
                btsVar.t(false);
            } else if (i7 == 2) {
                btsVar.e0(-491256733);
                pair = new Pair(new y7m(40.0f), ((YandexShapes) btsVar.m(qm51.a)).d());
                btsVar.t(false);
            } else if (i7 == 3) {
                btsVar.e0(-491254941);
                pair = new Pair(new y7m(48.0f), ((YandexShapes) btsVar.m(qm51.a)).b());
                btsVar.t(false);
            } else {
                if (i7 != 4) {
                    throw unr0.y(-491259994, btsVar, false);
                }
                btsVar.e0(-491253149);
                pair = new Pair(new y7m(56.0f), ((YandexShapes) btsVar.m(qm51.a)).b());
                btsVar.t(false);
            }
            float f = ((y7m) pair.getFirst()).a;
            byk0 byk0Var = (byk0) pair.getSecond();
            f530 e = ljs0.e(an91.j(ljs0.c(c530.a, 1.0f), xsVar.k), f);
            hka1 hka1Var = xsVar.e;
            boolean z = hka1Var instanceof ys;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(-491245517);
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q = btsVar.Q();
                if (z2 || Q == o430Var) {
                    Q = new sls() { // from class: ps
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i6;
                            zy11 zy11Var = zy11.a;
                            xs xsVar2 = xsVar;
                            tls tlsVar2 = tlsVar;
                            switch (i9) {
                                case 0:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 1:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 2:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 3:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                default:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q);
                }
                ys ysVar = (ys) hka1Var;
                a.b((sls) Q, e, cyk0.c(ysVar.c), ysVar.b, 0L, null, null, null, xsVar.f, null, null, null, wwg.S(746859581, true, new zls() { // from class: qs
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = i5;
                        zy11 zy11Var = zy11.a;
                        xs xsVar2 = xsVar;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i9) {
                            case 0:
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar2, 0);
                                    break;
                                }
                            case 1:
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar3, 0);
                                    break;
                                }
                            case 2:
                                bts btsVar4 = (bts) fidVar2;
                                if (!btsVar4.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar4, 0);
                                    break;
                                }
                            case 3:
                                bts btsVar5 = (bts) fidVar2;
                                if (!btsVar5.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar5, 0);
                                    break;
                                }
                            default:
                                bts btsVar6 = (bts) fidVar2;
                                if (!btsVar6.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar6, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, 0, 384, 3824);
                btsVar = btsVar;
                btsVar.t(false);
            } else if (hka1Var instanceof zs) {
                btsVar.e0(-491234353);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q2 = btsVar.Q();
                if (z3 || Q2 == o430Var) {
                    Q2 = new sls() { // from class: ps
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i5;
                            zy11 zy11Var = zy11.a;
                            xs xsVar2 = xsVar;
                            tls tlsVar2 = tlsVar;
                            switch (i9) {
                                case 0:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 1:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 2:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 3:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                default:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q2);
                }
                a.d((sls) Q2, e, byk0Var, 0L, 0L, null, null, xsVar.f, null, wwg.S(-589222836, true, new zls() { // from class: qs
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = i3;
                        zy11 zy11Var = zy11.a;
                        xs xsVar2 = xsVar;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i9) {
                            case 0:
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar2, 0);
                                    break;
                                }
                            case 1:
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar3, 0);
                                    break;
                                }
                            case 2:
                                bts btsVar4 = (bts) fidVar2;
                                if (!btsVar4.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar4, 0);
                                    break;
                                }
                            case 3:
                                bts btsVar5 = (bts) fidVar2;
                                if (!btsVar5.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar5, 0);
                                    break;
                                }
                            default:
                                bts btsVar6 = (bts) fidVar2;
                                if (!btsVar6.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar6, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, 0, 3832);
                btsVar.t(false);
            } else if (hka1Var instanceof at) {
                btsVar.e0(1951875710);
                btsVar.t(false);
            } else if (hka1Var instanceof bt) {
                btsVar.e0(-491222954);
                boolean z4 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q3 = btsVar.Q();
                if (z4 || Q3 == o430Var) {
                    Q3 = new sls() { // from class: ps
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i3;
                            zy11 zy11Var = zy11.a;
                            xs xsVar2 = xsVar;
                            tls tlsVar2 = tlsVar;
                            switch (i9) {
                                case 0:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 1:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 2:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 3:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                default:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q3);
                }
                a.a((sls) Q3, e, byk0Var, 0L, 0L, null, xsVar.f, null, null, null, wwg.S(415477306, true, new zls() { // from class: qs
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = i8;
                        zy11 zy11Var = zy11.a;
                        xs xsVar2 = xsVar;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i9) {
                            case 0:
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar2, 0);
                                    break;
                                }
                            case 1:
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar3, 0);
                                    break;
                                }
                            case 2:
                                bts btsVar4 = (bts) fidVar2;
                                if (!btsVar4.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar4, 0);
                                    break;
                                }
                            case 3:
                                bts btsVar5 = (bts) fidVar2;
                                if (!btsVar5.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar5, 0);
                                    break;
                                }
                            default:
                                bts btsVar6 = (bts) fidVar2;
                                if (!btsVar6.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar6, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, 0, 3832);
                btsVar = btsVar;
                btsVar.t(false);
            } else if (hka1Var instanceof ct) {
                btsVar.e0(-491213732);
                boolean z5 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q4 = btsVar.Q();
                if (z5 || Q4 == o430Var) {
                    Q4 = new sls() { // from class: ps
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i8;
                            zy11 zy11Var = zy11.a;
                            xs xsVar2 = xsVar;
                            tls tlsVar2 = tlsVar;
                            switch (i9) {
                                case 0:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 1:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 2:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 3:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                default:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q4);
                }
                a.b((sls) Q4, e, byk0Var, ((el51) btsVar.m(gl51.a)).g(), 0L, null, null, null, xsVar.f, null, null, null, wwg.S(1820380291, true, new zls() { // from class: qs
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = i4;
                        zy11 zy11Var = zy11.a;
                        xs xsVar2 = xsVar;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i9) {
                            case 0:
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar2, 0);
                                    break;
                                }
                            case 1:
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar3, 0);
                                    break;
                                }
                            case 2:
                                bts btsVar4 = (bts) fidVar2;
                                if (!btsVar4.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar4, 0);
                                    break;
                                }
                            case 3:
                                bts btsVar5 = (bts) fidVar2;
                                if (!btsVar5.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar5, 0);
                                    break;
                                }
                            default:
                                bts btsVar6 = (bts) fidVar2;
                                if (!btsVar6.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar6, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, 0, 384, 3824);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                if (!(hka1Var instanceof dt)) {
                    throw unr0.y(-491246646, btsVar, false);
                }
                btsVar.e0(-491203314);
                boolean z6 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q5 = btsVar.Q();
                if (z6 || Q5 == o430Var) {
                    Q5 = new sls() { // from class: ps
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i4;
                            zy11 zy11Var = zy11.a;
                            xs xsVar2 = xsVar;
                            tls tlsVar2 = tlsVar;
                            switch (i9) {
                                case 0:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 1:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 2:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                case 3:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                                default:
                                    tlsVar2.invoke(xsVar2.i);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q5);
                }
                a.f((sls) Q5, e, byk0Var, 0L, 0L, null, null, xsVar.f, null, null, null, wwg.S(-707828408, true, new zls() { // from class: qs
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = i6;
                        zy11 zy11Var = zy11.a;
                        xs xsVar2 = xsVar;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i9) {
                            case 0:
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar2, 0);
                                    break;
                                }
                            case 1:
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar3, 0);
                                    break;
                                }
                            case 2:
                                bts btsVar4 = (bts) fidVar2;
                                if (!btsVar4.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar4, 0);
                                    break;
                                }
                            case 3:
                                bts btsVar5 = (bts) fidVar2;
                                if (!btsVar5.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar5, 0);
                                    break;
                                }
                            default:
                                bts btsVar6 = (bts) fidVar2;
                                if (!btsVar6.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    bka1.b(xsVar2, btsVar6, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, 0, 3832);
                btsVar = btsVar;
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(xsVar, tlsVar, i, 6);
        }
    }

    public static final void b(xs xsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-720341842);
        int i2 = (btsVar.k(xsVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            rcb1.c(null, xsVar.h, 0, null, wwg.S(2042688448, true, new rs(xsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 13);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rs(xsVar, i);
        }
    }

    public static x3 c(gb81 gb81Var) {
        d4 d4Var;
        String b;
        int i = gb81Var != null ? gb81Var.a : -1;
        if (204 == i) {
            d4Var = d4.d;
        } else {
            Map map = gb81Var != null ? gb81Var.c : null;
            Integer valueOf = gb81Var != null ? Integer.valueOf(gb81Var.a) : null;
            boolean z = false;
            if (valueOf != null && 400 == valueOf.intValue() && map != null && (b = ob71.b(map, h01.N)) != null) {
                z = Boolean.parseBoolean(b);
            }
            d4Var = z ? d4.h : 403 == i ? d4.g : 404 == i ? d4.b : (500 > i || i > 599) ? -1 == i ? d4.l : d4.e : d4.f;
        }
        return new x3(d4Var, gb81Var);
    }

    public static int d(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2 && (i2 & 2) != 0) {
                    }
                } else if ((i2 & 1) == 0) {
                }
            }
            return i4;
        }
        return i;
    }

    public static FallbackExperimentApi e(on2 on2Var) {
        on2Var.getClass();
        return (FallbackExperimentApi) on2Var.a(GoApiName.TaxiV4, FallbackExperimentApi.class);
    }
}
