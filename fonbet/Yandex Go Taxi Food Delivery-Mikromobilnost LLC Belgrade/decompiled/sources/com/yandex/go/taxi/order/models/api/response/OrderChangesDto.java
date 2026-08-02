package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.fd60;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jl70;
import defpackage.k4o;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.yu0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto;", "", "Companion", "ChangesPayload", "PendingChangeDto", "Notification", "Status", "a", "com/yandex/go/taxi/order/models/api/response/z0", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderChangesDto {
    public static final z0 Companion = new z0();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(5))};
    public final String a;
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto$Status;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/c1", "SUCCESS", "PENDING", "FAILED", "UNAVAILABLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c1 Companion;
        public static final Status FAILED;
        public static final Status PENDING;
        public static final Status SUCCESS;
        public static final Status UNAVAILABLE;

        static {
            Status status = new Status("SUCCESS", 0);
            SUCCESS = status;
            Status status2 = new Status("PENDING", 1);
            PENDING = status2;
            Status status3 = new Status("FAILED", 2);
            FAILED = status3;
            Status status4 = new Status("UNAVAILABLE", 3);
            UNAVAILABLE = status4;
            Status[] statusArr = {status, status2, status3, status4};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
            Companion = new c1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(9));
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public static final class a {
        public final LinkedHashMap a = new LinkedHashMap();

        public final void a(String str, String str2) {
            yu0 yu0Var = new yu0(16, new fd60(23));
            LinkedHashMap linkedHashMap = this.a;
            List list = (List) linkedHashMap.computeIfAbsent(str, yu0Var);
            if (!linkedHashMap.containsKey(str2)) {
                list.add(new PendingChangeDto(str2, 14));
            }
            linkedHashMap.put(str, list);
        }
    }

    public /* synthetic */ OrderChangesDto(int i, String str, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final ChangesPayload a(String str) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((ChangesPayload) obj).a, str)) {
                break;
            }
        }
        return (ChangesPayload) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderChangesDto)) {
            return false;
        }
        OrderChangesDto orderChangesDto = (OrderChangesDto) obj;
        return jl40.l(this.a, orderChangesDto.a) && jl40.l(this.b, orderChangesDto.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nnm.h("OrderChangesDto(id=", this.a, ", orders=", Extension.C_BRAKE, this.b);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto$ChangesPayload;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/y0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ChangesPayload {
        public static final y0 Companion = new y0();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(6))};
        public final String a;
        public final List b;

        public /* synthetic */ ChangesPayload(int i, String str, List list) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public final PendingChangeDto a(String str) {
            Object obj;
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((PendingChangeDto) obj).a, str)) {
                    break;
                }
            }
            return (PendingChangeDto) obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangesPayload)) {
                return false;
            }
            ChangesPayload changesPayload = (ChangesPayload) obj;
            return jl40.l(this.a, changesPayload.a) && jl40.l(this.b, changesPayload.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return nnm.h("ChangesPayload(orderId=", this.a, ", changes=", Extension.C_BRAKE, this.b);
        }

        public ChangesPayload(String str, List list) {
            this.a = str;
            this.b = list;
        }

        public ChangesPayload() {
            this(null, EmptyList.a);
        }
    }

    public OrderChangesDto(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public OrderChangesDto() {
        this(null, EmptyList.a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto$PendingChangeDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/b1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PendingChangeDto {
        public static final b1 Companion = new b1();
        public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(8)), null, null};
        public final String a;
        public final Status b;
        public final String c;
        public final Notification d;

        public /* synthetic */ PendingChangeDto(int i, String str, Status status, String str2, Notification notification) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = status;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = notification;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingChangeDto)) {
                return false;
            }
            PendingChangeDto pendingChangeDto = (PendingChangeDto) obj;
            return jl40.l(this.a, pendingChangeDto.a) && this.b == pendingChangeDto.b && jl40.l(this.c, pendingChangeDto.c) && jl40.l(this.d, pendingChangeDto.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Status status = this.b;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Notification notification = this.d;
            return hashCode3 + (notification != null ? notification.hashCode() : 0);
        }

        public final String toString() {
            return "PendingChangeDto(changeId=" + this.a + ", status=" + this.b + ", name=" + this.c + ", notification=" + this.d + Extension.C_BRAKE;
        }

        public PendingChangeDto() {
            this(null, 15);
        }

        public PendingChangeDto(String str, int i) {
            this.a = (i & 1) != 0 ? "" : str;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto$Notification;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/a1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Notification {
        public static final a1 Companion = new a1();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(7))};
        public final String a;
        public final String b;
        public final String c;
        public final ChangeOrderNotificationActionResponse d;

        public /* synthetic */ Notification(int i, String str, String str2, String str3, ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = ChangeOrderNotificationActionResponse.NONE;
            } else {
                this.d = changeOrderNotificationActionResponse;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) obj;
            return jl40.l(this.a, notification.a) && jl40.l(this.b, notification.b) && jl40.l(this.c, notification.c) && this.d == notification.d;
        }

        public final int hashCode() {
            int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder v = b64.v("Notification(iconTag=", this.a, ", title=", this.b, ", subtitle=");
            v.append(this.c);
            v.append(", action=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public Notification() {
            this((String) null, (String) null, (String) null, (ChangeOrderNotificationActionResponse) null, 15);
        }

        public Notification(String str, String str2, String str3, ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse, int i) {
            str = (i & 1) != 0 ? "" : str;
            str2 = (i & 2) != 0 ? "" : str2;
            str3 = (i & 4) != 0 ? null : str3;
            changeOrderNotificationActionResponse = (i & 8) != 0 ? ChangeOrderNotificationActionResponse.NONE : changeOrderNotificationActionResponse;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = changeOrderNotificationActionResponse;
        }
    }
}
