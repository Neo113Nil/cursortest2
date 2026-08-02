package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.nfc.tech.MifareClassic;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.AuthenticateSectorReadingException;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.AuthenticateSectorWritingException;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.CompareDataException;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.DetectedTypeReadingException;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.DetectedTypeWritingException;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.ReadingException;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.WritingException;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.promocodes.a;
import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.payment.sdk.core.data.GooglePayData;
import com.yandex.payment.sdk.core.data.OrderDetails;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.PfmAnalyticsItemStatePfm;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;
import ru.yandex.taxi.banners.CardBannerV2ModalView;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.banners.d;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final /* synthetic */ class jo0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ jo0(y6f0 y6f0Var, tls tlsVar, eqs eqsVar, nut nutVar, sls slsVar) {
        this.a = 12;
        this.c = tlsVar;
        this.w = eqsVar;
        this.b = nutVar;
        this.x = slsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06f8 A[SYNTHETIC] */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        zy11 onNewLocation$lambda$0;
        boolean z;
        boolean authenticateSectorWithKeyB;
        apf apfVar;
        Object failure;
        String data;
        JSONObject jSONObject;
        noh executeRequest$lambda$0;
        Object obj;
        int i = this.a;
        int i2 = 2;
        int i3 = 5;
        int i4 = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        Object obj3 = this.b;
        Object obj4 = this.w;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((pep0) ((oep0) obj5)).f((m950) ((a) obj4).d.get(), new zn5((String) obj3, (mn5) obj2, "discounts"), hxx.a);
                return zy11Var;
            case 1:
                onNewLocation$lambda$0 = AddressMapFragment.onNewLocation$lambda$0((AddressMapFragment) obj5, (zzs) obj4, (String) obj3, (PositionInitAction) obj2);
                return onNewLocation$lambda$0;
            case 2:
                m3u0 m3u0Var = (m3u0) obj2;
                ((oz40) obj4).setValue(null);
                if (((yx40) obj3).getIntValue() >= ((List) obj5).size()) {
                    ((sls) m3u0Var.getValue()).invoke();
                }
                return zy11Var;
            case 3:
                shs shsVar = (shs) obj5;
                c cVar = (c) obj4;
                kr4 kr4Var = (kr4) obj2;
                vby vbyVar = xby.d;
                String.format("show fullscreen banner %s", Arrays.copyOf(new Object[]{shsVar.b}, 1));
                vbyVar.getClass();
                qu4 qu4Var = (qu4) cVar.c.a;
                iu4 iu4Var = qu4Var.a;
                ComponentActivity componentActivity = qu4Var.b;
                FullScreenBannerModalView fullScreenBannerModalView = new FullScreenBannerModalView(componentActivity, qu4Var.k, qu4Var.l, new ru.yandex.taxi.banners.presentation.fullscreen.a(componentActivity, shsVar, (String) obj3, iu4Var.h, iu4Var.i, iu4Var.g, iu4Var.b(), qu4Var.c, qu4Var.d, qu4Var.e, iu4Var.q, iu4Var.s, kr4Var, iu4Var.t, qu4Var.g, iu4Var.a(), iu4Var.j, iu4Var.y), iu4Var.g, (pav) iu4Var.z.getValue(), iu4Var.k, iu4Var.j, iu4Var.p, iu4Var.r, new js4(1, kr4Var), iu4Var.t, qu4Var.f, iu4Var.a());
                fullScreenBannerModalView.setTag(shsVar.b);
                is4 is4Var = cVar.a;
                ViewGroup viewGroup = is4Var.a;
                Rect rect = xw31.a;
                int childCount = viewGroup.getChildCount();
                float f = 0.0f;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    WeakHashMap weakHashMap = b.a;
                    f = Math.max(f, ViewCompat$Api21Impl.i(childAt));
                }
                WeakHashMap weakHashMap2 = b.a;
                ViewCompat$Api21Impl.r(fullScreenBannerModalView, f + 1.0f);
                ViewGroup viewGroup2 = is4Var.a;
                fullScreenBannerModalView.setOnAppearingListener(new ou4(0, cVar, viewGroup2));
                viewGroup2.addView(fullScreenBannerModalView);
                return zy11Var;
            case 4:
                cb8 cb8Var = (cb8) obj5;
                c cVar2 = (c) obj4;
                vby vbyVar2 = xby.d;
                String.format("show card banner %s", Arrays.copyOf(new Object[]{cb8Var.b}, 1));
                vbyVar2.getClass();
                yvi0 yvi0Var = cVar2.c;
                ViewGroup viewGroup3 = cVar2.a.a;
                qu4 qu4Var2 = (qu4) yvi0Var.a;
                iu4 iu4Var2 = qu4Var2.a;
                CardBannerV2ModalView cardBannerV2ModalView = new CardBannerV2ModalView(qu4Var2.b, new d(cb8Var, (String) obj3, viewGroup3, qu4Var2.c, qu4Var2.d, qu4Var2.b, iu4Var2.b(), iu4Var2.h, iu4Var2.i, iu4Var2.g, iu4Var2.p, (kr4) obj2, iu4Var2.t, qu4Var2.g, qu4Var2.h, qu4Var2.o, qu4Var2.m, qu4Var2.n, qu4Var2.p, iu4Var2.j, iu4Var2.y), (pav) iu4Var2.z.getValue(), iu4Var2.r, iu4Var2.b(), qu4Var2.f, iu4Var2.a());
                cardBannerV2ModalView.setTag(cb8Var.b);
                Rect rect2 = xw31.a;
                int childCount2 = viewGroup3.getChildCount();
                float f2 = 0.0f;
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = viewGroup3.getChildAt(i6);
                    WeakHashMap weakHashMap3 = b.a;
                    f2 = Math.max(f2, ViewCompat$Api21Impl.i(childAt2));
                }
                WeakHashMap weakHashMap4 = b.a;
                ViewCompat$Api21Impl.r(cardBannerV2ModalView, f2 + 1.0f);
                cardBannerV2ModalView.setOnAppearingListener(new ou4(0, cVar2, viewGroup3));
                viewGroup3.addView(cardBannerV2ModalView);
                return zy11Var;
            case 5:
                c06 c06Var = (c06) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                for (ec51 ec51Var : (List) obj5) {
                    MifareClassic mifareClassic = (MifareClassic) c06Var.a;
                    int i7 = ec51Var.a;
                    String str = ec51Var.f;
                    String str2 = ec51Var.h;
                    int blockToSector = mifareClassic.blockToSector(i7);
                    int i8 = i4;
                    int i9 = i8;
                    while (true) {
                        z = r7;
                        if (i8 < i3) {
                            String str3 = ec51Var.j;
                            if (jl40.l(str2, "A")) {
                                i9 = mifareClassic.authenticateSectorWithKeyA(blockToSector, jtb1.e(str3));
                            } else {
                                if (!jl40.l(str2, "B")) {
                                    throw new DetectedTypeWritingException("Failed to detected type of block: ".concat(str2));
                                }
                                i9 = mifareClassic.authenticateSectorWithKeyB(blockToSector, jtb1.e(str3));
                            }
                            if (i9 == false) {
                                i8++;
                                r7 = z;
                                i9 = i9;
                            }
                        }
                    }
                    if (i9 != true) {
                        throw new AuthenticateSectorWritingException(oyr.i(blockToSector, "Failed to authenticate the sector "));
                    }
                    try {
                        mifareClassic.writeBlock(i7, jtb1.e(str));
                        int i10 = 0;
                        boolean z2 = false;
                        while (i10 < i3) {
                            String str4 = ec51Var.c;
                            String str5 = ec51Var.e;
                            if (jl40.l(str4, "A")) {
                                authenticateSectorWithKeyB = mifareClassic.authenticateSectorWithKeyA(blockToSector, jtb1.e(str5));
                            } else {
                                if (!jl40.l(str4, "B")) {
                                    throw new DetectedTypeReadingException(str2);
                                }
                                authenticateSectorWithKeyB = mifareClassic.authenticateSectorWithKeyB(blockToSector, jtb1.e(str5));
                            }
                            z2 = authenticateSectorWithKeyB;
                            if (!z2) {
                                i10++;
                                i3 = 5;
                            } else {
                                if (z2) {
                                    throw new AuthenticateSectorReadingException(oyr.i(blockToSector, "Failed to authenticate the sector: "));
                                }
                                try {
                                    if (!Arrays.equals(mifareClassic.readBlock(i7), jtb1.e(str))) {
                                        throw new CompareDataException();
                                    }
                                    int i11 = ref$IntRef.element;
                                    arrayList.set(i11, qb51.a((qb51) arrayList.get(i11), WriteBlocks.OK));
                                    ref$IntRef.element++;
                                    r7 = z;
                                    i3 = 5;
                                    i4 = 0;
                                } catch (Exception e) {
                                    throw new ReadingException(e.toString());
                                }
                            }
                        }
                        if (z2) {
                        }
                    } catch (Exception e2) {
                        throw new WritingException(e2.toString());
                    }
                }
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) ((z22) c06Var.b)).a(new keo("nfc_write_blocks_success", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешная запись блоков на карту")));
                return zy11Var;
            case 6:
                zw6 zw6Var = (zw6) obj5;
                zw6Var.b.b((Uri) obj4, (xw6) obj3, new tb(i2, zw6Var, (DeeplinkSource) obj2));
                return zy11Var;
            case 7:
                final com.yandex.plus.core.network.impl.a aVar = (com.yandex.plus.core.network.impl.a) obj4;
                final m55 m55Var = (m55) obj3;
                final m55 m55Var2 = (m55) obj2;
                OkHttpClient.a aVar2 = (OkHttpClient.a) ((sls) obj5).invoke();
                aVar2.getClass();
                OkHttpClient.a b = new OkHttpClient(aVar2).b();
                b.d.add(new p8w() { // from class: bh7
                    @Override // defpackage.p8w
                    public final kvj0 intercept(m8w m8wVar) {
                        Object peek = com.yandex.plus.core.network.impl.a.this.b().peek();
                        if (peek == null) {
                            zci0 zci0Var = (zci0) m8wVar;
                            return zci0Var.b(zci0Var.e);
                        }
                        zci0 zci0Var2 = (zci0) m8wVar;
                        m55 m55Var3 = m55Var;
                        int i12 = m55Var3.a;
                        com.yandex.plus.core.network.okhttp.client.d dVar = m55Var3.b;
                        hw60 hw60Var = (hw60) peek;
                        switch (i12) {
                            case 0:
                                List A = j73.A(new uv50[0]);
                                dVar.getClass();
                                return dVar.b(hw60Var.a, kotlin.collections.a.m0(j73.A(new uv50[]{null, com.yandex.plus.core.network.okhttp.client.b.a}), kotlin.collections.a.m0(hw60Var.b, A)), zci0Var2, false);
                            default:
                                return dVar.b(hw60Var.a, hw60Var.c, zci0Var2, true);
                        }
                    }
                });
                b.a(new p8w() { // from class: bh7
                    @Override // defpackage.p8w
                    public final kvj0 intercept(m8w m8wVar) {
                        Object peek = com.yandex.plus.core.network.impl.a.this.b().peek();
                        if (peek == null) {
                            zci0 zci0Var = (zci0) m8wVar;
                            return zci0Var.b(zci0Var.e);
                        }
                        zci0 zci0Var2 = (zci0) m8wVar;
                        m55 m55Var3 = m55Var2;
                        int i12 = m55Var3.a;
                        com.yandex.plus.core.network.okhttp.client.d dVar = m55Var3.b;
                        hw60 hw60Var = (hw60) peek;
                        switch (i12) {
                            case 0:
                                List A = j73.A(new uv50[0]);
                                dVar.getClass();
                                return dVar.b(hw60Var.a, kotlin.collections.a.m0(j73.A(new uv50[]{null, com.yandex.plus.core.network.okhttp.client.b.a}), kotlin.collections.a.m0(hw60Var.b, A)), zci0Var2, false);
                            default:
                                return dVar.b(hw60Var.a, hw60Var.c, zci0Var2, true);
                        }
                    }
                });
                return new OkHttpClient(b);
            case 8:
                qhu0 qhu0Var = new qhu0(0);
                return new ss9((Context) obj4, (w030) obj3, qhu0Var, new jhu0(qhu0Var), (w310) obj2, new f6(new a22((zuj0) ((fjb) obj5).a.m), qhu0Var));
            case 9:
                r5i r5iVar = (r5i) obj5;
                q5i q5iVar = (q5i) obj3;
                tli0 tli0Var = (tli0) obj2;
                ArrayList a = ((d4i) r5iVar.S.get()).a((dhg) obj4);
                Address a2 = r5iVar.U.a();
                if (a2 != null) {
                    q5iVar.getClass();
                    zzs B = a2.B();
                    String c2 = a2.c2();
                    String str6 = c2 == null ? "" : c2;
                    String uri = a2.getUri();
                    String str7 = uri == null ? "" : uri;
                    il0 E1 = a2.E1();
                    E1.getClass();
                    apfVar = new apf(B, str6, str7, !(E1 == il0.b) ? a2 : null, 16);
                } else {
                    apfVar = null;
                }
                ((ru.yandex.taxi.logistics.common.a) r5iVar.R).c(new tli0(tli0Var.a, tli0Var.b, tli0Var.c, tli0Var.d, tli0Var.e, apfVar, tli0Var.g, tli0Var.h), a);
                return zy11Var;
            case 10:
                ru.yandex.taxi.delivery.router.primary.a aVar3 = (ru.yandex.taxi.delivery.router.primary.a) obj4;
                hyf hyfVar = (hyf) obj2;
                String str8 = (String) obj3;
                if (((igi) obj5).a != null) {
                    aVar3.S(hyfVar);
                } else {
                    aVar3.P(hyfVar, str8);
                }
                return zy11Var;
            case 11:
                bts btsVar = (bts) obj5;
                bb9 bb9Var = (bb9) obj4;
                dus0 dus0Var = (dus0) obj3;
                kb30 kb30Var = (kb30) obj2;
                gid gidVar = btsVar.M;
                bb9 bb9Var2 = gidVar.b;
                try {
                    gidVar.b = bb9Var;
                    dus0 dus0Var2 = btsVar.G;
                    int[] iArr = btsVar.o;
                    wx40 wx40Var = btsVar.v;
                    btsVar.o = null;
                    btsVar.v = null;
                    try {
                        btsVar.G = dus0Var;
                        boolean z3 = gidVar.e;
                        try {
                            gidVar.e = false;
                            btsVar.G(kb30Var.a, kb30Var.g, kb30Var.b, true);
                            return zy11Var;
                        } finally {
                            gidVar.e = z3;
                        }
                    } finally {
                        btsVar.G = dus0Var2;
                        btsVar.o = iArr;
                        btsVar.v = wx40Var;
                    }
                } finally {
                    gidVar.b = bb9Var2;
                }
            case 12:
                tls tlsVar = (tls) obj5;
                nut nutVar = (nut) obj3;
                sls slsVar = (sls) obj2;
                try {
                    k991 k991Var = (k991) ((eqs) obj4);
                    k991Var.getClass();
                    k991Var.c(puy.c(nutVar, nut.class.getSimpleName()), 2418).h(zkj.z, r400.b);
                    slsVar.invoke();
                    failure = zy11Var;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a3 = Result.a(failure);
                if (a3 != null) {
                    tlsVar.invoke(a3);
                }
                return zy11Var;
            case 13:
                zvt zvtVar = (zvt) obj5;
                OrderDetails orderDetails = (OrderDetails) obj4;
                pac pacVar = new pac((tls) obj3, (tls) obj2);
                GooglePayData googlePayData = zvtVar.b;
                if (orderDetails instanceof OrderDetails.Strict) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("apiVersion", 2);
                    jSONObject2.put("apiVersionMinor", 0);
                    if (googlePayData instanceof GooglePayData.Direct) {
                        jSONObject = new JSONObject();
                        jSONObject.put("type", "DIRECT");
                        jSONObject.put("parameters", new JSONObject(kotlin.collections.b.i(new Pair("protocolVersion", "ECv2"), new Pair("publicKey", ((GooglePayData.Direct) googlePayData).getPublicKey()))));
                    } else {
                        if (!(googlePayData instanceof GooglePayData.Gateway)) {
                            LinkedHashMap linkedHashMap = zdz.a;
                            ogb1.b("No tokenization params for GooglePay");
                            PaymentKitError.Companion.getClass();
                            pacVar.i(com.yandex.payment.sdk.core.data.a.c());
                            return zy11Var;
                        }
                        jSONObject = new JSONObject();
                        jSONObject.put("type", "PAYMENT_GATEWAY");
                        GooglePayData.Gateway gateway = (GooglePayData.Gateway) googlePayData;
                        jSONObject.put("parameters", new JSONObject(kotlin.collections.b.i(new Pair("gateway", gateway.getGatewayId()), new Pair("gatewayMerchantId", gateway.getGatewayMerchantId()))));
                    }
                    JSONArray jSONArray = new JSONArray((Collection) zvtVar.c.getValue());
                    JSONArray jSONArray2 = new JSONArray((Collection) scc.g("PAN_ONLY", "CRYPTOGRAM_3DS"));
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("allowedAuthMethods", jSONArray2);
                    jSONObject4.put("allowedCardNetworks", jSONArray);
                    jSONObject4.put("billingAddressRequired", true);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("format", "FULL");
                    jSONObject4.put("billingAddressParameters", jSONObject5);
                    jSONObject4.put("allowPrepaidCards", true);
                    jSONObject3.put("type", "CARD");
                    jSONObject3.put("parameters", jSONObject4);
                    jSONObject3.put("tokenizationSpecification", jSONObject);
                    OrderDetails.Strict strict = (OrderDetails.Strict) orderDetails;
                    BigDecimal amount = strict.getAmount();
                    r8 = amount != null ? amount.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0 ? String.format("%.0f", Arrays.copyOf(new Object[]{amount}, 1)) : String.format("%.2f", Arrays.copyOf(new Object[]{amount}, 1)) : null;
                    JSONObject jSONObject6 = new JSONObject();
                    if (strict.getPriceStatus() != null) {
                        jSONObject6.put("totalPriceStatus", strict.getPriceStatus());
                        if (r8 != null) {
                            jSONObject6.put("totalPrice", r8);
                        }
                    } else if (r8 == null) {
                        jSONObject6.put("totalPriceStatus", "NOT_CURRENTLY_KNOWN");
                    } else {
                        jSONObject6.put("totalPrice", r8);
                        jSONObject6.put("totalPriceStatus", "FINAL");
                    }
                    if (strict.getLabel() != null) {
                        jSONObject6.put("totalPriceLabel", strict.getLabel());
                    }
                    jSONObject6.put("currencyCode", strict.getCurrency());
                    jSONObject2.put("allowedPaymentMethods", new JSONArray().put(jSONObject3));
                    jSONObject2.put("transactionInfo", jSONObject6);
                    jSONObject2.put("emailRequired", true);
                    jSONObject2.put("shippingAddressRequired", false);
                    data = jSONObject2.toString();
                } else {
                    if (!(orderDetails instanceof OrderDetails.Json)) {
                        w511.b();
                        return null;
                    }
                    data = ((OrderDetails.Json) orderDetails).getData();
                }
                PaymentDataRequest fromJson = PaymentDataRequest.fromJson(data);
                zvtVar.e = pacVar;
                kt3.b(zvtVar.d.e(fromJson), zvtVar.a, 663);
                return zy11Var;
            case 14:
                spu spuVar = (spu) obj5;
                return new com.yandex.plus.home.feature.webviews.internal.home.contract.a((y4d0) obj3, spuVar.c, spuVar.w, (zqc) obj4, spuVar.y, spuVar.e(), spuVar.f(), spuVar.z, spuVar.A, spuVar.B, spuVar.C, spuVar.D, spuVar.E, spuVar.F, spuVar.G, spuVar.H, spuVar.I, spuVar.J, (WebViewType) obj2, spuVar.x, spuVar.L, spuVar.K);
            case 15:
                ((pep0) ((oep0) obj5)).f((m950) ((com.yandex.go.taxi.summary.mobilityhub.deeplink.a) obj4).b.get(), new ng30((Route) obj3, (List) obj2, Screen.MOBILITY_HUB_TRANSPORT_DETAILS, MtDetailedRouteAnalyticSource.Hub, null, MtDetailedRouteAnalyticType.Vertical, 1776), hxx.a);
                return zy11Var;
            case 16:
                Number number = (Number) obj5;
                osv osvVar = (osv) obj4;
                Number number2 = (Number) obj3;
                nsv nsvVar = (nsv) obj2;
                if (!number.equals(osvVar.a) || !number2.equals(osvVar.b)) {
                    osvVar.a = number;
                    osvVar.b = number2;
                    osvVar.x = nsvVar;
                    osvVar.y = new lax0(nsvVar, osvVar.c, number, number2, null);
                    osvVar.C.c.setValue(Boolean.TRUE);
                    osvVar.z = false;
                    osvVar.A = true;
                }
                return zy11Var;
            case 17:
                ((ru.yandex.taxi.map_common.map.intersection.a) obj5).f((np00) obj4, (ro00) obj3, (ro00) obj2);
                return zy11Var;
            case 18:
                executeRequest$lambda$0 = MapiClientImpl.executeRequest$lambda$0((MapiClientImpl) obj5, (vu00) obj4, (yu00) obj3, (ku00) obj2);
                return executeRequest$lambda$0;
            case 19:
                return (kg90) ((ie7) obj5).b((Map) obj4, (InputStream) obj3, (wu00) obj2);
            case 20:
                return ((yu00) obj5).b((Map) obj4, (InputStream) obj3, (wu00) obj2);
            case 21:
                ((oz40) obj5).setValue(Boolean.FALSE);
                ((tls) obj4).invoke(ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.g(((androidx.compose.foundation.pager.d) obj2).k(), (ArrayList) obj3));
                return zy11Var;
            case 22:
                ((f02) obj5).invoke();
                k0b k0bVar = ((ps10) obj4).j;
                k0bVar.getClass();
                tje.e();
                b00 b00Var = k0bVar.a;
                ((Handler) b00Var.a.get()).post(new tz(b00Var, k0bVar.b, (String) obj3, (String) obj2, 1));
                return zy11Var;
            case 23:
                ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c cVar3 = (ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.c) obj5;
                c9x0 c9x0Var = (c9x0) obj4;
                return (xni) ((xvf0) gvb1.b(c9x0Var.a, new l030(c9x0Var.b, (ModalViewType) ((tis0) obj3).c, false), (s030) obj2, cVar3.c, (dt20) cVar3.a.a).n).get();
            case 24:
                sv30 sv30Var = (sv30) obj4;
                String str9 = (String) obj3;
                wls wlsVar = (wls) obj2;
                ((tls) obj5).invoke(((rv30) sv30Var).a);
                if (str9 != null) {
                    if (sv30Var instanceof rv30) {
                        r8 = "share_route";
                    } else if (!(sv30Var instanceof qv30)) {
                        w511.b();
                        return null;
                    }
                    wlsVar.invoke(str9, r8 != null ? r8 : "");
                }
                return zy11Var;
            case 25:
                xl50 xl50Var = (xl50) obj5;
                com.yandex.messaging.core.ui.utils.a.a((tse) obj4, (qrm) obj3, new bm50(i4, (yd00) obj2, new l7f(xl50Var.a, xl50Var.b)));
                return zy11Var;
            case 26:
                TaxiOrder taxiOrder = (TaxiOrder) obj5;
                return String.format(Locale.US, "Not enough route points for order '%s' where: lastDriverPoint='%s', routePoints='%s', rawRoute='%s', driverCar=%s", Arrays.copyOf(new Object[]{taxiOrder.a, ((c0) obj4).I0, (List) obj3, (List) obj2, taxiOrder.V().g.h}, 5));
            case 27:
                return "PassengerDetection: State changed to " + ((String) obj3) + ", \nmeanDistance=" + ((Float) obj5) + "m, threshold=" + ((Integer) obj4) + "m, \nsampleSize=" + ((com.yandex.go.taxi.order.map.passenger_detection.a) obj2).h.size();
            case 28:
                com.yandex.messaging.data.a aVar4 = (com.yandex.messaging.data.a) obj5;
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) obj4;
                MessageRef messageRef = (MessageRef) obj2;
                kse.b(aVar4.a);
                copyOnWriteArraySet.remove((loe) obj3);
                if (copyOnWriteArraySet.isEmpty()) {
                    aVar4.e.remove(messageRef);
                }
                return zy11Var;
            default:
                com.ybsdk.feature.pfm.internal.ui.b bVar = (com.ybsdk.feature.pfm.internal.ui.b) obj4;
                String str10 = (String) obj3;
                String str11 = (String) obj2;
                String str12 = ((l9b0) obj5).c;
                Set c = ((wcb0) bVar.X()).c();
                xv10 xv10Var = bVar.K;
                Set e3 = ((wcb0) bVar.X()).e();
                if (e3 == null) {
                    e3 = EmptySet.a;
                }
                Set set = ((wcb0) bVar.X()).g;
                Set c3 = ((wcb0) bVar.X()).c();
                String str13 = ((wcb0) bVar.X()).e;
                xv10Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : c) {
                    if (obj6 instanceof g9b0) {
                        arrayList2.add(obj6);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((g9b0) obj).b.equals(str12)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                g9b0 g9b0Var = (g9b0) obj;
                ((AppAnalyticsReporter) xv10Var.a).R.f(null, xv10Var.r(str13, e3, set), g9b0Var != null ? new i9b0(g9b0Var.a, str11 != null ? g9b0Var.b.equals(str11) : false ? PfmAnalyticsItemStatePfm.SELECTED : PfmAnalyticsItemStatePfm.NOT_SELECTED) : null, xv10.p(str10, c3));
                return zy11Var;
        }
    }

    public /* synthetic */ jo0(int i, Object obj, Object obj2, Object obj3, String str) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = str;
    }

    public /* synthetic */ jo0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = obj3;
        this.x = obj4;
    }

    public /* synthetic */ jo0(String str, Float f, Integer num, com.yandex.go.taxi.order.map.passenger_detection.a aVar) {
        this.a = 27;
        this.b = str;
        this.c = f;
        this.w = num;
        this.x = aVar;
    }
}
