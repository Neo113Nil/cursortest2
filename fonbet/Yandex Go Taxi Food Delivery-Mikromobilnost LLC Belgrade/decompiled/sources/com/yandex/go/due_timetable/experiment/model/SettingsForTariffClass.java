package com.yandex.go.due_timetable.experiment.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/model/SettingsForTariffClass;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/experiment/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SettingsForTariffClass {
    public static final a Companion = new a();
    public final TimetableViewTypeSettings a;
    public final TimetableViewTypeSettings b;

    public /* synthetic */ SettingsForTariffClass(int i, TimetableViewTypeSettings timetableViewTypeSettings, TimetableViewTypeSettings timetableViewTypeSettings2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = timetableViewTypeSettings;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = timetableViewTypeSettings2;
        }
    }

    public SettingsForTariffClass() {
        this.a = null;
        this.b = null;
    }
}
