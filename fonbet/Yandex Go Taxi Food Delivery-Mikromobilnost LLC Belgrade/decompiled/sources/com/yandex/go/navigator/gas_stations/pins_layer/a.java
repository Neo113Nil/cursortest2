package com.yandex.go.navigator.gas_stations.pins_layer;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.yandex.go.navigator.driving.SearchSourceType;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ah00;
import defpackage.ap00;
import defpackage.bl00;
import defpackage.bws;
import defpackage.cws;
import defpackage.dib1;
import defpackage.dws;
import defpackage.ews;
import defpackage.f4c0;
import defpackage.fws;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.mth;
import defpackage.qva1;
import defpackage.r58;
import defpackage.tje;
import defpackage.tts;
import defpackage.tus;
import defpackage.uts;
import defpackage.w511;
import defpackage.xm00;
import defpackage.xvs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes12.dex */
public final class a implements xvs {
    public xm00 B;
    public final h a;
    public final ah00 b;
    public final tts c;
    public final com.yandex.go.navigator.gas_stations.providers.a w;
    public xm00 x;
    public boolean y = true;
    public final HashMap z = new HashMap();
    public final HashMap A = new HashMap();
    public final r58 C = new r58(2, this);

    public a(h hVar, ah00 ah00Var, tts ttsVar, com.yandex.go.navigator.gas_stations.providers.a aVar) {
        this.a = hVar;
        this.b = ah00Var;
        this.c = ttsVar;
        this.w = aVar;
    }

    public static Rect B0(f4c0 f4c0Var, ScreenPoint screenPoint) {
        Bitmap bitmap;
        if (screenPoint == null) {
            return null;
        }
        ImageProvider imageProvider = f4c0Var.k;
        float width = ((imageProvider == null || (bitmap = imageProvider.get$image()) == null) ? 0 : bitmap.getWidth()) / 4.0f;
        return new Rect((int) (((int) screenPoint.getX()) - width), (int) screenPoint.getY(), (int) (((int) screenPoint.getX()) + width), (int) (((int) screenPoint.getY()) + (f4c0Var.q() / 2.0f)));
    }

    public static f4c0 h(xm00 xm00Var, uts utsVar, Float f) {
        f4c0 r = xm00Var.r(utsVar.d);
        bl00 bl00Var = utsVar.c;
        r.y(bl00Var.a);
        r.D(bl00Var.b);
        if (f != null) {
            r.k(f.floatValue());
        }
        r.h(utsVar);
        return r;
    }

    public static void s5(ap00 ap00Var, boolean z) {
        ap00Var.j(z, new Animation(Animation.Type.SMOOTH, 0.25f), null);
    }

    public final void I() {
        xm00 p = ((xm00) this.c.b.getValue()).p();
        p.k(8.0f);
        p.g(this.C);
        this.x = p;
        h hVar = this.a;
        hVar.Bg(this);
        hVar.I.a = SearchSourceType.PETROL_STATION_SEARCH;
        com.yandex.go.navigator.gas_stations.repositories.c cVar = hVar.x;
        tje.N(hVar.Jg(), null, null, new GasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$1(new mth(kotlinx.coroutines.flow.e.I(cVar.f, new GasStationsPinsLayerPresenter$collectGasStations$1(2, hVar, h.class, "mapGeoObjectToGasStationsPinsLayerContent", "mapGeoObjectToGasStationsPinsLayerContent(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), 6), null, (xvs) hVar.Dg()), 3);
        jqr jqrVar = new jqr(hVar.A.c, new GasStationsPinsLayerPresenter$collectGasStations$3(hVar, null), 3);
        tus tusVar = hVar.B;
        tje.N(hVar.Jg(), null, null, new GasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.m(jqrVar, tusVar.h, tusVar.k, tusVar.c, new GasStationsPinsLayerPresenter$collectGasStations$4(hVar, null)), null, (xvs) hVar.Dg()), 3);
        tje.N(hVar.Jg(), null, null, new GasStationsPinsLayerPresenter$collectGasStations$$inlined$safeCollectIn$3(cVar.h, null, hVar), 3);
        tje.N(hVar.Jg(), null, null, new GasStationsPinsLayerPresenter$observeFreeCameraSearch$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.X(tusVar.m, new GasStationsPinsLayerPresenter$observeFreeCameraSearch$$inlined$flatMapLatest$1(hVar, null)), 500L), null, hVar), 3);
        tje.N(hVar.Jg(), null, null, new GasStationsPinsLayerPresenter$observeCameraUpdates$$inlined$safeCollectIn$1(new d(kotlinx.coroutines.flow.e.t(new g(dib1.c(hVar.D), hVar))), null, (xvs) hVar.Dg()), 3);
        tje.N(hVar.Jg(), null, null, new GasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1(hVar.G.a(), null, hVar), 3);
    }

    public final boolean M1(f4c0 f4c0Var, ScreenPoint screenPoint, ap00 ap00Var) {
        Rect B0;
        Rect B02 = B0(f4c0Var, screenPoint);
        if (B02 == null) {
            return false;
        }
        f4c0 f4c0Var2 = ap00Var instanceof f4c0 ? (f4c0) ap00Var : null;
        if (f4c0Var2 == null) {
            return false;
        }
        uts a = qva1.a(f4c0Var2);
        Point point = a != null ? a.d : null;
        uts a2 = qva1.a(f4c0Var);
        if (jl40.l(point, a2 != null ? a2.d : null) || !f4c0Var2.b || (B0 = B0(f4c0Var2, N3(f4c0Var2))) == null) {
            return false;
        }
        return Rect.intersects(B02, B0);
    }

    public final ScreenPoint N3(f4c0 f4c0Var) {
        TaxiMapView h = ((gh00) this.b).h();
        if (h != null) {
            if (f4c0Var == null) {
                f4c0Var = null;
            }
            if (f4c0Var != null) {
                uts a = qva1.a(f4c0Var);
                Point point = a != null ? a.d : null;
                if (point != null) {
                    return h.worldToScreen(point);
                }
            }
        }
        return null;
    }

    public final void Q2() {
        ap00 ap00Var;
        uts a;
        xm00 xm00Var = this.B;
        f4c0 f4c0Var = (f4c0) this.A.get((xm00Var == null || (ap00Var = (ap00) kotlin.collections.a.R(xm00Var.n())) == null || (a = qva1.a(ap00Var)) == null) ? null : a.a);
        if (f4c0Var != null) {
            f4c0Var.i(true);
        }
        xm00 xm00Var2 = this.B;
        if (xm00Var2 != null) {
            ((xm00) this.c.b.getValue()).o(xm00Var2);
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p6() {
        boolean z;
        f4c0 f4c0Var;
        ap00 ap00Var;
        uts a;
        if (this.y) {
            HashMap hashMap = this.A;
            Collection values = hashMap.values();
            ArrayList arrayList = new ArrayList();
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f4c0 f4c0Var2 = (f4c0) it.next();
                ScreenPoint N3 = N3(f4c0Var2);
                Pair pair = N3 != null ? new Pair(f4c0Var2, N3) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                f4c0 f4c0Var3 = (f4c0) pair2.getFirst();
                ScreenPoint screenPoint = (ScreenPoint) pair2.getSecond();
                uts a2 = qva1.a(f4c0Var3);
                String str = a2 != null ? a2.a : null;
                xm00 xm00Var = this.B;
                boolean l = jl40.l(str, (xm00Var == null || (ap00Var = (ap00) kotlin.collections.a.R(xm00Var.n())) == null || (a = qva1.a(ap00Var)) == null) ? null : a.a);
                xm00 xm00Var2 = this.B;
                ap00 ap00Var2 = xm00Var2 != null ? (ap00) kotlin.collections.a.R(xm00Var2.n()) : null;
                if (!(ap00Var2 != null ? M1(f4c0Var3, screenPoint, ap00Var2) : false)) {
                    Collection values2 = hashMap.values();
                    if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                        Iterator it3 = values2.iterator();
                        while (it3.hasNext()) {
                            if (M1(f4c0Var3, screenPoint, (f4c0) it3.next())) {
                            }
                        }
                    }
                    z = false;
                    float f = 8.0f;
                    f4c0Var3.k((!z || l) ? 8.0f : 9.0f);
                    if (l) {
                        s5(f4c0Var3, !z);
                    } else {
                        f4c0Var3.i(false);
                    }
                    f4c0Var = (f4c0) this.z.get(str);
                    if (f4c0Var != null) {
                        boolean z2 = l || !z;
                        com.yandex.go.navigator.gas_stations.providers.a aVar = this.w;
                        f4c0Var.y(z2 ? (ImageProvider) aVar.e.getValue() : (ImageProvider) aVar.f.getValue());
                    }
                    if (f4c0Var != null) {
                        if (l) {
                            f = 100.0f;
                        } else if (!z) {
                            f = 9.0f;
                        }
                        f4c0Var.k(f);
                    }
                }
                z = true;
                float f2 = 8.0f;
                f4c0Var3.k((!z || l) ? 8.0f : 9.0f);
                if (l) {
                }
                f4c0Var = (f4c0) this.z.get(str);
                if (f4c0Var != null) {
                }
                if (f4c0Var != null) {
                }
            }
        }
    }

    public final void q4(boolean z) {
        ap00 ap00Var;
        this.y = z;
        xm00 xm00Var = this.B;
        if (xm00Var != null && (ap00Var = (ap00) kotlin.collections.a.R(xm00Var.n())) != null) {
            s5(ap00Var, z);
        }
        Iterator it = this.z.values().iterator();
        while (it.hasNext()) {
            s5((f4c0) it.next(), z);
        }
        if (z) {
            p6();
            return;
        }
        Iterator it2 = this.A.values().iterator();
        while (it2.hasNext()) {
            s5((f4c0) it2.next(), false);
        }
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        HashMap hashMap;
        fws fwsVar = (fws) obj;
        boolean z = fwsVar instanceof cws;
        HashMap hashMap2 = this.A;
        if (!z) {
            if (jl40.l(fwsVar, bws.a)) {
                xm00 xm00Var = this.x;
                if (xm00Var != null) {
                    xm00Var.m();
                }
                hashMap2.clear();
                return;
            }
            if (fwsVar instanceof ews) {
                p6();
                return;
            }
            if (!(fwsVar instanceof dws)) {
                w511.b();
                return;
            }
            Q2();
            uts utsVar = ((dws) fwsVar).a;
            if (utsVar != null) {
                f4c0 f4c0Var = (f4c0) hashMap2.get(utsVar.a);
                boolean z2 = f4c0Var != null ? f4c0Var.b : false;
                xm00 p = ((xm00) this.c.b.getValue()).p();
                f4c0 h = h(p, utsVar, Float.valueOf(100.0f));
                if (!z2) {
                    s5(h, true);
                }
                this.B = p;
            }
            p6();
            return;
        }
        cws cwsVar = (cws) fwsVar;
        Iterator it = cwsVar.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.z;
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            f4c0 f4c0Var2 = (f4c0) hashMap2.get(str);
            if (f4c0Var2 != null) {
                f4c0Var2.d();
            }
            f4c0 f4c0Var3 = (f4c0) hashMap.get(str);
            if (f4c0Var3 != null) {
                f4c0Var3.d();
            }
            hashMap2.remove(str);
            hashMap.remove(str);
        }
        for (uts utsVar2 : cwsVar.b) {
            xm00 xm00Var2 = this.x;
            if (xm00Var2 != null) {
                hashMap2.put(utsVar2.a, h(xm00Var2, utsVar2, null));
                String str2 = utsVar2.a;
                f4c0 r = xm00Var2.r(utsVar2.d);
                r.h(utsVar2);
                hashMap.put(str2, r);
            }
        }
        p6();
    }
}
