package com.yandex.go.taxi.order.change.requirements.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/change/requirements/api/ChangeRequirementsResponse;", "", "Companion", "ChangeStatus", "$serializer", "com/yandex/go/taxi/order/change/requirements/api/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChangeRequirementsResponse {
    public static final c Companion = new c();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(13)), null, null};
    public final ChangeStatus a;
    public final String b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/change/requirements/api/ChangeRequirementsResponse$ChangeStatus;", "", "Companion", "com/yandex/go/taxi/order/change/requirements/api/b", "PENDING", "FAILED", "UNAVAILABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChangeStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ChangeStatus[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final ChangeStatus FAILED;
        public static final ChangeStatus PENDING;
        public static final ChangeStatus UNAVAILABLE;

        static {
            ChangeStatus changeStatus = new ChangeStatus("PENDING", 0);
            PENDING = changeStatus;
            ChangeStatus changeStatus2 = new ChangeStatus("FAILED", 1);
            FAILED = changeStatus2;
            ChangeStatus changeStatus3 = new ChangeStatus("UNAVAILABLE", 2);
            UNAVAILABLE = changeStatus3;
            ChangeStatus[] changeStatusArr = {changeStatus, changeStatus2, changeStatus3};
            $VALUES = changeStatusArr;
            $ENTRIES = kotlin.enums.a.a(changeStatusArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(14));
        }

        public static ChangeStatus valueOf(String str) {
            return (ChangeStatus) Enum.valueOf(ChangeStatus.class, str);
        }

        public static ChangeStatus[] values() {
            return (ChangeStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChangeRequirementsResponse(int i, ChangeStatus changeStatus, String str, String str2) {
        this.a = (i & 1) == 0 ? ChangeStatus.FAILED : changeStatus;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeRequirementsResponse)) {
            return false;
        }
        ChangeRequirementsResponse changeRequirementsResponse = (ChangeRequirementsResponse) obj;
        return this.a == changeRequirementsResponse.a && jl40.l(this.b, changeRequirementsResponse.b) && jl40.l(this.c, changeRequirementsResponse.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeRequirementsResponse(status=");
        sb.append(this.a);
        sb.append(", changeId=");
        sb.append(this.b);
        sb.append(", reason=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public ChangeRequirementsResponse() {
        this.a = ChangeStatus.FAILED;
        this.b = "";
        this.c = null;
    }
}
