package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelectorDto;
import defpackage.e540;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class j extends MtTrainDateSelectorDto.a {
    public static final j INSTANCE = new j();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(15));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
