package defpackage;

import android.content.Context;
import com.yandex.go.order.external.b;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.settings.email.c;
import com.yandex.messaging.MessagingFlags$ForceUpdate;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.domain.experiments.a;
import com.yandex.messaging.experiments.ExperimentName;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class can implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ can(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    private final Object a() {
        ExperimentName experimentName;
        ConcurrentHashMap concurrentHashMap;
        yqo yqoVar;
        xy31 xy31Var;
        qro qroVar;
        a aVar = (a) this.b.get();
        lqo lqoVar = (lqo) this.c.get();
        LinkedHashSet linkedHashSet = gro.a;
        String d = qoi0.a(xy31.class).d();
        LinkedHashSet linkedHashSet2 = gro.a;
        if (linkedHashSet2.contains(d)) {
            z83.i();
        }
        linkedHashSet2.add(d);
        int i = 0;
        if (lqoVar.a(tz10.b)) {
            xqo xqoVar = a.i;
            xy31 xy31Var2 = new xy31(xqoVar.b());
            ExperimentName[] values = ExperimentName.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    experimentName = null;
                    break;
                }
                experimentName = values[i];
                if (jl40.l(experimentName.getToggleClass(), xy31.class)) {
                    break;
                }
                i++;
            }
            if (experimentName == null) {
                ny61.r(nnm.g(xy31.class, " not resolved"));
                return null;
            }
            concurrentHashMap = aVar.g;
            xqo xqoVar2 = (xqo) concurrentHashMap.get(experimentName);
            if (xqoVar2 != null) {
                xy31Var = new xy31(xqoVar2.b());
            } else {
                yqoVar = aVar.f;
                nqo c = yqoVar.c(experimentName);
                if (c != null) {
                    xqo xqoVar3 = new xqo(true, c.a());
                    xy31 xy31Var3 = new xy31(xqoVar3.b());
                    try {
                        xy31Var3.a();
                        xy31Var2 = xy31Var3;
                    } catch (JSONException unused) {
                        z83.i();
                        qroVar = aVar.d;
                        qroVar.a(experimentName.name(), xqoVar3.a());
                    }
                    a.d(aVar, experimentName, xqoVar3);
                } else {
                    a.d(aVar, experimentName, xqoVar);
                }
                xy31Var = xy31Var2;
            }
        } else {
            xy31Var = new xy31(false);
        }
        linkedHashSet2.remove(d);
        return xy31Var;
    }

    private final Object b() {
        ExperimentName experimentName;
        ConcurrentHashMap concurrentHashMap;
        yqo yqoVar;
        d041 d041Var;
        qro qroVar;
        lqo lqoVar = (lqo) this.b.get();
        a aVar = (a) this.c.get();
        LinkedHashSet linkedHashSet = gro.a;
        String d = qoi0.a(d041.class).d();
        LinkedHashSet linkedHashSet2 = gro.a;
        if (linkedHashSet2.contains(d)) {
            z83.i();
        }
        linkedHashSet2.add(d);
        int i = 0;
        if (lqoVar.a(tz10.Y)) {
            xqo xqoVar = a.i;
            d041 d041Var2 = new d041(xqoVar.b());
            ExperimentName[] values = ExperimentName.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    experimentName = null;
                    break;
                }
                experimentName = values[i];
                if (jl40.l(experimentName.getToggleClass(), d041.class)) {
                    break;
                }
                i++;
            }
            if (experimentName == null) {
                ny61.r(nnm.g(d041.class, " not resolved"));
                return null;
            }
            concurrentHashMap = aVar.g;
            xqo xqoVar2 = (xqo) concurrentHashMap.get(experimentName);
            if (xqoVar2 != null) {
                d041Var = new d041(xqoVar2.b());
            } else {
                yqoVar = aVar.f;
                nqo c = yqoVar.c(experimentName);
                if (c != null) {
                    xqo xqoVar3 = new xqo(true, c.a());
                    d041 d041Var3 = new d041(xqoVar3.b());
                    try {
                        d041Var3.a();
                        d041Var2 = d041Var3;
                    } catch (JSONException unused) {
                        z83.i();
                        qroVar = aVar.d;
                        qroVar.a(experimentName.name(), xqoVar3.a());
                    }
                    a.d(aVar, experimentName, xqoVar3);
                } else {
                    a.d(aVar, experimentName, xqoVar);
                }
                d041Var = d041Var2;
            }
        } else {
            d041Var = new d041(false);
        }
        linkedHashSet2.remove(d);
        return d041Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        ExperimentName experimentName;
        ConcurrentHashMap concurrentHashMap;
        yqo yqoVar;
        qro qroVar;
        rc4 rc4Var;
        ExperimentName experimentName2;
        ConcurrentHashMap concurrentHashMap2;
        yqo yqoVar2;
        qro qroVar2;
        ExperimentName experimentName3;
        ConcurrentHashMap concurrentHashMap3;
        yqo yqoVar3;
        qro qroVar3;
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
        ExperimentName experimentName9;
        ConcurrentHashMap concurrentHashMap9;
        yqo yqoVar9;
        qro qroVar9;
        ExperimentName experimentName10;
        ConcurrentHashMap concurrentHashMap10;
        yqo yqoVar10;
        qro qroVar10;
        ExperimentName experimentName11;
        ConcurrentHashMap concurrentHashMap11;
        yqo yqoVar11;
        qro qroVar11;
        ExperimentName experimentName12;
        ConcurrentHashMap concurrentHashMap12;
        yqo yqoVar12;
        qro qroVar12;
        ExperimentName experimentName13;
        ConcurrentHashMap concurrentHashMap13;
        yqo yqoVar13;
        qro qroVar13;
        ExperimentName experimentName14;
        ConcurrentHashMap concurrentHashMap14;
        yqo yqoVar14;
        qro qroVar14;
        ExperimentName experimentName15;
        ConcurrentHashMap concurrentHashMap15;
        yqo yqoVar15;
        qro qroVar15;
        ExperimentName experimentName16;
        ConcurrentHashMap concurrentHashMap16;
        yqo yqoVar16;
        qro qroVar16;
        ExperimentName experimentName17;
        ConcurrentHashMap concurrentHashMap17;
        yqo yqoVar17;
        qro qroVar17;
        int i = this.a;
        xqo xqoVar = a.i;
        int i2 = 0;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        Object obj = null;
        switch (i) {
            case 0:
                return new com.yandex.go.flex.common.divkit.a((Context) xvf0Var2.get(), (tse) xvf0Var.get());
            case 1:
                return new b((com.yandex.go.order.external.a) xvf0Var2.get(), (jtq0) xvf0Var.get());
            case 2:
                return new hzk((k7x0) xvf0Var2.get(), (pdc) xvf0Var.get());
            case 3:
                return new com.yandex.go.superapp.order.multi.old.eats.a((h) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 4:
                return new c((ru.yandex.taxi.settings.email.a) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 5:
                return new com.yandex.delivery.utils.dialogmanager.a((yuj0) xvf0Var2.get(), (com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var.get());
            case 6:
                return new ru.yandex.taxi.sdc.a((rco) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 7:
                return new hzk((yws) xvf0Var2.get(), (lk00) xvf0Var.get());
            case 8:
                lqo lqoVar = (lqo) xvf0Var2.get();
                a aVar = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet = gro.a;
                String d = qoi0.a(rc4.class).d();
                LinkedHashSet linkedHashSet2 = gro.a;
                if (linkedHashSet2.contains(d)) {
                    z83.i();
                }
                linkedHashSet2.add(d);
                if (!lqoVar.a(tz10.P)) {
                    rc4Var = new rc4(false);
                } else {
                    if (!lqoVar.a(tz10.T)) {
                        rc4 rc4Var2 = new rc4(xqoVar.b());
                        ExperimentName[] values = ExperimentName.values();
                        int length = values.length;
                        while (true) {
                            if (i2 < length) {
                                experimentName = values[i2];
                                if (!jl40.l(experimentName.getToggleClass(), rc4.class)) {
                                    i2++;
                                }
                            } else {
                                experimentName = null;
                            }
                        }
                        if (experimentName == null) {
                            ny61.r(nnm.g(rc4.class, " not resolved"));
                            return obj;
                        }
                        concurrentHashMap = aVar.g;
                        xqo xqoVar2 = (xqo) concurrentHashMap.get(experimentName);
                        if (xqoVar2 != null) {
                            rc4Var2 = new rc4(xqoVar2.b());
                        } else {
                            yqoVar = aVar.f;
                            nqo c = yqoVar.c(experimentName);
                            if (c != null) {
                                xqo xqoVar3 = new xqo(true, c.a());
                                rc4 rc4Var3 = new rc4(xqoVar3.b());
                                try {
                                    rc4Var3.a();
                                    rc4Var2 = rc4Var3;
                                } catch (JSONException unused) {
                                    z83.i();
                                    qroVar = aVar.d;
                                    qroVar.a(experimentName.name(), xqoVar3.a());
                                }
                                a.d(aVar, experimentName, xqoVar3);
                            } else {
                                a.d(aVar, experimentName, xqoVar);
                            }
                        }
                        obj = rc4Var2;
                        linkedHashSet2.remove(d);
                        return obj;
                    }
                    rc4Var = new rc4(true);
                }
                obj = rc4Var;
                linkedHashSet2.remove(d);
                return obj;
            case 9:
                a aVar2 = (a) xvf0Var2.get();
                lqo lqoVar2 = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet3 = gro.a;
                String d2 = qoi0.a(ya6.class).d();
                LinkedHashSet linkedHashSet4 = gro.a;
                if (linkedHashSet4.contains(d2)) {
                    z83.i();
                }
                linkedHashSet4.add(d2);
                if (lqoVar2.a(tz10.K)) {
                    ya6 ya6Var = new ya6(xqoVar.b());
                    ExperimentName[] values2 = ExperimentName.values();
                    int length2 = values2.length;
                    while (true) {
                        if (i2 < length2) {
                            experimentName2 = values2[i2];
                            if (!jl40.l(experimentName2.getToggleClass(), ya6.class)) {
                                i2++;
                            }
                        } else {
                            experimentName2 = null;
                        }
                    }
                    if (experimentName2 == null) {
                        ny61.r(nnm.g(ya6.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap2 = aVar2.g;
                    xqo xqoVar4 = (xqo) concurrentHashMap2.get(experimentName2);
                    if (xqoVar4 != null) {
                        ya6Var = new ya6(xqoVar4.b());
                    } else {
                        yqoVar2 = aVar2.f;
                        nqo c2 = yqoVar2.c(experimentName2);
                        if (c2 != null) {
                            xqo xqoVar5 = new xqo(true, c2.a());
                            ya6 ya6Var2 = new ya6(xqoVar5.b());
                            try {
                                ya6Var2.a();
                                ya6Var = ya6Var2;
                            } catch (JSONException unused2) {
                                z83.i();
                                qroVar2 = aVar2.d;
                                qroVar2.a(experimentName2.name(), xqoVar5.a());
                            }
                            a.d(aVar2, experimentName2, xqoVar5);
                        } else {
                            a.d(aVar2, experimentName2, xqoVar);
                        }
                    }
                    obj = ya6Var;
                } else {
                    obj = new ya6(false);
                }
                linkedHashSet4.remove(d2);
                return obj;
            case 10:
                lqo lqoVar3 = (lqo) xvf0Var2.get();
                a aVar3 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet5 = gro.a;
                String d3 = qoi0.a(uf7.class).d();
                LinkedHashSet linkedHashSet6 = gro.a;
                if (linkedHashSet6.contains(d3)) {
                    z83.i();
                }
                linkedHashSet6.add(d3);
                if (lqoVar3.a(tz10.P)) {
                    uf7 uf7Var = new uf7(xqoVar.b());
                    ExperimentName[] values3 = ExperimentName.values();
                    int length3 = values3.length;
                    while (true) {
                        if (i2 < length3) {
                            experimentName3 = values3[i2];
                            if (!jl40.l(experimentName3.getToggleClass(), uf7.class)) {
                                i2++;
                            }
                        } else {
                            experimentName3 = null;
                        }
                    }
                    if (experimentName3 == null) {
                        ny61.r(nnm.g(uf7.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap3 = aVar3.g;
                    xqo xqoVar6 = (xqo) concurrentHashMap3.get(experimentName3);
                    if (xqoVar6 != null) {
                        uf7Var = new uf7(xqoVar6.b());
                    } else {
                        yqoVar3 = aVar3.f;
                        nqo c3 = yqoVar3.c(experimentName3);
                        if (c3 != null) {
                            xqo xqoVar7 = new xqo(true, c3.a());
                            uf7 uf7Var2 = new uf7(xqoVar7.b());
                            try {
                                uf7Var2.a();
                                uf7Var = uf7Var2;
                            } catch (JSONException unused3) {
                                z83.i();
                                qroVar3 = aVar3.d;
                                qroVar3.a(experimentName3.name(), xqoVar7.a());
                            }
                            a.d(aVar3, experimentName3, xqoVar7);
                        } else {
                            a.d(aVar3, experimentName3, xqoVar);
                        }
                    }
                    obj = uf7Var;
                } else {
                    obj = new uf7(false);
                }
                linkedHashSet6.remove(d3);
                return obj;
            case 11:
                a aVar4 = (a) xvf0Var2.get();
                tnq tnqVar = (tnq) xvf0Var.get();
                LinkedHashSet linkedHashSet7 = gro.a;
                String d4 = qoi0.a(y6b.class).d();
                LinkedHashSet linkedHashSet8 = gro.a;
                if (linkedHashSet8.contains(d4)) {
                    z83.i();
                }
                linkedHashSet8.add(d4);
                if (tnqVar.c) {
                    y6b y6bVar = new y6b(xqoVar.b());
                    ExperimentName[] values4 = ExperimentName.values();
                    int length4 = values4.length;
                    while (true) {
                        if (i2 < length4) {
                            experimentName4 = values4[i2];
                            if (!jl40.l(experimentName4.getToggleClass(), y6b.class)) {
                                i2++;
                            }
                        } else {
                            experimentName4 = null;
                        }
                    }
                    if (experimentName4 == null) {
                        ny61.r(nnm.g(y6b.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap4 = aVar4.g;
                    xqo xqoVar8 = (xqo) concurrentHashMap4.get(experimentName4);
                    if (xqoVar8 != null) {
                        y6bVar = new y6b(xqoVar8.b());
                    } else {
                        yqoVar4 = aVar4.f;
                        nqo c4 = yqoVar4.c(experimentName4);
                        if (c4 != null) {
                            xqo xqoVar9 = new xqo(true, c4.a());
                            y6b y6bVar2 = new y6b(xqoVar9.b());
                            try {
                                y6bVar2.a();
                                y6bVar = y6bVar2;
                            } catch (JSONException unused4) {
                                z83.i();
                                qroVar4 = aVar4.d;
                                qroVar4.a(experimentName4.name(), xqoVar9.a());
                            }
                            a.d(aVar4, experimentName4, xqoVar9);
                        } else {
                            a.d(aVar4, experimentName4, xqoVar);
                        }
                    }
                    obj = y6bVar;
                } else {
                    obj = new y6b(false);
                }
                linkedHashSet8.remove(d4);
                return obj;
            case 12:
                lqo lqoVar4 = (lqo) xvf0Var2.get();
                a aVar5 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet9 = gro.a;
                String d5 = qoi0.a(j6m.class).d();
                LinkedHashSet linkedHashSet10 = gro.a;
                if (linkedHashSet10.contains(d5)) {
                    z83.i();
                }
                linkedHashSet10.add(d5);
                if (lqoVar4.a(tz10.X)) {
                    obj = new j6m(true);
                } else {
                    j6m j6mVar = new j6m(xqoVar.b());
                    ExperimentName[] values5 = ExperimentName.values();
                    int length5 = values5.length;
                    while (true) {
                        if (i2 < length5) {
                            experimentName5 = values5[i2];
                            if (!jl40.l(experimentName5.getToggleClass(), j6m.class)) {
                                i2++;
                            }
                        } else {
                            experimentName5 = null;
                        }
                    }
                    if (experimentName5 == null) {
                        ny61.r(nnm.g(j6m.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap5 = aVar5.g;
                    xqo xqoVar10 = (xqo) concurrentHashMap5.get(experimentName5);
                    if (xqoVar10 != null) {
                        j6mVar = new j6m(xqoVar10.b());
                    } else {
                        yqoVar5 = aVar5.f;
                        nqo c5 = yqoVar5.c(experimentName5);
                        if (c5 != null) {
                            xqo xqoVar11 = new xqo(true, c5.a());
                            j6m j6mVar2 = new j6m(xqoVar11.b());
                            try {
                                j6mVar2.a();
                                j6mVar = j6mVar2;
                            } catch (JSONException unused5) {
                                z83.i();
                                qroVar5 = aVar5.d;
                                qroVar5.a(experimentName5.name(), xqoVar11.a());
                            }
                            a.d(aVar5, experimentName5, xqoVar11);
                        } else {
                            a.d(aVar5, experimentName5, xqoVar);
                        }
                    }
                    obj = j6mVar;
                }
                linkedHashSet10.remove(d5);
                return obj;
            case 13:
                a aVar6 = (a) xvf0Var2.get();
                lqo lqoVar5 = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet11 = gro.a;
                String d6 = qoi0.a(msn.class).d();
                LinkedHashSet linkedHashSet12 = gro.a;
                if (linkedHashSet12.contains(d6)) {
                    z83.i();
                }
                linkedHashSet12.add(d6);
                if (lqoVar5.a(tz10.f)) {
                    msn msnVar = new msn(xqoVar.b());
                    ExperimentName[] values6 = ExperimentName.values();
                    int length6 = values6.length;
                    while (true) {
                        if (i2 < length6) {
                            experimentName6 = values6[i2];
                            if (!jl40.l(experimentName6.getToggleClass(), msn.class)) {
                                i2++;
                            }
                        } else {
                            experimentName6 = null;
                        }
                    }
                    if (experimentName6 == null) {
                        ny61.r(nnm.g(msn.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap6 = aVar6.g;
                    xqo xqoVar12 = (xqo) concurrentHashMap6.get(experimentName6);
                    if (xqoVar12 != null) {
                        msnVar = new msn(xqoVar12.b());
                    } else {
                        yqoVar6 = aVar6.f;
                        nqo c6 = yqoVar6.c(experimentName6);
                        if (c6 != null) {
                            xqo xqoVar13 = new xqo(true, c6.a());
                            msn msnVar2 = new msn(xqoVar13.b());
                            try {
                                msnVar2.a();
                                msnVar = msnVar2;
                            } catch (JSONException unused6) {
                                z83.i();
                                qroVar6 = aVar6.d;
                                qroVar6.a(experimentName6.name(), xqoVar13.a());
                            }
                            a.d(aVar6, experimentName6, xqoVar13);
                        } else {
                            a.d(aVar6, experimentName6, xqoVar);
                        }
                    }
                    obj = msnVar;
                } else {
                    obj = new msn(false);
                }
                linkedHashSet12.remove(d6);
                return obj;
            case 14:
                lqo lqoVar6 = (lqo) xvf0Var2.get();
                a aVar7 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet13 = gro.a;
                String d7 = qoi0.a(zxo.class).d();
                LinkedHashSet linkedHashSet14 = gro.a;
                if (linkedHashSet14.contains(d7)) {
                    z83.i();
                }
                linkedHashSet14.add(d7);
                if (lqoVar6.a(tz10.U)) {
                    zxo zxoVar = new zxo(xqoVar.b());
                    ExperimentName[] values7 = ExperimentName.values();
                    int length7 = values7.length;
                    while (true) {
                        if (i2 < length7) {
                            experimentName7 = values7[i2];
                            if (!jl40.l(experimentName7.getToggleClass(), zxo.class)) {
                                i2++;
                            }
                        } else {
                            experimentName7 = null;
                        }
                    }
                    if (experimentName7 == null) {
                        ny61.r(nnm.g(zxo.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap7 = aVar7.g;
                    xqo xqoVar14 = (xqo) concurrentHashMap7.get(experimentName7);
                    if (xqoVar14 != null) {
                        zxoVar = new zxo(xqoVar14.b());
                    } else {
                        yqoVar7 = aVar7.f;
                        nqo c7 = yqoVar7.c(experimentName7);
                        if (c7 != null) {
                            xqo xqoVar15 = new xqo(true, c7.a());
                            zxo zxoVar2 = new zxo(xqoVar15.b());
                            try {
                                zxoVar2.a();
                                zxoVar = zxoVar2;
                            } catch (JSONException unused7) {
                                z83.i();
                                qroVar7 = aVar7.d;
                                qroVar7.a(experimentName7.name(), xqoVar15.a());
                            }
                            a.d(aVar7, experimentName7, xqoVar15);
                        } else {
                            a.d(aVar7, experimentName7, xqoVar);
                        }
                    }
                    obj = zxoVar;
                } else {
                    obj = new zxo(false);
                }
                linkedHashSet14.remove(d7);
                return obj;
            case 15:
                a aVar8 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet15 = gro.a;
                String d8 = qoi0.a(k2s.class).d();
                LinkedHashSet linkedHashSet16 = gro.a;
                if (linkedHashSet16.contains(d8)) {
                    z83.i();
                }
                linkedHashSet16.add(d8);
                if (((MessagingFlags$ForceUpdate) ((Enum) tz10.Q.b)) == MessagingFlags$ForceUpdate.DISABLED) {
                    obj = new k2s(false);
                } else {
                    k2s k2sVar = new k2s(xqoVar.b());
                    ExperimentName[] values8 = ExperimentName.values();
                    int length8 = values8.length;
                    while (true) {
                        if (i2 < length8) {
                            experimentName8 = values8[i2];
                            if (!jl40.l(experimentName8.getToggleClass(), k2s.class)) {
                                i2++;
                            }
                        } else {
                            experimentName8 = null;
                        }
                    }
                    if (experimentName8 == null) {
                        ny61.r(nnm.g(k2s.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap8 = aVar8.g;
                    xqo xqoVar16 = (xqo) concurrentHashMap8.get(experimentName8);
                    if (xqoVar16 != null) {
                        k2sVar = new k2s(xqoVar16.b());
                    } else {
                        yqoVar8 = aVar8.f;
                        nqo c8 = yqoVar8.c(experimentName8);
                        if (c8 != null) {
                            xqo xqoVar17 = new xqo(true, c8.a());
                            k2s k2sVar2 = new k2s(xqoVar17.b());
                            try {
                                k2sVar2.a();
                                k2sVar = k2sVar2;
                            } catch (JSONException unused8) {
                                z83.i();
                                qroVar8 = aVar8.d;
                                qroVar8.a(experimentName8.name(), xqoVar17.a());
                            }
                            a.d(aVar8, experimentName8, xqoVar17);
                        } else {
                            a.d(aVar8, experimentName8, xqoVar);
                        }
                    }
                    obj = k2sVar;
                }
                linkedHashSet16.remove(d8);
                return obj;
            case 16:
                a aVar9 = (a) xvf0Var2.get();
                lqo lqoVar7 = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet17 = gro.a;
                String d9 = qoi0.a(mst.class).d();
                LinkedHashSet linkedHashSet18 = gro.a;
                if (linkedHashSet18.contains(d9)) {
                    z83.i();
                }
                linkedHashSet18.add(d9);
                if (lqoVar7.a(tz10.F)) {
                    obj = new mst(true);
                } else {
                    mst mstVar = new mst(xqoVar.b());
                    ExperimentName[] values9 = ExperimentName.values();
                    int length9 = values9.length;
                    while (true) {
                        if (i2 < length9) {
                            experimentName9 = values9[i2];
                            if (!jl40.l(experimentName9.getToggleClass(), mst.class)) {
                                i2++;
                            }
                        } else {
                            experimentName9 = null;
                        }
                    }
                    if (experimentName9 == null) {
                        ny61.r(nnm.g(mst.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap9 = aVar9.g;
                    xqo xqoVar18 = (xqo) concurrentHashMap9.get(experimentName9);
                    if (xqoVar18 != null) {
                        mstVar = new mst(xqoVar18.b());
                    } else {
                        yqoVar9 = aVar9.f;
                        nqo c9 = yqoVar9.c(experimentName9);
                        if (c9 != null) {
                            xqo xqoVar19 = new xqo(true, c9.a());
                            mst mstVar2 = new mst(xqoVar19.b());
                            try {
                                mstVar2.a();
                                mstVar = mstVar2;
                            } catch (JSONException unused9) {
                                z83.i();
                                qroVar9 = aVar9.d;
                                qroVar9.a(experimentName9.name(), xqoVar19.a());
                            }
                            a.d(aVar9, experimentName9, xqoVar19);
                        } else {
                            a.d(aVar9, experimentName9, xqoVar);
                        }
                    }
                    obj = mstVar;
                }
                linkedHashSet18.remove(d9);
                return obj;
            case 17:
                a aVar10 = (a) xvf0Var2.get();
                lqo lqoVar8 = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet19 = gro.a;
                String d10 = qoi0.a(e4u.class).d();
                LinkedHashSet linkedHashSet20 = gro.a;
                if (linkedHashSet20.contains(d10)) {
                    z83.i();
                }
                linkedHashSet20.add(d10);
                if (lqoVar8.a(tz10.L)) {
                    e4u e4uVar = new e4u(xqoVar.b());
                    ExperimentName[] values10 = ExperimentName.values();
                    int length10 = values10.length;
                    while (true) {
                        if (i2 < length10) {
                            experimentName10 = values10[i2];
                            if (!jl40.l(experimentName10.getToggleClass(), e4u.class)) {
                                i2++;
                            }
                        } else {
                            experimentName10 = null;
                        }
                    }
                    if (experimentName10 == null) {
                        ny61.r(nnm.g(e4u.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap10 = aVar10.g;
                    xqo xqoVar20 = (xqo) concurrentHashMap10.get(experimentName10);
                    if (xqoVar20 != null) {
                        e4uVar = new e4u(xqoVar20.b());
                    } else {
                        yqoVar10 = aVar10.f;
                        nqo c10 = yqoVar10.c(experimentName10);
                        if (c10 != null) {
                            xqo xqoVar21 = new xqo(true, c10.a());
                            e4u e4uVar2 = new e4u(xqoVar21.b());
                            try {
                                e4uVar2.a();
                                e4uVar = e4uVar2;
                            } catch (JSONException unused10) {
                                z83.i();
                                qroVar10 = aVar10.d;
                                qroVar10.a(experimentName10.name(), xqoVar21.a());
                            }
                            a.d(aVar10, experimentName10, xqoVar21);
                        } else {
                            a.d(aVar10, experimentName10, xqoVar);
                        }
                    }
                    obj = e4uVar;
                } else {
                    obj = new e4u(false);
                }
                linkedHashSet20.remove(d10);
                return obj;
            case 18:
                a aVar11 = (a) xvf0Var2.get();
                lqo lqoVar9 = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet21 = gro.a;
                String d11 = qoi0.a(nxv.class).d();
                LinkedHashSet linkedHashSet22 = gro.a;
                if (linkedHashSet22.contains(d11)) {
                    z83.i();
                }
                linkedHashSet22.add(d11);
                if (lqoVar9.a(tz10.e)) {
                    nxv nxvVar = new nxv(xqoVar.b());
                    ExperimentName[] values11 = ExperimentName.values();
                    int length11 = values11.length;
                    while (true) {
                        if (i2 < length11) {
                            experimentName11 = values11[i2];
                            if (!jl40.l(experimentName11.getToggleClass(), nxv.class)) {
                                i2++;
                            }
                        } else {
                            experimentName11 = null;
                        }
                    }
                    if (experimentName11 == null) {
                        ny61.r(nnm.g(nxv.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap11 = aVar11.g;
                    xqo xqoVar22 = (xqo) concurrentHashMap11.get(experimentName11);
                    if (xqoVar22 != null) {
                        nxvVar = new nxv(xqoVar22.b());
                    } else {
                        yqoVar11 = aVar11.f;
                        nqo c11 = yqoVar11.c(experimentName11);
                        if (c11 != null) {
                            xqo xqoVar23 = new xqo(true, c11.a());
                            nxv nxvVar2 = new nxv(xqoVar23.b());
                            try {
                                nxvVar2.a();
                                nxvVar = nxvVar2;
                            } catch (JSONException unused11) {
                                z83.i();
                                qroVar11 = aVar11.d;
                                qroVar11.a(experimentName11.name(), xqoVar23.a());
                            }
                            a.d(aVar11, experimentName11, xqoVar23);
                        } else {
                            a.d(aVar11, experimentName11, xqoVar);
                        }
                    }
                    obj = nxvVar;
                } else {
                    obj = new nxv(false);
                }
                linkedHashSet22.remove(d11);
                return obj;
            case 19:
                lqo lqoVar10 = (lqo) xvf0Var2.get();
                a aVar12 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet23 = gro.a;
                String d12 = qoi0.a(iww.class).d();
                LinkedHashSet linkedHashSet24 = gro.a;
                if (linkedHashSet24.contains(d12)) {
                    z83.i();
                }
                linkedHashSet24.add(d12);
                if (lqoVar10.a(tz10.N)) {
                    iww iwwVar = new iww(xqoVar.b());
                    ExperimentName[] values12 = ExperimentName.values();
                    int length12 = values12.length;
                    while (true) {
                        if (i2 < length12) {
                            experimentName12 = values12[i2];
                            if (!jl40.l(experimentName12.getToggleClass(), iww.class)) {
                                i2++;
                            }
                        } else {
                            experimentName12 = null;
                        }
                    }
                    if (experimentName12 == null) {
                        ny61.r(nnm.g(iww.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap12 = aVar12.g;
                    xqo xqoVar24 = (xqo) concurrentHashMap12.get(experimentName12);
                    if (xqoVar24 != null) {
                        iwwVar = new iww(xqoVar24.b());
                    } else {
                        yqoVar12 = aVar12.f;
                        nqo c12 = yqoVar12.c(experimentName12);
                        if (c12 != null) {
                            xqo xqoVar25 = new xqo(true, c12.a());
                            iww iwwVar2 = new iww(xqoVar25.b());
                            try {
                                iwwVar2.a();
                                iwwVar = iwwVar2;
                            } catch (JSONException unused12) {
                                z83.i();
                                qroVar12 = aVar12.d;
                                qroVar12.a(experimentName12.name(), xqoVar25.a());
                            }
                            a.d(aVar12, experimentName12, xqoVar25);
                        } else {
                            a.d(aVar12, experimentName12, xqoVar);
                        }
                    }
                    obj = iwwVar;
                } else {
                    obj = new iww(false);
                }
                linkedHashSet24.remove(d12);
                return obj;
            case 20:
                lqo lqoVar11 = (lqo) xvf0Var2.get();
                a aVar13 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet25 = gro.a;
                String d13 = qoi0.a(kai0.class).d();
                LinkedHashSet linkedHashSet26 = gro.a;
                if (linkedHashSet26.contains(d13)) {
                    z83.i();
                }
                linkedHashSet26.add(d13);
                if (lqoVar11.a(tz10.Z)) {
                    obj = new kai0(true);
                } else {
                    kai0 kai0Var = new kai0(xqoVar.b());
                    ExperimentName[] values13 = ExperimentName.values();
                    int length13 = values13.length;
                    while (true) {
                        if (i2 < length13) {
                            experimentName13 = values13[i2];
                            if (!jl40.l(experimentName13.getToggleClass(), kai0.class)) {
                                i2++;
                            }
                        } else {
                            experimentName13 = null;
                        }
                    }
                    if (experimentName13 == null) {
                        ny61.r(nnm.g(kai0.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap13 = aVar13.g;
                    xqo xqoVar26 = (xqo) concurrentHashMap13.get(experimentName13);
                    if (xqoVar26 != null) {
                        kai0Var = new kai0(xqoVar26.b());
                    } else {
                        yqoVar13 = aVar13.f;
                        nqo c13 = yqoVar13.c(experimentName13);
                        if (c13 != null) {
                            xqo xqoVar27 = new xqo(true, c13.a());
                            kai0 kai0Var2 = new kai0(xqoVar27.b());
                            try {
                                kai0Var2.a();
                                kai0Var = kai0Var2;
                            } catch (JSONException unused13) {
                                z83.i();
                                qroVar13 = aVar13.d;
                                qroVar13.a(experimentName13.name(), xqoVar27.a());
                            }
                            a.d(aVar13, experimentName13, xqoVar27);
                        } else {
                            a.d(aVar13, experimentName13, xqoVar);
                        }
                    }
                    obj = kai0Var;
                }
                linkedHashSet26.remove(d13);
                return obj;
            case 21:
                lqo lqoVar12 = (lqo) xvf0Var2.get();
                a aVar14 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet27 = gro.a;
                String d14 = qoi0.a(wii0.class).d();
                LinkedHashSet linkedHashSet28 = gro.a;
                if (linkedHashSet28.contains(d14)) {
                    z83.i();
                }
                linkedHashSet28.add(d14);
                if (lqoVar12.a(tz10.P)) {
                    wii0 wii0Var = new wii0(xqoVar.b());
                    ExperimentName[] values14 = ExperimentName.values();
                    int length14 = values14.length;
                    while (true) {
                        if (i2 < length14) {
                            experimentName14 = values14[i2];
                            if (!jl40.l(experimentName14.getToggleClass(), wii0.class)) {
                                i2++;
                            }
                        } else {
                            experimentName14 = null;
                        }
                    }
                    if (experimentName14 == null) {
                        ny61.r(nnm.g(wii0.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap14 = aVar14.g;
                    xqo xqoVar28 = (xqo) concurrentHashMap14.get(experimentName14);
                    if (xqoVar28 != null) {
                        wii0Var = new wii0(xqoVar28.b());
                    } else {
                        yqoVar14 = aVar14.f;
                        nqo c14 = yqoVar14.c(experimentName14);
                        if (c14 != null) {
                            xqo xqoVar29 = new xqo(true, c14.a());
                            wii0 wii0Var2 = new wii0(xqoVar29.b());
                            try {
                                wii0Var2.a();
                                wii0Var = wii0Var2;
                            } catch (JSONException unused14) {
                                z83.i();
                                qroVar14 = aVar14.d;
                                qroVar14.a(experimentName14.name(), xqoVar29.a());
                            }
                            a.d(aVar14, experimentName14, xqoVar29);
                        } else {
                            a.d(aVar14, experimentName14, xqoVar);
                        }
                    }
                    obj = wii0Var;
                } else {
                    obj = new wii0(false);
                }
                linkedHashSet28.remove(d14);
                return obj;
            case 22:
                a aVar15 = (a) xvf0Var2.get();
                h3y a = i5m.a(xvf0Var);
                LinkedHashSet linkedHashSet29 = gro.a;
                String d15 = qoi0.a(t9u0.class).d();
                LinkedHashSet linkedHashSet30 = gro.a;
                if (linkedHashSet30.contains(d15)) {
                    z83.i();
                }
                linkedHashSet30.add(d15);
                if (((rey0) a.get()).c) {
                    t9u0 t9u0Var = new t9u0(xqoVar.b());
                    ExperimentName[] values15 = ExperimentName.values();
                    int length15 = values15.length;
                    while (true) {
                        if (i2 < length15) {
                            experimentName15 = values15[i2];
                            if (!jl40.l(experimentName15.getToggleClass(), t9u0.class)) {
                                i2++;
                            }
                        } else {
                            experimentName15 = null;
                        }
                    }
                    if (experimentName15 == null) {
                        ny61.r(nnm.g(t9u0.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap15 = aVar15.g;
                    xqo xqoVar30 = (xqo) concurrentHashMap15.get(experimentName15);
                    if (xqoVar30 != null) {
                        t9u0Var = new t9u0(xqoVar30.b());
                    } else {
                        yqoVar15 = aVar15.f;
                        nqo c15 = yqoVar15.c(experimentName15);
                        if (c15 != null) {
                            xqo xqoVar31 = new xqo(true, c15.a());
                            t9u0 t9u0Var2 = new t9u0(xqoVar31.b());
                            try {
                                t9u0Var2.a();
                                t9u0Var = t9u0Var2;
                            } catch (JSONException unused15) {
                                z83.i();
                                qroVar15 = aVar15.d;
                                qroVar15.a(experimentName15.name(), xqoVar31.a());
                            }
                            a.d(aVar15, experimentName15, xqoVar31);
                        } else {
                            a.d(aVar15, experimentName15, xqoVar);
                        }
                    }
                    obj = t9u0Var;
                } else {
                    obj = new t9u0(false);
                }
                linkedHashSet30.remove(d15);
                return obj;
            case 23:
                lqo lqoVar13 = (lqo) xvf0Var2.get();
                a aVar16 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet31 = gro.a;
                String d16 = qoi0.a(fey0.class).d();
                LinkedHashSet linkedHashSet32 = gro.a;
                if (linkedHashSet32.contains(d16)) {
                    z83.i();
                }
                linkedHashSet32.add(d16);
                if (lqoVar13.a(tz10.P)) {
                    fey0 fey0Var = new fey0(xqoVar.b());
                    ExperimentName[] values16 = ExperimentName.values();
                    int length16 = values16.length;
                    while (true) {
                        if (i2 < length16) {
                            experimentName16 = values16[i2];
                            if (!jl40.l(experimentName16.getToggleClass(), fey0.class)) {
                                i2++;
                            }
                        } else {
                            experimentName16 = null;
                        }
                    }
                    if (experimentName16 == null) {
                        ny61.r(nnm.g(fey0.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap16 = aVar16.g;
                    xqo xqoVar32 = (xqo) concurrentHashMap16.get(experimentName16);
                    if (xqoVar32 != null) {
                        fey0Var = new fey0(xqoVar32.b());
                    } else {
                        yqoVar16 = aVar16.f;
                        nqo c16 = yqoVar16.c(experimentName16);
                        if (c16 != null) {
                            xqo xqoVar33 = new xqo(true, c16.a());
                            fey0 fey0Var2 = new fey0(xqoVar33.b());
                            try {
                                fey0Var2.a();
                                fey0Var = fey0Var2;
                            } catch (JSONException unused16) {
                                z83.i();
                                qroVar16 = aVar16.d;
                                qroVar16.a(experimentName16.name(), xqoVar33.a());
                            }
                            a.d(aVar16, experimentName16, xqoVar33);
                        } else {
                            a.d(aVar16, experimentName16, xqoVar);
                        }
                    }
                    obj = fey0Var;
                } else {
                    obj = new fey0(false);
                }
                linkedHashSet32.remove(d16);
                return obj;
            case 24:
                lqo lqoVar14 = (lqo) xvf0Var2.get();
                a aVar17 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet33 = gro.a;
                String d17 = qoi0.a(qey0.class).d();
                LinkedHashSet linkedHashSet34 = gro.a;
                if (linkedHashSet34.contains(d17)) {
                    z83.i();
                }
                linkedHashSet34.add(d17);
                if (lqoVar14.a(tz10.P)) {
                    qey0 qey0Var = new qey0(xqoVar.b());
                    ExperimentName[] values17 = ExperimentName.values();
                    int length17 = values17.length;
                    while (true) {
                        if (i2 < length17) {
                            experimentName17 = values17[i2];
                            if (!jl40.l(experimentName17.getToggleClass(), qey0.class)) {
                                i2++;
                            }
                        } else {
                            experimentName17 = null;
                        }
                    }
                    if (experimentName17 == null) {
                        ny61.r(nnm.g(qey0.class, " not resolved"));
                        return obj;
                    }
                    concurrentHashMap17 = aVar17.g;
                    xqo xqoVar34 = (xqo) concurrentHashMap17.get(experimentName17);
                    if (xqoVar34 != null) {
                        qey0Var = new qey0(xqoVar34.b());
                    } else {
                        yqoVar17 = aVar17.f;
                        nqo c17 = yqoVar17.c(experimentName17);
                        if (c17 != null) {
                            xqo xqoVar35 = new xqo(true, c17.a());
                            qey0 qey0Var2 = new qey0(xqoVar35.b());
                            try {
                                qey0Var2.a();
                                qey0Var = qey0Var2;
                            } catch (JSONException unused17) {
                                z83.i();
                                qroVar17 = aVar17.d;
                                qroVar17.a(experimentName17.name(), xqoVar35.a());
                            }
                            a.d(aVar17, experimentName17, xqoVar35);
                        } else {
                            a.d(aVar17, experimentName17, xqoVar);
                        }
                    }
                    obj = qey0Var;
                } else {
                    obj = new qey0(false);
                }
                linkedHashSet34.remove(d17);
                return obj;
            case 25:
                h3y a2 = i5m.a(xvf0Var2);
                MessengerEnvironment messengerEnvironment = (MessengerEnvironment) xvf0Var.get();
                LinkedHashSet linkedHashSet35 = gro.a;
                String d18 = qoi0.a(rey0.class).d();
                LinkedHashSet linkedHashSet36 = gro.a;
                if (linkedHashSet36.contains(d18)) {
                    z83.i();
                }
                linkedHashSet36.add(d18);
                rey0 rey0Var = new rey0(((u9u0) a2.get()).e() && !clb1.d(messengerEnvironment));
                linkedHashSet36.remove(d18);
                return rey0Var;
            case 26:
                lqo lqoVar15 = (lqo) xvf0Var2.get();
                LinkedHashSet linkedHashSet37 = gro.a;
                String d19 = qoi0.a(zy01.class).d();
                LinkedHashSet linkedHashSet38 = gro.a;
                if (linkedHashSet38.contains(d19)) {
                    z83.i();
                }
                linkedHashSet38.add(d19);
                if (lqoVar15.a(tz10.s)) {
                    lqoVar15.a(tz10.S);
                }
                zy01 zy01Var = new zy01(false);
                linkedHashSet38.remove(d19);
                return zy01Var;
            case 27:
                return a();
            case 28:
                return b();
            default:
                return new qro((x22) xvf0Var2.get(), (rro) xvf0Var.get());
        }
    }
}
