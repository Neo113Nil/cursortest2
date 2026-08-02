package com.ybsdk.feature.settings.internal.data;

import com.ybsdk.feature.settings.internal.network.dto.SettingsResponseDto;
import defpackage.i9r0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SettingsRepository$setSetting$3$1 extends FunctionReferenceImpl implements tls {
    public static final SettingsRepository$setSetting$3$1 b = new SettingsRepository$setSetting$3$1(1, 1, i9r0.class, "toEntity", "toEntity(Lcom/ybsdk/feature/settings/internal/network/dto/SettingsResponseDto;)Lcom/ybsdk/feature/settings/api/domain/SettingsEntity;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return i9r0.a((SettingsResponseDto) obj);
    }
}
