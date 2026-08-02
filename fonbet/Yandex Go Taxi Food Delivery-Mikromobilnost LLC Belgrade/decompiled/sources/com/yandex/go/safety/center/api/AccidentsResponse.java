package com.yandex.go.safety.center.api;

import com.yandex.go.safety.center.api.AccidentsResponse;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pd;
import defpackage.sls;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/safety/center/api/AccidentsResponse;", "", "Companion", "Accident", "Status", "$serializer", "com/yandex/go/safety/center/api/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccidentsResponse {
    public static final c Companion = new c();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(5))};
    public final List a;
    public final i3y b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/safety/center/api/AccidentsResponse$Status;", "", "Companion", "com/yandex/go/safety/center/api/d", "QUESTIONABLE", "UNCONFIRMED", "CONFIRMED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Status CONFIRMED;
        public static final d Companion;
        public static final Status QUESTIONABLE;
        public static final Status UNCONFIRMED;

        static {
            Status status = new Status("QUESTIONABLE", 0);
            QUESTIONABLE = status;
            Status status2 = new Status("UNCONFIRMED", 1);
            UNCONFIRMED = status2;
            Status status3 = new Status("CONFIRMED", 2);
            CONFIRMED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(7));
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AccidentsResponse(int i, List list) {
        final int i2 = 1;
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
        this.b = kotlin.a.a(new sls(this) { // from class: wi
            public final /* synthetic */ AccidentsResponse b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Object obj;
                Object obj2;
                int i3 = i2;
                Object obj3 = null;
                AccidentsResponse accidentsResponse = this.b;
                switch (i3) {
                    case 0:
                        List list2 = accidentsResponse.a;
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((AccidentsResponse.Accident) obj).b == AccidentsResponse.Status.QUESTIONABLE) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        AccidentsResponse.Accident accident = (AccidentsResponse.Accident) obj;
                        if (accident != null) {
                            return accident;
                        }
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((AccidentsResponse.Accident) next).b == AccidentsResponse.Status.CONFIRMED) {
                                    obj3 = next;
                                }
                            }
                        }
                        return (AccidentsResponse.Accident) obj3;
                    default:
                        List list3 = accidentsResponse.a;
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (((AccidentsResponse.Accident) obj2).b == AccidentsResponse.Status.QUESTIONABLE) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        AccidentsResponse.Accident accident2 = (AccidentsResponse.Accident) obj2;
                        if (accident2 != null) {
                            return accident2;
                        }
                        Iterator it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                Object next2 = it4.next();
                                if (((AccidentsResponse.Accident) next2).b == AccidentsResponse.Status.CONFIRMED) {
                                    obj3 = next2;
                                }
                            }
                        }
                        return (AccidentsResponse.Accident) obj3;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/api/AccidentsResponse$Accident;", "", "Companion", "$serializer", "com/yandex/go/safety/center/api/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Accident {
        public static final b Companion = new b();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(6))};
        public final String a;
        public final Status b;

        public /* synthetic */ Accident(int i, String str, Status status) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = status;
            }
        }

        public Accident() {
            this.a = "";
            this.b = null;
        }
    }

    public AccidentsResponse() {
        this.a = EmptyList.a;
        final int i = 0;
        this.b = kotlin.a.a(new sls(this) { // from class: wi
            public final /* synthetic */ AccidentsResponse b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Object obj;
                Object obj2;
                int i3 = i;
                Object obj3 = null;
                AccidentsResponse accidentsResponse = this.b;
                switch (i3) {
                    case 0:
                        List list2 = accidentsResponse.a;
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((AccidentsResponse.Accident) obj).b == AccidentsResponse.Status.QUESTIONABLE) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        AccidentsResponse.Accident accident = (AccidentsResponse.Accident) obj;
                        if (accident != null) {
                            return accident;
                        }
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((AccidentsResponse.Accident) next).b == AccidentsResponse.Status.CONFIRMED) {
                                    obj3 = next;
                                }
                            }
                        }
                        return (AccidentsResponse.Accident) obj3;
                    default:
                        List list3 = accidentsResponse.a;
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (((AccidentsResponse.Accident) obj2).b == AccidentsResponse.Status.QUESTIONABLE) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        AccidentsResponse.Accident accident2 = (AccidentsResponse.Accident) obj2;
                        if (accident2 != null) {
                            return accident2;
                        }
                        Iterator it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                Object next2 = it4.next();
                                if (((AccidentsResponse.Accident) next2).b == AccidentsResponse.Status.CONFIRMED) {
                                    obj3 = next2;
                                }
                            }
                        }
                        return (AccidentsResponse.Accident) obj3;
                }
            }
        });
    }
}
