package com.yandex.go.address.models;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.suggest.DestinationSuggest;
import defpackage.a5o;
import defpackage.bgq0;
import defpackage.gsq0;
import defpackage.il0;
import defpackage.lo0;
import defpackage.mo0;
import defpackage.tb90;
import defpackage.yu21;
import defpackage.zzs;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.SuggestResult$SuggestAction;

@gsq0(with = mo0.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/yandex/go/address/models/Address;", "Lcom/yandex/go/suggest/DestinationSuggest;", "Companion", "mo0", "lo0", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Address extends DestinationSuggest {
    public static final lo0 Companion = lo0.a;

    boolean A0();

    zzs B();

    yu21 D0();

    String D1();

    il0 E1();

    /* renamed from: F0 */
    PlaceType getPlaceType();

    PlainAddress G(GeoPointAcquisitionType geoPointAcquisitionType);

    /* renamed from: G1 */
    String getCurrentMode();

    String H1();

    String J1();

    /* renamed from: K1 */
    Action getFinalSuggestAction();

    PlainAddress L1(String str);

    PlainAddress M1(PlaceType placeType);

    PlainAddress O1(com.yandex.go.analytics.e eVar);

    PlainAddress P(String str);

    /* renamed from: P0 */
    FavoriteAddressDatumType getDatumType();

    List P1();

    String R();

    /* renamed from: R0 */
    String getZoneName();

    /* renamed from: S0 */
    SuggestResult$SuggestAction getSuggestAction();

    /* renamed from: T */
    Long getRequestTime();

    /* renamed from: T1 */
    PositionInitAction getPositionInitAction();

    PlainAddress U(int i);

    PlainAddress V1(FavoriteAddressDatumType favoriteAddressDatumType);

    PlainAddress W(tb90 tb90Var);

    List W0();

    boolean X1();

    boolean Z();

    Set a0();

    /* renamed from: a1 */
    int getPickPosition();

    String b1();

    void b2(Object obj);

    /* renamed from: c1 */
    String getPickMethod();

    String c2();

    PlainAddress copy();

    String d();

    bgq0 d1();

    /* renamed from: e */
    com.yandex.go.analytics.e getAnalyticsData();

    String e0();

    String e2();

    boolean f0();

    /* renamed from: f2 */
    zzs getOriginPoint();

    GeoObjectType g0();

    /* renamed from: g2 */
    Object getExtraData();

    a5o getEnvironment();

    Integer getGroupId();

    String getName();

    String getScreen();

    String getUri();

    /* renamed from: i2 */
    tb90 getPanoramaData();

    /* renamed from: l2 */
    FormattedText getAttributedSubtitle();

    String n0();

    /* renamed from: o */
    String getPickAction();

    /* renamed from: o1 */
    List getImmediateActions();

    String q0();

    /* renamed from: q1 */
    AddressDTO getAddress();

    String q2();

    /* renamed from: r1 */
    String getLargeImageTag();

    String s1();

    /* renamed from: u1 */
    boolean getIsFavorite();

    void v0(String str);

    /* renamed from: v1 */
    GeoPointAcquisitionType getGeoPointAcquisitionType();

    /* renamed from: w0 */
    List getConditionalActions();

    Set x0();

    PlainAddress y1(Long l);

    PlainAddress z0(String str);

    /* renamed from: z1 */
    String getFavoriteId();
}
