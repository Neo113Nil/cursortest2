package com.yandex.go.due_timetable.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.v4m0;
import defpackage.vnm0;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsResponse;", "", "Companion", "CalculationDto", "CalculationsStatusDto", "SlotType", "$serializer", "com/yandex/go/due_timetable/data/api/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScheduledOrderCalculationsResponse {
    public static final d Companion = new d();
    public static final i3y[] c;
    public final CalculationsStatusDto a;
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsResponse$CalculationsStatusDto;", "", "Companion", "com/yandex/go/due_timetable/data/api/dto/c", "PENDING", TlsConstants.TLS_FINISHED, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CalculationsStatusDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CalculationsStatusDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final CalculationsStatusDto FINISHED;
        public static final CalculationsStatusDto PENDING;

        static {
            CalculationsStatusDto calculationsStatusDto = new CalculationsStatusDto("PENDING", 0);
            PENDING = calculationsStatusDto;
            CalculationsStatusDto calculationsStatusDto2 = new CalculationsStatusDto(TlsConstants.TLS_FINISHED, 1);
            FINISHED = calculationsStatusDto2;
            CalculationsStatusDto[] calculationsStatusDtoArr = {calculationsStatusDto, calculationsStatusDto2};
            $VALUES = calculationsStatusDtoArr;
            $ENTRIES = kotlin.enums.a.a(calculationsStatusDtoArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(29));
        }

        public static CalculationsStatusDto valueOf(String str) {
            return (CalculationsStatusDto) Enum.valueOf(CalculationsStatusDto.class, str);
        }

        public static CalculationsStatusDto[] values() {
            return (CalculationsStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsResponse$SlotType;", "", "Companion", "com/yandex/go/due_timetable/data/api/dto/e", "ONDEMAND", "ASAP", "REGULAR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SlotType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SlotType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final SlotType ASAP;
        public static final e Companion;
        public static final SlotType ONDEMAND;
        public static final SlotType REGULAR;

        static {
            SlotType slotType = new SlotType("ONDEMAND", 0);
            ONDEMAND = slotType;
            SlotType slotType2 = new SlotType("ASAP", 1);
            ASAP = slotType2;
            SlotType slotType3 = new SlotType("REGULAR", 2);
            REGULAR = slotType3;
            SlotType[] slotTypeArr = {slotType, slotType2, slotType3};
            $VALUES = slotTypeArr;
            $ENTRIES = kotlin.enums.a.a(slotTypeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(0));
        }

        public static SlotType valueOf(String str) {
            return (SlotType) Enum.valueOf(SlotType.class, str);
        }

        public static SlotType[] values() {
            return (SlotType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new v4m0(26)), kotlin.a.b(lazyThreadSafetyMode, new v4m0(27))};
    }

    public /* synthetic */ ScheduledOrderCalculationsResponse(int i, CalculationsStatusDto calculationsStatusDto, List list) {
        this.a = (i & 1) == 0 ? CalculationsStatusDto.FINISHED : calculationsStatusDto;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ScheduledOrderCalculationsResponse() {
        this.a = CalculationsStatusDto.FINISHED;
        this.b = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsResponse$CalculationDto;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/data/api/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CalculationDto {
        public static final b Companion = new b();
        public static final i3y[] k = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(28)), null, null, null, null, null, null, null};
        public final String a;
        public final Boolean b;
        public final SlotType c;
        public final Calendar d;
        public final Double e;
        public final String f;
        public final Boolean g;
        public final Boolean h;
        public final String i;
        public final Calendar j;

        public /* synthetic */ CalculationDto(int i, String str, Boolean bool, SlotType slotType, Calendar calendar, Double d, String str2, Boolean bool2, Boolean bool3, String str3, Calendar calendar2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = Boolean.FALSE;
            } else {
                this.b = bool;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = slotType;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = calendar;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = d;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str2;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = bool2;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = bool3;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str3;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = calendar2;
            }
        }

        public CalculationDto() {
            Boolean bool = Boolean.FALSE;
            this.a = null;
            this.b = bool;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
        }
    }
}
