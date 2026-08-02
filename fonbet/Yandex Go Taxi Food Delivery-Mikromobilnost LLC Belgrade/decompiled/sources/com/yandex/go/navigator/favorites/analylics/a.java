package com.yandex.go.navigator.favorites.analylics;

import com.yandex.go.navigator.analitycs.Screen;
import com.yandex.go.navigator.main_screen.experiement.e;
import defpackage.eb50;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qgp;
import defpackage.rgp;
import defpackage.sgp;
import defpackage.tc50;
import defpackage.ub50;
import defpackage.ugp;
import defpackage.w511;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes12.dex */
public final class a {
    public final ub50 a;
    public final eb50 b;
    public final e c;

    public a(ub50 ub50Var, eb50 eb50Var, e eVar) {
        this.a = ub50Var;
        this.b = eb50Var;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ugp ugpVar, ContinuationImpl continuationImpl) {
        FavoritesAnalyticsInteractor$reportPinTapped$1 favoritesAnalyticsInteractor$reportPinTapped$1;
        int i;
        NavigatorFavoritesAnalytics$FavoritePlaceType navigatorFavoritesAnalytics$FavoritePlaceType;
        String str;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen;
        Object a;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen2;
        NavigatorFavoritesAnalytics$FavoritePlaceType navigatorFavoritesAnalytics$FavoritePlaceType2;
        ub50 ub50Var;
        Object obj;
        if (continuationImpl instanceof FavoritesAnalyticsInteractor$reportPinTapped$1) {
            favoritesAnalyticsInteractor$reportPinTapped$1 = (FavoritesAnalyticsInteractor$reportPinTapped$1) continuationImpl;
            int i2 = favoritesAnalyticsInteractor$reportPinTapped$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoritesAnalyticsInteractor$reportPinTapped$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = favoritesAnalyticsInteractor$reportPinTapped$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesAnalyticsInteractor$reportPinTapped$1.label;
                if (i != 0) {
                    b.b(obj2);
                    boolean z = ugpVar instanceof qgp;
                    if (z) {
                        navigatorFavoritesAnalytics$FavoritePlaceType = NavigatorFavoritesAnalytics$FavoritePlaceType.Organization;
                    } else if (ugpVar instanceof rgp) {
                        navigatorFavoritesAnalytics$FavoritePlaceType = NavigatorFavoritesAnalytics$FavoritePlaceType.Home;
                    } else {
                        if (!(ugpVar instanceof sgp)) {
                            w511.b();
                            return null;
                        }
                        navigatorFavoritesAnalytics$FavoritePlaceType = NavigatorFavoritesAnalytics$FavoritePlaceType.Work;
                    }
                    qgp qgpVar = z ? (qgp) ugpVar : null;
                    str = qgpVar != null ? qgpVar.a : null;
                    Screen screen = this.b.a;
                    if (screen != null) {
                        Iterator<E> it = NavigatorFavoritesAnalytics$Screen.a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(screen.getEventValue(), ((NavigatorFavoritesAnalytics$Screen) obj).getEventValue())) {
                                break;
                            }
                        }
                        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen3 = (NavigatorFavoritesAnalytics$Screen) obj;
                        if (navigatorFavoritesAnalytics$Screen3 != null) {
                            navigatorFavoritesAnalytics$Screen = navigatorFavoritesAnalytics$Screen3;
                            favoritesAnalyticsInteractor$reportPinTapped$1.L$0 = null;
                            ub50 ub50Var2 = this.a;
                            favoritesAnalyticsInteractor$reportPinTapped$1.L$1 = ub50Var2;
                            favoritesAnalyticsInteractor$reportPinTapped$1.L$2 = navigatorFavoritesAnalytics$FavoritePlaceType;
                            favoritesAnalyticsInteractor$reportPinTapped$1.L$3 = str;
                            favoritesAnalyticsInteractor$reportPinTapped$1.L$4 = navigatorFavoritesAnalytics$Screen;
                            favoritesAnalyticsInteractor$reportPinTapped$1.label = 1;
                            a = this.c.a(favoritesAnalyticsInteractor$reportPinTapped$1);
                            if (a != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen4 = navigatorFavoritesAnalytics$Screen;
                            obj2 = a;
                            navigatorFavoritesAnalytics$Screen2 = navigatorFavoritesAnalytics$Screen4;
                            navigatorFavoritesAnalytics$FavoritePlaceType2 = navigatorFavoritesAnalytics$FavoritePlaceType;
                            ub50Var = ub50Var2;
                        }
                    }
                    navigatorFavoritesAnalytics$Screen = NavigatorFavoritesAnalytics$Screen.Main;
                    favoritesAnalyticsInteractor$reportPinTapped$1.L$0 = null;
                    ub50 ub50Var22 = this.a;
                    favoritesAnalyticsInteractor$reportPinTapped$1.L$1 = ub50Var22;
                    favoritesAnalyticsInteractor$reportPinTapped$1.L$2 = navigatorFavoritesAnalytics$FavoritePlaceType;
                    favoritesAnalyticsInteractor$reportPinTapped$1.L$3 = str;
                    favoritesAnalyticsInteractor$reportPinTapped$1.L$4 = navigatorFavoritesAnalytics$Screen;
                    favoritesAnalyticsInteractor$reportPinTapped$1.label = 1;
                    a = this.c.a(favoritesAnalyticsInteractor$reportPinTapped$1);
                    if (a != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    navigatorFavoritesAnalytics$Screen2 = (NavigatorFavoritesAnalytics$Screen) favoritesAnalyticsInteractor$reportPinTapped$1.L$4;
                    str = (String) favoritesAnalyticsInteractor$reportPinTapped$1.L$3;
                    navigatorFavoritesAnalytics$FavoritePlaceType2 = (NavigatorFavoritesAnalytics$FavoritePlaceType) favoritesAnalyticsInteractor$reportPinTapped$1.L$2;
                    ub50Var = (ub50) favoritesAnalyticsInteractor$reportPinTapped$1.L$1;
                    b.b(obj2);
                }
                String str2 = ((tc50) obj2).f;
                ub50Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("place_type", navigatorFavoritesAnalytics$FavoritePlaceType2.getEventValue());
                hashMap.put(MetaDataField.SCREEN_FIELD, navigatorFavoritesAnalytics$Screen2.getEventValue());
                hashMap.put(Constants.KEY_SERVICE, str2);
                if (str != null) {
                    hashMap.put("oid", str);
                }
                ub50Var.a.a("NavigatorFavorites.Pin.Tapped", hashMap, 1, new HashMap());
                return zy11.a;
            }
        }
        favoritesAnalyticsInteractor$reportPinTapped$1 = new FavoritesAnalyticsInteractor$reportPinTapped$1(this, continuationImpl);
        Object obj22 = favoritesAnalyticsInteractor$reportPinTapped$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesAnalyticsInteractor$reportPinTapped$1.label;
        if (i != 0) {
        }
        String str22 = ((tc50) obj22).f;
        ub50Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("place_type", navigatorFavoritesAnalytics$FavoritePlaceType2.getEventValue());
        hashMap2.put(MetaDataField.SCREEN_FIELD, navigatorFavoritesAnalytics$Screen2.getEventValue());
        hashMap2.put(Constants.KEY_SERVICE, str22);
        if (str != null) {
        }
        ub50Var.a.a("NavigatorFavorites.Pin.Tapped", hashMap2, 1, new HashMap());
        return zy11.a;
    }
}
