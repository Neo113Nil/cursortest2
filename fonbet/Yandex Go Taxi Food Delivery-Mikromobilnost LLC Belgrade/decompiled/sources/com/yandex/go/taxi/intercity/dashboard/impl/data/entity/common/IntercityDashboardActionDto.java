package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import defpackage.k4o;
import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardActionDto;", "", "Companion", "ActionType", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardActionDto {
    public static final e Companion = new e();
    public static final i3y[] i = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(6)), null, null, null, null, null, null, null};
    public final ActionType a;
    public final Calendar b;
    public final String c;
    public final String d;
    public final kotlinx.serialization.json.b e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardActionDto$ActionType;", "", "Companion", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/d", "HAPPY_HOURS", "DISCOVERY", "DEEPLINK", "SHOW_POPUP", "URL", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final ActionType DEEPLINK;
        public static final ActionType DISCOVERY;
        public static final ActionType HAPPY_HOURS;
        public static final ActionType SHOW_POPUP;
        public static final ActionType UNSUPPORTED;
        public static final ActionType URL;

        static {
            ActionType actionType = new ActionType("HAPPY_HOURS", 0);
            HAPPY_HOURS = actionType;
            ActionType actionType2 = new ActionType("DISCOVERY", 1);
            DISCOVERY = actionType2;
            ActionType actionType3 = new ActionType("DEEPLINK", 2);
            DEEPLINK = actionType3;
            ActionType actionType4 = new ActionType("SHOW_POPUP", 3);
            SHOW_POPUP = actionType4;
            ActionType actionType5 = new ActionType("URL", 4);
            URL = actionType5;
            ActionType actionType6 = new ActionType("UNSUPPORTED", 5);
            UNSUPPORTED = actionType6;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6};
            $VALUES = actionTypeArr;
            $ENTRIES = kotlin.enums.a.a(actionTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(7));
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ IntercityDashboardActionDto(int i2, ActionType actionType, Calendar calendar, String str, String str2, kotlinx.serialization.json.b bVar, String str3, String str4, String str5) {
        this.a = (i2 & 1) == 0 ? ActionType.UNSUPPORTED : actionType;
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = calendar;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
    }

    public IntercityDashboardActionDto() {
        this.a = ActionType.UNSUPPORTED;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
