package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.sjk0;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "TimelineItem", "TimelineInfo", "TimelineType", "$serializer", "com/yandex/go/taxi/order/models/api/response/g6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$Timeline extends a7 {
    public static final g6 Companion = new g6();
    public static final i3y[] i;
    public final String a;
    public final String b;
    public final String c;
    public final TimelineType d;
    public final String e;
    public final List f;
    public final TimelineInfo g;
    public final TimelineAdditionalOrderOptionsInfo h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline$TimelineType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/p6", "HORIZONTAL_COMPACT", "HORIZONTAL_REGULAR", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TimelineType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TimelineType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final p6 Companion;
        public static final TimelineType HORIZONTAL_COMPACT;
        public static final TimelineType HORIZONTAL_REGULAR;
        public static final TimelineType UNKNOWN;

        static {
            TimelineType timelineType = new TimelineType("HORIZONTAL_COMPACT", 0);
            HORIZONTAL_COMPACT = timelineType;
            TimelineType timelineType2 = new TimelineType("HORIZONTAL_REGULAR", 1);
            HORIZONTAL_REGULAR = timelineType2;
            TimelineType timelineType3 = new TimelineType("UNKNOWN", 2);
            UNKNOWN = timelineType3;
            TimelineType[] timelineTypeArr = {timelineType, timelineType2, timelineType3};
            $VALUES = timelineTypeArr;
            $ENTRIES = kotlin.enums.a.a(timelineTypeArr);
            Companion = new p6();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(13));
        }

        public static TimelineType valueOf(String str) {
            return (TimelineType) Enum.valueOf(TimelineType.class, str);
        }

        public static TimelineType[] values() {
            return (TimelineType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new sjk0(10)), null, kotlin.a.b(lazyThreadSafetyMode, new sjk0(11)), null, null};
    }

    public RideCardItemDto$Timeline(int i2, String str, String str2, String str3, TimelineType timelineType, String str4, List list, TimelineInfo timelineInfo, TimelineAdditionalOrderOptionsInfo timelineAdditionalOrderOptionsInfo) {
        if ((i2 & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = TimelineType.UNKNOWN;
        } else {
            this.d = timelineType;
        }
        if ((i2 & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = timelineInfo;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = timelineAdditionalOrderOptionsInfo;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$Timeline)) {
            return false;
        }
        RideCardItemDto$Timeline rideCardItemDto$Timeline = (RideCardItemDto$Timeline) obj;
        return jl40.l(this.a, rideCardItemDto$Timeline.a) && jl40.l(this.b, rideCardItemDto$Timeline.b) && jl40.l(this.c, rideCardItemDto$Timeline.c) && this.d == rideCardItemDto$Timeline.d && jl40.l(this.e, rideCardItemDto$Timeline.e) && jl40.l(this.f, rideCardItemDto$Timeline.f) && jl40.l(this.g, rideCardItemDto$Timeline.g) && jl40.l(this.h, rideCardItemDto$Timeline.h);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int c = unr0.c(unr0.b((this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        TimelineInfo timelineInfo = this.g;
        int hashCode3 = (c + (timelineInfo == null ? 0 : timelineInfo.hashCode())) * 31;
        TimelineAdditionalOrderOptionsInfo timelineAdditionalOrderOptionsInfo = this.h;
        return hashCode3 + (timelineAdditionalOrderOptionsInfo != null ? timelineAdditionalOrderOptionsInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Timeline(id=", this.a, ", analyticsId=", this.b, ", accessibility=");
        v.append(this.c);
        v.append(", timelineType=");
        v.append(this.d);
        v.append(", currentItemId=");
        tse0.x(this.e, ", items=", ", timelineInfo=", v, this.f);
        v.append(this.g);
        v.append(", additionalOrderOptionsInfo=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline$TimelineInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/h6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TimelineInfo {
        public static final h6 Companion = new h6();
        public final SlotItemDto a;

        public /* synthetic */ TimelineInfo(int i, SlotItemDto slotItemDto) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = slotItemDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimelineInfo) && jl40.l(this.a, ((TimelineInfo) obj).a);
        }

        public final int hashCode() {
            SlotItemDto slotItemDto = this.a;
            if (slotItemDto == null) {
                return 0;
            }
            return slotItemDto.hashCode();
        }

        public final String toString() {
            return "TimelineInfo(bubble=" + this.a + Extension.C_BRAKE;
        }

        public TimelineInfo() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Timeline$TimelineItem;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/n6", "com/yandex/go/taxi/order/models/api/response/o6", "$serializer", "com/yandex/go/taxi/order/models/api/response/i6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TimelineItem {
        public static final i6 Companion = new i6();
        public final String a;
        public final n6 b;

        public /* synthetic */ TimelineItem(int i, String str, n6 n6Var) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = m6.INSTANCE;
            } else {
                this.b = n6Var;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimelineItem)) {
                return false;
            }
            TimelineItem timelineItem = (TimelineItem) obj;
            return jl40.l(this.a, timelineItem.a) && jl40.l(this.b, timelineItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TimelineItem(id=" + this.a + ", content=" + this.b + Extension.C_BRAKE;
        }

        public TimelineItem() {
            m6 m6Var = m6.INSTANCE;
            this.a = "";
            this.b = m6Var;
        }
    }

    public RideCardItemDto$Timeline() {
        TimelineType timelineType = TimelineType.UNKNOWN;
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = timelineType;
        this.e = "";
        this.f = EmptyList.a;
        this.g = null;
        this.h = null;
    }
}
