package com.yandex.go.point_selection_settings;

import com.yandex.go.point_selection_settings.PointSelectionScreenSettingsExperiment;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PointSelectionScreenSettingsExperiment.TariffsSettings.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
