package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rfa0;
import defpackage.v4m0;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due/data/api/dto/ScheduledOrderAvailabilityRequest;", "", "Companion", "ScheduledOrderView", "OpenOrigin", "$serializer", "com/yandex/go/due/data/api/dto/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScheduledOrderAvailabilityRequest {
    public static final k Companion = new k();
    public static final i3y[] k;
    public final List a;
    public final String b;
    public final List c;
    public final Calendar d;
    public final Boolean e;
    public final String f;
    public final ScheduledOrderView g;
    public final OpenOrigin h;
    public final rfa0 i;
    public final List j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due/data/api/dto/ScheduledOrderAvailabilityRequest$OpenOrigin;", "", "Companion", "com/yandex/go/due/data/api/dto/l", "SUMMARY", "INTERCITY_DASHBOARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class OpenOrigin {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OpenOrigin[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final l Companion;
        public static final OpenOrigin INTERCITY_DASHBOARD;
        public static final OpenOrigin SUMMARY;

        static {
            OpenOrigin openOrigin = new OpenOrigin("SUMMARY", 0);
            SUMMARY = openOrigin;
            OpenOrigin openOrigin2 = new OpenOrigin("INTERCITY_DASHBOARD", 1);
            INTERCITY_DASHBOARD = openOrigin2;
            OpenOrigin[] openOriginArr = {openOrigin, openOrigin2};
            $VALUES = openOriginArr;
            $ENTRIES = kotlin.enums.a.a(openOriginArr);
            Companion = new l();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(17));
        }

        public static OpenOrigin valueOf(String str) {
            return (OpenOrigin) Enum.valueOf(OpenOrigin.class, str);
        }

        public static OpenOrigin[] values() {
            return (OpenOrigin[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new v4m0(13)), null, kotlin.a.b(lazyThreadSafetyMode, new v4m0(14)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new v4m0(15)), null, kotlin.a.b(lazyThreadSafetyMode, new v4m0(16))};
    }

    public /* synthetic */ ScheduledOrderAvailabilityRequest(int i, List list, String str, List list2, Calendar calendar, Boolean bool, String str2, ScheduledOrderView scheduledOrderView, OpenOrigin openOrigin, rfa0 rfa0Var, List list3) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = calendar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = scheduledOrderView;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = openOrigin;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = rfa0Var;
        }
        if ((i & 512) == 0) {
            this.j = emptyList;
        } else {
            this.j = list3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due/data/api/dto/ScheduledOrderAvailabilityRequest$ScheduledOrderView;", "", "Companion", "Type", "$serializer", "com/yandex/go/due/data/api/dto/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ScheduledOrderView {
        public static final m Companion = new m();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(18))};
        public final Type a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due/data/api/dto/ScheduledOrderAvailabilityRequest$ScheduledOrderView$Type;", "", "Companion", "com/yandex/go/due/data/api/dto/n", "DEFAULT", "TIMETABLE", "TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final n Companion;
            public static final Type DEFAULT;
            public static final Type TIMETABLE;
            public static final Type TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION;

            static {
                Type type = new Type("DEFAULT", 0);
                DEFAULT = type;
                Type type2 = new Type("TIMETABLE", 1);
                TIMETABLE = type2;
                Type type3 = new Type("TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION", 2);
                TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION = type3;
                Type[] typeArr = {type, type2, type3};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new n();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(19));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ ScheduledOrderView(int i, Type type) {
            if ((i & 1) == 0) {
                this.a = Type.DEFAULT;
            } else {
                this.a = type;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScheduledOrderView) && this.a == ((ScheduledOrderView) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public ScheduledOrderView(Type type) {
            this.a = type;
        }

        public ScheduledOrderView() {
            this(Type.DEFAULT);
        }
    }

    public ScheduledOrderAvailabilityRequest(List list, String str, List list2, Calendar calendar, Boolean bool, String str2, ScheduledOrderView scheduledOrderView, OpenOrigin openOrigin, rfa0 rfa0Var, List list3) {
        this.a = list;
        this.b = str;
        this.c = list2;
        this.d = calendar;
        this.e = bool;
        this.f = str2;
        this.g = scheduledOrderView;
        this.h = openOrigin;
        this.i = rfa0Var;
        this.j = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScheduledOrderAvailabilityRequest() {
        this(r1, "", r1, null, null, null, null, null, null, r1);
        EmptyList emptyList = EmptyList.a;
    }
}
