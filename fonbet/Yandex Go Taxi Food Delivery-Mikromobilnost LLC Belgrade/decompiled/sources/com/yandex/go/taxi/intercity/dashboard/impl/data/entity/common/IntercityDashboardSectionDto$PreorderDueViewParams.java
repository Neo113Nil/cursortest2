package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$PreorderDueViewParams", "", "Companion", "Type", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSectionDto$PreorderDueViewParams {
    public static final y Companion = new y();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(23)), null};
    public final Type a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$PreorderDueViewParams$Type;", "", "Companion", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/z", "DEFAULT", "TIMETABLE", "TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION", "DEEPLINK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final z Companion;
        public static final Type DEEPLINK;
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
            Type type4 = new Type("DEEPLINK", 3);
            DEEPLINK = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new z();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(24));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ IntercityDashboardSectionDto$PreorderDueViewParams(int i, Type type, String str) {
        this.a = (i & 1) == 0 ? Type.DEFAULT : type;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public IntercityDashboardSectionDto$PreorderDueViewParams() {
        this.a = Type.DEFAULT;
        this.b = null;
    }
}
