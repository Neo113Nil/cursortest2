package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.network;

import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroExchangeOtpRequest;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroExchangeOtpResponse;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroInitOtpRequest;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroInitOtpResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/network/MosmetroOtpApi;", "", "", "idempotencyToken", "Lcom/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/dto/MosmetroInitOtpRequest;", "body", "Lcmt;", "Lcom/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/dto/MosmetroInitOtpResponse;", "a", "(Ljava/lang/String;Lcom/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/dto/MosmetroInitOtpRequest;)Lcmt;", "Lcom/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/dto/MosmetroExchangeOtpRequest;", "Lcom/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/dto/MosmetroExchangeOtpResponse;", "b", "(Ljava/lang/String;Lcom/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/dto/MosmetroExchangeOtpRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MosmetroOtpApi {
    @s490("masstransit-core/v1/mosmetro/otp/init")
    cmt<MosmetroInitOtpResponse> a(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 MosmetroInitOtpRequest body);

    @s490("masstransit-core/v1/mosmetro/otp/exchange")
    cmt<MosmetroExchangeOtpResponse> b(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 MosmetroExchangeOtpRequest body);
}
