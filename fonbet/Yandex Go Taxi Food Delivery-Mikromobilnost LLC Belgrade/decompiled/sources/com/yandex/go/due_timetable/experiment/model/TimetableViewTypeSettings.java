package com.yandex.go.due_timetable.experiment.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/model/TimetableViewTypeSettings;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/experiment/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimetableViewTypeSettings {
    public static final c Companion = new c();
    public static final i3y[] c;
    public final TimetableMainAction a;
    public final PriceHeightCalculationStrategyType b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new x1z0(25)), kotlin.a.b(lazyThreadSafetyMode, new x1z0(26))};
    }

    public /* synthetic */ TimetableViewTypeSettings(int i, TimetableMainAction timetableMainAction, PriceHeightCalculationStrategyType priceHeightCalculationStrategyType) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = timetableMainAction;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = priceHeightCalculationStrategyType;
        }
    }

    public TimetableViewTypeSettings() {
        this.a = null;
        this.b = null;
    }
}
