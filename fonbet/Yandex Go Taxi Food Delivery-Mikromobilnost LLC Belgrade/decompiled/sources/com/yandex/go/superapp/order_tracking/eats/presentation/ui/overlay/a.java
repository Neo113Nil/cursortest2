package com.yandex.go.superapp.order_tracking.eats.presentation.ui.overlay;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ah00;
import defpackage.b2f;
import defpackage.bu0;
import defpackage.c2f;
import defpackage.cwa1;
import defpackage.d2f;
import defpackage.e4h0;
import defpackage.evu0;
import defpackage.f190;
import defpackage.f1h0;
import defpackage.f4c0;
import defpackage.g190;
import defpackage.gh00;
import defpackage.h190;
import defpackage.h1p;
import defpackage.h2f;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mt00;
import defpackage.n6w0;
import defpackage.pav;
import defpackage.r8;
import defpackage.scc;
import defpackage.ssd;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ven;
import defpackage.xfn;
import defpackage.xm00;
import defpackage.zg21;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.eats_commons.EatsService;

/* loaded from: classes14.dex */
public final class a extends r8 {
    public final bu0 A;
    public final LinkedHashMap B;
    public final ArrayList C;
    public final ArrayList D;
    public final ArrayList E;
    public final Handler F;
    public xfn G;
    public final pav c;
    public final k7x0 w;
    public final h2f x;
    public final n6w0 y;
    public final xm00 z;

    public a(Context context, ah00 ah00Var, xm00 xm00Var, pav pavVar, k7x0 k7x0Var, h2f h2fVar, n6w0 n6w0Var) {
        super(5, ah00Var);
        this.c = pavVar;
        this.w = k7x0Var;
        this.x = h2fVar;
        this.y = n6w0Var;
        this.z = xm00Var.p();
        bu0 bu0Var = new bu0();
        bu0Var.a = context;
        this.A = bu0Var;
        this.B = new LinkedHashMap();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new Handler(Looper.getMainLooper());
        EmptyList emptyList = EmptyList.a;
        this.G = new xfn(emptyList, emptyList, emptyList);
    }

    public final ImageProvider Hg(String str, ImageProvider imageProvider, float f, float f2) {
        if (str != null && !evu0.J(str)) {
            zg21 zg21Var = (zg21) this.B.get(str);
            if (zg21Var == null || (zg21Var.a() && zg21Var.d)) {
                zg21 zg21Var2 = new zg21(this.c, ((m7x0) this.w).a(str), f, f2, new c2f(imageProvider, 0));
                zg21Var2.e = new b2f(this, 0);
                this.B.put(str, zg21Var2);
            } else if (zg21Var.a()) {
                return zg21Var;
            }
        }
        return imageProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void Ig(xfn xfnVar) {
        ImageProvider imageProvider;
        boolean z;
        this.G = xfnVar;
        List list = xfnVar.a;
        List list2 = xfnVar.c;
        List list3 = xfnVar.b;
        List list4 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            zzs zzsVar = ((f190) it.next()).c;
            arrayList.add(new Point(zzsVar.a, zzsVar.b));
        }
        ssd ssdVar = new ssd(6);
        xm00 xm00Var = this.z;
        ArrayList arrayList2 = this.C;
        ru.yandex.taxi.map.utils.a.I(xm00Var, arrayList2, arrayList, ssdVar);
        List list5 = list3;
        ArrayList arrayList3 = new ArrayList(tcc.n(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList3.add(cwa1.d(((h190) it2.next()).b));
        }
        boolean z2 = false;
        ssd ssdVar2 = new ssd(z2);
        ArrayList arrayList4 = this.D;
        ru.yandex.taxi.map.utils.a.I(xm00Var, arrayList4, arrayList3, ssdVar2);
        List list6 = list2;
        ArrayList arrayList5 = new ArrayList(tcc.n(list6, 10));
        Iterator it3 = list6.iterator();
        while (it3.hasNext()) {
            arrayList5.add(cwa1.d(((g190) it3.next()).b));
        }
        ssd ssdVar3 = new ssd(z2);
        ArrayList arrayList6 = this.E;
        ru.yandex.taxi.map.utils.a.I(xm00Var, arrayList6, arrayList5, ssdVar3);
        Iterator it4 = xfnVar.a.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it4.hasNext();
            bu0 bu0Var = this.A;
            if (!hasNext) {
                boolean z3 = z2;
                ?? r2 = z3;
                for (Object obj : list5) {
                    int i2 = r2 + 1;
                    if (r2 < 0) {
                        scc.m();
                        throw null;
                    }
                    h190 h190Var = (h190) obj;
                    f4c0 f4c0Var = (f4c0) kotlin.collections.a.S(r2, arrayList4);
                    if (f4c0Var != null) {
                        h1p h1pVar = h190Var.c;
                        bu0Var.getClass();
                        if (h1pVar == EatsService.EATS) {
                            imageProvider = (ImageProvider) bu0Var.d;
                            if (imageProvider == null) {
                                imageProvider = bu0Var.g(e4h0.ic_eats_pin);
                                bu0Var.d = imageProvider;
                            }
                        } else if (h1pVar == EatsService.GROCERY) {
                            imageProvider = (ImageProvider) bu0Var.e;
                            if (imageProvider == null) {
                                imageProvider = bu0Var.g(e4h0.ic_grocery_pin);
                                bu0Var.e = imageProvider;
                            }
                        } else if (h1pVar == EatsService.PHARMACY) {
                            imageProvider = (ImageProvider) bu0Var.f;
                            if (imageProvider == null) {
                                imageProvider = bu0Var.g(e4h0.ic_pharmacy_pin);
                                bu0Var.f = imageProvider;
                            }
                        } else if (h1pVar == EatsService.SHOP) {
                            imageProvider = (ImageProvider) bu0Var.g;
                            if (imageProvider == null) {
                                imageProvider = bu0Var.g(e4h0.ic_market_pin);
                                bu0Var.g = imageProvider;
                            }
                        } else if (h1pVar == EatsService.MARKET_VIEWER || h1pVar == EatsService.MARKET) {
                            imageProvider = (ImageProvider) bu0Var.h;
                            if (imageProvider == null) {
                                imageProvider = bu0Var.g(e4h0.ic_market_pin);
                                bu0Var.h = imageProvider;
                            }
                        } else {
                            imageProvider = (ImageProvider) bu0Var.i;
                            if (imageProvider == null) {
                                imageProvider = bu0Var.g(e4h0.ic_empty_pin);
                                bu0Var.i = imageProvider;
                            }
                        }
                        if (imageProvider != null) {
                            f4c0Var.y(Hg(h190Var.a, imageProvider, 0.5f, 0.87f));
                        }
                        f4c0Var.k(5.0f);
                    }
                    r2 = i2;
                }
                ?? r9 = z3;
                for (Object obj2 : list6) {
                    int i3 = r9 + 1;
                    if (r9 < 0) {
                        scc.m();
                        throw null;
                    }
                    g190 g190Var = (g190) obj2;
                    f4c0 f4c0Var2 = (f4c0) kotlin.collections.a.S(r9, arrayList6);
                    if (f4c0Var2 != null) {
                        ImageProvider imageProvider2 = (ImageProvider) bu0Var.c;
                        if (imageProvider2 == null) {
                            imageProvider2 = bu0Var.g(f1h0.ic_service_destination);
                            bu0Var.c = imageProvider2;
                        }
                        f4c0Var2.y(Hg(g190Var.a, imageProvider2, 0.5f, 0.87f));
                        f4c0Var2.k(5.0f);
                    }
                    r9 = i3;
                }
                ArrayList m0 = kotlin.collections.a.m0(arrayList6, kotlin.collections.a.m0(arrayList4, arrayList2));
                ArrayList arrayList7 = new ArrayList(tcc.n(m0, 10));
                Iterator it5 = m0.iterator();
                while (it5.hasNext()) {
                    arrayList7.add((Point) ((f4c0) it5.next()).h);
                }
                this.y.c(SuperAppRecenterPointRepository$Type.EATS, arrayList7);
                return;
            }
            Object next = it4.next();
            int i4 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            f190 f190Var = (f190) next;
            f4c0 f4c0Var3 = (f4c0) kotlin.collections.a.S(i, arrayList2);
            if (f4c0Var3 != null) {
                f4c0Var3.k(5.0f);
                ven venVar = f190Var.b;
                if (venVar != null) {
                    float f = venVar.c;
                    float f2 = venVar.b;
                    float f3 = venVar.d;
                    Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                    float f4 = f4c0Var3.i;
                    float f5 = (((f3 - f4) + 180.0f) % 360.0f) - 180.0f;
                    if (f5 < -180.0f) {
                        f5 += 360.0f;
                    }
                    boolean z4 = z2;
                    float[] fArr = new float[2];
                    fArr[z4 ? 1 : 0] = f4;
                    fArr[1] = f5 + f4;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    z = z4 ? 1 : 0;
                    ofFloat.addUpdateListener(new mt00(f4c0Var3, z ? 1 : 0));
                    ofFloat.start();
                    String str = venVar.a;
                    ImageProvider imageProvider3 = (ImageProvider) bu0Var.b;
                    if (imageProvider3 == null) {
                        imageProvider3 = bu0Var.g(e4h0.ic_courier_pin);
                        bu0Var.b = imageProvider3;
                    }
                    f4c0Var3.z(Hg(str, imageProvider3, f2, f), new IconStyle(new PointF(f2, f), RotationType.ROTATE, null, null, null, null, null));
                } else {
                    z = z2;
                    String str2 = f190Var.a;
                    ImageProvider imageProvider4 = (ImageProvider) bu0Var.b;
                    if (imageProvider4 == null) {
                        imageProvider4 = bu0Var.g(e4h0.ic_courier_pin);
                        bu0Var.b = imageProvider4;
                    }
                    f4c0Var3.y(Hg(str2, imageProvider4, 0.5f, 0.5f));
                }
            } else {
                z = z2;
            }
            z2 = z;
            i = i4;
        }
    }

    public final void attach() {
        this.z.b(((gh00) ((ah00) this.b)).i);
        d2f d2fVar = new d2f(this);
        h2f h2fVar = this.x;
        h2fVar.Bg(d2fVar);
        tje.N(h2fVar.Jg(), null, null, new CourierMapOverlayPresenter$attachView$1(h2fVar, d2fVar, null), 3);
    }
}
