package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.adjust.sdk.Constants;
import com.yandex.go.address.models.Address;
import com.yandex.go.dto.response.q1;
import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$SearchBarTapSource;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainFloatingHeaderTopPlaqueView;
import com.yandex.go.preorder.suggested.menu.presenter.b;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.y;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import com.yandex.go.superapp.searchbar.impl.presentation.a;
import com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarView;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.TaxiOrderOverrides;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.preorder.suggested.selection.c;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final /* synthetic */ class gyt0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gyt0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 render$lambda$0;
        zy11 configureButtons$lambda$1$0;
        zy11 render$lambda$02;
        a aVar;
        q1 q1Var;
        q1 q1Var2;
        wls wlsVar;
        wls wlsVar2;
        CameraCharacteristics.Key key;
        Object value;
        int i = 5;
        String str = null;
        switch (this.a) {
            case 0:
                wg6 wg6Var = (wg6) this.b;
                androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) this.c;
                wg6Var.h.getFloatValue();
                return Float.valueOf(((Number) aVar2.e()).floatValue());
            case 1:
                ((RecyclerView.Adapter) this.b).onViewRecycled((x0) this.c);
                return zy11.a;
            case 2:
                egu0 egu0Var = (egu0) this.b;
                tls tlsVar = (tls) this.c;
                ihu0 ihu0Var = egu0Var.e;
                if (ihu0Var != null) {
                    tlsVar.invoke(ihu0Var);
                }
                return zy11.a;
            case 3:
                ((tls) this.b).invoke(((viu0) this.c).c);
                return zy11.a;
            case 4:
                vt6 vt6Var = (vt6) this.b;
                x880 x880Var = (x880) this.c;
                com.yandex.go.preorder.confirm.a aVar3 = (com.yandex.go.preorder.confirm.a) vt6Var.b;
                ((i6y0) aVar3.n).c(bei.R);
                n0 n0Var = aVar3.q;
                zy11 zy11Var = zy11.a;
                n0Var.g(zy11Var);
                x880Var.n();
                return zy11Var;
            case 5:
                c cVar = (c) this.b;
                ga0 ga0Var = (ga0) this.c;
                SuggestsView.a aVar4 = cVar.P;
                ga0Var.getClass();
                aVar4.bc(j8v0.a);
                return zy11.a;
            case 6:
                PointType pointType = (PointType) this.b;
                com.yandex.go.preorder.suggested.menu.ui.c cVar2 = (com.yandex.go.preorder.suggested.menu.ui.c) this.c;
                int i2 = pointType == null ? -1 : x6v0.a[pointType.ordinal()];
                r0c0 r0c0Var = cVar2.b;
                return i2 == 1 ? r0c0Var.c() : r0c0Var.i();
            case 7:
                ((b) this.b).Tg(((z5v0) this.c).a);
                return zy11.a;
            case 8:
                wg6 wg6Var2 = (wg6) this.b;
                return Boolean.valueOf(Math.abs(wg6Var2.h.getFloatValue() - wg6Var2.f(((lx40) this.c).b)) > 1.0f);
            case 9:
                ((com.yandex.go.superapp.discovery.map.impl.ui.main.filters.adapter.a) this.b).V.invoke((gtv0) this.c);
                return zy11.a;
            case 10:
                y yVar = (y) this.b;
                sls slsVar = (sls) this.c;
                if (!yVar.j) {
                    hhs0 hhs0Var = yVar.k;
                    y yVar2 = (y) hhs0Var.c;
                    cwv0 cwv0Var = (cwv0) hhs0Var.b;
                    if (cwv0Var == null) {
                        slsVar.invoke();
                    } else {
                        yVar2.a.g(cwv0Var.a);
                        yVar2.b.g(cwv0Var.b);
                        yVar2.c.g(cwv0Var.c);
                        yVar2.d.g(cwv0Var.d);
                        yVar2.e.g(cwv0Var.e);
                        hhs0Var.b = null;
                    }
                }
                return zy11.a;
            case 11:
                render$lambda$0 = SuperAppMapSearchbarView.render$lambda$0((c5w0) this.b, (tls) this.c);
                return render$lambda$0;
            case 12:
                configureButtons$lambda$1$0 = SuperAppMapSearchbarView.configureButtons$lambda$1$0((u4w0) this.b, (tls) this.c);
                return configureButtons$lambda$1$0;
            case 13:
                SuperAppMapSearchbarView superAppMapSearchbarView = (SuperAppMapSearchbarView) this.b;
                e5w0 e5w0Var = (e5w0) this.c;
                int measuredWidth = superAppMapSearchbarView.getMeasuredWidth();
                if (measuredWidth <= 0) {
                    measuredWidth = tje.t(superAppMapSearchbarView.getContext()).widthPixels;
                }
                return Float.valueOf(measuredWidth - (e5w0Var.a * 2));
            case 14:
                render$lambda$02 = SuperappMainFloatingHeaderTopPlaqueView.render$lambda$0((SuperappMainFloatingHeaderTopPlaqueView) this.b, (vbw0) this.c);
                return render$lambda$02;
            case 15:
                kew0 kew0Var = (kew0) this.b;
                SuperappSearchbarContainerView superappSearchbarContainerView = (SuperappSearchbarContainerView) this.c;
                if (kew0Var instanceof jew0) {
                    aVar = superappSearchbarContainerView.presenter;
                    jew0 jew0Var = (jew0) kew0Var;
                    ibw0 ibw0Var = aVar.B;
                    z2f0 z2f0Var = jew0Var.a;
                    iew0 iew0Var = jew0Var.f;
                    q1 q1Var3 = jew0Var.c;
                    String obj = z2f0Var != null ? z2f0Var.toString() : null;
                    CharSequence charSequence = jew0Var.b;
                    String obj2 = charSequence != null ? charSequence.toString() : null;
                    String Ng = q1Var3 != null ? a.Ng(q1Var3) : null;
                    String Mg = q1Var3 != null ? a.Mg(q1Var3) : null;
                    ArrayList<iew0> arrayList = jew0Var.d;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    for (iew0 iew0Var2 : arrayList) {
                        String str2 = iew0Var2.a;
                        q1 q1Var4 = iew0Var2.c;
                        arrayList2.add(new hbw0(str2, q1Var4 != null ? a.Ng(q1Var4) : null, q1Var4 != null ? a.Mg(q1Var4) : null));
                    }
                    ArrayList<iew0> arrayList3 = jew0Var.e;
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    for (iew0 iew0Var3 : arrayList3) {
                        String str3 = iew0Var3.a;
                        q1 q1Var5 = iew0Var3.c;
                        arrayList4.add(new hbw0(str3, q1Var5 != null ? a.Ng(q1Var5) : null, q1Var5 != null ? a.Mg(q1Var5) : null));
                    }
                    String str4 = iew0Var != null ? iew0Var.a : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String Ng2 = (iew0Var == null || (q1Var2 = iew0Var.c) == null) ? null : a.Ng(q1Var2);
                    if (iew0Var != null && (q1Var = iew0Var.c) != null) {
                        str = a.Mg(q1Var);
                    }
                    MapBuilder y = qv10.y("image_tag", str4);
                    if (Ng2 != null) {
                        y.put("action", Ng2);
                    }
                    if (str != null) {
                        y.put(Constants.DEEPLINK, str);
                    }
                    MapBuilder j = y.j();
                    ibw0Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (obj != null) {
                        hashMap.put("title", obj);
                    }
                    if (obj2 != null) {
                        hashMap.put("subtitle", obj2);
                    }
                    if (Ng != null) {
                        hashMap.put("action", Ng);
                    }
                    if (Mg != null) {
                        hashMap.put(Constants.DEEPLINK, Mg);
                    }
                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((hbw0) it.next()).d);
                    }
                    hashMap.put("lead_buttons", arrayList5);
                    ArrayList arrayList6 = new ArrayList(tcc.n(arrayList4, 10));
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(((hbw0) it2.next()).d);
                    }
                    hashMap.put("trail_buttons", arrayList6);
                    hashMap.put("collapsed_button", j);
                    ibw0Var.a.a("SuperappMain.SearchBar.Shown", hashMap, 1, new HashMap());
                }
                return zy11.a;
            case 16:
                kew0 kew0Var2 = (kew0) this.b;
                SuperappSearchbarView superappSearchbarView = (SuperappSearchbarView) this.c;
                q1 q1Var6 = ((jew0) kew0Var2).c;
                if (q1Var6 != null) {
                    wlsVar = superappSearchbarView.actionHandler;
                    wlsVar.invoke(q1Var6, SuperappMainAnalytics$SearchBarTapSource.ExpandedSearchBar);
                }
                return zy11.a;
            case 17:
                iew0 iew0Var4 = (iew0) this.b;
                SuperappSearchbarView superappSearchbarView2 = (SuperappSearchbarView) this.c;
                q1 q1Var7 = iew0Var4.c;
                if (q1Var7 != null) {
                    wlsVar2 = superappSearchbarView2.actionHandler;
                    wlsVar2.invoke(q1Var7, SuperappMainAnalytics$SearchBarTapSource.CollapsedButton);
                }
                return zy11.a;
            case 18:
                SuperappSearchbarContainerView superappSearchbarContainerView2 = (SuperappSearchbarContainerView) this.b;
                pew0 pew0Var = (pew0) this.c;
                int measuredWidth2 = superappSearchbarContainerView2.getMeasuredWidth();
                if (measuredWidth2 <= 0) {
                    measuredWidth2 = tje.t(superappSearchbarContainerView2.getContext()).widthPixels;
                }
                return Float.valueOf(measuredWidth2 - (pew0Var.a * 2));
            case 19:
                ((u131) this.b).f((loe) this.c);
                return zy11.a;
            case 20:
                ((com.yandex.go.taxi.order.details.v1.elements.support.a) ((m) this.b).b).a(((wak0) ((yak0) this.c)).b);
                return zy11.a;
            case 21:
                ((tbb) this.b).invoke(new wak0("OPEN_CHAT".toLowerCase(Locale.ROOT), (String) this.c), "support_chat");
                return zy11.a;
            case 22:
                androidx.camera.camera2.internal.y yVar3 = (androidx.camera.camera2.internal.y) this.b;
                List list = (List) this.c;
                ep7 ep7Var = yVar3.m;
                x34 x34Var = oru0.a;
                if (Build.VERSION.SDK_INT >= 33) {
                    key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                    long[] jArr = (long[]) ep7Var.a(key);
                    if (jArr != null && jArr.length != 0) {
                        HashSet hashSet = new HashSet();
                        for (long j2 : jArr) {
                            hashSet.add(Long.valueOf(j2));
                        }
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                r2 = true;
                            } else if (!hashSet.contains(Long.valueOf(((anw0) it3.next()).c.getValue()))) {
                            }
                        }
                    }
                }
                return Boolean.valueOf(r2);
            case 23:
                ((com.yandex.go.settings.domain.c) this.b).b.d((n3x0) this.c);
                return zy11.a;
            case 24:
                r9x0 r9x0Var = (r9x0) this.b;
                ru.yandex.logistics.sdk.cargo_form.impl.domain.c cVar3 = (ru.yandex.logistics.sdk.cargo_form.impl.domain.c) this.c;
                r9x0 r9x0Var2 = ((m9x0) r9x0Var).c;
                if (r9x0Var2 != null) {
                    cVar3.b(r9x0Var2);
                }
                return zy11.a;
            case 25:
                ((tls) this.b).invoke((puz0) this.c);
                return Boolean.TRUE;
            case 26:
                Address address = (Address) this.b;
                mkx0 mkx0Var = (mkx0) this.c;
                mkx0Var.A((m950) mkx0Var.b0.get(), k0b1.a(address, ((gh00) mkx0Var.Z).e.b(), SourcePicker.ADDITIONAL_FROM_SUMMARY, ModalViewOrigin.SUMMARY, false, new e83(i, mkx0Var)), sy60.Q2);
                return zy11.a;
            case 27:
                TaxiOrder taxiOrder = (TaxiOrder) this.b;
                DriveState driveState = (DriveState) this.c;
                TaxiOrderOverrides taxiOrderOverrides = taxiOrder.h;
                taxiOrderOverrides.getClass();
                return TaxiOrderOverrides.a(taxiOrderOverrides, null, driveState, null, 5);
            case 28:
                TaxiOrder taxiOrder2 = (TaxiOrder) this.b;
                Preorder preorder = (Preorder) this.c;
                TaxiOrderLocalData taxiOrderLocalData = taxiOrder2.l;
                boolean z = preorder.h0;
                taxiOrderLocalData.getClass();
                return TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, null, false, null, null, null, -1, 16515071);
            default:
                e0 e0Var = (e0) this.b;
                o2y0 o2y0Var = (o2y0) this.c;
                r0 r0Var = e0Var.f;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, kotlin.collections.a.o0((List) value, o2y0Var)));
                return o2y0Var;
        }
    }
}
