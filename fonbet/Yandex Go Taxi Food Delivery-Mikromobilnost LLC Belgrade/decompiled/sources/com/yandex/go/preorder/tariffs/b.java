package com.yandex.go.preorder.tariffs;

import com.yandex.go.taxi.tariffs.interactor.h;
import com.yandex.go.taxi.tariffs.repository.SelectedMultiTariffsRepositoryImpl$selectOnly$$inlined$performOperation$2;
import com.yandex.go.taxi.tariffs.repository.g;
import defpackage.b580;
import defpackage.b64;
import defpackage.c4r0;
import defpackage.ejj0;
import defpackage.evu0;
import defpackage.fmw0;
import defpackage.fnx0;
import defpackage.gf70;
import defpackage.gi;
import defpackage.gnx0;
import defpackage.gw00;
import defpackage.hf70;
import defpackage.i2s;
import defpackage.if70;
import defpackage.jaq0;
import defpackage.jf70;
import defpackage.jjx0;
import defpackage.jmw0;
import defpackage.jst;
import defpackage.kf70;
import defpackage.kmw0;
import defpackage.lmw0;
import defpackage.m60;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.r0i;
import defpackage.t8i;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u1l0;
import defpackage.w3r0;
import defpackage.w511;
import defpackage.xby;
import defpackage.y5i;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes13.dex */
public final class b {
    public final h a;
    public final m60 b;
    public final w3r0 c;
    public final c4r0 d;
    public final jjx0 e;
    public final t8i f;
    public final y5i g;
    public final i2s h;
    public final jaq0 i;
    public final ru.yandex.taxi.orderforanother.repository.a j;
    public final g k;

    public b(h hVar, m60 m60Var, w3r0 w3r0Var, c4r0 c4r0Var, jjx0 jjx0Var, t8i t8iVar, y5i y5iVar, i2s i2sVar, jaq0 jaq0Var, ru.yandex.taxi.orderforanother.repository.a aVar, g gVar) {
        this.a = hVar;
        this.b = m60Var;
        this.c = w3r0Var;
        this.d = c4r0Var;
        this.e = jjx0Var;
        this.f = t8iVar;
        this.g = y5iVar;
        this.h = i2sVar;
        this.i = jaq0Var;
        this.j = aVar;
        this.k = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r12 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u1l0 u1l0Var, ContinuationImpl continuationImpl) {
        PreorderTariffRouteDataInteractor$handle$1 preorderTariffRouteDataInteractor$handle$1;
        int i;
        if (continuationImpl instanceof PreorderTariffRouteDataInteractor$handle$1) {
            preorderTariffRouteDataInteractor$handle$1 = (PreorderTariffRouteDataInteractor$handle$1) continuationImpl;
            int i2 = preorderTariffRouteDataInteractor$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderTariffRouteDataInteractor$handle$1.label = i2 - Integer.MIN_VALUE;
                PreorderTariffRouteDataInteractor$handle$1 preorderTariffRouteDataInteractor$handle$12 = preorderTariffRouteDataInteractor$handle$1;
                Object obj = preorderTariffRouteDataInteractor$handle$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderTariffRouteDataInteractor$handle$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    preorderTariffRouteDataInteractor$handle$12.L$0 = u1l0Var;
                    preorderTariffRouteDataInteractor$handle$12.label = 1;
                    obj = h.c(this.a, u1l0Var.e, u1l0Var.f, null, null, preorderTariffRouteDataInteractor$handle$12, 28);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    u1l0Var = (u1l0) preorderTariffRouteDataInteractor$handle$12.L$0;
                    kotlin.b.b(obj);
                }
                preorderTariffRouteDataInteractor$handle$12.L$0 = null;
                preorderTariffRouteDataInteractor$handle$12.L$1 = null;
                preorderTariffRouteDataInteractor$handle$12.label = 2;
                Object b = b(u1l0Var, (mi31) obj, preorderTariffRouteDataInteractor$handle$12);
                return b != obj2 ? obj2 : b;
            }
        }
        preorderTariffRouteDataInteractor$handle$1 = new PreorderTariffRouteDataInteractor$handle$1(this, continuationImpl);
        PreorderTariffRouteDataInteractor$handle$1 preorderTariffRouteDataInteractor$handle$122 = preorderTariffRouteDataInteractor$handle$1;
        Object obj3 = preorderTariffRouteDataInteractor$handle$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderTariffRouteDataInteractor$handle$122.label;
        if (i != 0) {
        }
        preorderTariffRouteDataInteractor$handle$122.L$0 = null;
        preorderTariffRouteDataInteractor$handle$122.L$1 = null;
        preorderTariffRouteDataInteractor$handle$122.label = 2;
        Object b2 = b(u1l0Var, (mi31) obj3, preorderTariffRouteDataInteractor$handle$122);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r11v17, types: [fse, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(u1l0 u1l0Var, mi31 mi31Var, ContinuationImpl continuationImpl) {
        PreorderTariffRouteDataInteractor$handleInternal$1 preorderTariffRouteDataInteractor$handleInternal$1;
        int i;
        ArrayList arrayList;
        EmptyList emptyList;
        ArrayList arrayList2;
        Object u0;
        String str;
        String str2;
        int i2;
        String str3;
        int size;
        String str4;
        String str5;
        String str6;
        r0 r0Var;
        Object value;
        u1l0 u1l0Var2 = u1l0Var;
        mi31 mi31Var2 = mi31Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof PreorderTariffRouteDataInteractor$handleInternal$1) {
            preorderTariffRouteDataInteractor$handleInternal$1 = (PreorderTariffRouteDataInteractor$handleInternal$1) continuationImpl;
            int i3 = preorderTariffRouteDataInteractor$handleInternal$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                preorderTariffRouteDataInteractor$handleInternal$1.label = i3 - Integer.MIN_VALUE;
                Object obj = preorderTariffRouteDataInteractor$handleInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderTariffRouteDataInteractor$handleInternal$1.label;
                ArrayList arrayList3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (mi31Var2 == null) {
                        arrayList = null;
                    } else {
                        m60 m60Var = this.b;
                        List list = u1l0Var2.d;
                        List f = mi31Var2.a.f();
                        m60Var.getClass();
                        EmptyList emptyList2 = EmptyList.a;
                        List list2 = list == null ? emptyList2 : list;
                        List list3 = list;
                        if (list3 == null || list3.isEmpty()) {
                            arrayList = null;
                            emptyList = emptyList2;
                        } else {
                            List list4 = f;
                            int d = gw00.d(tcc.n(list4, 10));
                            if (d < 16) {
                                d = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                            for (Object obj2 : list4) {
                                linkedHashMap.put(((lmw0) obj2).getName(), obj2);
                            }
                            List<b580> list5 = list2;
                            ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
                            for (b580 b580Var : list5) {
                                lmw0 lmw0Var = (lmw0) linkedHashMap.get(b580Var.a);
                                if (lmw0Var != null) {
                                    if (lmw0Var instanceof fmw0) {
                                        kf70 g0 = q5z.g0(b580Var.b());
                                        gf70 gf70Var = g0 instanceof gf70 ? (gf70) g0 : arrayList3;
                                        if (gf70Var != 0 && gf70Var.a) {
                                            fmw0 fmw0Var = (fmw0) lmw0Var;
                                            b580Var = gi.e(fmw0Var.a, fmw0Var.b);
                                        }
                                    } else {
                                        if (lmw0Var instanceof jmw0) {
                                            jmw0 jmw0Var = (jmw0) lmw0Var;
                                            ArrayList arrayList5 = new ArrayList();
                                            kf70 g02 = q5z.g0(b580Var.b());
                                            arrayList2 = arrayList3;
                                            if ((g02 instanceof if70) || (g02 instanceof jf70)) {
                                                ejj0 q = jmw0Var.q(g02);
                                                if (q != null) {
                                                    arrayList5.add(q);
                                                    if (arrayList5 == null) {
                                                        b580Var = q5z.u(jmw0Var, arrayList5);
                                                    }
                                                }
                                                arrayList5 = arrayList2;
                                                if (arrayList5 == null) {
                                                }
                                            } else {
                                                if (g02 instanceof hf70) {
                                                    Iterator it = ((hf70) g02).a.iterator();
                                                    while (it.hasNext()) {
                                                        ejj0 q2 = jmw0Var.q((kf70) it.next());
                                                        if (q2 != null) {
                                                            arrayList5.add(q2);
                                                        }
                                                    }
                                                    if (arrayList5 == null) {
                                                    }
                                                }
                                                arrayList5 = arrayList2;
                                                if (arrayList5 == null) {
                                                }
                                            }
                                        } else {
                                            arrayList2 = arrayList3;
                                            if (!(lmw0Var instanceof kmw0)) {
                                                w511.b();
                                                return arrayList2;
                                            }
                                        }
                                        arrayList4.add(b580Var);
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                arrayList4.add(b580Var);
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            emptyList = arrayList4;
                        }
                        if (!emptyList.isEmpty()) {
                            w3r0.b(this.c, emptyList, null, null, null, 14);
                        }
                    }
                    preorderTariffRouteDataInteractor$handleInternal$1.L$0 = u1l0Var2;
                    preorderTariffRouteDataInteractor$handleInternal$1.L$1 = mi31Var2;
                    preorderTariffRouteDataInteractor$handleInternal$1.label = 1;
                    if (mi31Var2 != null) {
                        this.h.a.a = true;
                        boolean J = evu0.J(mi31Var2.b);
                        c4r0 c4r0Var = this.d;
                        pzt0 a = J ? c4r0Var.a(new gnx0(new fnx0(mi31Var2.a, "", SelectionOrigin.DEEPLINK), false)) : c4r0Var.a(new gnx0(new fnx0(mi31Var2, SelectionOrigin.DEEPLINK), true));
                        if (a != null) {
                            u0 = a.u0(preorderTariffRouteDataInteractor$handleInternal$1);
                            if (u0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    u0 = zy11Var;
                    if (u0 == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mi31 mi31Var3 = (mi31) preorderTariffRouteDataInteractor$handleInternal$1.L$1;
                    u1l0 u1l0Var3 = (u1l0) preorderTariffRouteDataInteractor$handleInternal$1.L$0;
                    kotlin.b.b(obj);
                    mi31Var2 = mi31Var3;
                    u1l0Var2 = u1l0Var3;
                    arrayList = null;
                }
                Set set = u1l0Var2.r;
                if (mi31Var2 != null) {
                    String str7 = mi31Var2.b;
                    boolean z = mi31Var2.a.K0;
                    if (!z && set != null) {
                        xby.l(jst.e, "Preorder.RouteDeeplink.SelectedClasses", null, null, b64.l("Trying to use selectedClasses for non-multiclass tariff: ", mi31Var2.f, " in vertical: ", str7), 6);
                    } else if (z && set != null) {
                        g gVar = this.k;
                        ?? r11 = arrayList;
                        tje.N(gVar.c, r11, r11, new SelectedMultiTariffsRepositoryImpl$selectOnly$$inlined$performOperation$2(gVar, str7, r11, set), 3);
                    }
                }
                if (mi31Var2 != null) {
                    w3r0 w3r0Var = this.c;
                    jjx0 jjx0Var = this.e;
                    w3r0.b(w3r0Var, jjx0Var.a(mi31Var2.f, jjx0Var.a.c(), jjx0Var.a.a.x), null, null, null, 14);
                }
                str = u1l0Var2.h;
                if (str != null && str.length() != 0) {
                    t8i t8iVar = this.f;
                    r0Var = t8iVar.a;
                    do {
                        value = r0Var.getValue();
                        ((t8i.a) value).getClass();
                    } while (!r0Var.k(value, new t8i.a(str)));
                    t8iVar.c = null;
                    this.g.j = str;
                }
                str2 = u1l0Var2.i;
                i2 = 5;
                if (str2 != null && str2.length() != 0) {
                    y5i.q(this.g, new r0i((String) null, str2, i2), null, null, null, null, null, null, 254);
                }
                str3 = u1l0Var2.j;
                size = this.g.h.size();
                if (str3 != null && str3.length() != 0 && size > 0) {
                    y5i.n(this.g, size - 1, new r0i((String) null, str3, i2), null, null, null, null, null, null, 508);
                }
                str4 = u1l0Var2.g;
                if (str4 != null && (str6 = u1l0Var2.e) != null) {
                    this.i.a.b(str6, str4);
                }
                str5 = u1l0Var2.k;
                if (str5 != null) {
                    this.j.k(str5, "");
                }
                return zy11Var;
            }
        }
        preorderTariffRouteDataInteractor$handleInternal$1 = new PreorderTariffRouteDataInteractor$handleInternal$1(this, continuationImpl);
        Object obj3 = preorderTariffRouteDataInteractor$handleInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderTariffRouteDataInteractor$handleInternal$1.label;
        ArrayList arrayList32 = null;
        if (i != 0) {
        }
        Set set2 = u1l0Var2.r;
        if (mi31Var2 != null) {
        }
        if (mi31Var2 != null) {
        }
        str = u1l0Var2.h;
        if (str != null) {
            t8i t8iVar2 = this.f;
            r0Var = t8iVar2.a;
            do {
                value = r0Var.getValue();
                ((t8i.a) value).getClass();
            } while (!r0Var.k(value, new t8i.a(str)));
            t8iVar2.c = null;
            this.g.j = str;
        }
        str2 = u1l0Var2.i;
        i2 = 5;
        if (str2 != null) {
            y5i.q(this.g, new r0i((String) null, str2, i2), null, null, null, null, null, null, 254);
        }
        str3 = u1l0Var2.j;
        size = this.g.h.size();
        if (str3 != null) {
            y5i.n(this.g, size - 1, new r0i((String) null, str3, i2), null, null, null, null, null, null, 508);
        }
        str4 = u1l0Var2.g;
        if (str4 != null) {
            this.i.a.b(str6, str4);
        }
        str5 = u1l0Var2.k;
        if (str5 != null) {
        }
        return zy11Var;
    }
}
