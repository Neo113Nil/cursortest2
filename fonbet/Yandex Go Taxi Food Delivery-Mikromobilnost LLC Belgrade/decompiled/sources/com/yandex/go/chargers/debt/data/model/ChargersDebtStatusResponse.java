package com.yandex.go.chargers.debt.data.model;

import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/debt/data/model/ChargersDebtStatusResponse;", "", "Companion", "Status", "$serializer", "com/yandex/go/chargers/debt/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDebtStatusResponse {
    public static final b Companion = new b();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(18)), null};
    public final Status a;
    public final ChargersErrorDetailsDto b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/debt/data/model/ChargersDebtStatusResponse$Status;", "", "Companion", "com/yandex/go/chargers/debt/data/model/c", "SUCCESS", "PENDING", "FAILED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final Status FAILED;
        public static final Status PENDING;
        public static final Status SUCCESS;

        static {
            Status status = new Status("SUCCESS", 0);
            SUCCESS = status;
            Status status2 = new Status("PENDING", 1);
            PENDING = status2;
            Status status3 = new Status("FAILED", 2);
            FAILED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(19));
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChargersDebtStatusResponse(int i, Status status, ChargersErrorDetailsDto chargersErrorDetailsDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = status;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = chargersErrorDetailsDto;
        }
    }

    public ChargersDebtStatusResponse() {
        this.a = null;
        this.b = null;
    }
}
