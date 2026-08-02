package com.yandex.go.navigator.ui;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.TextStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ah00;
import defpackage.bl00;
import defpackage.bzw;
import defpackage.c06;
import defpackage.cwa1;
import defpackage.czo0;
import defpackage.e621;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.f4c0;
import defpackage.gci0;
import defpackage.gh00;
import defpackage.gvu0;
import defpackage.hbp0;
import defpackage.ne50;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.pwy0;
import defpackage.re50;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.u8b1;
import defpackage.wa50;
import defpackage.xm00;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class m implements wa50 {
    public final Context a;
    public final com.yandex.go.navigator.providers.a b;
    public final ah00 c;
    public final re50 d;
    public final bzw e;
    public final e621 f;
    public final com.yandex.go.navigator.favorites.f g;
    public final pwy0 h;
    public xm00 j;
    public c06 k;
    public c06 l;
    public final hbp0 i = new hbp0(new czo0(14), "NavigatorPinsController", null);
    public final ArrayList m = new ArrayList();

    public m(Context context, com.yandex.go.navigator.providers.a aVar, ah00 ah00Var, re50 re50Var, bzw bzwVar, e621 e621Var, com.yandex.go.navigator.favorites.f fVar, pwy0 pwy0Var) {
        this.a = context;
        this.b = aVar;
        this.c = ah00Var;
        this.d = re50Var;
        this.e = bzwVar;
        this.f = e621Var;
        this.g = fVar;
        this.h = pwy0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cc, code lost:
    
        if (r12.g(r14, r3, r1) == r2) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8 A[LOOP:1: B:41:0x00e2->B:43:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.yandex.go.navigator.ui.m] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0130 -> B:11:0x0132). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(m mVar, pe50 pe50Var, ContinuationImpl continuationImpl) {
        NavigatorPinsController$updatePlacemarks$1 navigatorPinsController$updatePlacemarks$1;
        int i;
        xm00 xm00Var;
        Iterator it;
        int i2;
        Iterator it2;
        ArrayList arrayList;
        xm00 xm00Var2;
        ArrayList arrayList2 = mVar.m;
        if (continuationImpl instanceof NavigatorPinsController$updatePlacemarks$1) {
            navigatorPinsController$updatePlacemarks$1 = (NavigatorPinsController$updatePlacemarks$1) continuationImpl;
            int i3 = navigatorPinsController$updatePlacemarks$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                navigatorPinsController$updatePlacemarks$1.label = i3 - Integer.MIN_VALUE;
                Object obj = navigatorPinsController$updatePlacemarks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPinsController$updatePlacemarks$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xm00Var = mVar.j;
                    if (xm00Var != null) {
                        c06 c06Var = mVar.k;
                        if (c06Var != null) {
                            xm00Var.o((f4c0) c06Var.b);
                            xm00Var.o((f4c0) c06Var.a);
                            mVar.k = null;
                        }
                        c06 c06Var2 = mVar.l;
                        if (c06Var2 != null) {
                            xm00 xm00Var3 = mVar.j;
                            if (xm00Var3 != null) {
                                xm00Var3.o((f4c0) c06Var2.b);
                                xm00Var3.o((f4c0) c06Var2.a);
                            }
                            mVar.l = null;
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            f4c0 f4c0Var = (f4c0) it3.next();
                            xm00 xm00Var4 = mVar.j;
                            if (xm00Var4 != null) {
                                xm00Var4.o(f4c0Var);
                            }
                        }
                        arrayList2.clear();
                        Point d = cwa1.d(pe50Var.a.c.B());
                        navigatorPinsController$updatePlacemarks$1.L$0 = pe50Var;
                        navigatorPinsController$updatePlacemarks$1.L$1 = xm00Var;
                        navigatorPinsController$updatePlacemarks$1.L$2 = null;
                        navigatorPinsController$updatePlacemarks$1.label = 1;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = navigatorPinsController$updatePlacemarks$1.I$0;
                    it2 = (Iterator) navigatorPinsController$updatePlacemarks$1.L$5;
                    ?? r5 = (List) navigatorPinsController$updatePlacemarks$1.L$3;
                    xm00Var2 = (xm00) navigatorPinsController$updatePlacemarks$1.L$1;
                    kotlin.b.b(obj);
                    ArrayList arrayList3 = r5;
                    ArrayList arrayList4 = arrayList3;
                    i2 = i4;
                    arrayList = arrayList4;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        Address address = (Address) next;
                        if (i2 == scc.f(arrayList)) {
                            navigatorPinsController$updatePlacemarks$1.L$0 = null;
                            navigatorPinsController$updatePlacemarks$1.L$1 = xm00Var2;
                            navigatorPinsController$updatePlacemarks$1.L$2 = null;
                            navigatorPinsController$updatePlacemarks$1.L$3 = arrayList;
                            navigatorPinsController$updatePlacemarks$1.L$4 = null;
                            navigatorPinsController$updatePlacemarks$1.L$5 = it2;
                            navigatorPinsController$updatePlacemarks$1.L$6 = null;
                            navigatorPinsController$updatePlacemarks$1.L$7 = null;
                            navigatorPinsController$updatePlacemarks$1.I$0 = i5;
                            navigatorPinsController$updatePlacemarks$1.I$1 = i2;
                            navigatorPinsController$updatePlacemarks$1.label = 2;
                            if (mVar.f(xm00Var2, address, navigatorPinsController$updatePlacemarks$1) != coroutineSingletons) {
                                arrayList3 = arrayList;
                                i4 = i5;
                                ArrayList arrayList42 = arrayList3;
                                i2 = i4;
                                arrayList = arrayList42;
                                while (it2.hasNext()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        Point d2 = cwa1.d(address.B());
                        ImageProvider fromBitmap = ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_end_point, mVar.a)));
                        f4c0 r = xm00Var2.r(d2);
                        r.y(fromBitmap);
                        String D1 = address.D1();
                        if (D1.length() > 40) {
                            D1 = gvu0.A0(40, D1).concat(EllipsizedTextView.DEFAULT_ELLIPSIS);
                        }
                        e(r, D1);
                        arrayList2.add(r);
                        i2 = i5;
                    }
                    return zy11.a;
                }
                xm00 xm00Var5 = (xm00) navigatorPinsController$updatePlacemarks$1.L$1;
                pe50 pe50Var2 = (pe50) navigatorPinsController$updatePlacemarks$1.L$0;
                kotlin.b.b(obj);
                xm00Var = xm00Var5;
                pe50Var = pe50Var2;
                List list = pe50Var.b;
                ArrayList arrayList5 = new ArrayList(tcc.n(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((ne50) it.next()).c);
                }
                i2 = 0;
                it2 = arrayList5.iterator();
                arrayList = arrayList5;
                xm00Var2 = xm00Var;
                while (it2.hasNext()) {
                }
                return zy11.a;
            }
        }
        navigatorPinsController$updatePlacemarks$1 = new NavigatorPinsController$updatePlacemarks$1(mVar, continuationImpl);
        Object obj2 = navigatorPinsController$updatePlacemarks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPinsController$updatePlacemarks$1.label;
        if (i != 0) {
        }
        List list2 = pe50Var.b;
        ArrayList arrayList52 = new ArrayList(tcc.n(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        i2 = 0;
        it2 = arrayList52.iterator();
        arrayList = arrayList52;
        xm00Var2 = xm00Var;
        while (it2.hasNext()) {
        }
        return zy11.a;
    }

    public static final void d(m mVar, boolean z, Integer num) {
        ArrayList arrayList = mVar.m;
        c06 c06Var = mVar.k;
        if (c06Var != null) {
            ((f4c0) c06Var.a).i(z);
            ((f4c0) c06Var.b).i(z);
        }
        if (z || num == null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f4c0) it.next()).i(true);
            }
            return;
        }
        int intValue = num.intValue() - 1;
        if (intValue < 0) {
            intValue = 0;
        }
        int size = arrayList.size() - intValue;
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ((f4c0) next).i(i >= size);
            i = i2;
        }
    }

    public static void e(f4c0 f4c0Var, String str) {
        if (evu0.J(str)) {
            return;
        }
        ((PlacemarkMapObject) f4c0Var.g).setText(str);
        TextStyle textStyle = new TextStyle();
        textStyle.setPlacement(TextStyle.Placement.BOTTOM);
        textStyle.setSize(10.0f);
        textStyle.setOffset(4.0f);
        textStyle.setOutlineWidth(3.0f);
        ((PlacemarkMapObject) f4c0Var.g).setTextStyle(textStyle);
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void attach() {
        hbp0 hbp0Var = this.i;
        hbp0Var.a();
        xm00 xm00Var = this.j;
        ah00 ah00Var = this.c;
        if (xm00Var != null) {
            ((gh00) ah00Var).i.o(xm00Var);
        }
        xm00 p = ((gh00) ah00Var).i.p();
        this.j = p;
        this.g.c(p);
        tje.N(hbp0Var.c(), null, null, new NavigatorPinsController$attach$$inlined$safeCollectIn$1(new m0(this.h.a(), this.d.c, new NavigatorPinsController$attach$2(3, null)), null, this), 3);
        com.yandex.go.coroutines.b.h(hbp0Var, new m0((gci0) this.e.b, (gci0) this.f.b, new NavigatorPinsController$attach$4(this, null)));
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void detach() {
        xm00 xm00Var;
        com.yandex.go.navigator.favorites.f fVar = this.g;
        xm00 xm00Var2 = fVar.k;
        if (xm00Var2 != null) {
            xm00Var2.g(null);
        }
        xm00 xm00Var3 = fVar.k;
        if (xm00Var3 != null && (xm00Var = fVar.j) != null) {
            xm00Var.o(xm00Var3);
        }
        fVar.k = null;
        fVar.j = null;
        fVar.i.b();
        this.i.b();
        xm00 xm00Var4 = this.j;
        if (xm00Var4 != null) {
            ((gh00) this.c).i.o(xm00Var4);
        }
        this.j = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(xm00 xm00Var, Address address, ContinuationImpl continuationImpl) {
        NavigatorPinsController$addDestPointPlacemark$1 navigatorPinsController$addDestPointPlacemark$1;
        int i;
        f4c0 f4c0Var;
        if (continuationImpl instanceof NavigatorPinsController$addDestPointPlacemark$1) {
            navigatorPinsController$addDestPointPlacemark$1 = (NavigatorPinsController$addDestPointPlacemark$1) continuationImpl;
            int i2 = navigatorPinsController$addDestPointPlacemark$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorPinsController$addDestPointPlacemark$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorPinsController$addDestPointPlacemark$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPinsController$addDestPointPlacemark$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Point d = cwa1.d(address.B());
                    ImageProvider fromBitmap = ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_end_point, this.a)));
                    f4c0 r = xm00Var.r(d);
                    r.y(fromBitmap);
                    String D1 = address.D1();
                    if (D1.length() > 40) {
                        D1 = gvu0.A0(40, D1).concat(EllipsizedTextView.DEFAULT_ELLIPSIS);
                    }
                    e(r, D1);
                    tls navigatorPinsController$addDestPointPlacemark$pinPlacemark$1 = new NavigatorPinsController$addDestPointPlacemark$pinPlacemark$1(1, this.b, com.yandex.go.navigator.providers.a.class, "createDestImageProvider", "createDestImageProvider(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    navigatorPinsController$addDestPointPlacemark$1.L$0 = null;
                    navigatorPinsController$addDestPointPlacemark$1.L$1 = null;
                    navigatorPinsController$addDestPointPlacemark$1.L$2 = null;
                    navigatorPinsController$addDestPointPlacemark$1.L$3 = null;
                    navigatorPinsController$addDestPointPlacemark$1.L$4 = r;
                    navigatorPinsController$addDestPointPlacemark$1.L$5 = null;
                    navigatorPinsController$addDestPointPlacemark$1.label = 1;
                    obj = h(xm00Var, d, navigatorPinsController$addDestPointPlacemark$pinPlacemark$1, navigatorPinsController$addDestPointPlacemark$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    f4c0Var = r;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f4c0Var = (f4c0) navigatorPinsController$addDestPointPlacemark$1.L$4;
                    kotlin.b.b(obj);
                }
                this.l = new c06(f4c0Var, (f4c0) obj);
                return zy11.a;
            }
        }
        navigatorPinsController$addDestPointPlacemark$1 = new NavigatorPinsController$addDestPointPlacemark$1(this, continuationImpl);
        Object obj3 = navigatorPinsController$addDestPointPlacemark$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPinsController$addDestPointPlacemark$1.label;
        if (i != 0) {
        }
        this.l = new c06(f4c0Var, (f4c0) obj3);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(xm00 xm00Var, Point point, ContinuationImpl continuationImpl) {
        NavigatorPinsController$addFromPointPlacemark$1 navigatorPinsController$addFromPointPlacemark$1;
        int i;
        f4c0 f4c0Var;
        if (continuationImpl instanceof NavigatorPinsController$addFromPointPlacemark$1) {
            navigatorPinsController$addFromPointPlacemark$1 = (NavigatorPinsController$addFromPointPlacemark$1) continuationImpl;
            int i2 = navigatorPinsController$addFromPointPlacemark$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorPinsController$addFromPointPlacemark$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorPinsController$addFromPointPlacemark$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPinsController$addFromPointPlacemark$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ImageProvider fromBitmap = ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_start_point, this.a)));
                    f4c0 r = xm00Var.r(point);
                    r.y(fromBitmap);
                    tls navigatorPinsController$addFromPointPlacemark$pinPlacemark$1 = new NavigatorPinsController$addFromPointPlacemark$pinPlacemark$1(1, this.b, com.yandex.go.navigator.providers.a.class, "createStartImageProvider", "createStartImageProvider(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    navigatorPinsController$addFromPointPlacemark$1.L$0 = null;
                    navigatorPinsController$addFromPointPlacemark$1.L$1 = null;
                    navigatorPinsController$addFromPointPlacemark$1.L$2 = null;
                    navigatorPinsController$addFromPointPlacemark$1.L$3 = r;
                    navigatorPinsController$addFromPointPlacemark$1.label = 1;
                    obj = h(xm00Var, point, navigatorPinsController$addFromPointPlacemark$pinPlacemark$1, navigatorPinsController$addFromPointPlacemark$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    f4c0Var = r;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f4c0Var = (f4c0) navigatorPinsController$addFromPointPlacemark$1.L$3;
                    kotlin.b.b(obj);
                }
                this.k = new c06(f4c0Var, (f4c0) obj);
                return zy11.a;
            }
        }
        navigatorPinsController$addFromPointPlacemark$1 = new NavigatorPinsController$addFromPointPlacemark$1(this, continuationImpl);
        Object obj3 = navigatorPinsController$addFromPointPlacemark$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPinsController$addFromPointPlacemark$1.label;
        if (i != 0) {
        }
        this.k = new c06(f4c0Var, (f4c0) obj3);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(xm00 xm00Var, Point point, tls tlsVar, ContinuationImpl continuationImpl) {
        NavigatorPinsController$addPinPlacemark$1 navigatorPinsController$addPinPlacemark$1;
        int i;
        f4c0 r;
        IconStyle iconStyle;
        IconStyle iconStyle2;
        if (continuationImpl instanceof NavigatorPinsController$addPinPlacemark$1) {
            navigatorPinsController$addPinPlacemark$1 = (NavigatorPinsController$addPinPlacemark$1) continuationImpl;
            int i2 = navigatorPinsController$addPinPlacemark$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorPinsController$addPinPlacemark$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorPinsController$addPinPlacemark$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPinsController$addPinPlacemark$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r = xm00Var.r(point);
                    navigatorPinsController$addPinPlacemark$1.L$0 = null;
                    navigatorPinsController$addPinPlacemark$1.L$1 = null;
                    navigatorPinsController$addPinPlacemark$1.L$2 = null;
                    navigatorPinsController$addPinPlacemark$1.L$3 = r;
                    navigatorPinsController$addPinPlacemark$1.label = 1;
                    obj = tlsVar.invoke(navigatorPinsController$addPinPlacemark$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r = (f4c0) navigatorPinsController$addPinPlacemark$1.L$3;
                    kotlin.b.b(obj);
                }
                bl00 bl00Var = (bl00) obj;
                r.y(bl00Var.a);
                r.D(bl00Var.b);
                iconStyle = r.m;
                if (iconStyle != null) {
                    iconStyle.setAnchor(new PointF(0.5f, 0.9f));
                }
                iconStyle2 = r.m;
                if (iconStyle2 != null) {
                    iconStyle2.setZIndex(new Float(20.0f));
                }
                return r;
            }
        }
        navigatorPinsController$addPinPlacemark$1 = new NavigatorPinsController$addPinPlacemark$1(this, continuationImpl);
        Object obj3 = navigatorPinsController$addPinPlacemark$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPinsController$addPinPlacemark$1.label;
        if (i != 0) {
        }
        bl00 bl00Var2 = (bl00) obj3;
        r.y(bl00Var2.a);
        r.D(bl00Var2.b);
        iconStyle = r.m;
        if (iconStyle != null) {
        }
        iconStyle2 = r.m;
        if (iconStyle2 != null) {
        }
        return r;
    }
}
