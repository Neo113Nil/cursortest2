package com.ybsdk.feature.settings.internal.data;

import com.ybsdk.feature.settings.internal.network.dto.SettingsResponseDto;
import defpackage.i9r0;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SettingsRepository$getSettings$3$1 extends AdaptedFunctionReference implements wls {
    public static final SettingsRepository$getSettings$3$1 a = new SettingsRepository$getSettings$3$1(2, 5, i9r0.class, "toEntity", "toEntity(Lcom/ybsdk/feature/settings/internal/network/dto/SettingsResponseDto;)Lcom/ybsdk/feature/settings/api/domain/SettingsEntity;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return i9r0.a((SettingsResponseDto) obj);
    }
}
