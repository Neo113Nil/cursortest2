package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.material3.w;
import com.yandex.go.flex.main_screen.data.widgets.plaque.PlaqueWidgetItemView;
import com.yandex.go.masstransit.sdk.ble.impl.domain.a;
import com.yandex.go.places.impl.ui.filters.OrganizationsFiltersModalView;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.network.b;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuReporter$Item;
import com.yandex.messaging.internal.view.timeline.g0;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.xplat.payment.sdk.PaymentDetails;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.gopayments.business.SharedAccountMenuViewModel;
import ru.yandex.taxi.logistics.sdk.photocomments.data.PhotoModel$Type;
import ru.yandex.taxi.masstransit.geopayment.domain.c;
import ru.yandex.taxi.masstransit.geopayment.modal.f;
import ru.yandex.taxi.order.i;
import ru.yandex.taxi.plaque.PlaqueView;
import ru.yandex.taxi.widget.utils.e;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinVisualState;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes6.dex */
public final /* synthetic */ class b700 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ b700(w wVar, twt0 twt0Var, twt0 twt0Var2, twt0 twt0Var3) {
        this.a = 3;
        this.b = wVar;
        this.c = twt0Var;
        this.w = twt0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sls
    public final Object invoke() {
        Long l;
        k26 k26Var;
        k26 k26Var2;
        im80 filtersAdapter_delegate$lambda$0;
        zy11 renderTip$lambda$13;
        zy11 show$lambda$0;
        zy11 showHeader$lambda$0;
        int i = this.a;
        int i2 = 0;
        Long l2 = null;
        Object obj = null;
        Object obj2 = null;
        r5 = null;
        u26 u26Var = null;
        r5 = null;
        u26 u26Var2 = null;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ListItemComponent listItemComponent = (ListItemComponent) obj5;
                listItemComponent.clearTrailView();
                ((i700) obj4).fh((SharedAccountMenuViewModel) obj3, listItemComponent);
                break;
            case 1:
                MapObject mapObject = (MapObject) obj4;
                Point point = (Point) obj3;
                IdentityHashMap identityHashMap = (IdentityHashMap) ((ini0) ((rmj) obj5).d).b.get(ReferenceType.MAP_OBJECT);
                String str = identityHashMap != null ? (String) identityHashMap.get(mapObject) : null;
                if (str != null) {
                    break;
                }
                break;
            case 2:
                Boolean bool = (Boolean) obj5;
                mu10 mu10Var = (mu10) obj4;
                ps10 ps10Var = (ps10) obj3;
                if (bool.booleanValue()) {
                    mu10Var.i.a(MessageMenuReporter$Item.STARRED_UNSET);
                } else {
                    mu10Var.i.a(MessageMenuReporter$Item.STARRED_SET);
                }
                boolean z = !bool.booleanValue();
                nu10 nu10Var = ps10Var.F;
                if (nu10Var != null && (l = nu10Var.e) != null) {
                    l2 = l;
                } else if (nu10Var != null) {
                    l2 = nu10Var.d;
                }
                if (l2 != null) {
                    g0 g0Var = ps10Var.e;
                    z621 z621Var = new z621(l2.longValue(), Boolean.valueOf(z));
                    g0Var.getClass();
                    tje.e();
                    b00 b00Var = g0Var.a;
                    ((Handler) b00Var.a.get()).post(new lz(6, b00Var, g0Var.b, z621Var));
                    break;
                }
                break;
            case 3:
                w wVar = (w) obj5;
                wVar.f = (twt0) obj4;
                wVar.g = (twt0) obj3;
                break;
            case 4:
                tse tseVar = (tse) obj3;
                a aVar = (a) ((xrr) obj5).c;
                r26 r26Var = ((n26) obj4).a;
                if (r26Var != null && (k26Var = r26Var.b) != null) {
                    u26Var2 = k26Var.f;
                }
                aVar.a.d(u26Var2, tseVar);
                break;
            case 5:
                ((tls) obj5).invoke(new el30((ll30) obj4, (fd30) obj3));
                break;
            case 6:
                tse tseVar2 = (tse) obj3;
                c cVar = ((f) obj5).a;
                r26 r26Var2 = ((n26) obj4).a;
                if (r26Var2 != null && (k26Var2 = r26Var2.b) != null) {
                    u26Var = k26Var2.f;
                }
                cVar.a.f(u26Var, tseVar2);
                break;
            case 7:
                xl10 xl10Var = new xl10((gzm0) obj3);
                m mVar = ((zo30) obj4).a;
                yo30 yo30Var = new yo30(xl10Var, (ru.yandex.taxi.masstransit.stopbubble.factory.a) ((y2s0) mVar.a).get(), (tt2) ((xvf0) mVar.b).get(), (ru.yandex.taxi.masstransit.stopbubble.interactor.a) ((l9t0) mVar.c).get(), (dzx) ((xvf0) mVar.d).get(), (ah00) ((f3g) mVar.e).get(), (a3v) ((xvf0) mVar.f).get(), (rp60) ((xvf0) mVar.g).get(), (mfu0) ((xvf0) mVar.h).get(), (po21) ((xvf0) mVar.i).get(), (wu30) ((xvf0) mVar.j).get());
                ht10 ht10Var = ((ap30) obj5).a;
                break;
            case 8:
                tls tlsVar = (tls) obj3;
                be40 be40Var = ((CharSequence) obj5) != null ? (be40) obj4 : null;
                if (be40Var != null) {
                    tlsVar.invoke(new ld40(be40Var));
                    break;
                }
                break;
            case 9:
                tls tlsVar2 = (tls) obj5;
                String str2 = (String) obj4;
                Iterator it = ((List) obj3).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (jl40.l(((ph40) next).f, str2)) {
                            obj2 = next;
                        }
                    }
                }
                tlsVar2.invoke(new xh40(str2, (ph40) obj2));
                break;
            case 10:
                ((tls) obj5).invoke(new ns40(((lz6) obj4).b, (v3y0) obj3));
                break;
            case 11:
                oz40 oz40Var = (oz40) obj4;
                sz40 sz40Var = (sz40) obj3;
                if (obj5 != null) {
                    oz40Var.setValue(obj5);
                }
                sz40Var.b(Boolean.valueOf(obj5 != null));
                break;
            case 12:
                com.yandex.messaging.internal.authorized.online.a aVar2 = (com.yandex.messaging.internal.authorized.online.a) obj5;
                f370 f370Var = (f370) obj4;
                String str3 = (String) obj3;
                tp21 tp21Var = (tp21) aVar2.a.get();
                z83.g(null, tp21Var.a.getLooper(), Looper.myLooper());
                sp21 sp21Var = (sp21) tp21Var.b.get(f370Var.b);
                if (sp21Var != null) {
                    zq60 zq60Var = sp21Var.a;
                    zq60Var.d(f370Var);
                    if (zq60Var.isEmpty()) {
                        sp21Var.close();
                    }
                    i2 = zq60Var.c;
                }
                aVar2.c.e(i2, str3);
                break;
            case 13:
                p370 p370Var = (p370) obj4;
                break;
            case 14:
                yss yssVar = (yss) obj5;
                ows0 ows0Var = (ows0) obj4;
                jc70 jc70Var = (jc70) obj3;
                if (yssVar != null) {
                    ows0Var.a(ows0Var.c(yssVar) - ows0Var.t);
                }
                List c = ipb1.c(ows0Var, null, ows0Var.t, null);
                bhd bhdVar = (bhd) kotlin.collections.a.b0(c);
                Integer num = bhdVar != null ? bhdVar.c : null;
                List e = jc70Var.e(num);
                if (num != null && !e.isEmpty()) {
                    bhd bhdVar2 = (bhd) kotlin.collections.a.P(e);
                    e = kotlin.collections.a.m0(kotlin.collections.a.J(e, 1), Collections.singletonList(new bhd(bhdVar2.a, bhdVar2.b, num)));
                }
                break;
            case 15:
                koz0 koz0Var = ((i) obj5).o0;
                koz0Var.getClass();
                break;
            case 16:
                h3y h3yVar = ((b) obj5).c;
                TaxiOrder taxiOrder = (TaxiOrder) obj4;
                List list = (List) obj3;
                if (!taxiOrder.K()) {
                    break;
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((TaxiOrder) it2.next()).a);
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList);
                    Iterator it3 = ((e0) ((z580) h3yVar.get()).g).A().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next2 = it3.next();
                            TaxiOrder taxiOrder2 = (TaxiOrder) next2;
                            if (!evu0.J(taxiOrder2.a) && !N0.contains(taxiOrder2.a)) {
                                obj = next2;
                            }
                        }
                    }
                    break;
                }
                break;
            case 17:
                filtersAdapter_delegate$lambda$0 = OrganizationsFiltersModalView.filtersAdapter_delegate$lambda$0((tt2) obj5, (e) obj4, (OrganizationsFiltersModalView) obj3);
                break;
            case 18:
                ((wga0) obj5).l = (PaymentDetails) obj4;
                ((p370) obj3).onSuccess(zy11Var);
                break;
            case 19:
                renderTip$lambda$13 = PhotoFragment.renderTip$lambda$13((PhotoFragment) obj5, (CharSequence) obj4, (ujb0) obj3);
                break;
            case 20:
                tls tlsVar3 = (tls) obj5;
                hkb0 hkb0Var = (hkb0) obj4;
                String str4 = (String) obj3;
                if (tlsVar3 == null) {
                    ny61.g("onClicked is null");
                    break;
                } else {
                    tlsVar3.invoke(new mhb0(hkb0Var.c, str4, PhotoModel$Type.LOCAL));
                    break;
                }
            case 21:
                tls tlsVar4 = (tls) obj5;
                ikb0 ikb0Var = (ikb0) obj4;
                String str5 = (String) obj3;
                if (tlsVar4 == null) {
                    ny61.g("onClicked is null");
                    break;
                } else {
                    tlsVar4.invoke(new mhb0(ikb0Var.b, str5, PhotoModel$Type.LOCAL));
                    break;
                }
            case 22:
                ((hpr0) ((xv10) obj5).b).b((pgu) obj4, (qgu) obj3);
                break;
            case 23:
                Map map = (Map) obj3;
                if (((ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a) obj5).d.b.get(((zxb0) obj4).a.a) == PinVisualState.ICON) {
                    h2c0 h2c0Var = (h2c0) map.get(PlacemarkType.ICON);
                    if (h2c0Var != null) {
                        if (!h2c0Var.c()) {
                            h2c0Var = null;
                        }
                        if (h2c0Var != null) {
                            h2c0Var.setVisible(true);
                        }
                    }
                    h2c0 h2c0Var2 = (h2c0) map.get(PlacemarkType.ICON_OVERLAY);
                    if (h2c0Var2 != null) {
                        h2c0 h2c0Var3 = h2c0Var2.c() ? h2c0Var2 : null;
                        if (h2c0Var3 != null) {
                            h2c0Var3.setVisible(false);
                            break;
                        }
                    }
                }
                break;
            case 24:
                ((tls) obj5).invoke((ti80) obj4);
                ((com.yandex.go.places.impl.navigation.common.navigator.internal.b) obj3).n.c();
                break;
            case 25:
                sls slsVar = (sls) obj4;
                aec0 aec0Var = (aec0) obj3;
                wdc0 wdc0Var = (wdc0) ((Ref$ObjectRef) obj5).element;
                if (wdc0Var != null) {
                    aec0Var.c.remove(wdc0Var);
                }
                slsVar.invoke();
                break;
            case 26:
                show$lambda$0 = PlaqueView.show$lambda$0((PlaqueView) obj5, (qoc0) obj4, obj3);
                break;
            case 27:
                showHeader$lambda$0 = PlaqueWidgetItemView.showHeader$lambda$0((PlaqueWidgetItemView) obj5, (wju) obj4, (pwz0) obj3);
                break;
            case 28:
                ((pep0) ((oep0) obj5)).f((m950) ((i1d0) obj4).b.get(), new d0h(((h1d0) obj3).a), hxx.a);
                break;
            default:
                ((wls) obj5).invoke((String) obj4, ((r8e0) obj3).a.f);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ b700(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
