package com.yandex.go.address.models;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.a5o;
import defpackage.ahc0;
import defpackage.bgq0;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.hyd;
import defpackage.il0;
import defpackage.jl40;
import defpackage.p0t;
import defpackage.r0t;
import defpackage.tb90;
import defpackage.ygc0;
import defpackage.yu21;
import defpackage.zgc0;
import defpackage.zzs;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.SuggestResult$SuggestAction;

@gsq0(with = ahc0.class)
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0017\u0018\u0000 \u0080\u00012\u00020\u0001:\u0004\u0081\u0001\u0082\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR(\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\nR$\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR4\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR4\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00182\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0006\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b'\u0010\nR\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u0006\u001a\u0004\u0018\u00010/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R(\u00105\u001a\u0004\u0018\u0001042\b\u0010\u0006\u001a\u0004\u0018\u0001048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R(\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0006\u001a\u0004\u0018\u0001098\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R.\u0010B\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020@ A*\n\u0012\u0004\u0012\u00020@\u0018\u00010?0?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR.\u0010E\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020D A*\n\u0012\u0004\u0012\u00020D\u0018\u00010?0?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR(\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\u0006\u001a\u0004\u0018\u00010F8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR(\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u0006\u001a\u0004\u0018\u00010K8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR(\u0010P\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010\b\u001a\u0004\bQ\u0010\nR$\u0010S\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020R8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR(\u0010X\u001a\u0004\u0018\u00010W2\b\u0010\u0006\u001a\u0004\u0018\u00010W8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R(\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010\u0006\u001a\u0004\u0018\u00010\\8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R(\u0010b\u001a\u0004\u0018\u00010a2\b\u0010\u0006\u001a\u0004\u0018\u00010a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR(\u0010f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bf\u0010\b\u001a\u0004\bg\u0010\nR(\u0010i\u001a\u0004\u0018\u00010h2\b\u0010\u0006\u001a\u0004\u0018\u00010h8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR(\u0010n\u001a\u0004\u0018\u00010m2\b\u0010\u0006\u001a\u0004\u0018\u00010m8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010\bR$\u0010t\u001a\u0004\u0018\u00010s8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR$\u0010z\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lcom/yandex/go/address/models/PlainAddress;", "Lcom/yandex/go/address/models/Address;", "Lcom/yandex/go/address/dto/AddressDTO;", "address", "Lcom/yandex/go/address/dto/AddressDTO;", "", "value", "zoneName", "Ljava/lang/String;", "R0", "()Ljava/lang/String;", "pickMethod", "c1", "", "pickPosition", CA20Status.STATUS_USER_I, "a1", "()I", "pickAction", "o", MetaDataField.SCREEN_FIELD, "getScreen", "name", "getName", "", "Lhyd;", "conditionalActions", "Ljava/util/List;", "w0", "()Ljava/util/List;", "Lru/yandex/taxi/common_models/net/map_object/z;", "immediateActions", "o1", "Lru/yandex/taxi/persuggest/api/finalsuggest/Action;", "finalSuggestAction", "Lru/yandex/taxi/persuggest/api/finalsuggest/Action;", "K1", "()Lru/yandex/taxi/persuggest/api/finalsuggest/Action;", "largeImageTag", "r1", "Lru/yandex/taxi/common_models/net/FormattedText;", "attributedSubtitle", "Lru/yandex/taxi/common_models/net/FormattedText;", "l2", "()Lru/yandex/taxi/common_models/net/FormattedText;", "setAttributedSubtitle", "(Lru/yandex/taxi/common_models/net/FormattedText;)V", "Lcom/yandex/go/address/models/PlaceType;", "placeType", "Lcom/yandex/go/address/models/PlaceType;", "F0", "()Lcom/yandex/go/address/models/PlaceType;", "Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "datumType", "Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "P0", "()Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "", "requestTime", "Ljava/lang/Long;", "T", "()Ljava/lang/Long;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lp0t;", "kotlin.jvm.PlatformType", "_requestIds", "Ljava/util/concurrent/atomic/AtomicReference;", "Lr0t;", "_responseIds", "Lru/yandex/taxi/persuggest/domain/model/SuggestResult$SuggestAction;", "suggestAction", "Lru/yandex/taxi/persuggest/domain/model/SuggestResult$SuggestAction;", "S0", "()Lru/yandex/taxi/persuggest/domain/model/SuggestResult$SuggestAction;", "Lzzs;", "originPoint", "Lzzs;", "f2", "()Lzzs;", "favoriteId", "z1", "", "isFavorite", "Z", "u1", "()Z", "Lru/yandex/taxi/persuggest/api/finalsuggest/PositionInitAction;", "positionInitAction", "Lru/yandex/taxi/persuggest/api/finalsuggest/PositionInitAction;", "T1", "()Lru/yandex/taxi/persuggest/api/finalsuggest/PositionInitAction;", "Lru/yandex/taxi/persuggest/api/GeoPointAcquisitionType;", "geoPointAcquisitionType", "Lru/yandex/taxi/persuggest/api/GeoPointAcquisitionType;", "v1", "()Lru/yandex/taxi/persuggest/api/GeoPointAcquisitionType;", "Lcom/yandex/go/analytics/e;", "analyticsData", "Lcom/yandex/go/analytics/e;", "e", "()Lcom/yandex/go/analytics/e;", "currentMode", "G1", "Ltb90;", "panoramaData", "Ltb90;", "i2", "()Ltb90;", "La5o;", WebViewActivity.KEY_ENVIRONMENT, "La5o;", "getEnvironment", "()La5o;", "changedPorchNumber", "", "extraData", "Ljava/lang/Object;", "g2", "()Ljava/lang/Object;", "b2", "(Ljava/lang/Object;)V", "groupId", "Ljava/lang/Integer;", "getGroupId", "()Ljava/lang/Integer;", "setGroupId", "(Ljava/lang/Integer;)V", "Companion", "ahc0", "zgc0", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class PlainAddress implements Address {
    public static final zgc0 Companion = new zgc0();
    public static final PlainAddress a = zgc0.a(new zzs(0.0d, 0.0d, 0, null, null, 28));
    private final AtomicReference<Set<p0t>> _requestIds;
    private final AtomicReference<Set<r0t>> _responseIds;
    private final AddressDTO address;
    private com.yandex.go.analytics.e analyticsData;
    private FormattedText attributedSubtitle;
    private String changedPorchNumber;
    private List<hyd> conditionalActions;
    private String currentMode;
    private FavoriteAddressDatumType datumType;
    private a5o environment;
    private Object extraData;
    private String favoriteId;
    private Action finalSuggestAction;
    private volatile GeoPointAcquisitionType geoPointAcquisitionType;
    private Integer groupId;
    private List<? extends z> immediateActions;
    private boolean isFavorite;
    private String largeImageTag;
    private String name;
    private volatile zzs originPoint;
    private tb90 panoramaData;
    private String pickAction;
    private String pickMethod;
    private int pickPosition;
    private PlaceType placeType;
    private PositionInitAction positionInitAction;
    private volatile Long requestTime;
    private String screen;
    private SuggestResult$SuggestAction suggestAction;
    private String zoneName;

    public PlainAddress(Address address, AddressDTO addressDTO) {
        this.pickPosition = -1;
        this.name = "";
        this.attributedSubtitle = FormattedText.c;
        EmptySet emptySet = EmptySet.a;
        AtomicReference<Set<p0t>> atomicReference = new AtomicReference<>(emptySet);
        this._requestIds = atomicReference;
        AtomicReference<Set<r0t>> atomicReference2 = new AtomicReference<>(emptySet);
        this._responseIds = atomicReference2;
        this.address = addressDTO;
        this.largeImageTag = address.getLargeImageTag();
        this.attributedSubtitle = addressDTO.B;
        this.zoneName = address.getZoneName();
        this.pickMethod = address.getPickMethod();
        this.pickPosition = address.getPickPosition();
        this.pickAction = address.getPickAction();
        this.screen = address.getScreen();
        this.analyticsData = address.getAnalyticsData();
        this.changedPorchNumber = addressDTO.c;
        this.extraData = address.getExtraData();
        this.groupId = addressDTO.w;
        this.requestTime = address.getRequestTime();
        this.isFavorite = address.getIsFavorite();
        this.favoriteId = address.getFavoriteId();
        this.panoramaData = address.getPanoramaData();
        atomicReference.set(address.x0());
        atomicReference2.set(address.a0());
    }

    @Override // com.yandex.go.address.models.Address
    public final boolean A0() {
        return this.address.z;
    }

    @Override // com.yandex.go.address.models.Address
    public final zzs B() {
        return this.address.a;
    }

    @Override // com.yandex.go.address.models.Address
    public final yu21 D0() {
        return this.address.C;
    }

    @Override // com.yandex.go.address.models.Address
    public final String D1() {
        return this.address.f;
    }

    @Override // com.yandex.go.address.models.Address
    public final il0 E1() {
        return this.address.D;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: F0, reason: from getter */
    public final PlaceType getPlaceType() {
        return this.placeType;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress G(GeoPointAcquisitionType geoPointAcquisitionType) {
        this.geoPointAcquisitionType = geoPointAcquisitionType;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: G1, reason: from getter */
    public final String getCurrentMode() {
        return this.currentMode;
    }

    @Override // com.yandex.go.address.models.Address
    public final String H1() {
        return this.address.r;
    }

    @Override // com.yandex.go.address.models.Address
    public final String J1() {
        String str = this.changedPorchNumber;
        return str != null ? str : this.address.c;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: K1, reason: from getter */
    public final Action getFinalSuggestAction() {
        return this.finalSuggestAction;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress L1(String str) {
        this.pickAction = str;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress M1(PlaceType placeType) {
        this.placeType = placeType;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress O1(com.yandex.go.analytics.e eVar) {
        this.analyticsData = eVar;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress P(String str) {
        this.pickMethod = str;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: P0, reason: from getter */
    public final FavoriteAddressDatumType getDatumType() {
        return this.datumType;
    }

    @Override // com.yandex.go.address.models.Address
    public final List P1() {
        return this.address.E;
    }

    @Override // com.yandex.go.address.models.Address
    public final String R() {
        AddressDTO addressDTO = this.address;
        String str = addressDTO.m;
        if (str != null) {
            return str;
        }
        String h = addressDTO.h();
        return h == null ? "" : h;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: R0, reason: from getter */
    public final String getZoneName() {
        return this.zoneName;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: S0, reason: from getter */
    public final SuggestResult$SuggestAction getSuggestAction() {
        return this.suggestAction;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: T, reason: from getter */
    public final Long getRequestTime() {
        return this.requestTime;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: T1, reason: from getter */
    public final PositionInitAction getPositionInitAction() {
        return this.positionInitAction;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress U(int i) {
        this.pickPosition = i;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress V1(FavoriteAddressDatumType favoriteAddressDatumType) {
        this.datumType = favoriteAddressDatumType;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress W(tb90 tb90Var) {
        this.panoramaData = tb90Var;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final List W0() {
        return this.address.F;
    }

    @Override // com.yandex.go.address.models.Address
    public final boolean X1() {
        return evu0.J(this.address.e);
    }

    @Override // com.yandex.go.address.models.Address
    public final boolean Z() {
        return this.address.o;
    }

    public final PlainAddress a(Set set) {
        this._requestIds.updateAndGet(new ygc0(0, set));
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final Set a0() {
        return this._responseIds.get();
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: a1, reason: from getter */
    public final int getPickPosition() {
        return this.pickPosition;
    }

    public final PlainAddress b(Set set) {
        this._responseIds.updateAndGet(new ygc0(1, set));
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final String b1() {
        return this.address.h;
    }

    @Override // com.yandex.go.address.models.Address
    public final void b2(Object obj) {
        this.extraData = obj;
    }

    public final PlainAddress c(List list) {
        this.conditionalActions = list;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: c1, reason: from getter */
    public final String getPickMethod() {
        return this.pickMethod;
    }

    @Override // com.yandex.go.address.models.Address
    public final String c2() {
        return this.address.m;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress copy() {
        return new PlainAddress(this, this.address);
    }

    @Override // com.yandex.go.address.models.Address
    public final String d() {
        return this.address.e;
    }

    @Override // com.yandex.go.address.models.Address
    public final bgq0 d1() {
        return this.address.u;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: e, reason: from getter */
    public final com.yandex.go.analytics.e getAnalyticsData() {
        return this.analyticsData;
    }

    @Override // com.yandex.go.address.models.Address
    public final String e0() {
        return this.address.s;
    }

    @Override // com.yandex.go.address.models.Address
    public final String e2() {
        return this.address.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Address)) {
            return jl40.l(this.address, ((Address) obj).getAddress());
        }
        return false;
    }

    public final PlainAddress f(String str) {
        this.currentMode = str;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final boolean f0() {
        return this.address.D != il0.b;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: f2, reason: from getter */
    public final zzs getOriginPoint() {
        return this.originPoint;
    }

    public final PlainAddress g(a5o a5oVar) {
        this.environment = a5oVar;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final GeoObjectType g0() {
        return this.address.i;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: g2, reason: from getter */
    public final Object getExtraData() {
        return this.extraData;
    }

    @Override // com.yandex.go.address.models.Address
    public final a5o getEnvironment() {
        return this.environment;
    }

    @Override // com.yandex.go.address.models.Address
    public final Integer getGroupId() {
        return this.groupId;
    }

    @Override // com.yandex.go.address.models.Address
    public final String getName() {
        return this.name;
    }

    @Override // com.yandex.go.address.models.Address
    public final String getScreen() {
        return this.screen;
    }

    @Override // com.yandex.go.address.models.Address
    public final String getUri() {
        return this.address.h();
    }

    public final PlainAddress h(Action action) {
        this.finalSuggestAction = action;
        return this;
    }

    public final int hashCode() {
        return this.address.hashCode();
    }

    public final PlainAddress i(List list) {
        this.immediateActions = list;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: i2, reason: from getter */
    public final tb90 getPanoramaData() {
        return this.panoramaData;
    }

    public final PlainAddress j(String str) {
        this.name = str;
        return this;
    }

    public final PlainAddress k(zzs zzsVar) {
        this.originPoint = zzsVar;
        return this;
    }

    public final PlainAddress l(PositionInitAction positionInitAction) {
        this.positionInitAction = positionInitAction;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: l2, reason: from getter */
    public final FormattedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    public final void m(SuggestResult$SuggestAction suggestResult$SuggestAction) {
        this.suggestAction = suggestResult$SuggestAction;
    }

    public final PlainAddress n(yu21 yu21Var) {
        this.address.C = yu21Var;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final String n0() {
        return this.address.t;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: o, reason: from getter */
    public final String getPickAction() {
        return this.pickAction;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: o1, reason: from getter */
    public final List getImmediateActions() {
        return this.immediateActions;
    }

    public final PlainAddress p(String str) {
        this.zoneName = str;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final String q0() {
        return this.address.b;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: q1, reason: from getter */
    public final AddressDTO getAddress() {
        return this.address;
    }

    @Override // com.yandex.go.address.models.Address
    public final String q2() {
        return this.address.j;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: r1, reason: from getter */
    public final String getLargeImageTag() {
        return this.largeImageTag;
    }

    @Override // com.yandex.go.address.models.Address
    public final String s1() {
        return this.address.d;
    }

    public final String toString() {
        return this.address.e;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: u1, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Override // com.yandex.go.address.models.Address
    public final void v0(String str) {
        this.changedPorchNumber = str;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: v1, reason: from getter */
    public final GeoPointAcquisitionType getGeoPointAcquisitionType() {
        return this.geoPointAcquisitionType;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: w0, reason: from getter */
    public final List getConditionalActions() {
        return this.conditionalActions;
    }

    @Override // com.yandex.go.address.models.Address
    public final Set x0() {
        return this._requestIds.get();
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress y1(Long l) {
        this.requestTime = l;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    public final PlainAddress z0(String str) {
        this.screen = str;
        return this;
    }

    @Override // com.yandex.go.address.models.Address
    /* renamed from: z1, reason: from getter */
    public final String getFavoriteId() {
        return this.favoriteId;
    }

    public PlainAddress(AddressDTO addressDTO, String str, PlaceType placeType, FavoriteAddressDatumType favoriteAddressDatumType) {
        this.pickPosition = -1;
        this.name = "";
        this.attributedSubtitle = FormattedText.c;
        EmptySet emptySet = EmptySet.a;
        this._requestIds = new AtomicReference<>(emptySet);
        this._responseIds = new AtomicReference<>(emptySet);
        this.address = addressDTO;
        this.placeType = placeType;
        this.isFavorite = true;
        this.datumType = favoriteAddressDatumType;
        this.largeImageTag = addressDTO.A;
        this.attributedSubtitle = addressDTO.B;
        this.groupId = addressDTO.w;
        this.favoriteId = str;
    }

    public PlainAddress(Address address) {
        this(address, address.getAddress());
    }

    public PlainAddress(AddressDTO addressDTO) {
        this.pickPosition = -1;
        this.name = "";
        this.attributedSubtitle = FormattedText.c;
        EmptySet emptySet = EmptySet.a;
        this._requestIds = new AtomicReference<>(emptySet);
        this._responseIds = new AtomicReference<>(emptySet);
        this.address = addressDTO;
        this.largeImageTag = addressDTO.A;
        this.attributedSubtitle = addressDTO.B;
        this.groupId = addressDTO.w;
    }
}
