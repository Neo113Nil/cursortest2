package com.yandex.go.payments.shared;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b'\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"com/yandex/go/payments/shared/SharedPaymentAnalytics$Button", "", "Lcom/yandex/go/payments/shared/SharedPaymentAnalytics$Button;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BACK", "CHANGE_CARD", "CARD", "MAIL", "ADD_PARTICIPANTS", "PROMO", "BIG_COMPANY", "SETTINGS", "ACTION_BUTTON", "DELETE_ACCOUNT", "DONE", "EMAIL_ADDRESS", "FREQUENCY_SELECTED", "PARTICIPANT_SELECTED", "YES", "NO", "DELETE", "CANCEL", "NAME", "PHONE", "SET_LIMIT", "LIMIT_VALUE", "CURRENCY_SELECTED", "ACCOUNT_NAME", "LIMIT", "FROM_CONTACTS", "USER_SELECTED", "EDIT", "ADD_PARTICIPANT", "PARTICIPANT_DELETED", "OUT_SCREEN", "PARTICIPANTS", "SELECT_CARD", "ADD_CARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SharedPaymentAnalytics$Button {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharedPaymentAnalytics$Button[] $VALUES;
    public static final SharedPaymentAnalytics$Button ACCOUNT_NAME;
    public static final SharedPaymentAnalytics$Button ACTION_BUTTON;
    public static final SharedPaymentAnalytics$Button ADD_CARD;
    public static final SharedPaymentAnalytics$Button ADD_PARTICIPANT;
    public static final SharedPaymentAnalytics$Button ADD_PARTICIPANTS;
    public static final SharedPaymentAnalytics$Button BACK;
    public static final SharedPaymentAnalytics$Button BIG_COMPANY;
    public static final SharedPaymentAnalytics$Button CANCEL;
    public static final SharedPaymentAnalytics$Button CARD;
    public static final SharedPaymentAnalytics$Button CHANGE_CARD;
    public static final SharedPaymentAnalytics$Button CURRENCY_SELECTED;
    public static final SharedPaymentAnalytics$Button DELETE;
    public static final SharedPaymentAnalytics$Button DELETE_ACCOUNT;
    public static final SharedPaymentAnalytics$Button DONE;
    public static final SharedPaymentAnalytics$Button EDIT;
    public static final SharedPaymentAnalytics$Button EMAIL_ADDRESS;
    public static final SharedPaymentAnalytics$Button FREQUENCY_SELECTED;
    public static final SharedPaymentAnalytics$Button FROM_CONTACTS;
    public static final SharedPaymentAnalytics$Button LIMIT;
    public static final SharedPaymentAnalytics$Button LIMIT_VALUE;
    public static final SharedPaymentAnalytics$Button MAIL;
    public static final SharedPaymentAnalytics$Button NAME;
    public static final SharedPaymentAnalytics$Button NO;
    public static final SharedPaymentAnalytics$Button OUT_SCREEN;
    public static final SharedPaymentAnalytics$Button PARTICIPANTS;
    public static final SharedPaymentAnalytics$Button PARTICIPANT_DELETED;
    public static final SharedPaymentAnalytics$Button PARTICIPANT_SELECTED;
    public static final SharedPaymentAnalytics$Button PHONE;
    public static final SharedPaymentAnalytics$Button PROMO;
    public static final SharedPaymentAnalytics$Button SELECT_CARD;
    public static final SharedPaymentAnalytics$Button SETTINGS;
    public static final SharedPaymentAnalytics$Button SET_LIMIT;
    public static final SharedPaymentAnalytics$Button USER_SELECTED;
    public static final SharedPaymentAnalytics$Button YES;
    private final String analyticsName;

    static {
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button = new SharedPaymentAnalytics$Button("BACK", 0, "back");
        BACK = sharedPaymentAnalytics$Button;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button2 = new SharedPaymentAnalytics$Button("CHANGE_CARD", 1, "change_card");
        CHANGE_CARD = sharedPaymentAnalytics$Button2;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button3 = new SharedPaymentAnalytics$Button("CARD", 2, "card");
        CARD = sharedPaymentAnalytics$Button3;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button4 = new SharedPaymentAnalytics$Button("MAIL", 3, "mail");
        MAIL = sharedPaymentAnalytics$Button4;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button5 = new SharedPaymentAnalytics$Button("ADD_PARTICIPANTS", 4, "add_participants");
        ADD_PARTICIPANTS = sharedPaymentAnalytics$Button5;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button6 = new SharedPaymentAnalytics$Button("PROMO", 5, "promo");
        PROMO = sharedPaymentAnalytics$Button6;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button7 = new SharedPaymentAnalytics$Button("BIG_COMPANY", 6, "big_company");
        BIG_COMPANY = sharedPaymentAnalytics$Button7;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button8 = new SharedPaymentAnalytics$Button("SETTINGS", 7, "settings");
        SETTINGS = sharedPaymentAnalytics$Button8;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button9 = new SharedPaymentAnalytics$Button("ACTION_BUTTON", 8, "action_button");
        ACTION_BUTTON = sharedPaymentAnalytics$Button9;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button10 = new SharedPaymentAnalytics$Button("DELETE_ACCOUNT", 9, "delete_account");
        DELETE_ACCOUNT = sharedPaymentAnalytics$Button10;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button11 = new SharedPaymentAnalytics$Button("DONE", 10, "done");
        DONE = sharedPaymentAnalytics$Button11;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button12 = new SharedPaymentAnalytics$Button("EMAIL_ADDRESS", 11, "email_address");
        EMAIL_ADDRESS = sharedPaymentAnalytics$Button12;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button13 = new SharedPaymentAnalytics$Button("FREQUENCY_SELECTED", 12, "frequency_selected");
        FREQUENCY_SELECTED = sharedPaymentAnalytics$Button13;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button14 = new SharedPaymentAnalytics$Button("PARTICIPANT_SELECTED", 13, "participant_selected");
        PARTICIPANT_SELECTED = sharedPaymentAnalytics$Button14;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button15 = new SharedPaymentAnalytics$Button("YES", 14, "yes");
        YES = sharedPaymentAnalytics$Button15;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button16 = new SharedPaymentAnalytics$Button("NO", 15, "no");
        NO = sharedPaymentAnalytics$Button16;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button17 = new SharedPaymentAnalytics$Button("DELETE", 16, "delete");
        DELETE = sharedPaymentAnalytics$Button17;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button18 = new SharedPaymentAnalytics$Button("CANCEL", 17, "refuse");
        CANCEL = sharedPaymentAnalytics$Button18;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button19 = new SharedPaymentAnalytics$Button("NAME", 18, "name");
        NAME = sharedPaymentAnalytics$Button19;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button20 = new SharedPaymentAnalytics$Button("PHONE", 19, "phone");
        PHONE = sharedPaymentAnalytics$Button20;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button21 = new SharedPaymentAnalytics$Button("SET_LIMIT", 20, "set_limit");
        SET_LIMIT = sharedPaymentAnalytics$Button21;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button22 = new SharedPaymentAnalytics$Button("LIMIT_VALUE", 21, "limit_value");
        LIMIT_VALUE = sharedPaymentAnalytics$Button22;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button23 = new SharedPaymentAnalytics$Button("CURRENCY_SELECTED", 22, "currency_selected");
        CURRENCY_SELECTED = sharedPaymentAnalytics$Button23;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button24 = new SharedPaymentAnalytics$Button("ACCOUNT_NAME", 23, "account_name");
        ACCOUNT_NAME = sharedPaymentAnalytics$Button24;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button25 = new SharedPaymentAnalytics$Button("LIMIT", 24, "limit");
        LIMIT = sharedPaymentAnalytics$Button25;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button26 = new SharedPaymentAnalytics$Button("FROM_CONTACTS", 25, "from_contacts");
        FROM_CONTACTS = sharedPaymentAnalytics$Button26;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button27 = new SharedPaymentAnalytics$Button("USER_SELECTED", 26, "user_selected");
        USER_SELECTED = sharedPaymentAnalytics$Button27;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button28 = new SharedPaymentAnalytics$Button("EDIT", 27, "edit");
        EDIT = sharedPaymentAnalytics$Button28;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button29 = new SharedPaymentAnalytics$Button("ADD_PARTICIPANT", 28, "add_participant");
        ADD_PARTICIPANT = sharedPaymentAnalytics$Button29;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button30 = new SharedPaymentAnalytics$Button("PARTICIPANT_DELETED", 29, "participant_deleted");
        PARTICIPANT_DELETED = sharedPaymentAnalytics$Button30;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button31 = new SharedPaymentAnalytics$Button("OUT_SCREEN", 30, "out_screen");
        OUT_SCREEN = sharedPaymentAnalytics$Button31;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button32 = new SharedPaymentAnalytics$Button("PARTICIPANTS", 31, "participants");
        PARTICIPANTS = sharedPaymentAnalytics$Button32;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button33 = new SharedPaymentAnalytics$Button("SELECT_CARD", 32, "select_card");
        SELECT_CARD = sharedPaymentAnalytics$Button33;
        SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button34 = new SharedPaymentAnalytics$Button("ADD_CARD", 33, "add_card");
        ADD_CARD = sharedPaymentAnalytics$Button34;
        SharedPaymentAnalytics$Button[] sharedPaymentAnalytics$ButtonArr = {sharedPaymentAnalytics$Button, sharedPaymentAnalytics$Button2, sharedPaymentAnalytics$Button3, sharedPaymentAnalytics$Button4, sharedPaymentAnalytics$Button5, sharedPaymentAnalytics$Button6, sharedPaymentAnalytics$Button7, sharedPaymentAnalytics$Button8, sharedPaymentAnalytics$Button9, sharedPaymentAnalytics$Button10, sharedPaymentAnalytics$Button11, sharedPaymentAnalytics$Button12, sharedPaymentAnalytics$Button13, sharedPaymentAnalytics$Button14, sharedPaymentAnalytics$Button15, sharedPaymentAnalytics$Button16, sharedPaymentAnalytics$Button17, sharedPaymentAnalytics$Button18, sharedPaymentAnalytics$Button19, sharedPaymentAnalytics$Button20, sharedPaymentAnalytics$Button21, sharedPaymentAnalytics$Button22, sharedPaymentAnalytics$Button23, sharedPaymentAnalytics$Button24, sharedPaymentAnalytics$Button25, sharedPaymentAnalytics$Button26, sharedPaymentAnalytics$Button27, sharedPaymentAnalytics$Button28, sharedPaymentAnalytics$Button29, sharedPaymentAnalytics$Button30, sharedPaymentAnalytics$Button31, sharedPaymentAnalytics$Button32, sharedPaymentAnalytics$Button33, sharedPaymentAnalytics$Button34};
        $VALUES = sharedPaymentAnalytics$ButtonArr;
        $ENTRIES = kotlin.enums.a.a(sharedPaymentAnalytics$ButtonArr);
    }

    public SharedPaymentAnalytics$Button(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static SharedPaymentAnalytics$Button valueOf(String str) {
        return (SharedPaymentAnalytics$Button) Enum.valueOf(SharedPaymentAnalytics$Button.class, str);
    }

    public static SharedPaymentAnalytics$Button[] values() {
        return (SharedPaymentAnalytics$Button[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
