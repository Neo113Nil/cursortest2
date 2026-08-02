package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.order.tariffs_suggest.ui.SuggestTariffCashbackView;
import com.yandex.go.superapp.api.loading_tracker.ServiceLoadingEvent;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarView;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderTrackingCompactViewProxyContainer;
import com.yandex.go.taxi.order.tariff_upgrade.ui.TariffUpgradeModalView;
import com.yandex.go.taxi.order.titles.f;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.geometry.Point;
import com.yandex.payment.sdk.subscribebills.ui.a;
import com.ybsdk.widgets.common.SuggestsGroupView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.c;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.n;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;
import ru.yandex.taxi.summary.promotions.models.b0;
import ru.yandex.taxi.summary.promotions.models.d0;
import ru.yandex.taxi.summary.promotions.repository.e;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class lzu0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lzu0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0718, code lost:
    
        if (r3 == null) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0891  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        zy11 suggestsAdapterDelegate$lambda$5$lambda$4;
        String str2;
        t76 t76Var;
        int i;
        Object value;
        LinkedHashMap linkedHashMap;
        zy11 zy11Var;
        List list;
        ArrayList arrayList;
        Object obj3;
        boolean z;
        boolean z2;
        char c;
        String str3;
        Drawable fadeGradientDrawable;
        zy11 loadImage$lambda$0;
        String obj4;
        String obj5;
        zy11 addRideCardView$lambda$0;
        int i2 = this.a;
        int i3 = 3;
        int i4 = 0;
        int i5 = 2;
        zy11 zy11Var2 = zy11.a;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i2) {
            case 0:
                a aVar = (a) obj7;
                AppCompatActivity appCompatActivity = (AppCompatActivity) obj6;
                String str4 = ((g450) obj).a;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str4));
                if (intent.resolveActivity(appCompatActivity.getPackageManager()) != null) {
                    try {
                        appCompatActivity.startActivity(intent);
                    } catch (Exception e) {
                        rwo rwoVar = aVar.d;
                        sv90 sv90Var = qv90.a;
                        sv90 sv90Var2 = qv90.a;
                        String message = e.getMessage();
                        sv90Var2.getClass();
                        ((y22) rwoVar).a(sv90.C(str4, message));
                    }
                }
                return zy11Var2;
            case 1:
                z1v0 z1v0Var = (z1v0) obj7;
                ArrayList arrayList2 = (ArrayList) obj6;
                String str5 = z1v0Var.c;
                if (str5 != null) {
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((wj1) it.next()).a, str5)) {
                                if (str5 != null) {
                                    str = str5;
                                    return z1v0.a(z1v0Var, arrayList2, str, 2);
                                }
                            }
                        }
                    }
                    str5 = null;
                    if (str5 != null) {
                    }
                }
                wj1 wj1Var = (wj1) kotlin.collections.a.R(arrayList2);
                str = wj1Var != null ? wj1Var.a : null;
                return z1v0.a(z1v0Var, arrayList2, str, 2);
            case 2:
                zls zlsVar = (zls) obj7;
                ru.yandex.taxi.design.utils.a aVar2 = (ru.yandex.taxi.design.utils.a) obj6;
                ListItemComponent listItemComponent = (ListItemComponent) obj;
                View inflate = LayoutInflater.from(listItemComponent.getContext()).inflate(huh0.layout_suggest_tariff_icon, (ViewGroup) listItemComponent, false);
                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
                int i6 = b6h0.tariff_card_eta;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i6, inflate);
                if (robotoTextView != null) {
                    i6 = b6h0.tariff_class_icon;
                    ImageView imageView = (ImageView) cma1.O(i6, inflate);
                    if (imageView != null) {
                        m2y m2yVar = new m2y(goConstraintLayout, goConstraintLayout, robotoTextView, imageView, 0);
                        View inflate2 = LayoutInflater.from(listItemComponent.getContext()).inflate(huh0.layout_suggest_tariff_trail, (ViewGroup) listItemComponent, false);
                        int i7 = b6h0.cashback;
                        SuggestTariffCashbackView suggestTariffCashbackView = (SuggestTariffCashbackView) cma1.O(i7, inflate2);
                        if (suggestTariffCashbackView != null) {
                            i7 = b6h0.checkbox;
                            CheckBoxComponent checkBoxComponent = (CheckBoxComponent) cma1.O(i7, inflate2);
                            if (checkBoxComponent != null) {
                                i7 = b6h0.price;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i7, inflate2);
                                if (robotoTextView2 != null) {
                                    return new g8v0(listItemComponent, m2yVar, new m2y((ViewGroup) inflate2, (View) suggestTariffCashbackView, (View) checkBoxComponent, robotoTextView2, 1), new mfb(listItemComponent.getContext(), null, xng0.listCheckBoxComponentStyle), zlsVar, aVar2);
                                }
                            }
                        }
                        obj2 = null;
                        ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i7)));
                        return obj2;
                    }
                }
                obj2 = null;
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                return obj2;
            case 3:
                suggestsAdapterDelegate$lambda$5$lambda$4 = SuggestsGroupView.suggestsAdapterDelegate$lambda$5$lambda$4((n70) obj7, (SuggestsGroupView) obj6, (List) obj);
                return suggestsAdapterDelegate$lambda$5$lambda$4;
            case 4:
                oiv0 oiv0Var = (oiv0) obj7;
                String queryParameter = ((Uri) obj6).getQueryParameter("origin");
                if (queryParameter == null) {
                    queryParameter = "widget";
                }
                oiv0Var.e(queryParameter);
                return zy11Var2;
            case 5:
                return ((zkv0) obj7).g((u051) obj6, ((Boolean) obj).booleanValue());
            case 6:
                e eVar = (e) obj7;
                String str6 = (String) obj6;
                SummaryPromotionsResponse.a aVar3 = (SummaryPromotionsResponse.a) obj;
                ru.yandex.taxi.summary.promotions.models.a aVar4 = eVar.a;
                pex0 m = ((k) eVar.i).m();
                String str7 = m != null ? m.b : null;
                Map f = str7 == null ? b.f() : g8e.z("tariff_class", str7);
                boolean contains = eVar.f.c.contains(aVar3.a);
                aVar4.getClass();
                SummaryPromotionsResponse.a.C0118a c0118a = aVar3.h;
                if (c0118a != null) {
                    str2 = aVar4.b.a.format(Integer.valueOf(c0118a.a));
                    break;
                }
                str2 = "";
                String str8 = str2;
                d0 d0Var = aVar3.k;
                if (d0Var instanceof b0) {
                    t76Var = new t76(((b0) d0Var).a, aVar3.l && !contains);
                } else {
                    if (d0Var != null) {
                        w511.b();
                        return null;
                    }
                    t76Var = null;
                }
                String str9 = aVar3.a;
                String str10 = aVar3.b;
                FormattedText formattedText = aVar3.c;
                FormattedText formattedText2 = aVar3.d;
                String a = aVar4.a(aVar3.e);
                z051 b = ru.yandex.taxi.summary.promotions.models.a.b(aVar3.f);
                t0e t0eVar = aVar3.n;
                Map map = aVar3.p;
                SummaryPromotionsResponse.a.b bVar = aVar3.i;
                return new zkv0(str9, str10, formattedText, formattedText2, a, b, str6, str8, t76Var, t0eVar, map, f, bVar != null ? bVar.a : 0);
            case 7:
                li6 li6Var = (li6) obj;
                li6Var.a((Point) obj7);
                li6Var.a((Point) obj6);
                return zy11Var2;
            case 8:
                ru.yandex.taxi.superapp.payment.a aVar5 = (ru.yandex.taxi.superapp.payment.a) obj6;
                return new b6w0((h1p) obj7, aVar5.e, aVar5.d, aVar5.h);
            case 9:
                ((n) obj7).g.a(ServiceLoadingEvent.AUTH_FINISH);
                ((tls) obj6).invoke((bb41) obj);
                return zy11Var2;
            case 10:
                edw0 edw0Var = (edw0) obj7;
                tdw0 tdw0Var = (tdw0) obj6;
                float floatValue = ((Float) obj).floatValue();
                amp0 amp0Var = edw0Var.c;
                pew0 pew0Var = (pew0) amp0Var.b;
                SuperappSearchbarView superappSearchbarView = (SuperappSearchbarView) amp0Var.a;
                sdw0 sdw0Var = sdw0.a;
                boolean l = jl40.l(tdw0Var, sdw0Var);
                rdw0 rdw0Var = rdw0.a;
                if (l) {
                    float f2 = (0.100000024f * floatValue) + 0.9f;
                    Object parent = superappSearchbarView.getParent();
                    if (parent instanceof View) {
                        View view = (View) parent;
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i = view.getPaddingBottom() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                    } else {
                        i = 0;
                    }
                    superappSearchbarView.setTranslationY((1.0f - floatValue) * (pew0Var.b.c + i));
                    superappSearchbarView.setScaleX(f2);
                    superappSearchbarView.setScaleY(f2);
                } else {
                    if (!jl40.l(tdw0Var, rdw0Var)) {
                        w511.b();
                        return null;
                    }
                    superappSearchbarView.setTranslationX((1.0f - floatValue) * (xw31.n(superappSearchbarView.getContext()) ? -1 : 1) * (-(pew0Var.c.a() + (superappSearchbarView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r8).getMarginStart() : 0))));
                }
                if (jl40.l(tdw0Var, sdw0Var)) {
                    ((v66) edw0Var.b.b).d(new zip(floatValue, 2), null);
                } else {
                    if (!jl40.l(tdw0Var, rdw0Var)) {
                        w511.b();
                        return null;
                    }
                    edw0Var.d.b(floatValue, tdw0Var);
                }
                return zy11Var2;
            case 11:
                o2y0 o2y0Var = (o2y0) obj7;
                dfk0 dfk0Var = (dfk0) obj;
                String str11 = ((liw0) ((miw0) obj6)).a;
                int i8 = dfk0Var.a;
                eqc eqcVar = eqc.b;
                switch (i8) {
                    case 0:
                        wpc wpcVar = new wpc(eqcVar, 2);
                        ifk0 ifk0Var = (ifk0) dfk0Var.b;
                        ifk0Var.A((m950) ifk0Var.T.get(), wpcVar, new cfk0(ifk0Var, o2y0Var, str11, 0));
                        return zy11Var2;
                    default:
                        f9a f9aVar = (f9a) dfk0Var.b;
                        f9aVar.r(new qu(9));
                        ((pep0) ((oep0) f9aVar.G)).f(new uva(3, (ypc) f9aVar.E.get(), new xlp0(22, f9aVar, o2y0Var, str11)), new wpc(eqcVar, 2), hxx.a);
                        return zy11Var2;
                }
            case 12:
                xsw0 xsw0Var = (xsw0) obj7;
                nky0 nky0Var = (nky0) obj6;
                String str12 = (String) obj;
                r0 r0Var = xsw0Var.F;
                hhs0 hhs0Var = xsw0Var.E;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    if (str12 == null) {
                        linkedHashMap.remove(nky0Var.b);
                        String str13 = nky0Var.b;
                        zow0 zow0Var = (zow0) hhs0Var.b;
                        zow0Var.getClass();
                        HashMap hashMap = new HashMap();
                        if (str13 != null) {
                            hashMap.put("selection_key", str13);
                        }
                        zow0Var.a.a("SurgeCard.Selector.Modal.Closed", hashMap, 1, new HashMap());
                    } else {
                        linkedHashMap.put(nky0Var.b, str12);
                        String str14 = nky0Var.b;
                        zow0 zow0Var2 = (zow0) hhs0Var.b;
                        zow0Var2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("selected_value", str12);
                        if (str14 != null) {
                            hashMap2.put("selection_key", str14);
                        }
                        zow0Var2.a.a("SurgeCard.Selector.Modal.Selected", hashMap2, 1, new HashMap());
                    }
                } while (!r0Var.k(value, linkedHashMap));
                return zy11Var2;
            case 13:
                ((gtw0) obj7).K.handle((String) obj6);
                ((sy60) obj).a();
                return zy11Var2;
            case 14:
                gtw0 gtw0Var = ((etw0) obj).a.a;
                gtw0Var.A((m950) gtw0Var.O.get(), (nuq) obj7, sy60.Q2);
                ((xcv0) ((yuw0) obj6).L).l("send_feedback");
                return zy11Var2;
            case 15:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj6;
                androidx.compose.animation.core.a aVar6 = (androidx.compose.animation.core.a) obj;
                ((mah) obj7).a.a.invoke(Float.valueOf(((Number) aVar6.e()).floatValue() - ref$FloatRef.element));
                ref$FloatRef.element = ((Number) aVar6.e()).floatValue();
                return zy11Var2;
            case 16:
                w1x0 w1x0Var = (w1x0) obj7;
                r2x0 r2x0Var = (r2x0) obj6;
                HashSet hashSet = new HashSet();
                i2z i2zVar = w1x0Var.e;
                List list2 = (List) androidx.room.util.a.b(i2zVar.b, true, false, new xpy(11));
                r2x0Var.b = 0;
                ArrayList arrayList3 = (ArrayList) r2x0Var.c;
                if (arrayList3.size() <= 0) {
                    return zy11Var2;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                while (true) {
                    String str15 = ((q2x0) arrayList3.get(r2x0Var.b)).d + ":" + ((q2x0) arrayList3.get(r2x0Var.b)).c;
                    if (arrayList4.contains(str15)) {
                        zy11Var = zy11Var2;
                        list = list2;
                        arrayList = arrayList3;
                    } else {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (jl40.l(((h2z) obj3).a, str15)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        h2z h2zVar = (h2z) obj3;
                        zy11Var = zy11Var2;
                        String str16 = ((q2x0) arrayList3.get(r2x0Var.b)).d + ":" + ((q2x0) arrayList3.get(r2x0Var.b)).c;
                        String str17 = ((q2x0) arrayList3.get(r2x0Var.b)).c;
                        long j = ((q2x0) arrayList3.get(r2x0Var.b)).b;
                        if (h2zVar == null) {
                            String str18 = ((q2x0) arrayList3.get(r2x0Var.b)).a;
                            long j2 = ((q2x0) arrayList3.get(r2x0Var.b)).d;
                            String str19 = ((q2x0) arrayList3.get(r2x0Var.b)).e;
                            i2zVar.getClass();
                            ((Number) androidx.room.util.a.b(i2zVar.b, false, true, new mgu(28, i2zVar, new h2z(str16, j2, false, str18, str17, null, j, true, false, str19)))).longValue();
                            c = 1;
                        } else {
                            boolean z3 = h2zVar.i;
                            String str20 = ((q2x0) arrayList3.get(r2x0Var.b)).a;
                            boolean z4 = (str20.equals(h2zVar.d) && str17.equals(h2zVar.e)) ? false : true;
                            if (z4) {
                                z = z3;
                                ((Number) androidx.room.util.a.b(i2zVar.b, false, true, new sa6(str20, str17, j, str16, 1))).intValue();
                            } else {
                                z = z3;
                                if (z) {
                                    z2 = z4;
                                    ((Number) androidx.room.util.a.b(i2zVar.b, false, true, new vsq(str16, 21))).intValue();
                                    c = !z ? (char) 3 : z2 ? (char) 2 : (char) 4;
                                }
                            }
                            z2 = z4;
                            if (!z) {
                            }
                        }
                        if (c != 4) {
                            list = list2;
                            arrayList = arrayList3;
                            if (h2zVar != null && (str3 = h2zVar.f) != null) {
                                hashSet.add(str3);
                            }
                        } else if (h2zVar != null) {
                            long j3 = ((q2x0) arrayList3.get(r2x0Var.b)).b;
                            list = list2;
                            arrayList = arrayList3;
                            if (j3 != h2zVar.g) {
                                ((Number) androidx.room.util.a.b(i2zVar.b, false, true, new qo6(j3, h2zVar.a, 4))).intValue();
                            }
                        } else {
                            list = list2;
                            arrayList = arrayList3;
                            z83.i();
                        }
                        if (c != 1 && c != 2 && c != 3 && c != 4) {
                            z83.i();
                        }
                        arrayList4.add(str15);
                    }
                    if (r2x0Var.b < arrayList.size()) {
                        r2x0Var.b++;
                    }
                    if (r2x0Var.b >= arrayList.size()) {
                        int size = arrayList4.size();
                        i2zVar.getClass();
                        w1x0Var.d.f("tech contacts synced locally", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "count", Integer.valueOf(size + (arrayList4.isEmpty() ? ((Number) androidx.room.util.a.b(i2zVar.b, false, true, new xpy(10))).intValue() : ((Number) androidx.room.util.a.b(i2zVar.b, false, true, new mgu(29, i2zVar, arrayList4))).intValue())));
                        if (ydz.a.a()) {
                            ydz.a();
                        }
                        w1x0Var.c.c(hashSet);
                        return zy11Var;
                    }
                    list2 = list;
                    arrayList3 = arrayList;
                    zy11Var2 = zy11Var;
                }
                break;
            case 17:
                ((Boolean) obj).getClass();
                ((tls) obj7).invoke(((z4x0) obj6).c);
                return zy11Var2;
            case 18:
                c cVar = (c) obj6;
                r9x0 r9x0Var = ((n9x0) ((r9x0) obj7)).b;
                if (r9x0Var != null) {
                    cVar.b(r9x0Var);
                }
                return zy11Var2;
            case 19:
                fadeGradientDrawable = ((TariffOptionsCardView) obj7).getFadeGradientDrawable((ThemeType) obj6);
                ((View) obj).setBackground(fadeGradientDrawable);
                return zy11Var2;
            case 20:
                loadImage$lambda$0 = TariffUpgradeModalView.loadImage$lambda$0((TariffUpgradeModalView) obj7, (eqx0) obj6, (Bitmap) obj);
                return loadImage$lambda$0;
            case 21:
                v611 v611Var = (v611) obj7;
                tls tlsVar = (tls) obj6;
                u6y u6yVar = (u6y) obj;
                t611 t611Var = v611Var.a.b;
                if (t611Var != null) {
                    u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(498687189, new hvx0(t611Var, tlsVar, i4), true), 3);
                }
                a711 a711Var = v611Var.a.c;
                if (a711Var != null) {
                    ArrayList arrayList5 = a711Var.d;
                    ((m6y) u6yVar).f(arrayList5.size(), null, new ly7(arrayList5, i3), new androidx.compose.runtime.internal.a(2039820996, new yc0(arrayList5, tlsVar, 14, v611Var), true));
                }
                return zy11Var2;
            case 22:
                com.yandex.go.taxi.order.change.destinations.navigation.a aVar7 = (com.yandex.go.taxi.order.change.destinations.navigation.a) obj7;
                hhs0 hhs0Var2 = aVar7.H;
                yfd yfdVar = (yfd) obj6;
                syx0 syx0Var = (syx0) obj;
                if (syx0Var instanceof ryx0) {
                    List list3 = ((pyx0) ((agd) yfdVar).a).b;
                    List list4 = ((ryx0) syx0Var).a;
                    hhs0Var2.getClass();
                    aVar7.r(new nk2(hhs0.s(list3, list4), 12));
                } else {
                    if (!(syx0Var instanceof qyx0)) {
                        w511.b();
                        return null;
                    }
                    List list5 = ((pyx0) ((agd) yfdVar).a).b;
                    List list6 = ((qyx0) syx0Var).b;
                    hhs0Var2.getClass();
                    aVar7.r(new lzu0(23, syx0Var, hhs0.s(list5, list6)));
                }
                return zy11Var2;
            case 23:
                j1l0 j1l0Var = (j1l0) obj;
                k1l0.P(((qyx0) ((syx0) obj7)).a, j1l0Var.a, j1l0Var.b, (ArrayList) obj6);
                return zy11Var2;
            case 24:
                com.yandex.go.taxi.order.chat.domain.a aVar8 = (com.yandex.go.taxi.order.chat.domain.a) obj7;
                return new com.yandex.go.taxi.order.chat.data.b(aVar8.a, (String) obj6, aVar8.c, aVar8.d, aVar8.f, aVar8.b, aVar8.g, aVar8.n, aVar8.e, aVar8.h);
            case 25:
                f fVar = (f) obj7;
                fVar.c((o2y0) obj6, true, false, true, new dgb(5, (tls) obj));
                return new kux0(i5, fVar);
            case 26:
                ((com.yandex.go.taxi.order.infosharing.domain.b) obj7).f.b((TaxiOrder) obj6, (Uri) obj);
                return zy11Var2;
            case 27:
                com.yandex.go.taxi.order.perf.session.a aVar9 = (com.yandex.go.taxi.order.perf.session.a) obj7;
                h6y0 h6y0Var = (h6y0) obj6;
                yes yesVar = (yes) obj;
                if (yesVar != null) {
                    int i9 = yesVar.b;
                    oa1 oa1Var = aVar9.b;
                    oa1Var.getClass();
                    List list7 = h6y0Var.d;
                    String str21 = h6y0Var.b;
                    f6y0 f6y0Var = h6y0Var.a;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj8 : list7) {
                        if (obj8 instanceof wmk0) {
                            arrayList6.add(obj8);
                        }
                    }
                    int d = gw00.d(tcc.n(arrayList6, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        linkedHashMap2.put(((wmk0) next).d, next);
                    }
                    wmk0 wmk0Var = (wmk0) linkedHashMap2.get(RideCardPresentationType.COMPACT);
                    wmk0 wmk0Var2 = (wmk0) linkedHashMap2.get(RideCardPresentationType.DETAILS);
                    if (wmk0Var != null && f6y0Var != null && (obj5 = f6y0Var.b.toString()) != null) {
                        oa1Var.f(i9, "Perf.Screen.RideCardCompact.MaxHitchDuration", str21, obj5);
                        double d2 = yesVar.a;
                        if (d2 > 0.0d) {
                            oa1Var.d(d2, "Perf.Screen.RideCardCompact.HitchTimeRatio", str21, obj5);
                        }
                    }
                    if (wmk0Var2 != null && f6y0Var != null && (obj4 = f6y0Var.b.toString()) != null) {
                        oa1Var.f(i9, "Perf.Screen.RideCardDetails.MaxHitchDuration", str21, obj4);
                        double d3 = yesVar.a;
                        if (d3 > 0.0d) {
                            oa1Var.d(d3, "Perf.Screen.RideCardDetails.HitchTimeRatio", str21, obj4);
                        }
                    }
                }
                return zy11Var2;
            case 28:
                addRideCardView$lambda$0 = TaxiOrderTrackingCompactViewProxyContainer.addRideCardView$lambda$0((TaxiOrderTrackingCompactViewProxyContainer) obj7, (o2y0) obj6, (View) obj);
                return addRideCardView$lambda$0;
            default:
                s5w0 s5w0Var = (s5w0) obj7;
                dd11 dd11Var = (dd11) obj;
                if (dd11Var instanceof qj0) {
                    s5w0Var.invoke(((qj0) dd11Var).a);
                    return Boolean.TRUE;
                }
                ny61.r("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
        }
    }
}
