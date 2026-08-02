package com.yandex.go.due_timetable.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vnm0;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse;", "", "Companion", "TimeSlotDto", "$serializer", "com/yandex/go/due_timetable/data/api/dto/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScheduledOrderSeatsAvailableResponse {
    public static final g Companion = new g();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(4))};
    public final List a;

    public /* synthetic */ ScheduledOrderSeatsAvailableResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public ScheduledOrderSeatsAvailableResponse() {
        this.a = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto;", "", "Companion", "AppearanceDto", "TimeSlotTypeDto", "$serializer", "com/yandex/go/due_timetable/data/api/dto/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TimeSlotDto {
        public static final m Companion = new m();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(5)), null, null};
        public final TimeSlotTypeDto a;
        public final Calendar b;
        public final AppearanceDto c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$TimeSlotTypeDto;", "", "Companion", "com/yandex/go/due_timetable/data/api/dto/n", "AVAILABLE", "UNAVAILABLE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class TimeSlotTypeDto {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ TimeSlotTypeDto[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final TimeSlotTypeDto AVAILABLE;
            public static final n Companion;
            public static final TimeSlotTypeDto UNAVAILABLE;
            public static final TimeSlotTypeDto UNKNOWN;

            static {
                TimeSlotTypeDto timeSlotTypeDto = new TimeSlotTypeDto("AVAILABLE", 0);
                AVAILABLE = timeSlotTypeDto;
                TimeSlotTypeDto timeSlotTypeDto2 = new TimeSlotTypeDto("UNAVAILABLE", 1);
                UNAVAILABLE = timeSlotTypeDto2;
                TimeSlotTypeDto timeSlotTypeDto3 = new TimeSlotTypeDto("UNKNOWN", 2);
                UNKNOWN = timeSlotTypeDto3;
                TimeSlotTypeDto[] timeSlotTypeDtoArr = {timeSlotTypeDto, timeSlotTypeDto2, timeSlotTypeDto3};
                $VALUES = timeSlotTypeDtoArr;
                $ENTRIES = kotlin.enums.a.a(timeSlotTypeDtoArr);
                Companion = new n();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(9));
            }

            public static TimeSlotTypeDto valueOf(String str) {
                return (TimeSlotTypeDto) Enum.valueOf(TimeSlotTypeDto.class, str);
            }

            public static TimeSlotTypeDto[] values() {
                return (TimeSlotTypeDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ TimeSlotDto(int i, TimeSlotTypeDto timeSlotTypeDto, Calendar calendar, AppearanceDto appearanceDto) {
            this.a = (i & 1) == 0 ? TimeSlotTypeDto.UNKNOWN : timeSlotTypeDto;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = calendar;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = appearanceDto;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto;", "", "Companion", "AppearanceBannerDto", "AppearanceButtonDto", "$serializer", "com/yandex/go/due_timetable/data/api/dto/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class AppearanceDto {
            public static final l Companion = new l();
            public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(6)), null};
            public final String a;
            public final boolean b;
            public final boolean c;
            public final List d;
            public final AppearanceButtonDto e;

            public /* synthetic */ AppearanceDto(int i, String str, boolean z, boolean z2, List list, AppearanceButtonDto appearanceButtonDto) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = false;
                } else {
                    this.b = z;
                }
                if ((i & 4) == 0) {
                    this.c = false;
                } else {
                    this.c = z2;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = list;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = appearanceButtonDto;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceBannerDto;", "", "Companion", "BannerActionDto", "$serializer", "com/yandex/go/due_timetable/data/api/dto/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class AppearanceBannerDto {
                public static final j Companion = new j();
                public final String a;
                public final String b;
                public final String c;
                public final BannerActionDto d;

                public /* synthetic */ AppearanceBannerDto(int i, String str, String str2, String str3, BannerActionDto bannerActionDto) {
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
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = str3;
                    }
                    if ((i & 8) == 0) {
                        this.d = null;
                    } else {
                        this.d = bannerActionDto;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceBannerDto$BannerActionDto;", "", "Companion", "BannerActionType", "$serializer", "com/yandex/go/due_timetable/data/api/dto/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
                @gsq0
                public static final class BannerActionDto {
                    public static final i Companion = new i();
                    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(7)), null};
                    public final BannerActionType a;
                    public final Calendar b;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceBannerDto$BannerActionDto$BannerActionType;", "", "Companion", "com/yandex/go/due_timetable/data/api/dto/h", "SELECT_TIME_SLOT", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
                    @gsq0
                    public static final class BannerActionType {
                        private static final /* synthetic */ k4o $ENTRIES;
                        private static final /* synthetic */ BannerActionType[] $VALUES;
                        private static final i3y $cachedSerializer$delegate;
                        public static final h Companion;
                        public static final BannerActionType SELECT_TIME_SLOT;
                        public static final BannerActionType UNSUPPORTED;

                        static {
                            BannerActionType bannerActionType = new BannerActionType("SELECT_TIME_SLOT", 0);
                            SELECT_TIME_SLOT = bannerActionType;
                            BannerActionType bannerActionType2 = new BannerActionType("UNSUPPORTED", 1);
                            UNSUPPORTED = bannerActionType2;
                            BannerActionType[] bannerActionTypeArr = {bannerActionType, bannerActionType2};
                            $VALUES = bannerActionTypeArr;
                            $ENTRIES = kotlin.enums.a.a(bannerActionTypeArr);
                            Companion = new h();
                            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(8));
                        }

                        public static BannerActionType valueOf(String str) {
                            return (BannerActionType) Enum.valueOf(BannerActionType.class, str);
                        }

                        public static BannerActionType[] values() {
                            return (BannerActionType[]) $VALUES.clone();
                        }
                    }

                    public /* synthetic */ BannerActionDto(int i, BannerActionType bannerActionType, Calendar calendar) {
                        this.a = (i & 1) == 0 ? BannerActionType.UNSUPPORTED : bannerActionType;
                        if ((i & 2) == 0) {
                            this.b = null;
                        } else {
                            this.b = calendar;
                        }
                    }

                    public BannerActionDto() {
                        this.a = BannerActionType.UNSUPPORTED;
                        this.b = null;
                    }
                }

                public AppearanceBannerDto() {
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceButtonDto;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/data/api/dto/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class AppearanceButtonDto {
                public static final k Companion = new k();
                public final String a;
                public final String b;
                public final boolean c;

                public /* synthetic */ AppearanceButtonDto(String str, int i, String str2, boolean z) {
                    this.a = (i & 1) == 0 ? "" : str;
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = str2;
                    }
                    if ((i & 4) == 0) {
                        this.c = false;
                    } else {
                        this.c = z;
                    }
                }

                public AppearanceButtonDto() {
                    this.a = "";
                    this.b = null;
                    this.c = false;
                }
            }

            public AppearanceDto() {
                this.a = null;
                this.b = false;
                this.c = false;
                this.d = null;
                this.e = null;
            }
        }

        public TimeSlotDto() {
            this.a = TimeSlotTypeDto.UNKNOWN;
            this.b = null;
            this.c = null;
        }
    }
}
