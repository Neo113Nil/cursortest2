package com.yandex.go.taxi.order.models.api.response;

import defpackage.fet0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/StateInfoTimer;", "", "Companion", "TimeFormat", "TimerType", "$serializer", "com/yandex/go/taxi/order/models/api/response/t7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StateInfoTimer {
    public static final t7 Companion = new t7();
    public static final i3y[] d;
    public final String a;
    public final TimeFormat b;
    public final TimerType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/StateInfoTimer$TimeFormat;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/u7", "POSITIONAL", "ABBREVIATED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TimeFormat {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TimeFormat[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final TimeFormat ABBREVIATED;
        public static final u7 Companion;
        public static final TimeFormat POSITIONAL;

        static {
            TimeFormat timeFormat = new TimeFormat("POSITIONAL", 0);
            POSITIONAL = timeFormat;
            TimeFormat timeFormat2 = new TimeFormat("ABBREVIATED", 1);
            ABBREVIATED = timeFormat2;
            TimeFormat[] timeFormatArr = {timeFormat, timeFormat2};
            $VALUES = timeFormatArr;
            $ENTRIES = kotlin.enums.a.a(timeFormatArr);
            Companion = new u7();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(16));
        }

        public static TimeFormat valueOf(String str) {
            return (TimeFormat) Enum.valueOf(TimeFormat.class, str);
        }

        public static TimeFormat[] values() {
            return (TimeFormat[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/StateInfoTimer$TimerType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/v7", "FROM", "UNTIL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TimerType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TimerType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final v7 Companion;
        public static final TimerType FROM;
        public static final TimerType UNTIL;

        static {
            TimerType timerType = new TimerType("FROM", 0);
            FROM = timerType;
            TimerType timerType2 = new TimerType("UNTIL", 1);
            UNTIL = timerType2;
            TimerType[] timerTypeArr = {timerType, timerType2};
            $VALUES = timerTypeArr;
            $ENTRIES = kotlin.enums.a.a(timerTypeArr);
            Companion = new v7();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(17));
        }

        public static TimerType valueOf(String str) {
            return (TimerType) Enum.valueOf(TimerType.class, str);
        }

        public static TimerType[] values() {
            return (TimerType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new fet0(14)), kotlin.a.b(lazyThreadSafetyMode, new fet0(15))};
    }

    public /* synthetic */ StateInfoTimer(int i, String str, TimeFormat timeFormat, TimerType timerType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = timeFormat;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = timerType;
        }
    }

    public StateInfoTimer(int i) {
        this.a = "";
        this.b = null;
        this.c = null;
    }

    public StateInfoTimer() {
        this(0);
    }
}
