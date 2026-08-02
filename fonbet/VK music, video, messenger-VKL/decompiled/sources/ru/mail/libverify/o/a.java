package ru.mail.libverify.o;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a API_REQUEST_FAILURE;
    public static final a CHECK_ACCOUNT_COMPLETED;
    public static final a CHECK_ACCOUNT_STARTED;
    public static final a CHECK_APPLICATION_COMPLETED;
    public static final a INITIAL_VERIFICATION_RECEIVED;
    public static final a INIT_TIME;
    public static final a INSTANCE_FETCHER_STARTED;
    public static final a INSTANCE_FETCHER_STOPPED;
    public static final a INSTANCE_RESET;
    public static final a INSTANCE_SOFT_SIGNOUT;
    public static final a NOTIFICATION_HISTORY_ADDED;
    public static final a NOTIFICATION_HISTORY_ERASED;
    public static final a NOTIFICATION_HISTORY_OPENED;
    public static final a NOTIFICATION_HISTORY_REQUESTED;
    public static final a NOTIFICATION_HISTORY_SHORTCUT_CREATED;
    public static final a PHONECHECKER_NEW_CHECK_STARTED;
    public static final a POPUP_CONFIRM_CLICKED;
    public static final a POPUP_DISMISSED;
    public static final a POPUP_EQUAL_SMS_RECEIVED;
    public static final a POPUP_FULLSCREEN_OPENED;
    public static final a POPUP_SETTINGS_OPENED;
    public static final a PUSHTOKEN_FAILED_TO_OBTAIN;
    public static final a PUSHTOKEN_RECEIVED_FIRST;
    public static final a PUSHTOKEN_SERVICE_ERROR;
    public static final a PUSH_COMPLETED;
    public static final a PUSH_DUPLICATION;
    public static final a PUSH_RECEIVED;
    public static final a PUSH_SERVER_COMPLETED;
    public static final a PUSH_STATUS_SUBMITTED;
    public static final a SERVER_API_HOST_OVERRIDDEN;
    public static final a SERVER_FAILURE;
    public static final a SERVER_SWITCHED_TO_NEXT_API_HOST;
    public static final a SESSION_CALL_INFO_RECEIVED;
    public static final a SESSION_CALL_IN_CLICKED;
    public static final a SESSION_CALL_IN_PROCESS;
    public static final a SESSION_CALL_REJECTED;
    public static final a SESSION_MOBILEID_CODE_RECEIVED;
    public static final a SESSION_MOBILEID_REDIRECT;
    public static final a SESSION_MOBILEID_REDIRECT_ERROR;
    public static final a SESSION_MOBILEID_REDIRECT_LIMIT_REACHED;
    public static final a SESSION_MOBILEID_URL_RECEIVED;
    public static final a SETTINGS_REPORT_REUSE_CLICKED;
    public static final a SETTINGS_TEMPORARY_BLOCK_CLICKED;
    public static final a SMS_RETRIEVER_FAILURE;
    public static final a SMS_RETRIEVER_INITIALIZED;
    public static final a SMS_RETRIEVER_TIMEOUT;
    public static final a VERIFICATION_CANCELLED;
    public static final a VERIFICATION_COMPLETED;
    public static final a VERIFICATION_COMPLETED_BACKGROUND;
    public static final a VERIFICATION_IVR_REQUESTED;
    public static final a VERIFICATION_NEWSMSCODE_REQUESTED;
    public static final a VERIFICATION_PHONE_VALIDATED;
    public static final a VERIFICATION_STARTED;
    public static final a VERIFICATION_SWITCHED_BACKGROUND;

    static {
        a aVar = new a("VERIFICATION_STARTED", 0);
        VERIFICATION_STARTED = aVar;
        a aVar2 = new a("VERIFICATION_COMPLETED", 1);
        VERIFICATION_COMPLETED = aVar2;
        a aVar3 = new a("VERIFICATION_PHONE_VALIDATED", 2);
        VERIFICATION_PHONE_VALIDATED = aVar3;
        a aVar4 = new a("VERIFICATION_IVR_REQUESTED", 3);
        VERIFICATION_IVR_REQUESTED = aVar4;
        a aVar5 = new a("VERIFICATION_CANCELLED", 4);
        VERIFICATION_CANCELLED = aVar5;
        a aVar6 = new a("VERIFICATION_COMPLETED_BACKGROUND", 5);
        VERIFICATION_COMPLETED_BACKGROUND = aVar6;
        a aVar7 = new a("VERIFICATION_SWITCHED_BACKGROUND", 6);
        VERIFICATION_SWITCHED_BACKGROUND = aVar7;
        a aVar8 = new a("VERIFICATION_NEWSMSCODE_REQUESTED", 7);
        VERIFICATION_NEWSMSCODE_REQUESTED = aVar8;
        a aVar9 = new a("PUSH_RECEIVED", 8);
        PUSH_RECEIVED = aVar9;
        a aVar10 = new a("PUSH_COMPLETED", 9);
        PUSH_COMPLETED = aVar10;
        a aVar11 = new a("PUSH_STATUS_SUBMITTED", 10);
        PUSH_STATUS_SUBMITTED = aVar11;
        a aVar12 = new a("PUSH_SERVER_COMPLETED", 11);
        PUSH_SERVER_COMPLETED = aVar12;
        a aVar13 = new a("PUSH_DUPLICATION", 12);
        PUSH_DUPLICATION = aVar13;
        a aVar14 = new a("POPUP_CONFIRM_CLICKED", 13);
        POPUP_CONFIRM_CLICKED = aVar14;
        a aVar15 = new a("NOTIFICATION_HISTORY_SHORTCUT_CREATED", 14);
        NOTIFICATION_HISTORY_SHORTCUT_CREATED = aVar15;
        a aVar16 = new a("NOTIFICATION_HISTORY_ERASED", 15);
        NOTIFICATION_HISTORY_ERASED = aVar16;
        a aVar17 = new a("NOTIFICATION_HISTORY_OPENED", 16);
        NOTIFICATION_HISTORY_OPENED = aVar17;
        a aVar18 = new a("NOTIFICATION_HISTORY_REQUESTED", 17);
        NOTIFICATION_HISTORY_REQUESTED = aVar18;
        a aVar19 = new a("NOTIFICATION_HISTORY_ADDED", 18);
        NOTIFICATION_HISTORY_ADDED = aVar19;
        a aVar20 = new a("POPUP_SETTINGS_OPENED", 19);
        POPUP_SETTINGS_OPENED = aVar20;
        a aVar21 = new a("POPUP_DISMISSED", 20);
        POPUP_DISMISSED = aVar21;
        a aVar22 = new a("POPUP_FULLSCREEN_OPENED", 21);
        POPUP_FULLSCREEN_OPENED = aVar22;
        a aVar23 = new a("POPUP_EQUAL_SMS_RECEIVED", 22);
        POPUP_EQUAL_SMS_RECEIVED = aVar23;
        a aVar24 = new a("SETTINGS_REPORT_REUSE_CLICKED", 23);
        SETTINGS_REPORT_REUSE_CLICKED = aVar24;
        a aVar25 = new a("SETTINGS_TEMPORARY_BLOCK_CLICKED", 24);
        SETTINGS_TEMPORARY_BLOCK_CLICKED = aVar25;
        a aVar26 = new a("PUSHTOKEN_RECEIVED_FIRST", 25);
        PUSHTOKEN_RECEIVED_FIRST = aVar26;
        a aVar27 = new a("PUSHTOKEN_FAILED_TO_OBTAIN", 26);
        PUSHTOKEN_FAILED_TO_OBTAIN = aVar27;
        a aVar28 = new a("PUSHTOKEN_SERVICE_ERROR", 27);
        PUSHTOKEN_SERVICE_ERROR = aVar28;
        a aVar29 = new a("INITIAL_VERIFICATION_RECEIVED", 28);
        INITIAL_VERIFICATION_RECEIVED = aVar29;
        a aVar30 = new a("SERVER_FAILURE", 29);
        SERVER_FAILURE = aVar30;
        a aVar31 = new a("SERVER_SWITCHED_TO_NEXT_API_HOST", 30);
        SERVER_SWITCHED_TO_NEXT_API_HOST = aVar31;
        a aVar32 = new a("SERVER_API_HOST_OVERRIDDEN", 31);
        SERVER_API_HOST_OVERRIDDEN = aVar32;
        a aVar33 = new a("API_REQUEST_FAILURE", 32);
        API_REQUEST_FAILURE = aVar33;
        a aVar34 = new a("INSTANCE_RESET", 33);
        INSTANCE_RESET = aVar34;
        a aVar35 = new a("PHONECHECKER_NEW_CHECK_STARTED", 34);
        PHONECHECKER_NEW_CHECK_STARTED = aVar35;
        a aVar36 = new a("INSTANCE_SOFT_SIGNOUT", 35);
        INSTANCE_SOFT_SIGNOUT = aVar36;
        a aVar37 = new a("CHECK_ACCOUNT_STARTED", 36);
        CHECK_ACCOUNT_STARTED = aVar37;
        a aVar38 = new a("CHECK_ACCOUNT_COMPLETED", 37);
        CHECK_ACCOUNT_COMPLETED = aVar38;
        a aVar39 = new a("CHECK_APPLICATION_COMPLETED", 38);
        CHECK_APPLICATION_COMPLETED = aVar39;
        a aVar40 = new a("SESSION_CALL_INFO_RECEIVED", 39);
        SESSION_CALL_INFO_RECEIVED = aVar40;
        a aVar41 = new a("SESSION_MOBILEID_URL_RECEIVED", 40);
        SESSION_MOBILEID_URL_RECEIVED = aVar41;
        a aVar42 = new a("SESSION_MOBILEID_CODE_RECEIVED", 41);
        SESSION_MOBILEID_CODE_RECEIVED = aVar42;
        a aVar43 = new a("SESSION_MOBILEID_REDIRECT", 42);
        SESSION_MOBILEID_REDIRECT = aVar43;
        a aVar44 = new a("SESSION_MOBILEID_REDIRECT_ERROR", 43);
        SESSION_MOBILEID_REDIRECT_ERROR = aVar44;
        a aVar45 = new a("SESSION_MOBILEID_REDIRECT_LIMIT_REACHED", 44);
        SESSION_MOBILEID_REDIRECT_LIMIT_REACHED = aVar45;
        a aVar46 = new a("SESSION_CALL_REJECTED", 45);
        SESSION_CALL_REJECTED = aVar46;
        a aVar47 = new a("INSTANCE_FETCHER_STARTED", 46);
        INSTANCE_FETCHER_STARTED = aVar47;
        a aVar48 = new a("INSTANCE_FETCHER_STOPPED", 47);
        INSTANCE_FETCHER_STOPPED = aVar48;
        a aVar49 = new a("SMS_RETRIEVER_INITIALIZED", 48);
        SMS_RETRIEVER_INITIALIZED = aVar49;
        a aVar50 = new a("SMS_RETRIEVER_FAILURE", 49);
        SMS_RETRIEVER_FAILURE = aVar50;
        a aVar51 = new a("SMS_RETRIEVER_TIMEOUT", 50);
        SMS_RETRIEVER_TIMEOUT = aVar51;
        a aVar52 = new a("SESSION_CALL_IN_PROCESS", 51);
        SESSION_CALL_IN_PROCESS = aVar52;
        a aVar53 = new a("SESSION_CALL_IN_CLICKED", 52);
        SESSION_CALL_IN_CLICKED = aVar53;
        a aVar54 = new a("INIT_TIME", 53);
        INIT_TIME = aVar54;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, aVar48, aVar49, aVar50, aVar51, aVar52, aVar53, aVar54};
        $VALUES = aVarArr;
        $ENTRIES = new asp(aVarArr);
    }

    private a(String str, int i) {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
