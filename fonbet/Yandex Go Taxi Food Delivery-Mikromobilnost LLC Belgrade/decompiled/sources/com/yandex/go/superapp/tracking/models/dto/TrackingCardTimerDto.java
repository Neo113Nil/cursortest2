package com.yandex.go.superapp.tracking.models.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nhz0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardTimerDto;", "", "Companion", "TimerType", "$serializer", "com/yandex/go/superapp/tracking/models/dto/a0", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardTimerDto {
    public static final a0 Companion = new a0();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(26)), null};
    public final TimerType a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardTimerDto$TimerType;", "", "Companion", "com/yandex/go/superapp/tracking/models/dto/b0", "Until", "From", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TimerType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TimerType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b0 Companion;
        public static final TimerType From;
        public static final TimerType Until;

        static {
            TimerType timerType = new TimerType("Until", 0);
            Until = timerType;
            TimerType timerType2 = new TimerType("From", 1);
            From = timerType2;
            TimerType[] timerTypeArr = {timerType, timerType2};
            $VALUES = timerTypeArr;
            $ENTRIES = kotlin.enums.a.a(timerTypeArr);
            Companion = new b0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(27));
        }

        public static TimerType valueOf(String str) {
            return (TimerType) Enum.valueOf(TimerType.class, str);
        }

        public static TimerType[] values() {
            return (TimerType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TrackingCardTimerDto(int i, TimerType timerType, String str) {
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

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final TimerType getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardTimerDto)) {
            return false;
        }
        TrackingCardTimerDto trackingCardTimerDto = (TrackingCardTimerDto) obj;
        return this.a == trackingCardTimerDto.a && jl40.l(this.b, trackingCardTimerDto.b);
    }

    public final int hashCode() {
        TimerType timerType = this.a;
        int hashCode = (timerType == null ? 0 : timerType.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingCardTimerDto(type=" + this.a + ", datetime=" + this.b + Extension.C_BRAKE;
    }

    public TrackingCardTimerDto() {
        this.a = null;
        this.b = null;
    }
}
