package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.yandex.go.personal_goals_v2.router.b;
import com.yandex.go.personal_goals_v2.router.c;
import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;
import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersModalView;
import com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.messaging.internal.entities.feedback.CallFeedbackReason;
import com.yandex.messaging.ui.calls.feedback.PickFeedbackReasonsDialog;
import com.yandex.plus.home.api.lifecycle.ActivityLifecycle;
import com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebView;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.a;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.t4b0;
import defpackage.tje;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.ui.n;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes13.dex */
public final /* synthetic */ class i4b0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i4b0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 categoriesAdapter$lambda$3;
        YbButtonView.a render$lambda$14$lambda$11;
        zy11 render$lambda$14$lambda$13$lambda$12;
        zy11 _init_$lambda$0;
        zy11 insetsType$lambda$0;
        zy11 onAttachedToWindow$lambda$0;
        boolean _init_$lambda$02;
        WebResourceResponse webViewController_delegate$lambda$1$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final c cVar = (c) obj2;
                final yfd yfdVar = (yfd) obj;
                r0 r0Var = cVar.P;
                h4b0 h4b0Var = (h4b0) ((agd) yfdVar).a;
                String str = h4b0Var.c;
                String str2 = h4b0Var.d;
                ArrayList<g4b0> arrayList = h4b0Var.e;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (g4b0 g4b0Var : arrayList) {
                    arrayList2.add(new w7b0(g4b0Var.d, g4b0Var.e, g4b0Var.a, g4b0Var.b, g4b0Var.c, g4b0Var.f, g4b0Var.g, g4b0Var.h, g4b0Var.i, g4b0Var.j));
                }
                v4b0 v4b0Var = new v4b0(str, str2, arrayList2, h4b0Var.f, h4b0Var.g, 32);
                r0Var.getClass();
                r0Var.m(null, v4b0Var);
                agd agdVar = (agd) yfdVar;
                agdVar.c = r0Var;
                h4b0 h4b0Var2 = (h4b0) agdVar.a;
                final b bVar = new b(cVar, h4b0Var2.b, h4b0Var2.a);
                agdVar.e = new tls() { // from class: com.yandex.go.personal_goals_v2.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        c cVar2 = c.this;
                        tje.N(cVar2.o(), null, null, new PersonalGoalsRouterImpl$content$1$1$1(cVar2, (t4b0) obj3, yfdVar, bVar, null), 3);
                        return zy11.a;
                    }
                };
                had.a.getClass();
                agdVar.g = had.b;
                return zy11Var;
            case 1:
                categoriesAdapter$lambda$3 = PfmCategoriesView.categoriesAdapter$lambda$3((PfmCategoriesView) obj2, (l9b0) obj);
                return categoriesAdapter$lambda$3;
            case 2:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) obj2, 42);
            case 3:
                n70 n70Var = (n70) obj;
                n70Var.W(new ww90(14, n70Var, (eab0) obj2));
                return zy11Var;
            case 4:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new ww90(15, n70Var2, (eab0) obj2));
                return zy11Var;
            case 5:
                render$lambda$14$lambda$11 = PhoneConfirmationFragment.render$lambda$14$lambda$11((oeb0) obj2, (YbButtonView.a) obj);
                return render$lambda$14$lambda$11;
            case 6:
                render$lambda$14$lambda$13$lambda$12 = PhoneConfirmationFragment.render$lambda$14$lambda$13$lambda$12((PhoneConfirmationFragment) obj2, (String) obj);
                return render$lambda$14$lambda$13$lambda$12;
            case 7:
                dur.b((dur) obj2);
                return zy11Var;
            case 8:
                Iterator it = ((Map) ((n) obj2).f.getValue()).entrySet().iterator();
                while (it.hasNext()) {
                    yhb0 yhb0Var = (yhb0) ((Map.Entry) it.next()).getValue();
                    if ((yhb0Var instanceof whb0) || (yhb0Var instanceof vhb0)) {
                        yhb0Var.a().delete();
                    }
                }
                return zy11Var;
            case 9:
                ((ru.yandex.taxi.logistics.sdk.photocomments.domain.b) obj2).d();
                return zy11Var;
            case 10:
                _init_$lambda$0 = PickFeedbackReasonsDialog._init_$lambda$0((PickFeedbackReasonsDialog) obj2, (CallFeedbackReason) obj);
                return _init_$lambda$0;
            case 11:
                insetsType$lambda$0 = PickupFromPhotoModalView.insetsType$lambda$0((PickupFromPhotoModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 12:
                ((bob0) obj2).a.o(new gv40(11, (tls) obj), "pickup_from_photo_tooltip_should_be_shown");
                return new d82(1);
            case 13:
                ((com.yandex.go.pickup_from_photo.navigation.c) obj2).Z = (sls) obj;
                return zy11Var;
            case 14:
                ((d) obj2).Hg();
                return zy11Var;
            case 15:
                ((PlacemarkMapObject) obj2).setIcon((ImageProvider) obj);
                return zy11Var;
            case 16:
                ((PlacemarkStyle) obj2).setImage((ImageProvider) obj);
                return zy11Var;
            case 17:
                onAttachedToWindow$lambda$0 = PlacesCategoryFiltersModalView.onAttachedToWindow$lambda$0((PlacesCategoryFiltersModalView) obj2, (TaxiMapView) obj);
                return onAttachedToWindow$lambda$0;
            case 18:
                k7c0 k7c0Var = (k7c0) obj2;
                com.yandex.go.places.impl.ui.discovery.map.d dVar = k7c0Var.c;
                gh00 gh00Var = (gh00) ((ah00) k7c0Var.b);
                VisibleRegion a = gh00Var.e.a();
                float j = gh00Var.j();
                r0 r0Var2 = dVar.P.f;
                r6c0 r6c0Var = new r6c0(a, j);
                r0Var2.getClass();
                r0Var2.m(null, r6c0Var);
                gh00Var.e(k7c0Var.A);
                return zy11Var;
            case 19:
                xw90 xw90Var = (xw90) obj2;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    xw90Var.invoke();
                }
                return zy11Var;
            case 20:
                com.yandex.go.places.impl.navigation.d dVar2 = (com.yandex.go.places.impl.navigation.d) obj2;
                dVar2.n0((dm80) obj);
                dVar2.l0();
                return zy11Var;
            case 21:
                uac0 uac0Var = (uac0) obj2;
                uac0Var.K = false;
                uac0Var.Kg();
                return zy11Var;
            case 22:
                u050 u050Var = ((f) obj2).h;
                z050 z050Var = u050Var.c;
                if (z050Var != null) {
                    r0 r0Var3 = u050Var.a;
                    r0Var3.getClass();
                    r0Var3.m(null, z050Var);
                }
                u050Var.c = null;
                return zy11Var;
            case 23:
                uec0 uec0Var = (uec0) obj2;
                Float f = (Float) obj;
                if (jl40.l(uec0Var, tec0.a)) {
                    return new Pair(Float.valueOf(f != null ? f.floatValue() : 1.0f), Float.valueOf(0.0f));
                }
                if (jl40.l(uec0Var, sec0.a)) {
                    return new Pair(Float.valueOf(f != null ? f.floatValue() : 0.0f), Float.valueOf(1.0f));
                }
                w511.b();
                return null;
            case 24:
                _init_$lambda$02 = PlacesSearchbarContainerView._init_$lambda$0((PlacesSearchbarContainerView) obj2, (t1w) obj);
                return Boolean.valueOf(_init_$lambda$02);
            case 25:
                qgc0 qgc0Var = (qgc0) obj;
                if (((vgc0) obj2).D) {
                    qgc0Var.Y0();
                }
                return zy11Var;
            case 26:
                tyc0 tyc0Var = (tyc0) obj2;
                int intValue = ((Integer) obj).intValue();
                rh3 j2 = tyc0Var.e.j();
                if (j2 != null) {
                    sh3 sh3Var = (sh3) j2;
                    sh3Var.c = y6i0.g(intValue, new imz(0L, sh3Var.b, false));
                }
                rh3 j3 = tyc0Var.e.j();
                com.yandex.messaging.audio.d dVar3 = j3 != null ? (com.yandex.messaging.audio.d) tyc0Var.g.get(j3) : null;
                if (dVar3 != null) {
                    dVar3.b.setProgress(intValue / ((sh3) dVar3.h).b);
                    dVar3.b();
                    j24 j24Var = dVar3.f;
                    if (j24Var != null) {
                        j24Var.invoke(dVar3.h);
                    }
                }
                return zy11Var;
            case 27:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                int intValue2 = ((Integer) obj).intValue();
                return serialDescriptor.f(intValue2) + Extension.COLON_SPACE + serialDescriptor.d(intValue2).h();
            case 28:
                g4d0 g4d0Var = (g4d0) obj2;
                f4d0 f4d0Var = g4d0Var.a;
                kaa0 kaa0Var = f4d0Var.b;
                ActivityLifecycle activityLifecycle = f4d0Var.a;
                sls slsVar = g4d0Var.i;
                if (slsVar == null) {
                    slsVar = new q2d0(7);
                }
                ((wyj) g4d0Var.b.z).getClass();
                return new i4d0(new jnp0(kaa0Var, activityLifecycle, slsVar, new a(wyj.f)), g4d0Var.b, g4d0Var.c, g4d0Var.d, g4d0Var.e, g4d0Var.f, g4d0Var.g, g4d0Var.h);
            default:
                webViewController_delegate$lambda$1$lambda$0 = PlusHomeWebView.webViewController_delegate$lambda$1$lambda$0((PlusHomeWebView) obj2, (WebResourceRequest) obj);
                return webViewController_delegate$lambda$1$lambda$0;
        }
    }
}
