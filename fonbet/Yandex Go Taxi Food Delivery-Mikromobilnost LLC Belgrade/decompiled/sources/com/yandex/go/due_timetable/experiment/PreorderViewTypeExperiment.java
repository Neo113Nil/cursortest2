package com.yandex.go.due_timetable.experiment;

import com.yandex.go.due_timetable.experiment.model.Timetable;
import defpackage.gsq0;
import defpackage.xn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/PreorderViewTypeExperiment;", "Lxn11;", "Companion", "com/yandex/go/due_timetable/experiment/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreorderViewTypeExperiment implements xn11 {
    public static final f Companion = new f();
    public final Timetable b;

    public /* synthetic */ PreorderViewTypeExperiment(int i, Timetable timetable) {
        if ((i & 1) == 0) {
            this.b = new Timetable(0);
        } else {
            this.b = timetable;
        }
    }

    public PreorderViewTypeExperiment() {
        this(0);
    }

    public PreorderViewTypeExperiment(int i) {
        this.b = new Timetable(0);
    }
}
