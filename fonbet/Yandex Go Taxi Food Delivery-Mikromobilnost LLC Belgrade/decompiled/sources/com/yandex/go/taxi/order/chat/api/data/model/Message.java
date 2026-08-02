package com.yandex.go.taxi.order.chat.api.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w410;
import defpackage.zzs;
import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/Message;", "", "Companion", "Action", "$serializer", "com/yandex/go/taxi/order/chat/api/data/model/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Message {
    public static final c Companion = new c();
    public static final i3y[] i = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(24))};
    public final String a;
    public final Sender b;
    public final zzs c;
    public final String d;
    public final String e;
    public final Translation f;
    public final Calendar g;
    public final Action h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/Message$Action;", "", "Companion", "com/yandex/go/taxi/order/chat/api/data/model/b", "DRIVING", "I_AM_COMING", "WAITING", "USER_READY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Action DRIVING;
        public static final Action I_AM_COMING;
        public static final Action USER_READY;
        public static final Action WAITING;

        static {
            Action action = new Action("DRIVING", 0);
            DRIVING = action;
            Action action2 = new Action("I_AM_COMING", 1);
            I_AM_COMING = action2;
            Action action3 = new Action("WAITING", 2);
            WAITING = action3;
            Action action4 = new Action("USER_READY", 3);
            USER_READY = action4;
            Action[] actionArr = {action, action2, action3, action4};
            $VALUES = actionArr;
            $ENTRIES = kotlin.enums.a.a(actionArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(25));
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Message(int i2, String str, Sender sender, zzs zzsVar, String str2, String str3, Translation translation, Calendar calendar, Action action) {
        this.a = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.b = Sender.d;
        } else {
            this.b = sender;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = translation;
        }
        if ((i2 & 64) == 0) {
            this.g = Calendar.getInstance();
        } else {
            this.g = calendar;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = action;
        }
    }

    public Message(String str, Sender sender, zzs zzsVar, String str2, String str3, Translation translation, Calendar calendar, Action action) {
        this.a = str;
        this.b = sender;
        this.c = zzsVar;
        this.d = str2;
        this.e = str3;
        this.f = translation;
        this.g = calendar;
        this.h = action;
    }

    public Message() {
        this("", Sender.d, null, null, null, null, Calendar.getInstance(), null);
    }
}
