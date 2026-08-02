package com.ybsdk.feature.settings.internal.network;

import com.ybsdk.core.utils.dto.OldDataWithStatusResponse;
import com.ybsdk.core.utils.dto.OldTwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.feature.settings.internal.network.dto.GetSettingRequest;
import com.ybsdk.feature.settings.internal.network.dto.SetSettingRequest;
import com.ybsdk.feature.settings.internal.network.dto.SettingsResponseDto;
import com.ybsdk.feature.settings.internal.network.dto.card.CardSetSettingsResponse;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJF\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\t2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/settings/internal/network/SettingsApi;", "", "Lcom/ybsdk/feature/settings/internal/network/dto/GetSettingRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse;", "Lcom/ybsdk/feature/settings/internal/network/dto/SettingsResponseDto;", "c", "(Lcom/ybsdk/feature/settings/internal/network/dto/GetSettingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyToken", "", "headers", "Lcom/ybsdk/feature/settings/internal/network/dto/SetSettingRequest;", "Lcom/ybsdk/core/utils/dto/OldTwoFactorAuthResponse;", "a", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/settings/internal/network/dto/SetSettingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", "Lcom/ybsdk/feature/settings/internal/network/dto/card/CardSetSettingsResponse;", "b", "(Lcom/ybsdk/feature/settings/internal/network/dto/SetSettingRequest;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SettingsApi {
    @s490("v1/settings/v1/settings/set")
    Object a(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 SetSettingRequest setSettingRequest, Continuation<? super Result<OldTwoFactorAuthResponse<SettingsResponseDto>>> continuation);

    @s490("v1/card/v1/settings/set")
    Object b(@q76 SetSettingRequest setSettingRequest, @z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, Continuation<? super Result<SecondAuthorizationResponse<CardSetSettingsResponse>>> continuation);

    @s490("v1/settings/v1/settings/get")
    Object c(@q76 GetSettingRequest getSettingRequest, Continuation<? super Result<OldDataWithStatusResponse<SettingsResponseDto>>> continuation);
}
