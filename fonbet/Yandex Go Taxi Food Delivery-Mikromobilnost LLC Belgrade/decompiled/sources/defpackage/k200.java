package defpackage;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.widget.Toast;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigator.main_screen.o;
import com.yandex.go.navigator.map_interactions.MapInteractionsRouter$onAttach$lambda$0$$inlined$safeCollectIn$1;
import com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$RoundLabel;
import com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.StackItemViewFactory$StickerLabel;
import com.yandex.go.special_needs_menu.ui.a;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.messaging.activity.MessengerNotificationActivity;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.authorized.chat.j;
import com.yandex.messaging.internal.net.NoInternetException;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.ui.migration.MigrationEnvironmentActivity;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.merchants.internal.screens.MerchantsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.taxi.layers.presentation.mapnotification.e;
import ru.yandex.taxi.maas.impl.ride.metropick.d;
import ru.yandex.taxi.settings.main.f;

/* loaded from: classes15.dex */
public final /* synthetic */ class k200 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k200(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:197:0x045f A[LOOP:0: B:196:0x045d->B:197:0x045f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        uj0 uj0Var;
        List list;
        List<PlacemarkMapObject> addEmptyPlacemarks;
        int size;
        MapObject mapObject;
        tls tlsVar;
        bv00 bv00Var;
        mv00 mv00Var;
        zzs zzsVar;
        String str;
        p3w p3wVar;
        zy11 viewBinding$lambda$3$lambda$2;
        zy11 onViewCreated$lambda$14$lambda$9;
        boolean viewBinding$lambda$1$lambda$0;
        zy11 onCreate$lambda$2$lambda$1;
        zy11 onCreate$lambda$0;
        zy11 viewBinding$lambda$6$lambda$3;
        int i = this.a;
        int i2 = 1;
        String str2 = null;
        ArrayList arrayList = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((d) obj2).r(new qu(9));
                return zy11.a;
            case 1:
                ((s3d0) ((z300) obj2).a.get()).a((qxx0) obj);
                return zy11.a;
            case 2:
                return (GLSurfaceView) obj2;
            case 3:
                String str3 = ((pot0) obj2).d;
                a aVar = (a) ((f) obj).V.get();
                ((f600) aVar.c.get()).f();
                ((pep0) aVar.d).f((m950) aVar.b.get(), new kq41(Uri.parse(str3), null), hxx.a);
                return zy11.a;
            case 4:
                o oVar = ((ub00) obj).a;
                oVar.B((m950) oVar.N.get(), (wjg) obj2, new wui(oVar, 22), new n1j0(oVar.Q()));
                return zy11.a;
            case 5:
                ut7 ut7Var = ((gh00) obj2).g;
                CameraPosition cameraPosition = ut7Var.a.c;
                ut7Var.k(new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, cameraPosition.getTilt()), 0.0f, Animation.Type.LINEAR, null);
                return zy11.a;
            case 6:
                po00 po00Var = (po00) obj2;
                oo00 oo00Var = (oo00) obj;
                bq00 bq00Var = po00Var.c;
                if (oo00Var instanceof ko00) {
                    ko00 ko00Var = (ko00) oo00Var;
                    String str4 = ko00Var.a;
                    jv00 d = bq00Var.d(str4);
                    if (d != null) {
                        MapObject mapObject2 = d.b;
                        BaseMapObjectCollection c = po00Var.c(ko00Var.b);
                        if (c == null) {
                            c = mapObject2.getParent();
                        }
                        c.remove(mapObject2);
                        jv00 jv00Var = (jv00) bq00Var.a.remove(str4);
                        if (jv00Var != null) {
                            String str5 = jv00Var.e;
                            if (str5 != null) {
                                bq00Var.b(str5, str4);
                            }
                            String str6 = jv00Var.g;
                            if (str6 != null) {
                                bq00Var.b(str6, str4);
                            }
                        }
                    }
                } else if (oo00Var instanceof mo00) {
                    String str7 = oo00Var.a;
                    jv00 jv00Var2 = (jv00) bq00Var.a.remove(str7);
                    if (jv00Var2 != null) {
                        String str8 = jv00Var2.e;
                        if (str8 != null) {
                            bq00Var.b(str8, str7);
                        }
                        String str9 = jv00Var2.g;
                        if (str9 != null) {
                            bq00Var.b(str9, str7);
                        }
                    }
                } else if (oo00Var instanceof zo00) {
                    zo00 zo00Var = (zo00) oo00Var;
                    String str10 = zo00Var.a;
                    en00 en00Var = zo00Var.b;
                    jv00 d2 = bq00Var.d(str10);
                    if (d2 != null && (mapObject = d2.b) != null) {
                        if (mapObject instanceof MapObjectCollection) {
                            MapObjectCollection mapObjectCollection = (MapObjectCollection) mapObject;
                            po00.h(mapObjectCollection, en00Var);
                            if (en00Var.f != null) {
                                mapObjectCollection.setZIndex(r0.intValue());
                            }
                        } else if (mapObject instanceof PlacemarkMapObject) {
                            po00Var.e(en00Var);
                        } else if (mapObject instanceof PolygonMapObject) {
                            po00.f((PolygonMapObject) mapObject, en00Var);
                        } else if (mapObject instanceof PolylineMapObject) {
                            po00.g((PolylineMapObject) mapObject, en00Var);
                        }
                    }
                } else if (oo00Var instanceof rm00) {
                    rm00 rm00Var = (rm00) oo00Var;
                    String str11 = rm00Var.a;
                    en00 en00Var2 = rm00Var.c;
                    String str12 = en00Var2.c;
                    String str13 = rm00Var.b;
                    List<Point> list2 = en00Var2.h;
                    if (str12 != null) {
                        switch (str12.hashCode()) {
                            case -1741312354:
                                if (str12.equals("collection")) {
                                    if (str13 != null) {
                                        MapObjectCollection c2 = po00Var.c(str13);
                                        if (c2 != null) {
                                            MapObjectCollection addCollection = c2.addCollection();
                                            po00.h(addCollection, en00Var2);
                                            if (en00Var2.f != null) {
                                                addCollection.setZIndex(r0.intValue());
                                            }
                                            bq00Var.e(new jv00(str11, addCollection, null, null, null, null, null, 252));
                                            break;
                                        }
                                    } else {
                                        l0b1.h(new IllegalArgumentException("collection without parent"));
                                        break;
                                    }
                                }
                                break;
                            case -397519558:
                                if (str12.equals("polygon")) {
                                    if (str13 != null) {
                                        MapObjectCollection c3 = po00Var.c(str13);
                                        if (c3 != null) {
                                            List list3 = en00Var2.i;
                                            if (list3 != null) {
                                                LinearRing linearRing = new LinearRing((List<Point>) list3);
                                                List list4 = en00Var2.j;
                                                if (list4 != null) {
                                                    List list5 = list4;
                                                    arrayList = new ArrayList(tcc.n(list5, 10));
                                                    Iterator it = list5.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(new LinearRing((List<Point>) it.next()));
                                                    }
                                                }
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                PolygonMapObject addPolygon = c3.addPolygon(new Polygon(linearRing, arrayList));
                                                po00.f(addPolygon, en00Var2);
                                                bq00Var.e(new jv00(str11, addPolygon, null, null, null, null, null, 252));
                                                break;
                                            } else {
                                                l0b1.h(new IllegalArgumentException("polygon without outer ring"));
                                                break;
                                            }
                                        }
                                    } else {
                                        l0b1.h(new IllegalArgumentException("polygon without parent"));
                                        break;
                                    }
                                }
                                break;
                            case -253589857:
                                if (str12.equals("placemarks")) {
                                    if (str13 == null) {
                                        l0b1.h(new IllegalArgumentException("placemarks without parent"));
                                        break;
                                    } else {
                                        MapObjectCollection c4 = po00Var.c(str13);
                                        if (c4 != null && list2 != null && (list = en00Var2.p) != null && list2.size() == list.size()) {
                                            String str14 = en00Var2.q;
                                            String str15 = en00Var2.r;
                                            IconStyle a = po00.a(en00Var2.s, null);
                                            IconStyle a2 = po00.a(en00Var2.t, null);
                                            if (str14 != null) {
                                                nav c5 = bq00Var.c(str14);
                                                if (c5 != null) {
                                                    addEmptyPlacemarks = c4.addPlacemarks(list2, c5.b, po00.b(a, c5.c));
                                                    str2 = c5.a;
                                                    String str16 = str2;
                                                    size = list.size();
                                                    for (int i3 = 0; i3 < size; i3++) {
                                                        bq00Var.e(new jv00((String) list.get(i3), addEmptyPlacemarks.get(i3), a, str14, a2, str15, str16, 4));
                                                    }
                                                    break;
                                                } else {
                                                    po00Var.d(str14);
                                                }
                                            }
                                            if (str15 != null) {
                                                nav c6 = bq00Var.c(str15);
                                                if (c6 == null) {
                                                    po00Var.d(str15);
                                                } else {
                                                    addEmptyPlacemarks = c4.addPlacemarks(list2, c6.b, po00.b(a2, c6.c));
                                                    str2 = c6.a;
                                                    String str162 = str2;
                                                    size = list.size();
                                                    while (i3 < size) {
                                                    }
                                                }
                                            }
                                            addEmptyPlacemarks = c4.addEmptyPlacemarks(list2);
                                            String str1622 = str2;
                                            size = list.size();
                                            while (i3 < size) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 561938880:
                                if (str12.equals("polyline")) {
                                    if (str13 != null) {
                                        MapObjectCollection c7 = po00Var.c(str13);
                                        if (c7 != null) {
                                            if (list2 != null) {
                                                PolylineMapObject addPolyline = c7.addPolyline(new Polyline(list2));
                                                po00.g(addPolyline, en00Var2);
                                                bq00Var.e(new jv00(str11, addPolyline, null, null, null, null, null, 252));
                                                break;
                                            } else {
                                                l0b1.h(new IllegalArgumentException("polyline without points"));
                                                break;
                                            }
                                        }
                                    } else {
                                        l0b1.h(new IllegalArgumentException("polygon without parent"));
                                        break;
                                    }
                                }
                                break;
                            case 1792934996:
                                if (str12.equals("placemark")) {
                                    if (str13 != null) {
                                        MapObjectCollection c8 = po00Var.c(str13);
                                        if (c8 != null) {
                                            bq00Var.e(new jv00(str11, c8.addPlacemark(), null, null, null, null, null, 252));
                                            po00Var.e(en00Var2);
                                            if (c8.getUserData() == null) {
                                                c8.setUserData(0);
                                                break;
                                            } else {
                                                c8.setUserData(Integer.valueOf(((Integer) c8.getUserData()).intValue() + 1));
                                                break;
                                            }
                                        }
                                    } else {
                                        l0b1.h(new IllegalArgumentException("placemark without parent"));
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                    l0b1.h(new AssertionError(g8e.o("unsupported map object type: ", str12), null));
                } else if (oo00Var instanceof wm00) {
                    jv00 d3 = bq00Var.d(((wm00) oo00Var).a);
                    if (d3 != null) {
                        MapObject mapObject3 = d3.b;
                        MapObjectCollection mapObjectCollection2 = mapObject3 instanceof MapObjectCollection ? (MapObjectCollection) mapObject3 : null;
                        if (mapObjectCollection2 != null) {
                            mapObjectCollection2.clear();
                        }
                    }
                } else if (oo00Var instanceof qo00) {
                    qo00 qo00Var = (qo00) oo00Var;
                    jv00 d4 = bq00Var.d(qo00Var.a);
                    if (d4 != null) {
                        uj0 uj0Var2 = new uj0(i2, po00Var, qo00Var);
                        d4.b.addTapListener(uj0Var2);
                        d4.c = uj0Var2;
                    }
                } else {
                    if (!(oo00Var instanceof lo00)) {
                        w511.b();
                        return null;
                    }
                    jv00 d5 = bq00Var.d(((lo00) oo00Var).a);
                    if (d5 != null && (uj0Var = d5.c) != null) {
                        d5.b.removeTapListener(uj0Var);
                        d5.c = null;
                    }
                }
                return zy11.a;
            case 7:
                uj00 uj00Var = (uj00) obj2;
                tje.N(uj00Var.o(), null, null, new MapInteractionsRouter$onAttach$lambda$0$$inlined$safeCollectIn$1(uj00Var.F.a(new xyz(11, (RoadEventsLayer) obj)), null, uj00Var), 3);
                return zy11.a;
            case 8:
                ((RoadEventsLayer) obj).selectRoadEvent(((y290) obj2).a);
                return zy11.a;
            case 9:
                String str17 = (String) obj;
                e eVar = ((ru.yandex.taxi.layers.presentation.mapnotification.d) obj2).d.e;
                synchronized (eVar) {
                    eVar.a = b.j(str17, eVar.a);
                    eVar.b.add(str17);
                }
                return zy11.a;
            case 10:
                zzs zzsVar2 = ((ump) obj2).a;
                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                ((li6) obj).a(new Point(zzsVar2.a, zzsVar2.b));
                return zy11.a;
            case 11:
                wv00 wv00Var = (wv00) obj2;
                wv00Var.l(wv00Var.n.mo104apply(obj));
                return zy11.a;
            case 12:
                tw00 tw00Var = (tw00) obj2;
                Result result = (Result) obj;
                if ((result.getValue() instanceof Result.Failure) && (tlsVar = (tls) tw00Var.y.get()) != null) {
                    tlsVar.invoke(Boolean.valueOf(Result.a(result.getValue()) instanceof NoInternetException));
                }
                tw00Var.h();
                return zy11.a;
            case 13:
                ((StackItemViewFactory$RoundLabel) obj2).setText((CharSequence) obj);
                return zy11.a;
            case 14:
                ((StackItemViewFactory$StickerLabel) obj2).setText((CharSequence) obj);
                return zy11.a;
            case 15:
                m110 m110Var = (m110) obj2;
                un0 un0Var = (un0) obj;
                Screen b = m110Var.a.b();
                ml00 ml00Var = m110Var.b;
                ml00Var.getClass();
                try {
                    p3wVar = un0Var instanceof p3w ? (p3w) un0Var : null;
                } catch (Throwable unused) {
                }
                if (p3wVar != null) {
                    bv00Var = (bv00) ((xnt) ml00Var.a).d(p3wVar.b, bv00.Companion.serializer());
                    mv00Var = bv00Var == null ? bv00Var.b : null;
                    if (mv00Var != null) {
                        uzs uzsVar = zzs.Companion;
                        double d6 = mv00Var.a;
                        double d7 = mv00Var.b;
                        uzsVar.getClass();
                        if (!Double.isNaN(d6) && !Double.isNaN(d7)) {
                            zzsVar = new zzs(d6, d7, 0, null, null, 12);
                            if (scc.g(Screen.MAIN, Screen.TAXI_MAIN, Screen.ROUTE_SELECTOR, Screen.ORDER, Screen.ORDERS_LIST, Screen.BUNDLED_ORDER_LIST, Screen.ORDER_DETAILS, Screen.ORDER_TRACKING, Screen.CHOOSE_B).contains(b) && zzsVar != null) {
                                double d8 = zzsVar.b;
                                double d9 = zzsVar.a;
                                kf00 kf00Var = m110Var.d;
                                str = bv00Var != null ? bv00Var.a : null;
                                if (str == null) {
                                    str = "";
                                }
                                Double valueOf = Double.valueOf(d9);
                                Double valueOf2 = Double.valueOf(d8);
                                kf00Var.getClass();
                                HashMap hashMap = new HashMap();
                                hashMap.put("stop_id", str);
                                hashMap.put("stop_lat", valueOf);
                                hashMap.put("stop_lon", valueOf2);
                                kf00Var.a.a("Map.TransportStopInTaxi.Tapped", hashMap, 1, new HashMap());
                                ah00 ah00Var = m110Var.c;
                                Polyline polyline2 = ru.yandex.taxi.map.utils.a.b;
                                ((gh00) ah00Var).E(new Point(d9, d8), 200.0f, new mx0(7, m110Var));
                            }
                            return zy11.a;
                        }
                    }
                    zzsVar = null;
                    if (scc.g(Screen.MAIN, Screen.TAXI_MAIN, Screen.ROUTE_SELECTOR, Screen.ORDER, Screen.ORDERS_LIST, Screen.BUNDLED_ORDER_LIST, Screen.ORDER_DETAILS, Screen.ORDER_TRACKING, Screen.CHOOSE_B).contains(b)) {
                        double d82 = zzsVar.b;
                        double d92 = zzsVar.a;
                        kf00 kf00Var2 = m110Var.d;
                        if (bv00Var != null) {
                        }
                        if (str == null) {
                        }
                        Double valueOf3 = Double.valueOf(d92);
                        Double valueOf22 = Double.valueOf(d82);
                        kf00Var2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("stop_id", str);
                        hashMap2.put("stop_lat", valueOf3);
                        hashMap2.put("stop_lon", valueOf22);
                        kf00Var2.a.a("Map.TransportStopInTaxi.Tapped", hashMap2, 1, new HashMap());
                        ah00 ah00Var2 = m110Var.c;
                        Polyline polyline22 = ru.yandex.taxi.map.utils.a.b;
                        ((gh00) ah00Var2).E(new Point(d92, d82), 200.0f, new mx0(7, m110Var));
                    }
                    return zy11.a;
                }
                bv00Var = null;
                if (bv00Var == null) {
                }
                if (mv00Var != null) {
                }
                zzsVar = null;
                if (scc.g(Screen.MAIN, Screen.TAXI_MAIN, Screen.ROUTE_SELECTOR, Screen.ORDER, Screen.ORDERS_LIST, Screen.BUNDLED_ORDER_LIST, Screen.ORDER_DETAILS, Screen.ORDER_TRACKING, Screen.CHOOSE_B).contains(b)) {
                }
                return zy11.a;
            case 16:
                return ((v610) obj2).a(((Integer) obj).intValue());
            case 17:
                viewBinding$lambda$3$lambda$2 = Me2MeDebitResultFragment.getViewBinding$lambda$3$lambda$2((Me2MeDebitResultFragment) obj2, ((Boolean) obj).booleanValue());
                return viewBinding$lambda$3$lambda$2;
            case 18:
                return ((ddh) obj2).invoke();
            case 19:
                com.yandex.messaging.internal.view.chat.input.a aVar2 = (com.yandex.messaging.internal.view.chat.input.a) obj2;
                String str18 = (String) obj;
                rp3 rp3Var = aVar2.E;
                kgx kgxVar = com.yandex.messaging.internal.view.chat.input.a.J[1];
                rp3Var.a(null);
                aVar2.G = EmptyList.a;
                aVar2.r();
                InputTextController inputTextController = aVar2.B;
                if (inputTextController != null) {
                    z83.d(aVar2.F, null);
                    fjg0 fjg0Var = aVar2.F;
                    if (fjg0Var != null) {
                        inputTextController.onSuggestTapped(fjg0Var.a, fjg0Var.c, str18);
                    }
                }
                return zy11.a;
            case 20:
                ((jm10) obj2).S.setLeadTint((ColorStateList) null);
                return zy11.a;
            case 21:
                onViewCreated$lambda$14$lambda$9 = MerchantOffersFragment.onViewCreated$lambda$14$lambda$9((MerchantOffersFragment) obj2, (tb6) obj);
                return onViewCreated$lambda$14$lambda$9;
            case 22:
                viewBinding$lambda$1$lambda$0 = MerchantsFragment.getViewBinding$lambda$1$lambda$0((MerchantsFragment) obj2, (Uri) obj);
                return Boolean.valueOf(viewBinding$lambda$1$lambda$0);
            case 23:
                qu10 qu10Var = (qu10) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Toast.makeText(qu10Var.a, oyh0.mark_unread_fail, 0).show();
                } else {
                    Toast.makeText(qu10Var.a, oyh0.mark_unread_fail_server_error, 0).show();
                }
                return zy11.a;
            case 24:
                return Boolean.valueOf(jl40.l(((PlainMessage) ((Pair) obj).getSecond()).getChatId(), ((j) obj2).b.a.b));
            case 25:
                onCreate$lambda$2$lambda$1 = MessengerNotificationActivity.onCreate$lambda$2$lambda$1((Intent) obj2, (v320) obj);
                return onCreate$lambda$2$lambda$1;
            case 26:
                ((zjy0) obj2).invoke((ne51) obj);
                return zy11.a;
            case 27:
                onCreate$lambda$0 = MigrationEnvironmentActivity.onCreate$lambda$0((MigrationEnvironmentActivity) obj2, (mx60) obj);
                return onCreate$lambda$0;
            case 28:
                mnq0 mnq0Var = (mnq0) obj;
                androidx.compose.ui.semantics.f.p(mnq0Var, 0);
                androidx.compose.ui.semantics.f.l(mnq0Var, ((hj20) obj2).a);
                return zy11.a;
            default:
                viewBinding$lambda$6$lambda$3 = MobilePaymentSelectContactFragment.getViewBinding$lambda$6$lambda$3((MobilePaymentSelectContactFragment) obj2, (String) obj);
                return viewBinding$lambda$6$lambda$3;
        }
    }
}
