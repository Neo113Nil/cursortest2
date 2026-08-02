package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.squareup.moshi.Moshi;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.gallery.GalleryScrollPositionExtensionHandler;
import com.yandex.go.flex.common.router.web_view.b;
import com.yandex.go.inapp_calls.navigation.fullscreenintent.d;
import com.yandex.go.navigator.driving.SearchSourceType;
import com.yandex.go.navigator.gas_stations.overview.h;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.mapkit.map.Map;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.search.GlobalSearchRecentItems$PersistModel;
import com.ybsdk.feature.futurepayments.internal.screens.FuturePaymentsFragment;
import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat;
import com.ybsdk.rconfig.configs.YbSupportedQrFormatsSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.perf.frame.a;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchView;

/* loaded from: classes12.dex */
public final /* synthetic */ class dnr implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dnr(yrs yrsVar, dna dnaVar) {
        this.a = 15;
        this.b = dnaVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View addressSearchView;
        View bottomShadowView_delegate$lambda$0;
        zy11 animateMessageSending$lambda$0;
        View o;
        zy11 viewBinding$lambda$2$lambda$1;
        float density_delegate$lambda$0;
        LocalMessageRef localMessageRef;
        vjt vjtVar;
        int i;
        Object obj;
        int i2 = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        boolean z2 = true;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                return ((b) obj2).E.a();
            case 1:
                return dcs.a((Fragment) obj2);
            case 2:
                i3y i3yVar = ((a) obj2).d;
                ((HandlerThread) i3yVar.getValue()).start();
                return new Handler(((HandlerThread) i3yVar.getValue()).getLooper());
            case 3:
                return (f9j0) ((d) obj2).b.get();
            case 4:
                return (ViewGroup) ((zis) obj2).a.findViewById(teh0.top_fullscreen_modal_views_container);
            case 5:
                addressSearchView = ((FullscreenDestinationSearchModalView) obj2).getAddressSearchView();
                return addressSearchView;
            case 6:
                bottomShadowView_delegate$lambda$0 = FullscreenDestinationSearchView.bottomShadowView_delegate$lambda$0((FullscreenDestinationSearchView) obj2);
                return bottomShadowView_delegate$lambda$0;
            case 7:
                animateMessageSending$lambda$0 = FullscreenSuperappSuggestModalView.animateMessageSending$lambda$0((FullscreenSuperappSuggestModalView) obj2);
                return animateMessageSending$lambda$0;
            case 8:
                o = ((z661) obj2).o();
                return o;
            case 9:
                com.ybsdk.feature.transfer.version2.internal.screens.fund.a aVar = (com.ybsdk.feature.transfer.version2.internal.screens.fund.a) obj2;
                aVar.C.e();
                aVar.Z(eos.a);
                return zy11Var;
            case 10:
                ((com.ybsdk.feature.savings.internal.screens.fund.operation.a) obj2).h0(null, true);
                return zy11Var;
            case 11:
                viewBinding$lambda$2$lambda$1 = FuturePaymentsFragment.getViewBinding$lambda$2$lambda$1((FuturePaymentsFragment) obj2);
                return viewBinding$lambda$2$lambda$1;
            case 12:
                density_delegate$lambda$0 = GalleryScrollPositionExtensionHandler.density_delegate$lambda$0((GalleryScrollPositionExtensionHandler) obj2);
                return Float.valueOf(density_delegate$lambda$0);
            case 13:
                return Float.valueOf(((xrs) obj2).a.getResources().getDisplayMetrics().density);
            case 14:
                return Integer.valueOf(tje.t(((yrs) obj2).c.getContext()).widthPixels);
            case 15:
                yrs.l(true, (dna) obj2);
                return zy11Var;
            case 16:
                css cssVar = ((dss) obj2).Q;
                if (cssVar != null) {
                    com.yandex.messaging.internal.view.timeline.b bVar = ((t15) cssVar).a;
                    if (!bVar.k0 && bVar.R && (localMessageRef = bVar.g0) != null) {
                        jcz0 jcz0Var = bVar.e0().f;
                        if (jcz0Var != null) {
                            jcz0Var.w(localMessageRef);
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 17:
                return ((bts) obj2).q();
            case 18:
                gh00 gh00Var = (gh00) ((tts) obj2).a;
                gh00Var.getClass();
                xm00 xm00Var = new xm00();
                Map map = gh00Var.b;
                if (map != null) {
                    xm00Var.l(map.addMapObjectLayer("gas_station"));
                }
                if (gh00Var.b == null) {
                    hst hstVar = jst.e;
                    hstVar.getClass();
                    ke00 a = hstVar.b.a();
                    if (a != null && a.b(15)) {
                        a.a(15, null, null, "Map is null on add layer gas_station!", hstVar.a);
                    }
                }
                return xm00Var;
            case 19:
                return Integer.valueOf(tje.u(44, ((avj0) ((com.yandex.go.navigator.gas_stations.overview.a) obj2).b).a));
            case 20:
                h hVar = (h) obj2;
                hVar.I.h("show", "filter", Boolean.FALSE, null, null, null);
                hVar.J.a = SearchSourceType.PETROL_STATION_SEARCH;
                tus tusVar = hVar.z;
                tusVar.d = false;
                tusVar.b();
                return zy11Var;
            case 21:
                ((com.yandex.go.navigator.gas_stations.b) obj2).c.getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 22:
                com.yandex.messaging.internal.search.a aVar2 = (com.yandex.messaging.internal.search.a) obj2;
                gym gymVar = aVar2.b;
                String string = aVar2.a.getString(aVar2.c, null);
                gymVar.getClass();
                tje.f();
                if (string == null || evu0.J(string)) {
                    vjtVar = new vjt(new LinkedList());
                } else {
                    GlobalSearchRecentItems$PersistModel globalSearchRecentItems$PersistModel = (GlobalSearchRecentItems$PersistModel) ((Moshi) gymVar.a).adapter(GlobalSearchRecentItems$PersistModel.class).fromJson(string);
                    vjtVar = globalSearchRecentItems$PersistModel != null ? new vjt(new LinkedList(globalSearchRecentItems$PersistModel.getList())) : null;
                    z83.i();
                    if (vjtVar == null) {
                        vjtVar = new vjt(new LinkedList());
                    }
                }
                return bvf0.c(vjtVar);
            case 23:
                return Integer.valueOf(c.h(8, ((lkt) obj2).a));
            case 24:
                return aob1.a(((ru.yandex.taxi.vendor_api.google.face_detection.a) obj2).a);
            case 25:
                return aob1.a(((ru.yandex.taxi.vendor_api.google.object_detection.a) obj2).a);
            case 26:
                return new Pair((IllegalArgumentException) obj2, "Animation execution failed");
            case 27:
                return ((com.yandex.go.places.organization.card.impl.ui.card.flex.actions.goal_tracking_link.a) obj2).a;
            case 28:
                return ((ru.yandex.taxi.locationsdk.locationprovider.android.gms.a) obj2).a();
            default:
                lrp0 lrp0Var = lrp0.w;
                tv4 tv4Var = new tv4();
                List<String> supportedQrFormats = ((YbSupportedQrFormatsSchema) ((com.ybsdk.rconfig.b) ((yxf0) ((kwt) obj2).b).a).d(sx51.a).getData()).getSupportedQrFormats();
                ArrayList arrayList = new ArrayList();
                for (String str : supportedQrFormats) {
                    Iterator<E> it = QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat.getEntries().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (cvu0.t(((QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat) obj).name(), str, true)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat qrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat = (QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat) obj;
                    if (qrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat == null) {
                        x4c.g("Unexpected qr format provided", null, str, Collections.singletonList(lrp0Var), 2);
                        qrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat = null;
                    }
                    if (qrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat != null) {
                        arrayList.add(qrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int i3 = jwt.a[((QrScannerPreviewDependencies$QrScannerConfig$QrCodeFormat) it2.next()).ordinal()];
                    if (i3 == 1) {
                        i = 256;
                    } else if (i3 == 2) {
                        i = 4096;
                    } else if (i3 == 3) {
                        i = 16;
                    } else {
                        if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        i = 2048;
                    }
                    arrayList2.add(Integer.valueOf(i));
                }
                if (!arrayList2.isEmpty()) {
                    int intValue = ((Number) kotlin.collections.a.P(arrayList2)).intValue();
                    int[] I0 = kotlin.collections.a.I0(kotlin.collections.a.J(arrayList2, 1));
                    tv4Var.a(intValue, Arrays.copyOf(I0, I0.length));
                }
                tv4Var.b = true;
                try {
                    return r4b1.a(new uv4(tv4Var.a, z2));
                } catch (Throwable th) {
                    x4c.g("exception when creating barcode scanner", th, null, Collections.singletonList(lrp0Var), 4);
                    return null;
                }
        }
    }

    public /* synthetic */ dnr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
