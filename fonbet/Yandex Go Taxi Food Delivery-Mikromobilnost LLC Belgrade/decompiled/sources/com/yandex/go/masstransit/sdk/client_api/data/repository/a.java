package com.yandex.go.masstransit.sdk.client_api.data.repository;

import com.yandex.go.masstransit.sdk.client_api.ClientApiException;
import com.yandex.go.masstransit.sdk.client_api.ErrorCode;
import com.yandex.go.masstransit.sdk.client_api.data.dto.PaymentMethodDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.TripUpdateRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.network.ClientRetrofitApi;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jse;
import defpackage.on2;
import defpackage.qcx;
import defpackage.s8o;
import defpackage.sbx;
import defpackage.tje;
import defpackage.vmx;
import defpackage.zn1;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedInputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class a {
    public final jse a;
    public final i3y b;

    public a(on2 on2Var, jse jseVar) {
        this.a = jseVar;
        this.b = kotlin.a.a(new zn1(on2Var, 25));
    }

    public static final ClientRetrofitApi a(a aVar) {
        return (ClientRetrofitApi) aVar.b.getValue();
    }

    public static final Throwable b(a aVar, Throwable th) {
        String L;
        String g;
        aVar.getClass();
        if (s8o.u(th)) {
            if (!s8o.w(th)) {
                return new ClientApiException(ErrorCode.ClientError, th.getMessage(), th);
            }
            BufferedInputStream N = s8o.N(th);
            if (N != null && (L = s8o.L(N)) != null) {
                sbx a = vmx.a.a();
                a.getClass();
                c cVar = (c) a.b(c.Companion.serializer(), L);
                b bVar = (b) cVar.get(AuthSdkActivity.RESPONSE_TYPE_CODE);
                if (bVar != null && (g = qcx.g(qcx.n(bVar))) != null) {
                    b bVar2 = (b) cVar.get(Constants.KEY_MESSAGE);
                    Object obj = null;
                    String g2 = bVar2 != null ? qcx.g(qcx.n(bVar2)) : null;
                    Iterator<E> it = ErrorCode.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((ErrorCode) next).getCode(), g)) {
                            obj = next;
                            break;
                        }
                    }
                    ErrorCode errorCode = (ErrorCode) obj;
                    if (errorCode == null) {
                        errorCode = ErrorCode.ClientError;
                    }
                    return new ClientApiException(errorCode, g2, th);
                }
            }
        }
        return th;
    }

    public static final String c(a aVar, String str) {
        aVar.getClass();
        return str == null ? UUID.randomUUID().toString().toLowerCase(Locale.US) : str;
    }

    public final Object d(String str, Continuation continuation) {
        return tje.k0(this.a, new MasstransitClientApiRepository$checkoutStatus$2(this, str, null), continuation);
    }

    public final Object e(String str, Continuation continuation) {
        return tje.k0(this.a, new MasstransitClientApiRepository$checkoutTrip$2(this, str, null, null), continuation);
    }

    public final Object f(String str, Continuation continuation) {
        return tje.k0(this.a, new MasstransitClientApiRepository$copyTrip$2(this, str, null, null), continuation);
    }

    public final Object g(String str, Continuation continuation) {
        return tje.k0(this.a, new MasstransitClientApiRepository$getTrip$2(this, str, null), continuation);
    }

    public final Object h(Map map, PaymentMethodDto paymentMethodDto, Continuation continuation) {
        return tje.k0(this.a, new MasstransitClientApiRepository$initTrip$2(this, null, map, paymentMethodDto, null), continuation);
    }

    public final Object i(String str, SearchRequestDto searchRequestDto, Continuation continuation) {
        return tje.k0(this.a, new MasstransitClientApiRepository$search$2(this, str, searchRequestDto, null), continuation);
    }

    public final Object j(String str, SearchRequestDto searchRequestDto, Continuation continuation) {
        return tje.k0(this.a, new MasstransitClientApiRepository$searchFull$2(this, str, searchRequestDto, null), continuation);
    }

    public final Object k(String str, TripUpdateRequestDto tripUpdateRequestDto, Continuation continuation) {
        return tje.k0(this.a, new MasstransitClientApiRepository$updateTrip$2(this, str, null, tripUpdateRequestDto, null), continuation);
    }
}
