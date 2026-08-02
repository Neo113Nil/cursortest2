package com.yandex.go.address_confirmation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.zone.repository.o;
import defpackage.a3v;
import defpackage.a41;
import defpackage.a9y0;
import defpackage.ab20;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.ay0;
import defpackage.b1c0;
import defpackage.c0g;
import defpackage.c9y0;
import defpackage.e0g;
import defpackage.el00;
import defpackage.et00;
import defpackage.f1c0;
import defpackage.f7r;
import defpackage.fbt0;
import defpackage.fu00;
import defpackage.hpr0;
import defpackage.i8y0;
import defpackage.iqz0;
import defpackage.iv70;
import defpackage.kr0;
import defpackage.kv70;
import defpackage.l56;
import defpackage.leh;
import defpackage.lr00;
import defpackage.lx4;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.opz0;
import defpackage.p2c0;
import defpackage.po21;
import defpackage.qq60;
import defpackage.r0c0;
import defpackage.rjt0;
import defpackage.rqo;
import defpackage.s6v;
import defpackage.sgu0;
import defpackage.sls;
import defpackage.t31;
import defpackage.tt2;
import defpackage.tx0;
import defpackage.udh0;
import defpackage.uo21;
import defpackage.uze0;
import defpackage.v7j0;
import defpackage.vtb0;
import defpackage.w6r;
import defpackage.wiq0;
import defpackage.x31;
import defpackage.xi00;
import defpackage.y50;
import defpackage.ysd0;
import defpackage.zuj0;
import defpackage.zzf;
import kotlin.Metadata;
import ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0016H\u0014¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010)\u001a\u00020\u0016H\u0014¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0016H\u0014¢\u0006\u0004\b0\u0010\u0018J\u000f\u00101\u001a\u00020\u0016H\u0014¢\u0006\u0004\b1\u0010\u0018R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u00109\u001a\u0004\b:\u0010'\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010q\u001a\u00020n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lcom/yandex/go/address_confirmation/SourceAddressConfirmationMapFragment;", "Lru/yandex/taxi/fragment/preorder/AbstractAddressMapPickerFragment;", "Le0g;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "isShowTopEndButtons", "()Z", "onMyLocationClick", "onResume", "onPause", "onDestroyView", "onMapDragged", "Lb1c0;", "setupPinV2DataRepository", "()Lb1c0;", "La41;", "uiState", "renderUiState", "(La41;)V", "Ll56;", "blockedZonesHandler", "()Ll56;", "blockedZonesAlertsEnabled", "hasPickupPointsOnMap", "Lru/yandex/taxi/search/address/view/PointType;", "addressPointType", "()Lru/yandex/taxi/search/address/view/PointType;", "Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "pointType", "()Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "shouldCacheAddressByLocationTap", "needUpdatePositionOnResume", "Luo21;", "userLocationOverlay", "Luo21;", "getUserLocationOverlay", "()Luo21;", "setUserLocationOverlay", "(Luo21;)V", "Ll56;", "getBlockedZonesHandler", "setBlockedZonesHandler", "(Ll56;)V", "Lfbt0;", "sourceAddressConfirmationRouteOverlay", "Lfbt0;", "getSourceAddressConfirmationRouteOverlay", "()Lfbt0;", "setSourceAddressConfirmationRouteOverlay", "(Lfbt0;)V", "Luze0;", "priceLoadingStateHolder", "Luze0;", "getPriceLoadingStateHolder", "()Luze0;", "setPriceLoadingStateHolder", "(Luze0;)V", "Lwiq0;", "selectTariffHolder", "Lwiq0;", "getSelectTariffHolder", "()Lwiq0;", "setSelectTariffHolder", "(Lwiq0;)V", "Liv70;", "featuresInteractor", "Liv70;", "getFeaturesInteractor", "()Liv70;", "setFeaturesInteractor", "(Liv70;)V", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lru/yandex/taxi/widget/utils/e;", "getMediaInfoConverter", "()Lru/yandex/taxi/widget/utils/e;", "setMediaInfoConverter", "(Lru/yandex/taxi/widget/utils/e;)V", "Lf1c0;", "experimentRepository", "Lf1c0;", "getExperimentRepository", "()Lf1c0;", "setExperimentRepository", "(Lf1c0;)V", "Lkotlin/Function0;", "onMapDraggedListener", "Lsls;", "getOnMapDraggedListener", "()Lsls;", "setOnMapDraggedListener", "(Lsls;)V", "Lcom/yandex/go/navigation/screen/api/Screen;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SourceAddressConfirmationMapFragment extends AbstractAddressMapPickerFragment<e0g> {
    public l56 blockedZonesHandler;
    public f1c0 experimentRepository;
    public iv70 featuresInteractor;
    public ru.yandex.taxi.widget.utils.e mediaInfoConverter;
    private sls onMapDraggedListener;
    public uze0 priceLoadingStateHolder;
    public wiq0 selectTariffHolder;
    public fbt0 sourceAddressConfirmationRouteOverlay;
    public uo21 userLocationOverlay;

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public PointType addressPointType() {
        return PointType.SOURCE;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean blockedZonesAlertsEnabled() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public l56 blockedZonesHandler() {
        return getBlockedZonesHandler();
    }

    public final l56 getBlockedZonesHandler() {
        l56 l56Var = this.blockedZonesHandler;
        if (l56Var != null) {
            return l56Var;
        }
        return null;
    }

    public final f1c0 getExperimentRepository() {
        f1c0 f1c0Var = this.experimentRepository;
        if (f1c0Var != null) {
            return f1c0Var;
        }
        return null;
    }

    public final iv70 getFeaturesInteractor() {
        iv70 iv70Var = this.featuresInteractor;
        if (iv70Var != null) {
            return iv70Var;
        }
        return null;
    }

    public final ru.yandex.taxi.widget.utils.e getMediaInfoConverter() {
        ru.yandex.taxi.widget.utils.e eVar = this.mediaInfoConverter;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    public final sls getOnMapDraggedListener() {
        return this.onMapDraggedListener;
    }

    public final uze0 getPriceLoadingStateHolder() {
        uze0 uze0Var = this.priceLoadingStateHolder;
        if (uze0Var != null) {
            return uze0Var;
        }
        return null;
    }

    public final wiq0 getSelectTariffHolder() {
        wiq0 wiq0Var = this.selectTariffHolder;
        if (wiq0Var != null) {
            return wiq0Var;
        }
        return null;
    }

    public final fbt0 getSourceAddressConfirmationRouteOverlay() {
        fbt0 fbt0Var = this.sourceAddressConfirmationRouteOverlay;
        if (fbt0Var != null) {
            return fbt0Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment, defpackage.ihf
    /* renamed from: getTrackedScreen */
    public Screen getScreen() {
        return Screen.ADDRESS_CONFIRMATION;
    }

    public final uo21 getUserLocationOverlay() {
        uo21 uo21Var = this.userLocationOverlay;
        if (uo21Var != null) {
            return uo21Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean hasPickupPointsOnMap() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isShowTopEndButtons() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean needUpdatePositionOnResume() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        setPickupFromPhotoAllowed(false);
        e0g e0gVar = (e0g) injector();
        zzf zzfVar = e0gVar.b;
        this.receiverProvider = zzfVar.Yp;
        c0g c0gVar = e0gVar.c;
        setPin((com.yandex.go.pin.api.a) c0gVar.Ub.get());
        setAnalyticsManager((lx4) zzfVar.Y.get());
        setUserLocationInteractor((po21) zzfVar.Y1.get());
        setMapController((ah00) c0gVar.Vb.get());
        setActivityRouter((y50) c0gVar.n0.get());
        setPositionAlertRouterFactory(c0gVar.cp);
        setZoomRepository((fu00) c0gVar.ap.get());
        setObserverForCurrentTariff((qq60) zzfVar.gr.get());
        setPickupPointsControllerFactory((t31) e0gVar.g.a);
        setAppDispatchers((tt2) zzfVar.n.get());
        setPinStyleProvider(c0gVar.T5());
        setPointAddressDecoder((atd0) c0gVar.Ac.get());
        setFocusCoordinator((a3v) c0gVar.Wb.get());
        setMetricaActionInteractor(e0gVar.g());
        setMetricaActionStateHolder((ab20) zzfVar.hr.get());
        setRequestPermissionInteractor((v7j0) c0gVar.L0.get());
        setPinAlertAnimationInteractor((vtb0) c0gVar.Bn.get());
        setIdleIconRepository(new s6v());
        setPinStyleMapper(c0gVar.G2());
        setAddressClarificationInteractor((kr0) c0gVar.Ec.get());
        setMassTransitStopsInteractor(c0gVar.z5());
        setResourcesProxy((zuj0) zzfVar.W.get());
        setTaxiPanoramaInteractor(c0gVar.Y());
        setTaxiPanoramaLogger(new i8y0());
        setTaxiPanoramaExperimentRepository(c0gVar.a3());
        setFinalSuggestScreenRepository((w6r) c0gVar.vc.get());
        setTaxiPanoramaTooltipRepository((c9y0) c0gVar.so.get());
        setTaxiPanoramaRouter((a9y0) c0gVar.Ko.get());
        setScreenStackNavigator((oep0) c0gVar.T.get());
        setSharedPinDataHolder((hpr0) c0gVar.Tb.get());
        setMapHost((xi00) c0gVar.Rb.get());
        setAddressMapInteractor(e0gVar.a());
        setPinWithStanExperimentRepository((p2c0) zzfVar.ar.get());
        setDebouncingMapListenerDelegate(e0gVar.d());
        setBlockedZoneControllerFactory((ay0) e0gVar.i.a);
        setAddressMapFragmentAddressControllerFactory((tx0) e0gVar.j.a);
        setPointActionRouterConsumer((ysd0) c0gVar.wd.get());
        setFinalizeAddressByGravityRouterFactory((f7r) c0gVar.Nv.a);
        setAddressMapPresenterFactory((x31) e0gVar.k.a);
        this.userLocationOverlay = c0gVar.D6();
        this.blockedZonesHandler = c0gVar.A1();
        this.sourceAddressConfirmationRouteOverlay = new fbt0(zzfVar.A1(), (Context) c0gVar.U.get(), (ah00) c0gVar.Vb.get(), (tt2) zzfVar.n.get(), c0gVar.Z5(), (leh) zzfVar.um.get(), e0gVar.a, (o) zzfVar.q2.get(), (el00) zzfVar.Dc.get(), (sgu0) c0gVar.lh.get(), zzfVar.W0(), (et00) c0gVar.ph.get(), (lr00) c0gVar.oh.get(), (rqo) zzfVar.C.get(), (opz0) zzfVar.Lb.get(), (iqz0) c0gVar.Ru.get(), (rjt0) zzfVar.Ch.get());
        this.priceLoadingStateHolder = (uze0) zzfVar.B2.get();
        this.selectTariffHolder = (wiq0) zzfVar.B2.get();
        this.featuresInteractor = new kv70();
        this.mediaInfoConverter = (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get();
        this.experimentRepository = (f1c0) zzfVar.Rk.get();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        onCreateView.findViewById(udh0.bottom_buttons_layout).setVisibility(8);
        return onCreateView;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.onMapDraggedListener = null;
        getUserLocationOverlay().detach();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, defpackage.qt00
    public void onMapDragged() {
        super.onMapDragged();
        sls slsVar = this.onMapDraggedListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public void onMyLocationClick() {
        onLocationClick(true);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getSourceAddressConfirmationRouteOverlay().detach();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getSourceAddressConfirmationRouteOverlay().attach();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hideControls();
        getUserLocationOverlay().attach();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public RoutePointType pointType() {
        return RoutePointType.POINT_A;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment, ru.yandex.taxi.fragment.preorder.AddressMapFragment, defpackage.iy0
    public void renderUiState(a41 uiState) {
    }

    public final void setBlockedZonesHandler(l56 l56Var) {
        this.blockedZonesHandler = l56Var;
    }

    public final void setExperimentRepository(f1c0 f1c0Var) {
        this.experimentRepository = f1c0Var;
    }

    public final void setFeaturesInteractor(iv70 iv70Var) {
        this.featuresInteractor = iv70Var;
    }

    public final void setMediaInfoConverter(ru.yandex.taxi.widget.utils.e eVar) {
        this.mediaInfoConverter = eVar;
    }

    public final void setOnMapDraggedListener(sls slsVar) {
        this.onMapDraggedListener = slsVar;
    }

    public final void setPriceLoadingStateHolder(uze0 uze0Var) {
        this.priceLoadingStateHolder = uze0Var;
    }

    public final void setSelectTariffHolder(wiq0 wiq0Var) {
        this.selectTariffHolder = wiq0Var;
    }

    public final void setSourceAddressConfirmationRouteOverlay(fbt0 fbt0Var) {
        this.sourceAddressConfirmationRouteOverlay = fbt0Var;
    }

    public final void setUserLocationOverlay(uo21 uo21Var) {
        this.userLocationOverlay = uo21Var;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public b1c0 setupPinV2DataRepository() {
        PointType addressPointType = addressPointType();
        iv70 featuresInteractor = getFeaturesInteractor();
        ru.yandex.taxi.widget.utils.e mediaInfoConverter = getMediaInfoConverter();
        wiq0 selectTariffHolder = getSelectTariffHolder();
        f1c0 experimentRepository = getExperimentRepository();
        r0c0 pinStyleMapper = getPinStyleMapper();
        if (pinStyleMapper != null) {
            return new e(addressPointType, pinStyleMapper, mediaInfoConverter, selectTariffHolder, experimentRepository, featuresInteractor, getPriceLoadingStateHolder(), getAddressResolveRepository(), getPinAlertAnimationInteractor(), getPinWithStanExperimentRepository());
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean shouldCacheAddressByLocationTap() {
        return true;
    }
}
