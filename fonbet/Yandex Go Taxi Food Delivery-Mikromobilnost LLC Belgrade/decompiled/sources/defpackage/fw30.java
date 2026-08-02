package defpackage;

import android.content.Context;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map.c;

/* loaded from: classes6.dex */
public final class fw30 {
    public final xm00 a;
    public final tls b;
    public final Context c;
    public final yvf0 d;
    public f4c0 e;
    public f4c0 f;
    public f4c0 g;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public boolean l = true;

    public fw30(xm00 xm00Var, tls tlsVar, Context context, yvf0 yvf0Var) {
        this.a = xm00Var;
        this.b = tlsVar;
        this.c = context;
        this.d = yvf0Var;
    }

    public final void a() {
        b();
        f4c0 f4c0Var = this.e;
        if (f4c0Var != null) {
            f4c0Var.d();
        }
        this.e = null;
        f4c0 f4c0Var2 = this.f;
        if (f4c0Var2 != null) {
            f4c0Var2.d();
        }
        this.f = null;
        f4c0 f4c0Var3 = this.g;
        if (f4c0Var3 != null) {
            f4c0Var3.d();
        }
        this.g = null;
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) ((j741) it.next())).a();
        }
        arrayList.clear();
        ArrayList arrayList2 = this.i;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((e911) it2.next()).a();
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.j;
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((f4c0) it3.next()).d();
        }
        arrayList3.clear();
    }

    public final void b() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            f4c0 f4c0Var = (f4c0) pair.getFirst();
            f4c0 f4c0Var2 = (f4c0) pair.getSecond();
            if (f4c0Var != null) {
                f4c0Var.d();
            }
            if (f4c0Var2 != null) {
                f4c0Var2.d();
            }
        }
        arrayList.clear();
    }

    public final void c() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            e911 e911Var = (e911) it.next();
            e911Var.j = false;
            Iterator it2 = e911Var.h.iterator();
            while (it2.hasNext()) {
                ((f4c0) it2.next()).i(false);
            }
        }
    }

    public final void d(ds30 ds30Var, ds30 ds30Var2, List list, q6s0 q6s0Var, List list2) {
        f4c0 f4c0Var;
        f4c0 f4c0Var2;
        b();
        List list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            if (q6s0Var.a) {
                h(ds30Var);
            } else {
                h(null);
            }
            if (q6s0Var.b) {
                f(ds30Var2);
            } else {
                f(null);
            }
            g(list);
            j();
            return;
        }
        h(null);
        f(null);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            om30 om30Var = (om30) it.next();
            double d = om30Var.a;
            double d2 = om30Var.b;
            new zzs(d, d2, 0, null, null, 28);
            Point point = new Point(d, d2);
            bl00 bl00Var = om30Var.c;
            xm00 xm00Var = this.a;
            if (bl00Var != null) {
                f4c0Var = xm00Var.r(point);
                f4c0Var.z(bl00Var.a, bl00Var.b);
                f4c0Var.k(2.0f);
            } else {
                f4c0Var = null;
            }
            bl00 bl00Var2 = om30Var.d;
            if (bl00Var2 != null) {
                f4c0Var2 = xm00Var.r(point);
                f4c0Var2.z(bl00Var2.a, bl00Var2.b);
                f4c0Var2.k(2.0f);
            } else {
                f4c0Var2 = null;
            }
            this.k.add(new Pair(f4c0Var, f4c0Var2));
        }
        g(list);
        j();
    }

    public final void f(ds30 ds30Var) {
        f4c0 f4c0Var = this.g;
        if (f4c0Var != null) {
            f4c0Var.i(ds30Var != null);
        }
        if (ds30Var == null) {
            return;
        }
        bl00 bl00Var = ds30Var.b;
        IconStyle iconStyle = bl00Var.b;
        ImageProvider imageProvider = bl00Var.a;
        Point point = ds30Var.a;
        f4c0 f4c0Var2 = this.g;
        if (f4c0Var2 == null) {
            f4c0 r = this.a.r(point);
            r.z(imageProvider, iconStyle);
            this.g = r;
        } else {
            f4c0Var2.o(point);
            f4c0 f4c0Var3 = this.g;
            if (f4c0Var3 != null) {
                f4c0Var3.z(imageProvider, iconStyle);
            }
        }
    }

    public final void g(List list) {
        List list2;
        ArrayList arrayList;
        int i;
        Throwable th;
        int i2;
        Iterator it;
        List list3 = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list3) {
            if (obj instanceof cr30) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = this.h;
        int size2 = size - arrayList3.size();
        if (size2 > 0) {
            int abs = Math.abs(size2);
            for (int i3 = 0; i3 < abs; i3++) {
                arrayList3.add(this.d.get());
            }
        } else if (size2 < 0) {
            int abs2 = Math.abs(size2);
            for (int i4 = 0; i4 < abs2; i4++) {
                ((c) ((j741) kp50.M(arrayList3))).a();
            }
        }
        Iterator it2 = arrayList3.iterator();
        int i5 = 0;
        while (true) {
            Throwable th2 = null;
            if (!it2.hasNext()) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list3) {
                    if (obj2 instanceof dr30) {
                        arrayList4.add(obj2);
                    }
                }
                int size3 = arrayList4.size();
                ArrayList arrayList5 = this.i;
                int size4 = size3 - arrayList5.size();
                xm00 xm00Var = this.a;
                if (size4 > 0) {
                    int abs3 = Math.abs(size4);
                    for (int i6 = 0; i6 < abs3; i6++) {
                        arrayList5.add(new e911(xm00Var, this.c, this.b));
                    }
                } else if (size4 < 0) {
                    int abs4 = Math.abs(size4);
                    for (int i7 = 0; i7 < abs4; i7++) {
                        e911 e911Var = (e911) ycc.A(arrayList5);
                        if (e911Var != null) {
                            e911Var.a();
                        }
                    }
                }
                Iterator it3 = arrayList5.iterator();
                int i8 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        Throwable th3 = th2;
                        scc.m();
                        throw th3;
                    }
                    final e911 e911Var2 = (e911) next;
                    dr30 dr30Var = (dr30) a.S(i8, arrayList4);
                    if (dr30Var == null) {
                        list2 = list3;
                        arrayList = arrayList4;
                        th = th2;
                    } else {
                        List list4 = dr30Var.b;
                        Context context = e911Var2.a;
                        i3y i3yVar = e911Var2.c;
                        ArrayList arrayList6 = e911Var2.h;
                        List list5 = dr30Var.c;
                        z511 z511Var = dr30Var.a;
                        int size5 = list4.size();
                        ArrayList arrayList7 = e911Var2.g;
                        int size6 = size5 - arrayList7.size();
                        if (size6 > 0) {
                            int abs5 = Math.abs(size6);
                            int i10 = 0;
                            while (i10 < abs5) {
                                arrayList7.add(((xm00) i3yVar.getValue()).r(cwa1.d(zzs.f)));
                                i10++;
                                list3 = list3;
                                arrayList4 = arrayList4;
                            }
                            list2 = list3;
                            arrayList = arrayList4;
                        } else {
                            list2 = list3;
                            arrayList = arrayList4;
                            if (size6 < 0) {
                                int abs6 = Math.abs(size6);
                                for (int i11 = 0; i11 < abs6; i11++) {
                                    f4c0 f4c0Var = (f4c0) ycc.A(arrayList7);
                                    if (f4c0Var != null) {
                                        f4c0Var.d();
                                        f4c0Var.g(null);
                                    }
                                }
                            }
                        }
                        Iterator it4 = arrayList7.iterator();
                        int i12 = 0;
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                scc.m();
                                throw null;
                            }
                            f4c0 f4c0Var2 = (f4c0) next2;
                            final tm30 tm30Var = (tm30) a.S(i12, list4);
                            if (tm30Var == null) {
                                it = it4;
                            } else {
                                bl00 bl00Var = tm30Var.b;
                                it = it4;
                                f4c0Var2.z(bl00Var.a, bl00Var.b);
                                f4c0Var2.o(tm30Var.a);
                                f4c0Var2.i(e911Var2.i);
                                final int i14 = 1;
                                f4c0Var2.g(new MapObjectTapListener() { // from class: d911
                                    @Override // com.yandex.mapkit.map.MapObjectTapListener
                                    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                                        int i15 = i14;
                                        tm30 tm30Var2 = tm30Var;
                                        e911 e911Var3 = e911Var2;
                                        switch (i15) {
                                            case 0:
                                                e911Var3.b.invoke(tm30Var2.c);
                                                break;
                                            default:
                                                e911Var3.b.invoke(tm30Var2.c);
                                                break;
                                        }
                                        return true;
                                    }
                                });
                            }
                            i12 = i13;
                            it4 = it;
                        }
                        int size7 = list5.size() - arrayList6.size();
                        if (size7 > 0) {
                            for (int i15 = 0; i15 < size7; i15++) {
                                arrayList6.add(((xm00) i3yVar.getValue()).r(cwa1.d(zzs.f)));
                            }
                        } else if (size7 < 0) {
                            int i16 = -size7;
                            for (int i17 = 0; i17 < i16; i17++) {
                                f4c0 f4c0Var3 = (f4c0) ycc.A(arrayList6);
                                if (f4c0Var3 != null) {
                                    f4c0Var3.d();
                                    f4c0Var3.g(null);
                                }
                            }
                        }
                        Iterator it5 = arrayList6.iterator();
                        int i18 = 0;
                        while (it5.hasNext()) {
                            Object next3 = it5.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                scc.m();
                                throw null;
                            }
                            f4c0 f4c0Var4 = (f4c0) next3;
                            final tm30 tm30Var2 = (tm30) a.S(i18, list5);
                            if (tm30Var2 != null) {
                                bl00 bl00Var2 = tm30Var2.b;
                                f4c0Var4.z(bl00Var2.a, bl00Var2.b);
                                f4c0Var4.o(tm30Var2.a);
                                f4c0Var4.i(e911Var2.j);
                                final int i20 = 0;
                                f4c0Var4.g(new MapObjectTapListener() { // from class: d911
                                    @Override // com.yandex.mapkit.map.MapObjectTapListener
                                    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                                        int i152 = i20;
                                        tm30 tm30Var22 = tm30Var2;
                                        e911 e911Var3 = e911Var2;
                                        switch (i152) {
                                            case 0:
                                                e911Var3.b.invoke(tm30Var22.c);
                                                break;
                                            default:
                                                e911Var3.b.invoke(tm30Var22.c);
                                                break;
                                        }
                                        return true;
                                    }
                                });
                            }
                            i18 = i19;
                        }
                        w4e0 w4e0Var = e911Var2.d;
                        if (w4e0Var != null) {
                            w4e0Var.o(z511Var.a);
                        } else {
                            e911Var2.d = ((xm00) i3yVar.getValue()).s(z511Var.a);
                        }
                        w4e0 w4e0Var2 = e911Var2.d;
                        if (w4e0Var2 != null) {
                            w4e0Var2.p(e911Var2.e);
                            i = 0;
                            w4e0Var2.v(false);
                            w4e0Var2.y(qje.t(xng0.bgMain, context));
                            w4e0Var2.z(e911Var2.f);
                            w4e0Var2.B(z511Var.a.getPoints().size() - 1, s8o.m(z511Var.b, context));
                        } else {
                            i = 0;
                        }
                        List list6 = z511Var.c;
                        if (list6 != null) {
                            int i21 = i;
                            for (Object obj3 : list6) {
                                int i22 = i21 + 1;
                                if (i21 < 0) {
                                    scc.m();
                                    throw null;
                                }
                                JamSegment jamSegment = (JamSegment) obj3;
                                w4e0 w4e0Var3 = e911Var2.d;
                                if (w4e0Var3 != null) {
                                    switch (nzo.a[jamSegment.getJamType().ordinal()]) {
                                        case 1:
                                            i2 = mqg0.component_gray_225_cold;
                                            break;
                                        case 2:
                                            i2 = mqg0.component_gray_225_cold;
                                            break;
                                        case 3:
                                            i2 = mqg0.component_lime_toxic;
                                            break;
                                        case 4:
                                            i2 = mqg0.component_amber_light;
                                            break;
                                        case 5:
                                            i2 = mqg0.component_red_toxic;
                                            break;
                                        case 6:
                                            i2 = mqg0.component_red_toxic;
                                            break;
                                        default:
                                            w511.b();
                                            return;
                                    }
                                    w4e0Var3.A(i21, s8o.m(new gdc(i2), context));
                                }
                                i21 = i22;
                            }
                        }
                        th = null;
                    }
                    i8 = i9;
                    th2 = th;
                    list3 = list2;
                    arrayList4 = arrayList;
                }
                List list7 = list3;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : list7) {
                    if (obj4 instanceof br30) {
                        arrayList8.add(obj4);
                    }
                }
                int size8 = arrayList8.size();
                ArrayList arrayList9 = this.j;
                int size9 = size8 - arrayList9.size();
                if (size9 > 0) {
                    int abs7 = Math.abs(size9);
                    for (int i23 = 0; i23 < abs7; i23++) {
                        arrayList9.add(xm00Var.r(cwa1.d(zzs.f)));
                    }
                } else if (size9 < 0) {
                    int abs8 = Math.abs(size9);
                    for (int i24 = 0; i24 < abs8; i24++) {
                        f4c0 f4c0Var5 = (f4c0) ycc.A(arrayList9);
                        if (f4c0Var5 != null) {
                            f4c0Var5.d();
                        }
                    }
                }
                Iterator it6 = arrayList9.iterator();
                int i25 = 0;
                while (it6.hasNext()) {
                    Object next4 = it6.next();
                    int i26 = i25 + 1;
                    if (i25 < 0) {
                        scc.m();
                        throw null;
                    }
                    f4c0 f4c0Var6 = (f4c0) next4;
                    br30 br30Var = (br30) a.S(i25, arrayList8);
                    if (br30Var != null) {
                        f4c0Var6.o(br30Var.b);
                        bl00 bl00Var3 = br30Var.a;
                        f4c0Var6.z(bl00Var3.a, bl00Var3.b);
                        f4c0Var6.i(this.l);
                    }
                    i25 = i26;
                }
                return;
            }
            Object next5 = it2.next();
            int i27 = i5 + 1;
            if (i5 < 0) {
                scc.m();
                throw null;
            }
            j741 j741Var = (j741) next5;
            cr30 cr30Var = (cr30) a.S(i5, arrayList2);
            if (cr30Var != null) {
                ((c) j741Var).d(new WalkingRouteUiState(cr30Var.a.getPoints(), null, 0.0f, null, null, null, cr30Var.b, 62));
            }
            i5 = i27;
        }
    }

    public final void h(ds30 ds30Var) {
        boolean z = ds30Var != null;
        f4c0 f4c0Var = this.e;
        if (f4c0Var != null) {
            f4c0Var.i(z);
        }
        f4c0 f4c0Var2 = this.f;
        if (f4c0Var2 != null) {
            f4c0Var2.i(z);
        }
        if (ds30Var != null) {
            bl00 bl00Var = ds30Var.b;
            IconStyle iconStyle = bl00Var.b;
            ImageProvider imageProvider = bl00Var.a;
            Point point = ds30Var.a;
            f4c0 f4c0Var3 = this.e;
            xm00 xm00Var = this.a;
            if (f4c0Var3 != null) {
                f4c0Var3.o(point);
            } else {
                f4c0 r = xm00Var.r(point);
                r.y(ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_end_point, this.c))));
                this.e = r;
            }
            f4c0 f4c0Var4 = this.f;
            if (f4c0Var4 == null) {
                f4c0 r2 = xm00Var.r(point);
                r2.z(imageProvider, iconStyle);
                this.f = r2;
            } else {
                f4c0Var4.o(point);
                f4c0 f4c0Var5 = this.f;
                if (f4c0Var5 != null) {
                    f4c0Var5.z(imageProvider, iconStyle);
                }
            }
        }
    }

    public final void i() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            e911 e911Var = (e911) it.next();
            e911Var.j = true;
            Iterator it2 = e911Var.h.iterator();
            while (it2.hasNext()) {
                ((f4c0) it2.next()).i(true);
            }
        }
    }

    public final void j() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((f4c0) it.next()).i(this.l);
        }
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            e911 e911Var = (e911) it2.next();
            boolean z = this.l;
            e911Var.i = z;
            Iterator it3 = e911Var.g.iterator();
            while (it3.hasNext()) {
                ((f4c0) it3.next()).i(z);
            }
        }
    }
}
