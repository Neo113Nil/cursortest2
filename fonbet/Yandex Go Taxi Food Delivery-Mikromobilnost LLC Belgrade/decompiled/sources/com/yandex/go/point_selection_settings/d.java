package com.yandex.go.point_selection_settings;

import com.yandex.go.point_selection_settings.PointSelectionScreenSettingsExperiment;
import defpackage.avd0;
import defpackage.bvd0;
import defpackage.d6z;
import defpackage.kip;
import defpackage.w511;
import defpackage.zud0;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class d implements avd0 {
    public final kip a;

    public d(kip kipVar) {
        this.a = kipVar;
    }

    public final zud0 a(String str, PointSelectionSettingsInteractor$PointType pointSelectionSettingsInteractor$PointType) {
        PointSelectionScreenSettingsExperiment.TariffsSettings.Type type;
        Object obj;
        if (str != null) {
            PointSelectionScreenSettingsExperiment pointSelectionScreenSettingsExperiment = (PointSelectionScreenSettingsExperiment) this.a.a.b();
            if (pointSelectionScreenSettingsExperiment.b) {
                int i = bvd0.a[pointSelectionSettingsInteractor$PointType.ordinal()];
                if (i == 1) {
                    type = PointSelectionScreenSettingsExperiment.TariffsSettings.Type.STARTING;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    type = PointSelectionScreenSettingsExperiment.TariffsSettings.Type.DESTINATION;
                }
                Iterator it = pointSelectionScreenSettingsExperiment.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    PointSelectionScreenSettingsExperiment.TariffsSettings tariffsSettings = (PointSelectionScreenSettingsExperiment.TariffsSettings) obj;
                    if (tariffsSettings.a == type && tariffsSettings.e.contains(str)) {
                        break;
                    }
                }
                PointSelectionScreenSettingsExperiment.TariffsSettings tariffsSettings2 = (PointSelectionScreenSettingsExperiment.TariffsSettings) obj;
                if (tariffsSettings2 != null) {
                    String str2 = tariffsSettings2.b;
                    String Y = str2 != null ? d6z.Y(pointSelectionScreenSettingsExperiment, str2) : null;
                    String str3 = tariffsSettings2.c;
                    String Y2 = str3 != null ? d6z.Y(pointSelectionScreenSettingsExperiment, str3) : null;
                    String str4 = tariffsSettings2.d;
                    return new zud0(Y, Y2, str4 != null ? d6z.Y(pointSelectionScreenSettingsExperiment, str4) : null);
                }
            }
        }
        return null;
    }
}
