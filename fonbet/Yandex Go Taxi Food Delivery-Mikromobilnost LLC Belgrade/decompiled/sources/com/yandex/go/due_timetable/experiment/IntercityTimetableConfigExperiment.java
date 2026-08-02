package com.yandex.go.due_timetable.experiment;

import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.ppr;
import defpackage.xn11;
import defpackage.yow;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/IntercityTimetableConfigExperiment;", "Lxn11;", "Companion", "TimeslotConfigurationRule", "TimeslotConfiguration", "com/yandex/go/due_timetable/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntercityTimetableConfigExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(23))};
    public final List b;

    public /* synthetic */ IntercityTimetableConfigExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public IntercityTimetableConfigExperiment(int i) {
        this.b = EmptyList.a;
    }

    public IntercityTimetableConfigExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/IntercityTimetableConfigExperiment$TimeslotConfigurationRule;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TimeslotConfigurationRule {
        public static final c Companion = new c();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(24))};
        public final String a;
        public final List b;

        public /* synthetic */ TimeslotConfigurationRule(int i, String str, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public TimeslotConfigurationRule() {
            this.a = "";
            this.b = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/experiment/IntercityTimetableConfigExperiment$TimeslotConfiguration;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TimeslotConfiguration {
        public static final b Companion = new b();
        public final Integer a;
        public final Integer b;
        public final Integer c;
        public final Float d;
        public final i3y e;

        public TimeslotConfiguration(int i, Float f, Integer num, Integer num2, Integer num3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = f;
            }
            this.e = kotlin.a.b(LazyThreadSafetyMode.NONE, new ppr(15, this));
        }

        public TimeslotConfiguration() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = kotlin.a.b(LazyThreadSafetyMode.NONE, new yow(3, this));
        }
    }
}
