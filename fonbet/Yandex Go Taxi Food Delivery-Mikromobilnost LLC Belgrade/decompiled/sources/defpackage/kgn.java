package defpackage;

import com.yandex.messaging.domain.experiments.a;
import com.yandex.messaging.experiments.ExperimentName;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class kgn implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ kgn(xvf0 xvf0Var, int i) {
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
        int i = this.a;
        xqo xqoVar = a.i;
        int i2 = 0;
        Object obj = null;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                x4o x4oVar = (x4o) ((kg51) xvf0Var.get()).u.invoke(new y4o());
                q5z.i(x4oVar);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                a aVar = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet = gro.a;
                String d = qoi0.a(nm1.class).d();
                LinkedHashSet linkedHashSet2 = gro.a;
                if (linkedHashSet2.contains(d)) {
                    z83.i();
                }
                linkedHashSet2.add(d);
                nm1 nm1Var = new nm1(xqoVar.b());
                ExperimentName[] values = ExperimentName.values();
                int length = values.length;
                while (true) {
                    if (i2 < length) {
                        experimentName = values[i2];
                        if (!jl40.l(experimentName.getToggleClass(), nm1.class)) {
                            i2++;
                        }
                    } else {
                        experimentName = null;
                    }
                }
                if (experimentName == null) {
                    ny61.r(nnm.g(nm1.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap = aVar.g;
                    xqo xqoVar2 = (xqo) concurrentHashMap.get(experimentName);
                    if (xqoVar2 != null) {
                        obj = new nm1(xqoVar2.b());
                    } else {
                        yqoVar = aVar.f;
                        nqo c = yqoVar.c(experimentName);
                        if (c != null) {
                            xqo xqoVar3 = new xqo(true, c.a());
                            nm1 nm1Var2 = new nm1(xqoVar3.b());
                            try {
                                nm1Var2.a();
                                nm1Var = nm1Var2;
                            } catch (JSONException unused) {
                                z83.i();
                                qroVar = aVar.d;
                                qroVar.a(experimentName.name(), xqoVar3.a());
                            }
                            a.d(aVar, experimentName, xqoVar3);
                        } else {
                            a.d(aVar, experimentName, xqoVar);
                        }
                        obj = nm1Var;
                    }
                    linkedHashSet2.remove(d);
                    break;
                }
            case 17:
                a aVar2 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet3 = gro.a;
                String d2 = qoi0.a(uk7.class).d();
                LinkedHashSet linkedHashSet4 = gro.a;
                if (linkedHashSet4.contains(d2)) {
                    z83.i();
                }
                linkedHashSet4.add(d2);
                uk7 uk7Var = new uk7(xqoVar.b());
                ExperimentName[] values2 = ExperimentName.values();
                int length2 = values2.length;
                while (true) {
                    if (i2 < length2) {
                        experimentName2 = values2[i2];
                        if (!jl40.l(experimentName2.getToggleClass(), uk7.class)) {
                            i2++;
                        }
                    } else {
                        experimentName2 = null;
                    }
                }
                if (experimentName2 == null) {
                    ny61.r(nnm.g(uk7.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap2 = aVar2.g;
                    xqo xqoVar4 = (xqo) concurrentHashMap2.get(experimentName2);
                    if (xqoVar4 != null) {
                        obj = new uk7(xqoVar4.b());
                    } else {
                        yqoVar2 = aVar2.f;
                        nqo c2 = yqoVar2.c(experimentName2);
                        if (c2 != null) {
                            xqo xqoVar5 = new xqo(true, c2.a());
                            uk7 uk7Var2 = new uk7(xqoVar5.b());
                            try {
                                uk7Var2.a();
                                uk7Var = uk7Var2;
                            } catch (JSONException unused2) {
                                z83.i();
                                qroVar2 = aVar2.d;
                                qroVar2.a(experimentName2.name(), xqoVar5.a());
                            }
                            a.d(aVar2, experimentName2, xqoVar5);
                        } else {
                            a.d(aVar2, experimentName2, xqoVar);
                        }
                        obj = uk7Var;
                    }
                    linkedHashSet4.remove(d2);
                    break;
                }
            case 18:
                a aVar3 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet5 = gro.a;
                String d3 = qoi0.a(s6b.class).d();
                LinkedHashSet linkedHashSet6 = gro.a;
                if (linkedHashSet6.contains(d3)) {
                    z83.i();
                }
                linkedHashSet6.add(d3);
                s6b s6bVar = new s6b(xqoVar.b());
                ExperimentName[] values3 = ExperimentName.values();
                int length3 = values3.length;
                while (true) {
                    if (i2 < length3) {
                        experimentName3 = values3[i2];
                        if (!jl40.l(experimentName3.getToggleClass(), s6b.class)) {
                            i2++;
                        }
                    } else {
                        experimentName3 = null;
                    }
                }
                if (experimentName3 == null) {
                    ny61.r(nnm.g(s6b.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap3 = aVar3.g;
                    xqo xqoVar6 = (xqo) concurrentHashMap3.get(experimentName3);
                    if (xqoVar6 != null) {
                        obj = new s6b(xqoVar6.b());
                    } else {
                        yqoVar3 = aVar3.f;
                        nqo c3 = yqoVar3.c(experimentName3);
                        if (c3 != null) {
                            xqo xqoVar7 = new xqo(true, c3.a());
                            s6b s6bVar2 = new s6b(xqoVar7.b());
                            try {
                                s6bVar2.a();
                                s6bVar = s6bVar2;
                            } catch (JSONException unused3) {
                                z83.i();
                                qroVar3 = aVar3.d;
                                qroVar3.a(experimentName3.name(), xqoVar7.a());
                            }
                            a.d(aVar3, experimentName3, xqoVar7);
                        } else {
                            a.d(aVar3, experimentName3, xqoVar);
                        }
                        obj = s6bVar;
                    }
                    linkedHashSet6.remove(d3);
                    break;
                }
            case 19:
                a aVar4 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet7 = gro.a;
                String d4 = qoi0.a(n0c.class).d();
                LinkedHashSet linkedHashSet8 = gro.a;
                if (linkedHashSet8.contains(d4)) {
                    z83.i();
                }
                linkedHashSet8.add(d4);
                n0c n0cVar = new n0c(xqoVar.b());
                ExperimentName[] values4 = ExperimentName.values();
                int length4 = values4.length;
                while (true) {
                    if (i2 < length4) {
                        experimentName4 = values4[i2];
                        if (!jl40.l(experimentName4.getToggleClass(), n0c.class)) {
                            i2++;
                        }
                    } else {
                        experimentName4 = null;
                    }
                }
                if (experimentName4 == null) {
                    ny61.r(nnm.g(n0c.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap4 = aVar4.g;
                    xqo xqoVar8 = (xqo) concurrentHashMap4.get(experimentName4);
                    if (xqoVar8 != null) {
                        obj = new n0c(xqoVar8.b());
                    } else {
                        yqoVar4 = aVar4.f;
                        nqo c4 = yqoVar4.c(experimentName4);
                        if (c4 != null) {
                            xqo xqoVar9 = new xqo(true, c4.a());
                            n0c n0cVar2 = new n0c(xqoVar9.b());
                            try {
                                n0cVar2.a();
                                n0cVar = n0cVar2;
                            } catch (JSONException unused4) {
                                z83.i();
                                qroVar4 = aVar4.d;
                                qroVar4.a(experimentName4.name(), xqoVar9.a());
                            }
                            a.d(aVar4, experimentName4, xqoVar9);
                        } else {
                            a.d(aVar4, experimentName4, xqoVar);
                        }
                        obj = n0cVar;
                    }
                    linkedHashSet8.remove(d4);
                    break;
                }
            case 20:
                h3y a = i5m.a(xvf0Var);
                LinkedHashSet linkedHashSet9 = gro.a;
                String d5 = qoi0.a(hlf.class).d();
                LinkedHashSet linkedHashSet10 = gro.a;
                if (linkedHashSet10.contains(d5)) {
                    z83.i();
                }
                linkedHashSet10.add(d5);
                hlf hlfVar = new hlf(((u9u0) a.get()).e());
                linkedHashSet10.remove(d5);
                break;
            case 21:
                a aVar5 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet11 = gro.a;
                String d6 = qoi0.a(l5o.class).d();
                LinkedHashSet linkedHashSet12 = gro.a;
                if (linkedHashSet12.contains(d6)) {
                    z83.i();
                }
                linkedHashSet12.add(d6);
                l5o l5oVar = new l5o(xqoVar.b());
                ExperimentName[] values5 = ExperimentName.values();
                int length5 = values5.length;
                while (true) {
                    if (i2 < length5) {
                        experimentName5 = values5[i2];
                        if (!jl40.l(experimentName5.getToggleClass(), l5o.class)) {
                            i2++;
                        }
                    } else {
                        experimentName5 = null;
                    }
                }
                if (experimentName5 == null) {
                    ny61.r(nnm.g(l5o.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap5 = aVar5.g;
                    xqo xqoVar10 = (xqo) concurrentHashMap5.get(experimentName5);
                    if (xqoVar10 != null) {
                        obj = new l5o(xqoVar10.b());
                    } else {
                        yqoVar5 = aVar5.f;
                        nqo c5 = yqoVar5.c(experimentName5);
                        if (c5 != null) {
                            xqo xqoVar11 = new xqo(true, c5.a());
                            l5o l5oVar2 = new l5o(xqoVar11.b());
                            try {
                                l5oVar2.a();
                                l5oVar = l5oVar2;
                            } catch (JSONException unused5) {
                                z83.i();
                                qroVar5 = aVar5.d;
                                qroVar5.a(experimentName5.name(), xqoVar11.a());
                            }
                            a.d(aVar5, experimentName5, xqoVar11);
                        } else {
                            a.d(aVar5, experimentName5, xqoVar);
                        }
                        obj = l5oVar;
                    }
                    linkedHashSet12.remove(d6);
                    break;
                }
            case 22:
                lqo lqoVar = (lqo) xvf0Var.get();
                LinkedHashSet linkedHashSet13 = gro.a;
                String d7 = qoi0.a(tnq.class).d();
                LinkedHashSet linkedHashSet14 = gro.a;
                if (linkedHashSet14.contains(d7)) {
                    z83.i();
                }
                linkedHashSet14.add(d7);
                tnq tnqVar = new tnq(lqoVar.a(tz10.H));
                linkedHashSet14.remove(d7);
                break;
            case 23:
                a aVar6 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet15 = gro.a;
                String d8 = qoi0.a(pxr.class).d();
                LinkedHashSet linkedHashSet16 = gro.a;
                if (linkedHashSet16.contains(d8)) {
                    z83.i();
                }
                linkedHashSet16.add(d8);
                pxr pxrVar = new pxr(xqoVar.b());
                ExperimentName[] values6 = ExperimentName.values();
                int length6 = values6.length;
                while (true) {
                    if (i2 < length6) {
                        experimentName6 = values6[i2];
                        if (!jl40.l(experimentName6.getToggleClass(), pxr.class)) {
                            i2++;
                        }
                    } else {
                        experimentName6 = null;
                    }
                }
                if (experimentName6 == null) {
                    ny61.r(nnm.g(pxr.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap6 = aVar6.g;
                    xqo xqoVar12 = (xqo) concurrentHashMap6.get(experimentName6);
                    if (xqoVar12 != null) {
                        obj = new pxr(xqoVar12.b());
                    } else {
                        yqoVar6 = aVar6.f;
                        nqo c6 = yqoVar6.c(experimentName6);
                        if (c6 != null) {
                            xqo xqoVar13 = new xqo(true, c6.a());
                            pxr pxrVar2 = new pxr(xqoVar13.b());
                            try {
                                pxrVar2.a();
                                pxrVar = pxrVar2;
                            } catch (JSONException unused6) {
                                z83.i();
                                qroVar6 = aVar6.d;
                                qroVar6.a(experimentName6.name(), xqoVar13.a());
                            }
                            a.d(aVar6, experimentName6, xqoVar13);
                        } else {
                            a.d(aVar6, experimentName6, xqoVar);
                        }
                        obj = pxrVar;
                    }
                    linkedHashSet16.remove(d8);
                    break;
                }
            case 24:
                a aVar7 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet17 = gro.a;
                String d9 = qoi0.a(u7s.class).d();
                LinkedHashSet linkedHashSet18 = gro.a;
                if (linkedHashSet18.contains(d9)) {
                    z83.i();
                }
                linkedHashSet18.add(d9);
                u7s u7sVar = new u7s(xqoVar.b());
                ExperimentName[] values7 = ExperimentName.values();
                int length7 = values7.length;
                while (true) {
                    if (i2 < length7) {
                        experimentName7 = values7[i2];
                        if (!jl40.l(experimentName7.getToggleClass(), u7s.class)) {
                            i2++;
                        }
                    } else {
                        experimentName7 = null;
                    }
                }
                if (experimentName7 == null) {
                    ny61.r(nnm.g(u7s.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap7 = aVar7.g;
                    xqo xqoVar14 = (xqo) concurrentHashMap7.get(experimentName7);
                    if (xqoVar14 != null) {
                        obj = new u7s(xqoVar14.b());
                    } else {
                        yqoVar7 = aVar7.f;
                        nqo c7 = yqoVar7.c(experimentName7);
                        if (c7 != null) {
                            xqo xqoVar15 = new xqo(true, c7.a());
                            u7s u7sVar2 = new u7s(xqoVar15.b());
                            try {
                                u7sVar2.a();
                                u7sVar = u7sVar2;
                            } catch (JSONException unused7) {
                                z83.i();
                                qroVar7 = aVar7.d;
                                qroVar7.a(experimentName7.name(), xqoVar15.a());
                            }
                            a.d(aVar7, experimentName7, xqoVar15);
                        } else {
                            a.d(aVar7, experimentName7, xqoVar);
                        }
                        obj = u7sVar;
                    }
                    linkedHashSet18.remove(d9);
                    break;
                }
            case 25:
                a aVar8 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet19 = gro.a;
                String d10 = qoi0.a(q9x.class).d();
                LinkedHashSet linkedHashSet20 = gro.a;
                if (linkedHashSet20.contains(d10)) {
                    z83.i();
                }
                linkedHashSet20.add(d10);
                q9x q9xVar = new q9x(xqoVar.b());
                ExperimentName[] values8 = ExperimentName.values();
                int length8 = values8.length;
                while (true) {
                    if (i2 < length8) {
                        experimentName8 = values8[i2];
                        if (!jl40.l(experimentName8.getToggleClass(), q9x.class)) {
                            i2++;
                        }
                    } else {
                        experimentName8 = null;
                    }
                }
                if (experimentName8 == null) {
                    ny61.r(nnm.g(q9x.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap8 = aVar8.g;
                    xqo xqoVar16 = (xqo) concurrentHashMap8.get(experimentName8);
                    if (xqoVar16 != null) {
                        obj = new q9x(xqoVar16.b());
                    } else {
                        yqoVar8 = aVar8.f;
                        nqo c8 = yqoVar8.c(experimentName8);
                        if (c8 != null) {
                            xqo xqoVar17 = new xqo(true, c8.a());
                            q9x q9xVar2 = new q9x(xqoVar17.b());
                            try {
                                q9xVar2.a();
                                q9xVar = q9xVar2;
                            } catch (JSONException unused8) {
                                z83.i();
                                qroVar8 = aVar8.d;
                                qroVar8.a(experimentName8.name(), xqoVar17.a());
                            }
                            a.d(aVar8, experimentName8, xqoVar17);
                        } else {
                            a.d(aVar8, experimentName8, xqoVar);
                        }
                        obj = q9xVar;
                    }
                    linkedHashSet20.remove(d10);
                    break;
                }
            case 26:
                a aVar9 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet21 = gro.a;
                String d11 = qoi0.a(bj10.class).d();
                LinkedHashSet linkedHashSet22 = gro.a;
                if (linkedHashSet22.contains(d11)) {
                    z83.i();
                }
                linkedHashSet22.add(d11);
                bj10 bj10Var = new bj10(xqoVar.b());
                ExperimentName[] values9 = ExperimentName.values();
                int length9 = values9.length;
                while (true) {
                    if (i2 < length9) {
                        experimentName9 = values9[i2];
                        if (!jl40.l(experimentName9.getToggleClass(), bj10.class)) {
                            i2++;
                        }
                    } else {
                        experimentName9 = null;
                    }
                }
                if (experimentName9 == null) {
                    ny61.r(nnm.g(bj10.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap9 = aVar9.g;
                    xqo xqoVar18 = (xqo) concurrentHashMap9.get(experimentName9);
                    if (xqoVar18 != null) {
                        obj = new bj10(xqoVar18.b());
                    } else {
                        yqoVar9 = aVar9.f;
                        nqo c9 = yqoVar9.c(experimentName9);
                        if (c9 != null) {
                            xqo xqoVar19 = new xqo(true, c9.a());
                            bj10 bj10Var2 = new bj10(xqoVar19.b());
                            try {
                                bj10Var2.a();
                                bj10Var = bj10Var2;
                            } catch (JSONException unused9) {
                                z83.i();
                                qroVar9 = aVar9.d;
                                qroVar9.a(experimentName9.name(), xqoVar19.a());
                            }
                            a.d(aVar9, experimentName9, xqoVar19);
                        } else {
                            a.d(aVar9, experimentName9, xqoVar);
                        }
                        obj = bj10Var;
                    }
                    linkedHashSet22.remove(d11);
                    break;
                }
            case 27:
                a aVar10 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet23 = gro.a;
                String d12 = qoi0.a(mv10.class).d();
                LinkedHashSet linkedHashSet24 = gro.a;
                if (linkedHashSet24.contains(d12)) {
                    z83.i();
                }
                linkedHashSet24.add(d12);
                mv10 mv10Var = new mv10(xqoVar.b());
                ExperimentName[] values10 = ExperimentName.values();
                int length10 = values10.length;
                while (true) {
                    if (i2 < length10) {
                        experimentName10 = values10[i2];
                        if (!jl40.l(experimentName10.getToggleClass(), mv10.class)) {
                            i2++;
                        }
                    } else {
                        experimentName10 = null;
                    }
                }
                if (experimentName10 == null) {
                    ny61.r(nnm.g(mv10.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap10 = aVar10.g;
                    xqo xqoVar20 = (xqo) concurrentHashMap10.get(experimentName10);
                    if (xqoVar20 != null) {
                        obj = new mv10(xqoVar20.b());
                    } else {
                        yqoVar10 = aVar10.f;
                        nqo c10 = yqoVar10.c(experimentName10);
                        if (c10 != null) {
                            xqo xqoVar21 = new xqo(true, c10.a());
                            mv10 mv10Var2 = new mv10(xqoVar21.b());
                            try {
                                mv10Var2.a();
                                mv10Var = mv10Var2;
                            } catch (JSONException unused10) {
                                z83.i();
                                qroVar10 = aVar10.d;
                                qroVar10.a(experimentName10.name(), xqoVar21.a());
                            }
                            a.d(aVar10, experimentName10, xqoVar21);
                        } else {
                            a.d(aVar10, experimentName10, xqoVar);
                        }
                        obj = mv10Var;
                    }
                    linkedHashSet24.remove(d12);
                    break;
                }
            case 28:
                a aVar11 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet25 = gro.a;
                String d13 = qoi0.a(ah20.class).d();
                LinkedHashSet linkedHashSet26 = gro.a;
                if (linkedHashSet26.contains(d13)) {
                    z83.i();
                }
                linkedHashSet26.add(d13);
                ah20 ah20Var = new ah20(xqoVar.b());
                ExperimentName[] values11 = ExperimentName.values();
                int length11 = values11.length;
                while (true) {
                    if (i2 < length11) {
                        experimentName11 = values11[i2];
                        if (!jl40.l(experimentName11.getToggleClass(), ah20.class)) {
                            i2++;
                        }
                    } else {
                        experimentName11 = null;
                    }
                }
                if (experimentName11 == null) {
                    ny61.r(nnm.g(ah20.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap11 = aVar11.g;
                    xqo xqoVar22 = (xqo) concurrentHashMap11.get(experimentName11);
                    if (xqoVar22 != null) {
                        obj = new ah20(xqoVar22.b());
                    } else {
                        yqoVar11 = aVar11.f;
                        nqo c11 = yqoVar11.c(experimentName11);
                        if (c11 != null) {
                            xqo xqoVar23 = new xqo(true, c11.a());
                            ah20 ah20Var2 = new ah20(xqoVar23.b());
                            try {
                                ah20Var2.a();
                                ah20Var = ah20Var2;
                            } catch (JSONException unused11) {
                                z83.i();
                                qroVar11 = aVar11.d;
                                qroVar11.a(experimentName11.name(), xqoVar23.a());
                            }
                            a.d(aVar11, experimentName11, xqoVar23);
                        } else {
                            a.d(aVar11, experimentName11, xqoVar);
                        }
                        obj = ah20Var;
                    }
                    linkedHashSet26.remove(d13);
                    break;
                }
            default:
                a aVar12 = (a) xvf0Var.get();
                LinkedHashSet linkedHashSet27 = gro.a;
                String d14 = qoi0.a(pm50.class).d();
                LinkedHashSet linkedHashSet28 = gro.a;
                if (linkedHashSet28.contains(d14)) {
                    z83.i();
                }
                linkedHashSet28.add(d14);
                pm50 pm50Var = new pm50(xqoVar.b());
                ExperimentName[] values12 = ExperimentName.values();
                int length12 = values12.length;
                while (true) {
                    if (i2 < length12) {
                        experimentName12 = values12[i2];
                        if (!jl40.l(experimentName12.getToggleClass(), pm50.class)) {
                            i2++;
                        }
                    } else {
                        experimentName12 = null;
                    }
                }
                if (experimentName12 == null) {
                    ny61.r(nnm.g(pm50.class, " not resolved"));
                    break;
                } else {
                    concurrentHashMap12 = aVar12.g;
                    xqo xqoVar24 = (xqo) concurrentHashMap12.get(experimentName12);
                    if (xqoVar24 != null) {
                        obj = new pm50(xqoVar24.b());
                    } else {
                        yqoVar12 = aVar12.f;
                        nqo c12 = yqoVar12.c(experimentName12);
                        if (c12 != null) {
                            xqo xqoVar25 = new xqo(true, c12.a());
                            pm50 pm50Var2 = new pm50(xqoVar25.b());
                            try {
                                pm50Var2.a();
                                pm50Var = pm50Var2;
                            } catch (JSONException unused12) {
                                z83.i();
                                qroVar12 = aVar12.d;
                                qroVar12.a(experimentName12.name(), xqoVar25.a());
                            }
                            a.d(aVar12, experimentName12, xqoVar25);
                        } else {
                            a.d(aVar12, experimentName12, xqoVar);
                        }
                        obj = pm50Var;
                    }
                    linkedHashSet28.remove(d14);
                    break;
                }
        }
        return obj;
    }
}
