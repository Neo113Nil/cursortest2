package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.k4o;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/AfterCancelPopupButton;", "", "Companion", "com/yandex/go/taxi/order/models/api/cancel/t", "cj1", "ActionType", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/u", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AfterCancelPopupButton {
    public static final u Companion = new u();
    public final String a;
    public final String b;
    public final String c;
    public final t d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/AfterCancelPopupButton$ActionType;", "", "TO_SUMMARY", "DEEPLINK", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType DEEPLINK;
        public static final ActionType TO_SUMMARY;
        public static final ActionType UNKNOWN;

        static {
            ActionType actionType = new ActionType("TO_SUMMARY", 0);
            TO_SUMMARY = actionType;
            ActionType actionType2 = new ActionType("DEEPLINK", 1);
            DEEPLINK = actionType2;
            ActionType actionType3 = new ActionType("UNKNOWN", 2);
            UNKNOWN = actionType3;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
            $VALUES = actionTypeArr;
            $ENTRIES = kotlin.enums.a.a(actionTypeArr);
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AfterCancelPopupButton(int i, String str, String str2, String str3, t tVar) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = s.INSTANCE;
        } else {
            this.d = tVar;
        }
    }

    public AfterCancelPopupButton() {
        s sVar = s.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = sVar;
    }
}
