package com.yandex.go.agreement.api.trackable.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nhz0;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/agreement/api/trackable/network/TrackableAcceptanceActionParam;", "", "Companion", "Status", "$serializer", "com/yandex/go/agreement/api/trackable/network/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TrackableAcceptanceActionParam {
    public static final b Companion = new b();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(16))};
    public final String a;
    public final String b;
    public final String c;
    public final Status d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/agreement/api/trackable/network/TrackableAcceptanceActionParam$Status;", "", "Companion", "com/yandex/go/agreement/api/trackable/network/c", "ACCEPTED", "REJECTED", "VIEWED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Status ACCEPTED;
        public static final c Companion;
        public static final Status REJECTED;
        public static final Status VIEWED;

        static {
            Status status = new Status("ACCEPTED", 0);
            ACCEPTED = status;
            Status status2 = new Status("REJECTED", 1);
            REJECTED = status2;
            Status status3 = new Status("VIEWED", 2);
            VIEWED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(17));
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TrackableAcceptanceActionParam(int i, Status status, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = status;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackableAcceptanceActionParam)) {
            return false;
        }
        TrackableAcceptanceActionParam trackableAcceptanceActionParam = (TrackableAcceptanceActionParam) obj;
        return jl40.l(this.a, trackableAcceptanceActionParam.a) && jl40.l(this.b, trackableAcceptanceActionParam.b) && jl40.l(this.c, trackableAcceptanceActionParam.c) && this.d == trackableAcceptanceActionParam.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Status status = this.d;
        return b + (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TrackableAcceptanceActionParam(eulaId=", this.a, ", orderId=", this.b, ", zoneName=");
        v.append(this.c);
        v.append(", status=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackableAcceptanceActionParam() {
        this((String) null, (String) (0 == true ? 1 : 0), (Status) (0 == true ? 1 : 0), 15);
    }

    public TrackableAcceptanceActionParam(Status status, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = status;
    }

    public /* synthetic */ TrackableAcceptanceActionParam(String str, String str2, Status status, int i) {
        this((i & 8) != 0 ? null : status, (i & 1) != 0 ? "" : str, (String) null, (i & 4) != 0 ? "" : str2);
    }
}
