package com.yandex.go.address.search.common.domain;

import android.text.TextUtils;
import com.yandex.go.suggest.AdditionalSuggest;
import defpackage.a5v0;
import defpackage.b5v0;
import defpackage.do0;
import defpackage.e3o;
import defpackage.etj0;
import defpackage.ftj0;
import defpackage.gtj0;
import defpackage.hju;
import defpackage.htj0;
import defpackage.itj0;
import defpackage.j51;
import defpackage.jst;
import defpackage.jtj0;
import defpackage.k7x0;
import defpackage.l8v0;
import defpackage.m7x0;
import defpackage.mbv0;
import defpackage.p500;
import defpackage.pj;
import defpackage.qbv0;
import defpackage.qpc;
import defpackage.qyy0;
import defpackage.rwp0;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sho;
import defpackage.t7s;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.v7b0;
import defpackage.v7v0;
import defpackage.w511;
import defpackage.w9v0;
import defpackage.x4e;
import defpackage.x9v0;
import defpackage.xzb;
import defpackage.yzb;
import defpackage.z81;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public abstract class k implements j51 {
    public final j51 a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public k(j51 j51Var) {
        this.a = j51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final jtj0 f(k kVar, jtj0 jtj0Var) {
        Iterator it;
        int i;
        String str;
        x9v0 x9v0Var;
        String str2;
        xzb xzbVar;
        boolean z;
        String str3;
        boolean z2;
        double d;
        CopyOnWriteArraySet copyOnWriteArraySet;
        Iterator it2;
        CopyOnWriteArraySet copyOnWriteArraySet2 = kVar.b;
        if (jtj0Var instanceof etj0) {
            return new etj0(((etj0) jtj0Var).a);
        }
        if (jtj0Var instanceof gtj0) {
            return new gtj0(((gtj0) jtj0Var).a);
        }
        if (!(jtj0Var instanceof itj0)) {
            if (jtj0Var instanceof htj0) {
                return new htj0(((htj0) jtj0Var).a);
            }
            if (jtj0Var instanceof ftj0) {
                return new ftj0(((ftj0) jtj0Var).a);
            }
            w511.b();
            return null;
        }
        itj0 itj0Var = (itj0) jtj0Var;
        String str4 = itj0Var.a;
        long j = itj0Var.c;
        Iterator it3 = copyOnWriteArraySet2.iterator();
        while (it3.hasNext()) {
            mbv0 mbv0Var = ((qbv0) it3.next()).a.M;
            mbv0Var.getClass();
            if (j > 0) {
                long nanoTime = System.nanoTime() - j;
                Pattern pattern = t7s.a;
                d = nanoTime / 1.0E9d;
            } else {
                d = 0.0d;
            }
            RoutePointType routePointType = itj0Var.b;
            String str5 = itj0Var.f;
            b5v0 b5v0Var = mbv0Var.g;
            a5v0 i2 = mbv0.i(mbv0Var, str4, 1);
            String str6 = mbv0Var.l;
            int i3 = mbv0Var.j;
            String type = routePointType != null ? routePointType.getType() : null;
            Double valueOf = Double.valueOf(d);
            if (d <= 0.0d) {
                valueOf = null;
            }
            if (b5v0Var.y(i2, str6, i3, type, str5, valueOf)) {
                copyOnWriteArraySet = copyOnWriteArraySet2;
                it2 = it3;
            } else {
                pj pjVar = mbv0Var.h;
                String str7 = mbv0Var.n;
                long currentTimeMillis = System.currentTimeMillis();
                String str8 = mbv0Var.l;
                int i4 = mbv0Var.j;
                String str9 = mbv0Var.i;
                copyOnWriteArraySet = copyOnWriteArraySet2;
                String str10 = mbv0Var.m;
                if (str10 == null || str10.length() == 0) {
                    str10 = null;
                }
                String a = mbv0Var.f.a();
                String type2 = routePointType != null ? routePointType.getType() : null;
                Double valueOf2 = Double.valueOf(d);
                if (d <= 0.0d) {
                    valueOf2 = null;
                }
                pjVar.getClass();
                HashMap hashMap = new HashMap();
                it2 = it3;
                hashMap.put("event_context", str7);
                if (str9 != null) {
                    hashMap.put("address_search", str9);
                }
                if (str10 != null) {
                    hashMap.put("suggest_serpid", str10);
                }
                hashMap.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
                hashMap.put("client_reqid", str4);
                if (a != null) {
                    hashMap.put("MainScreenVersion", a);
                }
                hashMap.put("part", str8);
                if (type2 != null) {
                    hashMap.put("search_type", type2);
                }
                hashMap.put("editOpCount", Integer.valueOf(i4));
                if (str5 != null) {
                    hashMap.put("suggest_provider", str5);
                }
                if (valueOf2 != null) {
                    hashMap.put("requestTime", valueOf2);
                }
                HashMap hashMap2 = new HashMap();
                Regex regex = sho.a;
                pjVar.a.a(sb2.q("${event_context}.SuggestSearchResponse", hashMap), hashMap, 1, hashMap2);
            }
            jst.e.getClass();
            copyOnWriteArraySet2 = copyOnWriteArraySet;
            it3 = it2;
        }
        CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
        List list = itj0Var.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it4 = list.iterator();
        int i5 = 0;
        while (it4.hasNext()) {
            Object next = it4.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                scc.m();
                throw null;
            }
            v7b0 v7b0Var = (v7b0) kVar;
            qpc qpcVar = (qpc) next;
            hju hjuVar = v7b0Var.d;
            k7x0 k7x0Var = v7b0Var.c;
            if (qpcVar instanceof v7v0) {
                int i7 = x9v0.P;
                w9v0 w9v0Var = new w9v0(i5);
                v7v0 v7v0Var = (v7v0) qpcVar;
                xzb xzbVar2 = v7v0Var.I;
                String str11 = v7v0Var.w;
                w9v0Var.y = v7v0Var.L;
                w9v0Var.b = v7v0Var.g;
                w9v0Var.c = v7v0Var.i;
                w9v0Var.h = v7v0Var.m;
                w9v0Var.i = str11.length() == 0 ? null : ((m7x0) k7x0Var).a(str11);
                w9v0Var.k = hjuVar.a(v7v0Var.h);
                String str12 = v7v0Var.G;
                if (str12 != null) {
                    if (str12.length() <= 0) {
                        str12 = null;
                    }
                    if (str12 != null) {
                        str2 = ((m7x0) k7x0Var).a(str12);
                        w9v0Var.u = str2;
                        w9v0Var.g = v7v0Var.e;
                        w9v0Var.G = v7v0Var.j;
                        w9v0Var.F = v7v0Var.b;
                        w9v0Var.v = z81.d(v7v0Var);
                        w9v0Var.K = v7v0Var.N;
                        w9v0Var.L = v7v0Var.O;
                        CharSequence charSequence = v7v0Var.d;
                        List list2 = v7v0Var.f;
                        xzbVar = xzb.e;
                        if (xzbVar2 != xzbVar) {
                            xzbVar2.getClass();
                        } else if (xzbVar2.b.length() > 0) {
                            z = true;
                            str3 = xzbVar2.b;
                            if (z) {
                                it = it4;
                                i = i6;
                                str = str4;
                                charSequence = TextUtils.concat(ru.yandex.taxi.widget.c.f(v7b0Var.g, xzbVar2.d, false, null, 14), charSequence);
                                z2 = false;
                            } else {
                                it = it4;
                                i = i6;
                                str = str4;
                                z2 = true;
                            }
                            w9v0Var.f = charSequence;
                            w9v0Var.l = hjuVar.a(list2);
                            w9v0Var.m = z2;
                            if (xzbVar2 != xzbVar && str3.length() > 0) {
                                w9v0Var.w = new yzb(xzbVar2.c);
                                w9v0Var.x = new l8v0(str3);
                                w9v0Var.y = Integer.valueOf(xzbVar2.a);
                            }
                            v7b0Var.f.getClass();
                            w9v0 a2 = v7b0Var.e.a(w9v0Var, v7v0Var);
                            a2.getClass();
                            x9v0Var = new x9v0(a2);
                        }
                        z = false;
                        str3 = xzbVar2.b;
                        if (z) {
                        }
                        w9v0Var.f = charSequence;
                        w9v0Var.l = hjuVar.a(list2);
                        w9v0Var.m = z2;
                        if (xzbVar2 != xzbVar) {
                            w9v0Var.w = new yzb(xzbVar2.c);
                            w9v0Var.x = new l8v0(str3);
                            w9v0Var.y = Integer.valueOf(xzbVar2.a);
                        }
                        v7b0Var.f.getClass();
                        w9v0 a22 = v7b0Var.e.a(w9v0Var, v7v0Var);
                        a22.getClass();
                        x9v0Var = new x9v0(a22);
                    }
                }
                str2 = null;
                w9v0Var.u = str2;
                w9v0Var.g = v7v0Var.e;
                w9v0Var.G = v7v0Var.j;
                w9v0Var.F = v7v0Var.b;
                w9v0Var.v = z81.d(v7v0Var);
                w9v0Var.K = v7v0Var.N;
                w9v0Var.L = v7v0Var.O;
                CharSequence charSequence2 = v7v0Var.d;
                List list22 = v7v0Var.f;
                xzbVar = xzb.e;
                if (xzbVar2 != xzbVar) {
                }
                z = false;
                str3 = xzbVar2.b;
                if (z) {
                }
                w9v0Var.f = charSequence2;
                w9v0Var.l = hjuVar.a(list22);
                w9v0Var.m = z2;
                if (xzbVar2 != xzbVar) {
                }
                v7b0Var.f.getClass();
                w9v0 a222 = v7b0Var.e.a(w9v0Var, v7v0Var);
                a222.getClass();
                x9v0Var = new x9v0(a222);
            } else {
                it = it4;
                i = i6;
                str = str4;
                if (qpcVar instanceof do0) {
                    AdditionalSuggest c = z81.c((do0) qpcVar);
                    int i8 = x9v0.P;
                    w9v0 w9v0Var2 = new w9v0(i5);
                    w9v0Var2.a(c, v7b0Var.h, k7x0Var);
                    x9v0Var = new x9v0(w9v0Var2);
                } else {
                    int i9 = x9v0.P;
                    x9v0Var = new x9v0(new w9v0(i5));
                }
            }
            arrayList.add(x9v0Var);
            it4 = it;
            i5 = i;
            str4 = str;
        }
        qyy0.c(new p500(7, copyOnWriteArraySet3.iterator(), itj0Var));
        return new itj0(str4, itj0Var.b, itj0Var.c, arrayList, itj0Var.e, itj0Var.f);
    }

    public static final void g(k kVar) {
        Iterator it = kVar.b.iterator();
        while (it.hasNext()) {
            qbv0 qbv0Var = (qbv0) it.next();
            mbv0 mbv0Var = qbv0Var.a.M;
            b5v0 b5v0Var = mbv0Var.g;
            a5v0 i = mbv0.i(mbv0Var, null, 3);
            String str = mbv0Var.l;
            int i2 = mbv0Var.j;
            rwp0 rwp0Var = mbv0Var.e;
            RoutePointType routePointType = rwp0Var.a;
            if (!b5v0Var.a(i, str, i2, routePointType != null ? routePointType.getType() : null)) {
                pj pjVar = mbv0Var.h;
                String str2 = mbv0Var.n;
                long currentTimeMillis = System.currentTimeMillis();
                String c = rwp0Var.c();
                String str3 = mbv0Var.l;
                int i3 = mbv0Var.j;
                String str4 = mbv0Var.i;
                String str5 = mbv0Var.m;
                if (str5 == null || str5.length() == 0) {
                    str5 = null;
                }
                String a = mbv0Var.f.a();
                RoutePointType routePointType2 = rwp0Var.a;
                String type = routePointType2 != null ? routePointType2.getType() : null;
                pjVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("event_context", str2);
                if (str4 != null) {
                    hashMap.put("address_search", str4);
                }
                if (str5 != null) {
                    hashMap.put("suggest_serpid", str5);
                }
                hashMap.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
                hashMap.put("client_reqid", c);
                if (a != null) {
                    hashMap.put("MainScreenVersion", a);
                }
                hashMap.put("part", str3);
                if (type != null) {
                    hashMap.put("search_type", type);
                }
                HashMap n = x4e.n(i3, hashMap, "editOpCount");
                Regex regex = sho.a;
                pjVar.a.a(sb2.q("${event_context}.SuggestSearchRequest", hashMap), hashMap, 1, n);
            }
            jst.e.getClass();
            qbv0Var.b.f.incrementAndGet();
        }
    }

    @Override // defpackage.j51
    public final tpr a(String str) {
        return new j(new n(this.a.a(str), new MappingAdapter$resolveWholeQuery$1(this, null)), this);
    }

    @Override // defpackage.j51
    public final tpr b(String str) {
        return new b(new n(this.a.b(str), new MappingAdapter$resolvePartialQuery$1(this, null)), this);
    }

    @Override // defpackage.j51
    public final tpr c(e3o e3oVar) {
        return new d(this.a.c(e3oVar), this);
    }

    @Override // defpackage.j51
    public final tpr d(String str, String str2) {
        return new f(new n(this.a.d(str, str2), new MappingAdapter$resolveSelectedQuery$1(this, null)), this);
    }

    @Override // defpackage.j51
    public final tpr e(int i, boolean z, boolean z2) {
        return new h(new n(this.a.e(i, z, z2), new MappingAdapter$resolveSelectedSuggest$1(this, null)), this);
    }
}
