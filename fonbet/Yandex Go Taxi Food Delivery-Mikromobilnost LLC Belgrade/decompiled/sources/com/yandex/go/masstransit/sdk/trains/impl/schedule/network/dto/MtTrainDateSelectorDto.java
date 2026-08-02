package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto;", "", "Companion", "a", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/d", "ShowCalendar", "DatePicker", "ReloadSchedule", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/j", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainDateSelectorDto {
    public static final e Companion = new e();
    public final FormattedText a;
    public final String b;
    public final String c;
    public final a d;

    @gsq0(with = d.class)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$a;", "", "<init>", "()V", "Companion", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static class a {
        public static final c Companion = new c();
    }

    public /* synthetic */ MtTrainDateSelectorDto(int i, FormattedText formattedText, String str, String str2, a aVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainDateSelectorDto)) {
            return false;
        }
        MtTrainDateSelectorDto mtTrainDateSelectorDto = (MtTrainDateSelectorDto) obj;
        return jl40.l(this.a, mtTrainDateSelectorDto.a) && jl40.l(this.b, mtTrainDateSelectorDto.b) && jl40.l(this.c, mtTrainDateSelectorDto.c) && jl40.l(this.d, mtTrainDateSelectorDto.d);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int b = unr0.b(unr0.b((formattedText == null ? 0 : formattedText.a.hashCode()) * 31, 31, this.b), 31, this.c);
        a aVar = this.d;
        return b + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MtTrainDateSelectorDto(title=" + this.a + ", accessibilityText=" + this.b + ", id=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$ReloadSchedule;", "Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$a;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ReloadSchedule extends a {
        public static final h Companion = new h();
        public final String a;

        public /* synthetic */ ReloadSchedule(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public ReloadSchedule() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$ShowCalendar;", "Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$a;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ShowCalendar extends a {
        public static final i Companion = new i();
        public final DatePicker a;

        public /* synthetic */ ShowCalendar(int i, DatePicker datePicker) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = datePicker;
            }
        }

        public ShowCalendar() {
            this.a = null;
        }
    }

    public MtTrainDateSelectorDto() {
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$DatePicker;", "", "Companion", "DateInterval", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DatePicker {
        public static final f Companion = new f();
        public final Integer a;
        public final String b;
        public final FormattedText c;
        public final FormattedText d;
        public final FormattedText e;
        public final FormattedText f;
        public final String g;
        public final DateInterval h;

        public /* synthetic */ DatePicker(int i, Integer num, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, String str2, DateInterval dateInterval) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = formattedText3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = formattedText4;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str2;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = dateInterval;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$DatePicker$DateInterval;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class DateInterval {
            public static final g Companion = new g();
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;

            public /* synthetic */ DateInterval(String str, String str2, String str3, String str4, int i, String str5) {
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
                    this.d = str4;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = str5;
                }
            }

            public DateInterval() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
            }
        }

        public DatePicker(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }

        public DatePicker() {
            this(0);
        }
    }
}
