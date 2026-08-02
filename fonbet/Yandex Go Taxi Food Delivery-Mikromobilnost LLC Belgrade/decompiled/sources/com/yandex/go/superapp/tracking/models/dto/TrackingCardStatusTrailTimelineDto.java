package com.yandex.go.superapp.tracking.models.dto;

import defpackage.b501;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nhz0;
import defpackage.oyr;
import defpackage.r9v;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusTrailTimelineDto;", "Lb501;", "Companion", "CurrentStatus", "StatusOutline", "$serializer", "com/yandex/go/superapp/tracking/models/dto/w", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardStatusTrailTimelineDto implements b501 {
    public static final w Companion = new w();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(25))};
    public final CurrentStatus a;
    public final List b;

    public /* synthetic */ TrackingCardStatusTrailTimelineDto(int i, CurrentStatus currentStatus, List list) {
        this.a = (i & 1) == 0 ? null : currentStatus;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final CurrentStatus getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardStatusTrailTimelineDto)) {
            return false;
        }
        TrackingCardStatusTrailTimelineDto trackingCardStatusTrailTimelineDto = (TrackingCardStatusTrailTimelineDto) obj;
        return jl40.l(this.a, trackingCardStatusTrailTimelineDto.a) && jl40.l(this.b, trackingCardStatusTrailTimelineDto.b);
    }

    public final int hashCode() {
        CurrentStatus currentStatus = this.a;
        return this.b.hashCode() + ((currentStatus == null ? 0 : currentStatus.hashCode()) * 31);
    }

    public final String toString() {
        return "TrackingCardStatusTrailTimelineDto(currentStatus=" + this.a + ", statusOutlines=" + this.b + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusTrailTimelineDto$StatusOutline;", "", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/y", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class StatusOutline {
        public static final y Companion = new y();
        public final String a;

        public /* synthetic */ StatusOutline(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusOutline) && jl40.l(this.a, ((StatusOutline) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("StatusOutline(color=", this.a, Extension.C_BRAKE);
        }

        public StatusOutline() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusTrailTimelineDto$CurrentStatus;", "", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/x", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CurrentStatus {
        public static final x Companion = new x();
        public final r9v a;
        public final String b;

        public /* synthetic */ CurrentStatus(int i, r9v r9vVar, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = r9vVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final r9v getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrentStatus)) {
                return false;
            }
            CurrentStatus currentStatus = (CurrentStatus) obj;
            return jl40.l(this.a, currentStatus.a) && jl40.l(this.b, currentStatus.b);
        }

        public final int hashCode() {
            r9v r9vVar = this.a;
            int hashCode = (r9vVar == null ? 0 : r9vVar.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "CurrentStatus(image=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
        }

        public CurrentStatus() {
            this.a = null;
            this.b = null;
        }
    }

    public TrackingCardStatusTrailTimelineDto() {
        this.a = null;
        this.b = EmptyList.a;
    }
}
