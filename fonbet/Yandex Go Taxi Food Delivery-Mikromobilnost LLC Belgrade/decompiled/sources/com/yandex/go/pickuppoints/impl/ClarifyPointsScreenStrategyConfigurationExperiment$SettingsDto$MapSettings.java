package com.yandex.go.pickuppoints.impl;

import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.y99;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/pickuppoints/impl/ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings", "Lcom/yandex/go/pickuppoints/impl/h;", "Companion", "$serializer", "com/yandex/go/pickuppoints/impl/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings extends h {
    public static final e Companion = new e();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(23))};
    public final ClarifyPointsScreenStrategyConfigurationExperiment.MapConfigurationDto a;
    public final List b;

    public ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings(int i, ClarifyPointsScreenStrategyConfigurationExperiment.MapConfigurationDto mapConfigurationDto, List list) {
        this.a = (i & 1) == 0 ? new ClarifyPointsScreenStrategyConfigurationExperiment.MapConfigurationDto(0) : mapConfigurationDto;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings() {
        this.a = new ClarifyPointsScreenStrategyConfigurationExperiment.MapConfigurationDto(0);
        this.b = EmptyList.a;
    }
}
