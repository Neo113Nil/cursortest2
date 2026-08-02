package defpackage;

import android.content.Context;
import com.yandex.go.explorer.impl.data.database.ExplorerDatabase;
import com.yandex.go.explorer.impl.experiments.g;
import com.yandex.go.explorer.impl.geofencing.b;
import com.yandex.messaging.domain.experiments.a;
import com.yandex.messaging.experiments.ExperimentName;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import ru.yandex.taxi.widget.c;

/* loaded from: classes8.dex */
public final class hro implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ hro(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        ExperimentName experimentName;
        ConcurrentHashMap concurrentHashMap;
        yqo yqoVar;
        qro qroVar;
        ExperimentName experimentName2;
        ConcurrentHashMap concurrentHashMap2;
        yqo yqoVar2;
        qro qroVar2;
        ExperimentName experimentName3;
        ConcurrentHashMap concurrentHashMap3;
        yqo yqoVar3;
        qro qroVar3;
        tlg0 tlg0Var;
        ExperimentName experimentName4;
        ConcurrentHashMap concurrentHashMap4;
        yqo yqoVar4;
        qro qroVar4;
        ExperimentName experimentName5;
        ConcurrentHashMap concurrentHashMap5;
        yqo yqoVar5;
        qro qroVar5;
        ExperimentName experimentName6;
        ConcurrentHashMap concurrentHashMap6;
        yqo yqoVar6;
        qro qroVar6;
        ExperimentName experimentName7;
        ConcurrentHashMap concurrentHashMap7;
        yqo yqoVar7;
        qro qroVar7;
        ExperimentName experimentName8;
        ConcurrentHashMap concurrentHashMap8;
        yqo yqoVar8;
        qro qroVar8;
        int i = this.a;
        int i2 = 0;
        xqo xqoVar = a.i;
        Object obj = null;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                a aVar = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet = gro.a;
                String d = qoi0.a(b370.class).d();
                LinkedHashSet linkedHashSet2 = gro.a;
                if (linkedHashSet2.contains(d)) {
                    z83.i();
                }
                linkedHashSet2.add(d);
                b370 b370Var = new b370(xqoVar.b());
                ExperimentName[] values = ExperimentName.values();
                int length = values.length;
                while (true) {
                    if (i2 < length) {
                        experimentName = values[i2];
                        if (!jl40.l(experimentName.getToggleClass(), b370.class)) {
                            i2++;
                        }
                    } else {
                        experimentName = null;
                    }
                }
                if (experimentName != null) {
                    concurrentHashMap = aVar.g;
                    xqo xqoVar2 = (xqo) concurrentHashMap.get(experimentName);
                    if (xqoVar2 != null) {
                        obj = new b370(xqoVar2.b());
                    } else {
                        yqoVar = aVar.f;
                        nqo c = yqoVar.c(experimentName);
                        if (c != null) {
                            xqo xqoVar3 = new xqo(true, c.a());
                            b370 b370Var2 = new b370(xqoVar3.b());
                            try {
                                b370Var2.a();
                                b370Var = b370Var2;
                            } catch (JSONException unused) {
                                z83.i();
                                qroVar = aVar.d;
                                qroVar.a(experimentName.name(), xqoVar3.a());
                            }
                            a.d(aVar, experimentName, xqoVar3);
                        } else {
                            a.d(aVar, experimentName, xqoVar);
                        }
                        obj = b370Var;
                    }
                    linkedHashSet2.remove(d);
                } else {
                    ny61.r(nnm.g(b370.class, " not resolved"));
                }
                return obj;
            case 1:
                lqo lqoVar = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet3 = gro.a;
                String d2 = qoi0.a(qj80.class).d();
                LinkedHashSet linkedHashSet4 = gro.a;
                if (linkedHashSet4.contains(d2)) {
                    z83.i();
                }
                linkedHashSet4.add(d2);
                qj80 qj80Var = new qj80(lqoVar.a(tz10.C));
                linkedHashSet4.remove(d2);
                return qj80Var;
            case 2:
                a aVar2 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet5 = gro.a;
                String d3 = qoi0.a(nxe0.class).d();
                LinkedHashSet linkedHashSet6 = gro.a;
                if (linkedHashSet6.contains(d3)) {
                    z83.i();
                }
                linkedHashSet6.add(d3);
                nxe0 nxe0Var = new nxe0(xqoVar.b());
                ExperimentName[] values2 = ExperimentName.values();
                int length2 = values2.length;
                while (true) {
                    if (i2 < length2) {
                        experimentName2 = values2[i2];
                        if (!jl40.l(experimentName2.getToggleClass(), nxe0.class)) {
                            i2++;
                        }
                    } else {
                        experimentName2 = null;
                    }
                }
                if (experimentName2 != null) {
                    concurrentHashMap2 = aVar2.g;
                    xqo xqoVar4 = (xqo) concurrentHashMap2.get(experimentName2);
                    if (xqoVar4 != null) {
                        obj = new nxe0(xqoVar4.b());
                    } else {
                        yqoVar2 = aVar2.f;
                        nqo c2 = yqoVar2.c(experimentName2);
                        if (c2 != null) {
                            xqo xqoVar5 = new xqo(true, c2.a());
                            nxe0 nxe0Var2 = new nxe0(xqoVar5.b());
                            try {
                                nxe0Var2.a();
                                nxe0Var = nxe0Var2;
                            } catch (JSONException unused2) {
                                z83.i();
                                qroVar2 = aVar2.d;
                                qroVar2.a(experimentName2.name(), xqoVar5.a());
                            }
                            a.d(aVar2, experimentName2, xqoVar5);
                        } else {
                            a.d(aVar2, experimentName2, xqoVar);
                        }
                        obj = nxe0Var;
                    }
                    linkedHashSet6.remove(d3);
                } else {
                    ny61.r(nnm.g(nxe0.class, " not resolved"));
                }
                return obj;
            case 3:
                a aVar3 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet7 = gro.a;
                tlg0 tlg0Var2 = new tlg0(xqoVar.b());
                ExperimentName[] values3 = ExperimentName.values();
                int length3 = values3.length;
                while (true) {
                    if (i2 < length3) {
                        experimentName3 = values3[i2];
                        if (!jl40.l(experimentName3.getToggleClass(), tlg0.class)) {
                            i2++;
                        }
                    } else {
                        experimentName3 = null;
                    }
                }
                if (experimentName3 == null) {
                    ny61.r(nnm.g(tlg0.class, " not resolved"));
                    return null;
                }
                concurrentHashMap3 = aVar3.g;
                xqo xqoVar6 = (xqo) concurrentHashMap3.get(experimentName3);
                if (xqoVar6 != null) {
                    return new tlg0(xqoVar6.b());
                }
                yqoVar3 = aVar3.f;
                nqo c3 = yqoVar3.c(experimentName3);
                if (c3 == null) {
                    a.d(aVar3, experimentName3, xqoVar);
                    return tlg0Var2;
                }
                xqo xqoVar7 = new xqo(true, c3.a());
                tlg0 tlg0Var3 = new tlg0(xqoVar7.b());
                try {
                    tlg0Var3.a();
                    tlg0Var = tlg0Var3;
                } catch (JSONException unused3) {
                    z83.i();
                    qroVar3 = aVar3.d;
                    qroVar3.a(experimentName3.name(), xqoVar7.a());
                    tlg0Var = tlg0Var2;
                }
                a.d(aVar3, experimentName3, xqoVar7);
                return tlg0Var;
            case 4:
                a aVar4 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet8 = gro.a;
                String d4 = qoi0.a(tqq0.class).d();
                LinkedHashSet linkedHashSet9 = gro.a;
                if (linkedHashSet9.contains(d4)) {
                    z83.i();
                }
                linkedHashSet9.add(d4);
                tqq0 tqq0Var = new tqq0(xqoVar.b());
                ExperimentName[] values4 = ExperimentName.values();
                int length4 = values4.length;
                while (true) {
                    if (i2 < length4) {
                        experimentName4 = values4[i2];
                        if (!jl40.l(experimentName4.getToggleClass(), tqq0.class)) {
                            i2++;
                        }
                    } else {
                        experimentName4 = null;
                    }
                }
                if (experimentName4 != null) {
                    concurrentHashMap4 = aVar4.g;
                    xqo xqoVar8 = (xqo) concurrentHashMap4.get(experimentName4);
                    if (xqoVar8 != null) {
                        obj = new tqq0(xqoVar8.b());
                    } else {
                        yqoVar4 = aVar4.f;
                        nqo c4 = yqoVar4.c(experimentName4);
                        if (c4 != null) {
                            xqo xqoVar9 = new xqo(true, c4.a());
                            tqq0 tqq0Var2 = new tqq0(xqoVar9.b());
                            try {
                                tqq0Var2.a();
                                tqq0Var = tqq0Var2;
                            } catch (JSONException unused4) {
                                z83.i();
                                qroVar4 = aVar4.d;
                                qroVar4.a(experimentName4.name(), xqoVar9.a());
                            }
                            a.d(aVar4, experimentName4, xqoVar9);
                        } else {
                            a.d(aVar4, experimentName4, xqoVar);
                        }
                        obj = tqq0Var;
                    }
                    linkedHashSet9.remove(d4);
                } else {
                    ny61.r(nnm.g(tqq0.class, " not resolved"));
                }
                return obj;
            case 5:
                lqo lqoVar2 = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet10 = gro.a;
                String d5 = qoi0.a(u9u0.class).d();
                LinkedHashSet linkedHashSet11 = gro.a;
                if (linkedHashSet11.contains(d5)) {
                    z83.i();
                }
                linkedHashSet11.add(d5);
                u9u0 u9u0Var = new u9u0(lqoVar2.a(tz10.B));
                linkedHashSet11.remove(d5);
                return u9u0Var;
            case 6:
                a aVar5 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet12 = gro.a;
                String d6 = qoi0.a(rbv0.class).d();
                LinkedHashSet linkedHashSet13 = gro.a;
                if (linkedHashSet13.contains(d6)) {
                    z83.i();
                }
                linkedHashSet13.add(d6);
                rbv0 rbv0Var = new rbv0(xqoVar.b());
                ExperimentName[] values5 = ExperimentName.values();
                int length5 = values5.length;
                while (true) {
                    if (i2 < length5) {
                        experimentName5 = values5[i2];
                        if (!jl40.l(experimentName5.getToggleClass(), rbv0.class)) {
                            i2++;
                        }
                    } else {
                        experimentName5 = null;
                    }
                }
                if (experimentName5 != null) {
                    concurrentHashMap5 = aVar5.g;
                    xqo xqoVar10 = (xqo) concurrentHashMap5.get(experimentName5);
                    if (xqoVar10 != null) {
                        obj = new rbv0(xqoVar10.b());
                    } else {
                        yqoVar5 = aVar5.f;
                        nqo c5 = yqoVar5.c(experimentName5);
                        if (c5 != null) {
                            xqo xqoVar11 = new xqo(true, c5.a());
                            rbv0 rbv0Var2 = new rbv0(xqoVar11.b());
                            try {
                                rbv0Var2.a();
                                rbv0Var = rbv0Var2;
                            } catch (JSONException unused5) {
                                z83.i();
                                qroVar5 = aVar5.d;
                                qroVar5.a(experimentName5.name(), xqoVar11.a());
                            }
                            a.d(aVar5, experimentName5, xqoVar11);
                        } else {
                            a.d(aVar5, experimentName5, xqoVar);
                        }
                        obj = rbv0Var;
                    }
                    linkedHashSet13.remove(d6);
                } else {
                    ny61.r(nnm.g(rbv0.class, " not resolved"));
                }
                return obj;
            case 7:
                lqo lqoVar3 = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet14 = gro.a;
                String d7 = qoi0.a(rcy0.class).d();
                LinkedHashSet linkedHashSet15 = gro.a;
                if (linkedHashSet15.contains(d7)) {
                    z83.i();
                }
                linkedHashSet15.add(d7);
                rcy0 rcy0Var = new rcy0(lqoVar3.a(tz10.P));
                linkedHashSet15.remove(d7);
                return rcy0Var;
            case 8:
                a aVar6 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet16 = gro.a;
                String d8 = qoi0.a(pey0.class).d();
                LinkedHashSet linkedHashSet17 = gro.a;
                if (linkedHashSet17.contains(d8)) {
                    z83.i();
                }
                linkedHashSet17.add(d8);
                pey0 pey0Var = new pey0(xqoVar.b());
                ExperimentName[] values6 = ExperimentName.values();
                int length6 = values6.length;
                while (true) {
                    if (i2 < length6) {
                        experimentName6 = values6[i2];
                        if (!jl40.l(experimentName6.getToggleClass(), pey0.class)) {
                            i2++;
                        }
                    } else {
                        experimentName6 = null;
                    }
                }
                if (experimentName6 != null) {
                    concurrentHashMap6 = aVar6.g;
                    xqo xqoVar12 = (xqo) concurrentHashMap6.get(experimentName6);
                    if (xqoVar12 != null) {
                        obj = new pey0(xqoVar12.b());
                    } else {
                        yqoVar6 = aVar6.f;
                        nqo c6 = yqoVar6.c(experimentName6);
                        if (c6 != null) {
                            xqo xqoVar13 = new xqo(true, c6.a());
                            pey0 pey0Var2 = new pey0(xqoVar13.b());
                            try {
                                pey0Var2.a();
                                pey0Var = pey0Var2;
                            } catch (JSONException unused6) {
                                z83.i();
                                qroVar6 = aVar6.d;
                                qroVar6.a(experimentName6.name(), xqoVar13.a());
                            }
                            a.d(aVar6, experimentName6, xqoVar13);
                        } else {
                            a.d(aVar6, experimentName6, xqoVar);
                        }
                        obj = pey0Var;
                    }
                    linkedHashSet17.remove(d8);
                } else {
                    ny61.r(nnm.g(pey0.class, " not resolved"));
                }
                return obj;
            case 9:
                a aVar7 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet18 = gro.a;
                String d9 = qoi0.a(iv21.class).d();
                LinkedHashSet linkedHashSet19 = gro.a;
                if (linkedHashSet19.contains(d9)) {
                    z83.i();
                }
                linkedHashSet19.add(d9);
                iv21 iv21Var = new iv21(xqoVar.b());
                ExperimentName[] values7 = ExperimentName.values();
                int length7 = values7.length;
                while (true) {
                    if (i2 < length7) {
                        experimentName7 = values7[i2];
                        if (!jl40.l(experimentName7.getToggleClass(), iv21.class)) {
                            i2++;
                        }
                    } else {
                        experimentName7 = null;
                    }
                }
                if (experimentName7 != null) {
                    concurrentHashMap7 = aVar7.g;
                    xqo xqoVar14 = (xqo) concurrentHashMap7.get(experimentName7);
                    if (xqoVar14 != null) {
                        obj = new iv21(xqoVar14.b());
                    } else {
                        yqoVar7 = aVar7.f;
                        nqo c7 = yqoVar7.c(experimentName7);
                        if (c7 != null) {
                            xqo xqoVar15 = new xqo(true, c7.a());
                            iv21 iv21Var2 = new iv21(xqoVar15.b());
                            try {
                                iv21Var2.a();
                                iv21Var = iv21Var2;
                            } catch (JSONException unused7) {
                                z83.i();
                                qroVar7 = aVar7.d;
                                qroVar7.a(experimentName7.name(), xqoVar15.a());
                            }
                            a.d(aVar7, experimentName7, xqoVar15);
                        } else {
                            a.d(aVar7, experimentName7, xqoVar);
                        }
                        obj = iv21Var;
                    }
                    linkedHashSet19.remove(d9);
                } else {
                    ny61.r(nnm.g(iv21.class, " not resolved"));
                }
                return obj;
            case 10:
                a aVar8 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet20 = gro.a;
                String d10 = qoi0.a(wk31.class).d();
                LinkedHashSet linkedHashSet21 = gro.a;
                if (linkedHashSet21.contains(d10)) {
                    z83.i();
                }
                linkedHashSet21.add(d10);
                wk31 wk31Var = new wk31(xqoVar.b());
                ExperimentName[] values8 = ExperimentName.values();
                int length8 = values8.length;
                while (true) {
                    if (i2 < length8) {
                        experimentName8 = values8[i2];
                        if (!jl40.l(experimentName8.getToggleClass(), wk31.class)) {
                            i2++;
                        }
                    } else {
                        experimentName8 = null;
                    }
                }
                if (experimentName8 != null) {
                    concurrentHashMap8 = aVar8.g;
                    xqo xqoVar16 = (xqo) concurrentHashMap8.get(experimentName8);
                    if (xqoVar16 != null) {
                        obj = new wk31(xqoVar16.b());
                    } else {
                        yqoVar8 = aVar8.f;
                        nqo c8 = yqoVar8.c(experimentName8);
                        if (c8 != null) {
                            xqo xqoVar17 = new xqo(true, c8.a());
                            wk31 wk31Var2 = new wk31(xqoVar17.b());
                            try {
                                wk31Var2.a();
                                wk31Var = wk31Var2;
                            } catch (JSONException unused8) {
                                z83.i();
                                qroVar8 = aVar8.d;
                                qroVar8.a(experimentName8.name(), xqoVar17.a());
                            }
                            a.d(aVar8, experimentName8, xqoVar17);
                        } else {
                            a.d(aVar8, experimentName8, xqoVar);
                        }
                        obj = wk31Var;
                    }
                    linkedHashSet21.remove(d10);
                } else {
                    ny61.r(nnm.g(wk31.class, " not resolved"));
                }
                return obj;
            case 11:
                return new rro((rz10) xvf0Var.get());
            case 12:
                return new o61((pho) xvf0Var.get());
            case 13:
                return new ato((on2) xvf0Var.get());
            case 14:
                return bto.a((Context) xvf0Var.get());
            case 15:
                kto c9 = bto.c((ExplorerDatabase) xvf0Var.get());
                q5z.i(c9);
                return c9;
            case 16:
                return bto.b((Context) xvf0Var.get());
            case 17:
                return bto.d((Context) xvf0Var.get());
            case 18:
                return new g((rqo) xvf0Var.get());
            case 19:
                return new vto((Context) xvf0Var.get());
            case 20:
                return new b((Context) xvf0Var.get());
            case 21:
                return new cug((pho) xvf0Var.get());
            case 22:
                return new hxo((rqo) xvf0Var.get());
            case 23:
                return new u1p((rqo) xvf0Var.get());
            case 24:
                return new v1p((com.yandex.go.superapp.orders.known.b) xvf0Var.get());
            case 25:
                return new x2p((tt2) xvf0Var.get());
            case 26:
                return new com.yandex.go.order.ui.card.eats.a((c) xvf0Var.get());
            case 27:
                return new jc4((pho) xvf0Var.get());
            case 28:
                return new rx2((pho) xvf0Var.get());
            default:
                return new c9p((rqo) xvf0Var.get());
        }
    }
}
