package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelectorDto;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class d extends xqt {
    public static final d e = new d();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, j.INSTANCE.serializer(), qoi0.a(j.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("show_calendar", MtTrainDateSelectorDto.ShowCalendar.Companion.serializer(), qoi0.a(MtTrainDateSelectorDto.ShowCalendar.class)), new f9("reload_schedule", MtTrainDateSelectorDto.ReloadSchedule.Companion.serializer(), qoi0.a(MtTrainDateSelectorDto.ReloadSchedule.class)));
    }
}
