package com.yandex.go.zone.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.xlw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/response/TariffAction;", "", "Companion", "Action", "ActionType", "$serializer", "com/yandex/go/zone/dto/response/k", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TariffAction {
    public static final k Companion = new k();
    public final String a;
    public final Action b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/response/TariffAction$ActionType;", "", "Companion", "com/yandex/go/zone/dto/response/j", "SHOW_EULA_AND_WAIT_FOR_ACCEPT", "UNKNOWN", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final j Companion;
        public static final ActionType SHOW_EULA_AND_WAIT_FOR_ACCEPT;
        public static final ActionType UNKNOWN;

        static {
            ActionType actionType = new ActionType("SHOW_EULA_AND_WAIT_FOR_ACCEPT", 0);
            SHOW_EULA_AND_WAIT_FOR_ACCEPT = actionType;
            ActionType actionType2 = new ActionType("UNKNOWN", 1);
            UNKNOWN = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            $VALUES = actionTypeArr;
            $ENTRIES = kotlin.enums.a.a(actionTypeArr);
            Companion = new j();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(16));
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TariffAction(int i, String str, Action action) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = action;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffAction)) {
            return false;
        }
        TariffAction tariffAction = (TariffAction) obj;
        return jl40.l(this.a, tariffAction.a) && jl40.l(this.b, tariffAction.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Action action = this.b;
        return hashCode + (action != null ? action.hashCode() : 0);
    }

    public final String toString() {
        return "TariffAction(on=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/response/TariffAction$Action;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/response/i", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Action {
        public static final i Companion = new i();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(15)), null};
        public final ActionType a;
        public final String b;

        public /* synthetic */ Action(int i, ActionType actionType, String str) {
            this.a = (i & 1) == 0 ? ActionType.UNKNOWN : actionType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.a == action.a && jl40.l(this.b, action.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Action(type=" + this.a + ", eulaType=" + this.b + Extension.C_BRAKE;
        }

        public Action() {
            this.a = ActionType.UNKNOWN;
            this.b = null;
        }
    }

    public TariffAction() {
        this.a = null;
        this.b = null;
    }
}
