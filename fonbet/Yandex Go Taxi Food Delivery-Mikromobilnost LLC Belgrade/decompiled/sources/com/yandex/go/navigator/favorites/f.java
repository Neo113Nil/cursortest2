package com.yandex.go.navigator.favorites;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.util.Range;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.go.navigator.favorites.data.FavoritePlaceType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.TextStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a4c0;
import defpackage.ah00;
import defpackage.biq0;
import defpackage.bzw;
import defpackage.c1o;
import defpackage.cwa1;
import defpackage.czo0;
import defpackage.dib1;
import defpackage.f4c0;
import defpackage.gci0;
import defpackage.gh00;
import defpackage.gvu0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.lgq0;
import defpackage.mth;
import defpackage.mub0;
import defpackage.ny61;
import defpackage.oqx;
import defpackage.qgp;
import defpackage.rgp;
import defpackage.sgp;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ugp;
import defpackage.w511;
import defpackage.xm00;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class f {
    public final com.yandex.go.navigator.favorites.repository.b a;
    public final com.yandex.go.navigator.favorites.repository.a b;
    public final bzw c;
    public final ah00 d;
    public final lgq0 e;
    public final Context f;
    public final ru.yandex.taxi.widget.utils.e g;
    public final com.yandex.go.navigator.favorites.analylics.a h;
    public xm00 j;
    public xm00 k;
    public final tpr m;
    public Pair n;
    public final hbp0 i = new hbp0(new czo0(14), "FavoritesPinsController", null);
    public Map l = new LinkedHashMap();
    public final i3y o = kotlin.a.b(LazyThreadSafetyMode.NONE, new c1o(18, this));

    public f(com.yandex.go.navigator.favorites.repository.b bVar, com.yandex.go.navigator.favorites.repository.a aVar, bzw bzwVar, ah00 ah00Var, lgq0 lgq0Var, Context context, ru.yandex.taxi.widget.utils.e eVar, com.yandex.go.navigator.favorites.analylics.a aVar2) {
        this.a = bVar;
        this.b = aVar;
        this.c = bzwVar;
        this.d = ah00Var;
        this.e = lgq0Var;
        this.f = context;
        this.g = eVar;
        this.h = aVar2;
        this.m = kotlinx.coroutines.flow.e.t(new e(dib1.c(ah00Var)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ContinuationImpl continuationImpl) {
        FavoritesPinsController$awaitSummaryClosed$1 favoritesPinsController$awaitSummaryClosed$1;
        int i;
        fVar.getClass();
        if (continuationImpl instanceof FavoritesPinsController$awaitSummaryClosed$1) {
            favoritesPinsController$awaitSummaryClosed$1 = (FavoritesPinsController$awaitSummaryClosed$1) continuationImpl;
            int i2 = favoritesPinsController$awaitSummaryClosed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$awaitSummaryClosed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPinsController$awaitSummaryClosed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$awaitSummaryClosed$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c((gci0) fVar.c.b);
                    favoritesPinsController$awaitSummaryClosed$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(cVar, favoritesPinsController$awaitSummaryClosed$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        favoritesPinsController$awaitSummaryClosed$1 = new FavoritesPinsController$awaitSummaryClosed$1(fVar, continuationImpl);
        Object obj2 = favoritesPinsController$awaitSummaryClosed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$awaitSummaryClosed$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f fVar, ugp ugpVar, Continuation continuation) {
        FavoritesPinsController$selectPlacemark$1 favoritesPinsController$selectPlacemark$1;
        int i;
        biq0 biq0Var;
        fVar.getClass();
        if (continuation instanceof FavoritesPinsController$selectPlacemark$1) {
            favoritesPinsController$selectPlacemark$1 = (FavoritesPinsController$selectPlacemark$1) continuation;
            int i2 = favoritesPinsController$selectPlacemark$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$selectPlacemark$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPinsController$selectPlacemark$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$selectPlacemark$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a4c0 a4c0Var = (a4c0) fVar.l.get(ugpVar);
                    if (a4c0Var != null) {
                        a4c0Var.a.i(false);
                        favoritesPinsController$selectPlacemark$1.L$0 = ugpVar;
                        favoritesPinsController$selectPlacemark$1.L$1 = null;
                        favoritesPinsController$selectPlacemark$1.label = 1;
                        obj = fVar.g(ugpVar, a4c0Var, favoritesPinsController$selectPlacemark$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ugpVar = (ugp) favoritesPinsController$selectPlacemark$1.L$0;
                kotlin.b.b(obj);
                biq0Var = (biq0) obj;
                if (biq0Var != null) {
                    fVar.n = new Pair(ugpVar, biq0Var);
                    return zy11Var;
                }
                return zy11Var;
            }
        }
        favoritesPinsController$selectPlacemark$1 = new FavoritesPinsController$selectPlacemark$1(fVar, continuation);
        Object obj3 = favoritesPinsController$selectPlacemark$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$selectPlacemark$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        biq0Var = (biq0) obj3;
        if (biq0Var != null) {
        }
        return zy11Var2;
    }

    public final void c(xm00 xm00Var) {
        hbp0 hbp0Var = this.i;
        hbp0Var.a();
        this.k = xm00Var.p();
        this.j = xm00Var;
        tje.N(hbp0Var.c(), null, null, new FavoritesPinsController$attach$1(this, null), 3);
        xm00 xm00Var2 = this.k;
        if (xm00Var2 != null) {
            xm00Var2.g(new MapObjectTapListener() { // from class: com.yandex.go.navigator.favorites.a
                @Override // com.yandex.mapkit.map.MapObjectTapListener
                public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                    Object userData = mapObject.getUserData();
                    ugp ugpVar = userData instanceof ugp ? (ugp) userData : null;
                    if (ugpVar == null) {
                        return false;
                    }
                    f fVar = f.this;
                    tje.N(fVar.i.c(), null, null, new FavoritesPinsController$listenPlacemarkTaps$1$1$1(fVar, ugpVar, null), 3);
                    fVar.e.l(ugpVar);
                    return true;
                }
            });
        }
        tje.N(hbp0Var.c(), null, null, new FavoritesPinsController$listenSelectedPlace$$inlined$safeCollectIn$1(new mth(new jqr((gci0) this.e.b, new FavoritesPinsController$listenSelectedPlace$1(this, null), 3), 6), null, this), 3);
        tje.N(hbp0Var.c(), null, null, new FavoritesPinsController$listenDataUpdates$$inlined$safeCollectLatestIn$1(this.a.f, null, this), 3);
        tje.N(hbp0Var.c(), null, null, new FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1(this.m, null, this), 3);
        tje.N(hbp0Var.c(), null, null, new FavoritesPinsController$listenSummaryLaunched$$inlined$safeCollectIn$1((gci0) this.c.b, null, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ugp ugpVar, mub0 mub0Var, ContinuationImpl continuationImpl) {
        FavoritesPinsController$createPlacemark$1 favoritesPinsController$createPlacemark$1;
        Object obj;
        Object obj2;
        int i;
        f4c0 r;
        TextStyle textStyle;
        ugp ugpVar2;
        mub0 mub0Var2;
        f4c0 f4c0Var;
        TextStyle textStyle2;
        TextStyle textStyle3;
        TextStyle textStyle4;
        TextStyle textStyle5;
        f4c0 f4c0Var2;
        ugp ugpVar3;
        f4c0 f4c0Var3;
        f4c0 f4c0Var4;
        ugp ugpVar4;
        f4c0 f4c0Var5;
        mub0 mub0Var3;
        if (continuationImpl instanceof FavoritesPinsController$createPlacemark$1) {
            favoritesPinsController$createPlacemark$1 = (FavoritesPinsController$createPlacemark$1) continuationImpl;
            int i2 = favoritesPinsController$createPlacemark$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$createPlacemark$1.label = i2 - Integer.MIN_VALUE;
                obj = favoritesPinsController$createPlacemark$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$createPlacemark$1.label;
                com.yandex.go.navigator.favorites.repository.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xm00 xm00Var = this.k;
                    if (xm00Var == null) {
                        return null;
                    }
                    r = xm00Var.r(cwa1.d(ugpVar.B()));
                    textStyle = new TextStyle();
                    favoritesPinsController$createPlacemark$1.L$0 = ugpVar;
                    favoritesPinsController$createPlacemark$1.L$1 = mub0Var;
                    favoritesPinsController$createPlacemark$1.L$2 = r;
                    favoritesPinsController$createPlacemark$1.L$3 = r;
                    favoritesPinsController$createPlacemark$1.L$4 = textStyle;
                    favoritesPinsController$createPlacemark$1.L$5 = textStyle;
                    favoritesPinsController$createPlacemark$1.L$6 = textStyle;
                    favoritesPinsController$createPlacemark$1.label = 1;
                    Object b = aVar.b(favoritesPinsController$createPlacemark$1);
                    if (b != obj2) {
                        ugpVar2 = ugpVar;
                        mub0Var2 = mub0Var;
                        obj = b;
                        f4c0Var = r;
                        textStyle2 = textStyle;
                        textStyle3 = textStyle2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f4c0Var3 = (f4c0) favoritesPinsController$createPlacemark$1.L$5;
                        f4c0Var4 = (f4c0) favoritesPinsController$createPlacemark$1.L$3;
                        f4c0Var5 = (f4c0) favoritesPinsController$createPlacemark$1.L$2;
                        mub0Var3 = (mub0) favoritesPinsController$createPlacemark$1.L$1;
                        ugpVar4 = (ugp) favoritesPinsController$createPlacemark$1.L$0;
                        kotlin.b.b(obj);
                        ((PlacemarkMapObject) f4c0Var3.g).setText((String) obj);
                        ugpVar3 = ugpVar4;
                        f4c0Var2 = f4c0Var4;
                        f4c0Var = f4c0Var5;
                        mub0Var2 = mub0Var3;
                        f4c0Var2.x(mub0Var2.a);
                        f4c0Var2.i(!((Boolean) this.c.h()).booleanValue());
                        f4c0Var2.h(ugpVar3);
                        return f4c0Var;
                    }
                    textStyle4 = (TextStyle) favoritesPinsController$createPlacemark$1.L$6;
                    textStyle5 = (TextStyle) favoritesPinsController$createPlacemark$1.L$4;
                    f4c0Var2 = (f4c0) favoritesPinsController$createPlacemark$1.L$3;
                    f4c0 f4c0Var6 = (f4c0) favoritesPinsController$createPlacemark$1.L$2;
                    mub0 mub0Var4 = (mub0) favoritesPinsController$createPlacemark$1.L$1;
                    ugpVar3 = (ugp) favoritesPinsController$createPlacemark$1.L$0;
                    kotlin.b.b(obj);
                    f4c0Var = f4c0Var6;
                    mub0Var2 = mub0Var4;
                    textStyle4.setOutlineWidth(((oqx) obj).c);
                    ((PlacemarkMapObject) f4c0Var2.g).setTextStyle(textStyle5);
                    if (mub0Var2.b) {
                        String title = ugpVar3.getTitle();
                        favoritesPinsController$createPlacemark$1.L$0 = ugpVar3;
                        favoritesPinsController$createPlacemark$1.L$1 = mub0Var2;
                        favoritesPinsController$createPlacemark$1.L$2 = f4c0Var;
                        favoritesPinsController$createPlacemark$1.L$3 = f4c0Var2;
                        favoritesPinsController$createPlacemark$1.L$4 = null;
                        favoritesPinsController$createPlacemark$1.L$5 = f4c0Var2;
                        favoritesPinsController$createPlacemark$1.L$6 = null;
                        favoritesPinsController$createPlacemark$1.label = 3;
                        obj = h(title, favoritesPinsController$createPlacemark$1);
                        if (obj != obj2) {
                            f4c0Var3 = f4c0Var2;
                            f4c0Var4 = f4c0Var3;
                            ugpVar4 = ugpVar3;
                            f4c0Var5 = f4c0Var;
                            mub0Var3 = mub0Var2;
                            ((PlacemarkMapObject) f4c0Var3.g).setText((String) obj);
                            ugpVar3 = ugpVar4;
                            f4c0Var2 = f4c0Var4;
                            f4c0Var = f4c0Var5;
                            mub0Var2 = mub0Var3;
                        }
                        return obj2;
                    }
                    f4c0Var2.x(mub0Var2.a);
                    f4c0Var2.i(!((Boolean) this.c.h()).booleanValue());
                    f4c0Var2.h(ugpVar3);
                    return f4c0Var;
                }
                textStyle = (TextStyle) favoritesPinsController$createPlacemark$1.L$6;
                textStyle2 = (TextStyle) favoritesPinsController$createPlacemark$1.L$5;
                textStyle3 = (TextStyle) favoritesPinsController$createPlacemark$1.L$4;
                r = (f4c0) favoritesPinsController$createPlacemark$1.L$3;
                f4c0Var = (f4c0) favoritesPinsController$createPlacemark$1.L$2;
                mub0Var2 = (mub0) favoritesPinsController$createPlacemark$1.L$1;
                ugpVar2 = (ugp) favoritesPinsController$createPlacemark$1.L$0;
                kotlin.b.b(obj);
                textStyle.setSize(((oqx) obj).b);
                textStyle2.setPlacement(TextStyle.Placement.BOTTOM);
                textStyle2.setOffset(-8.0f);
                favoritesPinsController$createPlacemark$1.L$0 = ugpVar2;
                favoritesPinsController$createPlacemark$1.L$1 = mub0Var2;
                favoritesPinsController$createPlacemark$1.L$2 = f4c0Var;
                favoritesPinsController$createPlacemark$1.L$3 = r;
                favoritesPinsController$createPlacemark$1.L$4 = textStyle3;
                favoritesPinsController$createPlacemark$1.L$5 = null;
                favoritesPinsController$createPlacemark$1.L$6 = textStyle2;
                favoritesPinsController$createPlacemark$1.label = 2;
                obj = aVar.b(favoritesPinsController$createPlacemark$1);
                if (obj != obj2) {
                    textStyle4 = textStyle2;
                    textStyle5 = textStyle3;
                    f4c0Var2 = r;
                    ugpVar3 = ugpVar2;
                    textStyle4.setOutlineWidth(((oqx) obj).c);
                    ((PlacemarkMapObject) f4c0Var2.g).setTextStyle(textStyle5);
                    if (mub0Var2.b) {
                    }
                    f4c0Var2.x(mub0Var2.a);
                    f4c0Var2.i(!((Boolean) this.c.h()).booleanValue());
                    f4c0Var2.h(ugpVar3);
                    return f4c0Var;
                }
                return obj2;
            }
        }
        favoritesPinsController$createPlacemark$1 = new FavoritesPinsController$createPlacemark$1(this, continuationImpl);
        obj = favoritesPinsController$createPlacemark$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$createPlacemark$1.label;
        com.yandex.go.navigator.favorites.repository.a aVar2 = this.b;
        if (i != 0) {
        }
        textStyle.setSize(((oqx) obj).b);
        textStyle2.setPlacement(TextStyle.Placement.BOTTOM);
        textStyle2.setOffset(-8.0f);
        favoritesPinsController$createPlacemark$1.L$0 = ugpVar2;
        favoritesPinsController$createPlacemark$1.L$1 = mub0Var2;
        favoritesPinsController$createPlacemark$1.L$2 = f4c0Var;
        favoritesPinsController$createPlacemark$1.L$3 = r;
        favoritesPinsController$createPlacemark$1.L$4 = textStyle3;
        favoritesPinsController$createPlacemark$1.L$5 = null;
        favoritesPinsController$createPlacemark$1.L$6 = textStyle2;
        favoritesPinsController$createPlacemark$1.label = 2;
        obj = aVar2.b(favoritesPinsController$createPlacemark$1);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ugp ugpVar, ContinuationImpl continuationImpl) {
        FavoritesPinsController$createPlacemarkData$1 favoritesPinsController$createPlacemarkData$1;
        int i;
        FavoritePlaceType favoritePlaceType;
        Iterator it;
        Object obj;
        mub0 mub0Var;
        ugp ugpVar2;
        List list;
        mub0 mub0Var2;
        f4c0 f4c0Var;
        if (continuationImpl instanceof FavoritesPinsController$createPlacemarkData$1) {
            favoritesPinsController$createPlacemarkData$1 = (FavoritesPinsController$createPlacemarkData$1) continuationImpl;
            int i2 = favoritesPinsController$createPlacemarkData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$createPlacemarkData$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = favoritesPinsController$createPlacemarkData$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$createPlacemarkData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (ugpVar instanceof rgp) {
                        favoritePlaceType = FavoritePlaceType.HOME;
                    } else if (ugpVar instanceof sgp) {
                        favoritePlaceType = FavoritePlaceType.WORK;
                    } else {
                        if (!(ugpVar instanceof qgp)) {
                            w511.b();
                            return null;
                        }
                        favoritePlaceType = FavoritePlaceType.FAVORITE_ORGANIZATION;
                    }
                    favoritesPinsController$createPlacemarkData$1.L$0 = ugpVar;
                    favoritesPinsController$createPlacemarkData$1.label = 1;
                    obj2 = this.b.d(favoritePlaceType, favoritesPinsController$createPlacemarkData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mub0Var2 = (mub0) favoritesPinsController$createPlacemarkData$1.L$2;
                        list = (List) favoritesPinsController$createPlacemarkData$1.L$1;
                        ugpVar2 = (ugp) favoritesPinsController$createPlacemarkData$1.L$0;
                        kotlin.b.b(obj2);
                        f4c0Var = (f4c0) obj2;
                        if (f4c0Var != null) {
                            if (ugpVar2 instanceof rgp) {
                                f4c0Var.k(1.0f);
                            }
                            return new a4c0(f4c0Var, mub0Var2.c, list);
                        }
                        return null;
                    }
                    ugpVar = (ugp) favoritesPinsController$createPlacemarkData$1.L$0;
                    kotlin.b.b(obj2);
                }
                List list2 = (List) obj2;
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((mub0) obj).c.contains((Range) new Float(((gh00) this.d).j()))) {
                        break;
                    }
                }
                mub0Var = (mub0) obj;
                if (mub0Var != null) {
                    favoritesPinsController$createPlacemarkData$1.L$0 = ugpVar;
                    favoritesPinsController$createPlacemarkData$1.L$1 = list2;
                    favoritesPinsController$createPlacemarkData$1.L$2 = mub0Var;
                    favoritesPinsController$createPlacemarkData$1.label = 2;
                    Object d = d(ugpVar, mub0Var, favoritesPinsController$createPlacemarkData$1);
                    if (d != obj3) {
                        ugpVar2 = ugpVar;
                        list = list2;
                        obj2 = d;
                        mub0Var2 = mub0Var;
                        f4c0Var = (f4c0) obj2;
                        if (f4c0Var != null) {
                        }
                    }
                    return obj3;
                }
                return null;
            }
        }
        favoritesPinsController$createPlacemarkData$1 = new FavoritesPinsController$createPlacemarkData$1(this, continuationImpl);
        Object obj22 = favoritesPinsController$createPlacemarkData$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$createPlacemarkData$1.label;
        if (i != 0) {
        }
        List list22 = (List) obj22;
        it = list22.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        mub0Var = (mub0) obj;
        if (mub0Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(qgp qgpVar, a4c0 a4c0Var, ContinuationImpl continuationImpl) {
        FavoritesPinsController$createSelectedOrganizationPlacemark$1 favoritesPinsController$createSelectedOrganizationPlacemark$1;
        int i;
        f4c0 r;
        f4c0 f4c0Var;
        Bitmap bitmap;
        if (continuationImpl instanceof FavoritesPinsController$createSelectedOrganizationPlacemark$1) {
            favoritesPinsController$createSelectedOrganizationPlacemark$1 = (FavoritesPinsController$createSelectedOrganizationPlacemark$1) continuationImpl;
            int i2 = favoritesPinsController$createSelectedOrganizationPlacemark$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$createSelectedOrganizationPlacemark$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPinsController$createSelectedOrganizationPlacemark$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$createSelectedOrganizationPlacemark$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xm00 xm00Var = this.k;
                    if (xm00Var == null) {
                        return null;
                    }
                    r = xm00Var.r((Point) a4c0Var.a.h);
                    String str = qgpVar.d;
                    favoritesPinsController$createSelectedOrganizationPlacemark$1.L$0 = qgpVar;
                    favoritesPinsController$createSelectedOrganizationPlacemark$1.L$1 = null;
                    favoritesPinsController$createSelectedOrganizationPlacemark$1.L$2 = null;
                    favoritesPinsController$createSelectedOrganizationPlacemark$1.L$3 = r;
                    favoritesPinsController$createSelectedOrganizationPlacemark$1.L$4 = r;
                    favoritesPinsController$createSelectedOrganizationPlacemark$1.label = 1;
                    obj = i(str, favoritesPinsController$createSelectedOrganizationPlacemark$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    f4c0Var = r;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f4c0Var = (f4c0) favoritesPinsController$createSelectedOrganizationPlacemark$1.L$4;
                    f4c0 f4c0Var2 = (f4c0) favoritesPinsController$createSelectedOrganizationPlacemark$1.L$3;
                    qgp qgpVar2 = (qgp) favoritesPinsController$createSelectedOrganizationPlacemark$1.L$0;
                    kotlin.b.b(obj);
                    r = f4c0Var2;
                    qgpVar = qgpVar2;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
                IconStyle iconStyle = new IconStyle();
                iconStyle.setAnchor(qgpVar.e);
                if (bitmap != null) {
                    f4c0Var.x(bitmap);
                }
                f4c0Var.D(iconStyle);
                f4c0Var.k(2.0f);
                return r;
            }
        }
        favoritesPinsController$createSelectedOrganizationPlacemark$1 = new FavoritesPinsController$createSelectedOrganizationPlacemark$1(this, continuationImpl);
        Object obj3 = favoritesPinsController$createSelectedOrganizationPlacemark$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$createSelectedOrganizationPlacemark$1.label;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj3;
        if (bitmapDrawable2 != null) {
        }
        IconStyle iconStyle2 = new IconStyle();
        iconStyle2.setAnchor(qgpVar.e);
        if (bitmap != null) {
        }
        f4c0Var.D(iconStyle2);
        f4c0Var.k(2.0f);
        return r;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ugp ugpVar, a4c0 a4c0Var, ContinuationImpl continuationImpl) {
        FavoritesPinsController$createSelectedPlacemark$1 favoritesPinsController$createSelectedPlacemark$1;
        int i;
        f4c0 f4c0Var;
        Bitmap bitmap;
        f4c0 f4c0Var2;
        if (continuationImpl instanceof FavoritesPinsController$createSelectedPlacemark$1) {
            favoritesPinsController$createSelectedPlacemark$1 = (FavoritesPinsController$createSelectedPlacemark$1) continuationImpl;
            int i2 = favoritesPinsController$createSelectedPlacemark$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$createSelectedPlacemark$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPinsController$createSelectedPlacemark$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$createSelectedPlacemark$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(ugpVar instanceof qgp)) {
                        xm00 xm00Var = this.k;
                        f4c0 r = xm00Var != null ? xm00Var.r((Point) a4c0Var.a.h) : null;
                        IconStyle iconStyle = new IconStyle();
                        iconStyle.setAnchor(new PointF(0.5f, 1.1f));
                        if (r != null) {
                            r.D(iconStyle);
                        }
                        Iterator it = a4c0Var.c.iterator();
                        if (!it.hasNext()) {
                            ny61.p();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            Float f = (Float) ((mub0) next).c.getUpper();
                            do {
                                Object next2 = it.next();
                                Float f2 = (Float) ((mub0) next2).c.getUpper();
                                if (f.compareTo(f2) < 0) {
                                    next = next2;
                                    f = f2;
                                }
                            } while (it.hasNext());
                        }
                        mub0 mub0Var = (mub0) next;
                        if (mub0Var != null && (bitmap = mub0Var.a) != null) {
                            if (r != null) {
                                r.x(bitmap);
                            }
                            if (r != null) {
                                r.k(2.0f);
                            }
                        }
                        if (r != null) {
                            xm00 xm00Var2 = this.k;
                            if (xm00Var2 != null) {
                                f4c0Var = xm00Var2.r((Point) a4c0Var.a.h);
                                f4c0Var.y((ImageProvider) this.o.getValue());
                                f4c0Var.k(2.0f);
                            } else {
                                f4c0Var = null;
                            }
                            if (f4c0Var != null) {
                                return new biq0(r, f4c0Var);
                            }
                        }
                        return null;
                    }
                    favoritesPinsController$createSelectedPlacemark$1.L$0 = null;
                    favoritesPinsController$createSelectedPlacemark$1.L$1 = null;
                    favoritesPinsController$createSelectedPlacemark$1.label = 1;
                    obj = f((qgp) ugpVar, a4c0Var, favoritesPinsController$createSelectedPlacemark$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                f4c0Var2 = (f4c0) obj;
                if (f4c0Var2 != null) {
                    return new biq0(f4c0Var2, null);
                }
                return null;
            }
        }
        favoritesPinsController$createSelectedPlacemark$1 = new FavoritesPinsController$createSelectedPlacemark$1(this, continuationImpl);
        Object obj3 = favoritesPinsController$createSelectedPlacemark$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$createSelectedPlacemark$1.label;
        if (i != 0) {
        }
        f4c0Var2 = (f4c0) obj3;
        if (f4c0Var2 != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, ContinuationImpl continuationImpl) {
        FavoritesPinsController$limitLabel$1 favoritesPinsController$limitLabel$1;
        int i;
        int i2;
        if (continuationImpl instanceof FavoritesPinsController$limitLabel$1) {
            favoritesPinsController$limitLabel$1 = (FavoritesPinsController$limitLabel$1) continuationImpl;
            int i3 = favoritesPinsController$limitLabel$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$limitLabel$1.label = i3 - Integer.MIN_VALUE;
                Object obj = favoritesPinsController$limitLabel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$limitLabel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    favoritesPinsController$limitLabel$1.L$0 = str;
                    favoritesPinsController$limitLabel$1.label = 1;
                    obj = this.b.b(favoritesPinsController$limitLabel$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) favoritesPinsController$limitLabel$1.L$0;
                    kotlin.b.b(obj);
                }
                i2 = ((oqx) obj).a;
                if (str.length() > i2) {
                    return str;
                }
                int i4 = i2 - 1;
                if (i4 < 0) {
                    i4 = 0;
                }
                return gvu0.A0(i4, str).concat(EllipsizedTextView.DEFAULT_ELLIPSIS);
            }
        }
        favoritesPinsController$limitLabel$1 = new FavoritesPinsController$limitLabel$1(this, continuationImpl);
        Object obj2 = favoritesPinsController$limitLabel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$limitLabel$1.label;
        if (i != 0) {
        }
        i2 = ((oqx) obj2).a;
        if (str.length() > i2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, ContinuationImpl continuationImpl) {
        FavoritesPinsController$loadIconByUrl$1 favoritesPinsController$loadIconByUrl$1;
        int i;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof FavoritesPinsController$loadIconByUrl$1) {
            favoritesPinsController$loadIconByUrl$1 = (FavoritesPinsController$loadIconByUrl$1) continuationImpl;
            int i2 = favoritesPinsController$loadIconByUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$loadIconByUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPinsController$loadIconByUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$loadIconByUrl$1.label;
                ru.yandex.taxi.widget.utils.e eVar = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    favoritesPinsController$loadIconByUrl$1.L$0 = str;
                    favoritesPinsController$loadIconByUrl$1.label = 1;
                    obj = ru.yandex.taxi.widget.utils.e.o(eVar, str, null, favoritesPinsController$loadIconByUrl$1, 14);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) favoritesPinsController$loadIconByUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    return bitmapDrawable;
                }
                favoritesPinsController$loadIconByUrl$1.L$0 = null;
                favoritesPinsController$loadIconByUrl$1.label = 2;
                Object k = ru.yandex.taxi.widget.utils.e.k(eVar, str, null, favoritesPinsController$loadIconByUrl$1, 14);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }
        favoritesPinsController$loadIconByUrl$1 = new FavoritesPinsController$loadIconByUrl$1(this, continuationImpl);
        Object obj2 = favoritesPinsController$loadIconByUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$loadIconByUrl$1.label;
        ru.yandex.taxi.widget.utils.e eVar2 = this.g;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008a -> B:10:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(List list, ContinuationImpl continuationImpl) {
        FavoritesPinsController$updatePlacemarks$1 favoritesPinsController$updatePlacemarks$1;
        int i;
        Iterator it;
        Map map;
        a4c0 a4c0Var;
        if (continuationImpl instanceof FavoritesPinsController$updatePlacemarks$1) {
            favoritesPinsController$updatePlacemarks$1 = (FavoritesPinsController$updatePlacemarks$1) continuationImpl;
            int i2 = favoritesPinsController$updatePlacemarks$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesPinsController$updatePlacemarks$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoritesPinsController$updatePlacemarks$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesPinsController$updatePlacemarks$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    it = list.iterator();
                    map = linkedHashMap;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) favoritesPinsController$updatePlacemarks$1.L$7;
                    ugp ugpVar = (ugp) favoritesPinsController$updatePlacemarks$1.L$5;
                    it = (Iterator) favoritesPinsController$updatePlacemarks$1.L$3;
                    Map map2 = (Map) favoritesPinsController$updatePlacemarks$1.L$1;
                    kotlin.b.b(obj);
                    a4c0 a4c0Var2 = (a4c0) obj;
                    if (a4c0Var2 == null) {
                        map.put(ugpVar, a4c0Var2);
                        map = map2;
                        if (!it.hasNext()) {
                            for (a4c0 a4c0Var3 : this.l.values()) {
                                xm00 xm00Var = this.k;
                                if (xm00Var != null) {
                                    xm00Var.o(a4c0Var3.a);
                                }
                            }
                            this.l = map;
                            return zy11.a;
                        }
                        ugpVar = (ugp) it.next();
                        a4c0Var = (a4c0) this.l.remove(ugpVar);
                        if (a4c0Var == null) {
                            favoritesPinsController$updatePlacemarks$1.L$0 = null;
                            favoritesPinsController$updatePlacemarks$1.L$1 = map;
                            favoritesPinsController$updatePlacemarks$1.L$2 = null;
                            favoritesPinsController$updatePlacemarks$1.L$3 = it;
                            favoritesPinsController$updatePlacemarks$1.L$4 = null;
                            favoritesPinsController$updatePlacemarks$1.L$5 = ugpVar;
                            favoritesPinsController$updatePlacemarks$1.L$6 = null;
                            favoritesPinsController$updatePlacemarks$1.L$7 = map;
                            favoritesPinsController$updatePlacemarks$1.label = 1;
                            obj = e(ugpVar, favoritesPinsController$updatePlacemarks$1);
                            if (obj == obj2) {
                                return obj2;
                            }
                            map2 = map;
                            a4c0 a4c0Var22 = (a4c0) obj;
                            if (a4c0Var22 == null) {
                            }
                        } else {
                            map2 = map;
                        }
                    }
                    map.put(ugpVar, a4c0Var);
                    map = map2;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
        favoritesPinsController$updatePlacemarks$1 = new FavoritesPinsController$updatePlacemarks$1(this, continuationImpl);
        Object obj3 = favoritesPinsController$updatePlacemarks$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesPinsController$updatePlacemarks$1.label;
        if (i != 0) {
        }
    }
}
