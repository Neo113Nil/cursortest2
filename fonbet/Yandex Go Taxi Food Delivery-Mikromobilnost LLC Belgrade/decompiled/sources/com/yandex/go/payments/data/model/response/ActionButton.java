package com.yandex.go.payments.data.model.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/ActionButton;", "", "Companion", "ActionType", "com/yandex/go/payments/data/model/response/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionButton {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(13))};
    public static final ActionButton d = new ActionButton(0);
    public final String a;
    public final ActionType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/response/ActionButton$ActionType;", "", "Companion", "com/yandex/go/payments/data/model/response/a", "CLOSE", "START_BINDING", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ActionType CLOSE;
        public static final a Companion;
        public static final ActionType START_BINDING;
        public static final ActionType UNKNOWN;

        static {
            ActionType actionType = new ActionType("CLOSE", 0);
            CLOSE = actionType;
            ActionType actionType2 = new ActionType("START_BINDING", 1);
            START_BINDING = actionType2;
            ActionType actionType3 = new ActionType("UNKNOWN", 2);
            UNKNOWN = actionType3;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
            $VALUES = actionTypeArr;
            $ENTRIES = kotlin.enums.a.a(actionTypeArr);
            Companion = new a();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(14));
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ActionButton(int i, String str, ActionType actionType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ActionType.UNKNOWN;
        } else {
            this.b = actionType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return jl40.l(this.a, actionButton.a) && this.b == actionButton.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionButton(title=" + this.a + ", actionType=" + this.b + Extension.C_BRAKE;
    }

    public ActionButton() {
        this(0);
    }

    public ActionButton(int i) {
        ActionType actionType = ActionType.UNKNOWN;
        this.a = "";
        this.b = actionType;
    }
}
