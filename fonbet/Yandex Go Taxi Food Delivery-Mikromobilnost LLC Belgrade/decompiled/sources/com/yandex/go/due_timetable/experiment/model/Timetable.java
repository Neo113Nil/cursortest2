package com.yandex.go.due_timetable.experiment.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pyy0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/model/Timetable;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/experiment/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Timetable {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(15))};
    public final Map a;

    public /* synthetic */ Timetable(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = kotlin.collections.b.f();
        } else {
            this.a = map;
        }
    }

    public Timetable() {
        this(0);
    }

    public Timetable(int i) {
        this.a = kotlin.collections.b.f();
    }
}
