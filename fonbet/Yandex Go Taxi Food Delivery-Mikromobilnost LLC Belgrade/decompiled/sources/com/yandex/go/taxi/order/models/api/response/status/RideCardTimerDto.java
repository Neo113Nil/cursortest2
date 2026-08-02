package com.yandex.go.taxi.order.models.api.response.status;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.sjk0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/status/RideCardTimerDto;", "", "Companion", "TimerType", "$serializer", "com/yandex/go/taxi/order/models/api/response/status/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardTimerDto {
    public static final d Companion = new d();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(26)), null};
    public final TimerType a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/status/RideCardTimerDto$TimerType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/status/e", "UNTIL", "FROM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TimerType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TimerType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final e Companion;
        public static final TimerType FROM;
        public static final TimerType UNTIL;

        static {
            TimerType timerType = new TimerType("UNTIL", 0);
            UNTIL = timerType;
            TimerType timerType2 = new TimerType("FROM", 1);
            FROM = timerType2;
            TimerType[] timerTypeArr = {timerType, timerType2};
            $VALUES = timerTypeArr;
            $ENTRIES = kotlin.enums.a.a(timerTypeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(27));
        }

        public static TimerType valueOf(String str) {
            return (TimerType) Enum.valueOf(TimerType.class, str);
        }

        public static TimerType[] values() {
            return (TimerType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ RideCardTimerDto(int i, TimerType timerType, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = timerType;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardTimerDto)) {
            return false;
        }
        RideCardTimerDto rideCardTimerDto = (RideCardTimerDto) obj;
        return this.a == rideCardTimerDto.a && jl40.l(this.b, rideCardTimerDto.b);
    }

    public final int hashCode() {
        TimerType timerType = this.a;
        int hashCode = (timerType == null ? 0 : timerType.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RideCardTimerDto(type=" + this.a + ", datetime=" + this.b + Extension.C_BRAKE;
    }

    public RideCardTimerDto(int i) {
        this.a = null;
        this.b = null;
    }

    public RideCardTimerDto() {
        this(0);
    }
}
