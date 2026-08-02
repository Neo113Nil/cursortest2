package com.yandex.go.taxi.order.models.api.experiments;

import defpackage.aw80;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment;", "Lxn11;", "Companion", "State", "FreeWaiting", "PriceReducing", "PaidWaiting", "FreeWaitingInTitle", "com/yandex/go/taxi/order/models/api/experiments/a", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaidWaitingTimerInCardExperiment implements xn11 {
    public static final a Companion = new a();
    public static final PaidWaitingTimerInCardExperiment f = new PaidWaitingTimerInCardExperiment(0);
    public final FreeWaiting b;
    public final PaidWaiting c;
    public final boolean d;
    public final FreeWaitingInTitle e;

    public /* synthetic */ PaidWaitingTimerInCardExperiment(int i, FreeWaiting freeWaiting, PaidWaiting paidWaiting, boolean z, FreeWaitingInTitle freeWaitingInTitle) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = freeWaiting;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = paidWaiting;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = freeWaitingInTitle;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$PriceReducing;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/experiments/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class PriceReducing {
        public static final f Companion = new f();
        public final String a;
        public final int b;

        public /* synthetic */ PriceReducing(int i, String str, int i2) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
        }

        public PriceReducing() {
            this.a = null;
            this.b = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$State;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/experiments/g", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class State {
        public static final g Companion = new g();
        public final String a;
        public final String b;

        public /* synthetic */ State(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public State() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$FreeWaitingInTitle;", "", "Companion", "TimeFormat", "$serializer", "com/yandex/go/taxi/order/models/api/experiments/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class FreeWaitingInTitle {
        public static final c Companion = new c();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(18))};
        public final boolean a;
        public final String b;
        public final TimeFormat c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$FreeWaitingInTitle$TimeFormat;", "", "Companion", "com/yandex/go/taxi/order/models/api/experiments/d", "POSITIONAL", "ABBREVIATED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class TimeFormat {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ TimeFormat[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final TimeFormat ABBREVIATED;
            public static final d Companion;
            public static final TimeFormat POSITIONAL;

            static {
                TimeFormat timeFormat = new TimeFormat("POSITIONAL", 0);
                POSITIONAL = timeFormat;
                TimeFormat timeFormat2 = new TimeFormat("ABBREVIATED", 1);
                ABBREVIATED = timeFormat2;
                TimeFormat[] timeFormatArr = {timeFormat, timeFormat2};
                $VALUES = timeFormatArr;
                $ENTRIES = kotlin.enums.a.a(timeFormatArr);
                Companion = new d();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(19));
            }

            public static TimeFormat valueOf(String str) {
                return (TimeFormat) Enum.valueOf(TimeFormat.class, str);
            }

            public static TimeFormat[] values() {
                return (TimeFormat[]) $VALUES.clone();
            }
        }

        public /* synthetic */ FreeWaitingInTitle(int i, boolean z, String str, TimeFormat timeFormat) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = timeFormat;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public FreeWaitingInTitle() {
            this.a = false;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$PaidWaiting;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/experiments/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class PaidWaiting {
        public static final e Companion = new e();
        public final boolean a;
        public final State b;
        public final PriceReducing c;

        public /* synthetic */ PaidWaiting(int i, boolean z, State state, PriceReducing priceReducing) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = state;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = priceReducing;
            }
        }

        public PaidWaiting() {
            this.a = false;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$FreeWaiting;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/experiments/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class FreeWaiting {
        public static final b Companion = new b();
        public final boolean a;
        public final State b;
        public final State c;
        public final int d;

        public /* synthetic */ FreeWaiting(int i, boolean z, State state, State state2, int i2) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = state;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = state2;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i2;
            }
        }

        public FreeWaiting() {
            this.a = false;
            this.b = null;
            this.c = null;
            this.d = 0;
        }
    }

    public PaidWaitingTimerInCardExperiment(int i) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = null;
    }

    public PaidWaitingTimerInCardExperiment() {
        this(0);
    }
}
