package com.ybsdk.feature.pin.api.entities;

import defpackage.k4o;
import defpackage.uzb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.JCP;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b7\u0018\u00002\u00020\u0001:\u0010\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB%\b\u0004\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u000f\u0013\u0019\u0017\u001a\u000f\u0015\u001b\u001c\u001d\u0018\u0012\u0016\u0010\u0011\u0014¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/pin/api/entities/StartSessionState;", "", "", "Luzb0;", "applications", "Lcom/ybsdk/feature/pin/api/entities/StartSessionState$Action;", "sessionStateAction", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/pin/api/entities/StartSessionState$Action;)V", "Ljava/util/List;", "getApplications", "()Ljava/util/List;", "Lcom/ybsdk/feature/pin/api/entities/StartSessionState$Action;", "getSessionStateAction", "()Lcom/ybsdk/feature/pin/api/entities/StartSessionState$Action;", "com/ybsdk/feature/pin/api/entities/e", "com/ybsdk/feature/pin/api/entities/m", "com/ybsdk/feature/pin/api/entities/n", "com/ybsdk/feature/pin/api/entities/k", "com/ybsdk/feature/pin/api/entities/a", "com/ybsdk/feature/pin/api/entities/o", "com/ybsdk/feature/pin/api/entities/f", "com/ybsdk/feature/pin/api/entities/l", "com/ybsdk/feature/pin/api/entities/c", "com/ybsdk/feature/pin/api/entities/j", "com/ybsdk/feature/pin/api/entities/b", "com/ybsdk/feature/pin/api/entities/d", "com/ybsdk/feature/pin/api/entities/g", "com/ybsdk/feature/pin/api/entities/h", "com/ybsdk/feature/pin/api/entities/i", "Action", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class StartSessionState {
    private final List<uzb0> applications;
    private final Action sessionStateAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/pin/api/entities/StartSessionState$Action;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "AUTHORIZATION", "PASSPORT_REGISTRATION", "BANK_REGISTRATION", "APPLICATION_STATUS_CHECK", "SUPPORT", "AM_TOKEN_UPDATE", "APP_UPDATE", "PIN_TOKEN_CLEAR", "PIN_TOKEN_REISSUE", "PIN_TOKEN_RETRY", "OPEN_PRODUCT", "OPEN_DEEPLINK", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action NONE = new Action(JCP.RAW_PREFIX, 0);
        public static final Action AUTHORIZATION = new Action("AUTHORIZATION", 1);
        public static final Action PASSPORT_REGISTRATION = new Action("PASSPORT_REGISTRATION", 2);
        public static final Action BANK_REGISTRATION = new Action("BANK_REGISTRATION", 3);
        public static final Action APPLICATION_STATUS_CHECK = new Action("APPLICATION_STATUS_CHECK", 4);
        public static final Action SUPPORT = new Action("SUPPORT", 5);
        public static final Action AM_TOKEN_UPDATE = new Action("AM_TOKEN_UPDATE", 6);
        public static final Action APP_UPDATE = new Action("APP_UPDATE", 7);
        public static final Action PIN_TOKEN_CLEAR = new Action("PIN_TOKEN_CLEAR", 8);
        public static final Action PIN_TOKEN_REISSUE = new Action("PIN_TOKEN_REISSUE", 9);
        public static final Action PIN_TOKEN_RETRY = new Action("PIN_TOKEN_RETRY", 10);
        public static final Action OPEN_PRODUCT = new Action("OPEN_PRODUCT", 11);
        public static final Action OPEN_DEEPLINK = new Action("OPEN_DEEPLINK", 12);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{NONE, AUTHORIZATION, PASSPORT_REGISTRATION, BANK_REGISTRATION, APPLICATION_STATUS_CHECK, SUPPORT, AM_TOKEN_UPDATE, APP_UPDATE, PIN_TOKEN_CLEAR, PIN_TOKEN_REISSUE, PIN_TOKEN_RETRY, OPEN_PRODUCT, OPEN_DEEPLINK};
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Action(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public /* synthetic */ StartSessionState(List list, Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? null : action, null);
    }

    public List<uzb0> getApplications() {
        return this.applications;
    }

    public Action getSessionStateAction() {
        return this.sessionStateAction;
    }

    private StartSessionState(List<uzb0> list, Action action) {
        this.applications = list;
        this.sessionStateAction = action;
    }

    public /* synthetic */ StartSessionState(List list, Action action, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, action);
    }
}
