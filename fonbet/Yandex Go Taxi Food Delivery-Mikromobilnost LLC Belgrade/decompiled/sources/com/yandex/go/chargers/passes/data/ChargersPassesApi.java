package com.yandex.go.chargers.passes.data;

import defpackage.bka;
import defpackage.cmt;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.wfa;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0007\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassesApi;", "", "Lcmt;", "Lbka;", "d", "()Lcmt;", "Lcom/yandex/go/chargers/passes/data/ChargersPassesOfferRequestDto;", "body", "Lcom/yandex/go/chargers/passes/data/ChargersPassesOfferResponseDto;", "e", "(Lcom/yandex/go/chargers/passes/data/ChargersPassesOfferRequestDto;)Lcmt;", "Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyRequestDto;", "Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyResponseDto;", "f", "(Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyRequestDto;)Lcmt;", "Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyStatusRequestDto;", "Lwfa;", "c", "(Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyStatusRequestDto;)Lcmt;", "", "passId", "Lcom/yandex/go/chargers/passes/data/ChargersPassesUpdateRequestDto;", "Lcom/yandex/go/chargers/passes/data/ChargersPassesCancelResumeResponseDto;", "a", "(Ljava/lang/String;Lcom/yandex/go/chargers/passes/data/ChargersPassesUpdateRequestDto;)Lcmt;", "Lcom/yandex/go/chargers/passes/data/ChargersPassesPaymentSettingsResponseDto;", "b", "(Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChargersPassesApi {
    @s490("chargers/v1/passes/{passId}")
    cmt<ChargersPassesCancelResumeResponseDto> a(@pq90("passId") String passId, @q76 ChargersPassesUpdateRequestDto body);

    @s490("chargers/v1/passes/{passId}/payment/settings")
    cmt<ChargersPassesPaymentSettingsResponseDto> b(@pq90("passId") String passId);

    @s490("chargers/v1/passes/buy/status")
    cmt<wfa> c(@q76 ChargersPassesBuyStatusRequestDto body);

    @s490("chargers/v1/passes")
    cmt<bka> d();

    @s490("chargers/v1/passes/offer")
    cmt<ChargersPassesOfferResponseDto> e(@q76 ChargersPassesOfferRequestDto body);

    @s490("chargers/v1/passes/buy")
    cmt<ChargersPassesBuyResponseDto> f(@q76 ChargersPassesBuyRequestDto body);
}
